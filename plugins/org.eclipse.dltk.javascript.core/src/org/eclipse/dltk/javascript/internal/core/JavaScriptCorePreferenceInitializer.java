package org.eclipse.dltk.javascript.internal.core;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.dltk.compiler.task.TaskTagUtils;
import org.eclipse.dltk.javascript.core.JavaScriptCorePreferences;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;

public class JavaScriptCorePreferenceInitializer extends
		AbstractPreferenceInitializer {

	public void initializeDefaultPreferences() {
		Preferences store = JavaScriptPlugin.getDefault()
				.getPluginPreferences();

		store.setDefault(JavaScriptCorePreferences.USE_STRICT_MODE, false);
		TaskTagUtils.initializeDefaultValues(store);
	}
}
