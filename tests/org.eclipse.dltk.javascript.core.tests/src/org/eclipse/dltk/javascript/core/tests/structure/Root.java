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

public class Root extends Member {

	public Root() {
		super("");
	}

	public Root(Member... children) {
		this();
		for (Member child : children) {
			addChild(child);
		}
	}

	@Override
	protected String describeMember() {
		return getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return children.toString();
	}

}
