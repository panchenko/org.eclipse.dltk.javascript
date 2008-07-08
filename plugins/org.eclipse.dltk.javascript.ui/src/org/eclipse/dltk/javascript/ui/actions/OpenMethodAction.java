/**
 * 
 */
package org.eclipse.dltk.javascript.ui.actions;

import org.eclipse.dltk.javascript.internal.ui.JavaScriptUILanguageToolkit;
import org.eclipse.dltk.ui.IDLTKUILanguageToolkit;

/**
 * @author jcompagner
 * 
 */
public class OpenMethodAction extends
		org.eclipse.dltk.ui.actions.OpenMethodAction {

	/**
	 * @see org.eclipse.dltk.ui.actions.OpenMethodAction#getUILanguageToolkit()
	 */
	protected IDLTKUILanguageToolkit getUILanguageToolkit() {
		return new JavaScriptUILanguageToolkit();
	}

}
