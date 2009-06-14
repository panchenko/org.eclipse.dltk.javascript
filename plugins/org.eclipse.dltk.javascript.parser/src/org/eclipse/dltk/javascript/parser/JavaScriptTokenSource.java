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

package org.eclipse.dltk.javascript.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.core.runtime.Assert;

public class JavaScriptTokenSource implements TokenSource {

	private final TokenSource tokenSource;
	private List<Token> tokens = null;
	private int currentPos = 0;

	public JavaScriptTokenSource(TokenSource tokenSource) {
		this.tokenSource = tokenSource;
	}

	public Token nextToken() {
		if (tokens == null) {
			final List<Token> source = new ArrayList<Token>();
			Token t = tokenSource.nextToken();
			while (t != null && t.getType() != CharStream.EOF) {
				source.add(t);
				t = tokenSource.nextToken();
			}
			tokens = new JavaScriptTokenFilter().filter(source);
			Assert.isNotNull(tokens);
		}
		if (currentPos < this.tokens.size()) {
			return this.tokens.get(currentPos++);
		}
		return Token.EOF_TOKEN;
	}

}
