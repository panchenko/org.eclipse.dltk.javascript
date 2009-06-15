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

import junit.framework.TestCase;

import org.eclipse.dltk.javascript.internal.parser.tests.FormatterPreviewTester;
import org.eclipse.dltk.javascript.internal.parser.tests.JavaScriptParserTester;

public class JavaScriptParserTestCase extends TestCase {

	public void testFunctionParse() throws Exception {
		JavaScriptParserTester.parse("functions.js");
	}

	public void testSwitchParse() throws Exception {
		JavaScriptParserTester.parse("switch.js");
	}

	public void testForParse() throws Exception {
		JavaScriptParserTester.parse("for.js");
	}

	public void testForInParse() throws Exception {
		JavaScriptParserTester.parse("for-in.js");
	}

	public void testForEachInParse() throws Exception {
		JavaScriptParserTester.parse("for-each-in.js");
	}

	public void testVariableDeclarationParse() throws Exception {
		JavaScriptParserTester.parse("var.js");
	}

	public void testWhileParse() throws Exception {
		JavaScriptParserTester.parse("while.js");
	}

	public void testDoWhileParse() throws Exception {
		JavaScriptParserTester.parse("do-while.js");
	}

	public void testIfElseParse() throws Exception {
		JavaScriptParserTester.parse("if-else.js");
	}

	public void testTryCatchParse() throws Exception {
		JavaScriptParserTester.parse("try-catch.js");
	}

	public void testArraysParse() throws Exception {
		JavaScriptParserTester.parse("arrays.js");
	}

	public void testRegexpParse() throws Exception {
		JavaScriptParserTester.parse("regexp.js");
	}

	public void testArthmeticOperatorsParse() throws Exception {
		JavaScriptParserTester.parse("arithmetic-operators.js");
	}

	public void testAssignmentOperatorsParse() throws Exception {
		JavaScriptParserTester.parse("assignment-operators.js");
	}

	public void testComparisonOperatorsParse() throws Exception {
		JavaScriptParserTester.parse("comparison-operators.js");
	}

	public void testBitwiseOperatorsParse() throws Exception {
		JavaScriptParserTester.parse("bitwise-operators.js");
	}

	public void testLogicalOperatorsParse() throws Exception {
		JavaScriptParserTester.parse("logical-operators.js");
	}

	public void testNoFunctionsParse() throws Exception {
		JavaScriptParserTester.parse("no-functions.js");
	}

	public void testWithParse() throws Exception {
		JavaScriptParserTester.parse("with.js");
	}

	public void testLabelsParse() throws Exception {
		JavaScriptParserTester.parse("labels.js");
	}

	public void testDeleteParse() throws Exception {
		JavaScriptParserTester.parse("delete.js");
	}

	public void testInOperatorParse() throws Exception {
		JavaScriptParserTester.parse("in.js");
	}

	public void testGetSetParse() throws Exception {
		JavaScriptParserTester.parse("get-set-let.js");
	}

	public void testTypeOfParse() throws Exception {
		JavaScriptParserTester.parse("typeof.js");
	}

	public void testBlockParse() throws Exception {
		JavaScriptParserTester.parse("block.js");
	}

	public void testConstParse() throws Exception {
		JavaScriptParserTester.parse("const.js");
	}

	public void testNewLinesParse() throws Exception {
		JavaScriptParserTester.parse("new-lines.js");
	}

	public void testUnicodeParse() throws Exception {
		JavaScriptParserTester.parse("unicode.js");
	}

	public void testVoidParse() throws Exception {
		JavaScriptParserTester.parse("void.js");
	}

	public void testE4XParse() throws Exception {
		JavaScriptParserTester.parse("e4x.js");
	}

	public void testE4XSimpleParse() throws Exception {
		JavaScriptParserTester.parse("e4x-simple.js");
	}

	public void testBracesPreview() throws Exception {
		FormatterPreviewTester.testPagePreview("braces-preview.js");
	}

	public void testCommentsPreview() throws Exception {
		FormatterPreviewTester.testPagePreview("comments-preview.js");
	}

	public void testControlStatementsPreview() throws Exception {
		FormatterPreviewTester.testPagePreview("control-statements-preview.js");
	}

	public void testIndentationPreview() throws Exception {
		FormatterPreviewTester.testPagePreview("indentation-preview.js");
	}

	public void testNewLinesPreview() throws Exception {
		FormatterPreviewTester.testPagePreview("new-lines-preview.js");
	}

	public void testWhitespacesPreview() throws Exception {
		FormatterPreviewTester.testPagePreview("whitespaces-preview.js");
	}

	public void testGeneralPreview() throws Exception {
		FormatterPreviewTester.testGeneralPreview("FormatterPreview.js");
	}

}
