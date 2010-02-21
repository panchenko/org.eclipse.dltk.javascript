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
import java.util.Set;

import org.eclipse.dltk.javascript.internal.model.references.Type;

public class ValueReferenceProxy implements IValueReference {

	private final IValueParent parent;
	private final String name;

	public ValueReferenceProxy(IValueParent parent, String name) {
		this.parent = parent;
		this.name = name;
	}

	public void addValue(IValueReference value) {
		resolve().addValue(value);
	}

	public void clear() {
		resolve().clear();
	}

	public Type getDeclaredType() {
		return isResolved() ? resolve().getDeclaredType() : null;
	}

	public Set<String> getDirectChildren() {
		return isResolved() ? resolve().getDirectChildren() : Collections
				.<String> emptySet();
	}

	public String getName() {
		return name;
	}

	public Set<Type> getTypes() {
		return (isResolved() ? resolve().getTypes() : Collections
				.<Type> emptySet());
	}

	public void setDeclaredType(Type type) {
		resolve().setDeclaredType(type);
	}

	public void setLocal(boolean local) {
		resolve().setLocal(local);
	}

	public void deleteChild(String name) {
		resolve().deleteChild(name);
	}

	public IValueReference getChild(String name) {
		return getChild(name, GetMode.GET);
	}

	public IValueReference getChild(String name, GetMode mode) {
		if (mode == GetMode.CREATE || isResolved()) {
			return resolve().getChild(name, mode);
		} else if (mode == GetMode.RESOLVE) {
			return null;
		} else {
			return new ValueReferenceProxy(this, name);
		}
	}

	public IValueParent getParent() {
		return parent;
	}

	public boolean isEmpty() {
		return isResolved() ? resolve().isEmpty() : true;
	}

	private IValueReference resolve() {
		if (resolved == null) {
			resolved = parent.getChild(name, GetMode.CREATE);
		}
		return resolved;
	}

	private IValueReference resolved = null;

	private boolean isResolved() {
		return resolved != null
				|| parent.getChild(name, GetMode.RESOLVE) != null;
	}

	@Override
	public String toString() {
		return (parent instanceof IValueReference ? parent.toString() : "ROOT")
				+ "->" + name;
	}

}
