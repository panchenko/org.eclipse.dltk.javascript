package org.eclipse.dltk.javascript.internal.debug.ui.handlers;

import org.eclipse.dltk.debug.ui.handlers.AbstractToggleClassVariableHandler;
import org.eclipse.dltk.javascript.internal.debug.JavaScriptDebugConstants;
import org.eclipse.dltk.javascript.internal.debug.JavaScriptDebugPlugin;
import org.eclipse.dltk.ui.PreferencesAdapter;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Toggles the display of javascript class variables in the debug 'Variables'
 * view
 */
public class ToggleClassVariablesHandler extends
		AbstractToggleClassVariableHandler {

	/*
	 * @see org.eclipse.dltk.debug.ui.handlers.AbstractToggleVariableHandler#getModelId()
	 */
	protected String getModelId() {
		return JavaScriptDebugConstants.DEBUG_MODEL_ID;
	}

	/*
	 * @see org.eclipse.dltk.debug.ui.handlers.AbstractToggleVariableHandler#getPreferenceStore()
	 */
	protected IPreferenceStore getPreferenceStore() {
		return new PreferencesAdapter(JavaScriptDebugPlugin.getDefault()
				.getPluginPreferences());
	}
}
