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

import java.util.List;

import org.eclipse.dltk.annotations.Nullable;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IElement;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;

public class RUtils {

	public static ReferenceLocation locationOf(IRElement element) {
		final Object source = element.getSource();
		if (source instanceof IElement) {
			return ((IElement) source).getLocation();
		} else {
			return null;
		}
	}

	/**
	 * Returns the parameter matching the specified position (e.g. it can return
	 * vararg parameter if position exceeds the number of declared parameters)
	 * or <code>null</code> if position is not correct.
	 */
	@Nullable
	public static IRParameter getParameterFor(IRMethod method, int position) {
		if (position < 0) {
			return null;
		}
		final List<IRParameter> params = method.getParameters();
		if (position < params.size()) {
			return params.get(position);
		} else if (!params.isEmpty()) {
			final IRParameter last = params.get(params.size() - 1);
			if (last.getKind() == ParameterKind.VARARGS) {
				return last;
			}
		}
		return null;
	}

}
