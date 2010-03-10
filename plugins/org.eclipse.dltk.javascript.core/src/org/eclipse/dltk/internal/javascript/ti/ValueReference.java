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

import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class ValueReference implements IValueReference {

	private final IValueParent parent;
	private final String name;
	private final Set<Type> types = new HashSet<Type>();
	private final Map<String, IValueReference> children = new HashMap<String, IValueReference>();
	private final Set<String> deletedChildren = new HashSet<String>();
	private Type declaredType;
	private ReferenceKind kind = ReferenceKind.UNKNOWN;
	private ReferenceLocation location = ReferenceLocation.UNKNOWN;

	public ValueReference(IValueParent parent) {
		this(parent, (String) null);
	}

	public ValueReference(IValueParent parent, Type type) {
		this(parent, (String) null);
		if (type != null) {
			this.types.add(type);
		}
	}

	public ValueReference(IValueParent parent, String name) {
		this.parent = parent;
		this.name = name;
	}

	private static final ThreadLocal<Set<IValueReference>> activeAddValue = new ThreadLocal<Set<IValueReference>>() {
		@Override
		protected Set<IValueReference> initialValue() {
			return new HashSet<IValueReference>();
		}
	};

	private boolean isParent(IValueReference value) {
		if (parent == null || parent instanceof IValueCollection) {
			return false;
		}
		IValueParent vParent = value;
		for (;;) {
			if (vParent == null)
				break;
			if (parent.equals(vParent)) {
				return true;
			}
			vParent = vParent.getParent();
		}
		return false;
	}

	public void addValue(IValueReference value) {
		if (value == null) {
			return;
		}
		if (value instanceof IValueReferenceProxy) {
			final IValueReferenceProxy proxy = (IValueReferenceProxy) value;
			if (proxy.isResolved()) {
				value = proxy.resolve();
			}
		}
		if (this.equals(value) || isParent(value)) {
			return;
		}
		final Set<IValueReference> processing = activeAddValue.get();

		// assert (processing.size() < 3);

		if (!processing.add(value)) {
			return;
		}
		try {
			if (location == ReferenceLocation.UNKNOWN
					&& value.getLocation() != ReferenceLocation.UNKNOWN) {
				location = value.getLocation();
			}
			types.addAll(value.getTypes());
			for (String childName : value.getDirectChildren()) {
				final IValueReference child = value.getChild(childName);
				if (child != null) {
					final IValueReference myChild = getChild(childName,
							GetMode.CREATE_NEW);
					if (myChild == null) {
						putChild(childName, child);
					} else {
						assert !(myChild instanceof ValueReferenceProxy);
						myChild.addValue(child);
					}
				}
			}
		} finally {
			processing.remove(value);
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

	public ReferenceKind getKind() {
		return kind;
	}

	public void setKind(ReferenceKind kind) {
		this.kind = kind;
	}

	public ReferenceLocation getLocation() {
		return location;
	}

	public void setLocation(ReferenceLocation location) {
		this.location = location;
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
		return getChild(name, GetMode.GET);
	}

	public IValueReference getChild(String name, GetMode mode) {
		final IValueReference child = children.get(name);
		if (child != null) {
			return child;
		}
		if (mode == GetMode.GET || mode == GetMode.CREATE_LAZY) {
			Member member = findMember(name);
			if (member != null) {
				if (member instanceof Method) {
					return new MethodValueReferenceProxy(this, (Method) member);
				} else {
					return new PropertyValueReferenceProxy(this,
							(Property) member);
				}
			}
		}
		if (mode == GetMode.CREATE || mode == GetMode.CREATE_NEW) {
			final IValueReference newChild = new ValueReference(this, name);
			children.put(name, newChild);
			return newChild;
		} else if (mode == GetMode.CREATE_LAZY) {
			return new ValueReferenceProxy(this, name);
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
	private void putChild(String childName, IValueReference value) {
		children.put(childName, value);
	}

	private Map<String, Object> attributes = null;

	public Object getAttribute(String key) {
		if (attributes != null) {
			return attributes.get(key);
		} else {
			return null;
		}
	}

	public void setAttribute(String key, Object value) {
		if (key == null) {
			throw new NullPointerException();
		}
		if (value == null) {
			if (attributes != null) {
				attributes.remove(key);
			}
		} else {
			if (attributes == null) {
				attributes = new HashMap<String, Object>();
			}
			attributes.put(key, value);
		}
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		if (parent instanceof IValueReference) {
			sb.append(parent);
			sb.append(".");
		}
		if (kind != ReferenceKind.UNKNOWN) {
			sb.append(kind.name());
			sb.append(" ");
		}
		sb.append(name);
		return sb.toString();
	}

	public ITypeInferenceContext getContext() {
		return parent.getContext();
	}

}
