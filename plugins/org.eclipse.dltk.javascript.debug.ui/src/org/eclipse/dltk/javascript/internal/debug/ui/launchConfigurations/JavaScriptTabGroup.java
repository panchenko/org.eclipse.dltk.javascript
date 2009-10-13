package org.eclipse.dltk.javascript.internal.debug.ui.launchConfigurations;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.dltk.debug.ui.launchConfigurations.InterpreterTab;

public class JavaScriptTabGroup extends AbstractLaunchConfigurationTabGroup {
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		final JavaScriptMainLaunchConfigurationTab main = new JavaScriptMainLaunchConfigurationTab(
				mode);
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { main,
				new JavaScriptArgumentsTab(), new InterpreterTab(main),
				new EnvironmentTab(),
				// new SourceContainerLookupTab(),
				// new CommonTab()
				new JavaScriptCommonTab() };
		setTabs(tabs);
	}
}
