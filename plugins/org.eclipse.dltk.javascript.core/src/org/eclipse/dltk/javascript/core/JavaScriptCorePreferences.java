/**
 * 
 */
package org.eclipse.dltk.javascript.core;

import org.eclipse.core.runtime.Platform;

/**
 * @author jcompagner
 */
public class JavaScriptCorePreferences {
	public final static String USE_STRICT_MODE = "USE_STRICT_MODE";

	public static boolean isStrictMode() {
		return Platform.getPreferencesService().getBoolean(
				JavaScriptPlugin.PLUGIN_ID, USE_STRICT_MODE, false, null);
	}
}
