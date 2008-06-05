package org.eclipse.dltk.javascript.jsjdtdebugger.handler;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.dltk.javascript.jsjdtdebugger.JavaScriptAndJdtDebuggerPlugin;
import org.eclipse.dltk.javascript.jsjdtdebugger.preferences.IJavaScriptAndJdtDebuggerPreferenceConstants;

public class ToggleSuspendOnException extends
		AbstractTogglePreferenceKeyHandler {

	protected Preferences getPreferences() {
		return JavaScriptAndJdtDebuggerPlugin.getDefault()
				.getPluginPreferences();
	}

	protected String getKey() {
		return IJavaScriptAndJdtDebuggerPreferenceConstants.PREF_BREAK_ON_EXCEPTION;
	}
}
