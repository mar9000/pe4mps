/**
 * Copyright 2015 Marco LOMBARDO, mar9000 near google.com .
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * This file is part of the PE project.
 */
package org.mar9000.pe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.Token;
import org.mar9000.pe.PEParser.BuiltinTypeContext;
import org.mar9000.pe.PEParser.DatatypeDeclContext;
import org.mar9000.pe.PEParser.DeclarationNameContext;
import org.mar9000.pe.PEParser.ElementAttributeContext;
import org.mar9000.pe.PEParser.ElementAttributesContext;
import org.mar9000.pe.PEParser.ElementContext;
import org.mar9000.pe.PEParser.EnumItemContext;
import org.mar9000.pe.PEParser.EnumTypeContext;
import org.mar9000.pe.PEParser.ExtensionContext;
import org.mar9000.pe.PEParser.FragmentAltContext;
import org.mar9000.pe.PEParser.FragmentAtomContext;
import org.mar9000.pe.PEParser.FragmentDeclContext;
import org.mar9000.pe.PEParser.FragmentElementContext;
import org.mar9000.pe.PEParser.GroupContext;
import org.mar9000.pe.PEParser.KeywordContext;
import org.mar9000.pe.PEParser.LabeledNodeTypeContentContext;
import org.mar9000.pe.PEParser.LanguageContext;
import org.mar9000.pe.PEParser.NodeTypeContentContext;
import org.mar9000.pe.PEParser.NodeTypeContext;
import org.mar9000.pe.PEParser.StaticContentContext;
import org.mar9000.pe.PEParser.SubnodesListContext;
import org.mar9000.pe.ecore.EcoreFactory;
import org.mar9000.pe.ecore.PEBuiltinType;
import org.mar9000.pe.ecore.PEChild;
import org.mar9000.pe.ecore.PEConstant;
import org.mar9000.pe.ecore.PEDataType;
import org.mar9000.pe.ecore.PEElement;
import org.mar9000.pe.ecore.PEElementAttribute;
import org.mar9000.pe.ecore.PEEnumNode;
import org.mar9000.pe.ecore.PEEnumValue;
import org.mar9000.pe.ecore.PEExtension;
import org.mar9000.pe.ecore.PEFlag;
import org.mar9000.pe.ecore.PEGroup;
import org.mar9000.pe.ecore.PEKeyword;
import org.mar9000.pe.ecore.PELanguage;
import org.mar9000.pe.ecore.PEListProjection;
import org.mar9000.pe.ecore.PENodeType;
import org.mar9000.pe.ecore.PEPrimitiveType;
import org.mar9000.pe.ecore.PEProperty;
import org.mar9000.symboltable.Scope;
import org.mar9000.symboltable.Symbol;

public class PEASTListener extends PEParserBaseListener {
	
	public static String QUESTION = null;
	
	/** Global scope used to resolve rule calls.   */
	private Scope<Symbol> globalScope = null;	
	public PEASTListener(Scope<Symbol> globalScope) {
		this.globalScope = globalScope;
		QUESTION = Utils.getStringValue(PELexer.VOCABULARY.getLiteralName(PELexer.QUESTION));
	}
	
	/** The resulting PELanguage.   */
	private PELanguage language = null;
	public PELanguage getPELanguage() {
		return language;
	}
	
	@Override
	public void enterLanguage(LanguageContext ctx) {
		language = EcoreFactory.INSTANCE.createPELanguage();
		language.setName(ctx.name.getText());
	}
	
	@Override
	public void enterExtension(ExtensionContext ctx) {
		PEExtension extension = EcoreFactory.INSTANCE.createPEExtension();
		extension.setExtensionName(ctx.extensionName.getText());
		language.getExtensions().add(extension);
		for (Token t : ctx.rootNodes) {
			String nodeName = t.getText();
			PENodeType peNodeType = resolvePENodeType(nodeName);
			peNodeType.setRoot(true);
			extension.getRootNodes().add(peNodeType);
		}
	}
	
	/** Current node type.   */
	private PENodeType currentNodeType = null;
	/** Current node type has a subtype.   */
	private boolean nodeTypeHasSubtype = false;
	@Override
	public void enterNodeType(NodeTypeContext ctx) {
		String nodeTypeName = ctx.name.getText();
		PENodeType nodeType = resolvePENodeType(nodeTypeName);
		language.getDeclarations().add(nodeType);
		currentNodeType = nodeType;
	}
	@Override
	public void exitNodeType(NodeTypeContext ctx) {
		currentNodeType = null;
		nodeTypeHasSubtype = false;
	}
	
	private Boolean currentSubnodesListIsMultiple = null;
	@Override
	public void enterSubnodesList(SubnodesListContext ctx) {
		currentSubnodesListIsMultiple = ctx.labeledNodeTypeContent().size() > 1;
	}
	@Override
	public void exitSubnodesList(SubnodesListContext ctx) {
		currentSubnodesListIsMultiple = null;
	}
	
	/** Current labeled node type.   */
	private PENodeType currentLabeledNodeType = null;
	/**
	 * If true indicate that current labeledNodeType has a subtype set.
	 * Set by the element that set the super type.
	 */
	private boolean labeledNodeTypeHasSubtype = false;
	@Override
	public void enterLabeledNodeTypeContent(LabeledNodeTypeContentContext ctx) {
		if (ctx.name == null) {
			if (currentSubnodesListIsMultiple && !isSimpleRuleCall(ctx.nodeTypeContent())) {
				throw new RuntimeException("Alternatives ("
						+ ctx.getText()
						+ ") that are not alone and are not simple rule call should be labeled.");
			}
		} else {
			PENodeType nodeType = resolvePENodeType(ctx.name.getText());
			nodeType.getSuperNodeTypes().add(currentNodeType);
			language.getDeclarations().add(nodeType);
			currentLabeledNodeType = nodeType;
		}
	}
	@Override
	public void exitLabeledNodeTypeContent(LabeledNodeTypeContentContext ctx) {
		currentLabeledNodeType = null;
		labeledNodeTypeHasSubtype = false;
	}
	private boolean isSimpleRuleCall(NodeTypeContentContext ctx) {
		if (ctx.elements.size() > 1)
			return false;
		ElementContext element = ctx.element(0);
		if (element.name != null || element.elementCardinality() != null)
			return false;
		if (element.elemenType().declarationName() != null) {
			return globalScope.resolve(element.elemenType().declarationName().Identifier().getText()) != null;
		}
		if (element.elemenType().multipleSubtype() != null) {
			// TODO.
			throw new RuntimeException("TODO");
		}
		return false;
	}
	
	/** Element are added to top group if present.   */
	private Stack<PEGroup> currentGroups = new Stack<PEGroup>();
	@Override
	public void enterElement(ElementContext ctx) {
		String name = ctx.name != null ? ctx.name.getText() : null;
		String cardinality = ctx.cardinality != null ? ctx.cardinality.getText() : null;
		// Literal.
		if (ctx.elemenType().literal() != null) {
			// Constant cell.
			if (name == null && cardinality == null) {
				PEConstant c = EcoreFactory.INSTANCE.createPEConstant();
				c.setName(Utils.getLiteralValue(ctx.elemenType().literal()));
				addElement(c);
			} else if (name != null && cardinality.equals(QUESTION)) {
				// This is a flag cell where true/false depends on the literal presence.
				throw new RuntimeException("TODO: Flag literal");
			} else {
				throw new RuntimeException("Literal " + ctx.getText()
						+ " is not a constant cell nor a flag.");
			}
		} else if (ctx.elemenType().declarationName() != null) {
			String declarationName = ctx.elemenType().declarationName().getText();
			if (name != null && globalScope.resolve(declarationName) instanceof PENodeType) {
				// Child.
				PEChild child = EcoreFactory.INSTANCE.createPEChild();
				child.setName(name);
				child.setCardinality(Utils.getPEElementCardinality(cardinality));
				child.setNodeType((PENodeType)globalScope.resolve(declarationName));
				setElementAttributes(child, ctx.elementAttributes());
				addElement(child);
			} else if (name != null && (cardinality == null || cardinality.equals(QUESTION))
					&& globalScope.resolve(declarationName) instanceof PEPrimitiveType) {
				// Property.
				PEPrimitiveType primitiveType = (PEPrimitiveType)globalScope.resolve(declarationName);
				PEProperty property = EcoreFactory.INSTANCE.createPEProperty();
				property.setName(name);
				property.setPrimitiveType(primitiveType);
				property.setMandatory(cardinality == null);
				addElement(property);
			} else if (name != null
					&& cardinality != null
					&& cardinality.equals(QUESTION)
					&& globalScope.resolve(declarationName) instanceof PEKeyword) {
				// Flag.
				PEKeyword keyword = (PEKeyword)globalScope.resolve(declarationName);
				PEFlag flag = EcoreFactory.INSTANCE.createPEFlag();
				flag.setName(name);
				flag.setKeyword(keyword.getValue());
				addElement(flag);
			} else if (name == null && cardinality == null && globalScope.resolve(declarationName) instanceof PEKeyword) {
				// Constant cell.
				PEConstant c = EcoreFactory.INSTANCE.createPEConstant();
				PEKeyword keyword = (PEKeyword)globalScope.resolve(declarationName);
				c.setName(keyword.getValue());
				addElement(c);
			} else if (name == null && cardinality == null) {
				// Subtype.
				if (currentLabeledNodeType != null && labeledNodeTypeHasSubtype) {
					throw new RuntimeException("Subtype already set for current labeled node type.");
				}
				if (nodeTypeHasSubtype) {
					throw new RuntimeException("Subtype already set for current node type.");
				}
				PENodeType subnodeType = resolvePENodeType(declarationName);
				if (subnodeType == null) {
					throw new RuntimeException("Node type " + declarationName + " not defined.");
				}
				PENodeType superType = null;
				if (currentLabeledNodeType != null) {
					superType = currentLabeledNodeType;
					labeledNodeTypeHasSubtype = true;
				} else {
					superType = currentNodeType;
					if (!isSimpleRuleCall((NodeTypeContentContext)ctx.parent))
						nodeTypeHasSubtype = true;
				}
				subnodeType.getSuperNodeTypes().add(superType);
			}
		} else if (ctx.elemenType().anonymousEnumType() != null) {
			if (name == null || cardinality != null) {
				throw new RuntimeException("Anonymous enumeration " + ctx.getText()
						+ " is a property, name missing o cardinality present.");
			}
			// Create anonymous enumeration.
			String enumNodeName = (currentNodeType != null ?
					currentNodeType.getName() : currentLabeledNodeType.getName())
					+ "_" + name + "Enum";
			PEEnumNode enumNode = EcoreFactory.INSTANCE.createPEEnumNode();
			enumNode.setName(enumNodeName);
			setEnumItems(enumNode, ctx.elemenType().anonymousEnumType().values);
			language.getDeclarations().add(enumNode);
			// Create element.
			PEProperty property = EcoreFactory.INSTANCE.createPEProperty();
			property.setName(name);
			property.setPrimitiveType(enumNode);
			property.setMandatory(cardinality == null);
			addElement(property);
		} else if (ctx.elemenType().group() != null) {
			if (name != null || (cardinality != null && !cardinality.equals(QUESTION))) {
				throw new RuntimeException("Group " + ctx.getText()
						+ " can't have a name and cardinality if present should be '?'.");
			}
			// Create group.
			PEGroup group = EcoreFactory.INSTANCE.createPEGroup();
			if (cardinality != null)
				group.setCardinality(Utils.getPEElementCardinality(cardinality));
			addElement(group);
			currentGroups.push(group);
		} else if (ctx.elemenType().multipleSubtype() != null) {
			// Check current element.
			if (name != null || cardinality != null) {
				throw new RuntimeException("Multiple subtype element ("
						+ ctx.getText() + ") cannot have name or cardinality.");
			}
			// Check current nodeType or labeledNodeType do not have already a subtype set.
			if (currentLabeledNodeType != null && labeledNodeTypeHasSubtype) {
				throw new RuntimeException("Subtype already set for current labeled node type.");
			}
			if (nodeTypeHasSubtype) {
				throw new RuntimeException("Subtype already set for current node type ("
						+ currentNodeType.getName() + "), can't be done by \""
						+ ctx.elemenType().multipleSubtype().getText()+ "\".");
			}
			// Set super type for each subtype.
			PENodeType superType = null;
			if (currentLabeledNodeType != null) {
				superType = currentLabeledNodeType;
				labeledNodeTypeHasSubtype = true;
			} else {
				superType = currentNodeType;
				nodeTypeHasSubtype = true;
			}
			for (DeclarationNameContext declNameCtx : ctx.elemenType().multipleSubtype().subtypes) {
				PENodeType subType = resolvePENodeType(declNameCtx.getText());
				if (subType == null)
					throw new RuntimeException("Subtype not found: " + declNameCtx.getText());
				subType.getSuperNodeTypes().add(superType);
			}
		} else {
			throw new RuntimeException("Internal parser error in enterElement() .");
		}
	}
	
	@Override
	public void exitGroup(GroupContext ctx) {
		currentGroups.pop();
	}
	
	@Override
	public void enterDatatypeDecl(DatatypeDeclContext ctx) {
		String name = ctx.name.getText();
		PEDataType datatype = (PEDataType)globalScope.resolve(name);
		// If something is not yet defined this will throw an exception.
		datatype.setValue(getRegExp(ctx.constrainedString().alternatives));
		language.getDeclarations().add(datatype);
	}

	/** List of fragments.   */
	private HashMap<String, String> fragments = new HashMap<String, String>();
	@Override
	public void enterFragmentDecl(FragmentDeclContext ctx) {
		String name = ctx.fragmentName().getText();
		String fragment = fragments.get(name);
		if (fragment != null || globalScope.resolve(name) != null) {
			throw new RuntimeException("Fragment name " + name + " collision with other fragment or rule.");
		}
		// If something is not yet defined this will throw an exception.
		fragments.put(name, getRegExp(ctx.constrainedString().alternatives));
	}
	
	private String getRegExp(List<FragmentAltContext> alternatives) {
		StringBuilder value = new StringBuilder();
		for (FragmentAltContext fragAlt : alternatives) {
			if (value.length() > 0)
				value.append("|");
			for (FragmentElementContext fragElement : fragAlt.elements) {
				value.append(getRegExp(fragElement));
			}
		}
		return value.toString();
	}
	
	private String getRegExp(FragmentElementContext ctx) {
		StringBuilder value = new StringBuilder();
		if (ctx.fragmentAtom() != null) {
			value.append(getRegExp(ctx.fragmentAtom()));
		} else {
			value.append("(");
			value.append(getRegExp(ctx.fragmentBlock().alternatives));
			value.append(")");
		}
		if (ctx.ebnfSuffix() != null)
			value.append(ctx.ebnfSuffix().getText());
		return value.toString();
	}
	
	private String getRegExp(FragmentAtomContext ctx) {
		if (ctx.staticContent() != null) {
			return getStaticContentValue(ctx.staticContent(), true, true, true);
		} else if (ctx.datatypeName() != null) {
			// Datatype?
			PEDataType datatype = (PEDataType)globalScope.resolve(ctx.datatypeName().getText());
			if (datatype != null) {
				if (datatype.getValue() == null)
					throw new RuntimeException("Symbol " + ctx.datatypeName().getText() + " not yet defined.");
				return datatype.getValue();
			}
			// Fragment?
			String fragment = fragments.get(ctx.datatypeName().getText());
			if (fragment == null)
				throw new RuntimeException("Symbol " + ctx.datatypeName().getText() + " not defined.");
			return fragment;
		} else if (ctx.DOT() != null) {
			return ".";
		} else if (ctx.charSet() != null) {
			return ctx.charSet().getText();
		}
		throw new RuntimeException("Internal error in fragment atom.");
	}
	
	@Override
	public void enterBuiltinType(BuiltinTypeContext ctx) {
		String name = ctx.name.getText();
		PEBuiltinType builtin = (PEBuiltinType)globalScope.resolve(name);
		builtin.setName(name);
		language.getDeclarations().add(builtin);
	}
	
	@Override
	public void enterEnumType(EnumTypeContext ctx) {
		String name = ctx.name.getText();
		PEEnumNode enumNode = (PEEnumNode)globalScope.resolve(name);
		setEnumItems(enumNode, ctx.values);
		language.getDeclarations().add(enumNode);
	}
	
	@Override
	public void enterKeyword(KeywordContext ctx) {
		String name = ctx.name.getText();
		PEKeyword keyword = (PEKeyword)globalScope.resolve(name);
		language.getDeclarations().add(keyword);
	}
	
	// ---------- Utility methods.   ----------
	
	private void setEnumItems(PEEnumNode enumNode, List<EnumItemContext> items) {
		for (EnumItemContext itemCtx : items) {
			PEEnumValue value = EcoreFactory.INSTANCE.createPEEnumValue();
			enumNode.getValues().add(value);
			value.setKey(itemCtx.key.getText());
			value.setValue(getStaticContentValue(itemCtx.value));
		}
	}
	
	private void setElementAttributes(PEElement element, ElementAttributesContext attributesCtx) {
		if (attributesCtx == null)
			return;
		for (ElementAttributeContext attributeCtx : attributesCtx.attributes) {
			String name = attributeCtx.name != null ? attributeCtx.name.getText() : null;
			String value = getStaticContentValue(attributeCtx.value, true, true, false);
			ArrayList<String> params = new ArrayList<String>();
			for (StaticContentContext param : attributeCtx.parameters) {
				params.add(getStaticContentValue(param, true, true, false));
			}
			// Special attributes.
			if (name != null && (name.equals("vList") || name.equals("hList") || name.equals("indentList"))) {
				PEListProjection listProjection = EcoreFactory.INSTANCE.createPEListProjection();
				listProjection.setLayout(name);
				listProjection.setValue(value);
				if (params.size() > 0)
					listProjection.setPrefix(params.get(0));
				if (params.size() > 1) {
					if (name.equals("hList"))
						listProjection.setSeparator(params.get(1));
					else
						listProjection.setSuffix(params.get(1));
				}
				if (params.size() > 2)
					listProjection.setSuffix(params.get(2));
				element.getAttributes().add(listProjection);
			} else {
				PEElementAttribute attribute = EcoreFactory.INSTANCE.createPEElementAttribute();
				attribute.setName(name);
				attribute.setValue(value);
				for (String p : params) {
					attribute.getParameters().add(p);
				}
				element.getAttributes().add(attribute);
			}
		}
	}
	
	private void addElement(PEElement element) {
		// Groups can be nested so I use a stack, however recursion can happens only
		// with groups, nodeType or labeled nodeType can't be visited while a group is active.
		if (currentGroups.size() > 0) {
			currentGroups.peek().getElements().add(element);
		} else if (currentLabeledNodeType != null) {
			currentLabeledNodeType.getElements().add(element);
		} else {
			currentNodeType.getElements().add(element);
		}
	}
	
	private PENodeType resolvePENodeType(String name) {
		Symbol symbol = globalScope.resolve(name);
		if (symbol == null)
			return null;
		if (!(symbol instanceof PENodeType)) {
			throw new RuntimeException("Symbol " + name + " is not a NodeType.");
		}
		return (PENodeType)symbol;
	}
	
	private String getStaticContentValue(StaticContentContext ctx) {
		return getStaticContentValue(ctx, true, false, false);
	}
	private String getStaticContentValue(StaticContentContext ctx, boolean resolveKeyword
			, boolean returnNameWhenNotFound, boolean quote) {
		if (ctx == null)
			return null;
		String value = null;
		boolean isKeyword = false;
		
		if (ctx.literal() != null) {
			value = Utils.getLiteralValue(ctx.literal());
		} else {
			String keywordName = ctx.keywordName().getText();
			if (!resolveKeyword) {
				value = keywordName;
				isKeyword = true;
			} else {
				Object keyword = globalScope.resolve(keywordName);
				if (keyword != null && keyword instanceof PEKeyword) {
					value = ((PEKeyword)keyword).getValue();
					isKeyword = true;
				} else {
					// Fragment?
					String fragment = fragments.get(keywordName);
					if (fragment != null) {
						value = fragment;
					} else if (returnNameWhenNotFound) {
						value = keywordName;
						isKeyword = true;
					} else {
						// Error.
						throw new RuntimeException(keywordName + " is not a keyword.");
					}
				}
			}
		}
		if (quote && isKeyword)
			value = Pattern.quote(value);
		return value;
	}
	
}
