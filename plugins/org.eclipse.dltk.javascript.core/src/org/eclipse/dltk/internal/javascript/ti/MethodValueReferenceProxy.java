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

import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class MethodValueReferenceProxy implements IValueReference {

	private final IValueParent owner;
	private final Method method;
	private IValueReference resolved = null;

	public MethodValueReferenceProxy(IValueParent owner, Method method) {
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
		if (isResolved()) {
			return resolve().getAttribute(key);
		} else if (IReferenceAttributes.ELEMENT.equals(key)) {
			return method;
		} else {
			return null;
		}
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
			resolved.setAttribute(IReferenceAttributes.ELEMENT, method);
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
			return getContext().getFactory().create(owner, method.getType());
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

	public ITypeInferenceContext getContext() {
		return owner.getContext();
	}

	public Method getMethod() {
		return method;
	}

	@Override
	public String toString() {
		return method.getDeclaringType().getName()
				+ "." + method.getName() + "()"; //$NON-NLS-1$ //$NON-NLS-2$
	}

}
