/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui;

import org.eclipse.dltk.javascript.internal.ui.text.JavascriptColorConstants;
import org.eclipse.dltk.ui.coloring.ColoringPreferences;
import org.eclipse.dltk.ui.coloring.EnablementStyle;
import org.eclipse.dltk.ui.coloring.FontStyle;
import org.eclipse.dltk.ui.coloring.IColoringPreferenceProvider;
import org.eclipse.dltk.ui.coloring.IColoringPreferenceRequestor;
import org.eclipse.dltk.ui.preferences.PreferencesMessages;
import org.eclipse.swt.graphics.RGB;

public class JavaScriptColoringPreferences implements
		IColoringPreferenceProvider {

	public void providePreferences(IColoringPreferenceRequestor requestor) {
		requestor.enterCategory(sCommentsCategory);
		requestor.addPreference(
				JavascriptColorConstants.JS_SINGLE_LINE_COMMENT, "Comments",
				new RGB(63, 127, 95));
		requestor.addPreference(JavascriptColorConstants.JS_TODO_TAG,
				PreferencesMessages.DLTKEditorPreferencePage_CommentTaskTags,
				new RGB(127, 159, 191), FontStyle.BOLD);

		requestor.enterCategory(sDocumentationCategory);
		requestor.addPreference(JavascriptColorConstants.JS_DOC, "JS Doc",
				new RGB(71, 102, 194));
		requestor.addPreference(JavascriptColorConstants.JS_DOC_TAGS,
				"JS Doc Tags", new RGB(71, 102, 194), FontStyle.BOLD);

		requestor.enterCategory(sCoreCategory);
		requestor.addPreference(JavascriptColorConstants.JS_DEFAULT,
				PreferencesMessages.DLTKEditorPreferencePage_others,
				ColoringPreferences.BLACK);
		requestor.addPreference(JavascriptColorConstants.JS_KEYWORD,
				PreferencesMessages.DLTKEditorPreferencePage_keywords, new RGB(
						127, 0, 85), FontStyle.BOLD);
		requestor.addPreference(JavascriptColorConstants.JS_KEYWORD_RETURN,
				PreferencesMessages.DLTKEditorPreferencePage_returnKeyword,
				new RGB(127, 0, 85), FontStyle.BOLD);
		requestor.addPreference(JavascriptColorConstants.JS_STRING,
				PreferencesMessages.DLTKEditorPreferencePage_strings, new RGB(
						42, 0, 255));
		requestor.addPreference(JavascriptColorConstants.JS_PROPERTY,
				"Property names", new RGB(42, 0, 255), EnablementStyle.ON,
				FontStyle.ITALIC);
		requestor.addPreference(JavascriptColorConstants.JS_NUMBER,
				PreferencesMessages.DLTKEditorPreferencePage_numbers, new RGB(
						128, 0, 0));
		requestor.addPreference(
				JavascriptColorConstants.JS_FUNCTION_DEFINITION,
				PreferencesMessages.DLTKEditorPreferencePage_function_colors,
				ColoringPreferences.BLACK);
		requestor.addPreference(JavascriptColorConstants.JS_REGEXP,
				PreferencesMessages.DLTKEditorPreferencePage_regexps, new RGB(
						31, 0, 192), FontStyle.BOLD);
		requestor.addPreference(JavascriptColorConstants.JS_DEPRECATED,
				"Deprecated members", ColoringPreferences.BLACK,
				EnablementStyle.OFF, FontStyle.STRIKETHROUGH);

		requestor.enterCategory("XML");
		requestor.addPreference(JavascriptColorConstants.JS_XML_TAG_NAME,
				"XML Tag Name", ColoringPreferences.BLACK, FontStyle.BOLD);
		requestor.addPreference(JavascriptColorConstants.JS_XML_ATTR_NAME,
				"XML Attribute Name", ColoringPreferences.BLACK,
				FontStyle.ITALIC);
		requestor.addPreference(JavascriptColorConstants.JS_XML_COMMENT_NAME,
				"XML Comment", new RGB(170, 200, 200));
	}
}
