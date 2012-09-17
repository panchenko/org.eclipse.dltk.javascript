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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;

public class RClassType extends RType implements IRClassType {

	protected final Type type;

	public RClassType(Type type) {
		this.type = type;
		if (DEBUG)
			if (type != null)
				checkType(type);
	}

	public String getRawName() {
		if (type != null) {
			if (type.eIsProxy()) {
				final URI uri = ((InternalEObject) type).eProxyURI();
				if (uri != null) {
					return URI.decode(uri.fragment());
				}
			} else {
				return type.getName();
			}
		}
		return null;
	}

	public String getName() {
		final String rawName = getRawName();
		return rawName != null ? JSDocTypeParser.CLASS + "<" + rawName + ">"
				: JSDocTypeParser.CLASS;
	}

	public Type getTarget() {
		return type;
	}

	public IRType toItemType() {
		if (type == null) {
			return RTypes.any();
		} else if (Types.ARRAY == type) {
			return RTypes.arrayOf(RTypes.none());
		} else {
			return type.toRType(typeSystem);
		}
	}

	public IRType newItemType() {
		if (type == null) {
			return RTypes.any();
		} else if (Types.ARRAY == type) {
			return RTypes.arrayOf(RTypes.none());
		} else {
			return type.createInstance(typeSystem);
		}
	}

	@Override
	public int hashCode() {
		return type != null ? type.hashCode() : 31;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RClassType) {
			final RClassType other = (RClassType) obj;
			return type != null ? type.equals(other.type) : other.type == null;
		}
		return false;
	}

	public TypeCompatibility isAssignableFrom(IRType type) {
		if (super.isAssignableFrom(type).ok()) {
			return TypeCompatibility.TRUE;
		} else if (type instanceof RClassType) {
			if (this.type == null) {
				return TypeCompatibility.TRUE;
			}
			final Type other = ((RClassType) type).getTarget();
			return TypeCompatibility.valueOf(other == null
					|| isAssignableFrom(this.type, other));
		}
		return TypeCompatibility.FALSE;
	}

}