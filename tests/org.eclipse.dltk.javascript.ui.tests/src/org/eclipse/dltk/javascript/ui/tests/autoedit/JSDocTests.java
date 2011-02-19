/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.ui.tests.autoedit;

import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.jface.text.BadLocationException;

public class JSDocTests extends JSAutoEditStrategyTestCase {

	public void testStartJsDoc() throws BadLocationException {
		StringList code = new StringList();
		code.add("/**");
		code.add("function test() {");
		code.add("}");
		final Document document = createDocument(code);
		execute(document, createCommand(ENTER, document.getEndOfLineOffset(0)));
		StringList expected = new StringList();
		expected.add("/**");
		expected.add(" * ");
		expected.add(" */");
		expected.add("function test() {");
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

	public void testContinueJsDoc() throws BadLocationException {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * FUNCTION");
		code.add(" */");
		code.add("function test() {");
		code.add("}");
		final Document document = createDocument(code);
		execute(document, createCommand(ENTER, document.getEndOfLineOffset(1)));
		StringList expected = new StringList();
		expected.add("/**");
		expected.add(" * FUNCTION");
		expected.add(" * ");
		expected.add(" */");
		expected.add("function test() {");
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

	public void testStartMultiLineComment() throws BadLocationException {
		StringList code = new StringList();
		code.add("/*");
		code.add("function test() {");
		code.add("}");
		final Document document = createDocument(code);
		execute(document, createCommand(ENTER, document.getEndOfLineOffset(0)));
		StringList expected = new StringList();
		expected.add("/*");
		expected.add(" * ");
		expected.add(" */");
		expected.add("function test() {");
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

	public void testContinueMultiLineComment() throws BadLocationException {
		StringList code = new StringList();
		code.add("/*");
		code.add(" * FUNCTION");
		code.add(" */");
		code.add("function test() {");
		code.add("}");
		final Document document = createDocument(code);
		execute(document, createCommand(ENTER, document.getEndOfLineOffset(1)));
		StringList expected = new StringList();
		expected.add("/*");
		expected.add(" * FUNCTION");
		expected.add(" * ");
		expected.add(" */");
		expected.add("function test() {");
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

	public void testDontStartMultiLineComment() throws BadLocationException {
		StringList code = new StringList();
		code.add("/* */");
		code.add("function test() {");
		code.add("}");
		final Document document = createDocument(code);
		execute(document, createCommand(ENTER, document.getEndOfLineOffset(0)));
		StringList expected = new StringList();
		expected.add("/* */");
		expected.add("");
		expected.add("function test() {");
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

}
