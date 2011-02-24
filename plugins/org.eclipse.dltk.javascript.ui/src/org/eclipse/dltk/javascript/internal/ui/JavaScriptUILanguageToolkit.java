/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui;

import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.javascript.core.JavaScriptLanguageToolkit;
import org.eclipse.dltk.javascript.internal.ui.editor.JavaScriptEditor;
import org.eclipse.dltk.javascript.internal.ui.templates.JavaScriptTemplateAccess;
import org.eclipse.dltk.javascript.internal.ui.text.SimpleJavascriptSourceViewerConfiguration;
import org.eclipse.dltk.javascript.ui.text.IJavaScriptPartitions;
import org.eclipse.dltk.ui.AbstractDLTKUILanguageToolkit;
import org.eclipse.dltk.ui.ScriptElementLabels;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.dltk.ui.text.templates.ITemplateAccess;
import org.eclipse.dltk.ui.viewsupport.ScriptUILabelProvider;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.preference.IPreferenceStore;

public class JavaScriptUILanguageToolkit extends AbstractDLTKUILanguageToolkit {
	private static final ScriptElementLabels sInstance = new JavaScriptElementLabels();

	public ScriptElementLabels getScriptElementLabels() {
		return sInstance;
	}

	public IPreferenceStore getPreferenceStore() {
		return JavaScriptUI.getDefault().getPreferenceStore();
	}

	public IDLTKLanguageToolkit getCoreToolkit() {
		return JavaScriptLanguageToolkit.getDefault();
	}

	public IDialogSettings getDialogSettings() {
		return JavaScriptUI.getDefault().getDialogSettings();
	}

	public String getEditorId(Object inputElement) {
		if (inputElement instanceof IMember) {
			// test if a member really points to another javascript file.
			ISourceModule sourceModule = ((IMember) inputElement)
					.getSourceModule();
			if (sourceModule != null && sourceModule.getResource() != null) {
				if (!"js".equalsIgnoreCase(sourceModule.getResource()
						.getFileExtension()))
					return null;
			}
		}
		return JavaScriptEditor.EDITOR_ID;
	}

	public String getPartitioningId() {
		return IJavaScriptPartitions.JS_PARTITIONING;
	}

	public String getInterpreterContainerId() {
		return "org.eclipse.dltk.javascript.launching.INTERPRETER_CONTAINER";
	}

	public ScriptUILabelProvider createScriptUILabelProvider() {
		return null;
	}

	public boolean getProvideMembers(ISourceModule element) {
		return true;
	}

	public ScriptTextTools getTextTools() {
		return JavaScriptUI.getDefault().getTextTools();
	}

	public ScriptSourceViewerConfiguration createSourceViewerConfiguration() {
		return new SimpleJavascriptSourceViewerConfiguration(getTextTools()
				.getColorManager(), getPreferenceStore(), null,
				getPartitioningId(), false);
	}

	public String getInterpreterPreferencePage() {
		return "org.eclipse.dltk.debug.ui.JavaScriptInterpreters";
	}

	public String getDebugPreferencePage() {
		return "org.eclipse.dltk.javascript.preferences.debug";
	}

	private static final String[] EDITOR_PREFERENCE_PAGES_IDS = {
			"org.eclipse.dltk.javascript.ui.EditorPreferences",
			"org.eclipse.dltk.javascript.ui.editor.SyntaxColoring",
			"org.eclipse.dltk.javascript.ui.editor.SmartTyping",
			"org.eclipse.dltk.javascript.ui.editor.JavascriptFolding",
			"javascriptTemplatePreferencePage",
			"org.eclipse.dltk.javascript.ui.editor.Hovers",
			"org.eclipse.dltk.javascript.ui.editor.MarkOccurrencesPreference" };

	public String[] getEditorPreferencePages() {
		return EDITOR_PREFERENCE_PAGES_IDS;
	}

	@Override
	public ITemplateAccess getEditorTemplates() {
		return JavaScriptTemplateAccess.getInstance();
	}
}
