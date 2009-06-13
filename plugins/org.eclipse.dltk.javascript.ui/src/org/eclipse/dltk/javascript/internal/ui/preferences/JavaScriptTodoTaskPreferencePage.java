package org.eclipse.dltk.javascript.internal.ui.preferences;

import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.ui.PreferencesAdapter;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage;
import org.eclipse.dltk.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.ui.preferences.TodoTaskOptionsBlock;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;

public class JavaScriptTodoTaskPreferencePage extends
		AbstractConfigurationBlockPropertyAndPreferencePage {

	protected String getHelpId() {
		return null;
	}

	protected void setDescription() {
		setDescription(JavaScriptPreferenceMessages.TodoTaskDescription);
	}

	protected AbstractOptionsBlock createOptionsBlock(
			IStatusChangeListener newStatusChangedListener, IProject project,
			IWorkbenchPreferenceContainer container) {
		return new TodoTaskOptionsBlock(newStatusChangedListener, project,
				container, JavaScriptPlugin.PLUGIN_ID);
	}

	protected String getProjectHelpId() {
		return null;
	}

	protected String getNatureId() {
		return JavaScriptNature.NATURE_ID;
	}

	protected void setPreferenceStore() {
		setPreferenceStore(new PreferencesAdapter(JavaScriptPlugin.getDefault()
				.getPluginPreferences()));
	}

	protected String getPreferencePageId() {
		return "org.eclipse.dltk.javascript.preferences.todo"; //$NON-NLS-1$
	}

	protected String getPropertyPageId() {
		return "org.eclipse.dltk.javascript.propertyPage.todo"; //$NON-NLS-1$
	}

}