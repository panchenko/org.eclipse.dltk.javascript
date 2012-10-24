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
package org.eclipse.dltk.javascript.typeinfo;

import org.eclipse.dltk.annotations.Nullable;
import org.eclipse.dltk.compiler.problem.IValidationStatus;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

/**
 * Additional type check which could be passed to
 * {@link ITypeChecker#checkType(org.eclipse.dltk.javascript.typeinfo.model.Type, org.eclipse.dltk.core.ISourceNode, int, ITypeCheck...)}
 * .
 */
public interface ITypeCheck {

	@Nullable
	IValidationStatus checkType(ITypeInfoContext context, Type type);

}
