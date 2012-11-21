/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.templates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.javascript.ast.MultiLineComment;
import org.eclipse.dltk.javascript.ast.PropertyInitializer;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.internal.core.codeassist.JavaScriptCompletionUtil;
import org.eclipse.dltk.javascript.internal.core.codeassist.JavaScriptCompletionUtil.ExpressionContext;
import org.eclipse.dltk.javascript.internal.core.codeassist.JavaScriptCompletionUtil.ExpressionType;
import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.ui.formatter.FormatterException;
import org.eclipse.dltk.ui.formatter.FormatterSyntaxProblemException;
import org.eclipse.dltk.ui.formatter.IScriptFormatter;
import org.eclipse.dltk.ui.formatter.IScriptFormatterFactory;
import org.eclipse.dltk.ui.formatter.ScriptFormatterManager;
import org.eclipse.dltk.ui.templates.ScriptTemplateContext;
import org.eclipse.dltk.ui.text.DocumentUtils;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.TextUtilities;
import org.eclipse.jface.text.templates.GlobalTemplateVariables;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateBuffer;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateException;
import org.eclipse.jface.text.templates.TemplateVariable;
import org.eclipse.text.edits.TextEdit;

public class JavaScriptTemplateContext extends ScriptTemplateContext {

	public JavaScriptTemplateContext(TemplateContextType type,
			IDocument document, int completionOffset, int completionLength,
			ISourceModule sourceModule) {
		super(type, document, completionOffset, completionLength, sourceModule);
	}

	public JavaScriptTemplateContext(TemplateContextType type,
			IDocument document, Position position, ISourceModule sourceModule) {
		super(type, document, position, sourceModule);
	}

	@Override
	public TemplateBuffer evaluate(Template template)
			throws BadLocationException, TemplateException {
		if (!canEvaluate(template)) {
			return null;
		}
		final IScriptFormatterFactory factory = ScriptFormatterManager
				.getSelected(JavaScriptNature.NATURE_ID, getSourceModule()
						.getScriptProject().getProject());
		if (factory != null) {
			final IScriptFormatter formatter = factory.createFormatter(
					TextUtilities.getDefaultLineDelimiter(getDocument()),
					factory.retrievePreferences(getPreferences()));
			try {
				final Map<String, String> rememberedVariables = new HashMap<String, String>();
				final String encoded = encodeVariables(template.getPattern(),
						rememberedVariables);
				final TextEdit edit = formatter.format(encoded, 0,
						encoded.length(), 0);
				if (edit != null) {
					final Document document = new Document(encoded);
					edit.apply(document);
					template = new Template(template.getName(),
							template.getDescription(),
							template.getContextTypeId(), restoreVariables(
									document.get(), rememberedVariables),
							template.isAutoInsertable());
				}
			} catch (FormatterSyntaxProblemException e) {
				// ignore & & fall thru
			} catch (FormatterException e) {
				JavaScriptUI.log(e);
			}
		}
		final TemplateBuffer templateBuffer = super.evaluate(template);
		if (templateBuffer != null
				&& !isReadOnly()
				&& templateBuffer.getString().startsWith(
						MultiLineComment.JSDOC_PREFIX)) {
			final ExpressionContext expressionContext = JavaScriptCompletionUtil
					.evaluateExpressionContext(getSourceModule(),
							DocumentUtils.asCharSequence(getDocument()),
							getEnd());
			if (expressionContext != null
					&& expressionContext.expressionType == ExpressionType.PROPERTY_INITIALIZER_VALUE) {
				final String replacement = templateBuffer.getString();
				int docEnd = replacement
						.indexOf(JavaScriptTemplateProposal.C_END);
				if (docEnd > 0) {
					docEnd += JavaScriptTemplateProposal.C_END.length();
					final PropertyInitializer propertyInitializer = (PropertyInitializer) expressionContext.node
							.getParent();

					final String doc = replacement.substring(0, docEnd)
							+ TextUtilities
									.getDefaultLineDelimiter(getDocument())
							+ calculateIndent(getDocument(),
									propertyInitializer.start());

					while (docEnd + 1 < replacement.length()
							&& Character.isWhitespace(replacement
									.charAt(docEnd))) {
						++docEnd;
					}
					if (propertyInitializer.getName().getDocumentation() != null) {
						templateBuffer.setContent(
								replacement.substring(docEnd),
								filterTemplateVariables(
										templateBuffer.getVariables(), docEnd));
					} else {
						final int docOffset = getStart()
								- propertyInitializer.start() + doc.length();
						getDocument().replace(propertyInitializer.start(), 0,
								doc);
						setCompletionOffset(getCompletionOffset()
								+ doc.length());
						for (TemplateVariable variable : templateBuffer
								.getVariables()) {
							int[] offsets = variable.getOffsets();
							for (int i = 0; i < offsets.length; ++i) {
								if (offsets[i] < docEnd) {
									offsets[i] -= docOffset;
								} else {
									offsets[i] -= docEnd;
								}
							}
						}
						templateBuffer.setContent(
								replacement.substring(docEnd),
								templateBuffer.getVariables());
					}
				}
			}
		}
		return templateBuffer;
	}

	private TemplateVariable[] filterTemplateVariables(
			TemplateVariable[] variables, int offset) {
		List<TemplateVariable> result = new ArrayList<TemplateVariable>(
				variables.length);
		for (TemplateVariable variable : variables) {
			int[] offsets = filterOffsets(variable.getOffsets(), offset);
			if (offsets != null) {
				variable.setOffsets(offsets);
				result.add(variable);
			}
		}
		return result.toArray(new TemplateVariable[result.size()]);
	}

	private int[] filterOffsets(int[] offsets, int offset) {
		int[] result = new int[offset];
		int count = 0;
		for (int i = 0; i < offsets.length; ++i) {
			if (offsets[i] >= offset) {
				result[count++] -= offsets[i] - offset;
			}
		}
		if (count == 0) {
			return null;
		} else if (count == result.length) {
			return result;
		} else {
			int[] newResult = new int[count];
			System.arraycopy(result, 0, newResult, 0, count);
			return newResult;
		}
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
					if (variableValue.equals("${"
							+ GlobalTemplateVariables.Cursor.NAME + "}")) {
						variableKey = "/*" + variableKey + "*/";
					}
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
