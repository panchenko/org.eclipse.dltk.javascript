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

public class WithValueCollection implements IValueCollection {

	private final IValueCollection parent;

	private final IValueReference with;

	public WithValueCollection(IValueCollection parent, IValueReference with) {
		this.parent = parent;
		this.with = with;
	}

	public IValueReference getReturnValue() {
		return parent.getReturnValue();
	}

	public IValueReference getThis() {
		return parent.getThis();
	}

	public void deleteChild(String name) {
		with.deleteChild(name);
	}

	public Set<String> getDirectChildren() {
		return with.getDirectChildren();
	}

	public IValueReference getChild(String name) {
		return with.getChild(name);
	}

	public IValueReference getChild(String name, GetMode mode) {
		return with.getChild(name, mode);
	}

	public IValueParent getParent() {
		// TODO ?
		return parent;
	}

	public boolean isEmpty() {
		return with.isEmpty();
	}

	public Object getAttribute(String key) {
		return parent.getAttribute(key);
	}

	public void setAttribute(String key, Object value) {
		parent.setAttribute(key, value);
	}

}
