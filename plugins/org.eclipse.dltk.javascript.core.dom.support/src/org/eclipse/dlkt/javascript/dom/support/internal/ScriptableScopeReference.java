/**
 * 
 */
package org.eclipse.dlkt.javascript.dom.support.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.dltk.internal.javascript.typeinference.IReference;
import org.eclipse.dltk.internal.javascript.typeinference.UnknownReference;
import org.mozilla.javascript.Scriptable;

/**
 * @author jcompagner
 * 
 */
public class ScriptableScopeReference extends UnknownReference {

	private boolean calculated;
	private final Scriptable scriptable;
	private final DOMResolver resolver;
	private ScriptableScopeReference parentRef;

	/**
	 * @param paramOrVarName
	 * @param cs
	 * @param childIsh
	 */
	public ScriptableScopeReference(String paramOrVarName,
			Scriptable scriptable, DOMResolver resolver) {
		super(paramOrVarName, true);
		this.scriptable = scriptable;
		this.resolver = resolver;
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
			HashMap results = new HashMap();
			resolver.fillMap(results, scriptable, false, null);
			HashSet rs = new HashSet();
			resolver.createReferences("", results, rs);
			Iterator iterator = rs.iterator();
			while (iterator.hasNext()) {
				IReference ref = (IReference) iterator.next();
				if (ref instanceof ScriptableScopeReference) {
					ScriptableScopeReference ssr = (ScriptableScopeReference) ref;
					ssr.parentRef = this;
					if (parentRef != null) {
						IReference child = parentRef.testRecursion(ref);
						if (child != null) {
							ref = child;
						}
					}
				}
				setChild(ref.getName(), ref);
			}
		}
	}

	/**
	 * @param ref
	 * @return
	 */
	private IReference testRecursion(IReference ref) {
		if (this.equals(ref))
			return this;
		if (parentRef != null)
			return parentRef.testRecursion(ref);
		return null;
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.UnknownReference#getChild(java.lang.String,
	 *      boolean)
	 */
	public IReference getChild(String key, boolean resolveLocals) {
		calculate();
		return super.getChild(key, resolveLocals);
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.UnknownReference#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj instanceof ScriptableScopeReference && super.equals(obj)) {
			ScriptableScopeReference ssr = (ScriptableScopeReference) obj;
			return scriptable.equals(ssr.scriptable);
		}
		return false;
	}
}
