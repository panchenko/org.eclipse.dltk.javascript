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
package org.eclipse.dltk.internal.javascript.ti;

import java.util.Set;

import org.eclipse.dltk.javascript.typeinference.IValueReference;

/**
 * Value representing script global level "this" (which is window in browser
 * environment).
 */
public class TopValueThis extends ThisValue {

	private final TopValueCollection owner;

	public TopValueThis(TopValueCollection collection) {
		this.owner = collection;
	}

	@Override
	public Set<String> getDirectChildren() {
		return owner.getDirectChildren();
	}

	@Override
	public Set<String> getDeletedChildren() {
		return owner.getDeletedChildren();
	}

	@Override
	public boolean hasChild(String name) {
		return owner.hasChild(name);
	}

	@Override
	public IValueReference getChild(String name) {
		return owner.getChild(name);
	}

}
