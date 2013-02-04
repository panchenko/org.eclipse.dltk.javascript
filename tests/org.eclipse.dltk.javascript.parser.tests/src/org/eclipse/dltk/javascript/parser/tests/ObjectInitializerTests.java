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

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.eclipse.dltk.ast.utils.ASTUtil;
import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.ast.ErrorExpression;
import org.eclipse.dltk.javascript.ast.ObjectInitializer;
import org.eclipse.dltk.javascript.ast.PropertyInitializer;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.parser.JavaScriptParserProblems;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ObjectInitializerTests extends AbstractJSParserTest {

	@Test
	public void testSimple() {
		final Script script = parse("var z = {a:1,b:2,c:3}");
		assertFalse(reporter.hasErrors());
		final VariableDeclaration var = uniqueResult(ASTUtil.select(script,
				VariableDeclaration.class));
		final ObjectInitializer obj = (ObjectInitializer) var.getInitializer();
		assertEquals(3, obj.getInitializers().size());
		final PropertyInitializer p1 = (PropertyInitializer) obj
				.getInitializers().get(0);
		assertIdentifier("a", p1.getName());
		assertDecimal("1", p1.getValue());
		final PropertyInitializer p2 = (PropertyInitializer) obj
				.getInitializers().get(1);
		assertIdentifier("b", p2.getName());
		assertDecimal("2", p2.getValue());
		final PropertyInitializer p3 = (PropertyInitializer) obj
				.getInitializers().get(2);
		assertIdentifier("c", p3.getName());
		assertDecimal("3", p3.getValue());
	}

	@Test
	public void testExtraComma() {
		final Script script = parse("var z = {a:1,b:2,}");
		assertFalse(reporter.hasErrors());
		final VariableDeclaration var = uniqueResult(ASTUtil.select(script,
				VariableDeclaration.class));
		final ObjectInitializer obj = (ObjectInitializer) var.getInitializer();
		assertEquals(2, obj.getInitializers().size());
		final PropertyInitializer p1 = (PropertyInitializer) obj
				.getInitializers().get(0);
		assertIdentifier("a", p1.getName());
		assertDecimal("1", p1.getValue());
		final PropertyInitializer p2 = (PropertyInitializer) obj
				.getInitializers().get(1);
		assertIdentifier("b", p2.getName());
		assertDecimal("2", p2.getValue());
	}

	@Test
	public void testTrailingComma() {
		StringList code = new StringList();
		code.add(" var obj = { a:b,b:c,}");
		parse(code.toString());
		assertEquals(
				JavaScriptParserProblems.TRAILING_COMMA_OBJECT_INITIALIZER,
				getProblemId());
	}

	@Test
	public void errorRecoveryMissingComma1() {
		final String code = "var x = { a:1 b:2, c:3}";
		final Script script = parse(code);
		assertEquals(reporter.getProblems().toString(), 1, reporter
				.getProblems().size());
		final IProblem problem = reporter.getProblems().get(0);
		assertEquals(JavaScriptParserProblems.SYNTAX_ERROR, problem.getID());
		assertEquals(code.indexOf('b'), problem.getSourceStart());
		final VariableDeclaration var = uniqueResult(ASTUtil.select(script,
				VariableDeclaration.class));
		final ObjectInitializer obj = (ObjectInitializer) var.getInitializer();
		assertEquals(3, obj.getInitializers().size());
		final PropertyInitializer[] pi = obj.getPropertyInitializers();
		{
			assertIdentifier("a", pi[0].getName());
			assertDecimal("1", pi[0].getValue());
		}
		{
			assertIdentifier("b", pi[1].getName());
			assertDecimal("2", pi[1].getValue());
		}
		{
			assertIdentifier("c", pi[2].getName());
			assertDecimal("3", pi[2].getValue());
		}
	}

	@Test
	public void errorRecoveryMissingComma2() {
		final String code = "var x = { a:1, b:2 c:3}";
		final Script script = parse(code);
		assertEquals(reporter.getProblems().toString(), 1, reporter
				.getProblems().size());
		final IProblem problem = reporter.getProblems().get(0);
		assertEquals(JavaScriptParserProblems.SYNTAX_ERROR, problem.getID());
		assertEquals(code.indexOf('c'), problem.getSourceStart());
		final VariableDeclaration var = uniqueResult(ASTUtil.select(script,
				VariableDeclaration.class));
		final ObjectInitializer obj = (ObjectInitializer) var.getInitializer();
		assertEquals(3, obj.getInitializers().size());
		final PropertyInitializer[] pi = obj.getPropertyInitializers();
		{
			assertIdentifier("a", pi[0].getName());
			assertDecimal("1", pi[0].getValue());
		}
		{
			assertIdentifier("b", pi[1].getName());
			assertDecimal("2", pi[1].getValue());
		}
		{
			assertIdentifier("c", pi[2].getName());
			assertDecimal("3", pi[2].getValue());
		}
	}

	@Test
	public void errorRecoveryAdditionalIdentifier() {
		final String code = "var x = { a:1, b c:3}";
		final Script script = parse(code);
		assertEquals(reporter.getProblems().toString(), 1, reporter
				.getProblems().size());
		final IProblem problem = reporter.getProblems().get(0);
		assertEquals(JavaScriptParserProblems.SYNTAX_ERROR, problem.getID());
		assertEquals(code.indexOf('c'), problem.getSourceStart());
		final VariableDeclaration var = uniqueResult(ASTUtil.select(script,
				VariableDeclaration.class));
		final ObjectInitializer obj = (ObjectInitializer) var.getInitializer();
		assertEquals(2, obj.getInitializers().size());
		final PropertyInitializer[] pi = obj.getPropertyInitializers();
		{
			assertIdentifier("a", pi[0].getName());
			assertDecimal("1", pi[0].getValue());
		}
		{
			assertIdentifier("b", pi[1].getName());
			assertDecimal("3", pi[1].getValue());
		}
	}

	@Test
	public void errorRecoveryMissingValue1() {
		final String code = "var x = { a: b:2, c:3}";
		final Script script = parse(code);
		assertEquals(reporter.getProblems().toString(), 1, reporter
				.getProblems().size());
		final IProblem problem = reporter.getProblems().get(0);
		assertEquals(JavaScriptParserProblems.SYNTAX_ERROR, problem.getID());
		assertEquals(code.indexOf(":2"), problem.getSourceStart());
		final VariableDeclaration var = uniqueResult(ASTUtil.select(script,
				VariableDeclaration.class));
		final ObjectInitializer obj = (ObjectInitializer) var.getInitializer();
		assertEquals(3, obj.getInitializers().size());
		final PropertyInitializer[] pi = obj.getPropertyInitializers();
		{
			assertIdentifier("a", pi[0].getName());
			assertThat(pi[0].getValue(), instanceOf(ErrorExpression.class));
		}
		{
			assertIdentifier("b", pi[1].getName());
			assertDecimal("2", pi[1].getValue());
		}
		{
			assertIdentifier("c", pi[2].getName());
			assertDecimal("3", pi[2].getValue());
		}
	}

	@Test
	public void errorRecoveryMissingValue2() {
		final String code = "var x = { a: {}:2, c:3}";
		final Script script = parse(code);
		assertEquals(reporter.getProblems().toString(), 1, reporter
				.getProblems().size());
		final IProblem problem = reporter.getProblems().get(0);
		assertEquals(JavaScriptParserProblems.SYNTAX_ERROR, problem.getID());
		assertEquals(code.indexOf(":2"), problem.getSourceStart());
		final VariableDeclaration var = uniqueResult(ASTUtil.select(script,
				VariableDeclaration.class));
		final ObjectInitializer obj = (ObjectInitializer) var.getInitializer();
		assertEquals(2, obj.getInitializers().size());
		final PropertyInitializer[] pi = obj.getPropertyInitializers();
		{
			assertIdentifier("a", pi[0].getName());
			assertThat(pi[0].getValue(), instanceOf(ObjectInitializer.class));
		}
		{
			assertIdentifier("c", pi[1].getName());
			assertDecimal("3", pi[1].getValue());
		}
	}

}
