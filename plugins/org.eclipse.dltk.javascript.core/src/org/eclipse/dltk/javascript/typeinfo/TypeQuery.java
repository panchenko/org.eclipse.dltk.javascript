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

import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.utils.CompoundIterator;

public class TypeQuery {

	private final List<Type> types = new ArrayList<Type>();

	public TypeQuery() {
	}

	public TypeQuery(Type type) {
		add(type);
	}

	public void add(Type type) {
		types.add(type);
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

		protected boolean fetchNext() {
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
				current = queue.iterator();
				return current.hasNext();
			}
			return false;
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

}
