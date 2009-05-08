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

package org.eclipse.dltk.javascript.parser.tests;

import java.io.IOException;

import junit.framework.TestCase;

import org.eclipse.dltk.javascript.internal.parser.tests.FormatterPreviewTester;
import org.eclipse.dltk.javascript.internal.parser.tests.JavaScriptParserTester;
import org.eclipse.dltk.ui.formatter.FormatterException;

public class JavaScriptParserTestCase extends TestCase {

	public void testFunctionParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("functions.js");
	}

	public void testSwitchParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("switch.js");
	}

	public void testForParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("for.js");
	}

	public void testForInParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("for-in.js");
	}

	public void testForEachInParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("for-each-in.js");
	}

	public void testVariableDeclarationParse() throws IOException,
			FormatterException {
		JavaScriptParserTester.parse("var.js");
	}

	public void testWhileParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("while.js");
	}

	public void testDoWhileParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("do-while.js");
	}

	public void testIfElseParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("if-else.js");
	}

	public void testTryCatchParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("try-catch.js");
	}

	public void testArraysParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("arrays.js");
	}

	public void testRegexpParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("regexp.js");
	}

	public void testArthmeticOperatorsParse() throws IOException,
			FormatterException {
		JavaScriptParserTester.parse("arithmetic-operators.js");
	}

	public void testAssignmentOperatorsParse() throws IOException,
			FormatterException {
		JavaScriptParserTester.parse("assignment-operators.js");
	}

	public void testComparisonOperatorsParse() throws IOException,
			FormatterException {
		JavaScriptParserTester.parse("comparison-operators.js");
	}

	public void testBitwiseOperatorsParse() throws IOException,
			FormatterException {
		JavaScriptParserTester.parse("bitwise-operators.js");
	}

	public void testLogicalOperatorsParse() throws IOException,
			FormatterException {
		JavaScriptParserTester.parse("logical-operators.js");
	}

	public void testNoFunctionsParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("no-functions.js");
	}

	public void testWithParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("with.js");
	}

	public void testLabelsParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("labels.js");
	}

	public void testDeleteParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("delete.js");
	}

	public void testInOperatorParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("in.js");
	}

	public void testGetSetParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("get-set-let.js");
	}

	public void testTypeOfParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("typeof.js");
	}

	public void testBlockParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("block.js");
	}

	public void testConstParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("const.js");
	}

	public void testNewLinesParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("new-lines.js");
	}

	public void testUnicodeParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("unicode.js");
	}

	public void testVoidParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("void.js");
	}

	public void testE4XParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("e4x.js");
	}

	public void testE4XSimpleParse() throws IOException, FormatterException {
		JavaScriptParserTester.parse("e4x-simple.js");
	}

	public void testBracesPreview() throws IOException, FormatterException {
		FormatterPreviewTester.testPagePreview("braces-preview.js");
	}

	public void testCommentsPreview() throws IOException, FormatterException {
		FormatterPreviewTester.testPagePreview("comments-preview.js");
	}

	public void testControlStatementsPreview() throws IOException,
			FormatterException {
		FormatterPreviewTester.testPagePreview("control-statements-preview.js");
	}

	public void testIndentationPreview() throws IOException, FormatterException {
		FormatterPreviewTester.testPagePreview("indentation-preview.js");
	}

	public void testNewLinesPreview() throws IOException, FormatterException {
		FormatterPreviewTester.testPagePreview("new-lines-preview.js");
	}

	public void testWhitespacesPreview() throws IOException, FormatterException {
		FormatterPreviewTester.testPagePreview("whitespaces-preview.js");
	}

	public void testGeneralPreview() throws IOException, FormatterException {
		FormatterPreviewTester.testGeneralPreview("FormatterPreview.js");
	}

}
