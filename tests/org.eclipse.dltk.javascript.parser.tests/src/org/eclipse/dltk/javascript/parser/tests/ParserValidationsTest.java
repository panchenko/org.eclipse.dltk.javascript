package org.eclipse.dltk.javascript.parser.tests;

import org.eclipse.dltk.ast.utils.ASTUtil;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.ast.BooleanLiteral;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.TryStatement;
import org.eclipse.dltk.javascript.parser.JavaScriptParserProblems;

public class ParserValidationsTest extends AbstractJSParserTest {

	public void testDuplicateParameter() {
		StringList code = new StringList();
		code.add("function hello(param1,param1) {}");
		parse(code.toString());
		assertEquals(JavaScriptParserProblems.DUPLICATE_PARAMETER,
				getProblemId());
	}

//	public void testVarHidesParameter() {
//		StringList code = new StringList();
//		code.add("function hello(a) {");
//		code.add("  // 1");
//		code.add("  var a = 1");
//		code.add("  // 2");
//		code.add("}");
//		code.add("");
//		code.add("");
//		parse(code.toString());
//		assertEquals(JavaScriptParserProblems.VAR_HIDES_ARGUMENT,
//				getProblemId());
//	}

	public void testDoubleSwitchDefault() {
		StringList code = new StringList();
		code.add("switch (a) {");
		code.add("default:");
		code.add("default:");
		code.add("}");
		parse(code.toString());
		assertEquals(JavaScriptParserProblems.DOUBLE_SWITCH_DEFAULT,
				getProblemId());
	}

	public void testDuplicateLabel() {
		StringList code = new StringList();
		code.add("A: for (i=0;i<10;++i) a += i");
		code.add("A: while (!f.isEOF()) f.readLine()");
		parse(code.toString());
		assertEquals(JavaScriptParserProblems.DUPLICATE_LABEL, getProblemId());
	}

	public void testUndefinedLabel() {
		StringList code = new StringList();
		code.add("A: while (!f.isEOF()) {");
		code.add("s = f.readLine()");
		code.add("if (s == 'END') break READ");
		code.add("}");
		parse(code.toString());
		assertEquals(JavaScriptParserProblems.UNDEFINED_LABEL, getProblemId());
	}

	public void testDefinedLabel() {
		StringList code = new StringList();
		code.add("LOOP: while (!f.isEOF()) {");
		code.add("s = f.readLine()");
		code.add("if (s == 'END') break LOOP");
		code.add("}");
		parse(code.toString());
		assertTrue(reporter.getProblems().isEmpty());
	}

	public void testBadBreak() {
		StringList code = new StringList();
		code.add("function a() {");
		code.add("  break;");
		code.add("}");
		parse(code.toString());
		assertEquals(JavaScriptParserProblems.BAD_BREAK, getProblemId());
	}

	public void testBadContinue() {
		StringList code = new StringList();
		code.add("function a() {");
		code.add("  continue;");
		code.add("}");
		parse(code.toString());
		assertEquals(JavaScriptParserProblems.BAD_CONTINUE, getProblemId());
	}

	public void testInvalidReturn() {
		StringList code = new StringList();
		code.add("if (a == 0) {");
		code.add("  return;");
		code.add("}");
		parse(code.toString());
		assertEquals(JavaScriptParserProblems.INVALID_RETURN, getProblemId());
	}

	public void testTryCatchFilter() {
		StringList code = new StringList();
		code.add("try {");
		code.add("  doSomething()");
		code.add("}");
		code.add("catch (e if true) {");
		code.add("  error = 1");
		code.add("}");
		Script script = parse(code.toString());
		assertTrue(reporter.getProblems().isEmpty());
		TryStatement tryStatement = uniqueResult(ASTUtil.select(script,
				TryStatement.class));
		assertEquals(1, tryStatement.getCatches().size());
		assertTrue(tryStatement.getCatches().get(0).getFilterExpression() instanceof BooleanLiteral);
	}

	public void testUnreachableCatch() {
		StringList code = new StringList();
		code.add("try {");
		code.add("  doSomething()");
		code.add("}");
		code.add("catch (e if true) {");
		code.add("  error = 1");
		code.add("}");
		code.add("catch (e if e instanceof RuntimeException) {");
		code.add("  error = 1");
		code.add("}");
		code.add("catch (e) {");
		code.add("  error = 2");
		code.add("}");
		code.add("catch (e) {");
		code.add("  error = 3");
		code.add("}");
		parse(code.toString());
		assertEquals(JavaScriptParserProblems.CATCH_UNREACHABLE, getProblemId());
	}
}
