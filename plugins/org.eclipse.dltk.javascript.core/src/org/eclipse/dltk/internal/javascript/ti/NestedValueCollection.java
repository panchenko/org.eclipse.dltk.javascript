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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NestedValueCollection extends ValueCollection {

	protected NestedValueCollection(IValueCollection parent) {
		super(parent);
	}

	@Override
	public IValueReference getReturnValue() {
		return ((IValueCollection) getParent()).getReturnValue();
	}

	@Override
	public IValueReference getThis() {
		return ((IValueCollection) getParent()).getThis();
	}

	protected static void mergeTo(IValueCollection parent,
			final List<NestedValueCollection> collections) {
		final Set<String> names = new HashSet<String>();
		for (NestedValueCollection collection : collections) {
			names.addAll(collection.getValue().getDirectChildren());
		}
		for (String childName : names) {
			IValueReference value = parent.getChild(childName, GetMode.CREATE);
			for (NestedValueCollection collection : collections) {
				final IValueReference childValue = collection
						.getChild(childName);
				if (childValue.exists()) {
					value.addValue(childValue);
				}
			}
		}
	}

}
