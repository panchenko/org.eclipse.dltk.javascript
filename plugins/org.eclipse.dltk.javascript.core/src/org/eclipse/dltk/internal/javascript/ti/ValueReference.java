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
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.javascript.internal.model.references.Member;
import org.eclipse.dltk.javascript.internal.model.references.Method;
import org.eclipse.dltk.javascript.internal.model.references.Type;

public class ValueReference implements IValueReference {

	private final IValueParent parent;
	private final String name;
	private final Set<Type> types = new HashSet<Type>();
	private final Map<String, IValueReference> children = new HashMap<String, IValueReference>();
	private final Set<String> deletedChildren = new HashSet<String>();
	private Type declaredType;

	public ValueReference() {
		this((String) null);
	}

	public ValueReference(Type type) {
		this((String) null);
		if (type != null) {
			this.types.add(type);
		}
	}

	public ValueReference(String name) {
		this(null, name);
	}

	public ValueReference(IValueParent parent, String name) {
		this.parent = parent;
		this.name = name;
	}

	public void addValue(IValueReference value) {
		if (value == null) {
			return;
		}
		types.addAll(value.getTypes());
		for (String childName : value.getDirectChildren()) {
			final IValueReference child = value.getChild(childName);
			if (child != null) {
				createChild(childName).addValue(child);
			}
		}
	}

	public void clear() {
		types.clear();
		children.clear();
	}

	public Type getDeclaredType() {
		return declaredType;
	}

	public String getName() {
		return name;
	}

	public IValueParent getParent() {
		return parent;
	}

	public Set<String> getDirectChildren() {
		return Collections.unmodifiableSet(children.keySet());
	}

	public Set<Type> getTypes() {
		return types;
	}

	public void setDeclaredType(Type type) {
		this.declaredType = type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.dltk.internal.javascript.ti.IValueReference#setLocal(boolean)
	 */
	public void setLocal(boolean local) {
		// TODO Auto-generated method stub

	}

	public IValueReference createChild(String name) {
		IValueReference child = children.get(name);
		if (child == null) {
			child = new ValueReference(this, name);
			children.put(name, child);
		}
		return child;
	}

	public void deleteChild(String name) {
		deletedChildren.add(name);
	}

	private Member findMemberInType(Type type, String name) {
		if (type != null) {
			for (Member member : type.getMembers()) {
				if (name.equals(member.getName())) {
					return member;
				}
			}
		}
		return null;
	}

	private Member findMember(String name) {
		Member member = findMemberInType(declaredType, name);
		if (member != null) {
			return member;
		}
		for (Type type : types) {
			member = findMemberInType(type, name);
			if (member != null) {
				return member;
			}
		}
		return null;
	}

	public IValueReference getChild(String name) {
		final IValueReference child = children.get(name);
		if (child != null) {
			return child;
		}
		Member member = findMember(name);
		if (member != null) {
			if (member instanceof Method) {
				return new MethodValueReferenceProxy(this, (Method) member);
			}
		}
		return null;
	}

	public boolean isEmpty() {
		return types.isEmpty() && children.isEmpty();
	}

	/**
	 * @param childName
	 * @param value
	 */
	public void putChild(String childName, IValueReference value) {
		children.put(childName, value);
	}

}
