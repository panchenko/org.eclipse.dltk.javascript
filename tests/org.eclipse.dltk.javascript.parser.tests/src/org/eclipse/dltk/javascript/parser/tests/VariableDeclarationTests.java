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
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.StringLiteral;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.ast.VariableStatement;

public class VariableDeclarationTests extends AbstractJSParserTest {

	private static final String VAR_X = "var x";
	private static final String VAR_X_STRING = VAR_X + ":String";
	private static final String VAR_X_STRING_INIT = VAR_X_STRING + "='YES'";

	public void testSimpleVarDeclaration() {
		Script script = parse(VAR_X);
		assertFalse(reporter.hasErrors());
		VariableStatement vars = uniqueResult(ASTUtil.select(script,
				VariableStatement.class));
		VariableDeclaration var0 = uniqueResult(vars.getVariables());
		assertEquals("x", var0.getVariableName());
		assertNull(var0.getType());
		assertNull(var0.getInitializer());
	}

	public void testTypedVarDeclarationDisabled() {
		Script script = parse(VAR_X_STRING);
		assertTrue(reporter.hasErrors());
		VariableStatement vars = uniqueResult(ASTUtil.select(script,
				VariableStatement.class));
		VariableDeclaration var0 = uniqueResult(vars.getVariables());
		assertEquals("x", var0.getVariableName());
		assertNull(var0.getType());
		assertNull(var0.getInitializer());
	}

	public void testTypedVar2DeclarationDisabled() {
		Script script = parse(VAR_X_STRING + "," + "y:String");
		assertTrue(reporter.hasErrors());
		VariableStatement vars = uniqueResult(ASTUtil.select(script,
				VariableStatement.class));
		assertEquals(2, vars.getVariables().size());

		assertEquals("x", vars.getVariables().get(0).getVariableName());
		assertNull(vars.getVariables().get(0).getType());
		assertNull(vars.getVariables().get(0).getInitializer());

		assertEquals("y", vars.getVariables().get(1).getVariableName());
		assertNull(vars.getVariables().get(1).getType());
		assertNull(vars.getVariables().get(1).getInitializer());
	}

	public void testTypedVarDeclaration() {
		parser.setTypeInformationEnabled(true);
		Script script = parse(VAR_X_STRING);
		assertFalse(reporter.hasErrors());
		VariableStatement vars = uniqueResult(ASTUtil.select(script,
				VariableStatement.class));
		VariableDeclaration var0 = uniqueResult(vars.getVariables());
		assertEquals("x", var0.getVariableName());
		assertEquals("String", var0.getType().getName());
		assertNull(var0.getInitializer());
	}

	public void testTypedVarDeclarationInitializer() {
		parser.setTypeInformationEnabled(true);
		Script script = parse(VAR_X_STRING_INIT);
		assertFalse(reporter.hasErrors());
		VariableStatement vars = uniqueResult(ASTUtil.select(script,
				VariableStatement.class));
		VariableDeclaration var0 = uniqueResult(vars.getVariables());
		assertEquals("x", var0.getVariableName());
		assertEquals("String", var0.getType().getName());
		assertNotNull(var0.getInitializer());
		assertEquals("'YES'", ((StringLiteral) var0.getInitializer()).getText());
	}
}
