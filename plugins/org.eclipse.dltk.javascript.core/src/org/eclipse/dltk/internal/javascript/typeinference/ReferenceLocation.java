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
package org.eclipse.dltk.internal.javascript.typeinference;

import org.eclipse.dltk.core.IModelElement;

public class ReferenceLocation implements IReferenceLocation {

	private final IModelElement parent;
	private final int offset;
	private final int length;

	public ReferenceLocation(IModelElement parent, int offset, int length) {
		this.parent = parent;
		this.offset = offset;
		this.length = length;
	}

	public IModelElement getModelElement() {
		return parent;
	}

	public int getOffset() {
		return offset;
	}

	public int getLength() {
		return length;
	}

	@Override
	public String toString() {
		return (parent != null ? parent.getElementName() : "") + "[" + offset
				+ ".." + length + "]";
	}

}
