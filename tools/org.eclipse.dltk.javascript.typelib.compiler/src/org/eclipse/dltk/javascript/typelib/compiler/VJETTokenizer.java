/*******************************************************************************
 * Copyright (c) 2014 Alex Panchenko
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Alex Panchenko - initial API and Implementation
 *******************************************************************************/
package org.eclipse.dltk.javascript.typelib.compiler;

import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;

import com.google.common.collect.ImmutableMap;

public class VJETTokenizer {
	public enum Token {
		EOF, PUBLIC, FINAL, IDENTIFIER, LEFT_PAREN, RIGHT_PAREN, COMMA, DOTS, OTHER, DOT, QUESTION
	}

	private static final Map<String, Token> KEYWORDS = ImmutableMap.of("public", Token.PUBLIC, "final", Token.FINAL);

	private final CharStream input;
	private Token token;
	private String value;

	public VJETTokenizer(String input) {
		this.input = new ANTLRStringStream(input);
	}

	public void consume() {
		token = null;
		value = null;
	}

	public Token peek() {
		if (token == null) {
			token = read();
		}
		return token;
	}

	private Token read() {
		int c;
		for (;;) {
			c = input.LT(1);
			if (c == CharStream.EOF) {
				return Token.EOF;
			} else if (Character.isWhitespace(c)) {
				input.consume();
				continue;
			}
			break;
		}
		if (Character.isJavaIdentifierStart(c)) {
			int start = input.index();
			do {
				input.consume();
			} while (Character.isJavaIdentifierPart(input.LT(1)));
			final String identifier = input.substring(start, input.index() - 1);
			final Token keyword = KEYWORDS.get(identifier);
			if (keyword != null) {
				return keyword;
			}
			value = identifier;
			return Token.IDENTIFIER;
		} else if (c == '(') {
			input.consume();
			return Token.LEFT_PAREN;
		} else if (c == ')') {
			input.consume();
			return Token.RIGHT_PAREN;
		} else if (c == ',') {
			input.consume();
			return Token.COMMA;
		} else if (c == '?') {
			input.consume();
			return Token.QUESTION;
		} else if (c == '.') {
			input.consume();
			if (input.LT(1) == '.' && input.LT(2) == '.') {
				input.consume();
				input.consume();
				return Token.DOTS;
			} else {
				return Token.DOT;
			}
		}
		input.consume();
		value = Character.toString((char) c);
		return Token.OTHER;
	}

	public String value() {
		return value;
	}

	public int index() {
		return input.index();
	}
}
