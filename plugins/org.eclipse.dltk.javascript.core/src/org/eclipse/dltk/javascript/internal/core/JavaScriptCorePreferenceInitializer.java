package org.eclipse.dltk.javascript.internal.core;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.dltk.compiler.task.TodoTaskPreferences;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;

public class JavaScriptCorePreferenceInitializer extends
		AbstractPreferenceInitializer {

	public void initializeDefaultPreferences() {
		Preferences store = JavaScriptPlugin.getDefault()
				.getPluginPreferences();

		TodoTaskPreferences.initializeDefaultValues(store);
	}
}
