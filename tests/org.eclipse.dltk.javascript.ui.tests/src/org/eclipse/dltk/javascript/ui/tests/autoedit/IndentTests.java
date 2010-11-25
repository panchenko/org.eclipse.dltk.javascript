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
package org.eclipse.dltk.javascript.ui.tests.autoedit;

import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.internal.ui.editor.JavaScriptDocumentSetupParticipant;
import org.eclipse.dltk.javascript.ui.text.IJavaScriptPartitions;
import org.eclipse.jface.text.BadLocationException;

public class IndentTests extends JSAutoEditStrategyTestCase {

	public void testAfterVarStatement() throws BadLocationException {
		StringList code = new StringList();
		code.add("function test() {");
		code.add(TAB + "var x = null;");
		code.add("}");
		final Document document = new Document(code);
		execute(document, createCommand(ENTER, document.getEndOfLineOffset(1)));
		StringList expected = new StringList();
		expected.add("function test() {");
		expected.add(TAB + "var x = null;");
		expected.add(TAB);
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

	public void testAfterTypedVarStatement() throws BadLocationException {
		StringList code = new StringList();
		code.add("function test() {");
		code.add(TAB + "var x:String = null;");
		code.add("}");
		final Document document = new Document(code);
		execute(document, createCommand(ENTER, document.getEndOfLineOffset(1)));
		StringList expected = new StringList();
		expected.add("function test() {");
		expected.add(TAB + "var x:String = null;");
		expected.add(TAB);
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

	public void testAfterFunction() throws BadLocationException {
		StringList code = new StringList();
		code.add("function test() {");
		final Document document = new Document(code);
		execute(document, createCommand(ENTER, document.getEndOfLineOffset(0)));
		StringList expected = new StringList();
		expected.add("function test() {");
		expected.add(TAB);
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

	public void testJsDocOpen() throws BadLocationException {
		StringList code = new StringList();
		code.add("/*");
		code.add("function test() {");
		code.add("}");
		final Document document = new Document(code);
		execute(document, createCommand(ENTER, document.getEndOfLineOffset(0)));
		StringList expected = new StringList();
		expected.add("/*");
		expected.add(" * ");
		expected.add(" */");
		expected.add("function test() {");
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

	public void testJsDocContinue() throws BadLocationException {
		StringList code = new StringList();
		code.add("/*");
		code.add(" * ");
		code.add(" */");
		code.add("function test() {");
		code.add("}");
		final Document document = new Document(code);
		// TODO setup all strategies
		new JavaScriptDocumentSetupParticipant().setup(document);
		// TODO find correct strategy for offset
		execute(document, createCommand(ENTER, document.getEndOfLineOffset(1)));
		// remove partitioner
		document.setDocumentPartitioner(IJavaScriptPartitions.JS_PARTITIONING,
				null);
		StringList expected = new StringList();
		expected.add("/*");
		expected.add(" * ");
		expected.add(" * ");
		expected.add(" */");
		expected.add("function test() {");
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

}
