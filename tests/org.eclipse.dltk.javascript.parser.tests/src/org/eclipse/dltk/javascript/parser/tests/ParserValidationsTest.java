package org.eclipse.dltk.javascript.parser.tests;

import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.parser.JavaScriptParserProblems;

public class ParserValidationsTest extends AbstractJSParserTest {

	public void testDuplicateParameter() {
		StringList code = new StringList();
		code.add("function hello(param1,param1) {}");
		parse(code.toString());
		assertEquals(JavaScriptParserProblems.DUPLICATE_PARAMETER,
				getProblemId());
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
		assertEquals(JavaScriptParserProblems.VAR_HIDES_ARGUMENT,
				getProblemId());
	}

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

}
