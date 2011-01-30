/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.ui;

import org.eclipse.dltk.compiler.util.Util;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.ui.CodeFormatterConstants;
import org.eclipse.dltk.ui.PreferenceConstants;
import org.eclipse.dltk.ui.coloring.ColoringPreferences;
import org.eclipse.dltk.ui.preferences.NewScriptProjectPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;

public class JavascriptPreferenceConstants extends PreferenceConstants {

	/**
	 * A preference that controls the selected formatter.
	 */
	public static final String FORMATTER_ID = "formatterId"; //$NON-NLS-1$

	public static void initializeDefaultValues(IPreferenceStore store) {
		PreferenceConstants.initializeDefaultValues(store);
		ColoringPreferences.initializeDefaults(store,
				JavaScriptNature.NATURE_ID);

		// PreferenceConverter.setDefault(store,
		// JavascriptPreferenceConstants.EDITOR_XML_BODY_ALL, new RGB(240,
		// 240, 240));

		store.setDefault(PreferenceConstants.EDITOR_SMART_INDENT, true);
		store.setDefault(PreferenceConstants.EDITOR_CLOSE_STRINGS, true);
		store.setDefault(PreferenceConstants.EDITOR_CLOSE_BRACKETS, true);
		store.setDefault(PreferenceConstants.EDITOR_CLOSE_BRACES, true);
		store.setDefault(PreferenceConstants.EDITOR_SMART_TAB, true);
		store.setDefault(PreferenceConstants.EDITOR_SMART_PASTE, true);
		store.setDefault(PreferenceConstants.EDITOR_SMART_HOME_END, true);
		store.setDefault(PreferenceConstants.EDITOR_SUB_WORD_NAVIGATION, true);
		store.setDefault(PreferenceConstants.EDITOR_TAB_WIDTH, 8);
		store.setDefault(
				PreferenceConstants.EDITOR_SYNC_OUTLINE_ON_CURSOR_MOVE, true);

		// folding
		initializeFoldingDefaults(store);

		store.setDefault(CodeFormatterConstants.FORMATTER_TAB_CHAR,
				CodeFormatterConstants.TAB);
		store.setDefault(CodeFormatterConstants.FORMATTER_TAB_SIZE, "4");
		store.setDefault(CodeFormatterConstants.FORMATTER_INDENTATION_SIZE, "4");

		NewScriptProjectPreferencePage.initDefaults(store);

		store.setDefault(PreferenceConstants.APPEARANCE_COMPRESS_PACKAGE_NAMES,
				false);
		store.setDefault(PreferenceConstants.APPEARANCE_METHOD_RETURNTYPE, true);
		store.setDefault(PreferenceConstants.APPEARANCE_METHOD_TYPEPARAMETERS,
				true);
		store.setDefault(
				PreferenceConstants.APPEARANCE_PKG_NAME_PATTERN_FOR_PKG_VIEW,
				""); //$NON-NLS-1$

		store.setDefault(PreferenceConstants.SHOW_SOURCE_MODULE_CHILDREN, true);

		store.setDefault(
				PreferenceConstants.CODEASSIST_AUTOACTIVATION_TRIGGERS, ".");
		store.setDefault(FORMATTER_ID, Util.EMPTY_STRING);
	}

	protected static void initializeFoldingDefaults(IPreferenceStore store) {
		store.setDefault(PreferenceConstants.EDITOR_FOLDING_ENABLED, true);
		store.setDefault(PreferenceConstants.EDITOR_FOLDING_LINES_LIMIT, 2);
		store.setDefault(PreferenceConstants.EDITOR_COMMENTS_FOLDING_ENABLED,
				true);
		store.setDefault(PreferenceConstants.EDITOR_DOCS_FOLDING_ENABLED, true);
		store.setDefault(PreferenceConstants.EDITOR_FOLDING_INIT_COMMENTS, true);
	}
}
