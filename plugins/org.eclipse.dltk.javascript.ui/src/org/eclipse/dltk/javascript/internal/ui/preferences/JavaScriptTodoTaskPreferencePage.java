package org.eclipse.dltk.javascript.internal.ui.preferences;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.ui.preferences.TodoTaskAbstractPreferencePage;

public class JavaScriptTodoTaskPreferencePage extends
		TodoTaskAbstractPreferencePage {

	protected Preferences getPluginPreferences() {
		return JavaScriptPlugin.getDefault().getPluginPreferences();
	}

	protected String getHelpId() {
		return null;
	}

	protected void setDescription() {
		setDescription(JavaScriptPreferenceMessages.TodoTaskDescription);
	}
}
