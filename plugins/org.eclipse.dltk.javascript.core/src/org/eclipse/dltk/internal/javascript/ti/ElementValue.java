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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.core.Predicate;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;

public abstract class ElementValue implements IValue {

	public static ElementValue findMember(Type type, String name) {
		return findMember(type, name, MemberPredicates.ALWAYS_TRUE);
	}

	public static ElementValue findMember(Type type, String name,
			Predicate<Member> predicate) {
		if (type != null) {
			List<Member> selection = findMembers(type, name, predicate);
			if (!selection.isEmpty()) {
				return new MemberValue(selection.toArray(new Member[selection
						.size()]));
			}
		}
		return null;
	}

	public static List<Member> findMembers(Type type, String name,
			Predicate<Member> predicate) {
		List<Member> selection = new ArrayList<Member>(4);
		for (Member member : type.getMembers()) {
			if (name.equals(member.getName()) && predicate.evaluate(member)) {
				selection.add(member);
			}
		}
		return selection;
	}

	public static ElementValue createFor(Element element,
			ITypeInferenceContext context) {
		if (element instanceof Method) {
			return new MethodValue((Method) element);
		} else if (element instanceof Property) {
			return new PropertyValue((Property) element, context);
		} else {
			assert element instanceof Type;
			return new TypeValue(Collections.singleton((Type) element));
		}
	}

	public static ElementValue createStatic(Type type) {
		return new StaticTypeValue(Collections.singleton(type));
	}

	private static class TypeValue extends ElementValue implements IValue {

		private Value arrayLookup;
		private final Set<Type> types;

		public TypeValue(Set<Type> types) {
			this.types = types;
		}

		@Override
		protected Type[] getElements() {
			return types.toArray(new Type[types.size()]);
		}

		@Override
		public IValue resolveValue(ITypeInferenceContext context) {
			return this;
		}

		public IValue getChild(String name, boolean resolve) {
			if (name.equals(IValueReference.ARRAY_OP)) {
				if (arrayLookup == null)
					arrayLookup = new Value();
				return arrayLookup;
			}
			for (Type type : types) {
				IValue child = findMember(type, name);
				if (child != null)
					return child;
			}
			return null;
		}

		public Type getDeclaredType() {
			return types.iterator().next();
		}

		public Set<Type> getDeclaredTypes() {
			return types;
		}

	}

	private static class StaticTypeValue extends ElementValue implements IValue {

		private final Set<Type> types;

		public StaticTypeValue(Set<Type> types) {
			this.types = types;
		}

		@Override
		protected Type[] getElements() {
			return types.toArray(new Type[types.size()]);
		}

		public IValue getChild(String name, boolean resolve) {
			// just guess that if the child is the function operator it is a new
			// expression of this type. return then the none static type.
			if (name.equals(IValueReference.FUNCTION_OP)) {
				return new TypeValue(types);
			}
			for (Type type : types) {
				IValue child = findMember(type, name, MemberPredicates.STATIC);
				if (child != null)
					return child;
			}
			return null;
		}

		public Type getDeclaredType() {
			return types.iterator().next();
		}

		public Set<Type> getDeclaredTypes() {
			return types;
		}

		@Override
		public Object getAttribute(String key, boolean b) {
			if (IReferenceAttributes.STATIC.equals(key)) {
				return Boolean.TRUE;
			} else {
				return super.getAttribute(key, b);
			}
		}

	}

	private static class MethodValue extends ElementValue implements IValue {

		private TypeValue functionOperator;
		private final Method method;

		public MethodValue(Method method) {
			this.method = method;
		}

		@Override
		protected Method getElements() {
			return method;
		}

		@Override
		public IValue resolveValue(ITypeInferenceContext context) {
			return context.valueOf(method);
		}

		@Override
		public ReferenceKind getKind() {
			return ReferenceKind.METHOD;
		}

		public IValue getChild(String name, boolean resolve) {
			if (IValueReference.FUNCTION_OP.equals(name)) {
				if (method.getType() != null) {
					if (functionOperator == null) {
						functionOperator = new TypeValue(
								Collections
							.singleton(method.getType()));
					}
					return functionOperator;
				}
			}
			return null;
		}

		public Type getDeclaredType() {
			return null;
		}

		public Set<Type> getDeclaredTypes() {
			return Collections.emptySet();
		}

	}

	private static class PropertyValue extends ElementValue implements IValue {

		private final Property property;
		private final ITypeInferenceContext context;
		private final Map<String, IValue> children = new HashMap<String, IValue>();

		public PropertyValue(Property property, ITypeInferenceContext context) {
			this.property = property;
			this.context = context;
		}

		@Override
		protected Property getElements() {
			return property;
		}

		@Override
		public IValue resolveValue(ITypeInferenceContext context) {
			return context.valueOf(property);
		}

		@Override
		public ReferenceKind getKind() {
			return ReferenceKind.PROPERTY;
		}

		public IValue getChild(String name, boolean resolve) {
			IValue child = children.get(name);
			if (child == null) {
				ElementValue eValue = ElementValue.findMember(
						property.getType(), name);
				if (eValue != null) {
					child = eValue.resolveValue(context);
					children.put(name, child);
				}
			}
			return child;
		}

		public Type getDeclaredType() {
			return property.getType();
		}

		public Set<Type> getDeclaredTypes() {
			if (property.getType() != null) {
				return Collections.singleton(property.getType());
			} else {
				return Collections.emptySet();
			}
		}

	}

	private static class MemberValue extends ElementValue implements IValue {

		private TypeValue functionOperator;
		private final Member[] members;

		public MemberValue(Member[] members) {
			this.members = members;
		}

		@Override
		protected Member[] getElements() {
			return members;
		}

		@Override
		public IValue resolveValue(ITypeInferenceContext context) {
			if (members.length == 1) {
				IValue value = context.valueOf(members[0]);
				// copy over the properties of this value.
				value.setDeclaredType(getDeclaredType());
				value.setAttribute(IReferenceAttributes.ELEMENT,
						getAttribute(IReferenceAttributes.ELEMENT));
				return value;
			}
			return this;
		}

		@Override
		public ReferenceKind getKind() {
			for (Member member : members) {
				if (member instanceof Method)
					return ReferenceKind.METHOD;
			}
			return ReferenceKind.PROPERTY;
		}

		public IValue getChild(String name, boolean resolve) {
			if (IValueReference.FUNCTION_OP.equals(name)) {
				Set<Type> types = null;
				for (Member member : members) {
					if (member instanceof Method) {
						final Method method = (Method) member;
						if (method.getType() != null) {
							if (types == null) {
								types = new HashSet<Type>();
							}
							types.add(method.getType());
						}
					}
				}
				if (types != null) {
					if (functionOperator == null) {
						functionOperator = new TypeValue(types);
					}
					return functionOperator;
				}
			}
			for (Member member : members) {
				if (member instanceof Property) {
					final Property property = (Property) member;
					final ElementValue child = ElementValue.findMember(property
							.getType(), name);
					if (child != null) {
						return child;
					}
				}
			}
			return null;
		}

		public Type getDeclaredType() {
			for (Member member : members) {
				if (member instanceof Property) {
					final Property property = (Property) member;
					if (property.getType() != null) {
						return property.getType();
					}
				}
			}
			return null;
		}

		public Set<Type> getDeclaredTypes() {
			Set<Type> types = null;
			for (Member member : members) {
				if (member instanceof Property) {
					final Property property = (Property) member;
					if (property.getType() != null) {
						if (types == null) {
							types = new HashSet<Type>();
						}
						types.add(property.getType());
					}
				} else if (member instanceof Method) {
					if (types == null) {
						types = new HashSet<Type>();
					}
					types.add(TypeInfoModelLoader.getInstance().getType(
							ITypeNames.FUNCTION));
				}
			}
			if (types != null) {
				return types;
			} else {
				return Collections.emptySet();
			}
		}

	}

	protected abstract Object getElements();

	public IValue resolveValue(ITypeInferenceContext context) {
		return this;
	}

	public final void clear() {
	}

	public final void addValue(IValue src) {
	}

	public final void addReference(IValue src) {
	}

	public final Object getAttribute(String key) {
		return getAttribute(key, false);
	}

	public Object getAttribute(String key, boolean includeReferences) {
		if (IReferenceAttributes.ELEMENT.equals(key)) {
			return getElements();
		}
		return null;
	}

	public final void removeAttribute(String key) {
	}

	public final void setAttribute(String key, Object value) {
	}

	public final Set<String> getDirectChildren() {
		return Collections.emptySet();
	}

	public Set<String> getDeletedChildren() {
		return Collections.emptySet();
	}

	public void deleteChild(String name) {
	}

	public final boolean hasChild(String name) {
		return false;
	}

	public final IValue createChild(String name) {
		return getChild(name, true);
		// throw new UnsupportedOperationException();
	}

	public void putChild(String name, IValue value) {
		throw new UnsupportedOperationException();
	}

	public ReferenceKind getKind() {
		return ReferenceKind.UNKNOWN;
	}

	public final ReferenceLocation getLocation() {
		return ReferenceLocation.UNKNOWN;
	}

	public final Set<Type> getTypes() {
		return Collections.emptySet();
	}

	public final void setDeclaredType(Type declaredType) {
	}

	public final void setKind(ReferenceKind kind) {
	}

	public final void setLocation(ReferenceLocation location) {
	}
}
