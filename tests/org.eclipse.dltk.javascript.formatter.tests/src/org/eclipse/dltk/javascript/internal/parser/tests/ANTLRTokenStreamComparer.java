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

	private static List<String> getTokens(String source, List<String> comments) {

		JSTokenStream stream = JavaScriptParser.createTokenStream(source);

		List<String> list = new ArrayList<String>();

		List<Token> tokens = stream.getTokens();

		for (int i = 0; i < tokens.size(); i++) {
			Token token = tokens.get(i);

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

	private static void printTokens(List<String> sourceTokens,
			List<String> targetTokens, int count) {
		for (int i = Math.max(0, count - 30); i < count; i++) {
			System.out.print(i);
			System.out.print(". ");
			System.out.print(sourceTokens.get(i));
			System.out.print(" - ");
			System.out.println(targetTokens.get(i));
		}
		System.out.println("-------------------------------------------");
	}

	private static void printComments(List<String> sourceComments,
			List<String> targetComments) {

		for (int i = 0; i < Math.max(sourceComments.size(),
				targetComments.size()); i++) {

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

		List<String> sourceComments = new ArrayList<String>();
		List<String> targetComments = new ArrayList<String>();

		List<String> sourceTokens = getTokens(source, sourceComments);
		List<String> targetTokens = getTokens(target, targetComments);

		int errorPos = -1;

		for (int i = 0; i < sourceTokens.size(); i++) {
			String sourceToken = sourceTokens.get(i);
			String targetToken = targetTokens.get(i);

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
			Assert.assertEquals(sourceTokens.get(errorPos),
					targetTokens.get(errorPos));
		}

		if (compareComments) {

			if (sourceComments.size() != targetComments.size()) {
				printComments(sourceComments, targetComments);
				Assert.assertEquals(sourceComments.size(),
						targetComments.size());
			}
		}

	}

}
