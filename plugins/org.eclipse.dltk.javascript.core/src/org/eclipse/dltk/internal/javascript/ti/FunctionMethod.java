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

import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.typeinfo.IRFunctionType;
import org.eclipse.dltk.javascript.typeinfo.IRParameter;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.impl.MethodImpl;

public enum FunctionMethod {
	apply {
		@Override
		void buildMethod(IRFunctionType functionType, Method method) {
			final Parameter thisArg = TypeInfoModelFactory.eINSTANCE
					.createParameter();
			thisArg.setName(FUNCTION_THIS_ARG);
			thisArg.setKind(ParameterKind.OPTIONAL);
			method.getParameters().add(thisArg);

			final Parameter argArray = TypeInfoModelFactory.eINSTANCE
					.createParameter();
			argArray.setName(FUNCTION_ARG_ARRAY);
			argArray.setType(TypeUtil.arrayOf(TypeInfoModelFactory.eINSTANCE
					.createAnyType()));
			argArray.setKind(ParameterKind.OPTIONAL);
			method.getParameters().add(argArray);
		}
	},
	call {
		@Override
		void buildMethod(IRFunctionType functionType, Method method) {
			final Parameter thisArg = TypeInfoModelFactory.eINSTANCE
					.createParameter();
			thisArg.setName(FUNCTION_THIS_ARG);
			method.getParameters().add(thisArg);

			int argNum = 1;
			boolean allOptional = true;
			for (IRParameter rparam : functionType.getParameters()) {
				final Parameter param = TypeInfoModelFactory.eINSTANCE
						.createParameter();
				param.setName(FUNCTION_ARG + argNum);
				param.setType(TypeUtil.createRType(rparam.getType()));
				final ParameterKind kind = rparam.getKind();
				param.setKind(kind);
				allOptional &= rparam.getKind() != ParameterKind.NORMAL;
				method.getParameters().add(param);
				argNum++;
			}
			if (allOptional) {
				thisArg.setKind(ParameterKind.OPTIONAL);
			}
		}
	};

	private static final String FUNCTION_THIS_ARG = "thisArg";
	private static final String FUNCTION_ARG = "arg";
	private static final String FUNCTION_ARG_ARRAY = "argArray";

	public boolean test(String name) {
		return name().equals(name);
	}

	public Method create(IRFunctionType functionType) {
		final Method method = new MethodImpl() {
			@Override
			public Type getDeclaringType() {
				return Types.FUNCTION;
			}
		};
		method.setName(name());
		method.setDescription(Types.FUNCTION.findDirectMember(name())
				.getDescription());
		method.setType(TypeUtil.createRType(functionType.getReturnType()));
		buildMethod(functionType, method);
		return method;
	}

	abstract void buildMethod(IRFunctionType functionType, Method method);

}
