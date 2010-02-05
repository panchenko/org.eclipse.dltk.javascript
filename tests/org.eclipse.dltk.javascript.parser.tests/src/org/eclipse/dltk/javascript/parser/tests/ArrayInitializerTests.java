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
import org.eclipse.dltk.javascript.ast.ArrayInitializer;
import org.eclipse.dltk.javascript.ast.EmptyExpression;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;

public class ArrayInitializerTests extends AbstractJSParserTest {

	public void testSimple() {
		Script script = parse("var a = [1,2,3]");
		assertFalse(reporter.hasErrors());
		VariableDeclaration var = uniqueResult(ASTUtil.select(script,
				VariableDeclaration.class));
		ArrayInitializer array = (ArrayInitializer) var.getInitializer();
		assertEquals(3, array.getItems().size());
		assertDecimal("1", array.getItems().get(0));
		assertDecimal("2", array.getItems().get(1));
		assertDecimal("3", array.getItems().get(2));
	}

	public void testMissedValues() {
		Script script = parse("var a = [1,,3]");
		assertFalse(reporter.hasErrors());
		VariableDeclaration var = uniqueResult(ASTUtil.select(script,
				VariableDeclaration.class));
		ArrayInitializer array = (ArrayInitializer) var.getInitializer();
		assertEquals(3, array.getItems().size());
		assertDecimal("1", array.getItems().get(0));
		assertTrue(array.getItems().get(1) instanceof EmptyExpression);
		assertDecimal("3", array.getItems().get(2));
	}

}
