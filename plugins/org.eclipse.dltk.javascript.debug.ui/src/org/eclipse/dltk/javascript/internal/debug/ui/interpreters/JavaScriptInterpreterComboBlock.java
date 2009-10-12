package org.eclipse.dltk.javascript.internal.debug.ui.interpreters;

import org.eclipse.dltk.debug.ui.launchConfigurations.IMainLaunchConfigurationTabListenerManager;
import org.eclipse.dltk.internal.debug.ui.interpreters.AbstractInterpreterComboBlock;
import org.eclipse.dltk.javascript.core.JavaScriptNature;

public class JavaScriptInterpreterComboBlock extends
		AbstractInterpreterComboBlock {

	protected JavaScriptInterpreterComboBlock(
			IMainLaunchConfigurationTabListenerManager tab) {
		super(tab);
	}

	protected String getCurrentLanguageNature() {
		return JavaScriptNature.NATURE_ID;
	}
}
