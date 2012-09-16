/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.text.completion;

import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.javascript.ui.text.IJavaScriptPartitions;
import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.dltk.ui.text.completion.ContentAssistPreference;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProcessor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;

public class JavaScriptContentAssistPreference extends ContentAssistPreference {
	static JavaScriptContentAssistPreference sDefault;

	protected ScriptTextTools getTextTools() {
		return JavaScriptUI.getDefault().getTextTools();
	}

	public static ContentAssistPreference getDefault() {
		if (sDefault == null) {
			sDefault = new JavaScriptContentAssistPreference();
		}
		return sDefault;
	}

	@Override
	public void configure(ContentAssistant assistant, IPreferenceStore store) {
		super.configure(assistant, store);
		configureJSDocProcessor(assistant, store);
	}

	private static ScriptCompletionProcessor getJSDocProcessor(
			ContentAssistant assistant) {
		IContentAssistProcessor p = assistant
				.getContentAssistProcessor(IJavaScriptPartitions.JS_DOC);
		if (p instanceof ScriptCompletionProcessor)
			return (ScriptCompletionProcessor) p;
		return null;
	}

	private void configureJSDocProcessor(ContentAssistant assistant,
			IPreferenceStore store) {
		ScriptCompletionProcessor jdcp = getJSDocProcessor(assistant);
		if (jdcp == null)
			return;
		// String triggers= store.getString(AUTOACTIVATION_TRIGGERS_JAVADOC);
		// if (triggers != null)
		jdcp.setCompletionProposalAutoActivationCharacters("@#".toCharArray());
		// boolean enabled= store.getBoolean(CASE_SENSITIVITY);
		// jdcp.restrictProposalsToMatchingCases(enabled);
	}
}
