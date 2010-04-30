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

public class ChildReference extends AbstractReference {

	private final IValueProvider parent;
	private final String name;

	public ChildReference(IValueProvider parent, String name) {
		this.parent = parent;
		this.name = name;
	}

	@Override
	public IValue getValue() {
		IValue parentValue = parent.getValue();
		if (parentValue != null) {
			return parentValue.getChild(name);
		} else {
			return null;
		}
	}

	@Override
	public IValue createValue() {
		IValue parentValue = parent.createValue();
		if (parentValue != null) {
			return parentValue.createChild(name);
		} else {
			return null;
		}
	}

	public ITypeInferenceContext getContext() {
		return parent.getContext();
	}

	public IValueParent getParent() {
		// TODO check...
		if (parent instanceof IValueParent) {
			return (IValueParent) parent;
		} else {
			return parent.getParent();
		}
	}

	public void delete() {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return parent.toString() + "." + name;
	}

}
