/*******************************************************************************
 * Copyright (c) 2011,2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinfo;

import java.util.List;

import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;

class RFunctionType extends RType implements IRFunctionType {

	private final List<IRParameter> parameters;
	private final IRType returnType;

	public RFunctionType(List<IRParameter> parameters, IRType returnType) {
		this.parameters = parameters;
		this.returnType = returnType;
	}

	public String getName() {
		final StringBuilder sb = new StringBuilder();
		sb.append(JSDocTypeParser.FUNCTION);
		sb.append('(');
		int index = 0;
		for (IRParameter parameter : parameters) {
			if (++index != 1) {
				sb.append(", ");
			}
			if (parameter.getKind() == ParameterKind.VARARGS) {
				sb.append("...");
			}
			sb.append(parameter.getType());
			if (parameter.getKind() == ParameterKind.OPTIONAL) {
				sb.append("=");
			}
		}
		sb.append(')');
		if (returnType != null) {
			sb.append(':');
			sb.append(returnType);
		}
		return sb.toString();
	}

	public TypeCompatibility isAssignableFrom(IRType type) {
		if (super.isAssignableFrom(type).ok()) {
			return TypeCompatibility.TRUE;
		} else if (type instanceof RFunctionType) {
			return TypeCompatibility.TRUE;
		} else if (type instanceof IRSimpleType) {
			// TODO (alex) convert when creating type
			return TypeCompatibility
					.valueOf(Types.FUNCTION == ((IRSimpleType) type)
							.getTarget());
		} else {
			return TypeCompatibility.FALSE;
		}
	}

	public IRType getReturnType() {
		return returnType;
	}

	public List<IRParameter> getParameters() {
		return parameters;
	}

	@Override
	public int hashCode() {
		return parameters.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RFunctionType other = (RFunctionType) obj;
		if (!parameters.equals(other.parameters))
			return false;
		if (returnType == null) {
			if (other.returnType != null)
				return false;
		} else if (!returnType.equals(other.returnType))
			return false;
		return true;
	}

}
