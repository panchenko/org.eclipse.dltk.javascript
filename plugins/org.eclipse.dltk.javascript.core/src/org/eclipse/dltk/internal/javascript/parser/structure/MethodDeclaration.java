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
package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.List;

import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.internal.javascript.parser.JSModifiers;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.internal.javascript.ti.JSMethod;
import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;

class MethodDeclaration extends Declaration implements IReferenceAttributes {

	/**
	 * @param childName
	 * @param child
	 */
	public MethodDeclaration(String childName, IValueReference child) {
		super(childName, child);
	}

	@Override
	public void report(StructureReporter reporter, boolean allowFields) {
		final ReferenceLocation location = child.getLocation();
		reporter.removeReference(childName, location.getNameStart(),
				location.getNameEnd());
		reporter.reportRefs(location.getDeclarationStart());
		final MethodInfo mi = new MethodInfo();
		mi.name = childName;
		mi.returnType = extractType(child.getChild(IValueReference.FUNCTION_OP));
		copyLocation(location, mi);
		final JSMethod method = (JSMethod) child.getAttribute(PARAMETERS);
		if (method != null) {
			if (method.isDeprecated()) {
				mi.modifiers |= JSModifiers.DEPRECATED;
			}
			final List<IParameter> parameters = method.getParameters();
			for (IParameter parameter : parameters) {
				if (parameter.getType() != null) {
					mi.parameterTypes = new String[method.getParameterCount()];
					break;
				}
			}
			mi.parameterNames = new String[method.getParameterCount()];
			for (int i = 0; i < parameters.size(); ++i) {
				final IParameter parameter = parameters.get(i);
				mi.parameterNames[i] = parameter.getName();
				if (mi.parameterTypes != null) {
					mi.parameterTypes[i] = parameter.getType();
				}
			}
		}
		reporter.fRequestor.enterMethod(mi);
		final IValueCollection functionScope = (IValueCollection) child
				.getAttribute(FUNCTION_SCOPE);
		if (functionScope != null) {
			reporter.processScope(functionScope, false);
		}
		reporter.reportRefs(location.getDeclarationEnd());
		reporter.fRequestor.exitMethod(location.getDeclarationEnd());
	}

}
