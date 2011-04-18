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
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.ast.VariableStatement;

public class VariableDeclarationTests extends AbstractJSParserTest {

	private static final String VAR_X = "var x";

	public void testSimpleVarDeclaration() {
		Script script = parse(VAR_X);
		assertFalse(reporter.hasErrors());
		VariableStatement vars = uniqueResult(ASTUtil.select(script,
				VariableStatement.class));
		VariableDeclaration var0 = uniqueResult(vars.getVariables());
		assertEquals("x", var0.getVariableName());
		assertNull(var0.getInitializer());
	}

}
