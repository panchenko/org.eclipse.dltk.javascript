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
package org.eclipse.dltk.javascript.typeinfo;

import org.eclipse.dltk.annotations.Nullable;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.INodeVisitor;
import org.eclipse.dltk.javascript.parser.JSProblemReporter;
import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public interface ITypeInferencerVisitor extends INodeVisitor<IValueReference> {

	void enterContext(IValueCollection collection);

	IValueCollection leaveContext();

	IValueCollection peekContext();

	ITypeInferenceContext getContext();

	@Nullable
	JSProblemReporter getProblemReporter();

	@Deprecated
	ReferenceSource getSource();

	void visitFunctionBody(FunctionStatement node);

	@Deprecated
	void setType(IValueReference value, JSType type, boolean lazyEnabled);

	void suppressProblems(IProblemIdentifier... identifiers);
}
