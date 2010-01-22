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

import junit.framework.TestCase;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.utils.ASTUtil;
import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.compiler.problem.ProblemCollector;
import org.eclipse.dltk.javascript.ast.BinaryOperation;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.ast.XmlExpressionFragment;
import org.eclipse.dltk.javascript.ast.XmlLiteral;
import org.eclipse.dltk.javascript.ast.XmlTextFragment;
import org.eclipse.dltk.javascript.parser.JSProblem;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;

@SuppressWarnings("nls")
public class XmlLiteralTests extends TestCase {

	protected final ProblemCollector reporter = new ProblemCollector();

	protected Script parse(final String source) {
		reporter.reset();
		final Script script = new JavaScriptParser().parse(source, reporter);
		assertNotNull(script);
		for (IProblem problem : reporter.getProblems()) {
			assertFalse(problem.getMessage(), problem instanceof JSProblem);
		}
		return script;
	}

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
		final List<VariableDeclaration> declarations = ASTUtil.select(script,
				VariableDeclaration.class);
		assertEquals(1, declarations.size());
		final List<ASTNode> vars = declarations.get(0).getVariables();
		assertEquals(1, vars.size());
		BinaryOperation var0 = (BinaryOperation) vars.get(0);
		assertEquals("x", ((Identifier) var0.getLeftExpression()).getName());
		final XmlLiteral literal = (XmlLiteral) var0.getRightExpression();
		assertEquals(3, literal.getFragments().size());
		assertTrue(literal.getFragments().get(0) instanceof XmlTextFragment);
		assertTrue(literal.getFragments().get(1) instanceof XmlExpressionFragment);
		assertTrue(literal.getFragments().get(2) instanceof XmlTextFragment);
	}
}
