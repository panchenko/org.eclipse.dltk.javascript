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
package org.eclipse.dltk.javascript.internal.core;

import java.util.List;

import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.IRTypeDeclaration;
import org.eclipse.dltk.javascript.typeinfo.TypeCompatibility;
import org.eclipse.dltk.javascript.typeinfo.model.GenericType;

public class RParameterizedTypeDeclaration extends RTypeDeclaration {

	private final List<IRType> typeArguments;

	public RParameterizedTypeDeclaration(GenericType type,
			List<IRType> typeArguments) {
		super(type);
		this.typeArguments = typeArguments;
	}

	@Override
	public boolean isGeneric() {
		return true;
	}

	@Override
	public boolean isParameterized() {
		return true;
	}

	public List<IRType> getActualTypeArguments() {
		return typeArguments;
	}

	@Override
	public String getName() {
		final StringBuilder sb = new StringBuilder();
		sb.append(getSource().getName());
		sb.append('<');
		for (IRType type : getActualTypeArguments()) {
			sb.append(type.getName());
		}
		sb.append('>');
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final RParameterizedTypeDeclaration other = (RParameterizedTypeDeclaration) obj;
		return type.equals(other.type)
				&& typeArguments.equals(other.typeArguments);
	}

	@Override
	public TypeCompatibility isAssignableFrom(IRTypeDeclaration declaration) {
		if (declaration instanceof RParameterizedTypeDeclaration) {
			final RParameterizedTypeDeclaration other = (RParameterizedTypeDeclaration) declaration;
			if (type.equals(other.type)) {
				return isAssignableFrom(typeArguments, other.typeArguments) ? TypeCompatibility.TRUE
						: TypeCompatibility.UNPARAMETERIZED;
			}
		}
		return super.isAssignableFrom(declaration);
	}

	@Override
	protected boolean _equals(RTypeDeclaration other) {
		if (this.equals(other)) {
			return true;
		} else if (type.equals(other.type)) {
			if (other instanceof RParameterizedTypeDeclaration) {
				return isAssignableFrom(typeArguments,
						((RParameterizedTypeDeclaration) other).typeArguments);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	private static boolean isAssignableFrom(List<IRType> dest, List<IRType> src) {
		if (dest.size() == src.size()) {
			for (int i = 0; i < dest.size(); ++i) {
				if (dest.get(i).isAssignableFrom(src.get(i)) != TypeCompatibility.TRUE) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
