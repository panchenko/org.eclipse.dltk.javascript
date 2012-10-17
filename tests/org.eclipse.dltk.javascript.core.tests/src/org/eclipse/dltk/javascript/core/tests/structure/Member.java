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
package org.eclipse.dltk.javascript.core.tests.structure;

import java.util.ArrayList;
import java.util.List;

public abstract class Member {

	private final String name;

	protected final List<Member> children = new ArrayList<Member>();

	public Member(String name) {
		this.name = name;
	}

	public Member add(Member... children) {
		for (Member child : children) {
			if (child instanceof SkipMember) {
				this.children.add(((SkipMember) child).origin);
			} else {
				this.children.add(child);
			}
		}
		return this;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(describeMember());
		if (!children.isEmpty()) {
			sb.append(children);
		}
		return sb.toString();
	}

	protected String describeMember() {
		return getClass().getSimpleName() + " " + name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj.getClass() == getClass()) {
			final Member other = (Member) obj;
			return equals0(other) && children.equals(other.children);
		}
		return false;
	}

	protected boolean equals0(Member other) {
		return name.equals(other.name);
	}

	private static class SkipMember extends Member {

		final Member origin;

		SkipMember(Member origin) {
			super("<skip>");
			this.origin = origin;
		}

	}

	public Member skip() {
		return new SkipMember(this);
	}

}
