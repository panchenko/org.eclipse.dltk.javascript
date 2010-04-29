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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class NestedValueCollection implements IValueCollection {

	private final IValueCollection parent;

	private final Map<String, IValueReference> locals = new HashMap<String, IValueReference>();

	protected NestedValueCollection(IValueCollection parent) {
		this.parent = parent;
	}

	public Set<String> getDirectChildren() {
		return Collections.unmodifiableSet(locals.keySet());
	}

	public IValueReference getChild(String name) {
		return getChild(name, GetMode.GET);
	}

	public IValueReference getChild(String name, GetMode mode) {
		IValueReference child = locals.get(name);
		if (child != null) {
			return child;
		}
		if (mode == GetMode.CREATE || mode == GetMode.CREATE_NEW) {
			child = new ValueReference(this, name);
			locals.put(name, child);
			return child;
		}
		child = parent.getChild(name, GetMode.GET);
		if (child != null) {
			return child;
		}
		if (mode == GetMode.GET || mode == GetMode.CREATE_LAZY) {
			final Element element = getContext().resolve(name);
			if (element != null) {
				if (element instanceof Method) {
					return new MethodValueReferenceProxy(this, (Method) element);
				} else if (element instanceof Property) {
					return new PropertyValueReferenceProxy(this,
							(Property) element);
				} else if (element instanceof Type) {
					return new ValueReference(this, (Type) element);
				}
			}
		}
		if (mode == GetMode.CREATE_LAZY) {
			child = new ValueReferenceProxy(this, name);
		}
		return child;
	}

	public IValueReference getReturnValue() {
		return parent.getReturnValue();
	}

	public IValueReference getThis() {
		return parent.getThis();
	}

	public IValueParent getParent() {
		return parent;
	}

	public ITypeInferenceContext getContext() {
		return parent.getContext();
	}

	public void deleteChild(String name) {
		// TODO Auto-generated method stub

	}

	protected static void mergeTo(IValueCollection parent,
			final List<NestedValueCollection> collections) {
		final Set<String> names = new HashSet<String>();
		for (NestedValueCollection collection : collections) {
			names.addAll(collection.locals.keySet());
		}
		for (String childName : names) {
			IValueReference value = parent.getChild(childName, GetMode.CREATE);
			for (NestedValueCollection collection : collections) {
				final IValueReference childValue = collection.locals
						.get(childName);
				if (childName != null)
					value.addValue(childValue);
			}
		}
	}

}
