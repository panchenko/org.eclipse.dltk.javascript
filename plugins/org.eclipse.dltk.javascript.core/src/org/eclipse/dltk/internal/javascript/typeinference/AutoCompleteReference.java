/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

import java.util.Iterator;
import java.util.Set;

import org.eclipse.dltk.internal.javascript.reference.resolvers.ReferenceResolverContext;

/**
 * @author jcompagner
 * 
 */
public class AutoCompleteReference extends UnknownReference {

	private final String key;
	private final ReferenceResolverContext cs;

	/**
	 * @param paramOrVarName
	 * @param cs
	 * @param childIsh
	 */
	public AutoCompleteReference(String paramOrVarName, String key,
			ReferenceResolverContext cs) {
		super(paramOrVarName, false);
		this.key = key;
		this.cs = cs;
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.UnknownReference#createChilds()
	 */
	protected void createChilds() {
		Set resolveGlobals = cs.resolveGlobals(key + ".");
		Iterator iterator = resolveGlobals.iterator();
		while (iterator.hasNext()) {
			IReference ref = (IReference) iterator.next();
			setChild(ref.getName(), ref);
		}
	}
}
