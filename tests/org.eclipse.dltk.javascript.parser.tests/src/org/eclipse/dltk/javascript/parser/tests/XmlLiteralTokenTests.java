/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.parser.tests;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.builder.ISourceLineTracker;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.JSParser;
import org.eclipse.dltk.javascript.parser.JSTokenStream;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.utils.TextUtils;

@SuppressWarnings("nls")
public class XmlLiteralTokenTests extends AbstractJSParserTest {

	private static class TestParser extends JavaScriptParser {

		/*
		 * increase visibility of inherited method
		 */
		@Override
		public Script parse(IModelElement element, JSTokenStream stream,
				ISourceLineTracker lineTracker, IProblemReporter reporter) {
			return super.parse(element, stream, lineTracker, reporter);
		}

	}

	protected List<Token> tokenize(final String code) {
		final JSTokenStream stream = new JavaScriptParser()
				.createTokenStream(code);
		new TestParser().parse(null, stream, TextUtils.createLineTracker(code),
				reporter);
		return stream.getTokens();
	}

	protected List<Token> filter(List<Token> tokens) {
		List<Token> result = null;
		for (int i = 0, size = tokens.size(); i < size; ++i) {
			Token token = tokens.get(i);
			if (token.getChannel() != Token.HIDDEN_CHANNEL) {
				if (result != null) {
					result.add(token);
				}
			} else if (result == null) {
				result = new ArrayList<Token>();
				result.addAll(tokens.subList(0, i));
			}
		}
		if (result != null) {
			return result;
		} else {
			return tokens;
		}
	}

	protected void assertTokenTypes(List<Token> tokens, int... tokenTypes) {
		assertEquals(tokenTypes.length, tokens.size());
		for (int i = 0; i < tokenTypes.length; ++i) {
			assertEquals(tokenTypes[i], tokens.get(i).getType());
		}
	}

	public void testXmlLiteralTokens() {
		StringList code = new StringList();
		code.add("var TOC = <xml>");
		code.add("<entry label={homePageTitle}/>");
		code.add("</xml>");
		code.add("");
		code.add("");

		List<Token> tokens = tokenize(code.toString());
		assertTokenTypes(tokens, JSParser.VAR, JSParser.WhiteSpace,
				JSParser.Identifier, JSParser.WhiteSpace, JSParser.ASSIGN,
				JSParser.WhiteSpace, JSParser.XMLFragment, JSParser.LBRACE,
				JSParser.Identifier, JSParser.RBRACE, JSParser.XMLFragmentEnd,
				JSParser.EOL, JSParser.EOL, JSParser.EOL);

		tokens = filter(tokens);
		assertTokenTypes(tokens, JSParser.VAR, JSParser.Identifier,
				JSParser.ASSIGN, JSParser.XMLFragment, JSParser.LBRACE,
				JSParser.Identifier, JSParser.RBRACE, JSParser.XMLFragmentEnd);
	}

	public void testXmlLiteralTokensWithCommment() {
		final String code = "var x = <{name}/> // name\n";
		final List<Token> tokens = filter(tokenize(code));
		assertTokenTypes(tokens, JSParser.VAR, JSParser.Identifier,
				JSParser.ASSIGN, JSParser.XMLFragment, JSParser.LBRACE,
				JSParser.Identifier, JSParser.RBRACE, JSParser.XMLFragmentEnd);
	}

}
