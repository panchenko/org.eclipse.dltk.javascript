/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

import org.eclipse.dltk.javascript.internal.model.references.ReferenceModelLoader;

/**
 * @author jcompagner
 */
public class NativeArrayReference extends StandardSelfCompletingReference {

	/**
	 * @param paramOrVarName
	 * @param childIsh
	 */
	public NativeArrayReference(String paramOrVarName) {
		super(paramOrVarName, false);

	}

	@Override
	protected void createChilds() {
		addChildren(ReferenceModelLoader.getInstance().getChildren("Array"));
	}

}
