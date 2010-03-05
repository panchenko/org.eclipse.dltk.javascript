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

import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class PropertyValueReferenceProxy implements IValueReference {

	private final IValueReference owner;
	private final Property property;
	private IValueReference resolved = null;

	public PropertyValueReferenceProxy(IValueReference owner, Property property) {
		this.owner = owner;
		this.property = property;
	}

	public void addValue(IValueReference value) {
		resolve().addValue(value);
	}

	public void clear() {
		resolve().clear();
	}

	public Object getAttribute(String key) {
		return isResolved() ? resolve().getAttribute(key) : null;
	}

	public Type getDeclaredType() {
		return property.getType();
	}

	public ReferenceKind getKind() {
		return ReferenceKind.PROPERTY;
	}

	public ReferenceLocation getLocation() {
		return isResolved() ? resolve().getLocation()
				: ReferenceLocation.UNKNOWN;
	}

	public String getName() {
		return property.getName();
	}

	public Set<Type> getTypes() {
		if (isResolved()) {
			return resolve().getTypes();
		} else if (property.getType() == null) {
			return Collections.emptySet();
		} else {
			return Collections.singleton(property.getType());
		}
	}

	public void setAttribute(String key, Object value) {
		resolve().setAttribute(key, value);
	}

	public void setDeclaredType(Type type) {
		resolve().setDeclaredType(type);
	}

	public void setKind(ReferenceKind kind) {
		resolve().setKind(kind);
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
		return isResolved() || mode != GetMode.GET ? resolve().getChild(name,
				mode) : null;
	}

	public ITypeInferenceContext getContext() {
		return owner.getContext();
	}

	public Set<String> getDirectChildren() {
		return isResolved() ? resolve().getDirectChildren() : Collections
				.<String> emptySet();
	}

	public IValueParent getParent() {
		return owner;
	}

	public boolean isEmpty() {
		return isResolved() ? resolve().isEmpty() : property.getType() == null;
	}

	private boolean isResolved() {
		return resolved != null
				|| owner.getChild(property.getName(), GetMode.RESOLVE) != null;
	}

	private IValueReference resolve() {
		if (resolved == null) {
			resolved = owner.getChild(property.getName(), GetMode.CREATE);
			if (property.getType() != null) {
				resolved.setDeclaredType(property.getType());
			}
		}
		return resolved;
	}

}
