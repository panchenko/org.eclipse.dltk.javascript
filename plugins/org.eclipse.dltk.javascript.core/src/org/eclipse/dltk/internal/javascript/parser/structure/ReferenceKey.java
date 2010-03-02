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

class ReferenceKey implements Comparable<ReferenceKey> {
	final int start;
	final int end;
	final String name;

	public ReferenceKey(int start, int end, String name) {
		this.start = start;
		this.end = end;
		this.name = name;
	}

	public int compareTo(ReferenceKey o) {
		if (start != o.start) {
			return start - o.start;
		}
		if (end != o.end) {
			return end - o.end;
		}
		return name.compareTo(o.name);
	}

}
