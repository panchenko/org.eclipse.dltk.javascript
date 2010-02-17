/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

import org.eclipse.dltk.internal.javascript.reference.resolvers.IResolvableReference;
import org.eclipse.dltk.internal.javascript.reference.resolvers.ReferenceResolverContext;
import org.mozilla.javascript.Scriptable;

/**
 * @author jcompagner
 * 
 */
public class ScriptableScopeReference extends StandardSelfCompletingReference
		implements IResolvableReference {

	private final Scriptable scriptable;
	private final ReferenceResolverContext resolver;

	/**
	 * @param paramOrVarName
	 * @param cs
	 * @param childIsh
	 */
	public ScriptableScopeReference(String paramOrVarName,
			Scriptable scriptable, ReferenceResolverContext resolver) {
		super(paramOrVarName, true);
		this.scriptable = scriptable;
		this.resolver = resolver;
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.StandardSelfCompletingReference#createChilds()
	 */
	protected void createChilds() {

		for (IReference r : resolver.resolveChilds(this)) {
			setChild(r.getName(), r);
		}

		// HashMap results = new HashMap();
		// resolver.fillMap(results, scriptable, false, null);
		// HashSet rs = new HashSet();
		// resolver.createReferences("", results, rs);
		// Iterator iterator = rs.iterator();
		// while (iterator.hasNext()) {
		// IReference ref = (IReference) iterator.next();
		// setChild(ref.getName(), ref);
		// }
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.StandardSelfCompletingReference#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj instanceof ScriptableScopeReference && super.equals(obj)) {
			ScriptableScopeReference ssr = (ScriptableScopeReference) obj;
			return scriptable.equals(ssr.scriptable);
		}
		return false;
	}

	/**
	 * @return
	 */
	public Scriptable getScriptable() {
		return scriptable;
	}
}
