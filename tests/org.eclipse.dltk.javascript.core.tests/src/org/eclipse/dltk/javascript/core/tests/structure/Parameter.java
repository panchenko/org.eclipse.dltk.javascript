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

import org.eclipse.dltk.compiler.CharOperation;

public class Parameter {

	private final String name;
	private String type;

	public Parameter(String name) {
		this.name = name;
	}

	public Parameter(String name, String type) {
		this(name);
		setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj.getClass() == getClass()) {
			final Parameter other = (Parameter) obj;
			return name.equals(other.name)
					&& CharOperation.equals(type, other.type);
		}
		return false;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(name);
		if (type != null) {
			sb.append(":").append(type);
		}
		return sb.toString();
	}

}
