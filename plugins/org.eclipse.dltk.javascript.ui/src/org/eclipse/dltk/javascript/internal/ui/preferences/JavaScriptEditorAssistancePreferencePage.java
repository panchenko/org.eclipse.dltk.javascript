/*******************************************************************************
 * Copyright (c) 2000, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/

package org.eclipse.dltk.javascript.internal.ui.preferences;

import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.ui.PreferenceConstants;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPreferencePage;
import org.eclipse.dltk.ui.preferences.CodeAssistConfigurationBlock;
import org.eclipse.dltk.ui.preferences.IPreferenceConfigurationBlock;
import org.eclipse.dltk.ui.preferences.OverlayPreferenceStore;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * JavaScript Editor Assistance preferences
 * <p>
 * Note: Must be public since it is referenced from plugin.xml
 * </p>
 */
public class JavaScriptEditorAssistancePreferencePage extends
		AbstractConfigurationBlockPreferencePage {

	@Override
	protected void setPreferenceStore() {
		setPreferenceStore(JavaScriptUI.getDefault().getPreferenceStore());
	}

	@Override
	protected Label createDescriptionLabel(Composite parent) {
		return null; // no description for new look.
	}

	@Override
	protected IPreferenceConfigurationBlock createConfigurationBlock(
			OverlayPreferenceStore overlayPreferenceStore) {
		return new CodeAssistConfigurationBlock(this, overlayPreferenceStore,
				PreferenceConstants.CODEASSIST_SHOW_VISIBLE_PROPOSALS);
	}
}
