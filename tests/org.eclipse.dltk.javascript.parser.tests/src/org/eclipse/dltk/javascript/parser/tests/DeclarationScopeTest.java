/*******************************************************************************
 * Copyright (c) 2013 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.parser.tests;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.JSDeclaration;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.JavaScriptParserProblems;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DeclarationScopeTest extends AbstractJSParserTest {

	@Test
	public void functionDeclarationInStatementBlock() {
		final StringList code = new StringList();
		code.add("function test(x) {");
		code.add("  if (x) {");
		code.add("    function inner1() {}");
		code.add("    inner1();");
		code.add("  } else {");
		code.add("    function inner2() {}");
		code.add("    inner2();");
		code.add("  }");
		code.add("}");

		final Script script = parse(code.toString());
		final FunctionStatement testFunction = (FunctionStatement) uniqueResult(script
				.getDeclarations());
		final List<JSDeclaration> nestedDeclarations = testFunction
				.getDeclarations();
		assertEquals(2, nestedDeclarations.size());
		assertThat(nestedDeclarations.get(0),
				CoreMatchers.instanceOf(FunctionStatement.class));
		assertThat(nestedDeclarations.get(1),
				CoreMatchers.instanceOf(FunctionStatement.class));
	}

	@Test
	public void duplicateNestedFunctionDeclaration() {
		final StringList code = new StringList();
		code.add("function test(x) {");
		code.add("  if (x) {");
		code.add("    function inner() {}");
		code.add("  } else {");
		code.add("    function inner() {}");
		code.add("  }");
		code.add("  inner();");
		code.add("}");

		final Script script = parse(code.toString());

		final List<IProblem> problems = reporter.getProblems();
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptParserProblems.DUPLICATE_FUNCTION,
				problems.get(0).getID());

		final FunctionStatement testFunction = (FunctionStatement) uniqueResult(script
				.getDeclarations());
		final List<JSDeclaration> nestedDeclarations = testFunction
				.getDeclarations();
		assertEquals(2, nestedDeclarations.size());
		assertThat(nestedDeclarations.get(0),
				CoreMatchers.instanceOf(FunctionStatement.class));
		assertThat(nestedDeclarations.get(1),
				CoreMatchers.instanceOf(FunctionStatement.class));
	}

}
