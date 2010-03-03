/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

import java.util.Collections;
import java.util.Set;


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
	public Set<String> getTypes() {
		return Collections.singleton(ReferenceFactory.STRING);
	}

	@Override
	protected void createChilds() {
		addChildren(ReferenceModelLoader.getInstance().getChildren(
				ReferenceFactory.STRING));
	}

}
