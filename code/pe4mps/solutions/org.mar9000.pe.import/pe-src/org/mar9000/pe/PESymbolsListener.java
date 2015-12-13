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

import org.mar9000.pe.PEParser.BuiltinTypeContext;
import org.mar9000.pe.PEParser.DatatypeDeclContext;
import org.mar9000.pe.PEParser.EnumTypeContext;
import org.mar9000.pe.PEParser.KeywordContext;
import org.mar9000.pe.PEParser.LabeledNodeTypeContentContext;
import org.mar9000.pe.PEParser.NodeTypeContext;
import org.mar9000.pe.ecore.EcoreFactory;
import org.mar9000.pe.ecore.PEBuiltinType;
import org.mar9000.pe.ecore.PEDataType;
import org.mar9000.pe.ecore.PEEnumNode;
import org.mar9000.pe.ecore.PEKeyword;
import org.mar9000.pe.ecore.PENodeType;
import org.mar9000.symboltable.GlobalScope;
import org.mar9000.symboltable.Symbol;

public class PESymbolsListener extends PEParserBaseListener {
	
	private GlobalScope<Symbol> nodeScope = new GlobalScope<Symbol>();
	public GlobalScope<Symbol> getGlobalScope() {
		return nodeScope;
	}
	
	@Override
	public void enterNodeType(NodeTypeContext ctx) {
		String symbolName = ctx.name.getText();
		if (nodeScope.resolve(symbolName) != null) {
			throw new RuntimeException("Symbol " + symbolName + " is already defined.");
		}
		PENodeType node = EcoreFactory.INSTANCE.createPENodeType();
		node.setName(symbolName);
		nodeScope.define(node.getName(), node);
	}
	
	@Override
	public void enterLabeledNodeTypeContent(LabeledNodeTypeContentContext ctx) {
		if (ctx.name != null) {
			String symbolName = ctx.name.getText();
			if (nodeScope.resolve(symbolName) != null) {
				throw new RuntimeException("Symbol " + symbolName + " is already defined.");
			}
			PENodeType node = EcoreFactory.INSTANCE.createPENodeType();
			node.setName(symbolName);
			nodeScope.define(node.getName(), node);
		}
	}
	
	@Override
	public void enterEnumType(EnumTypeContext ctx) {
		String symbolName = ctx.name.getText();
		if (nodeScope.resolve(symbolName) != null) {
			throw new RuntimeException("Symbol " + symbolName + " is already defined.");
		}
		PEEnumNode enumNode = EcoreFactory.INSTANCE.createPEEnumNode();
		enumNode.setName(symbolName);
		nodeScope.define(symbolName, enumNode);
	}
	
	@Override
	public void enterKeyword(KeywordContext ctx) {
		String symbolName = ctx.name.getText();
		if (nodeScope.resolve(symbolName) != null) {
			throw new RuntimeException("Symbol " + symbolName + " is already defined.");
		}
		PEKeyword keyword = EcoreFactory.INSTANCE.createPEKeyword();
		keyword.setName(symbolName);
		String value = Utils.getLiteralValue(ctx.value);
		keyword.setValue(value);
		nodeScope.define(symbolName, keyword);
	}
	
	@Override
	public void enterDatatypeDecl(DatatypeDeclContext ctx) {
		String symbolName = ctx.name.getText();
		if (nodeScope.resolve(symbolName) != null) {
			throw new RuntimeException("Symbol " + symbolName + " is already defined.");
		}
		PEDataType datatype = EcoreFactory.INSTANCE.createPEDataType();
		datatype.setName(symbolName);
		nodeScope.define(symbolName, datatype);
	}
	
	@Override
	public void enterBuiltinType(BuiltinTypeContext ctx) {
		String symbolName = ctx.name.getText();
		if (nodeScope.resolve(symbolName) != null) {
			throw new RuntimeException("Symbol " + symbolName + " is already defined.");
		}
		PEBuiltinType builtinType = EcoreFactory.INSTANCE.createPEBuiltinType();
		builtinType.setName(symbolName);
		nodeScope.define(symbolName, builtinType);
	}
	
}
