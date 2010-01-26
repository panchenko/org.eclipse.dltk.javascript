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
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.VariableStatement;

public class VariableDeclarationTests extends AbstractJSParserTest {

	private static final String VAR_X = "var x";
	private static final String VAR_X_STRING = VAR_X + ":String";
	private static final String VAR_X_STRING_INIT = VAR_X_STRING + "='YES'";

	public void testSimpleVarDeclaration() {
		Script script = parse(VAR_X);
		assertFalse(reporter.hasErrors());
	}

	public void testTypedVarDeclarationDisabled() {
		Script script = parse(VAR_X_STRING);
		assertTrue(reporter.hasErrors());
		List<VariableStatement> vars = ASTUtil.select(script,
				VariableStatement.class);
		assertEquals(1, vars.size());
		VariableStatement var0 = vars.get(0);
		assertEquals(1, var0.getVariables().size());
		assertEquals("x", var0.getVariables().get(0).getVariableName());
	}

	public void testTypedVarDeclaration() {
		parser.setTypeInformationEnabled(true);
		Script script = parse(VAR_X_STRING);
		assertFalse(reporter.hasErrors());
		List<VariableStatement> vars = ASTUtil.select(script,
				VariableStatement.class);
		assertEquals(1, vars.size());
	}

	public void testTypedVarDeclarationInitializer() {
		parser.setTypeInformationEnabled(true);
		Script script = parse(VAR_X_STRING_INIT);
		assertFalse(reporter.hasErrors());
		List<VariableStatement> vars = ASTUtil.select(script,
				VariableStatement.class);
		assertEquals(1, vars.size());
	}
}
