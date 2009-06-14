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

import org.antlr.runtime.Token;
import org.eclipse.core.runtime.Assert;

public class JavaScriptToken implements Token {

	private int channel;
	private int charPositionInLine;
	private int lineno;
	private String text;
	private int tokenIndex;
	private int ttype;

	public JavaScriptToken(Token source) {
		this.channel = source.getChannel();
		this.charPositionInLine = source.getCharPositionInLine();
		this.lineno = source.getLine();
		this.text = source.getText();
		this.tokenIndex = source.getTokenIndex();
		this.ttype = source.getType();
		// Assert.isTrue(this.tokenIndex >= 0);
	}

	public JavaScriptToken() {
	}

	public int getChannel() {
		return channel;
	}

	public int getCharPositionInLine() {
		return charPositionInLine;
	}

	public int getLine() {
		return lineno;
	}

	public String getText() {
		return text;
	}

	public int getTokenIndex() {
		return tokenIndex;
	}

	public int getType() {
		return ttype;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void setCharPositionInLine(int pos) {
		this.charPositionInLine = pos;
	}

	public void setLine(int line) {
		this.lineno = line;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setTokenIndex(int index) {
		this.tokenIndex = index;
		Assert.isTrue(this.tokenIndex >= 0);
	}

	public void setType(int ttype) {
		this.ttype = ttype;
	}

	public String toString() {
		return getText();
	}

}
