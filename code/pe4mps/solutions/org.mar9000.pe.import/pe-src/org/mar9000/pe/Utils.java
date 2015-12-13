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

import org.mar9000.pe.PEParser.LiteralContext;
import org.mar9000.pe.ecore.PEElementCardinality;

public class Utils {
	
	public static String getStringValue(String s) {
		return s.substring(1, s.length()-1);
	}
	
	public static String getLiteralValue(LiteralContext ctx) {
		if (ctx.StringLiteral() != null) {
			String typedString = getStringValue(ctx.StringLiteral().getText());
			// See lexer EscapeSequence: '\\' ['\\]
			return typedString.replaceAll("\\\\'", "'").replaceAll("\\\\\\\\", "\\\\");
		}
		else
			return ctx.NumericLiteral().getText();
	}
	
	public static PEElementCardinality getPEElementCardinality(String s) {
		if (s == null)
			return PEElementCardinality.MANDATORY;
		else if (s.equals("?"))
			return PEElementCardinality.OPTIONAL;
		else if (s.equals("+"))
			return PEElementCardinality.NON_EMPTY_ARRAY;
		else
			return PEElementCardinality.ARRAY;
	}
	
}
