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

import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;

public class JavaScriptTokenSource implements TokenSource {

	private List tokens;
	private int currentPos;

	public JavaScriptTokenSource(List tokens) {
		this.tokens = tokens;
		this.currentPos = -1;
	}

	public Token nextToken() {
		if (currentPos >= this.tokens.size() - 1)
			return null;

		return (Token) this.tokens.get(++currentPos);
	}

	protected int getCurrentPos() {
		return this.currentPos;
	}

}
