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
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.IRFunctionType;
import org.eclipse.dltk.javascript.typeinfo.IRMember;
import org.eclipse.dltk.javascript.typeinfo.IRMethod;
import org.eclipse.dltk.javascript.typeinfo.IRParameter;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.IRTypeDeclaration;
import org.eclipse.dltk.javascript.typeinfo.RTypes;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;
import org.eclipse.dltk.javascript.typeinfo.model.Visibility;

public class RMethodFunctionWrapper implements IRMethod {

	private final IRFunctionType functionType;
	private final Visibility visibility;

	public RMethodFunctionWrapper(IRFunctionType functionType,
			IValueReference reference) {
		this.functionType = functionType;
		IMethod method = (IMethod) reference.getAttribute(
				IReferenceAttributes.METHOD, true);
		if (method != null)
			visibility = method.getVisibility();
		else {
			IRMember member = (IRMember) reference.getAttribute(
					IReferenceAttributes.ELEMENT, true);
			if (member != null)
				visibility = member.getVisibility();
			else
				visibility = Visibility.PUBLIC;
		}
	}

	public boolean isDeprecated() {
		return false;
	}

	public Visibility getVisibility() {
		return visibility;
	}

	public String getName() {
		return null;
	}

	public IRType getType() {
		return functionType.getReturnType();
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

	public Object getSource() {
		return functionType;
	}

	public IRTypeDeclaration getDeclaringType() {
		return null;
	}

	public boolean isStatic() {
		return false;
	}

	public boolean isAbstract() {
		return false;
	}

	public boolean isVisible() {
		return true;
	}

	public boolean isGeneric() {
		return false;
	}

}
