/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

import java.util.Collections;
import java.util.Set;


/**
 * @author jcompagner
 * 
 */
public class NativeNumberReference extends StandardSelfCompletingReference {

	/**
	 * @param paramOrVarName
	 * @param childIsh
	 */
	public NativeNumberReference(String paramOrVarName) {
		super(paramOrVarName, false);
	}

	@Override
	public Set<String> getTypes() {
		return Collections.singleton(ReferenceFactory.NUMBER);
	}

	@Override
	protected void createChilds() {
		addChildren(ReferenceModelLoader.getInstance().getChildren(
				ReferenceFactory.NUMBER));
	}

}
