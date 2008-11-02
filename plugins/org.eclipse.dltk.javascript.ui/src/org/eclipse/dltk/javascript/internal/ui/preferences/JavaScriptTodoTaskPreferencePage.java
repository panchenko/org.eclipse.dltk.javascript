package org.eclipse.dltk.javascript.internal.ui.preferences;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Preferences;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.ui.PreferencesAdapter;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage;
import org.eclipse.dltk.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.ui.preferences.AbstractTodoTaskOptionsBlock;
import org.eclipse.dltk.ui.preferences.PreferenceKey;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;

public class JavaScriptTodoTaskPreferencePage extends
		AbstractConfigurationBlockPropertyAndPreferencePage {

	static final PreferenceKey CASE_SENSITIVE = AbstractTodoTaskOptionsBlock
			.createCaseSensitiveKey(JavaScriptPlugin.PLUGIN_ID);

	static final PreferenceKey ENABLED = AbstractTodoTaskOptionsBlock
			.createEnabledKey(JavaScriptPlugin.PLUGIN_ID);

	static final PreferenceKey TAGS = AbstractTodoTaskOptionsBlock
			.createTagKey(JavaScriptPlugin.PLUGIN_ID);

	protected String getHelpId() {
		return null;
	}

	protected void setDescription() {
		setDescription(JavaScriptPreferenceMessages.TodoTaskDescription);
	}

	protected Preferences getPluginPreferences() {
		return JavaScriptPlugin.getDefault().getPluginPreferences();
	}

	protected AbstractOptionsBlock createOptionsBlock(
			IStatusChangeListener newStatusChangedListener, IProject project,
			IWorkbenchPreferenceContainer container) {
		return new AbstractTodoTaskOptionsBlock(newStatusChangedListener,
				project, getPreferenceKeys(), container) {
			protected PreferenceKey getTags() {
				return TAGS;
			}

			protected PreferenceKey getEnabledKey() {
				return ENABLED;
			}

			protected PreferenceKey getCaseSensitiveKey() {
				return CASE_SENSITIVE;
			}
		};
	}

	protected String getProjectHelpId() {
		return null;
	}

	protected void setPreferenceStore() {
		setPreferenceStore(new PreferencesAdapter(JavaScriptPlugin.getDefault()
				.getPluginPreferences()));
	}

	protected String getPreferencePageId() {
		return "org.eclipse.dltk.javascript.preferences.todo";
	}

	protected String getPropertyPageId() {
		return "org.eclipse.dltk.javascript.propertyPage.todo";
	}

	protected PreferenceKey[] getPreferenceKeys() {
		return new PreferenceKey[] { TAGS, ENABLED, CASE_SENSITIVE };
	}
}