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

import org.eclipse.dltk.compiler.CharOperation;
import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;

public class Method extends Member {

	private String type;
	private final List<Parameter> parameters = new ArrayList<Parameter>();

	public Method(String name, Parameter... params) {
		super(name);
		for (Parameter param : params) {
			parameters.add(param);
		}
	}

	/**
	 * @param info
	 */
	public Method(MethodInfo mi) {
		super(mi.name);
		type = mi.returnType;
		if (mi.parameterNames != null) {
			for (String paramName : mi.parameterNames) {
				parameters.add(new Parameter(paramName));
			}
		}
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	@Override
	protected String describeMember() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.describeMember());
		sb.append("(");
		for (int i = 0; i < parameters.size(); ++i) {
			if (i != 0) {
				sb.append(",");
			}
			sb.append(parameters.get(i));
		}
		sb.append(")");
		if (type != null) {
			sb.append(":").append(type);
		}
		return sb.toString();
	}

	@Override
	protected boolean equals0(Member other) {
		return super.equals0(other)
				&& CharOperation.equals(type, ((Method) other).type)
				&& parameters.equals(((Method) other).parameters);
	}

}
