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

import static java.util.Collections.singleton;
import static org.eclipse.dltk.core.tests.TestSupport.notYetImplemented;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.internal.javascript.validation.ValidationMessages;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.core.tests.AbstractValidationTest;

@SuppressWarnings({ "nls", "restriction" })
public class TypeInfoValidationTests extends AbstractValidationTest {

	@Override
	protected IBuildParticipant createValidator() {
		return new TestTypeInfoValidator();
	}

	public void testKnownType() {
		final List<IProblem> problems = validate("/** @type String */ var x");
		assertTrue(problems.isEmpty());
	}

	public void testUnknownType() {
		final List<IProblem> problems = validate("/** @type LongString */ var x");
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(0).getID());
	}

	public void testUnknownJavaScriptFunctionType() {
		final List<IProblem> problems = validate("var x = new LongString()");
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNDECLARED_VARIABLE, problems.get(0)
				.getID());
	}

	public void testUnknownJavaScriptFunctionCall() {
		final List<IProblem> problems = validate("var x = longString()");
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_FUNCTION, problems.get(0)
				.getID());
	}

	public void testUnknownJavaScriptFunctionCallOnObject() {
		StringList code = new StringList();
		code.add("var x = new Object();");
		code.add("x.longString();");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_METHOD, problems.get(0)
				.getID());
	}

	public void testDeprecatedType() {
		final List<IProblem> problems = validate("/** @type ExampleService2 */ var x");
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.DEPRECATED_TYPE, problems.get(0)
				.getID());
	}

	public void testDeprecatedTypeInNew() {
		final List<IProblem> problems = validate("var x = new ExampleService2();");
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.DEPRECATED_TYPE, problems.get(0)
				.getID());
	}

	public void testDeprecatedTypeInInstanceOf() {
		final StringList code = new StringList();
		code.add("var x = null;");
		code.add("var valid = x instanceof ExampleService2;");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.DEPRECATED_TYPE, problems.get(0)
				.getID());
	}

	public void testValidMethodCall() {
		StringList code = new StringList();
		code.add("/** @type ExampleService */");
		code.add("var x");
		code.add("x.execute()");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.isEmpty());
	}

	public void testUndefinedMethodCall() {
		StringList code = new StringList();
		code.add("/** @type ExampleService */");
		code.add("var x");
		code.add("x.runUndefindMethod()");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_JAVA_METHOD, problems.get(0)
				.getID());
	}

	public void testMethodOverload1() {
		StringList code = new StringList();
		code.add("/** @type ExampleService */");
		code.add("var x");
		code.add("x.run()");
		code.add("x.run('Hello')");
		code.add("x.run('Hello','World')");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.toString(), problems.isEmpty());
	}

	public void testMethodOverload2() {
		StringList code = new StringList();
		code.add("/** @type ExampleService */");
		code.add("var x");
		code.add("x.run('Hello','World','!')");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_JAVA_PARAMETERS, problems.get(0)
				.getID());
	}

	public void testMethodCallWrongParamCount() {
		StringList code = new StringList();
		code.add("/** @type ExampleService */");
		code.add("var x");
		code.add("x.execute(1)");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_JAVA_PARAMETERS, problems.get(0)
				.getID());
	}

	public void testDeprecatedMethodCall() {
		StringList code = new StringList();
		code.add("/** @type ExampleService */");
		code.add("var x");
		code.add("x.executeCompatible()");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.DEPRECATED_METHOD, problems.get(0)
				.getID());
	}

	public void testDeprecatedMethodCall_TypeInference() {
		StringList code = new StringList();
		code.add("/** @type ExampleService */");
		code.add("var x");
		code.add("var q = x.execute().service");
		code.add("q.executeCompatible()");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.DEPRECATED_METHOD, problems.get(0)
				.getID());
	}

	public void testPropertyAccess() {
		StringList code = new StringList();
		code.add("/** @type ExampleService */");
		code.add("var x");
		code.add("var name = x.name");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.isEmpty());
	}

	public void testDeprecatedPropertyAccess() {
		StringList code = new StringList();
		code.add("/** @type ExampleService */");
		code.add("var x");
		code.add("var name = x.nameCompatible");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.DEPRECATED_PROPERTY, problems.get(0)
				.getID());
	}

	public void testDeprecatedUntypedPropertyAccess() {
		StringList code = new StringList();
		code.add("/** @type {WithUntypedProperty} */");
		code.add("var x");
		code.add("var name = x.untyped");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
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

	public void testFunctionHidesPoperty() {
		StringList code = new StringList();
		code.add("function exampleForms(){}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.FUNCTION_HIDES_VARIABLE, problems
				.get(0).getID());
		assertTrue(problems.get(0).getMessage().contains("exampleForms"));
	}

	public void testFunctionDoesntHidesAllowHidePoperty() {
		StringList code = new StringList();
		code.add("function exampleFormsHide(){}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testVarHidesXMLType() {
		StringList code = new StringList();
		code.add("var XML = 1");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		// TODO (alex) introduce special problem id
		assertEquals(JavaScriptProblems.DUPLICATE_VAR_DECLARATION, problems
				.get(0).getID());
	}

	public void testUndefinedPropertyAccess() {
		StringList code = new StringList();
		code.add("/** @type ExampleService */");
		code.add("var x");
		code.add("var name = x.noname");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_JAVA_PROPERTY, problems
				.get(0).getID());
	}

	public void testUndefinedTypePropertyAccess() {
		StringList code = new StringList();
		code.add("/** @type PersonClassIsNotDefined */");
		code.add("var person");
		code.add("var name = person.name");
		code.add("var address = person.address");
		final List<IProblem> problems = new ArrayList<IProblem>(
				validate(code.toString()));
		Collections.sort(problems, new Comparator<IProblem>() {
			public int compare(IProblem o1, IProblem o2) {
				return o1.getSourceStart() - o2.getSourceStart();
			}
		});
		assertEquals(problems.toString(), 3, problems.size());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(0).getID());
		assertEquals(JavaScriptProblems.UNDEFINED_PROPERTY, problems.get(1)
				.getID());
		assertEquals(JavaScriptProblems.UNDEFINED_PROPERTY, problems.get(2)
				.getID());
	}

	public void testUndefinedPropertyAssignment() {
		StringList code = new StringList();
		code.add("/** @type ExampleService */");
		code.add("var x");
		code.add("x.noname = true");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_JAVA_PROPERTY, problems
				.get(0).getID());
	}

	public void testUndefinedVariableAssignment() {
		StringList code = new StringList();
		code.add("x.noname = true");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.UNDECLARED_VARIABLE, problems.get(0)
				.getID());
	}

	public void testPropertyAssignment() {
		StringList code = new StringList();
		code.add("var x = { }");
		code.add("x.noname = true");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testPropertyNullAssignment() {
		StringList code = new StringList();
		code.add("var x = { }");
		code.add("x.noname = null");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testPropertyAssignmentInIfBranch() {
		StringList code = new StringList();
		code.add("var condition = false;");
		code.add("if (condition) {");
		code.add("var x = { }");
		code.add("x.noname = true");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testPropertyNullAssignmentInIfBranch() {
		StringList code = new StringList();
		code.add("var condition = false;");
		code.add("if (condition) {");
		code.add("var x = { }");
		code.add("x.noname = null");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testMethodAsPropertyAccess() {
		StringList code = new StringList();
		code.add("/** @type ExampleService */");
		code.add("var x");
		code.add("var name = x.execute");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.toString(), problems.isEmpty());
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

	public void testFunctionCallWithCorrectFunctionObjectArgument() {
		StringList code = new StringList();
		code.add("function Node1() {");
		code.add("this.a=10;");
		code.add("}");
		code.add("function Node2() {");
		code.add("this.a=10;");
		code.add("}");
		code.add("/** @param {Node1} arg */");
		code.add("function call(arg){");
		code.add("}");
		code.add("function test(){");
		code.add("call(new Node1());");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testFunctionCallWithInCorrectFunctionObjectArgument() {
		StringList code = new StringList();
		code.add("function Node1() {");
		code.add("this.a=10;");
		code.add("}");
		code.add("function Node2() {");
		code.add("this.a=10;");
		code.add("}");
		code.add("/** @param {Node1} arg */");
		code.add("function call(arg){");
		code.add("}");
		code.add("function test(){");
		code.add("call(new Node2());");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
	}

	public void testFunctionCallWithCorrectFunctionObjectArgumentJSDOC() {
		StringList code = new StringList();
		code.add("function Node1() {");
		code.add("this.a=10;");
		code.add("}");
		code.add("function Node2() {");
		code.add("this.a=10;");
		code.add("}");
		code.add("/**");
		code.add(" * @param {Node1} arg");
		code.add(" */");
		code.add("function call(arg){");
		code.add("}");
		code.add("function test(){");
		code.add("call(new Node1());");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testFunctionCallWithInCorrectFunctionObjectArgumentJSDOC() {
		StringList code = new StringList();
		code.add("function Node1() {");
		code.add("this.a=10;");
		code.add("}");
		code.add("function Node2() {");
		code.add("this.a=10;");
		code.add("}");
		code.add("/**");
		code.add(" * @param {Node1} arg");
		code.add(" */");
		code.add("function call(arg){");
		code.add("}");
		code.add("function test(){");
		code.add("call(new Node2());");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
	}

	public void testLazyVariableWithAssignment() {
		StringList code = new StringList();
		code.add("function Node1() {");
		code.add("myVar = 10;");
		code.add("}");
		code.add("var myVar = 10;");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testLazyVariableWithAssignmentAndAddition() {
		StringList code = new StringList();
		code.add("function Node1() {");
		code.add("myVar += 10;");
		code.add("}");
		code.add("var myVar = 10;");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testLazyJSObject() {
		StringList code = new StringList();
		code.add("var x = new function x(){");
		code.add("this.newNode = function newNode(){");
		code.add("return new Node()");
		code.add("}");
		code.add("function Node() {");
		code.add("this.a=10;");
		code.add("}");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testReturnType() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @return {String}");
		code.add(" */");
		code.add("function test() {");
		code.add("	return '';");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testReturnType2() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @param {ExampleService} srv");
		code.add(" * @return {ExampleService}");
		code.add(" */");
		code.add("function test(srv) {");
		code.add("	return srv;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testReturnWrongType() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @return {String}");
		code.add(" */");
		code.add("function test() {");
		code.add("	return 1;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(
				JavaScriptProblems.DECLARATION_MISMATCH_ACTUAL_RETURN_TYPE,
				problems.get(0).getID());
	}

	public void testReturnNull() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @return {String}");
		code.add(" */");
		code.add("function test() {");
		code.add("	return null;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testReturnTypeDeclaredAndThrow() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @return {String}");
		code.add(" */");
		code.add("function test() {");
		code.add("	throw 1;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testLazyReturnTypeWithJSDocParam() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @param {Node} node");
		code.add(" */");
		code.add("function addChild(node) {");
		code.add("	return node;");
		code.add("}");
		code.add("function TestObject() {");
		code.add("	var x = addChild(new Node());");
		code.add("	x.a;");
		code.add("}");
		code.add("function Node() {");
		code.add("	this.a = 10;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testLazyReturnTypeWithTypeInfo() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @param {Node} node");
		code.add(" */");
		code.add("function addChild(node) {");
		code.add("	return node;");
		code.add("}");
		code.add("function TestObject() {");
		code.add("	var x = addChild(new Node());");
		code.add("	x.a;");
		code.add("}");
		code.add("function Node() {");
		code.add("	this.a = 10;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testLazyReturnTypeWithNoTypeParamInfo() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @param node");
		code.add(" */");
		code.add("function addChild(node) {");
		code.add("	return node;");
		code.add("}");
		code.add("function TestObject() {");
		code.add("	var x = addChild(new Node());");
		code.add("	var y = x.a;");
		code.add("}");
		code.add("function Node() {");
		code.add("	this.a = 10;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
	}

	public void testReturnFunction() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @return {function(String)}");
		code.add(" */");
		code.add("function test() {");
		code.add("	return function(s) { return s;}");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testReturnFunctionWrong() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @return {function(String)}");
		code.add(" */");
		code.add("function test() {");
		code.add("	return 1;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
	}

	public void testLazyTypeWithAssignment() {
		StringList code = new StringList();
		code.add("function Node() {");
		code.add("	this.nummer = 10;");
		code.add("}");
		code.add("function testNode() {");
		code.add("	returnNode().nummer = 11;");
		code.add("}");
		code.add("function returnNode() {");
		code.add("	return new Node();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testLazyInnerReference() {
		StringList code = new StringList();
		code.add("var NUM = function() {");
		code.add("  /** @return {Number} */");
		code.add("  var q = function() {");
		code.add("    return new NUM();");
		code.add("  }");
		code.add("  return Number;");
		code.add("}()");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testLazyInnerReference1() {
		StringList code = new StringList();
		code.add("var NUM");
		code.add("NUM = function() {");
		code.add("  /** @return {Number} */");
		code.add("  var q = function() {");
		code.add("    return new NUM();");
		code.add("  }");
		code.add("  return Number;");
		code.add("}()");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testGenericParamWtihNoneGenericCall() {
		List<String> code = new StringList();
		code.add("/**");
		code.add(" * @param {Array<String>} array the value of the node");
		code.add(" */");
		code.add("function testArray(array) {");
		code.add("}");
		code.add("function test() {");
		code.add("testArray(new Array());");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
		// assertEquals(JavaScriptProblems.WRONG_PARAMETERS_PARAMETERIZATION,
		// problems.get(0).getID());
	}

	public void testGenericAnyWtihNoneGenericCall() {
		List<String> code = new StringList();
		code.add("/**");
		code.add(" * @param {Array<*>} array the value of the node");
		code.add(" */");
		code.add("function testArray(array) {");
		code.add("}");
		code.add("function test() {");
		code.add("testArray(new Array());");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testGenericParamWtihGenericCall() {
		List<String> code = new StringList();
		code.add("/**");
		code.add(" * @param {Array<String>} array the value of the node");
		code.add(" */");
		code.add("function testArray(array) {");
		code.add("}");
		code.add("function test() {");
		code.add("testArray(['test','test2']);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testNoneGenericParamWtihGenericCall() {
		List<String> code = new StringList();
		code.add("/**");
		code.add(" * @param {Array} array the value of the node");
		code.add(" */");
		code.add("function testArray(array) {");
		code.add("}");
		code.add("function test() {");
		code.add("testArray(['test','test2']);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testFunctionWithOptionalParams() {
		List<String> code = new StringList();
		code.add("/**");
		code.add(" * @param {String} a");
		code.add(" * @param {String} [b]");
		code.add(" */");
		code.add("function tester(a,b) {");
		code.add("}");
		code.add("function test() {");
		code.add("tester('test');");
		code.add("tester('test','test2');");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testFunctionCallWithUndefinedArgumments() {
		List<String> code = new StringList();
		code.add("/**");
		code.add(" * @param {String} a");
		code.add(" * @param {String} b");
		code.add(" */");
		code.add("function tester(a,b) {");
		code.add("}");
		code.add("function test() {");
		code.add("tester(a,b);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(2, problems.size());
		assertEquals(JavaScriptProblems.UNDECLARED_VARIABLE, problems.get(0)
				.getID());
		assertEquals(JavaScriptProblems.UNDECLARED_VARIABLE, problems.get(1)
				.getID());
	}

	public void testUndefinedVariables() {
		List<String> code = new StringList();
		code.add("function test() {");
		code.add("a=10");
		code.add("b['test']='1'");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(2, problems.size());
		assertEquals(JavaScriptProblems.UNDECLARED_VARIABLE, problems.get(0)
				.getID());
		assertEquals(JavaScriptProblems.UNDECLARED_VARIABLE, problems.get(1)
				.getID());
	}

	public void testArrayLookupWithoutAssign() {
		List<String> code = new StringList();
		code.add("function test() {");
		code.add("  var object = new Array();");
		code.add("  var x = object['test'].length;");
		code.add("  var y = object.test;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_PROPERTY, problems.get(0)
				.getID());
	}

	public void testArrayLookupWithAssign() {
		List<String> code = new StringList();
		code.add("function test() {");
		code.add("var object = new Array();");
		code.add("object['test'] = '';");
		code.add("var x = object['test'].length;");
		code.add("object.test;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(0, problems.size());
	}

	public void testObjectInitalizerWithPropertyAndFunction() {
		List<String> code = new StringList();
		code.add("var initializer = {x:10,y:function(z){}};");
		code.add("function testInitializer() {");
		code.add("var a = initializer.x;");
		code.add("var b = initializer.y(a);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testDifferentReturnTypeThenDeclared() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @return {Number} some result info");
		code.add("*/");
		code.add("function someFunction() {");
		code.add("return '';");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(
				JavaScriptProblems.DECLARATION_MISMATCH_ACTUAL_RETURN_TYPE,
				problems.get(0).getID());
	}

	public void testDifferentReturnTypesThenDeclared() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @return {String} some result info");
		code.add("*/");
		code.add("function someFunction() {");
		code.add("var result_1 = 1;");
		code.add("var condition_1 = false;");
		code.add("if(condition_1) {");
		code.add("return result_1;");
		code.add("}");
		code.add("return '';");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(
				JavaScriptProblems.DECLARATION_MISMATCH_ACTUAL_RETURN_TYPE,
				problems.get(0).getID());
	}

	public void testDifferentReturnTypesThenDeclaredWithUndefined() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @return {String} some result info");
		code.add("*/");
		code.add("function someFunction() {");
		code.add("var result_1 = 1;");
		code.add("var condition_1 = false;");
		code.add("if(condition_1) {");
		code.add("return undefined;");
		code.add("}");
		code.add("return '';");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testDeclaredtArrayTypeWithUndefineReturn() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @return {Array<String>} some result info");
		code.add("*/");
		code.add("function someFunction() {");
		code.add("return undefined;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testDeclaredtArrayTypeWithNullReturn() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @return {Array<String>} some result info");
		code.add("*/");
		code.add("function someFunction() {");
		code.add("return null;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testDeclaredtArrayTypeWithEmptyReturn() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @return {Array<String>} some result info");
		code.add("*/");
		code.add("function someFunction() {");
		code.add("return;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(
				JavaScriptProblems.DECLARATION_MISMATCH_ACTUAL_RETURN_TYPE,
				problems.get(0).getID());
	}

	public void testDeclaredtArrayTypeWithEmptyReturnUndefined() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @return {Array<String>|undefined} some result info");
		code.add("*/");
		code.add("function someFunction() {");
		code.add("return;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testDeclaredtArrayTypeWithNoReturn() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @return {Array<String>} some result info");
		code.add("*/");
		code.add("function someFunction() {");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(
				JavaScriptProblems.DECLARATION_MISMATCH_ACTUAL_RETURN_TYPE,
				problems.get(0).getID());
	}

	public void testDeclaredtArrayTypeWithNoReturnUndefined() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @return {Array<String>|undefined} some result info");
		code.add("*/");
		code.add("function someFunction() {");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testDifferentReturnTypesThenDeclaredWithNull() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @return {String} some result info");
		code.add("*/");
		code.add("function someFunction() {");
		code.add("var result_1 = 1;");
		code.add("var condition_1 = false;");
		code.add("if(condition_1) {");
		code.add("return null;");
		code.add("}");
		code.add("return '';");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testDifferentReturnTypes() {
		List<String> code = new StringList();
		code.add("function someFunction() {");
		code.add("var condition_1 = false;");
		code.add("if(condition_1) {");
		code.add("return 1;");
		code.add("}");
		code.add("return '';");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.RETURN_INCONSISTENT, problems.get(0)
				.getID());

	}

	public void testDifferentReturnTypesFirstNull() {
		List<String> code = new StringList();
		code.add("function test(a) {");
		code.add("  if (a > 0) {");
		code.add("    return null;");
		code.add("  }");
		code.add("  return [{}];");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testStringTypeAsFunctionCall() {
		StringList code = new StringList();
		code.add("var b = true");
		code.add("var s = String(b)");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.toString(), problems.isEmpty());
	}

	public void testNumberTypeAsFunctionCall() {
		StringList code = new StringList();
		code.add("var b = true");
		code.add("var n = Number(b)");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.toString(), problems.isEmpty());
	}

	public void testCallExternalFunctionViaReferenceCopy() {
		StringList code = new StringList();
		code.add("var p = parseInt");
		code.add("var n = p('1')");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.toString(), problems.isEmpty());
	}

	public void testVariableAssignedFunctionCallingItself() {
		if (notYetImplemented(this))
			return;
		StringList code = new StringList();
		code.add("var b = function a() {");
		code.add("application.output(a);}");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.toString(), problems.isEmpty());
	}

	public void testVariableAssignedObjectInitializerFunctionCallingItSelf() {
		if (notYetImplemented(this))
			return;
		StringList code = new StringList();
		code.add("var object = {");
		code.add(" a: function c() {");
		code.add(" c(); } }");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.toString(), problems.isEmpty());
	}

	public void testVariableAssignedObjectInitializerFunctionWithThis() {
		// if (notYetImplemented())
		// return;
		// doesn't report problem now, as this is untyped, so no checks
		StringList code = new StringList();
		code.add("var object = {");
		code.add("a: function c() {this.b();},");
		code.add("b: function() {}}");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.toString(), problems.isEmpty());
	}

	public void testVariableAssignedObjectInitializerFunctionWithoutThis() {
		StringList code = new StringList();
		code.add("var object = {");
		code.add("a: function c() {b();},");
		code.add("b: function() {}");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_FUNCTION, problems.get(0)
				.getID());
	}

	public void testJSDocWithPropertiesNoArgumentProperties() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param anchor");
		code.add("* @param {String} anchor.display");
		code.add("* @param {String} anchor.page");
		code.add("*/");
		code.add("function test(anchor) {");
		code.add("}");
		code.add("function tester() {");
		code.add("var obj = new Object();");
		code.add("test(obj);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(0)
				.getID());
	}

	public void testJSDocWithPropertiesCorrectArgumentProperties() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param anchor");
		code.add("* @param {String} anchor.display");
		code.add("* @param {String} anchor.page");
		code.add("*/");
		code.add("function test(anchor) {");
		code.add("}");
		code.add("function tester() {");
		code.add("var obj = new Object();");
		code.add("obj.display ='display'");
		code.add("obj.page ='page'");
		code.add("test(obj);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.toString(), problems.isEmpty());
	}

	public void testJSDocTypedObjectWithPropertiesCorrectArgumentProperties() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param {Object} anchor");
		code.add("* @param {String} anchor.display");
		code.add("* @param {String} anchor.page");
		code.add("*/");
		code.add("function test(anchor) {");
		code.add("}");
		code.add("function tester() {");
		code.add("var obj = new Object();");
		code.add("obj.display ='display'");
		code.add("obj.page ='page'");
		code.add("test(obj);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.toString(), problems.isEmpty());
	}

	public void testJSDocWithPropertiesWrongTypedArgumentProperties() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param anchor");
		code.add("* @param {String} anchor.display");
		code.add("* @param {String} anchor.page");
		code.add("*/");
		code.add("function test(anchor) {");
		code.add("}");
		code.add("function tester() {");
		code.add("var obj = new Object();");
		code.add("obj.display =10");
		code.add("obj.page ='page'");
		code.add("test(obj);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(0)
				.getID());
	}

	public void testJSDocWithOptionalPropertiesWithOnlyMandatoryArgumentProperties() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param anchor");
		code.add("* @param {String} anchor.display");
		code.add("* @param {String} anchor.page");
		code.add("* @param {String} [anchor.space]");
		code.add("* @param {String} [anchor.anchor]");
		code.add("*/");
		code.add("function test(anchor) {");
		code.add("}");
		code.add("function tester() {");
		code.add("var obj = new Object();");
		code.add("obj.display ='display'");
		code.add("obj.page ='page'");
		code.add("test(obj);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.toString(), problems.isEmpty());
	}

	public void testJSDocWithOptionalPropertiesWithSomeOptionalArgumentProperties() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param anchor");
		code.add("* @param {String} anchor.display");
		code.add("* @param {String} anchor.page");
		code.add("* @param {String} [anchor.space]");
		code.add("* @param {String} [anchor.anchor]");
		code.add("*/");
		code.add("function test(anchor) {");
		code.add("}");
		code.add("function tester() {");
		code.add("var obj = new Object();");
		code.add("obj.display ='display'");
		code.add("obj.page ='page'");
		code.add("obj.space ='display'");
		code.add("test(obj);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.toString(), problems.isEmpty());
	}

	public void testJSDocWithOptionalPropertiesWithAllArgumentProperties() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param anchor");
		code.add("* @param {String} anchor.display");
		code.add("* @param {String} anchor.page");
		code.add("* @param {String} [anchor.space]");
		code.add("* @param {String} [anchor.anchor]");
		code.add("*/");
		code.add("function test(anchor) {");
		code.add("}");
		code.add("function tester() {");
		code.add("var obj = new Object();");
		code.add("obj.display ='display'");
		code.add("obj.page ='page'");
		code.add("obj.space ='display'");
		code.add("obj.anchor ='page'");
		code.add("test(obj);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertTrue(problems.toString(), problems.isEmpty());
	}

	public void testJSDocWithOptionalPropertiesWithAllArgumentPropertiesWrongType() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param {Object} anchor");
		code.add("* @param {String} anchor.display");
		code.add("* @param {String} anchor.page");
		code.add("* @param {String} [anchor.space]");
		code.add("* @param {String} [anchor.anchor]");
		code.add("*/");
		code.add("function test(anchor) {");
		code.add("}");
		code.add("function tester() {");
		code.add("var obj = new Object();");
		code.add("obj.display ='display'");
		code.add("obj.page ='page'");
		code.add("obj.space ='display'");
		code.add("obj.anchor =10");
		code.add("test(obj);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(0)
				.getID());
	}

	public void testVariableDeclartionWithUnknowPropertyAssignment() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param {Object} anchor");
		code.add("*/");
		code.add("function test(anchor) {");
		code.add("var x = anchor.y");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_PROPERTY, problems.get(0)
				.getID());
	}

	public void testVariableWithUnknowPropertyAssignment() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param {Object} anchor");
		code.add("*/");
		code.add("function test(anchor) {");
		code.add("var x = null;");
		code.add("x = anchor.y");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_PROPERTY, problems.get(0)
				.getID());
	}

	public void testFunctionCallWithUnknowProperty() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param {Object} anchor");
		code.add("*/");
		code.add("function test(anchor) {");
		code.add("test(anchor.xxx);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_PROPERTY, problems.get(0)
				.getID());
	}

	public void testUnknowPropertyIfTest() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param {Object} anchor");
		code.add("*/");
		code.add("function test(anchor) {");
		code.add("if(anchor.xxx){}");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testUnknowPropertyOfUnknownVariableIfTest() {
		List<String> code = new StringList();
		code.add("function test() {");
		code.add("  if(unknown.xxx){}");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNDECLARED_VARIABLE, problems.get(0)
				.getID());
	}

	public void testDoubleUnknowPropertyIfTest() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param {Object} anchor");
		code.add("*/");
		code.add("function test(anchor) {");
		code.add("  if(anchor.xxx && anchor.yyyy){}");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testUnknowVariableIfTest() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param {Object} anchor");
		code.add("*/");
		code.add("function test(anchor) {");
		code.add("  var x = anchorr.xxx");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNDECLARED_VARIABLE, problems.get(0)
				.getID());
	}

	public void testUnknowPropertyOfPropertyIfTest() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param {Object} anchor");
		code.add("*/");
		code.add("function test(anchor) {");
		code.add("  var x = anchor.xxx.yyy");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_PROPERTY, problems.get(0)
				.getID());
	}

	public void testStringArrayxInitializerWithNullElement() {
		List<String> code = new StringList();
		code.add("/**");
		code.add("* @param {String[]} args");
		code.add("*/");
		code.add("function test2(args) {");
		code.add(" test2(['hello',null]);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testNestedAnonymousReturnType() {
		List<String> code = new StringList();
		code.add("function Test() {");
		code.add("  function Node() {");
		code.add("    this.fun = function() {");
		code.add("      return new Node();");
		code.add("    }");
		code.add("  }");
		code.add("  this.getNode = function() {");
		code.add("    return new Node();");
		code.add("  }");
		code.add("}");
		code.add("function caller(){");
		code.add("  var x = new Test();");
		code.add("  var node = x.getNode();");
		code.add("  var node2 = node.fun();");
		code.add("  var node3 = node2.fun();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testMoreDeeplyNestedCallsToAnonymousReturnType() {
		List<String> code = new StringList();
		code.add("function Test() {");
		code.add("  function Node() {");
		code.add("    this.fun = function() {");
		code.add("      return new Node();");
		code.add("    }");
		code.add("  }");
		code.add("  this.getNode = function() {");
		code.add("    return new Node();");
		code.add("  }");
		code.add("}");
		code.add("function caller(){");
		code.add("  var x = new Test();");
		code.add("  var node = x.getNode();");
		code.add("  var node2 = node.fun();");
		code.add("  var node3 = node2.fun();");
		code.add("  var node4 = node3.fun();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testNestedTypeToReturnType() {
		if (notYetImplemented(this))
			return;
		List<String> code = new StringList();
		code.add("function Test() {");
		code.add("  function Node() {");
		code.add("    this.fun = function() {");
		code.add("      return new Node();");
		code.add("    }");
		code.add("  }");
		code.add("  this.getNode = function() {");
		code.add("    return new Node();");
		code.add("  }");
		code.add("  this.Node = Node;");
		code.add("}");
		code.add("/** @return {Test.Node} */");
		code.add("function caller(){");
		code.add("  var x = new Test();");
		code.add("  return x.getNode();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testNestedFunctionTypeNewConstruct() {
		List<String> code = new StringList();
		code.add("function Test() {");
		code.add("  function Node() {");
		code.add("    this.fun = function() {");
		code.add("      return new Node();");
		code.add("    }");
		code.add("  }");
		code.add("  this.getNode = function() {");
		code.add("    return new Node();");
		code.add("  }");
		code.add("  this.Node = Node;");
		code.add("}");
		code.add("function caller() {");
		code.add("  var x = new Test();");
		code.add("  var node =  new x.Node();");
		code.add("  node.fun();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testNestedObjectInitializerType() {
		StringList code = new StringList();
		code.add("var init = {Node: function(){} }");
		code.add("/**");
		code.add(" * @return {init.Node} */");
		code.add("function caller2() {");
		code.add(" return new init.Node();}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testNestedObjectInitializerTypeWithFunctionCall() {
		StringList code = new StringList();
		code.add("var init = {Node: function(){}, ");
		code.add("fun: function() {return new init.Node();} }");
		code.add("/**");
		code.add(" * @return {init.Node} */");
		code.add("function caller2() {");
		code.add(" return init.fun();}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testNestedObjectInitializerWithThisTypeWithFunctionCall() {
		if (true || notYetImplemented(this))
			return;
		final StringList code = new StringList();
		code.add("var init = {");
		code.add("  Node: function(){}, ");
		code.add("  fun: function() {return new this.Node();}");
		code.add("}");
		code.add("/** @return {init.Node} */");
		code.add("function caller2() {");
		code.add("  return init.fun();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testOuterVariableInInnerFunction() {
		StringList code = new StringList();
		code.add("function Outer() {");
		code.add("function inner() {");
		code.add("variable = 10;");
		code.add("}");
		code.add("var variable;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testAssignmentOfVariableToUndefined() {
		StringList code = new StringList();
		code.add("function test() {");
		code.add(" var str = '';");
		code.add(" str.toLocaleString();");
		code.add(" str = undefined;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testAssignmentOfArgumentToUndefined() {
		StringList code = new StringList();
		code.add("/** @param {String} str */");
		code.add("function test(str) {");
		code.add(" str.toLocaleString();");
		code.add(" str = undefined;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testCompareOperatorsReturningBoolean() {
		StringList code = new StringList();
		code.add("/** @return {Boolean} */");
		code.add("function test() {");
		code.add(" var x = 1; var y = 2;");
		code.add(" if(x > 1)");
		code.add("  return (y == 2);");
		code.add(" if(x > 1)");
		code.add("  return (y != 2);");
		code.add(" if(x > 1)");
		code.add("  return (y < 2);");
		code.add(" if(x > 1)");
		code.add("  return (y > 2);");
		code.add(" if(x > 1)");
		code.add("  return (y >= 2);");
		code.add(" if(x > 1)");
		code.add("  return (y <= 2);");
		code.add(" if(x > 1)");
		code.add("  return (y === 2);");
		code.add(" if(x > 1)");
		code.add("  return (y !== 2);");
		code.add(" return false;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testReturnFromNestedCollections() {
		StringList code = new StringList();
		code.add("/** @return {Number} */");
		code.add("function test() {");
		code.add("  if (1 > 0) {");
		code.add("    return 1");
		code.add("  }");
		code.add("  else {");
		code.add("    return 2");
		code.add("  }");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testObjectProperyReturnTypeWithDirectInitializer() {
		StringList code = new StringList();
		code.add("/** @return {{astring:String,anumber:Number}} */");
		code.add("function test() {");
		code.add("return {astring:'test',anumber:1}");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testObjectProperyReturnNull() {
		StringList code = new StringList();
		code.add("/** @return {{astring:String,anumber:Number}} */");
		code.add("function test() {");
		code.add("return null");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testObjectProperyReturnTypeWithInvalidDirectInitializer() {
		StringList code = new StringList();
		code.add("/** @return {{astring:String,anumber:Number}} */");
		code.add("function test() {");
		code.add("return {aastring:'test',anumber:1}");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(
				JavaScriptProblems.DECLARATION_MISMATCH_ACTUAL_RETURN_TYPE,
				problems.get(0).getID());

	}

	public void testObjectProperyReturnTypeWithObjectInitializer() {
		StringList code = new StringList();
		code.add("/** @return {{astring:String,anumber:Number}} */");
		code.add("function test() {");
		code.add(" var obj =  {astring:'test',anumber:1}");
		code.add("  return obj;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testObjectProperyReturnTypeWithInvalidObjectInitializer() {
		StringList code = new StringList();
		code.add("/** @return {{astring:String,anumber:Number}} */");
		code.add("function test() {");
		code.add(" var obj =  {aastring:'test',anumber:1}");
		code.add("  return obj;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(
				JavaScriptProblems.DECLARATION_MISMATCH_ACTUAL_RETURN_TYPE,
				problems.get(0).getID());
	}

	public void testObjectProperyReturnTypeWithObject() {
		StringList code = new StringList();
		code.add("/** @return {{astring:String,anumber:Number}} */");
		code.add("function test() {");
		code.add(" var obj =  new Object();");
		code.add(" obj.astring = ''");
		code.add(" obj.anumber = 1");
		code.add(" return obj;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testObjectProperyReturnTypeWithObjectWithDifferentType() {
		StringList code = new StringList();
		code.add("/** @return {{astring:String,anumber:Number}} */");
		code.add("function test() {");
		code.add(" var obj =  new Object();");
		code.add(" obj.astring = ''");
		code.add(" obj.anumber = '1'");
		code.add(" return obj;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(
				JavaScriptProblems.DECLARATION_MISMATCH_ACTUAL_RETURN_TYPE,
				problems.get(0).getID());
	}

	public void testObjectProperyReturnTypeWithInvalidObject() {
		StringList code = new StringList();
		code.add("/** @return {{astring:String,anumber:Number}} */");
		code.add("function test() {");
		code.add(" var obj =  new Object();");
		code.add(" obj.aastring = ''");
		code.add(" obj.anumber = 1");
		code.add(" return obj;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(
				JavaScriptProblems.DECLARATION_MISMATCH_ACTUAL_RETURN_TYPE,
				problems.get(0).getID());
	}

	public void testParamWithObjectDeclaration() {
		StringList code = new StringList();
		code.add("/** @param {{astring:String,anumber:Number}} myparam */");
		code.add("function test(myparam) {");
		code.add(" var x = myparam.astring");
		code.add(" var y = myparam.anumber");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testParamWithObjectDeclarationInvalidProperty() {
		StringList code = new StringList();
		code.add("/** @param {{astring:String,anumber:Number}} myparam */");
		code.add("function test(myparam) {");
		code.add(" var x = myparam.aastring");
		code.add(" var y = myparam.anumber");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_PROPERTY, problems.get(0)
				.getID());
	}

	public void testParamWithObjectDeclarationCall() {
		StringList code = new StringList();
		code.add("/** @param {{astring:String,anumber:Number}} myparam */");
		code.add("function test(myparam) {");
		code.add("}");
		code.add("function test2(myparam) {");
		code.add(" test({astring:'',anumber:1});");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testParamWithOptinalObjectDeclarationCall() {
		StringList code = new StringList();
		code.add("/** @param {{astring:String, [anumber]:Number}} myparam */");
		code.add("function test(myparam) {");
		code.add("}");
		code.add("function test2(myparam) {");
		code.add(" test({astring:'',anumber:1});");
		code.add(" test({astring:''});");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testParamWithObjectDeclarationCallWithDifferentType() {
		StringList code = new StringList();
		code.add("/** @param {{astring:String,anumber:Number}} myparam */");
		code.add("function test(myparam) {");
		code.add("}");
		code.add("function test2(myparam) {");
		code.add(" test({astring:'',anumber:'1'});");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(0)
				.getID());
	}

	public void testParamWithObjectDeclarationInvalidCall() {
		StringList code = new StringList();
		code.add("/** @param {{astring:String,anumber:Number}} myparam */");
		code.add("function test(myparam) {");
		code.add("}");
		code.add("function test2(myparam) {");
		code.add(" test({aastring:'',anumber:1});");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(0)
				.getID());
	}

	public void testReturnStringAdd() {
		StringList code = new StringList();
		code.add("/** @return {String} */");
		code.add("function test() {");
		code.add("  return 1 + ''");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testMapWithValueDeclaration() {
		StringList code = new StringList();
		code.add("/** @param {Object<String>} param */");
		code.add("function test(param) {");
		code.add(" var x = param['test'];");
		code.add(" var p = x.toLocaleLowerCase();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testMapWithKeyValueDeclaration() {
		StringList code = new StringList();
		code.add("/** @param {Object<Number,String>} param */");
		code.add("function test(param) {");
		code.add(" var x = param['test'];");
		code.add(" var p = x.toLocaleLowerCase();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testMapWithValueWithWrongTypeDeclaration() {
		StringList code = new StringList();
		code.add("/** @param {Object<Stringg>} param */");
		code.add("function test(param) {");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(0).getID());
	}

	public void testMapWithKeyValueWithWrongTypeDeclaration() {
		StringList code = new StringList();
		code.add("/** @param {Object<Stringg,Numberr>} param */");
		code.add("function test(param) {");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 2, problems.size());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(0).getID());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(1).getID());
	}

	public void testArrayWithWrongTypeDeclaration() {
		StringList code = new StringList();
		code.add("/** @param {Array<Stringg>} param */");
		code.add("function test(param) {");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(0).getID());
	}

	public void testUnionWithWrongTypeDeclaration() {
		StringList code = new StringList();
		code.add("/** @param {Stringg|Number} param */");
		code.add("function test(param) {");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(0).getID());
	}

	public void testJavaObjectAndUndefineReturn() {
		StringList code = new StringList();
		code.add("function test1(param) {");
		code.add(" if (param) return new ExampleService();");
		code.add(" else return undefined;");
		code.add("}");
		code.add("function test2(param) {");
		code.add(" test1(true).name = 10;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testXMLWithParentheseExpression() {
		StringList code = new StringList();
		code.add("function test() {");
		code.add(" var tmp = 10;");
		code.add(" var xml = <></>;");
		code.add(" var node = xml..*.object.(@qualifiedName == tmp);");
		code.add(" if (node.length() == 0) {}");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testXMLWithParentheseExpressionWithUnknownVariableReference() {
		StringList code = new StringList();
		code.add("function test() {");
		code.add(" var xml = <></>;");
		code.add(" var node = xml..*.object.(@qualifiedName == tmp);");
		code.add(" if (node.length() == 0) {}");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNDECLARED_VARIABLE, problems.get(0)
				.getID());

	}

	public void testReassignOfAVariableWithDifferentDataAccessingItRightBefore() {
		StringList code = new StringList();
		code.add("function getParamXML() {");
		code.add(" var xml = <xml><data></data></xml>;");
		code.add(" xml.data.ignoreComments;");
		code.add(" xml = <xml><data1></data1></xml>;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testRecordTypeWithSpacesAndOwnCurlyBrackets() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @type {{height:Number, widgetName:String, widgetTitle: String,originalColumn: Number, originalPosition:Number,currentColumn:Number,currentPosition:Number,columns:{} }}");
		code.add("*/");
		code.add("var eventDataType;");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testUnionTypeTest() throws Exception {
		StringList code = new StringList();
		code.add("/** @param {String|Number} param */");
		code.add("function test(param) {");
		code.add(" param.toFixed(1)");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testUnionUnknownTypeTest() throws Exception {
		StringList code = new StringList();
		code.add("/** @param {String|Numberr} param */");
		code.add("function test(param) {");
		code.add(" param.toFixed(1)");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 2, problems.size());
	}

	public void testVarArgs() throws Exception {
		StringList code = new StringList();
		code.add("var x = []");
		code.add("x.splice(0,1)");
		code.add("x.splice(0,1,2)");
		code.add("x.splice(0,1,2,3)");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testVarArgsJS() throws Exception {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @param {Number} x");
		code.add(" * @param {Number} y");
		code.add(" * @param {...Number} z");
		code.add(" */");
		code.add("function test(x, y, z) {}");
		code.add("test(0,1)");
		code.add("test(0,1,2)");
		code.add("test(0,1,2,3)");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testPossibleRecursionInNew() {
		validate("var a = new a.toString()");
		// just check there was stack overflow
	}

	public void testRecordTypeWithNumbersInPropertyName() throws Exception {
		StringList code = new StringList();
		code.add("/** @type  {{prop1: String, prop2:Number}} */");
		code.add("var x = null;");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testMixedRecordTypes() throws Exception {
		StringList code = new StringList();
		code.add("/**");
		code.add("* @param {Object} _someArg");
		code.add("* @param {String} _someArg.strProp");
		code.add("*/");
		code.add("function firstFunc(_someArg){");
		code.add("secondFunc(_someArg);");
		code.add("}");
		code.add("/**");
		code.add("* @param {Object} _someArg - ");
		code.add("* @param {String} _someArg.strProp");
		code.add("*/");
		code.add("function secondFunc(_someArg){");
		code.add("secondFunc1(_someArg);");
		code.add("}");
		code.add("/**");
		code.add("* @param {{strProp:String}} _someArg");
		code.add("*/");
		code.add("function firstFunc1(_someArg){");
		code.add("secondFunc1(_someArg);");
		code.add("}");
		code.add("/**");
		code.add("* @param {{strProp:String}} _someArg -");
		code.add("*/");
		code.add("function secondFunc1(_someArg){");
		code.add("secondFunc(_someArg);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testPrototypeFunctionCallApplyCalling() throws Exception {
		StringList code = new StringList();
		code.add("Number.prototype.toString.call(null,null);");
		code.add("String.prototype.toString.apply(null,null);");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testRecordTypeReturn() throws Exception {
		StringList code = new StringList();
		code.add("/**");
		code.add("* @return {{propertyName: String, dataType: Number,defaultValue: Object, minValue: Object,maxValue: Object, allowBlank: Boolean,allowCustomValues: Boolean, valueListName: String}}");
		code.add("*/");
		code.add("function getRegisteredPropertyInfos()");
		code.add("{");
		code.add("/** @type {{propertyName: String, dataType: Number,defaultValue: Object, minValue: Object,maxValue: Object, allowBlank: Boolean,allowCustomValues: Boolean, valueListName: String}} */");
		code.add("var _propInfos = [];");
		code.add("return _propInfos;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testRightReturnArrayWithRecordTypeObjects() throws Exception {
		StringList code = new StringList();
		code.add("/**");
		code.add("* @return {Array<{propertyName: String, dataType: Number,defaultValue: Object, minValue: Object,maxValue: Object, allowBlank: Boolean,allowCustomValues: Boolean, valueListName: String}>}");
		code.add("*/");
		code.add("function getRegisteredPropertyInfos()");
		code.add("{");
		code.add("/** @type {Array<{propertyName: String, dataType: Number,defaultValue: Object, minValue: Object,maxValue: Object, allowBlank: Boolean,allowCustomValues: Boolean, valueListName: String}>} */");
		code.add("var _propInfos = [];");
		code.add("return _propInfos;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testWrong1ReturnArrayWithRecordTypeObjects() throws Exception {
		StringList code = new StringList();
		code.add("/**");
		code.add("* @return {Array<{propertyName: String, dataType: Number,defaultValue: Object, minValue: Object,maxValue: Object, allowBlank: Boolean,allowCustomValues: Boolean, valueListName: String}>}");
		code.add("*/");
		code.add("function getRegisteredPropertyInfos()");
		code.add("{");
		code.add("/** @type {Array<{propertyName: Number, dataType: Number,defaultValue: Object, minValue: Object,maxValue: Object, allowBlank: Boolean,allowCustomValues: Boolean, valueListName: String}>} */");
		code.add("var _propInfos = [];");
		code.add("return _propInfos;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(
				JavaScriptProblems.DECLARATION_MISMATCH_ACTUAL_RETURN_TYPE_PARAMETERIZATION,
				problems.get(0).getID());

	}

	public void testWrong2ReturnArrayWithRecordTypeObjects() throws Exception {
		StringList code = new StringList();
		code.add("/**");
		code.add("* @return {Array<{propertyName: String, dataType: Number,defaultValue: Object, minValue: Object,maxValue: Object, allowBlank: Boolean,allowCustomValues: Boolean, valueListName: String}>}");
		code.add("*/");
		code.add("function getRegisteredPropertyInfos()");
		code.add("{");
		code.add("/** @type {Array<{dataType: Number,defaultValue: Object, minValue: Object,maxValue: Object, allowBlank: Boolean,allowCustomValues: Boolean, valueListName: String}>} */");
		code.add("var _propInfos = [];");
		code.add("return _propInfos;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(
				JavaScriptProblems.DECLARATION_MISMATCH_ACTUAL_RETURN_TYPE_PARAMETERIZATION,
				problems.get(0).getID());
	}

	public void testPhantomPropertyUntyped() {
		final StringList code = new StringList();
		code.add("function test() {");
		code.add(" var x");
		code.add(" if (x.y) {"); // line #2
		code.add("   return x.y;");
		code.add(" }");
		code.add(" return undefined;");
		code.add("}");
		final List<IProblem> noproblems = validate(code.toString());
		assertEquals(noproblems.toString(), 0, noproblems.size());
		// change the condition and make sure problems are reported
		code.set(2, "if (x.y > 10) {");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
	}

	public void testPhantomPropertyJava() {
		final StringList code = new StringList();
		code.add("/** @param {ExampleService} x */");
		code.add("function test(x) {");
		code.add(" if (x.y) {");
		code.add("   return x.y;");
		code.add(" }");
		code.add(" else return undefined;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(),
				singleton(JavaScriptProblems.UNDEFINED_JAVA_PROPERTY),
				extractIds(problems));
	}

	public void testPhantomPropertyRecord() {
		final StringList code = new StringList();
		code.add("/** @param {{name:String,address:String}} x */");
		code.add("function test(x) {");
		code.add(" if (x.y) {");
		code.add("   return x.y;");
		code.add(" }");
		code.add(" else return undefined;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(),
				singleton(JavaScriptProblems.UNDEFINED_PROPERTY),
				extractIds(problems));
	}

	public void testVarReferencedFromArrayLiteral() {
		final StringList code = new StringList();
		code.add("function test() {");
		code.add("  var a = 10;");
		code.add("  var point = {");
		code.add("    x: 1,");
		code.add("    y: [a]");
		code.add("  };");
		code.add("  return point;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testArrayPushValid() {
		final StringList code = new StringList();
		code.add("/** @type {Array<String>} */");
		code.add("var a = []");
		code.add("a.push('AAA')");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testArrayPushInvalid() {
		final StringList code = new StringList();
		code.add("/** @type {Array<String>} */");
		code.add("var a = []");
		code.add("a.push(1)");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(0)
				.getID());
	}

	public void testRecordTypeParamCalledWithAnNullButDeclaredArgumentValue() {
		final StringList code = new StringList();
		code.add("/** @type {Object<{icon:String,color:String}>} */");
		code.add("var statusCodes = { ok: {icon: 'media:///check.png', color: null}, fail: {icon: 'media:///16forbidden.png', color: 'red'}, maybe: {icon: 'media:///check_orange.png', color: 'orange'}}");
		code.add("/** @param {{code: {icon:String,color:String}=, text: String|XML=, toolTip: String=}} object */");
		code.add("function onLoad(object) {");
		code.add("onLoad({code:statusCodes.ok});");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testRecordTypeParamWithCompletelyDifferentArgumentRecordType() {
		final StringList code = new StringList();
		code.add("/** @type {Object<{icon:String,color:String}>} */");
		code.add("var statusCodes = { ok: {icon: 'media:///check.png', color: null}, fail: {icon: 'media:///16forbidden.png', color: 'red'}, maybe: {icon: 'media:///check_orange.png', color: 'orange'}}");
		code.add("/** @param {{code: {icon:String,color:String}=, text: String|XML=, toolTip: String=}} object */");
		code.add("function onLoad(object) {");
		code.add("onLoad(statusCodes.ok);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
	}

	public void testRecordTypeParamWithPartiallyDifferentArgumentRecordType() {
		final StringList code = new StringList();
		code.add("/** @type {Object<{icon:String,color:String}>} */");
		code.add("var statusCodes = { ok: {icon: 'media:///check.png', color: null}, fail: {icon: 'media:///16forbidden.png', color: 'red'}, maybe: {icon: 'media:///check_orange.png', color: 'orange'}}");
		code.add("/** @param {{code: {icon:String,color:String}=, text: String|XML=, toolTip: String=}} object */");
		code.add("function onLoad(object) {");
		code.add("onLoad({code:statusCodes.ok,notinparamtype:1});");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testUnionParamTypeCompatibility() {
		final StringList code = new StringList();
		code.add("/** @param {{name:String}} person */");
		code.add("function test(person) {}");
		code.add("");
		code.add("/** @param {function(String)|String} obj */");
		code.add("function y(obj) {");
		code.add("  test({ name: obj });");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testArrayLookupWithUnknowVariables() {
		final StringList code = new StringList();
		code.add("var vAvailableLicenses = exampleForms.nothere[exampleForms.nothere2].nothere3.nothere4;");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 2, problems.size());
	}

	public void testContinationAsFunctionCall() {
		final StringList code = new StringList();
		code.add("var c = new Continuation();");
		code.add("c();");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testObjectAsFunctionCall() {
		final StringList code = new StringList();
		code.add("var c = new Object();");
		code.add("c();");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_FUNCTION, problems.get(0).getID());
	}

	public void testPropertyAsFunctionCall() {
		final StringList code = new StringList();
		code.add("var s = '';");
		code.add("s.length();");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_FUNCTION, problems.get(0).getID());
	}

	public void testArrayWithJavaScriptType() {
		final StringList code = new StringList();
		code.add("function CustomType() {");
		code.add("	this.myvar = 10;");
		code.add("}");

		code.add("function test(){");
		code.add("	/** @type {Array<CustomType>} */");
		code.add("	var myarray = [];");
		code.add("	var x = myarray[0].myvar;");
		code.add("	var item = myarray[0];");
		code.add("	item.myvar;");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testPropertyWithDirectJavascriptChildrenNoType() {
		List<String> lines = new StringList();
		lines.add("var array = GLOBALS.test();");
		lines.add("array.push('string');");
		final List<IProblem> problems = validate(lines.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testConstructorWrongArgCount() {
		final List<IProblem> problems = validate("var s = new String(1,2,3)");
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(0)
				.getID());
	}

	public void testConstructorMismatchedOverload() {
		final List<IProblem> problems = validate("var d = new Date(true)");
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(0)
				.getID());
	}

	public void testConstructorMismatchedArgs() {
		final List<IProblem> problems = validate("var d = new Date('','','')");
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(0)
				.getID());
	}

	public void testConstructorOverrides() {
		List<IProblem> problems;
		problems = validate("var d = new Date()");
		assertEquals(problems.toString(), 0, problems.size());
		problems = validate("var d = new Date('')");
		assertEquals(problems.toString(), 0, problems.size());
		problems = validate("var d = new Date(123456789)");
		assertEquals(problems.toString(), 0, problems.size());
		problems = validate("var d = new Date(2012,1,1)");
		assertEquals(problems.toString(), 0, problems.size());
		problems = validate("var d = new Date(1,2,3,4,5,6,7)");
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testFunctionTypeCall() {
		final StringList code = new StringList();
		code.add("/**");
		code.add(" * @type {function(String)}");
		code.add("*/");
		code.add("var func;");
		code.add("func('A')");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testFunctionTypeCallError() {
		final StringList code = new StringList();
		code.add("/**");
		code.add(" * @type {function(String)}");
		code.add("*/");
		code.add("var func;");
		code.add("func(1)");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(0)
				.getID());
	}

	public void testFunctionTypeCallParam() {
		final StringList code = new StringList();
		code.add("/**");
		code.add(" * @param {function(String)} func");
		code.add("*/");
		code.add("function test(func) {");
		code.add("  func('A')");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testFunctionTypeCallParamError() {
		final StringList code = new StringList();
		code.add("/**");
		code.add(" * @param {function(String)} func");
		code.add("*/");
		code.add("function test(func) {");
		code.add("  func(1)");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(0)
				.getID());
	}

	public void testTypedArrayReturnValue() {
		List<String> lines = new StringList();
		lines.add("function SomeCustomType() {");
		lines.add("	this.someExistingMethod = function() {}");
		lines.add("}");

		lines.add("/** ");
		lines.add("* @return {Array<SomeCustomType>}");
		lines.add("*/");
		lines.add("function getTypedArray() {");
		lines.add("	/** @type {Array<SomeCustomType>} */");
		lines.add("	var array = new Array();");
		lines.add("	array[0] = new SomeCustomType();");
		lines.add("	array[0].someExistingMethod();");
		lines.add("	return array;");
		lines.add("}");

		lines.add("function test() {");
		lines.add("	/** @type {Array<SomeCustomType>} */");
		lines.add("	var typedArray = getTypedArray();  ");
		lines.add("	for each(var item in typedArray) {");
		lines.add("	    item.someExistingMethod(); ");
		lines.add("	}");
		lines.add("}");
		final List<IProblem> problems = validate(lines.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testTypedArrayReturnValueWithoutTypeDeclare() {
		List<String> lines = new StringList();
		lines.add("function SomeCustomType() {");
		lines.add("	this.someExistingMethod = function() {}");
		lines.add("}");

		lines.add("/** ");
		lines.add("* @return {Array<SomeCustomType>}");
		lines.add("*/");
		lines.add("function getTypedArray() {");
		lines.add("	/** @type {Array<SomeCustomType>} */");
		lines.add("	var array = new Array();");
		lines.add("	array[0] = new SomeCustomType();");
		lines.add("	array[0].someExistingMethod();");
		lines.add("	return array;");
		lines.add("}");

		lines.add("function test() {");
		lines.add("	var typedArray = getTypedArray();  ");
		lines.add("	for each(var item in typedArray) {");
		lines.add("	    item.someExistingMethod(); ");
		lines.add("	}");
		lines.add("}");
		final List<IProblem> problems = validate(lines.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testDeclaredClassAsFunction() {
		final StringList code = new StringList();
		code.add("/** @type {Class<String>} */");
		code.add("var STRING;");
		code.add("function testStr() {");
		code.add("  return STRING('');");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testDeclaredClassAsFunctionError() {
		final StringList code = new StringList();
		code.add("/** @type {Class<String>} */");
		code.add("var STRING;");
		code.add("function testStr() {");
		code.add("  return STRING(1,2,3);");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(0)
				.getID());
	}

	public void testAnyTypePhantomValue() {
		final StringList code = new StringList();
		code.add("function test() {");
		code.add("  /** @type {*} */");
		code.add("  var x;");
		code.add("  return x.a() + x.b() + x.c;");
		code.add("}");
		{
			final List<IProblem> problems = validate(code.toString());
			assertEquals(problems.toString(), 0, problems.size());
		}
		code.remove(1);
		{
			final List<IProblem> problems = validate(code.toString());
			assertEquals(problems.toString(), 3, problems.size());
			assertEquals(JavaScriptProblems.UNDEFINED_METHOD, problems.get(0)
					.getID());
			assertEquals(JavaScriptProblems.UNDEFINED_METHOD, problems.get(1)
					.getID());
			assertEquals(JavaScriptProblems.UNDEFINED_PROPERTY, problems.get(2)
					.getID());
		}
	}

	public void testAssignmentWithBranch() {
		final StringList code = new StringList();
		code.add("function test() {");
		code.add(" var service;");
		code.add(" if (test) {");
		code.add("  service = exampleForms.service");
		code.add("  var name = service.name;");
		code.add(" }");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testPrototype() {
		final StringList code = new StringList();
		code.add("String.prototype.foo = function() {}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testAssignToClass() {
		final StringList code = new StringList();
		code.add("String = 1");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNASSIGNABLE_ELEMENT, problems.get(0)
				.getID());
		assertEquals(ValidationMessages.UnassignableClass, problems.get(0)
				.getMessage());
	}

	public void testAssignToGlobalFunction() {
		final StringList code = new StringList();
		code.add("parseInt = 1");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNASSIGNABLE_ELEMENT, problems.get(0)
				.getID());
		assertEquals(ValidationMessages.UnassignableMethod, problems.get(0)
				.getMessage());
	}

	public void testAssignToFunction() {
		final StringList code = new StringList();
		code.add("function a() {}");
		code.add("a = 1");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNASSIGNABLE_ELEMENT, problems.get(0)
				.getID());
		assertEquals(ValidationMessages.UnassignableFunction, problems.get(0)
				.getMessage());
	}

	// This test will not always fail!, this is because sometimes it can map on
	// String other times it maps on Number (ImmutableValue.getChild())
	public void testDoubleReferences() {
		final StringList code = new StringList();
		code.add("/**");
		code.add(" * @return {Array<Number>}");
		code.add(" */");
		code.add("function test2() {");
		code.add(" /** @type {Array<Number>} */");
		code.add(" var array = new Array();");
		code.add(" return array");
		code.add("}");
		code.add("function test() {");
		code.add(" var z = 1;");
		code.add(" if (x) {");
		code.add("  /** @type {Array<String>} */");
		code.add("  var x = test2();");
		code.add("  var y = x[0];");
		code.add("  y.bold();");
		code.add(" }");
		code.add(" else {");
		code.add("  z = z + 2;");
		code.add(" }");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testArrayAccess1() {
		final StringList code = new StringList();
		code.add("var strings = ['A','B','C'];");
		code.add("strings[0].aaa();");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_METHOD, problems.get(0)
				.getID());
	}

	public void testArrayAccess1property() {
		final StringList code = new StringList();
		code.add("var strings = ['A','B','C'];");
		code.add("strings[0].aaa;");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_PROPERTY, problems.get(0)
				.getID());
	}

	public void testArrayAccess2() {
		final StringList code = new StringList();
		code.add("/** @type {Array<String>} */");
		code.add("var strings;");
		code.add("strings[0].aaa();");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_METHOD, problems.get(0)
				.getID());
	}

	public void testArrayAccess2property() {
		final StringList code = new StringList();
		code.add("/** @type {Array<String>} */");
		code.add("var strings;");
		code.add("strings[0].aaa;");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_PROPERTY, problems.get(0)
				.getID());
	}

	public void testEmptyArrayLiteralCompatibility() {
		final StringList code = new StringList();
		code.add("/** @param {Array<String>} ss */");
		code.add("function test(ss) {}");
		code.add("test([]);");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testFunctionTypeMethods() {
		final StringList code = new StringList();
		code.add("/** @type {function(String, Number):Date} **/");
		code.add("var f;");
		code.add("f.apply({}, []).getFullYear();");
		code.add("f.apply({}, [\"aaa\", 222]).getFullYear();");
		code.add("f.call([], \"bbb\", 333).getFullYear();");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testFunctionTypeMethodsErrors() {
		final StringList code = new StringList();
		code.add("/** @type {function(Number):Date} **/");
		code.add("var f;");
		code.add("f.call({}, 111, 222);");
		code.add("f.call({});");
		code.add("f.call({}, 111).iDoNotExist();");
		code.add("f.apply({}, {});");
		code.add("f.apply({}, []).iAmUndefined;");

		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 5, problems.size());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(0)
				.getID());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(1)
				.getID());
		assertEquals(JavaScriptProblems.UNDEFINED_METHOD, problems.get(2)
				.getID());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(3)
				.getID());
		assertEquals(JavaScriptProblems.UNDEFINED_PROPERTY, problems.get(4)
				.getID());
	}

	public void testMultiDimRecordType() {
		final StringList code = new StringList();
		code.add("/**");
		code.add("*	@param {Object} data");
		code.add("* @param {Object} options");
		code.add("* @param {Object} options.backgroundColor");
		code.add("* @param {String} options.backgroundColor.fill");
		code.add("*	@param {String} options.backgroundColor.stroke");
		code.add("*	@param {Number} options.backgroundColor.strokeWidth");
		code.add("*");
		code.add("*/");
		code.add("function draw(data, options) {");
		code.add("var s = options.backgroundColor.fill;");
		code.add("s.toUpperCase();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testThisAnnotationError() {
		final StringList code = new StringList();
		code.add("/** @this {String} */");
		code.add("var g = function () {");
		code.add("this.length; // OK");
		code.add("this.fixed(); // OK");
		code.add("this.getDay(); // warning - undefined member");
		code.add("this.myMethod(); // warning - undefined member");
		code.add("this.ble; // warning - undefined member");
		code.add("}");
		code.add("g.apply('');");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 3, problems.size());
		assertEquals(JavaScriptProblems.UNDEFINED_METHOD, problems.get(0)
				.getID());
		assertEquals(JavaScriptProblems.UNDEFINED_METHOD, problems.get(1)
				.getID());
		assertEquals(JavaScriptProblems.UNDEFINED_PROPERTY, problems.get(2)
				.getID());
	}

	public void testThisAnnotationValid() {
		final StringList code = new StringList();
		code.add("var g = function () {");
		code.add("this.length;");
		code.add("this.fixed();");
		code.add("this.getDay();");
		code.add("this.myMethod();");
		code.add("this.ble;");
		code.add("}");
		code.add("g.apply('');");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testJavaScriptDynamicArrayAcces() {
		final StringList code = new StringList();
		code.add("var x = new Array();");
		code.add("x['test']();");
		code.add("var y = {}");
		code.add("y['test']();");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testJavaScriptDynamicArrayAccesProperty() {
		final StringList code = new StringList();
		code.add("var x = new Array();");
		code.add("x['test'].aaa;");
		code.add("var y = {}");
		code.add("y['test'].aaa;");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testJavaScriptNewArray() {
		final StringList code = new StringList();
		code.add("var x = new Array();");
		code.add("x[0].aaa;");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testJavaObjectDynamicArrayAcces() {
		final StringList code = new StringList();
		code.add("exampleForms['test']();");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testJavaObjectDynamicArrayAccesProperty() {
		final StringList code = new StringList();
		code.add("exampleForms['test'].aaa;");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testGenericCopyMethod() {
		final StringList code = new StringList();
		code.add("/** @param {String} value */");
		code.add("function testStr(value) {}");
		code.add("/** @param {Number} value */");
		code.add("function testNum(value) {}");
		code.add("var s = exampleCopy('str');");
		code.add("testStr(s);");
		code.add("var n = exampleCopy(1);");
		code.add("testNum(n);");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testMapRecordCompatibilityOK() {
		final StringList code = new StringList();
		code.add("/** @param {Object<Number>} m */");
		code.add("function withMap(m) {}");
		code.add("withMap({ a: 1, b: 2, c: 3 })");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testMapRecordCompatibilityError() {
		final StringList code = new StringList();
		code.add("/** @param {Object<Number>} m */");
		code.add("function withMap(m) {}");
		code.add("withMap({ a: 1, b: 2, c: '' })");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.WRONG_PARAMETERS, problems.get(0)
				.getID());
	}

	public void testReturnWith2NewInstances() throws Exception {
		StringList code = new StringList();
		code.add("function myObject() { this.me = 'myself'; }");
		code.add("function createMyObject(myParam) {");
		code.add(" if (!myParam) { return new myObject(); }");
		code.add(" return new myObject();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testReturnWith1NewInstanceAnd1CallInstance() throws Exception {
		StringList code = new StringList();
		code.add("function myObject() { this.me = 'myself'; }");
		code.add("function getMyObject() {");
		code.add(" return new myObject();");
		code.add("}");
		code.add("function createMyObject(myParam) {");
		code.add(" if (!myParam) { return new myObject(); }");
		code.add(" return getMyObject();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testReturnWith2CallInstance() throws Exception {
		StringList code = new StringList();
		code.add("function myObject() { this.me = 'myself'; }");
		code.add("function getMyObject() {");
		code.add(" return new myObject();");
		code.add("}");
		code.add("function getMyObject2() {");
		code.add(" return new myObject();");
		code.add("}");
		code.add("function createMyObject(myParam) {");
		code.add(" if (!myParam) { return getMyObject2(); }");
		code.add(" return getMyObject();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testReturnWith1CallJSDocInstanceAnd1NewInstance()
			throws Exception {
		StringList code = new StringList();
		code.add("function myObject() { this.me = 'myself'; }");
		code.add("/**");
		code.add(" * @return {myObject}");
		code.add(" */");
		code.add("function getMyObject() {");
		code.add(" return null;");
		code.add("}");
		code.add("function createMyObject(myParam) {");
		code.add(" if (!myParam) { return new myObject(); }");
		code.add(" return getMyObject();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testReturnWith2CallJSDocInstance() throws Exception {
		StringList code = new StringList();
		code.add("function myObject() { this.me = 'myself'; }");
		code.add("/**");
		code.add(" * @return {myObject}");
		code.add(" */");
		code.add("function getMyObject() {");
		code.add(" return null;");
		code.add("}");
		code.add("/**");
		code.add(" * @return {myObject}");
		code.add(" */");
		code.add("function getMyObject2() {");
		code.add(" return null;");
		code.add("}");
		code.add("function createMyObject(myParam) {");
		code.add(" if (!myParam) { return getMyObject2(); }");
		code.add(" return getMyObject();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testGenericReturnCallSort() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @return {Array<String>}");
		code.add(" */");
		code.add("function getJSFormHierarchy() {");
		code.add(" /** @type {Array<String>} */");
		code.add(" var retval = new Array();");
		code.add(" return retval.sort(function(){});");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testGenericReturnCallReverse() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @return {Array<String>}");
		code.add(" */");
		code.add("function getJSFormHierarchy() {");
		code.add(" /** @type {Array<String>} */");
		code.add(" var retval = new Array();");
		code.add(" return retval.reverse();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testRecordTypeObjectProperty() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @param {String} form");
		code.add(" */");
		code.add("function forEach(form) {");
		code.add("var processed = { }");
		code.add("processed.hasOwnProperty(form);");
		code.add("}");
		List<IProblem> validate = validate(code.toString());
		assertEquals(0, validate.size());
	}

	public void testVariableTypedAsCustomTypeReferecingItselfArrayThroughDoc() {
//		if (notYetImplemented(this))
//			return;
		 // this works now because the Type Array<MyObject> is mapped to Array<Any> and then everything is allowed
		// but it shouldn't it should be allowed because there is really a myfunc method with a number function..
		final StringList code = new StringList();
		code.add("function MyObject() {");
		code.add(" this.num = 10;");
		code.add(" /**");
		code.add("  * @param {Number} x");
		code.add("  * @return {MyObject}");
		code.add("  */");
		code.add(" this.myfunc = function(x) {");
		code.add(" 	return null;");
		code.add(" }");
		code.add("}");
		code.add("function test() {");
		code.add("	/** @type {Array<MyObject>} */");
		code.add("	this.scopeOneItems = new Array();");
		code.add("	this.scopeOneItems[1].myfunc(1)");
		code.add("}");
		List<IProblem> validate = validate(code.toString());
		assertEquals(0, validate.size());
	}

	public void testVariableTypedAsCustomTypeReferecingItselfArrayThroughDocWrongCall() {
		final StringList code = new StringList();
		code.add("function MyObject() {");
		code.add(" this.num = 10;");
		code.add(" /**");
		code.add("  * @param {Number} x");
		code.add("  * @return {MyObject}");
		code.add("  */");
		code.add(" this.myfunc = function(x) {");
		code.add(" 	return null;");
		code.add(" }");
		code.add("}");
		code.add("function test() {");
		code.add("	/** @type {Array<MyObject>} */");
		code.add("	this.scopeOneItems = new Array();");
		code.add("	this.scopeOneItems[1].myfunc('1')");
		code.add("}");
		List<IProblem> validate = validate(code.toString());
		assertEquals(1, validate.size());
	}
	
	public void testLazyFunctionCallWithJSDocArrayReturnType() {
		final StringList code = new StringList();
		code.add("function test() {");
		code.add(" var x = getChildFormsInEditMode();");
		code.add(" x.length;");
		code.add("}");
		code.add("/**");
		code.add("   * @return {Array<String>}");
		code.add(" */");
		code.add("function getChildFormsInEditMode() {");
		code.add(" /** @type {Array<String>} */");
		code.add(" var _formAr = [];");
		code.add(" return _formAr;");
		code.add("}");
		List<IProblem> validate = validate(code.toString());
		assertEquals(0, validate.size());
	}

	public void testNewWithoutCallExpression() {
		final List<IProblem> problems = validate("var test = new Test");
		assertEquals(problems.toString(), 1, problems.size());
	}
}
