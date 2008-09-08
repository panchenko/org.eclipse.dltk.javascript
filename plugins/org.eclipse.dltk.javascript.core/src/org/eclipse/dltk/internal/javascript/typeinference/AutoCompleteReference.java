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
	private boolean calculated;
	private final ReferenceResolverContext cs;

	/**
	 * @param paramOrVarName
	 * @param cs
	 * @param childIsh
	 */
	public AutoCompleteReference(String paramOrVarName, String key,
			ReferenceResolverContext cs) {
		super(paramOrVarName, true);
		this.key = key;
		this.cs = cs;
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.UnknownReference#getChilds(boolean)
	 */
	public Set getChilds(boolean resolveLocals) {
		calculate();
		return super.getChilds(resolveLocals);
	}

	/**
	 * 
	 */
	private void calculate() {
		if (!calculated) {
			calculated = true;
			Set resolveGlobals = cs.resolveGlobals(key + ".");
			Iterator iterator = resolveGlobals.iterator();
			while (iterator.hasNext()) {
				IReference ref = (IReference) iterator.next();
				// AutoCompleteReference autoCompleteReference = new
				// AutoCompleteReference(
				// ref.getName(), key + "." + ref.getName(), cs);
				// if (ref.isFunctionRef())
				// autoCompleteReference.setFunctionRef();
				// if (ref instanceof UnknownReference) {
				// UnknownReference ur = (UnknownReference) ref;
				// autoCompleteReference.setParameterNames(ur
				// .getParameterNames());
				// autoCompleteReference.setProposalInfo(ur.getProposalInfo());
				// }
				// setChild(ref.getName(), autoCompleteReference);
				setChild(ref.getName(), ref);
			}
		}
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.UnknownReference#getChild(java.lang.String,
	 *      boolean)
	 */
	public IReference getChild(String key, boolean resolveLocals) {
		calculate();
		return super.getChild(key, resolveLocals);
	}
}
