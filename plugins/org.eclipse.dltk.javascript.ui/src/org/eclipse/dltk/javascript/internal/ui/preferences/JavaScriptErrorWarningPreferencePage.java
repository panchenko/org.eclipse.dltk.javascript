package org.eclipse.dltk.javascript.internal.ui.preferences;

import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.ui.PreferencesAdapter;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPreferencePage;
import org.eclipse.dltk.ui.preferences.IPreferenceConfigurationBlock;
import org.eclipse.dltk.ui.preferences.OverlayPreferenceStore;

public class JavaScriptErrorWarningPreferencePage extends
		AbstractConfigurationBlockPreferencePage {

	protected String getHelpId() {
		return null;
	}

	protected void setDescription() {
		setDescription(JavaScriptPreferenceMessages.ErrorWarningDescription);
	}

	protected IPreferenceConfigurationBlock createConfigurationBlock(
			OverlayPreferenceStore overlayPreferenceStore) {
		return new JavaScriptErrorWarningConfigurationBlock(
				overlayPreferenceStore);
	}

	protected void setPreferenceStore() {
		setPreferenceStore(new PreferencesAdapter(JavaScriptPlugin.getDefault()
				.getPluginPreferences()));
	}
}