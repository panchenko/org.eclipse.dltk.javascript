/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinfo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.dltk.javascript.typeinfo.model.TypeRef;
import org.eclipse.dltk.javascript.typeinfo.model.impl.TypeRefImpl;

public abstract class JSTypeSet implements Iterable<JSType> {

	private static class EmptyIterator implements Iterator<JSType> {

		public boolean hasNext() {
			return false;
		}

		public JSType next() {
			throw new NoSuchElementException();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	private static class JSEmptyTypeSet extends JSTypeSet {

		public Iterator<JSType> iterator() {
			return new EmptyIterator();
		}

		@Override
		public void add(JSType type) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void add(Type type) {
			throw new UnsupportedOperationException();
		}

		@Override
		public JSType getFirst() {
			return null;
		}

		@Override
		public Type[] toArray() {
			return new Type[0];
		}

		@Override
		public int size() {
			return 0;
		}

		@Override
		public void addAll(JSTypeSet types) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isEmpty() {
			return true;
		}

		@Override
		public void clear() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean contains(JSType type) {
			return false;
		}

		@Override
		public boolean contains(Type type) {
			return false;
		}

		@Override
		public boolean containsAll(JSTypeSet types) {
			return types.isEmpty();
		}

		@Override
		public String toString() {
			return getClass().getSimpleName();
		}

	}

	private static final JSEmptyTypeSet EMPTY_SET = new JSEmptyTypeSet();

	public static JSTypeSet emptySet() {
		return EMPTY_SET;
	}

	private static class SingletonIterator implements Iterator<JSType> {
		private final JSType type;
		private boolean hasNext = true;

		public SingletonIterator(JSType type) {
			this.type = type;
		}

		public boolean hasNext() {
			return hasNext;
		}

		public JSType next() {
			if (hasNext) {
				hasNext = false;
				return type;
			}
			throw new NoSuchElementException();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	private static class JSSingletonTypeSet extends JSTypeSet {

		private final JSType type;

		public JSSingletonTypeSet(JSType type) {
			this.type = type;
		}

		public Iterator<JSType> iterator() {
			return new SingletonIterator(type);
		}

		@Override
		public void add(JSType type) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void add(Type type) {
			throw new UnsupportedOperationException();
		}

		@Override
		public JSType getFirst() {
			return type;
		}

		@Override
		public Type[] toArray() {
			if (type instanceof TypeRef) {
				return new Type[] { ((TypeRef) type).getTarget() };
			} else {
				return new Type[0];
			}
		}

		@Override
		public int size() {
			return 1;
		}

		@Override
		public void addAll(JSTypeSet types) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isEmpty() {
			return false;
		}

		@Override
		public void clear() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean contains(JSType type) {
			return this.type.equals(type);
		}

		@Override
		public boolean contains(Type type) {
			return this.type instanceof TypeRef
					&& ((TypeRef) this.type).getTarget().equals(type);
		}

		@Override
		public boolean containsAll(JSTypeSet types) {
			return types.size() == 1 && contains(types.getFirst());
		}

		@Override
		public String toString() {
			return "[" + type + "]";
		}

	}

	public static JSTypeSet singleton(JSType type) {
		return new JSSingletonTypeSet(type);
	}

	private static class TypeRefKey implements TypeRef {

		private final Type type;

		public TypeRefKey(Type type) {
			this.type = type;
		}

		public TypeKind getKind() {
			return type.getKind();
		}

		public boolean isDeprecated() {
			return type.isDeprecated();
		}

		public String getComponentType() {
			return (String) type
					.getAttribute(ITypeInferenceContext.GENERIC_ARRAY_TYPE);
		}

		public String getName() {
			return type.getName();
		}

		public Type getTarget() {
			return type;
		}

		public void setTarget(Type value) {
			throw new UnsupportedOperationException();
		}

		@Override
		public int hashCode() {
			return type.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof TypeRefKey) {
				final TypeRefKey other = (TypeRefKey) obj;
				return type.equals(other.getTarget());
			}
			return false;
		}

		@Override
		public String toString() {
			return type.toString();
		}

	}

	private static JSType normalize(JSType type) {
		if (type instanceof TypeRefImpl) {
			return new TypeRefKey(((TypeRef) type).getTarget());
		}
		return type;
	}

	private static JSType wrap(Type type) {
		return new TypeRefKey(type);
	}

	private static class JSTypeSetImpl extends JSTypeSet {

		private final Set<JSType> types = new HashSet<JSType>();

		public Iterator<JSType> iterator() {
			return types.iterator();
		}

		@Override
		public void add(JSType type) {
			types.add(normalize(type));
		}

		@Override
		public void add(Type type) {
			types.add(wrap(type));
		}

		@Override
		public JSType getFirst() {
			return types.iterator().next();
		}

		@Override
		public Type[] toArray() {
			final List<Type> result = new ArrayList<Type>();
			for (JSType type : types) {
				if (type instanceof TypeRef) {
					result.add(((TypeRef) type).getTarget());
				}
			}
			return result.toArray(new Type[result.size()]);
		}

		@Override
		public int size() {
			return types.size();
		}

		@Override
		public void addAll(JSTypeSet types) {
			for (JSType type : types) {
				add(type);
			}
		}

		@Override
		public boolean isEmpty() {
			return types.isEmpty();
		}

		@Override
		public void clear() {
			types.clear();
		}

		@Override
		public boolean contains(JSType type) {
			return types.contains(normalize(type));
		}

		@Override
		public boolean contains(Type type) {
			return types.contains(wrap(type));
		}

		@Override
		public boolean containsAll(JSTypeSet types) {
			for (JSType type : types) {
				if (!contains(type)) {
					return false;
				}
			}
			return true;
		}

		@Override
		public String toString() {
			return types.toString();
		}

	}

	public static JSTypeSet create() {
		return new JSTypeSetImpl();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof JSTypeSet) {
			final JSTypeSet other = (JSTypeSet) obj;
			return size() == other.size() && containsAll(other);
		}
		return false;
	}

	public abstract void add(JSType type);

	public abstract void add(Type type);

	public abstract JSType getFirst();

	public abstract Type[] toArray();

	public abstract int size();

	public abstract void addAll(JSTypeSet types);

	public abstract boolean isEmpty();

	public abstract void clear();

	public abstract boolean contains(JSType type);

	public abstract boolean contains(Type type);

	public abstract boolean containsAll(JSTypeSet types);

}
