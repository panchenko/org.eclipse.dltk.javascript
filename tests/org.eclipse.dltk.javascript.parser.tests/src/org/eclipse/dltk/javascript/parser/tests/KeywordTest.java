/*******************************************************************************
 * Copyright (c) 2014 Alex Panchenko
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Alex Panchenko - initial API and Implementation
 *******************************************************************************/
package org.eclipse.dltk.javascript.parser.tests;

import org.eclipse.dltk.ast.utils.ASTUtil;
import org.eclipse.dltk.javascript.ast.BinaryOperation;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.ObjectInitializer;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.parser.PropertyExpressionUtils;

public class KeywordTest extends AbstractJSParserTest {

	public void testDeleteAsPropertyExpression() {
		Script script = parse("a.delete = function(){}");
		assertFalse(reporter.hasErrors());
		BinaryOperation assignment = uniqueResult(ASTUtil.select(script,
				BinaryOperation.class));
		assertEquals("a.delete",
				PropertyExpressionUtils.getPath(assignment.getLeftExpression()));
		assertTrue(assignment.getRightExpression() instanceof FunctionStatement);
	}

	public void testDeleteInObjectLiteral() {
		final Script script = parse("var keywords={delete:1}");
		assertFalse(reporter.hasErrors());
		final VariableDeclaration var = uniqueResult(ASTUtil.select(script,
				VariableDeclaration.class));
		final ObjectInitializer object = (ObjectInitializer) var
				.getInitializer();
		assertEquals(1, object.getInitializers().size());
		assertIdentifier("delete",
				object.getPropertyInitializers()[0].getName());
		assertDecimal("1", object.getPropertyInitializers()[0].getValue());
	}
}
