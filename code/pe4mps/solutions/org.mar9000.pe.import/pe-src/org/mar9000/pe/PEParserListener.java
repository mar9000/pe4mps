// Generated from PEParser.g4 by ANTLR 4.5
package org.mar9000.pe;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PEParser}.
 */
public interface PEParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PEParser#language}.
	 * @param ctx the parse tree
	 */
	void enterLanguage(PEParser.LanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#language}.
	 * @param ctx the parse tree
	 */
	void exitLanguage(PEParser.LanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(PEParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(PEParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#extension}.
	 * @param ctx the parse tree
	 */
	void enterExtension(PEParser.ExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#extension}.
	 * @param ctx the parse tree
	 */
	void exitExtension(PEParser.ExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PEParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PEParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#nodeType}.
	 * @param ctx the parse tree
	 */
	void enterNodeType(PEParser.NodeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#nodeType}.
	 * @param ctx the parse tree
	 */
	void exitNodeType(PEParser.NodeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#subnodesList}.
	 * @param ctx the parse tree
	 */
	void enterSubnodesList(PEParser.SubnodesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#subnodesList}.
	 * @param ctx the parse tree
	 */
	void exitSubnodesList(PEParser.SubnodesListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#labeledNodeTypeContent}.
	 * @param ctx the parse tree
	 */
	void enterLabeledNodeTypeContent(PEParser.LabeledNodeTypeContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#labeledNodeTypeContent}.
	 * @param ctx the parse tree
	 */
	void exitLabeledNodeTypeContent(PEParser.LabeledNodeTypeContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#nodeTypeContent}.
	 * @param ctx the parse tree
	 */
	void enterNodeTypeContent(PEParser.NodeTypeContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#nodeTypeContent}.
	 * @param ctx the parse tree
	 */
	void exitNodeTypeContent(PEParser.NodeTypeContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(PEParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(PEParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#elemenType}.
	 * @param ctx the parse tree
	 */
	void enterElemenType(PEParser.ElemenTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#elemenType}.
	 * @param ctx the parse tree
	 */
	void exitElemenType(PEParser.ElemenTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#declarationName}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationName(PEParser.DeclarationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#declarationName}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationName(PEParser.DeclarationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#anonymousEnumType}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousEnumType(PEParser.AnonymousEnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#anonymousEnumType}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousEnumType(PEParser.AnonymousEnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#elementCardinality}.
	 * @param ctx the parse tree
	 */
	void enterElementCardinality(PEParser.ElementCardinalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#elementCardinality}.
	 * @param ctx the parse tree
	 */
	void exitElementCardinality(PEParser.ElementCardinalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(PEParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(PEParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#multipleSubtype}.
	 * @param ctx the parse tree
	 */
	void enterMultipleSubtype(PEParser.MultipleSubtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#multipleSubtype}.
	 * @param ctx the parse tree
	 */
	void exitMultipleSubtype(PEParser.MultipleSubtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#elementAttributes}.
	 * @param ctx the parse tree
	 */
	void enterElementAttributes(PEParser.ElementAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#elementAttributes}.
	 * @param ctx the parse tree
	 */
	void exitElementAttributes(PEParser.ElementAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#elementAttribute}.
	 * @param ctx the parse tree
	 */
	void enterElementAttribute(PEParser.ElementAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#elementAttribute}.
	 * @param ctx the parse tree
	 */
	void exitElementAttribute(PEParser.ElementAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(PEParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(PEParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#builtinType}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinType(PEParser.BuiltinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#builtinType}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinType(PEParser.BuiltinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#enumType}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(PEParser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#enumType}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(PEParser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#enumItem}.
	 * @param ctx the parse tree
	 */
	void enterEnumItem(PEParser.EnumItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#enumItem}.
	 * @param ctx the parse tree
	 */
	void exitEnumItem(PEParser.EnumItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#datatypeDecl}.
	 * @param ctx the parse tree
	 */
	void enterDatatypeDecl(PEParser.DatatypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#datatypeDecl}.
	 * @param ctx the parse tree
	 */
	void exitDatatypeDecl(PEParser.DatatypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#datatypeName}.
	 * @param ctx the parse tree
	 */
	void enterDatatypeName(PEParser.DatatypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#datatypeName}.
	 * @param ctx the parse tree
	 */
	void exitDatatypeName(PEParser.DatatypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#keywordsDecl}.
	 * @param ctx the parse tree
	 */
	void enterKeywordsDecl(PEParser.KeywordsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#keywordsDecl}.
	 * @param ctx the parse tree
	 */
	void exitKeywordsDecl(PEParser.KeywordsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(PEParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(PEParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#keywordName}.
	 * @param ctx the parse tree
	 */
	void enterKeywordName(PEParser.KeywordNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#keywordName}.
	 * @param ctx the parse tree
	 */
	void exitKeywordName(PEParser.KeywordNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#fragmentDecl}.
	 * @param ctx the parse tree
	 */
	void enterFragmentDecl(PEParser.FragmentDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#fragmentDecl}.
	 * @param ctx the parse tree
	 */
	void exitFragmentDecl(PEParser.FragmentDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#fragmentName}.
	 * @param ctx the parse tree
	 */
	void enterFragmentName(PEParser.FragmentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#fragmentName}.
	 * @param ctx the parse tree
	 */
	void exitFragmentName(PEParser.FragmentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#constrainedString}.
	 * @param ctx the parse tree
	 */
	void enterConstrainedString(PEParser.ConstrainedStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#constrainedString}.
	 * @param ctx the parse tree
	 */
	void exitConstrainedString(PEParser.ConstrainedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#fragmentAlt}.
	 * @param ctx the parse tree
	 */
	void enterFragmentAlt(PEParser.FragmentAltContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#fragmentAlt}.
	 * @param ctx the parse tree
	 */
	void exitFragmentAlt(PEParser.FragmentAltContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#fragmentElement}.
	 * @param ctx the parse tree
	 */
	void enterFragmentElement(PEParser.FragmentElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#fragmentElement}.
	 * @param ctx the parse tree
	 */
	void exitFragmentElement(PEParser.FragmentElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#fragmentBlock}.
	 * @param ctx the parse tree
	 */
	void enterFragmentBlock(PEParser.FragmentBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#fragmentBlock}.
	 * @param ctx the parse tree
	 */
	void exitFragmentBlock(PEParser.FragmentBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#fragmentAtom}.
	 * @param ctx the parse tree
	 */
	void enterFragmentAtom(PEParser.FragmentAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#fragmentAtom}.
	 * @param ctx the parse tree
	 */
	void exitFragmentAtom(PEParser.FragmentAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#charSet}.
	 * @param ctx the parse tree
	 */
	void enterCharSet(PEParser.CharSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#charSet}.
	 * @param ctx the parse tree
	 */
	void exitCharSet(PEParser.CharSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#ebnfSuffix}.
	 * @param ctx the parse tree
	 */
	void enterEbnfSuffix(PEParser.EbnfSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#ebnfSuffix}.
	 * @param ctx the parse tree
	 */
	void exitEbnfSuffix(PEParser.EbnfSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PEParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PEParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PEParser#staticContent}.
	 * @param ctx the parse tree
	 */
	void enterStaticContent(PEParser.StaticContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PEParser#staticContent}.
	 * @param ctx the parse tree
	 */
	void exitStaticContent(PEParser.StaticContentContext ctx);
}