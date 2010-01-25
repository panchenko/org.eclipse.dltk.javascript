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
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.VariableStatement;

public class VariableDeclarationTests extends AbstractJSParserTest {

	public void testSimpleVarDeclaration() {
		Script script = parse("var x");
		assertFalse(reporter.hasErrors());
	}

	public void testTypedVarDeclaration() {
		String code = "var x:String";
		Script script = parse(code);
		assertTrue(reporter.hasErrors());
		List<VariableStatement> vars = ASTUtil.select(script,
				VariableStatement.class);
		assertEquals(1, vars.size());
		VariableStatement var0 = vars.get(0);
		assertEquals(1, var0.getVariables().size());
		assertEquals("x", var0.getVariables().get(0).getVariableName());
		parser.setTypeInformationEnabled(true);
		script = parse(code);
		assertFalse(reporter.hasErrors());
		vars = ASTUtil.select(script, VariableStatement.class);
		assertEquals(1, vars.size());
	}

}
