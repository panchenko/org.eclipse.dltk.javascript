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

import java.util.Set;

public class NestedValueCollection implements IValueCollection {

	private final IValueCollection parentCollection;

	public NestedValueCollection(IValueCollection parentCollection) {
		this.parentCollection = parentCollection;
	}

	public IValueParent getParent() {
		return parentCollection;
	}

	public IValueReference getReturnValue() {
		return parentCollection.getReturnValue();
	}

	public IValueReference getThis() {
		return parentCollection.getThis();
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.dltk.internal.javascript.ti.IValueParent#getDirectChildren()
	 */
	public Set<String> getDirectChildren() {
		// TODO Auto-generated method stub
		return null;
	}

	public IValueReference getChild(String name) {
		return getChild(name, GetMode.GET);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.dltk.internal.javascript.ti.IValueParent#getChild(java.lang
	 * .String)
	 */
	public IValueReference getChild(String name, GetMode mode) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.dltk.internal.javascript.ti.IValueParent#isEmpty()
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
