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

public abstract class ValueCollection implements IValueCollection,
		IValueProvider {

	private final IValueCollection parent;
	private final IValue value;

	protected ValueCollection(IValueCollection parent) {
		this(parent, new Value());
	}

	protected ValueCollection(IValueCollection parent, IValue value) {
		this.parent = parent;
		this.value = value;
	}

	public IValueCollection getParent() {
		return parent;
	}

	public IValueReference getReturnValue() {
		return null;
	}

	public IValueReference getThis() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isReference() {
		return true;
	}

	public IValue getValue() {
		return value;
	}

	public IValue createValue() {
		return getValue();
	}

	public Set<String> getDirectChildren() {
		return value.getDirectChildren();
	}

	public Set<String> getDeletedChildren() {
		return value.getDeletedChildren();
	}

	public boolean hasChild(String name) {
		IValue value = getValue();
		return value != null && value.getChild(name) != null;
	}

	public IValueReference getChild(String name) {
		return newChild(name);
	}

	private ChildReference newChild(String name) {
		return new ChildReference(this, name);
	}

	public IValueReference createChild(String name) {
		IValueCollection coll = this;
		for (;;) {
			IValue childValue = ((IValueProvider) coll).getValue().getChild(
					name);
			if (childValue != null) {
				if (coll != this) {
					getValue().putChild(name, childValue);
				}
				return newChild(name);
			}
			coll = coll.getParent();
			if (coll == null)
				break;
			if (coll.isScope())
				break;
		}
		coll = this;
		while (!coll.isScope()) {
			coll = coll.getParent();
		}
		IValue childValue = getValue().createChild(name);
		if (coll != this) {
			getValue().putChild(name, childValue);
		}
		return newChild(name);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

	public ITypeInferenceContext getContext() {
		return parent != null ? parent.getContext() : null;
	}

}
