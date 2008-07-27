package org.eclipse.dltk.javascript.internal.debug.ui;

import org.eclipse.dltk.debug.ui.DLTKDebugUIPluginPreferenceInitializer;
import org.eclipse.dltk.javascript.core.JavaScriptNature;

public class JavaScriptDebugUIPreferenceInitializer extends
		DLTKDebugUIPluginPreferenceInitializer {

	protected String getNatureId() {
		return JavaScriptNature.NATURE_ID;
	}

}
