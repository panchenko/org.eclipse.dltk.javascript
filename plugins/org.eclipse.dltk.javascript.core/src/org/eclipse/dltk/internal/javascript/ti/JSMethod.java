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

import org.eclipse.dltk.javascript.ast.Argument;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.ReferenceSource;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

@SuppressWarnings("serial")
public class JSMethod extends ArrayList<IParameter> implements IMethod {

	private String name;
	private JSType type;
	private boolean deprecated;
	private boolean priv;
	private boolean constructor;

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

	public JSType getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(JSType type) {
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

	public boolean isConstructor() {
		return constructor;
	}

	public void setConstructor(boolean constructor) {
		this.constructor = constructor;
	}

	@Override
	public String toString() {
		return name + super.toString() + (type != null ? ":" + type : "");
	}

	/**
	 * @param node
	 * @param source
	 * @return
	 */
	public static JSMethod create(FunctionStatement node, ReferenceSource source) {
		final JSMethod method = new JSMethod();
		final Identifier methodName = node.getName();
		if (methodName != null) {
			method.setName(methodName.getName());
		}
		org.eclipse.dltk.javascript.ast.Type funcType = node.getReturnType();
		if (funcType != null) {
			method.setType(resolveType(funcType));
		}
		for (Argument argument : node.getArguments()) {
			final IParameter parameter = method.createParameter();
			parameter.setName(argument.getIdentifier().getName());
			org.eclipse.dltk.javascript.ast.Type paramType = argument.getType();
			if (paramType != null) {
				parameter.setType(resolveType(paramType));
				parameter.setLocation(ReferenceLocation.create(source,
						argument.sourceStart(), paramType.sourceEnd(),
						argument.sourceStart(), argument.sourceEnd()));
			} else {
				parameter.setLocation(ReferenceLocation.create(source,
						argument.sourceStart(), argument.sourceEnd()));
			}
			method.getParameters().add(parameter);
		}
		return method;
	}

	protected static JSType resolveType(
			org.eclipse.dltk.javascript.ast.Type type) {
		return TypeUtil.ref(type.getName());
	}

	static class Parameter implements IParameter {

		private String name;
		private JSType type;
		private ReferenceLocation location = ReferenceLocation.UNKNOWN;
		private boolean optional;
		private Type propertiesType;
		private boolean varargs;

		public String getName() {
			return name;
		}

		public JSType getType() {
			return type;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setType(JSType type) {
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

		public void setVarargs(boolean varargs) {
			this.varargs = varargs;
		}

		public boolean isVarargs() {
			return varargs;
		}

		public Type getPropertiesType() {
			return propertiesType;
		}

		public void setPropertiesType(Type propertiesType) {
			this.propertiesType = propertiesType;
		}

		@Override
		public String toString() {
			return type != null ? name + ':' + type.getName() : name;
		}

	}
}
