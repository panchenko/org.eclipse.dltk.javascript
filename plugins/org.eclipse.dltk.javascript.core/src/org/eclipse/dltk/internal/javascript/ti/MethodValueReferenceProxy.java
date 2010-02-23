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

import org.eclipse.dltk.javascript.internal.model.references.Method;
import org.eclipse.dltk.javascript.internal.model.references.Type;

public class MethodValueReferenceProxy implements IValueReference {

	private final IValueReference owner;
	private final Method method;
	private IValueReference resolved = null;

	public MethodValueReferenceProxy(ValueReference owner, Method method) {
		this.owner = owner;
		this.method = method;
	}

	public void addValue(IValueReference value) {
		resolve().addValue(value);
	}

	public void clear() {
		resolve().clear();
	}

	public Type getDeclaredType() {
		return null;
	}

	public Set<String> getDirectChildren() {
		return Collections.singleton(FUNCTION_OP);
	}

	public String getName() {
		return method.getName();
	}

	public Set<Type> getTypes() {
		return Collections.emptySet();
	}

	public void setDeclaredType(Type type) {
		resolve().setDeclaredType(type);
	}

	public ReferenceKind getKind() {
		return ReferenceKind.METHOD;
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

	public Object getAttribute(String key) {
		return isResolved() ? resolve().getAttribute(key) : null;
	}

	public void setAttribute(String key, Object value) {
		resolve().setAttribute(key, value);
	}

	private boolean isResolved() {
		return resolved != null
				|| owner.getChild(method.getName(), GetMode.RESOLVE) != null;
	}

	private IValueReference resolve() {
		if (resolved == null) {
			resolved = owner.getChild(method.getName(), GetMode.CREATE);
			resolved.addValue(this);
		}
		return resolved;
	}

	public void deleteChild(String name) {
		resolve().deleteChild(name);
	}

	public IValueReference getChild(String name) {
		return getChild(name, GetMode.GET);
	}

	public IValueReference getChild(String name, GetMode mode) {
		if (FUNCTION_OP.equals(name)) {
			return IValueTypeFactory.INSTANCE.create(method.getType());
		} else {
			return null;
		}
	}

	public IValueParent getParent() {
		return owner;
	}

	public boolean isEmpty() {
		return false;
	}

}
