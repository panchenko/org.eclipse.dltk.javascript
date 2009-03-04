package org.eclipse.dltk.javascript.ui.scriptcolor.provider;

import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Implement this interface instead of {@link IScriptColorProvider} if you also
 * want to contribute to the preference dialog for editing the colors/text
 * attributes for you keys that you supply
 * 
 * @author jcompagner
 */
public interface IScriptColorPreferenceProvider extends IScriptColorProvider {

	public String[] getCategories();

	public String[][] getSyntaxColorListModel();

	public IPreferenceStore getPreferenceStore();

	public void save();

	/**
	 * @return
	 */
	public Object getPreferenceKeyPrefix();
}
