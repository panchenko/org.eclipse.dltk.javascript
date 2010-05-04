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

	public boolean isScope() {
		return false;
	}

	public IValueReference getReturnValue() {
		return parent.getReturnValue();
	}

	public IValueReference getThis() {
		return parent.getThis();
	}

	public Set<String> getDirectChildren() {
		return with.getDirectChildren();
	}

	public Set<String> getDeletedChildren() {
		return with.getDeletedChildren();
	}

	public boolean hasChild(String name) {
		return with.hasChild(name);
	}

	public IValueReference getChild(String name) {
		return with.getChild(name);
	}

	public IValueReference createChild(String name) {
		// TODO Auto-generated method stub
		return parent.createChild(name);
	}

	public IValueCollection getParent() {
		return parent;
	}

	public ITypeInferenceContext getContext() {
		return parent.getContext();
	}

}
