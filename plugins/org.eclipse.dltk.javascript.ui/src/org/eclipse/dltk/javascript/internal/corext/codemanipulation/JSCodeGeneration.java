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
package org.eclipse.dltk.javascript.internal.corext.codemanipulation;

import static org.eclipse.dltk.javascript.ast.MultiLineComment.JSDOC_PREFIX;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IParameter;
import org.eclipse.dltk.core.IPreferencesLookupDelegate;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.PreferencesLookupDelegate;
import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.javascript.scriptdoc.IndentManipulation;
import org.eclipse.dltk.javascript.scriptdoc.ScriptdocContentAccess;
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.ui.CodeFormatterConstants;

public class JSCodeGeneration {

	public static String getMethodComment(IMethod meth, IMethod overridden,
			String lineDelimiter) {
		String existingComment = null;
		try {
			ISourceRange range = ScriptdocContentAccess.getJavadocRange(meth);
			if (range != null) {
				ISourceModule compilationUnit = meth.getSourceModule();
				existingComment = compilationUnit.getBuffer().getText(
						range.getOffset(), range.getLength());

			}
		} catch (Exception e) {
			// ignore
		}

		StringBuffer buf = new StringBuffer();
		if (existingComment != null && !isEmptyComment(existingComment)) {
			// update existing doc.
			List<String> lines = new ArrayList<String>();
			List<String> paramLines = new ArrayList<String>();
			int paramStart = -1;
			StringTokenizer st = new StringTokenizer(existingComment,
					lineDelimiter);
			while (st.hasMoreTokens()) {
				String line = st.nextToken();
				int index = line.indexOf("@param");
				if (index != -1) {
					if (paramStart == -1)
						paramStart = lines.size() - 1;
					paramLines.add(line);
				} else
					lines.add(line);
			}
			int parameterLength = 0;
			try {
				IParameter[] parameters = meth.getParameters();
				parameterLength = parameters.length;
				outer: for (int paramCounter = 0; paramCounter < parameterLength; paramCounter++) {
					IParameter parameter = parameters[paramCounter];
					for (int i = 0; i < paramLines.size(); i++) {
						String paramLine = paramLines.get(i);
						if (paramLine.indexOf(" " + parameter.getName()) != -1) {
							if (i != paramCounter) {
								paramLines.remove(i);
								paramLines.add(paramCounter, paramLine);
							}
							continue outer;
						}
					}
					paramLines.add(" * @param {Object} " + parameter.getName());
				}
			} catch (ModelException e) {
				// ignore
			}
			if (paramStart == -1)
				paramStart = lines.size() - 2;
			for (int i = 0; i < lines.size(); i++) {
				buf.append(lines.get(i)).append(lineDelimiter);
				if (paramStart == i) {
					for (int j = 0; j < parameterLength; j++) {
						buf.append(paramLines.get(j)).append(lineDelimiter);
					}
				}
			}
		} else {
			buf.append(JSDOC_PREFIX).append(lineDelimiter);
			buf.append(" * Function " + meth.getElementName()).append(lineDelimiter); //$NON-NLS-1$
			try {
				for (IParameter parameter : meth.getParameters()) {
					buf.append(" * @param {Object} " + parameter.getName())
							.append(lineDelimiter);
				}
			} catch (ModelException e) {
				// ignore
			}
			buf.append(" * @return {Object}").append(lineDelimiter); //$NON-NLS-1$
			// try {
			// if (meth.getType() != null) {
			// buf.append(" * @return {");
			// buf.append(meth.getType());
			//					buf.append("}").append(lineDelimiter); //$NON-NLS-1$
			// }
			// } catch (ModelException e) {
			// // ignore
			// }
			buf.append(" */").append(lineDelimiter); //$NON-NLS-1$
		}
		return buf.toString();
	}

	public static String getFieldComment(ISourceModule sourceModule,
			String typeName, String fieldName, String lineDelimiter) {
		StringBuffer buf = new StringBuffer();
		buf.append(JSDOC_PREFIX).append(lineDelimiter);
		buf.append(" * " + fieldName).append(lineDelimiter); //$NON-NLS-1$
		buf.append(" * @type ").append(typeName != null ? typeName : ITypeNames.OBJECT).append(lineDelimiter); //$NON-NLS-1$
		buf.append(" */").append(lineDelimiter); //$NON-NLS-1$
		return buf.toString();
	}

	public static String getTypeComment(ISourceModule sourceModule,
			String typeQualifiedName, String[] typeParameterNames,
			String lineDelimiter) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Returns that part of the indentation of <code>line</code> that makes up a
	 * multiple of indentation units.
	 * 
	 * @param line
	 *            the line to scan
	 * @param project
	 *            the java project from which to get the formatter preferences,
	 *            or <code>null</code> for global preferences
	 * @return the indent part of <code>line</code>, but no odd spaces
	 * @since 3.1
	 */
	public static String getIndentString(String line, IScriptProject project) {
		return IndentManipulation.extractIndentString(line,
				getTabWidth(project), getIndentWidth(project));
	}

	/**
	 * Gets the current tab width.
	 * 
	 * @param project
	 *            The project where the source is used, used for project
	 *            specific options or <code>null</code> if the project is
	 *            unknown and the workspace default should be used
	 * @return The tab width
	 */
	public static int getTabWidth(IScriptProject project) {
		/*
		 * If the tab-char is SPACE, FORMATTER_INDENTATION_SIZE is not used by
		 * the core formatter. We piggy back the visual tab length setting in
		 * that preference in that case.
		 */
		final String key;
		final IPreferencesLookupDelegate prefs = new PreferencesLookupDelegate(
				project);
		if (CodeFormatterConstants.SPACE.equals(prefs.getString(
				JavaScriptUI.PLUGIN_ID,
				CodeFormatterConstants.FORMATTER_TAB_CHAR))) {
			key = CodeFormatterConstants.FORMATTER_INDENTATION_SIZE;
		} else {
			key = CodeFormatterConstants.FORMATTER_TAB_SIZE;
		}
		return prefs.getInt(JavaScriptUI.PLUGIN_ID, key);
	}

	/**
	 * Returns the current indent width.
	 * 
	 * @param project
	 *            the project where the source is used or, <code>null</code> if
	 *            the project is unknown and the workspace default should be
	 *            used
	 * @return the indent width
	 */
	public static int getIndentWidth(IScriptProject project) {
		String key;
		final IPreferencesLookupDelegate prefs = new PreferencesLookupDelegate(
				project);
		if (CodeFormatterConstants.MIXED.equals(prefs.getString(
				JavaScriptUI.PLUGIN_ID,
				CodeFormatterConstants.FORMATTER_TAB_CHAR)))
			key = CodeFormatterConstants.FORMATTER_INDENTATION_SIZE;
		else
			key = CodeFormatterConstants.FORMATTER_TAB_SIZE;

		return prefs.getInt(JavaScriptUI.PLUGIN_ID, key);
	}

	/**
	 * Change the indent of, possible multi-line, code range. The current indent
	 * is removed, a new indent added. The first line of the code will not be
	 * changed. (It is considered to have no indent as it might start in the
	 * middle of a line)
	 * 
	 * @param code
	 *            the code
	 * @param codeIndentLevel
	 *            level of indentation
	 * 
	 * @param project
	 *            the java project from which to get the formatter preferences,
	 *            or <code>null</code> for global preferences
	 * @param newIndent
	 *            new indent
	 * @param lineDelim
	 *            line delimiter
	 * @return the changed code
	 */
	public static String changeIndent(String code, int codeIndentLevel,
			IScriptProject project, String newIndent, String lineDelim) {
		return IndentManipulation.changeIndent(code, codeIndentLevel,
				getTabWidth(project), getIndentWidth(project), newIndent,
				lineDelim);
	}

	private static boolean isEmptyComment(String comment) {
		int begin = 0;
		int end = comment.length();
		while (begin < end && Character.isWhitespace(comment.charAt(begin))) {
			++begin;
		}
		if (begin < end && comment.charAt(begin) == '/') {
			++begin;
		}
		while (begin < end && Character.isWhitespace(comment.charAt(end - 1))) {
			--end;
		}
		if (begin < end && comment.charAt(end - 1) == '/') {
			--end;
		}
		while (begin < end
				&& (Character.isWhitespace(comment.charAt(begin)) || comment
						.charAt(begin) == '*')) {
			++begin;
		}
		return begin >= end;
	}
}