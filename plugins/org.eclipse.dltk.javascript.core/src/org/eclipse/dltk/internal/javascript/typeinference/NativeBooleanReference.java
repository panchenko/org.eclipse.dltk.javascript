/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

import org.eclipse.dltk.javascript.internal.model.references.ReferenceModelLoader;

/**
 * @author jcompagner
 */
public class NativeBooleanReference extends StandardSelfCompletingReference {

	/**
	 * @param paramOrVarName
	 * @param childIsh
	 */
	public NativeBooleanReference(String paramOrVarName) {
		super(paramOrVarName, false);
	}

	@Override
	protected void createChilds() {
		addChildren(ReferenceModelLoader.getInstance().getChildren("Boolean"));
	}

}
