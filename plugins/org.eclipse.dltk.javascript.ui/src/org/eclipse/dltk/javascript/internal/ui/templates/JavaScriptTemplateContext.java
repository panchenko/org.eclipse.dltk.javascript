/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.templates;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.ui.formatter.FormatterException;
import org.eclipse.dltk.ui.formatter.IScriptFormatter;
import org.eclipse.dltk.ui.formatter.IScriptFormatterFactory;
import org.eclipse.dltk.ui.formatter.ScriptFormatterManager;
import org.eclipse.dltk.ui.templates.ScriptTemplateContext;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextUtilities;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateBuffer;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateException;
import org.eclipse.text.edits.TextEdit;

public class JavaScriptTemplateContext extends ScriptTemplateContext {

	public JavaScriptTemplateContext(TemplateContextType type,
			IDocument document, int completionOffset, int completionLength,
			ISourceModule sourceModule) {
		super(type, document, completionOffset, completionLength, sourceModule);
	}

	@Override
	public TemplateBuffer evaluate(Template template)
			throws BadLocationException, TemplateException {
		if (!canEvaluate(template)) {
			return null;
		}
		final IScriptFormatterFactory factory = ScriptFormatterManager
				.getSelected(getSourceModule().getScriptProject());
		if (factory != null) {
			final IScriptFormatter formatter = factory.createFormatter(
					TextUtilities.getDefaultLineDelimiter(getDocument()),
					factory.retrievePreferences(getPreferences()));
			try {
				final Map<String, String> remeberedVariables = new HashMap<String, String>();
				final String encoded = encodeVariables(template.getPattern(),
						remeberedVariables);
				final TextEdit edit = formatter.format(encoded, 0, encoded
						.length(), 0);
				if (edit != null) {
					final Document document = new Document(encoded);
					edit.apply(document);
					template = new Template(
							template.getName(),
							template.getDescription(),
							template.getContextTypeId(),
							restoreVariables(document.get(), remeberedVariables),
							template.isAutoInsertable());
				}
			} catch (FormatterException e) {
				JavaScriptUI.log(e);
			}
		}
		return super.evaluate(template);
	}

	/**
	 * Temporary replace variables with unique keys, so variables would not
	 * cause parsing errors during formatting.
	 * 
	 * @param content
	 * @param variables
	 * @return
	 */
	private static String encodeVariables(String content,
			Map<String, String> variables) {
		final StringBuilder bf = new StringBuilder(content.length() * 2);
		boolean in = false;
		final String prefix = "specialSecret12435Id";
		int r = 0;
		int pos = -1;
		for (int a = 0; a < content.length(); a++) {
			char c = content.charAt(a);
			if (c == '$') {
				if (a < content.length() - 1)
					if (content.charAt(a + 1) == '{') {
						in = true;
						pos = a;
					}
			} else if (in) {
				if (c == '}') {
					String variableValue = content.substring(pos, a + 1);
					String variableKey = prefix + r++;
					bf.append(variableKey);
					variables.put(variableKey, variableValue);
					in = false;
				}
			} else if (!in) {
				bf.append(c);
			}
		}
		return bf.toString();
	}

	private static String restoreVariables(String value,
			Map<String, String> variables) {
		String formatted = value;
		for (Map.Entry<String, String> entry : variables.entrySet()) {
			formatted = replaceSeq(formatted, entry.getKey(), entry.getValue());
		}
		return formatted;
	}

	private static String replaceSeq(String sq, String target,
			String replacement) {
		// return Pattern.compile(target.toString(), Pattern.LITERAL).matcher(
		// sq).replaceAll(Matcher.quoteReplacement(replacement.toString()));
		int indexOf = sq.indexOf(target);
		while (indexOf != -1) {
			sq = sq.substring(0, indexOf) + replacement
					+ sq.substring(indexOf + target.length());
			indexOf = sq.indexOf(target);
		}
		return sq;
	}
}
