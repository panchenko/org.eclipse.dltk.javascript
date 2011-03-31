package org.eclipse.dltk.internal.javascript.ti;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public class ImmutableValue implements IValue, IValue2 {

	private Map<String, IValue> elementValues;

	protected JSType declaredType;
	protected final JSTypeSet types;
	protected Set<String> deletedChildren;
	protected ReferenceKind kind = ReferenceKind.UNKNOWN;
	protected ReferenceLocation location = ReferenceLocation.UNKNOWN;

	protected final Map<String, ImmutableValue> children;
	protected final Map<String, IValue> inherited;
	protected final Set<ImmutableValue> references;
	protected Map<String, Object> attributes;

	protected static interface Handler<R> {
		void process(ImmutableValue value, R result);
	}

	public ImmutableValue() {
		super();
		types = JSTypeSet.create();
		children = new HashMap<String, ImmutableValue>(4, 0.9f);
		inherited = new HashMap<String, IValue>(4, 0.9f);
		references = new HashSet<ImmutableValue>(4, 0.9f);
	}

	public ImmutableValue(JSType declaredType, JSTypeSet types,
			Set<String> deletedChildren, ReferenceKind kind,
			ReferenceLocation location, Map<String, ImmutableValue> children,
			Map<String, IValue> inherited, Set<ImmutableValue> references,
			Map<String, Object> attributes) {
		this.declaredType = declaredType;
		this.types = types;
		this.deletedChildren = deletedChildren;
		this.kind = kind;
		this.location = location;
		this.children = children;
		this.inherited = inherited;
		this.references = references;
		this.attributes = attributes;
	}

	protected final boolean hasReferences() {
		return !references.isEmpty();
	}

	public Set<? extends IValue> getReferences() {
		return references;
	}

	protected static <R> void execute(ImmutableValue value, Handler<R> handler,
			R result, Set<IValue> visited) {
		if (visited.add(value)) {
			if (value instanceof ILazyValue)
				((ILazyValue) value).resolve();
			handler.process(value, result);
			for (ImmutableValue child : value.references) {
				execute(child, handler, result, visited);
			}
		}
	}

	private static final Handler<JSTypeSet> GET_TYPES = new Handler<JSTypeSet>() {
		public void process(ImmutableValue value, JSTypeSet result) {
			result.addAll(value.types);
		}
	};
	private static final Handler<JSTypeSet> GET_DECLARED_TYPES = new Handler<JSTypeSet>() {
		public void process(ImmutableValue value, JSTypeSet result) {
			if (value.declaredType != null)
				result.add(value.declaredType);
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

	private static final Handler<Set<String>> GET_DIRECT_CHILDREN = new Handler<Set<String>>() {
		public void process(ImmutableValue value, Set<String> result) {
			result.addAll(value.children.keySet());
		}
	};

	public JSType getDeclaredType() {
		if (declaredType != null) {
			return declaredType;
		} else if (hasReferences()) {
			final JSTypeSet result = JSTypeSet.create();
			execute(this, GET_DECLARED_TYPES, result, new HashSet<IValue>());
			return !result.isEmpty() ? result.getFirst() : null;
		} else {
			return null;
		}
	}

	public JSTypeSet getDeclaredTypes() {
		if (declaredType != null) {
			return JSTypeSet.singleton(declaredType);
		} else if (hasReferences()) {
			final JSTypeSet result = JSTypeSet.create();
			execute(this, GET_DECLARED_TYPES, result, new HashSet<IValue>());
			return result;
		} else {
			return JSTypeSet.emptySet();
		}
	}

	public ReferenceKind getKind() {
		return kind;
	}

	public ReferenceLocation getLocation() {
		return location;
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
			for (ImmutableValue reference : references) {
				attribute = reference.getAttribute(key, includeReferences);
				if (attribute != null)
					break;
			}
		}
		return attribute;
	}

	protected static class GetChildHandler implements Handler<Set<IValue>> {

		private final String childName;

		public GetChildHandler(String childName) {
			this.childName = childName;
		}

		public void process(ImmutableValue value, Set<IValue> result) {
			ImmutableValue child = value.children.get(childName);
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
	}

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

	protected IValue findMember(String name, boolean resolve) {

		IValue value = null;
		if (elementValues != null)
			value = elementValues.get(name);
		if (value == null) {
			value = ElementValue.findMember(declaredType, name);
			if (value != null) {
				if (elementValues == null)
					elementValues = new HashMap<String, IValue>(4, 0.9f);
				elementValues.put(name, value);
				return value;
			}
			for (JSType type : types) {
				value = ElementValue.findMember(type, name);
				if (value != null) {
					if (elementValues == null)
						elementValues = new HashMap<String, IValue>(4, 0.9f);
					elementValues.put(name, value);
					return value;
				}
			}
		}
		return value;
	}

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

	public boolean hasChild(String name) {
		return children.containsKey(name) || inherited.containsKey(name);
	}

	public IValue createChild(String name) {
		return null;
	}

	public void setDeclaredType(JSType declaredType) {
	}

	public void setAttribute(String key, Object value) {
	}

	public void setKind(ReferenceKind kind) {
	}

	public void setLocation(ReferenceLocation location) {
	}

	public void addValue(IValue src) {
	}

	public void addReference(IValue src) {
	}

	public void clear() {
	}

	public void putChild(String name, IValue value) {
	}

	public void deleteChild(String name) {
	}

}