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
import java.util.Set;

import org.eclipse.dltk.utils.CompoundIterator;

/**
 * Returns all the supertypes/traits of the specified type(s).
 */
public class RTypeQuery {

	protected final List<IRTypeDeclaration> types = new ArrayList<IRTypeDeclaration>();

	public RTypeQuery() {
	}

	public RTypeQuery(IRTypeDeclaration type) {
		add(type);
	}

	public void add(IRTypeDeclaration type) {
		types.add(type);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append("(");
		boolean first = true;
		for (IRTypeDeclaration type : types) {
			if (!first) {
				sb.append(", ");
			}
			first = false;
			sb.append(type.getName());
		}
		sb.append(")");
		return sb.toString();
	}

	protected boolean isValid(IRTypeDeclaration type) {
		return true;
	}

	static final int ROOT = 1;
	static final int SUPERTYPES = 2;
	static final int TRAITS = 4;

	private class TypeIterator extends CompoundIterator<IRTypeDeclaration> {
		private final Set<IRTypeDeclaration> visited = new HashSet<IRTypeDeclaration>();
		private final List<IRTypeDeclaration> queue = new ArrayList<IRTypeDeclaration>();
		private final List<IRTypeDeclaration> skipQueue = new ArrayList<IRTypeDeclaration>();
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

		private boolean canVisit(IRTypeDeclaration type) {
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
					final IRTypeDeclaration[] copy = queue
							.toArray(new IRTypeDeclaration[queue.size()]);
					queue.clear();
					for (IRTypeDeclaration type : copy) {
						final IRTypeDeclaration superType = type.getSuperType();
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
							for (IRTypeDeclaration trait : type.getTraits()) {
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

	private class TypeIterable implements Iterable<IRTypeDeclaration> {

		private final int flags;

		public TypeIterable(int flags) {
			this.flags = flags;
		}

		public Iterator<IRTypeDeclaration> iterator() {
			return new TypeIterator(flags);
		}

	}

	/**
	 * Returns this type and all its supertypes/traits. Types are returned in
	 * the breadth-first order (current type, supertype, traits).
	 */
	public List<IRTypeDeclaration> getHierarchy() {
		final List<IRTypeDeclaration> result = new ArrayList<IRTypeDeclaration>();
		for (Iterator<IRTypeDeclaration> i = new TypeIterator(); i.hasNext();) {
			result.add(i.next());
		}
		return result;
	}

	public Iterable<IRTypeDeclaration> getAllTraits() {
		return new TypeIterable(TRAITS);
	}

	// public TypeCircularDependency checkCircularDependencies(
	// IRTypeDeclaration currentType) {
	// final Stack<IRTypeDeclaration> visited = new Stack<IRTypeDeclaration>();
	// for (IRTypeDeclaration type : types) {
	// visited.push(type);
	// }
	// return checkCircularDependencies(currentType, visited);
	// }
	//
	// private TypeCircularDependency checkCircularDependencies(
	// IRTypeDeclaration currentType, Stack<IRTypeDeclaration> visitedTypes) {
	// assert currentType != null;
	// assert visitedTypes != null;
	// int duplicateIndex = visitedTypes.indexOf(currentType);
	// if (duplicateIndex != -1) {
	// final List<IRTypeDeclaration> loop = new ArrayList<IRTypeDeclaration>(
	// visitedTypes.subList(duplicateIndex, visitedTypes.size()));
	// final List<IRTypeDeclaration> pathToLoop = duplicateIndex == 0 ?
	// Collections
	// .<IRTypeDeclaration> emptyList()
	// : new ArrayList<IRTypeDeclaration>(visitedTypes.subList(0,
	// duplicateIndex));
	// return new TypeCircularDependency(loop, pathToLoop);
	// }
	// visitedTypes.push(currentType);
	// if (currentType.getSuperType() != null) {
	// final TypeCircularDependency dependency = checkCircularDependencies(
	// currentType.getSuperType(), visitedTypes);
	// if (dependency != null) {
	// return dependency;
	// }
	// }
	// for (IRTypeDeclaration trait : currentType.getTraits()) {
	// final TypeCircularDependency dependency = checkCircularDependencies(
	// trait, visitedTypes);
	// if (dependency != null) {
	// return dependency;
	// }
	// }
	// visitedTypes.pop();
	// return null;
	// }

}
