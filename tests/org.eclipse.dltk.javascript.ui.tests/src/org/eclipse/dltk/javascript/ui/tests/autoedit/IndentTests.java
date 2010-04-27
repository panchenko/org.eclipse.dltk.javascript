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

import junit.framework.TestCase;

import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.jface.text.BadLocationException;

public class IndentTests extends TestCase {

	private final TestStrategy strategy = new TestStrategy();

	protected void apply(Document document, Cmd cmd) {
		strategy.customizeDocumentCommand(document, cmd);
		cmd.apply(document);
	}

	public void testAfterVarStatement() throws BadLocationException {
		StringList code = new StringList();
		code.add("function test() {");
		code.add("\t" + "var x = null;");
		code.add("}");
		final Document document = new Document(code.toString());
		apply(document, new Cmd("\n", document.getEndOfLineOffset(1)));
		StringList expected = new StringList();
		expected.add("function test() {");
		expected.add("\t" + "var x = null;");
		expected.add("\t");
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

	public void testAfterTypedVarStatement() throws BadLocationException {
		StringList code = new StringList();
		code.add("function test() {");
		code.add("\t" + "var x:String = null;");
		code.add("}");
		final Document document = new Document(code.toString());
		apply(document, new Cmd("\n", document.getEndOfLineOffset(1)));
		StringList expected = new StringList();
		expected.add("function test() {");
		expected.add("\t" + "var x:String = null;");
		expected.add("\t");
		expected.add("}");
		assertEquals(expected.toString(), document.get());
	}

}
