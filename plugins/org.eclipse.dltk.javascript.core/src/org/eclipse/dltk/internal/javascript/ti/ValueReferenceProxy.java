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

public class ValueReferenceProxy implements IValueReference,
		IValueReferenceProxy {

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

	public ReferenceKind getKind() {
		return isResolved() ? resolve().getKind() : ReferenceKind.UNKNOWN;
	}

	public void setKind(ReferenceKind kind) {
		resolve().setKind(kind);
	}

	public ReferenceLocation getLocation() {
		return isResolved() ? resolve().getLocation()
				: ReferenceLocation.UNKNOWN;
	}

	public void setLocation(ReferenceLocation location) {
		resolve().setLocation(location);
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

	public Object getAttribute(String key) {
		return isResolved() ? resolve().getAttribute(key) : null;
	}

	public void setAttribute(String key, Object value) {
		resolve().setAttribute(key, value);
	}

	public IValueReference resolve() {
		if (resolved == null) {
			resolved = parent.getChild(name, GetMode.CREATE);
			assert resolved != null;
			assert !(resolved instanceof ValueReferenceProxy);
		}
		return resolved;
	}

	private IValueReference resolved = null;

	public boolean isResolved() {
		return resolved != null
				|| parent.getChild(name, GetMode.RESOLVE) != null;
	}

	@Override
	public String toString() {
		return (parent instanceof IValueReference ? parent.toString() : "ROOT")
				+ "->" + name;
	}

	@Override
	public int hashCode() {
		return name.hashCode() ^ parent.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ValueReferenceProxy) {
			final ValueReferenceProxy other = (ValueReferenceProxy) obj;
			return name.equals(other.name) && parent.equals(other.parent);
		}
		return false;
	}

}
