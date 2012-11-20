/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.templates;

import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.ui.templates.ScriptTemplateAccess;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Provides access to Javascript templates
 */
public class JavaScriptTemplateAccess extends ScriptTemplateAccess {
	// Template
	private static final String CUSTOM_TEMPLATES_KEY = "org.eclipse.dltk.javascript.Templates";

	private static JavaScriptTemplateAccess instance;

	public static synchronized JavaScriptTemplateAccess getInstance() {
		if (instance == null) {
			instance = new JavaScriptTemplateAccess();
		}

		return instance;
	}

	/*
	 * @see ScriptTemplateAccess#getPreferenceStore()
	 */
	protected IPreferenceStore getPreferenceStore() {
		return JavaScriptUI.getDefault().getPreferenceStore();
	}

	@Override
	protected String[] getContextTypeIds() {
		return new String[] {
				JavaScriptUniversalTemplateContextType.CONTEXT_TYPE_ID,
				JavaScriptExpressionTemplateContextType.EXPRESSION_CONTEXT_TYPE_ID,
				JSDocTemplateContextType.CONTEXT_TYPE_ID };
	}

	/*
	 * @see ScriptTemplateAccess#getCustomTemplatesKey()
	 */
	protected String getCustomTemplatesKey() {
		return CUSTOM_TEMPLATES_KEY;
	}
}
