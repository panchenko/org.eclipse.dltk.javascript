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
package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class ReferenceSet {

	private final SortedMap<ReferenceKey, List<Object>> references = new TreeMap<ReferenceKey, List<Object>>();

	public void add(String name, int start, int end) {
		add(name, start, end, null);
	}

	public void add(String name, int start, int end, Object value) {
		final ReferenceKey key = new ReferenceKey(start, end, name);
		List<Object> values = references.get(key);
		if (values == null) {
			values = new ArrayList<Object>();
			references.put(key, values);
		}
		if (value != null && !values.contains(value)) {
			values.add(value);
		}
	}

	public ReferenceIterator iterator() {
		return new IteratorImpl();
	}

	private class IteratorImpl implements ReferenceIterator {

		private final Iterator<Map.Entry<ReferenceKey, List<Object>>> entryIterator;
		private Map.Entry<ReferenceKey, List<Object>> currentEntry = null;

		public IteratorImpl() {
			entryIterator = references.entrySet().iterator();
		}

		public boolean hasNext() {
			return currentEntry != null || entryIterator.hasNext();
		}

		public void moveNext() {
			if (currentEntry != null) {
				currentEntry = null;
			} else {
				currentEntry = entryIterator.next();
			}
		}

		private Map.Entry<ReferenceKey, List<Object>> fetch() {
			if (currentEntry == null) {
				currentEntry = entryIterator.next();
			}
			return currentEntry;
		}

		public ReferenceKey current() {
			return fetch().getKey();
		}

		public List<Object> getValues() {
			return fetch().getValue();
		}

		public void remove(String name, int start, int end) {
			final ReferenceKey key = new ReferenceKey(start, end, name);
			if (currentEntry != null && key.equals(currentEntry.getKey())) {
				currentEntry = null;
			}
			final List<Object> values = references.get(key);
			if (values != null && !values.contains(Boolean.FALSE)) {
				values.clear();
				values.add(Boolean.FALSE);
			}
		}
	}

}
