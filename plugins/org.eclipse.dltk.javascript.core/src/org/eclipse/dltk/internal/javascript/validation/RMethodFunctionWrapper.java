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
package org.eclipse.dltk.internal.javascript.validation;

import java.util.List;
import java.util.Set;

import org.eclipse.dltk.compiler.problem.IProblemCategory;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IRFunctionType;
import org.eclipse.dltk.javascript.typeinfo.IRMethod;
import org.eclipse.dltk.javascript.typeinfo.IRParameter;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.RTypes;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;
import org.eclipse.dltk.javascript.typeinfo.model.Visibility;

public class RMethodFunctionWrapper implements IRMethod {

	private final IRFunctionType functionType;

	public RMethodFunctionWrapper(IRFunctionType functionType) {
		this.functionType = functionType;
	}

	public boolean isDeprecated() {
		return false;
	}

	public Visibility getVisibility() {
		return Visibility.PUBLIC;
	}

	public String getName() {
		return null;
	}

	public IRType getType() {
		return functionType.getReturnType();
	}

	public ReferenceLocation getLocation() {
		return ReferenceLocation.UNKNOWN;
	}

	public Set<IProblemCategory> getSuppressedWarnings() {
		return null;
	}

	public boolean isSuppressed(IProblemIdentifier problemIdentifier) {
		return false;
	}

	public int getParameterCount() {
		return functionType.getParameters().size();
	}

	public List<IRParameter> getParameters() {
		return functionType.getParameters();
	}

	public boolean isTyped() {
		if (functionType.getReturnType() != null) {
			return true;
		}
		final List<IRParameter> params = functionType.getParameters();
		return !(params.size() == 1 && isVarArgAny(params.get(0)));
	}

	private static boolean isVarArgAny(IRParameter parameter) {
		return parameter.getKind() == ParameterKind.VARARGS
				&& parameter.getType() == RTypes.any();
	}

	public boolean isConstructor() {
		return false;
	}

}
