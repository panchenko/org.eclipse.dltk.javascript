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

package org.eclipse.dltk.javascript.internal.ui.preferences;

import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.javascript.internal.ui.text.SimpleJavascriptSourceViewerConfiguration;
import org.eclipse.dltk.javascript.ui.JavascriptPreferenceConstants;
import org.eclipse.dltk.javascript.ui.text.IJavaScriptPartitions;
import org.eclipse.dltk.ui.formatter.AbstractFormatterPreferencePage;
import org.eclipse.dltk.ui.preferences.PreferenceKey;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.texteditor.ITextEditor;

public class JavaScriptFormatterPreferencePage extends
		AbstractFormatterPreferencePage {

	private static final PreferenceKey FORMATTER = new PreferenceKey(
			JavaScriptUI.PLUGIN_ID, JavascriptPreferenceConstants.FORMATTER_ID);

	protected String getNatureId() {
		return JavaScriptNature.NATURE_ID;
	}

	protected PreferenceKey getFormatterPreferenceKey() {
		return FORMATTER;
	}

	protected IDialogSettings getDialogSettings() {
		return JavaScriptUI.getDefault().getDialogSettings();
	}

	protected String getPreferencePageId() {
		return "org.eclipse.dltk.javascript.preferencePage.formatter"; //$NON-NLS-1$
	}

	protected String getPropertyPageId() {
		return "org.eclipse.dltk.javascript.propertyPage.formatter"; //$NON-NLS-1$
	}

	protected ScriptSourceViewerConfiguration createSimpleSourceViewerConfiguration(
			IColorManager colorManager, IPreferenceStore preferenceStore,
			ITextEditor editor, boolean configureFormatter) {
		return new SimpleJavascriptSourceViewerConfiguration(colorManager,
				preferenceStore, editor, IJavaScriptPartitions.JS_PARTITIONING,
				configureFormatter);
	}

	protected void setPreferenceStore() {
		setPreferenceStore(JavaScriptUI.getDefault().getPreferenceStore());
	}

}
