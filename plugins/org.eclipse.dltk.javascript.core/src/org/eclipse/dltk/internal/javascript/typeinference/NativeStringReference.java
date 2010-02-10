/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

import org.eclipse.dltk.javascript.internal.model.references.ReferenceModelLoader;

/**
 * @author jcompagner
 */
public class NativeStringReference extends StandardSelfCompletingReference {

	/**
	 * @param paramOrVarName
	 * @param childIsh
	 */
	public NativeStringReference(String paramOrVarName) {
		super(paramOrVarName, false);
	}

	@Override
	protected void createChilds() {
		addChildren(ReferenceModelLoader.getInstance().getChildren("String"));
	}

}
