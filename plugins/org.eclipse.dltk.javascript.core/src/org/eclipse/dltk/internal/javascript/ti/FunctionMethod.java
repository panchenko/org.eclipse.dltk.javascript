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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.internal.core.RMethod;
import org.eclipse.dltk.javascript.internal.core.RParameter;
import org.eclipse.dltk.javascript.typeinfo.IRFunctionType;
import org.eclipse.dltk.javascript.typeinfo.IRMethod;
import org.eclipse.dltk.javascript.typeinfo.IRParameter;
import org.eclipse.dltk.javascript.typeinfo.RTypes;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;

public enum FunctionMethod {
	apply {
		@Override
		List<IRParameter> buildParameters(IRFunctionType functionType) {
			return Arrays.<IRParameter> asList(
					new RParameter(FUNCTION_THIS_ARG, RTypes.any(),
							ParameterKind.OPTIONAL),
					new RParameter(FUNCTION_ARG_ARRAY, RTypes.arrayOf(RTypes
							.any()), ParameterKind.OPTIONAL));
		}
	},
	call {
		@Override
		List<IRParameter> buildParameters(IRFunctionType functionType) {
			final List<IRParameter> parameters = new ArrayList<IRParameter>(
					functionType.getParameters().size() + 1);
			parameters
					.add(new RParameter(
							FUNCTION_THIS_ARG,
							RTypes.any(),
							isAllOptionall(functionType.getParameters()) ? ParameterKind.OPTIONAL
									: ParameterKind.NORMAL));
			for (IRParameter param : functionType.getParameters()) {
				parameters.add(new RParameter(FUNCTION_ARG + parameters.size(),
						param.getType(), param.getKind()));
			}
			return parameters;
		}

		boolean isAllOptionall(Collection<IRParameter> parameters) {
			for (IRParameter param : parameters) {
				if (param.getKind() == ParameterKind.NORMAL) {
					return false;
				}
			}
			return true;
		}
	};

	private static final String FUNCTION_THIS_ARG = "thisArg";
	private static final String FUNCTION_ARG = "arg";
	private static final String FUNCTION_ARG_ARRAY = "argArray";

	public boolean test(String name) {
		return name().equals(name);
	}

	public IRMethod create(IRFunctionType functionType) {
		return new RMethod((Method) Types.FUNCTION.findDirectMember(name()),
				functionType.getReturnType(), buildParameters(functionType),
				RTypes.FUNCTION.getDeclaration());
	}

	abstract List<IRParameter> buildParameters(IRFunctionType functionType);

}
