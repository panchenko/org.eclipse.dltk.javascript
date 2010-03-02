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

import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.internal.javascript.ti.IValueCollection;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.ReferenceLocation;

class MethodDeclaration extends Declaration implements IReferenceAttributes {

	/**
	 * @param childName
	 * @param child
	 */
	public MethodDeclaration(String childName, IValueReference child) {
		super(childName, child);
	}

	@Override
	public void report(StructureReporter reporter) {
		final ReferenceLocation location = child.getLocation();
		reporter.removeReference(childName, location.getNameStart(), location
				.getNameEnd());
		reporter.reportRefs(location.getDeclarationStart());
		final MethodInfo mi = new MethodInfo();
		mi.name = childName;
		mi.returnType = extractType(child.getChild(IValueReference.FUNCTION_OP));
		copyLocation(location, mi);
		final IValueReference[] parameters = (IValueReference[]) child
				.getAttribute(PARAMETERS);
		if (parameters != null && parameters.length != 0) {
			for (IValueReference parameter : parameters) {
				if (extractType(parameter) != null) {
					mi.parameterTypes = new String[parameters.length];
					break;
				}
			}
			mi.parameterNames = new String[parameters.length];
			for (int i = 0; i < parameters.length; ++i) {
				mi.parameterNames[i] = parameters[i].getName();
				if (mi.parameterTypes != null) {
					mi.parameterTypes[i] = extractType(parameters[i]);
				}
			}
		}
		reporter.fRequestor.enterMethod(mi);
		final IValueCollection functionScope = (IValueCollection) child
				.getAttribute(FUNCTION_SCOPE);
		if (functionScope != null) {
			reporter.processScope(functionScope);
		}
		reporter.reportRefs(location.getDeclarationEnd());
		reporter.fRequestor.exitMethod(location.getDeclarationEnd());
	}

}
