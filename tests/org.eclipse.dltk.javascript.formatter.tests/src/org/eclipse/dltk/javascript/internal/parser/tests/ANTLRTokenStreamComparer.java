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

package org.eclipse.dltk.javascript.internal.parser.tests;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.antlr.runtime.Token;
import org.eclipse.dltk.javascript.parser.JSParser;
import org.eclipse.dltk.javascript.parser.JSTokenStream;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;

public class ANTLRTokenStreamComparer {

	private static List getTokens(String source, List comments) {

		JSTokenStream stream = JavaScriptParser.createTokenStream(source);

		List list = new ArrayList();

		List tokens = stream.getTokens();

		for (int i = 0; i < tokens.size(); i++) {
			Token token = (Token) tokens.get(i);

			switch (token.getType()) {

			case JSParser.WhiteSpace:
			case JSParser.EOL:
			case JSParser.EOF:
				break;

			case JSParser.MultiLineComment:
			case JSParser.SingleLineComment:
				comments.add(token.getText());
				break;

			default:
				list.add(token.getText());
			}
		}

		return list;
	}

	private static void printTokens(List sourceTokens, List targetTokens,
			int count) {
		for (int i = Math.max(0, count - 30); i < count; i++) {
			System.out.print(i);
			System.out.print(". ");
			System.out.print(sourceTokens.get(i));
			System.out.print(" - ");
			System.out.println(targetTokens.get(i));
		}
		System.out.println("-------------------------------------------");
	}

	private static void printComments(List sourceComments, List targetComments) {

		for (int i = 0; i < Math.max(sourceComments.size(), targetComments
				.size()); i++) {

			System.out
					.println("==============================================================");
			System.out.println(i < sourceComments.size() ? sourceComments
					.get(i) : "!!! MISSED !!!");
			System.out
					.println("--------------------------------------------------------------");
			System.out.println(i < targetComments.size() ? targetComments
					.get(i) : "!!! MISSED !!!");

		}
		System.out
				.println("==============================================================");
	}

	public static void compare(String source, String target,
			boolean compareComments) {

		List sourceComments = new ArrayList();
		List targetComments = new ArrayList();

		List sourceTokens = getTokens(source, sourceComments);
		List targetTokens = getTokens(target, targetComments);

		int errorPos = -1;

		for (int i = 0; i < sourceTokens.size(); i++) {
			String sourceToken = (String) sourceTokens.get(i);
			String targetToken = (String) targetTokens.get(i);

			// if (sourceToken.getType() == JSParser.XML
			// && targetToken.getType() == JSParser.XML)
			// continue;

			if (!sourceToken.equals(targetToken)) {
				errorPos = i;
				break;
			}
		}

		if (errorPos > -1) {
			System.out
					.println("SOURCE --------------------------------------------");
			System.out.println(source);
			System.out
					.println("TARGET --------------------------------------------");
			System.out.println(target);
			System.out
					.println("TOKENS --------------------------------------------");
			printTokens(sourceTokens, targetTokens, errorPos + 1);
			Assert.assertEquals(sourceTokens.get(errorPos), targetTokens
					.get(errorPos));
		}

		if (compareComments) {

			if (sourceComments.size() != targetComments.size()) {
				printComments(sourceComments, targetComments);
				Assert.assertEquals(sourceComments.size(), targetComments
						.size());
			}
		}

	}

}
