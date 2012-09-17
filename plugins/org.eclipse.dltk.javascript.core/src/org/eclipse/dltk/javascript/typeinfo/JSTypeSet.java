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
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;

public abstract class JSTypeSet implements Iterable<IRType> {

	private static class EmptyIterator implements Iterator<IRType> {

		protected EmptyIterator() {
		}

		public boolean hasNext() {
			return false;
		}

		public IRType next() {
			throw new NoSuchElementException();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	private static class JSEmptyTypeSet extends JSTypeSet {

		protected JSEmptyTypeSet() {
		}

		public Iterator<IRType> iterator() {
			return new EmptyIterator();
		}

		@Override
		public void add(IRType type) {
			throw new UnsupportedOperationException();
		}

		@Override
		public IRType getFirst() {
			return null;
		}

		@Override
		public IRType toRType() {
			return RTypes.none();
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
		public boolean contains(IRType type) {
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

	private static class SingletonIterator implements Iterator<IRType> {
		private final IRType type;
		private boolean hasNext = true;

		public SingletonIterator(IRType type) {
			this.type = type;
		}

		public boolean hasNext() {
			return hasNext;
		}

		public IRType next() {
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

		private final IRType type;

		public JSSingletonTypeSet(IRType type) {
			this.type = type;
		}

		public Iterator<IRType> iterator() {
			return new SingletonIterator(type);
		}

		@Override
		public void add(IRType type) {
			throw new UnsupportedOperationException();
		}

		@Override
		public IRType getFirst() {
			return type;
		}

		@Override
		public IRType toRType() {
			return type;
		}

		@Override
		public Type[] toArray() {
			if (type instanceof IRSimpleType) {
				return new Type[] { ((IRSimpleType) type).getTarget() };
			} else if (type instanceof IRClassType) {
				return new Type[] { ((IRClassType) type).getTarget() };
			} else if (type == RTypes.any()) {
				return new Type[] { Types.OBJECT };
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
		public boolean contains(IRType type) {
			return this.type.equals(type);
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

	public static JSTypeSet singleton(IRType type) {
		if (type instanceof IRUnionType) {
			final JSTypeSet set = create();
			set.add(type);
			return set;
		}
		return new JSSingletonTypeSet(type);
	}

	/**
	 * @deprecated Use {@link RTypes#create(JSType)} instead
	 */
	public static IRType normalize(JSType type) {
		return RTypes.create(type);
	}

	/**
	 * @deprecated Use {@link RTypes#create(ITypeSystem,JSType)} instead
	 */
	public static IRType normalize(ITypeSystem context, JSType type) {
		return RTypes.create(context, type);
	}

	/**
	 * @deprecated Use {@link RTypes#simple(Type)} instead
	 */
	public static IRType ref(Type type) {
		return RTypes.simple(type);
	}

	public static IRType ref(String name) {
		final Type type = TypeInfoModelLoader.getInstance().getType(name);
		return RTypes.simple(type);
	}

	/**
	 * @deprecated Use {@link RTypes#classType(Type)} instead
	 */
	public static IRClassType classType(Type type) {
		return RTypes.classType(type);
	}

	/**
	 * @deprecated Use {@link RTypes#any()} instead
	 */
	public static IRType any() {
		return RTypes.any();
	}

	/**
	 * @deprecated Use {@link RTypes#none()} instead
	 */
	public static IRType none() {
		return RTypes.none();
	}

	/**
	 * @deprecated Use {@link RTypes#undefined()} instead
	 */
	public static IRType undefined() {
		return RTypes.undefined();
	}

	private static class JSTypeSetImpl extends JSTypeSet {

		private final List<IRType> types = new ArrayList<IRType>(3);

		protected JSTypeSetImpl() {
		}

		public Iterator<IRType> iterator() {
			return types.iterator();
		}

		@Override
		public void add(IRType type) {
			if (type instanceof IRUnionType) {
				for (IRType t : ((IRUnionType) type).getTargets()) {
					add(t);
				}
			} else {
				if (!types.contains(type)) {
					types.add(type);
				}
			}
		}

		@Override
		public IRType getFirst() {
			return types.iterator().next();
		}

		@Override
		public IRType toRType() {
			if (types.isEmpty()) {
				return RTypes.none();
			} else if (types.size() == 1) {
				return types.iterator().next();
			} else {
				return RTypes.union(types);
			}
		}

		@Override
		public Type[] toArray() {
			final LinkedHashSet<Type> result = new LinkedHashSet<Type>();
			for (IRType type : types) {
				if (type instanceof IRSimpleType) {
					result.add(((IRSimpleType) type).getTarget());
				} else if (type == RTypes.any()) {
					result.add(Types.OBJECT);
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
			for (IRType type : types) {
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
		public boolean contains(IRType type) {
			return types.contains(type);
		}

		@Override
		public boolean containsAll(JSTypeSet types) {
			for (IRType type : types) {
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

	public static JSTypeSet create(IRType type) {
		if (type == null || type == RTypes.none()) {
			return emptySet();
		} else {
			final JSTypeSet set = new JSTypeSetImpl();
			set.add(type);
			return set;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof JSTypeSet) {
			final JSTypeSet other = (JSTypeSet) obj;
			return size() == other.size() && containsAll(other);
		}
		return false;
	}

	public abstract void add(IRType type);

	public abstract IRType getFirst();

	public abstract IRType toRType();

	public abstract Type[] toArray();

	public abstract int size();

	public abstract void addAll(JSTypeSet types);

	public abstract boolean isEmpty();

	public abstract void clear();

	public abstract boolean contains(IRType type);

	public abstract boolean containsAll(JSTypeSet types);

}
