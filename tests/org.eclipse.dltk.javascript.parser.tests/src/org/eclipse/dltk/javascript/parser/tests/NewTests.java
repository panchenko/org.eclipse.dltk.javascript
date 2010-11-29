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
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.NewExpression;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.parser.PropertyExpressionUtils;

public class NewTests extends AbstractJSParserTest {

	public void testNewIdentifier() {
		Script script = parse("var x = new a()");
		assertFalse(reporter.hasErrors());
		VariableDeclaration var = uniqueResult(ASTUtil.select(script,
				VariableDeclaration.class));
		NewExpression newExpr = (NewExpression) var.getInitializer();
		CallExpression call = (CallExpression) newExpr.getObjectClass();
		assertEquals("a", PropertyExpressionUtils.getPath(call.getExpression()));
		assertIdentifier("a", call.getExpression());
	}

	public void testNewPath2() {
		Script script = parse("var x = new a.b()");
		assertFalse(reporter.hasErrors());
		VariableDeclaration var = uniqueResult(ASTUtil.select(script,
				VariableDeclaration.class));
		NewExpression newExpr = (NewExpression) var.getInitializer();
		CallExpression call = (CallExpression) newExpr.getObjectClass();
		assertEquals("a.b",
				PropertyExpressionUtils.getPath(call.getExpression()));
		PropertyExpression property = (PropertyExpression) call.getExpression();
		assertIdentifier("a", property.getObject());
		assertIdentifier("b", property.getProperty());
	}

	public void testNewPath3() {
		Script script = parse("var x = new a.b.c()");
		assertFalse(reporter.hasErrors());
		VariableDeclaration var = uniqueResult(ASTUtil.select(script,
				VariableDeclaration.class));
		NewExpression newExpr = (NewExpression) var.getInitializer();
		CallExpression call = (CallExpression) newExpr.getObjectClass();
		assertEquals("a.b.c",
				PropertyExpressionUtils.getPath(call.getExpression()));
		PropertyExpression property = (PropertyExpression) call.getExpression();
		PropertyExpression property2 = (PropertyExpression) property
				.getObject();
		assertIdentifier("a", property2.getObject());
		assertIdentifier("b", property2.getProperty());
		assertIdentifier("c", property.getProperty());
	}

	public void testNewNew() {
		Script script = parse("var x = new new A()()");
		assertFalse(reporter.hasErrors());
		VariableDeclaration var = uniqueResult(ASTUtil.select(script,
				VariableDeclaration.class));
		NewExpression newExpr1 = (NewExpression) var.getInitializer();
		CallExpression call1 = (CallExpression) newExpr1.getObjectClass();
		NewExpression new2 = (NewExpression) call1.getExpression();
		CallExpression call2 = (CallExpression) new2.getObjectClass();
		assertIdentifier("A", call2.getExpression());
	}
}
