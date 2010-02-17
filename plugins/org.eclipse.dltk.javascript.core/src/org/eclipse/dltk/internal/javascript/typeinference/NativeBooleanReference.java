/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

import java.util.Collections;
import java.util.Set;

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
	public Set<String> getTypes() {
		return Collections.singleton(ReferenceFactory.BOOLEAN);
	}

	@Override
	protected void createChilds() {
		addChildren(ReferenceModelLoader.getInstance().getChildren(
				ReferenceFactory.BOOLEAN));
	}

}
