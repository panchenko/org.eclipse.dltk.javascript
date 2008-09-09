/**
 * 
 */
package org.eclipse.dlkt.javascript.dom.support.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.dltk.internal.javascript.typeinference.IReference;
import org.eclipse.dltk.internal.javascript.typeinference.UnknownReference;
import org.mozilla.javascript.Scriptable;

/**
 * @author jcompagner
 * 
 */
public class ScriptableScopeReference extends UnknownReference {

	private final Scriptable scriptable;
	private final DOMResolver resolver;

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
	 * @see org.eclipse.dltk.internal.javascript.typeinference.UnknownReference#createChilds()
	 */
	protected void createChilds() {
		HashMap results = new HashMap();
		resolver.fillMap(results, scriptable, false, null);
		HashSet rs = new HashSet();
		resolver.createReferences("", results, rs);
		Iterator iterator = rs.iterator();
		while (iterator.hasNext()) {
			IReference ref = (IReference) iterator.next();
			setChild(ref.getName(), ref);
		}
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
