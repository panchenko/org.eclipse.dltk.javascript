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

import org.eclipse.dltk.ast.utils.ASTUtil;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.ast.EmptyExpression;
import org.eclipse.dltk.javascript.ast.ForStatement;
import org.eclipse.dltk.javascript.ast.Script;

public class ForTests extends AbstractJSParserTest {

	public void testForWithoutPart1() {
		final StringList code = new StringList();
		code.add("var x = function() {");
		code.add("  for (;x<10;++x) {");
		code.add("	  return 10");
		code.add("	}");
		code.add("}");
		final Script script = parse(code.toString());
		assertFalse(reporter.hasErrors());
		ForStatement statement = uniqueResult(ASTUtil.select(script,
				ForStatement.class));
		assertTrue(statement.getInitial() instanceof EmptyExpression);
	}

	public void testForWithoutPart2() {
		final StringList code = new StringList();
		code.add("var x = function() {");
		code.add("  for (var x=1;;++x) {");
		code.add("	  return 10");
		code.add("	}");
		code.add("}");
		final Script script = parse(code.toString());
		assertFalse(reporter.hasErrors());
		ForStatement statement = uniqueResult(ASTUtil.select(script,
				ForStatement.class));
		assertTrue(statement.getCondition() instanceof EmptyExpression);
	}

	public void testForWithoutPart3() {
		final StringList code = new StringList();
		code.add("var x = function() {");
		code.add("  for (var x=1;x<10;) {");
		code.add("	  return 10");
		code.add("	}");
		code.add("}");
		final Script script = parse(code.toString());
		assertFalse(reporter.hasErrors());
		ForStatement statement = uniqueResult(ASTUtil.select(script,
				ForStatement.class));
		assertTrue(statement.getStep() instanceof EmptyExpression);
	}
}
