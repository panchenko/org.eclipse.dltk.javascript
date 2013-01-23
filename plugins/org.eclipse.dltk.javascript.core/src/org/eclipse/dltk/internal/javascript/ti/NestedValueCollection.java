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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;

public class NestedValueCollection extends ValueCollection {

	protected NestedValueCollection(IValueCollection parent) {
		super(parent);
	}

	public boolean isScope() {
		return false;
	}

	@Override
	public IValueReference getReturnValue() {
		return getParent().getReturnValue();
	}

	@Override
	public IValueReference getThis() {
		return getParent().getThis();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof NestedValueCollection) {
			return getParent()
					.equals(((NestedValueCollection) obj).getParent());
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return getParent().hashCode();
	}

	protected static void mergeTo(IValueCollection parent,
			final List<NestedValueCollection> collections) {
		final Set<String> names = new HashSet<String>();
		for (NestedValueCollection collection : collections) {
			names.addAll(collection.getValue()
					.getDirectChildren(IValue.DEFAULT));
		}
		List<IValueReference> childValues = new ArrayList<IValueReference>();
		for (String childName : names) {
			childValues.clear();
			for (NestedValueCollection collection : collections) {
				final IValueReference childValue = collection
						.getChild(childName);
				if (childValue.exists()) {
					childValues.add(childValue);
				}
			}
			IValueReference value = parent.getChild(childName);
			boolean set = collections.size() == 2
					&& childValues.size() == collections.size();
			for (IValueReference childValue : childValues) {
				if (set)
					value.setValue(childValue);
				else
					value.addValue(childValue, false);
				set = false;
			}
		}
	}

}
