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

import org.eclipse.dltk.annotations.NonNull;
import org.eclipse.dltk.javascript.typeinfo.model.TypeVariable;

/**
 * Representation of type variable used as is.
 */
public class RTypeVariable extends RType {

	@NonNull
	private final TypeVariable variable;

	public RTypeVariable(TypeVariable variable) {
		this.variable = variable;
	}

	public String getName() {
		return variable.getName();
	}

	public TypeVariable getVariable() {
		return variable;
	}

	@Override
	public TypeCompatibility isAssignableFrom(IRType type) {
		if (super.isAssignableFrom(type).ok()) {
			return TypeCompatibility.TRUE;
		} else {
			// TODO (alex) review
			return TypeCompatibility.TRUE;
		}
	}

	@Override
	public boolean isSynthetic() {
		return true;
	}

	@Override
	public int hashCode() {
		return variable.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RTypeVariable) {
			final RTypeVariable other = (RTypeVariable) obj;
			return variable == other.variable;
		}
		return false;
	}

}
