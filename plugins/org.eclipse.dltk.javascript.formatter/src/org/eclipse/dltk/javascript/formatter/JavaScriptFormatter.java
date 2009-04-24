/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladimir Belov)
 *******************************************************************************/

package org.eclipse.dltk.javascript.formatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.formatter.FormatterDocument;
import org.eclipse.dltk.formatter.FormatterWriter;
import org.eclipse.dltk.formatter.IFormatterContainerNode;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.javascript.ast.JavaScriptParser;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.formatter.internal.FormatterNodeBuilder;
import org.eclipse.dltk.javascript.formatter.internal.JavascriptFormatterNodeRewriter;
import org.eclipse.dltk.javascript.formatter.internal.JavaScriptFormatterContext;
import org.eclipse.dltk.ui.formatter.AbstractScriptFormatter;
import org.eclipse.dltk.ui.formatter.FormatterException;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;

public class JavaScriptFormatter extends AbstractScriptFormatter {

	private final String lineDelimiter;

	public JavaScriptFormatter(String lineDelimiter, Map preferences) {
		super(preferences);
		this.lineDelimiter = lineDelimiter;
	}

	public TextEdit format(String source, int offset, int length,
			int indentationLevel) throws FormatterException {
		return new ReplaceEdit(offset, length, format(source, indentationLevel));
	}

	private class ParserProblemReporter implements IProblemReporter {

		private List problems;

		public void reportProblem(IProblem problem) {
			if (problems == null)
				problems = new ArrayList();

			problems.add(problem);
		}

		public Object getAdapter(Class adapter) {
			return null;
		}

		public List getProblems() {
			return problems;
		}

		public boolean isErrorReported() {
			if (problems == null)
				return false;

			for (int i = 0; i < problems.size(); i++) {
				if (((IProblem) problems.get(i)).isError())
					return true;
			}

			return false;
		}

		public String toString() {
			if (problems == null)
				return "No problems";

			StringBuffer buffer = new StringBuffer();
			for (int i = 0; i < problems.size(); i++) {
				buffer.append(problems.toString());
				buffer.append("\n");
			}

			return buffer.toString();
		}
	}

	public String format(String source, int indentationLevel) {

		ParserProblemReporter reporter = new ParserProblemReporter();

		Script root = (Script) new JavaScriptParser().parse(null, source
				.toCharArray(), reporter);

		if (root == null) {
			if (DLTKCore.DEBUG)
				System.out.println(reporter.toString());

			return source;
		}

		return format(source, root, 0);
	}

	private String format(String source, Script ast, int indentationLevel) {

		final FormatterNodeBuilder builder = new FormatterNodeBuilder();
		final FormatterDocument document = createDocument(source);

		IFormatterContainerNode root = builder.build(ast, document);

		new JavascriptFormatterNodeRewriter(ast).rewrite(root);

		IFormatterContext context = new JavaScriptFormatterContext(
				indentationLevel);
		FormatterWriter writer = new FormatterWriter(document, lineDelimiter,
				createIndentGenerator());

		writer
				.setWrapLength(getInt(JavaScriptFormatterConstants.WRAP_COMMENTS_LENGTH));
		writer.setLinesPreserve(1);// FIXME
		writer.setPreserveSpaces(false);

		try {
			root.accept(context, writer);
			writer.flush(context);
			return writer.getOutput();
		} catch (Exception e) {
			e.printStackTrace();
			return source;
		}
	}

	private FormatterDocument createDocument(String input) {
		FormatterDocument document = new FormatterDocument(input);

		// initialize preferences
		String[] options = JavaScriptFormatterConstants.getNames();
		for (int i = 0; i < options.length; i++) {
			String name = options[i];

			if (JavaScriptFormatterConstants.isBoolean(name)) {
				document.setBoolean(name, getBoolean(name));
				// System.out.println(name + " = "
				// + (getBoolean(name) ? "true" : "false"));
				continue;
			}

			if (JavaScriptFormatterConstants.isInteger(name)) {
				// System.out.println(name + " = " + getInt(name));
				document.setInt(name, getInt(name));
				continue;
			}

			if (JavaScriptFormatterConstants.isString(name)) {
				// System.out.println(name + " = " + getString(name));
				document.setString(name, getString(name));
			}
		}

		return document;
	}
}
