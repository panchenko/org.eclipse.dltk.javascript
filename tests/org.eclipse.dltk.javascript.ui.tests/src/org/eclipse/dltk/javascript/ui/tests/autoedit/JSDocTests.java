package org.eclipse.dltk.javascript.ui.tests.autoedit;

import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.jface.text.BadLocationException;

public class JSDocTests extends JSAutoEditStrategyTestCase {

	public void testInsertJsDoc() throws BadLocationException {
		StringList code = new StringList();
		code.add("/**");
		code.add("function test() {");
		code.add("}");
		final Document document = new Document(code);
		execute(document, createCommand(ENTER, document.getEndOfLineOffset(0)));
		StringList expected = new StringList();
		expected.add("/**");
		expected.add(" * ");
		expected.add(" */");
		expected.add("function test() {");
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

	public void testContinueJsDoc() throws BadLocationException {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * FUNCTION");
		code.add(" */");
		code.add("function test() {");
		code.add("}");
		final Document document = new Document(code);
		execute(document, createCommand(ENTER, document.getEndOfLineOffset(1)));
		StringList expected = new StringList();
		expected.add("/**");
		expected.add(" * FUNCTION");
		expected.add(" * ");
		expected.add(" */");
		expected.add("function test() {");
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

}
