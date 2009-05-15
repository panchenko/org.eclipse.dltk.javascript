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
import org.eclipse.dltk.formatter.FormatterIndentDetector;
import org.eclipse.dltk.formatter.IFormatterContainerNode;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.javascript.ast.JavaScriptParser;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.formatter.internal.FormatterNodeBuilder;
import org.eclipse.dltk.javascript.formatter.internal.JavaScriptFormatterContext;
import org.eclipse.dltk.javascript.formatter.internal.JavaScriptFormatterWriter;
import org.eclipse.dltk.javascript.formatter.internal.JavascriptFormatterNodeRewriter;
import org.eclipse.dltk.ui.formatter.AbstractScriptFormatter;
import org.eclipse.dltk.ui.formatter.FormatterException;
import org.eclipse.jface.text.IDocument;
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

		String input = source.substring(offset, offset + length);
		int indent = detectIndentationLevel(source, offset);

		String formatted = format(input, indent);

		if (formatted == null)
			return null;

		return new ReplaceEdit(offset, length, formatted);
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

	private int detectIndentationLevel(String input, int offset) {
		ParserProblemReporter reporter = new ParserProblemReporter();

		Script ast = (Script) new JavaScriptParser().parse(null, input
				.toCharArray(), reporter);

		if (ast == null) {
			if (DLTKCore.DEBUG)
				System.out.println(reporter.toString());

			return 0;
		}

		final FormatterNodeBuilder builder = new FormatterNodeBuilder();
		final FormatterDocument fDocument = createDocument(input);
		IFormatterContainerNode root = builder.build(ast, fDocument);
		IFormatterContext context = new JavaScriptFormatterContext(0);

		new JavascriptFormatterNodeRewriter(ast).rewrite(root);

		FormatterIndentDetector detector = new FormatterIndentDetector(offset);
		try {
			root.accept(context, detector);
			return detector.getLevel();
		} catch (Exception e) {
			// ignore all
		}
		return 0;
	}

	public int detectIndentationLevel(IDocument document, int offset) {
		return detectIndentationLevel(document.get(), offset);
	}

	public String format(String source, int indentationLevel) {

		ParserProblemReporter reporter = new ParserProblemReporter();

		Script root = (Script) new JavaScriptParser().parse(null, source
				.toCharArray(), reporter);

		if (root == null) {
			if (DLTKCore.DEBUG)
				System.out.println(reporter.toString());

			return null;
		}

		return format(source, root, indentationLevel);
	}

	private String format(String source, Script ast, int indentationLevel) {

		final FormatterNodeBuilder builder = new FormatterNodeBuilder();
		final FormatterDocument document = createDocument(source);

		IFormatterContainerNode root = builder.build(ast, document);

		new JavascriptFormatterNodeRewriter(ast).rewrite(root);

		IFormatterContext context = new JavaScriptFormatterContext(
				indentationLevel);
		JavaScriptFormatterWriter writer = new JavaScriptFormatterWriter(
				document, lineDelimiter, createIndentGenerator());

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
			return null;
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
				continue;
			}

			if (JavaScriptFormatterConstants.isInteger(name)) {
				document.setInt(name, getInt(name));
				continue;
			}

			if (JavaScriptFormatterConstants.isString(name)) {
				document.setString(name, getString(name));
			}
		}

		return document;
	}
}
