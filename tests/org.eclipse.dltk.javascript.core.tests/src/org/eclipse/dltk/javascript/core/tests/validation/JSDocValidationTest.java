package org.eclipse.dltk.javascript.core.tests.validation;

import java.util.List;

import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.core.tests.TestSupport;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.internal.javascript.validation.TypeInfoValidator;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.core.tests.AbstractValidationTest;

public class JSDocValidationTest extends AbstractValidationTest {

	@Override
	protected IBuildParticipant createValidator() {
		return new TypeInfoValidator();
	}

	public void testUnknownFunctionType() {
		StringList code = new StringList();
		code.add("/** @type LongString */");
		code.add("function x(){return null;}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(0).getID());
	}

	public void testUnknownFunctionReturnType() {
		StringList code = new StringList();
		code.add("/** @return {LongString} doc */");
		code.add("function x(){return null;}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(0).getID());
	}

	public void testUnknownParamType() {
		StringList code = new StringList();
		code.add("/** @param {LongString} x */");
		code.add("function y(x){}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(0).getID());
	}

	public void testUnknownThrowsType() {
		StringList code = new StringList();
		code.add("/** @throws {LongString} x */");
		code.add("function x(){}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(0).getID());
	}

	public void testUnknown2ThrowsType() {
		StringList code = new StringList();
		code.add("/** @throws {LongString1} x ");
		code.add(" * @throws {LongString2} x */");
		code.add("function x(){}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 2, problems.size());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(0).getID());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(1).getID());
	}

	public void testOneUnknownAndOneKnownThrowsType() {
		StringList code = new StringList();
		code.add("/** @throws {LongString1} x ");
		code.add(" * @throws {String} x */");
		code.add("function x(){}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(0).getID());
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

	public void testNestedCallsToAnonymousReturnType() {
		if (TestSupport.notYetImplemented(this))
			return;
		List<String> code = new StringList();
		code.add("function Test() {");
		code.add(" function Node() {");
		code.add(" this.fun = function() {");
		code.add("  return new Node();");
		code.add("}}");
		code.add("this.getNode = function() {");
		code.add(" return new Node();");
		code.add(" }");
		code.add("}");
		code.add("/**");
		code.add(" * @return {Test.Node} */");
		code.add("function caller(){");
		code.add(" var x = new Test();");
		code.add(" return x.fun();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 1, problems.size());
		assertEquals(JavaScriptProblems.UNKNOWN_TYPE, problems.get(0).getID());
	}

	public void testNestedCallsToReturnType() {
		if (TestSupport.notYetImplemented(this))
			return;
		List<String> code = new StringList();
		code.add("function Test() {");
		code.add(" function Node() {");
		code.add(" this.fun = function() {");
		code.add("  return new Node();");
		code.add("}}");
		code.add("this.getNode = function() {");
		code.add(" return new Node();");
		code.add(" }");
		code.add("this.Node = Node;");
		code.add("}");
		code.add("/**");
		code.add(" * @return {Test.Node} */");
		code.add("function caller(){");
		code.add(" var x = new Test();");
		code.add(" return x.getNode();");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}
}
