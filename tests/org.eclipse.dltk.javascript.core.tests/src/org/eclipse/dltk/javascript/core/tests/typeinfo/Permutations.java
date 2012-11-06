/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.core.tests.typeinfo;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Generates all the permutations of the specified values. Implements the
 * algorithm described at
 * http://en.wikipedia.org/wiki/Permutation#Generation_in_lexicographic_order
 */
public class Permutations<T> implements Iterable<T[]> {

	final T[] in;

	private Permutations(T[] elements) {
		this.in = elements;
	}

	@Override
	public Iterator<T[]> iterator() {
		return new PermutationIterator();
	}

	private class PermutationIterator implements Iterator<T[]> {
		private final int count;
		private final int[] indexes;
		private final T[] out;
		private boolean hasNext = true;

		@SuppressWarnings("unchecked")
		public PermutationIterator() {
			count = in.length;
			indexes = new int[count];
			for (int i = 0; i < count; ++i) {
				indexes[i] = i;
			}
			this.out = (T[]) Array.newInstance(
					in.getClass().getComponentType(), count);
		}

		public boolean generate() {
			for (int k = count - 1; --k >= 0;) {
				if (indexes[k] < indexes[k + 1]) {
					int l = count - 1;
					while (l > k && indexes[k] >= indexes[l]) {
						--l;
					}
					assert l >= k + 1;
					swap(k, l);
					reverse(k + 1, count - 1);
					return true;
				}
			}
			return false;
		}

		private void reverse(int low, int high) {
			while (low < high) {
				swap(low, high);
				++low;
				--high;
			}
		}

		private void swap(int k, int l) {
			final int temp = indexes[k];
			indexes[k] = indexes[l];
			indexes[l] = temp;
		}

		@Override
		public boolean hasNext() {
			if (!hasNext) {
				hasNext = generate();
			}
			return hasNext;
		}

		@Override
		public T[] next() {
			if (!hasNext) {
				if (!generate()) {
					throw new NoSuchElementException();
				}
			} else {
				hasNext = false;
			}
			for (int i = 0; i < count; ++i) {
				out[i] = in[indexes[i]];
			}
			return out;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	public static <T> Permutations<T> of(T... elements) {
		return new Permutations<T>(elements);
	}

}
