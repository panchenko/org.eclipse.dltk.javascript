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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class Value implements IValue {

	private final Set<Type> types = new HashSet<Type>();
	private final Map<String, Value> children = new HashMap<String, Value>();
	private Type declaredType;
	private ReferenceKind kind = ReferenceKind.UNKNOWN;
	private ReferenceLocation location = ReferenceLocation.UNKNOWN;
	private Map<String, Object> attributes = null;

	public Set<Type> getTypes() {
		return types;
	}

	public Type getDeclaredType() {
		return declaredType;
	}

	public void setDeclaredType(Type declaredType) {
		this.declaredType = declaredType;
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

	public Object getAttribute(String key) {
		if (attributes != null) {
			return attributes.get(key);
		} else {
			return null;
		}
	}

	public void removeAttribute(String key) {
		if (attributes != null) {
			attributes.remove(key);
		}
	}

	public void setAttribute(String key, Object value) {
		if (attributes == null) {
			attributes = new HashMap<String, Object>();
		}
		attributes.put(key, value);
	}

	public Set<String> getDirectChildren() {
		return children.keySet();
	}

	protected IValue findMember(String name) {
		IValue member = ElementValue.findMember(declaredType, name);
		if (member != null) {
			return member;
		}
		for (Type type : types) {
			member = ElementValue.findMember(type, name);
			if (member != null) {
				return member;
			}
		}
		return null;
	}

	public IValue getChild(String name) {
		IValue child = children.get(name);
		if (child == null) {
			child = findMember(name);
		}
		return child;
	}

	public IValue createChild(String name) {
		Value child = children.get(name);
		if (child == null) {
			child = new Value();
			children.put(name, child);
		}
		return child;
	}

	public boolean hasChild(String name) {
		return children.containsKey(name);
	}

	public void clear() {
		children.clear();
		types.clear();
	}

	public void addValue(IValue src) {
		if (src instanceof Value) {
			addValueRecursive((Value) src, new HashSet<Value>());
		} else {
			if (src.getDeclaredType() != null) {
				types.add(src.getDeclaredType());
			}
			types.addAll(src.getTypes());
		}
	}

	private void addValueRecursive(Value src, Set<Value> processing) {
		if (processing.add(src)) {
			if (src.declaredType != null) {
				types.add(src.declaredType);
			}
			types.addAll(src.types);
			for (Map.Entry<String, Value> entry : src.children.entrySet()) {
				Value child = (Value) createChild(entry.getKey());
				if (child != null) {
					child.addValueRecursive(entry.getValue(), processing);
				}
			}
		}
	}
}
