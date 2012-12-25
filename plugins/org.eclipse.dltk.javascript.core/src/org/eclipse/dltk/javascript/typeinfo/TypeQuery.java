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
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.utils.CompoundIterator;

/**
 * Returns all the supertypes/traits of the specified type(s).
 */
public class TypeQuery {

	protected final List<Type> types = new ArrayList<Type>();

	public TypeQuery() {
	}

	public TypeQuery(Type type) {
		add(type);
	}

	public void add(Type type) {
		types.add(type);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append("(");
		boolean first = true;
		for (Type type : types) {
			if (!first) {
				sb.append(", ");
			}
			first = false;
			sb.append(type.getName());
		}
		sb.append(")");
		return sb.toString();
	}

	protected boolean isValid(Type type) {
		return true;
	}

	static final int ROOT = 1;
	static final int SUPERTYPES = 2;
	static final int TRAITS = 4;

	private class TypeIterator extends CompoundIterator<Type> {
		private final Set<Type> visited = new HashSet<Type>();
		private final List<Type> queue = new ArrayList<Type>();
		private final List<Type> skipQueue = new ArrayList<Type>();
		private final int flags;

		public TypeIterator() {
			this(ROOT | SUPERTYPES | TRAITS);
		}

		public TypeIterator(int flags) {
			// assert superTypes || traits;
			this.flags = flags;
			if (types != null) {
				if ((flags & ROOT) != 0) {
					queue.addAll(types);
				} else {
					skipQueue.addAll(types);
				}
			}
			current = queue.iterator();
		}

		private boolean canVisit(Type type) {
			return visited.add(type);
		}

		@Override
		protected boolean fetchNext() {
			for (;;) {
				if (!skipQueue.isEmpty()) {
					queue.addAll(skipQueue);
					skipQueue.clear();
				}
				if (!queue.isEmpty()) {
					final Type[] copy = queue.toArray(new Type[queue.size()]);
					queue.clear();
					for (Type type : copy) {
						final Type superType = type.getSuperType();
						if (superType != null) {
							if (canVisit(superType) && isValid(superType)) {
								if ((flags & SUPERTYPES) != 0) {
									queue.add(superType);
								} else {
									skipQueue.add(superType);
								}
							}
						}
						if ((flags & TRAITS) != 0) {
							for (Type trait : type.getTraits()) {
								if (canVisit(trait) && isValid(trait)) {
									queue.add(trait);
								}
							}
						}
					}
					if (!queue.isEmpty()) {
						current = queue.iterator();
						return true;
					}
				} else {
					return false;
				}
			}
		}
	}

	private class TypeIterable implements Iterable<Type> {

		private final int flags;

		public TypeIterable(int flags) {
			this.flags = flags;
		}

		public Iterator<Type> iterator() {
			return new TypeIterator(flags);
		}

	}

	/**
	 * Returns this type and all its supertypes/traits. Types are returned in
	 * the breadth-first order (current type, supertype, traits).
	 */
	public List<Type> getHierarchy() {
		final List<Type> result = new ArrayList<Type>();
		for (Iterator<Type> i = new TypeIterator(); i.hasNext();) {
			result.add(i.next());
		}
		return result;
	}

	public Iterable<Type> getAllTraits() {
		return new TypeIterable(TRAITS);
	}

	public TypeCircularDependency checkCircularDependencies(Type currentType) {
		final Stack<Type> visited = new Stack<Type>();
		for (Type type : types) {
			visited.push(type);
		}
		return checkCircularDependencies(currentType, visited);
	}

	private TypeCircularDependency checkCircularDependencies(Type currentType,
			Stack<Type> visitedTypes) {
		assert currentType != null;
		assert visitedTypes != null;
		int duplicateIndex = visitedTypes.indexOf(currentType);
		if (duplicateIndex != -1) {
			final List<Type> loop = new ArrayList<Type>(visitedTypes.subList(
					duplicateIndex, visitedTypes.size()));
			final List<Type> pathToLoop = duplicateIndex == 0 ? Collections
					.<Type> emptyList() : new ArrayList<Type>(
					visitedTypes.subList(0, duplicateIndex));
			return new TypeCircularDependency(loop, pathToLoop);
		}
		visitedTypes.push(currentType);
		if (currentType.getSuperType() != null) {
			final TypeCircularDependency dependency = checkCircularDependencies(
					currentType.getSuperType(), visitedTypes);
			if (dependency != null) {
				return dependency;
			}
		}
		for (Type trait : currentType.getTraits()) {
			final TypeCircularDependency dependency = checkCircularDependencies(
					trait, visitedTypes);
			if (dependency != null) {
				return dependency;
			}
		}
		visitedTypes.pop();
		return null;
	}

}
