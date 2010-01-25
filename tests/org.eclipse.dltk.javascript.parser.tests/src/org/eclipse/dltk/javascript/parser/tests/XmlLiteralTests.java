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
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.ast.VariableStatement;
import org.eclipse.dltk.javascript.ast.XmlExpressionFragment;
import org.eclipse.dltk.javascript.ast.XmlLiteral;
import org.eclipse.dltk.javascript.ast.XmlTextFragment;

@SuppressWarnings("nls")
public class XmlLiteralTests extends AbstractJSParserTest {

	public void testXmlLiteralSimple() {
		parse("var x = <xml/>;");
		assertFalse(reporter.hasErrors());
	}

	public void testXmlLiteralTextContent() {
		parse("var x = <xml>CONTENT</xml>;");
		assertFalse(reporter.hasErrors());
	}

	public void testXmlLiteralAttributes() {
		parse("var x = <xml a='1' b='2'>CONTENT</xml>;");
		assertFalse(reporter.hasErrors());
	}

	public void testXmlLiteralExpressions() throws Exception {
		Script script = parse("var x = <xml>{value}</xml>;");
		assertFalse(reporter.getErrors().toString(), reporter.hasErrors());
		List<?> statements = script.getStatements();
		assertEquals(1, statements.size());
		final List<VariableStatement> declarations = ASTUtil.select(script,
				VariableStatement.class);
		assertEquals(1, declarations.size());
		final List<VariableDeclaration> vars = declarations.get(0)
				.getVariables();
		assertEquals(1, vars.size());
		VariableDeclaration var0 = vars.get(0);
		assertEquals("x", var0.getVariableName().getName());
		final XmlLiteral literal = (XmlLiteral) var0.getInitializer();
		assertEquals(3, literal.getFragments().size());
		assertTrue(literal.getFragments().get(0) instanceof XmlTextFragment);
		assertTrue(literal.getFragments().get(1) instanceof XmlExpressionFragment);
		assertTrue(literal.getFragments().get(2) instanceof XmlTextFragment);
	}
}
