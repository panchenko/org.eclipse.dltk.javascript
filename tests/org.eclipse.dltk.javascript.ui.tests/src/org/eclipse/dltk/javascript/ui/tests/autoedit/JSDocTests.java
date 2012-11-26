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
import org.junit.Test;

public class JSDocTests extends JSAutoEditStrategyTestCase {

	@Test
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

	@Test
	public void testStartJsDocViaDocStrategy() throws BadLocationException {
		StringList code = new StringList();
		code.add("/**");
		code.add("function test() {");
		code.add("/* body */");
		code.add("}");
		final Document document = createDocument(code);
		execute(document, createCommand(ENTER, document.getEndOfLineOffset(0)));
		StringList expected = new StringList();
		expected.add("/**");
		expected.add(" * ");
		expected.add(" */");
		expected.add("function test() {");
		expected.add("/* body */");
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

	@Test
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

	@Test
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

	@Test
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

	@Test
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

	@Test
	public void testVarTypeSimple() throws BadLocationException {
		final StringList code = new StringList();
		code.add("var /*");
		final Document document = createDocument(code);
		execute(document, createCommand("*", document.getEndOfLineOffset(0)));
		final StringList expected = new StringList();
		expected.add("var /** @type {} */ ");
		assertEquals(expected.toString(), document.get());
	}

	private static final String COMMENT = "/* comment */";

	@Test
	public void testVarTypeSimple_comment() throws BadLocationException {
		final StringList code = new StringList();
		code.add("var /*");
		code.add(COMMENT);
		final Document document = createDocument(code);
		execute(document, createCommand("*", document.getEndOfLineOffset(0)));
		final StringList expected = new StringList();
		expected.add("var /** @type {} */ ");
		expected.add(COMMENT);
		assertEquals(expected.toString(), document.get());
	}

	@Test
	public void testVarTypeContinuationLine() throws BadLocationException {
		final StringList code = new StringList();
		code.add("var /** @type {String} name,");
		code.add("    /*");
		final Document document = createDocument(code);
		execute(document, createCommand("*", document.getEndOfLineOffset(1)));
		final StringList expected = new StringList();
		expected.add("var /** @type {String} name,");
		expected.add("    /** @type {} */ ");
		assertEquals(expected.toString(), document.get());
	}

	@Test
	public void testVarTypeContinuationLine_comment()
			throws BadLocationException {
		final StringList code = new StringList();
		code.add("var /** @type {String} name,");
		code.add("    /*");
		code.add(COMMENT);
		final Document document = createDocument(code);
		execute(document, createCommand("*", document.getEndOfLineOffset(1)));
		final StringList expected = new StringList();
		expected.add("var /** @type {String} name,");
		expected.add("    /** @type {} */ ");
		expected.add(COMMENT);
		assertEquals(expected.toString(), document.get());
	}

	@Test
	public void testVarTypeKeywordOnPreviousLine() throws BadLocationException {
		final StringList code = new StringList();
		code.add("var");
		code.add("    /*");
		final Document document = createDocument(code);
		execute(document, createCommand("*", document.getEndOfLineOffset(1)));
		final StringList expected = new StringList();
		expected.add("var");
		expected.add("    /** @type {} */ ");
		assertEquals(expected.toString(), document.get());
	}

	@Test
	public void testVarTypeKeywordOnPreviousLine_comment()
			throws BadLocationException {
		final StringList code = new StringList();
		code.add("var");
		code.add("    /*");
		code.add(COMMENT);
		final Document document = createDocument(code);
		execute(document, createCommand("*", document.getEndOfLineOffset(1)));
		final StringList expected = new StringList();
		expected.add("var");
		expected.add("    /** @type {} */ ");
		expected.add(COMMENT);
		assertEquals(expected.toString(), document.get());
	}

	@Test
	public void testVarTypeContinuationKeywordOnPreviousLine()
			throws BadLocationException {
		final StringList code = new StringList();
		code.add("var");
		code.add("    /** @type {String} name,");
		code.add("    /*");
		final Document document = createDocument(code);
		execute(document, createCommand("*", document.getEndOfLineOffset(2)));
		final StringList expected = new StringList();
		expected.add("var");
		expected.add("    /** @type {String} name,");
		expected.add("    /** @type {} */ ");
		assertEquals(expected.toString(), document.get());
	}

	@Test
	public void testVarTypeContinuationKeywordOnPreviousLine_comment()
			throws BadLocationException {
		final StringList code = new StringList();
		code.add("var");
		code.add("    /** @type {String} name,");
		code.add("    /*");
		code.add(COMMENT);
		final Document document = createDocument(code);
		execute(document, createCommand("*", document.getEndOfLineOffset(2)));
		final StringList expected = new StringList();
		expected.add("var");
		expected.add("    /** @type {String} name,");
		expected.add("    /** @type {} */ ");
		expected.add(COMMENT);
		assertEquals(expected.toString(), document.get());
	}

	@Test
	public void testFunctionExpression() throws BadLocationException {
		final StringList code = new StringList();
		code.add("$(link).click(/*function(){");
		code.add("});");
		final Document document = createDocument(code);
		execute(document, createCommand("*", document.indexOf("function")));
		final StringList expected = new StringList();
		expected.add("$(link).click(/**  */ function(){");
		expected.add("});");
		assertEquals(expected.toString(), document.get());
	}

	@Test
	public void testFunctionExpression_space() throws BadLocationException {
		final StringList code = new StringList();
		code.add("$(link).click(/* function(){");
		code.add("});");
		final Document document = createDocument(code);
		execute(document, createCommand("*", document.indexOf(" function")));
		final StringList expected = new StringList();
		expected.add("$(link).click(/**  */ function(){");
		expected.add("});");
		assertEquals(expected.toString(), document.get());
	}

	@Test
	public void testBeforeFunctionDeclaration_noExpansion()
			throws BadLocationException {
		final StringList code = new StringList();
		code.add("/*");
		code.add("function test() {");
		code.add("}");
		final Document document = createDocument(code);
		execute(document, createCommand("*", document.indexOf("/*") + 2));
		final StringList expected = new StringList();
		expected.add("/**");
		expected.add("function test() {");
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

}
