package org.eclipse.dltk.javascript.parser.tests;

import java.util.List;

import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.parser.JavaScriptParserProblems;

public class ParserValidationsTest extends AbstractJSParserTest {

	public void testDuplicateParameter() {
		StringList code = new StringList();
		code.add("function hello(param1,param1) {}");
		parse(code.toString());
		List<IProblem> problems = reporter.getProblems();
		assertEquals(1, problems.size());
		assertEquals(JavaScriptParserProblems.DUPLICATE_PARAMETER, problems
				.get(0).getID());
	}

	public void testVarHidesParameter() {
		StringList code = new StringList();
		code.add("function hello(a) {");
		code.add("  // 1");
		code.add("  var a = 1");
		code.add("  // 2");
		code.add("}");
		code.add("");
		code.add("");
		parse(code.toString());
		List<IProblem> problems = reporter.getProblems();
		assertEquals(1, problems.size());
		assertEquals(JavaScriptParserProblems.VAR_HIDES_ARGUMENT, problems.get(
				0).getID());
	}

}
