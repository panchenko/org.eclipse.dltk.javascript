/**
 * 
 */
package org.eclipse.dlkt.javascript.dom.support.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.dltk.internal.javascript.typeinference.IReference;
import org.eclipse.dltk.internal.javascript.typeinference.UnknownReference;
import org.mozilla.javascript.Scriptable;

/**
 * @author jcompagner
 * 
 */
public class ReferenceScope implements Scriptable {
	private final IReference ur;

	public ReferenceScope(IReference ur) {
		this.ur = ur;
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#delete(java.lang.String)
	 */
	public void delete(String name) {
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#delete(int)
	 */
	public void delete(int index) {
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#get(java.lang.String,
	 *      org.mozilla.javascript.Scriptable)
	 */
	public Object get(String name, Scriptable start) {
		IReference child = ur.getChild(name, true);
		if (child instanceof UnknownReference) {
			return new ReferenceScope((UnknownReference) child);
		}
		return null;
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#get(int,
	 *      org.mozilla.javascript.Scriptable)
	 */
	public Object get(int index, Scriptable start) {
		return null;
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#getClassName()
	 */
	public String getClassName() {
		return "UnknowReferenceScope";
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#getDefaultValue(java.lang.Class)
	 */
	public Object getDefaultValue(Class hint) {
		return "UnknowReferenceScope";
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#getIds()
	 */
	public Object[] getIds() {
		Set childs = ur.getChilds(true);
		ArrayList al = new ArrayList();
		Iterator it = childs.iterator();
		while (it.hasNext()) {
			IReference ref = (IReference) it.next();
			al.add(ref.getName());
		}
		return al.toArray();
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#getParentScope()
	 */
	public Scriptable getParentScope() {
		return null;
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#getPrototype()
	 */
	public Scriptable getPrototype() {
		return null;
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#has(java.lang.String,
	 *      org.mozilla.javascript.Scriptable)
	 */
	public boolean has(String name, Scriptable start) {
		return ur.getChild(name, true) != null;
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#has(int,
	 *      org.mozilla.javascript.Scriptable)
	 */
	public boolean has(int index, Scriptable start) {
		return false;
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#hasInstance(org.mozilla.javascript.Scriptable)
	 */
	public boolean hasInstance(Scriptable instance) {
		return false;
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#put(java.lang.String,
	 *      org.mozilla.javascript.Scriptable, java.lang.Object)
	 */
	public void put(String name, Scriptable start, Object value) {
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#put(int,
	 *      org.mozilla.javascript.Scriptable, java.lang.Object)
	 */
	public void put(int index, Scriptable start, Object value) {
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#setParentScope(org.mozilla.javascript.Scriptable)
	 */
	public void setParentScope(Scriptable parent) {
	}

	/**
	 * @see org.mozilla.javascript.Scriptable#setPrototype(org.mozilla.javascript.Scriptable)
	 */
	public void setPrototype(Scriptable prototype) {
	}

	/**
	 * @return
	 */
	public IReference getReference() {
		return ur;
	}
}
