/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

/**
 * @author jcompagner
 * 
 */
public class NativeBooleanReference extends UnknownReference {

	/**
	 * @param paramOrVarName
	 * @param childIsh
	 */
	public NativeBooleanReference(String paramOrVarName) {
		super(paramOrVarName, false);
	}

}
