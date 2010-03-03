/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

import java.util.Collections;
import java.util.Set;


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
	public Set<String> getTypes() {
		return Collections.singleton(ReferenceFactory.ARRAY);
	}

	@Override
	protected void createChilds() {
		addChildren(ReferenceModelLoader.getInstance().getChildren(
				ReferenceFactory.ARRAY));
	}

}
