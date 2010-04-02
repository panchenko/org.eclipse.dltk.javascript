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
package org.eclipse.dltk.javascript.core.tests.validation;

import java.util.List;

import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.internal.javascript.validation.TypeInfoValidator;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;

@SuppressWarnings("nls")
public class TypeInfoValidationTests extends AbstractValidationTest {

	@Override
	protected IBuildParticipant createValidator() {
		return new TypeInfoValidator();
	}

	public void testKnownType() {
		final List<IProblem> problems = validate("var x:String");
		assertTrue(problems.isEmpty());
	}

	public void testUnknownType() {
		final List<IProblem> problems = validate("var x:LongString");
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(0).getID());
	}

	public void testDeprecatedType() {
		final List<IProblem> problems = validate("var x:ExampleService2");
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.DEPRECATED_TYPE, problems.get(0)
				.getID());
	}

	public void testValidMethodCall() {
		StringList code = new StringList();
		code.add("var x:ExampleService");
		code.add("x.execute()");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.isEmpty());
	}

	public void testUndefinedMethodCall() {
		StringList code = new StringList();
		code.add("var x:ExampleService");
		code.add("x.run()");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_METHOD, problems.get(0)
				.getID());
	}

	public void testMethodCallWrongParamCount() {
		StringList code = new StringList();
		code.add("var x:ExampleService");
		code.add("x.execute(1)");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_PARAMETER_COUNT, problems.get(0)
				.getID());
	}

	public void testDeprecatedMethodCall() {
		StringList code = new StringList();
		code.add("var x:ExampleService");
		code.add("x.executeCompatible()");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.DEPRECATED_METHOD, problems.get(0)
				.getID());
	}

	public void testDeprecatedMethodCall_TypeInference() {
		StringList code = new StringList();
		code.add("var x:ExampleService");
		code.add("var q = x.execute().service");
		code.add("q.executeCompatible()");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.DEPRECATED_METHOD, problems.get(0)
				.getID());
	}

	public void testPropertyAccess() {
		StringList code = new StringList();
		code.add("var x:ExampleService");
		code.add("var name = x.name");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.isEmpty());
	}

	public void testDeprecatedPropertyAccess() {
		StringList code = new StringList();
		code.add("var x:ExampleService");
		code.add("var name = x.nameCompatible");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.DEPRECATED_PROPERTY, problems.get(0)
				.getID());
	}

	public void testDeprecatedTopLevelProperty() {
		StringList code = new StringList();
		code.add("myExampleForms.service");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.DEPRECATED_PROPERTY, problems.get(0)
				.getID());
		assertTrue(problems.get(0).getMessage().contains("myExampleForms"));
	}

	public void testUndefinedPropertyAccess() {
		StringList code = new StringList();
		code.add("var x:ExampleService");
		code.add("var name = x.noname");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_PROPERTY, problems.get(0)
				.getID());
	}

	public void testMethodAsPropertyAccess() {
		StringList code = new StringList();
		code.add("var x:ExampleService");
		code.add("var name = x.execute");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.isEmpty());
	}

	public void testElementResolver() {
		StringList code = new StringList();
		code.add("exampleForms.service.name");
		code.add("exampleForms.service.nameCompatible");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.DEPRECATED_PROPERTY, problems.get(0)
				.getID());
	}

}
