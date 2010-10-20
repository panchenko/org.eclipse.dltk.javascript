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
package org.eclipse.dltk.internal.javascript.ti;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

@SuppressWarnings("serial")
public class JSMethod extends ArrayList<IParameter> implements IMethod {

	private String name;
	private Type type;
	private boolean deprecated;
	private boolean priv;

	public IParameter createParameter() {
		return new Parameter();
	}

	public String getName() {
		return name;
	}

	public List<IParameter> getParameters() {
		return this;
	}

	public int getParameterCount() {
		return size();
	}

	public IParameter getParameter(String name) {
		if (name != null) {
			for (IParameter parameter : this) {
				if (name.equals(parameter.getName())) {
					return parameter;
				}
			}
		}
		return null;
	}

	public Type getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public boolean isDeprecated() {
		return deprecated;
	}

	public void setDeprecated(boolean deprecated) {
		this.deprecated = deprecated;
	}

	public void setPrivate(boolean priv) {
		this.priv = priv;
	}

	public boolean isPrivate() {
		return priv;
	}

	private static class Parameter implements IParameter {

		private String name;
		private Type type;
		private ReferenceLocation location = ReferenceLocation.UNKNOWN;
		private boolean optional;

		public String getName() {
			return name;
		}

		public Type getType() {
			return type;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setType(Type type) {
			this.type = type;
		}

		public ReferenceLocation getLocation() {
			return location;
		}

		public void setLocation(ReferenceLocation location) {
			this.location = location;
		}

		public void setOptional(boolean b) {
			optional = b;
		}

		public boolean isOptional() {
			return optional;
		}

	}
}
