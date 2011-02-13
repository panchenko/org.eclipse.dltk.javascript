/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.core;

public class JavaScriptKeywords {

	private static final String[] fgKeywords = { "break", "else", "new",
			"const", "var", "case", "finally", "return", "void", "catch",
			"for", "each", "switch", "while", "continue", "function", "this",
			"with", "default", "if", "throw", "delete", "in", "try", "do",
			"instanceof", "typeof", "null", "true", "false", "undefined" };

	public static String[] getJavaScriptKeywords() {
		return fgKeywords;
	}
}
