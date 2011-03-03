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
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public class Value implements IValue, IValue2 {

	protected final JSTypeSet types = JSTypeSet.create();
	private final Map<String, Value> children = new HashMap<String, Value>(4,
			0.9f);
	private final Map<String, IValue> inherited = new HashMap<String, IValue>(
			4, 0.9f);
	private final Map<String, IValue> elementValues = new HashMap<String, IValue>(
			4, 0.9f);
	private Set<String> deletedChildren = null;
	private JSType declaredType;
	private ReferenceKind kind = ReferenceKind.UNKNOWN;
	private ReferenceLocation location = ReferenceLocation.UNKNOWN;
	private Map<String, Object> attributes = null;
	protected Set<Value> references = new HashSet<Value>(4, 0.9f);

	private final boolean hasReferences() {
		return !references.isEmpty();
	}

	public Set<Value> getReferences() {
		return references;
	}

	private static interface Handler<R> {
		void process(Value value, R result);
	}

	private static <R> void execute(Value value, Handler<R> handler, R result,
			Set<IValue> visited) {
		if (visited.add(value)) {
			if (value instanceof ILazyValue)
				((ILazyValue) value).resolve();
			handler.process(value, result);
			for (Value child : value.references) {
				execute(child, handler, result, visited);
			}
		}
	}

	private static final Handler<JSTypeSet> GET_TYPES = new Handler<JSTypeSet>() {
		public void process(Value value, JSTypeSet result) {
			result.addAll(value.types);
		}
	};

	public JSTypeSet getTypes() {
		if (hasReferences()) {
			final JSTypeSet result = JSTypeSet.create();
			execute(this, GET_TYPES, result, new HashSet<IValue>());
			return result;
		} else {
			return types;
		}
	}

	private static final Handler<JSTypeSet> GET_DECLARED_TYPES = new Handler<JSTypeSet>() {
		public void process(Value value, JSTypeSet result) {
			if (value.declaredType != null)
				result.add(value.declaredType);
		}
	};

	public JSType getDeclaredType() {
		if (hasReferences()) {
			final JSTypeSet result = JSTypeSet.create();
			execute(this, GET_DECLARED_TYPES, result, new HashSet<IValue>());
			return !result.isEmpty() ? result.getFirst() : null;
		} else {
			return declaredType;
		}
	}

	public JSTypeSet getDeclaredTypes() {
		if (hasReferences()) {
			final JSTypeSet result = JSTypeSet.create();
			execute(this, GET_DECLARED_TYPES, result, new HashSet<IValue>());
			return result;
		} else {
			return declaredType != null ? JSTypeSet.singleton(declaredType)
					: JSTypeSet.emptySet();
		}
	}

	public void setDeclaredType(JSType declaredType) {
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

	public final Object getAttribute(String key) {
		return getAttribute(key, false);
	}

	public Object getAttribute(String key, boolean includeReferences) {
		Object attribute = null;
		if (attributes != null) {
			attribute = attributes.get(key);
		}
		if (includeReferences && attribute == null && !references.isEmpty()) {
			for (Value reference : references) {
				attribute = reference.getAttribute(key, includeReferences);
				if (attribute != null)
					break;
			}
		}
		return attribute;
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

	private static final Handler<Set<String>> GET_DIRECT_CHILDREN = new Handler<Set<String>>() {
		public void process(Value value, Set<String> result) {
			result.addAll(value.children.keySet());
		}
	};

	public Set<String> getDirectChildren() {
		if (hasReferences()) {
			final Set<String> result = new HashSet<String>();
			execute(this, GET_DIRECT_CHILDREN, result, new HashSet<IValue>());
			return result;
		} else {
			return children.keySet();
		}
	}

	public Set<String> getDeletedChildren() {
		if (deletedChildren != null) {
			return deletedChildren;
		} else {
			return Collections.emptySet();
		}
	}

	public void deleteChild(String name) {
		if (deletedChildren == null) {
			deletedChildren = new HashSet<String>();
		}
		deletedChildren.add(name);
	}

	protected IValue findMember(String name, boolean resolve) {
		IValue value = elementValues.get(name);
		if (value == null) {
			value = ElementValue.findMember(declaredType, name);
			if (value != null) {
				elementValues.put(name, value);
				return value;
			}
			for (JSType type : types) {
				value = ElementValue.findMember(type, name);
				if (value != null) {
					elementValues.put(name, value);
					return value;
				}
			}
		}
		return value;
	}

	private static class GetChildHandler implements Handler<Set<IValue>> {

		private final String childName;

		public GetChildHandler(String childName) {
			this.childName = childName;
		}

		public void process(Value value, Set<IValue> result) {
			Value child = value.children.get(childName);
			if (child != null) {
				result.add(child);
			} else {
				IValue member = ElementValue.findMember(value.declaredType,
						childName);
				if (member != null) {
					result.add(member);
				}
				JSTypeSet valueTypes = null;
				if (value.hasReferences()) {
					valueTypes = value.types;
				} else {
					valueTypes = value.getTypes();
				}
				for (JSType type : valueTypes) {
					member = ElementValue.findMember(type, childName);
					if (member != null) {
						result.add(member);
					}
				}
			}
		}
	};

	public IValue getChild(String name, boolean resolve) {
		if (hasReferences()) {
			Set<IValue> result = new HashSet<IValue>();
			execute(this, new GetChildHandler(name), result,
					new HashSet<IValue>());
			if (!result.isEmpty()) {
				return result.iterator().next();
			} else {
				return findMember(name, resolve);
			}
		} else {
			IValue child = children.get(name);
			if (child == null) {
				child = inherited.get(name);
				if (child == null) {
					child = findMember(name, resolve);
				}
			}
			return child;
		}
	}

	public void putChild(String name, IValue value) {
		inherited.put(name, value);
	}

	private static class CreateChildOperation implements Handler<Set<IValue>> {

		private final String childName;

		public CreateChildOperation(String childName) {
			this.childName = childName;
		}

		public void process(Value value, Set<IValue> result) {
			if (result.isEmpty() && !value.hasReferences()) {
				result.add(value.createChild(childName));
			}
		}

	}

	public IValue createChild(String name) {
		IValue child = children.get(name);
		if (child == null) {
			child = inherited.get(name);
			if (child == null) {
				child = findMember(name, true);
				if (child != null) {
					return child;
				}
				if (hasReferences()) {
					Set<IValue> result = new HashSet<IValue>();
					execute(this, new CreateChildOperation(name), result,
							new HashSet<IValue>());
					if (!result.isEmpty()) {
						return result.iterator().next();
					}
				}
				child = new Value();
				children.put(name, (Value) child);
			}
		}
		return child;
	}

	public boolean hasChild(String name) {
		return children.containsKey(name) || inherited.containsKey(name);
	}

	public void clear() {
		references.clear();
		children.clear();
		inherited.clear();
		types.clear();
	}

	public void addValue(IValue src) {
		if (src instanceof Value) {
			final IdentityHashMap<Value, Value> processing = new IdentityHashMap<Value, Value>();
			addValueRecursive((Value) src, processing, 0);
			// translate references, so they point to the new value
			for (Map.Entry<Value, Value> entry : processing.entrySet()) {
				final Value input = entry.getKey();
				final Value output = entry.getValue();
				for (Value ref : input.references) {
					Value refOut = processing.get(ref);
					if (refOut == null) {
						refOut = ref;
					}
					output.references.add(refOut);
				}
			}
		} else {
			if (src.getDeclaredType() != null) {
				types.add(src.getDeclaredType());
			}
			types.addAll(src.getTypes());
			if (src.getKind() == ReferenceKind.METHOD) {
				final Object element = src
						.getAttribute(IReferenceAttributes.ELEMENT);
				if (element != null) {
					setAttribute(IReferenceAttributes.ELEMENT, element);
				}
				final IValue returnType = src.getChild(
						IValueReference.FUNCTION_OP, false);
				if (returnType != null) {
					final JSTypeSet myReturnTypes = createChild(
							IValueReference.FUNCTION_OP).getTypes();
					myReturnTypes.addAll(returnType.getTypes());
					myReturnTypes.addAll(returnType.getDeclaredTypes());
				}
			}
		}
	}

	public void addReference(IValue src) {
		assert src != null;
		if (src == this)
			return;
		if (src instanceof Value)
			references.add((Value) src);
	}

	private void addValueRecursive(Value src, Map<Value, Value> processing,
			int depth) {
		if (!processing.containsKey(src)) {
			processing.put(src, this);
			if (depth > 8) {
				// TODO logging?
				return;
			}
			if (src.declaredType != null) {
				types.add(src.declaredType);
			}
			types.addAll(src.types);
			// (references will be copied later)
			if (src.attributes != null) {
				if (attributes == null) {
					attributes = new HashMap<String, Object>();
				}
				attributes.putAll(src.attributes);
			}
			for (Map.Entry<String, Value> entry : src.children.entrySet()) {
				IValue child = createChild(entry.getKey());
				if (child instanceof Value) {
					((Value) child).addValueRecursive(entry.getValue(),
							processing, depth + 1);
				}
			}
			if (src.kind != ReferenceKind.UNKNOWN
					&& kind == ReferenceKind.UNKNOWN) {
				kind = src.kind;
			}
			if (src.location != ReferenceLocation.UNKNOWN
					&& location == ReferenceLocation.UNKNOWN) {
				location = src.location;
			}
		}
	}

	public void putDirectChild(String name, Value value) {
		children.put(name, value);
	}

	public void resolveLazyValues(Set<Value> visited) {
		if (visited.add(this)) {
			for (Value value : references) {
				if (value instanceof ILazyValue
						&& !((ILazyValue) value).isResolved()) {
					((ILazyValue) value).setFinalResolve();
				} else {
					value.resolveLazyValues(visited);
				}
			}
			for (Value value : children.values()) {
				value.resolveLazyValues(visited);
			}

			if (attributes != null) {
				for (Object attibute : attributes.values()) {
					if (attibute instanceof IValueProvider) {
						IValue value = ((IValueProvider) attibute).getValue();
						if (value instanceof Value) {
							((Value) value).resolveLazyValues(visited);
						}
					}
				}
			}
		}
	}
}
