/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.parser.tests;

import java.util.List;

import org.eclipse.dltk.ast.utils.ASTUtil;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Script;

public class FunctionDocumentationTests extends AbstractJSParserTest {

	public void testSingleLineComment() {
		List<String> code = new StringList();
		code.add("// doc");
		code.add("function hello() {}");
		Script script = parse(code.toString());
		FunctionStatement func = uniqueResult(ASTUtil.select(script,
				FunctionStatement.class));
		assertNull(func.getDocumentation());
	}

	public void testMultiLineComment() {
		List<String> code = new StringList();
		code.add("/* doc */");
		code.add("function hello() {}");
		Script script = parse(code.toString());
		FunctionStatement func = uniqueResult(ASTUtil.select(script,
				FunctionStatement.class));
		assertNull(func.getDocumentation());
	}

	public void testJsDocComment() {
		List<String> code = new StringList();
		code.add("/** doc */");
		code.add("function hello() {}");
		Script script = parse(code.toString());
		FunctionStatement func = uniqueResult(ASTUtil.select(script,
				FunctionStatement.class));
		assertNotNull(func.getDocumentation());
		assertTrue(func.getDocumentation().isDocumentation());
		assertTrue(func.getDocumentation().getText().contains("doc"));
	}

	public void testJsDocCommentWithEmptyLines() {
		List<String> code = new StringList();
		code.add("/** doc */");
		code.add("");
		code.add("");
		code.add("function hello() {}");
		Script script = parse(code.toString());
		FunctionStatement func = uniqueResult(ASTUtil.select(script,
				FunctionStatement.class));
		assertNotNull(func.getDocumentation());
		assertTrue(func.getDocumentation().isDocumentation());
		assertTrue(func.getDocumentation().getText().contains("doc"));
	}

	public void testExtraStatementAfterJsDoc() {
		List<String> code = new StringList();
		code.add("/** doc */");
		code.add(";");
		code.add("function hello() {}");
		Script script = parse(code.toString());
		FunctionStatement func = uniqueResult(ASTUtil.select(script,
				FunctionStatement.class));
		assertNull(func.getDocumentation());
	}

}
