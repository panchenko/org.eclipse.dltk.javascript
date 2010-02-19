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

import java.util.HashMap;
import java.util.Map;

public class ValueCollection implements IValueCollection {

	private final IValueCollection parent;
	private final Map<String, IValueReference> children = new HashMap<String, IValueReference>();

	public ValueCollection() {
		this(null);
	}

	public ValueCollection(IValueCollection parent) {
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

	public IValueReference createChild(String name) {
		IValueReference child = children.get(name);
		if (child == null) {
			child = new ValueReference(this, name);
			children.put(name, child);
		}
		return child;
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

	public IValueReference getChild(String name) {
		return children.get(name);
	}

	public boolean isEmpty() {
		return children.isEmpty();
	}

}
