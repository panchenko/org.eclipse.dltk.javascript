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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public abstract class ElementValue implements IValue {

	public static ElementValue findMember(Type type, String name) {
		if (type != null) {
			List<Member> selection = new ArrayList<Member>(4);
			for (Member member : type.getMembers()) {
				if (name.equals(member.getName())) {
					selection.add(member);
				}
			}
			if (!selection.isEmpty()) {
				return new MemberValue(selection.toArray(new Member[selection
						.size()]));
			}
		}
		return null;
	}

	public static ElementValue createFor(Element element) {
		if (element instanceof Method) {
			return new MethodValue((Method) element);
		} else if (element instanceof Property) {
			return new PropertyValue((Property) element);
		} else {
			return new TypeValue(Collections.singleton((Type) element));
		}
	}

	private static class TypeValue extends ElementValue implements IValue {

		private final Set<Type> types;

		public TypeValue(Set<Type> types) {
			this.types = types;
		}

		@Override
		protected Type[] getElements() {
			return types.toArray(new Type[types.size()]);
		}

		public IValue getChild(String name) {
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

	private static class MethodValue extends ElementValue implements IValue {

		private final Method method;

		public MethodValue(Method method) {
			this.method = method;
		}

		@Override
		protected Method getElements() {
			return method;
		}

		@Override
		public ReferenceKind getKind() {
			return ReferenceKind.METHOD;
		}

		public IValue getChild(String name) {
			if (IValueReference.FUNCTION_OP.equals(name)) {
				if (method.getType() != null) {
					return new TypeValue(Collections
							.singleton(method.getType()));
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

		public PropertyValue(Property property) {
			this.property = property;
		}

		@Override
		protected Property getElements() {
			return property;
		}

		@Override
		public ReferenceKind getKind() {
			return ReferenceKind.PROPERTY;
		}

		public IValue getChild(String name) {
			return ElementValue.findMember(property.getType(), name);
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

		private final Member[] members;

		public MemberValue(Member[] members) {
			this.members = members;
		}

		@Override
		protected Member[] getElements() {
			return members;
		}

		@Override
		public ReferenceKind getKind() {
			for (Member member : members) {
				if (member instanceof Method)
					return ReferenceKind.METHOD;
			}
			return ReferenceKind.PROPERTY;
		}

		public IValue getChild(String name) {
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
					return new TypeValue(types);
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

	public final void clear() {
	}

	public final void addValue(IValue src) {
	}

	public final void addReference(IValue src) {
	}

	public final Object getAttribute(String key) {
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
		throw new UnsupportedOperationException();
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
