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

import org.eclipse.dltk.javascript.internal.parser.tests.ANTLRParserTester;

public class ANTLRParserTestCase extends TestCase {

	public void testFunctionParse() throws IOException {
		ANTLRParserTester.parse("functions.js");
	}

	public void testSwitchParse() throws IOException {
		ANTLRParserTester.parse("switch.js");
	}

	public void testForParse() throws IOException {
		ANTLRParserTester.parse("for.js");
	}

	public void testForInParse() throws IOException {
		ANTLRParserTester.parse("for-in.js");
	}

	public void testForEachInParse() throws IOException {
		ANTLRParserTester.parse("for-each-in.js");
	}

	public void testVariableDeclarationParse() throws IOException {
		ANTLRParserTester.parse("var.js");
	}

	public void testWhileParse() throws IOException {
		ANTLRParserTester.parse("while.js");
	}

	public void testDoWhileParse() throws IOException {
		ANTLRParserTester.parse("do-while.js");
	}

	public void testIfElseParse() throws IOException {
		ANTLRParserTester.parse("if-else.js");
	}

	public void testTryCatchParse() throws IOException {
		ANTLRParserTester.parse("try-catch.js");
	}

	public void testArraysParse() throws IOException {
		ANTLRParserTester.parse("arrays.js");
	}

	public void testRegexpParse() throws IOException {
		ANTLRParserTester.parse("regexp.js");
	}

	public void testArthmeticOperatorsParse() throws IOException {
		ANTLRParserTester.parse("arithmetic-operators.js");
	}

	public void testAssignmentOperatorsParse() throws IOException {
		ANTLRParserTester.parse("assignment-operators.js");
	}

	public void testComparisonOperatorsParse() throws IOException {
		ANTLRParserTester.parse("comparison-operators.js");
	}

	public void testBitwiseOperatorsParse() throws IOException {
		ANTLRParserTester.parse("bitwise-operators.js");
	}

	public void testLogicalOperatorsParse() throws IOException {
		ANTLRParserTester.parse("logical-operators.js");
	}

	public void testNoFunctionsParse() throws IOException {
		ANTLRParserTester.parse("no-functions.js");
	}

	public void testWithParse() throws IOException {
		ANTLRParserTester.parse("with.js");
	}

	public void testLabelsParse() throws IOException {
		ANTLRParserTester.parse("labels.js");
	}

	public void testDeleteParse() throws IOException {
		ANTLRParserTester.parse("delete.js");
	}

	public void testInOperatorParse() throws IOException {
		ANTLRParserTester.parse("in.js");
	}

	public void testGetSetParse() throws IOException {
		ANTLRParserTester.parse("get-set-let.js");
	}

	public void testTypeOfParse() throws IOException {
		ANTLRParserTester.parse("typeof.js");
	}

	public void testBlockParse() throws IOException {
		ANTLRParserTester.parse("block.js");
	}

	public void testConstParse() throws IOException {
		ANTLRParserTester.parse("const.js");
	}

	public void testNewLinesParse() throws IOException {
		ANTLRParserTester.parse("new-lines.js");
	}

	public void testUnicodeParse() throws IOException {
		ANTLRParserTester.parse("unicode.js");
	}

	public void testIndentationPreview_Methods() throws IOException {
		ANTLRParserTester.parsePreview("indentation-preview.js");
	}

	public void testBracesPreview_Methods() throws IOException {
		ANTLRParserTester.parsePreview("braces-preview.js");
	}

	public void testCommentsPreview_Methods() throws IOException {
		ANTLRParserTester.parsePreview("comments-preview.js");
	}

	public void testControlStatementsPreview_Methods() throws IOException {
		ANTLRParserTester.parsePreview("control-statements-preview.js");
	}

	public void testWhitespacesPreview_Methods() throws IOException {
		ANTLRParserTester.parsePreview("whitespaces-preview.js");
	}
}
