/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.ti;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class ValueCollection implements IValueCollection {

	private final IValueCollection parent;
	private final Map<String, IValueReference> children = new HashMap<String, IValueReference>();

	protected ValueCollection(IValueCollection parent) {
		this.parent = parent;
	}

	public IValueParent getParent() {
		return parent;
	}

	public IValueReference getReturnValue() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.dltk.internal.javascript.ti.IValueCollection#getThis()
	 */
	public IValueReference getThis() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.dltk.internal.javascript.ti.IValueParent#deleteChild(java
	 * .lang.String)
	 */
	public void deleteChild(String name) {
		// TODO Auto-generated method stub

	}

	public Set<String> getDirectChildren() {
		return Collections.unmodifiableSet(children.keySet());
	}

	public IValueReference getChild(String name) {
		return getChild(name, GetMode.GET);
	}

	public IValueReference getChild(String name, GetMode mode) {
		IValueReference child = children.get(name);
		if (child != null) {
			return child;
		}
		if (mode == GetMode.CREATE) {
			child = new ValueReference(this, name);
			children.put(name, child);
		} else if (mode == GetMode.CREATE_LAZY) {
			child = new ValueReferenceProxy(this, name);
		}
		return child;
	}

	public void putChild(String name, IValueReference value) {
		children.put(name, value);
	}

	public boolean isEmpty() {
		return children.isEmpty();
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + children.keySet();
	}

	public ITypeInferenceContext getContext() {
		return parent != null ? parent.getContext() : null;
	}

}
