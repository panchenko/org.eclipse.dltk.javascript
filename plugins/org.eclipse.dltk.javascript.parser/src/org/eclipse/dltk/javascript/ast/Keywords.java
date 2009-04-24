/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladimir Belov)
 *******************************************************************************/

package org.eclipse.dltk.javascript.ast;

import java.util.HashMap;

import org.eclipse.dltk.javascript.parser.JSParser;

public class Keywords {

	public static final String FUNCTION = "function";

	public static final String NULL = "null";

	public static final String RETURN = "return";

	public static final String IF = "if";

	public static final String ELSE = "else";

	public static final String SWITCH = "switch";

	public static final String CASE = "case";

	public static final String BREAK = "break";

	public static final String CONTINUE = "continue";

	public static final String DEFAULT = "default";

	public static final String FOR = "for";

	public static final String EACH = "each";

	public static final String WHILE = "while";

	public static final String DO = "do";

	public static final String VAR = "var";

	public static final String CONST = "const";

	public static final String IN = "in";

	public static final String NEW = "new";

	public static final String TRUE = "true";

	public static final String FALSE = "false";

	public static final String TRY = "try";

	public static final String CATCH = "catch";

	public static final String FINALLY = "finally";

	public static final String INSTANCEOF = "instanceof";

	public static final String TYPEOF = "typeof";

	public static final String THIS = "this";

	public static final String THROW = "throw";

	public static final String EXPORT = "export";

	public static final String IMPORT = "import";

	public static final String WITH = "with";

	public static final String DELETE = "delete";

	public static final String GET = "get";

	public static final String SET = "set";

	public static final String VOID = "void";

	//
	//
	//
	//

	public static final char SPACE_CHAR = ' ';

	// public static final String NEW_LINE = "\r\n";

	//
	//
	//

	public static final char LP = '(';

	public static final char RP = ')';

	public static final char LC = '{';

	public static final char RC = '}';

	public static final char LB = '[';

	public static final char RB = ']';

	//
	//
	//

	public static final char DOT = '.';

	public static final char COMMA = ',';

	public static final char SEMI = ';';

	public static final char COLON = ':';

	//
	//
	//

	public static final char STRING_QUOTE = '"';

	//
	//
	//

	public static final char ASSIGN = '=';

	public static final String ADDASS = "+=";
	public static final String SUBASS = "-=";
	public static final String MULASS = "*=";
	public static final String DIVASS = "/=";
	public static final String MODASS = "%="; // it does not present in
	// JavaScript
	// 1.5 Reference

	public static final String XORASS = "^=";
	public static final String ANDASS = "&=";
	public static final String ORASS = "|=";
	public static final String SHLASS = "<<=";
	public static final String SHRASS = ">>=";
	public static final String SHUASS = ">>>=";

	//
	//
	//

	public static final String INC = "++";
	public static final String DEC = "--";

	public static final char ADD = '+';
	public static final char SUB = '-';
	public static final char MUL = '*';
	public static final char DIV = '/';
	public static final char MOD = '%';
	public static final String LAND = "&&";
	public static final String LOR = "||";
	public static final char NOT = '!';

	public static final char OR = '|';
	public static final char XOR = '^';
	public static final char AND = '&';
	public static final char INV = '~';

	public static final String SHL = "<<";
	public static final String SHR = ">>";
	public static final String SHU = ">>>";

	public static final String EQ = "==";
	public static final String NEQ = "!=";
	public static final String SAME = "===";
	public static final String NSAME = "!==";

	public static final String LTE = "<=";
	public static final char LT = '<';
	public static final String GTE = ">=";
	public static final char GT = '>';

	public static final char HOOK = '?';

	private final static HashMap map = new HashMap();
	static {

		map.put(new Integer(JSParser.ASSIGN), String.valueOf(Keywords.ASSIGN));

		map.put(new Integer(JSParser.ADDASS), Keywords.ADDASS);
		map.put(new Integer(JSParser.SUBASS), Keywords.SUBASS);
		map.put(new Integer(JSParser.MULASS), Keywords.MULASS);
		map.put(new Integer(JSParser.DIVASS), Keywords.DIVASS);
		map.put(new Integer(JSParser.MODASS), Keywords.MODASS);
		map.put(new Integer(JSParser.XORASS), Keywords.XORASS);
		map.put(new Integer(JSParser.ANDASS), Keywords.ANDASS);
		map.put(new Integer(JSParser.ORASS), Keywords.ORASS);
		map.put(new Integer(JSParser.SHLASS), Keywords.SHLASS);
		map.put(new Integer(JSParser.SHRASS), Keywords.SHRASS);
		map.put(new Integer(JSParser.SHUASS), Keywords.SHUASS);

		//
		//
		//

		map.put(new Integer(JSParser.PINC), Keywords.INC);
		map.put(new Integer(JSParser.PDEC), Keywords.DEC);
		map.put(new Integer(JSParser.INC), Keywords.INC);
		map.put(new Integer(JSParser.DEC), Keywords.DEC);
		map.put(new Integer(JSParser.NEG), String.valueOf(Keywords.SUB));

		map.put(new Integer(JSParser.ADD), String.valueOf(Keywords.ADD));
		map.put(new Integer(JSParser.SUB), String.valueOf(Keywords.SUB));
		map.put(new Integer(JSParser.DIV), String.valueOf(Keywords.DIV));
		map.put(new Integer(JSParser.MUL), String.valueOf(Keywords.MUL));
		map.put(new Integer(JSParser.MOD), String.valueOf(Keywords.MOD));

		map.put(new Integer(JSParser.LAND), Keywords.LAND);
		map.put(new Integer(JSParser.LOR), Keywords.LOR);
		map.put(new Integer(JSParser.NOT), String.valueOf(Keywords.NOT));

		map.put(new Integer(JSParser.OR), String.valueOf(Keywords.OR));
		map.put(new Integer(JSParser.XOR), String.valueOf(Keywords.XOR));
		map.put(new Integer(JSParser.AND), String.valueOf(Keywords.AND));
		map.put(new Integer(JSParser.INV), String.valueOf(Keywords.INV));

		map.put(new Integer(JSParser.SHL), Keywords.SHL);
		map.put(new Integer(JSParser.SHR), Keywords.SHR);
		map.put(new Integer(JSParser.SHU), Keywords.SHU);

		map.put(new Integer(JSParser.EQ), Keywords.EQ);
		map.put(new Integer(JSParser.NEQ), Keywords.NEQ);
		map.put(new Integer(JSParser.LTE), Keywords.LTE);
		map.put(new Integer(JSParser.LT), String.valueOf(Keywords.LT));
		map.put(new Integer(JSParser.GTE), Keywords.GTE);
		map.put(new Integer(JSParser.GT), String.valueOf(Keywords.GT));
		map.put(new Integer(JSParser.SAME), Keywords.SAME);
		map.put(new Integer(JSParser.NSAME), Keywords.NSAME);

		map.put(new Integer(JSParser.INSTANCEOF), Keywords.INSTANCEOF);
		map.put(new Integer(JSParser.TYPEOF), Keywords.TYPEOF);
		map.put(new Integer(JSParser.IN), Keywords.IN);
	}

	public static String fromToken(int token) {

		Integer tokenValue = new Integer(token);
		if (map.containsKey(tokenValue)) {
			return map.get(tokenValue).toString();
		}

		throw new IllegalArgumentException(new Integer(token).toString());
	}

	private static String charToHexString(char ch) {
		return Integer.toHexString(ch).toUpperCase();
	}

	public static String encodeString(String s, char quoteChar) {

		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			switch (ch) {
			case '\t':
				buffer.append("\\t");
				break;

			case '\b':
				buffer.append("\\b");
				break;

			case '\f':
				buffer.append("\\f");
				break;

			case '\r':
				buffer.append("\\r");
				break;

			case '\n':
				buffer.append("\\n");
				break;

			case '\\':
				buffer.append("\\\\");
				break;

			default:
				if (ch == quoteChar) {
					buffer.append("\\");
					buffer.append(quoteChar);
				} else if (ch > 0xfff) {
					buffer.append("\\u" + charToHexString(ch));
				} else if (ch > 0xff) {
					buffer.append("\\u0" + charToHexString(ch));
				} else if (ch > 0x7f) {
					buffer.append("\\u00" + charToHexString(ch));
				} else
					buffer.append(ch);
			}
		}
		return buffer.toString();
	}
}
