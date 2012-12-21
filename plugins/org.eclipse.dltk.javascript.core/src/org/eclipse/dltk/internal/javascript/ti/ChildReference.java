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

import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;

public class ChildReference extends AbstractReference {

	private final IValueProvider parent;
	private final String name;

	public ChildReference(IValueProvider parent, String name) {
		this.parent = parent;
		this.name = name;
	}

	public boolean isReference() {
		if (FUNCTION_OP.equals(name) || ARRAY_OP.equals(name)) {
			return false;
		}
		return parent.isReference();
	}

	@Override
	public IValue getValue() {
		if (parent instanceof IValueCollection) {
			return findChild((IValueCollection) parent, name);
		}
		IValue parentValue = parent.getValue();
		if (parentValue != null) {
			return parentValue.getChild(name, true);
		}
		return null;
	}

	private static IValue findChild(IValueCollection collection, String name) {
		while (collection != null) {
			if (collection instanceof IValueProvider) {
				// XXX WithValueCollection doesn't implement IValueProvider
				IValue childValue = ((IValueProvider) collection).getValue()
						.getChild(name, true);
				if (childValue != null) {
					return childValue;
				}
			}
			collection = collection.getParent();
		}
		return null;
	}

	@Override
	public IValue createValue() {
		if (parent instanceof IValueCollection) {
			IValue childValue = findChild((IValueCollection) parent, name);
			if (childValue != null) {
				return childValue;
			}
		}
		IValue parentValue = parent.createValue();
		if (parentValue != null) {
			return parentValue.createChild(name, 0);
		} else {
			return null;
		}
	}

	public IValueReference getParent() {
		if (parent instanceof IValueReference) {
			return (IValueReference) parent;
		} else {
			return null;
		}
	}

	public void delete(boolean force) {
		final IValue value = parent.getValue();
		if (value != null) {
			value.deleteChild(name, force);
		}
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return parent.toString() + "." + name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ChildReference) {
			final ChildReference other = (ChildReference) obj;
			return name.equals(other.name) && parent.equals(other.parent);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

}
