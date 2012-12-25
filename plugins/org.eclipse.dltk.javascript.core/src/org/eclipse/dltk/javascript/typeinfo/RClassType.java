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

import org.eclipse.dltk.annotations.Nullable;
import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.internal.core.TypeSystems;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;

public class RClassType extends RType implements IRClassType {

	@Nullable
	protected final Type type;
	@Nullable
	protected final IRTypeDeclaration declaration;

	protected RClassType(ITypeSystem typeSystem, Type type) {
		super(typeSystem);
		this.type = type;
		this.declaration = type != null ? convert(type) : null;
		if (DEBUG)
			if (type != null)
				checkType(type);
	}

	protected RClassType(Type type) {
		this.type = type;
		this.declaration = type != null ? convert(type) : null;
		if (DEBUG)
			if (type != null)
				checkType(type);
	}

	protected RClassType(@Nullable IRTypeDeclaration declaration) {
		this.type = declaration != null ? declaration.getSource() : null;
		this.declaration = declaration;
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
		return declaration != null ? declaration.getSource() : null;
	}

	public IRTypeDeclaration getDeclaration() {
		return declaration;
	}

	public IRType toItemType() {
		if (type == null) {
			return RTypes.any();
		} else if (Types.ARRAY == type) {
			return RTypes.arrayOf(TypeSystems.GLOBAL, RTypes.none());
		} else {
			return type.toRType(typeSystem);
		}
	}

	public IRType newItemType() {
		if (type == null) {
			return RTypes.any();
		} else if (Types.ARRAY == type) {
			return RTypes.arrayOf(TypeSystems.GLOBAL, RTypes.any());
		} else {
			return type.createInstance(typeSystem);
		}
	}

	@Override
	public int hashCode() {
		return declaration != null ? declaration.hashCode() : 31;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RClassType) {
			final RClassType other = (RClassType) obj;
			return declaration != null ? declaration.equals(other.declaration)
					: other.declaration == null;
		}
		return false;
	}

	@Override
	public TypeCompatibility isAssignableFrom(IRType type) {
		if (super.isAssignableFrom(type).ok()) {
			return TypeCompatibility.TRUE;
		} else if (type instanceof RClassType) {
			if (this.declaration == null) {
				return TypeCompatibility.TRUE;
			}
			final IRTypeDeclaration other = ((RClassType) type).declaration;
			if (other == null) {
				return TypeCompatibility.TRUE;
			}
			return this.declaration.isAssignableFrom(other);
		}
		return TypeCompatibility.FALSE;
	}
}