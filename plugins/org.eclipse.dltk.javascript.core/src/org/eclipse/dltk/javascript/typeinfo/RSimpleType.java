/*******************************************************************************
 * Copyright (c) 2011,2012 NumberFour AG
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

import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class RSimpleType extends RType implements IRSimpleType {

	private final Type type;

	public RSimpleType(ITypeSystem typeSystem, Type type) {
		super(typeSystem);
		assert type != null;
		this.type = type;
		if (DEBUG)
			checkType(type);
	}

	public RSimpleType(Type type) {
		assert type != null;
		this.type = type;
		if (DEBUG)
			checkType(type);
	}

	public String getName() {
		return type.getName();
	}

	public Type getTarget() {
		return type;
	}

	@Override
	public int hashCode() {
		return type.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final RSimpleType other = (RSimpleType) obj;
		return type.equals(other.type);
	}

	@Override
	public TypeCompatibility isAssignableFrom(IRType type) {
		if (super.isAssignableFrom(type).ok()) {
			return TypeCompatibility.TRUE;
		} else if (Types.OBJECT == type) {
			return TypeCompatibility.TRUE;
		} else if (type instanceof RSimpleType) {
			final Type other = ((RSimpleType) type).getTarget();
			if (isAssignableFrom(this.type, other)) {
				return TypeCompatibility.TRUE;
			}
			final OriginReference origin = OriginReference.of(this.type);
			if (origin != null) {
				if (isAssignableFrom(origin.genericType, other)) {
					return TypeCompatibility.TRUE;
				}
				final OriginReference otherOrigin = OriginReference.of(other);
				if (otherOrigin != null) {
					if (isAssignableFrom(origin.genericType,
							otherOrigin.genericType)
							&& isAssignableFrom(origin.parameterTypes,
									otherOrigin.parameterTypes)) {
						return TypeCompatibility.TRUE;
					}
				}
			}
		}
		return testAssignableTo(type);
	}

	private boolean isAssignableFrom(IRType[] dest, IRType[] src) {
		if (dest.length == src.length) {
			for (int i = 0; i < dest.length; ++i) {
				if (dest[i].isAssignableFrom(src[i]) != TypeCompatibility.TRUE) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
