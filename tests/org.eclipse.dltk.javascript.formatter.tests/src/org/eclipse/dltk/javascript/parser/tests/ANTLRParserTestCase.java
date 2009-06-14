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

import org.eclipse.dltk.javascript.internal.parser.tests.ANTLRParserTester;

public class ANTLRParserTestCase extends TestCase {

	public void _testFunctionParse() throws Exception {
		ANTLRParserTester.parse("functions.js");
	}

	public void testSwitchParse() throws Exception {
		ANTLRParserTester.parse("switch.js");
	}

	public void testForParse() throws Exception {
		ANTLRParserTester.parse("for.js");
	}

	public void testForInParse() throws Exception {
		ANTLRParserTester.parse("for-in.js");
	}

	public void testForEachInParse() throws Exception {
		ANTLRParserTester.parse("for-each-in.js");
	}

	public void testVariableDeclarationParse() throws Exception {
		ANTLRParserTester.parse("var.js");
	}

	public void testWhileParse() throws Exception {
		ANTLRParserTester.parse("while.js");
	}

	public void testDoWhileParse() throws Exception {
		ANTLRParserTester.parse("do-while.js");
	}

	public void testIfElseParse() throws Exception {
		ANTLRParserTester.parse("if-else.js");
	}

	public void testTryCatchParse() throws Exception {
		ANTLRParserTester.parse("try-catch.js");
	}

	public void testArraysParse() throws Exception {
		ANTLRParserTester.parse("arrays.js");
	}

	public void testRegexpParse() throws Exception {
		ANTLRParserTester.parse("regexp.js");
	}

	public void testArthmeticOperatorsParse() throws Exception {
		ANTLRParserTester.parse("arithmetic-operators.js");
	}

	public void testAssignmentOperatorsParse() throws Exception {
		ANTLRParserTester.parse("assignment-operators.js");
	}

	public void testComparisonOperatorsParse() throws Exception {
		ANTLRParserTester.parse("comparison-operators.js");
	}

	public void testBitwiseOperatorsParse() throws Exception {
		ANTLRParserTester.parse("bitwise-operators.js");
	}

	public void testLogicalOperatorsParse() throws Exception {
		ANTLRParserTester.parse("logical-operators.js");
	}

	public void testNoFunctionsParse() throws Exception {
		ANTLRParserTester.parse("no-functions.js");
	}

	public void testWithParse() throws Exception {
		ANTLRParserTester.parse("with.js");
	}

	public void testLabelsParse() throws Exception {
		ANTLRParserTester.parse("labels.js");
	}

	public void testDeleteParse() throws Exception {
		ANTLRParserTester.parse("delete.js");
	}

	public void testInOperatorParse() throws Exception {
		ANTLRParserTester.parse("in.js");
	}

	public void testGetSetParse() throws Exception {
		ANTLRParserTester.parse("get-set-let.js");
	}

	public void testTypeOfParse() throws Exception {
		ANTLRParserTester.parse("typeof.js");
	}

	public void testBlockParse() throws Exception {
		ANTLRParserTester.parse("block.js");
	}

	public void testConstParse() throws Exception {
		ANTLRParserTester.parse("const.js");
	}

	public void testNewLinesParse() throws Exception {
		ANTLRParserTester.parse("new-lines.js");
	}

	public void testUnicodeParse() throws Exception {
		ANTLRParserTester.parse("unicode.js");
	}

	public void testIndentationPreview_Methods() throws Exception {
		ANTLRParserTester.parsePreview("indentation-preview.js");
	}

	public void testBracesPreview_Methods() throws Exception {
		ANTLRParserTester.parsePreview("braces-preview.js");
	}

	public void testCommentsPreview_Methods() throws Exception {
		ANTLRParserTester.parsePreview("comments-preview.js");
	}

	public void testControlStatementsPreview_Methods() throws Exception {
		ANTLRParserTester.parsePreview("control-statements-preview.js");
	}

	public void testWhitespacesPreview_Methods() throws Exception {
		ANTLRParserTester.parsePreview("whitespaces-preview.js");
	}

	public void testE4XParse() throws Exception {
		ANTLRParserTester.parse("e4x.js");
	}

}
