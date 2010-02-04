package org.eclipse.dltk.javascript.internal.ui.preferences;

import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage;
import org.eclipse.dltk.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;

public class JavaScriptErrorWarningPreferencePage extends
		AbstractConfigurationBlockPropertyAndPreferencePage {

	@Override
	protected void setDescription() {
		setDescription(JavaScriptPreferenceMessages.ErrorWarningDescription);
	}

	@Override
	protected AbstractOptionsBlock createOptionsBlock(
			IStatusChangeListener newStatusChangedListener, IProject project,
			IWorkbenchPreferenceContainer container) {
		return new JavaScriptErrorWarningConfigurationBlock(
				newStatusChangedListener, project, container);
	}

	@Override
	protected void setPreferenceStore() {
	}

	@Override
	protected String getHelpId() {
		return null;
	}

	@Override
	protected String getProjectHelpId() {
		return null;
	}

	@Override
	protected String getPreferencePageId() {
		return "org.eclipse.dltk.javascript.preferences.error.warning";
	}

	@Override
	protected String getPropertyPageId() {
		return "org.eclipse.dltk.javascript.propertyPage.error.warning";
	}

}
