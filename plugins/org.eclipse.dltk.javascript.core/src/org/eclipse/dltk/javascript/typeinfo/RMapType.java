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

class RMapType extends RType implements IRMapType {

	private final IRType valueType;
	private final IRType keyType;

	public RMapType(IRType keyType, IRType valueType) {
		this.keyType = keyType;
		this.valueType = valueType;
	}

	public String getName() {
		// if the key type is set but it is a String then just default to
		// without it.
		if (valueType != null && keyType != null
				&& !ITypeNames.STRING.equals(keyType.getName())) {
			return ITypeNames.OBJECT + '<' + keyType.getName() + ','
					+ valueType.getName() + '>';
		}
		return valueType != null ? ITypeNames.OBJECT + '<'
				+ valueType.getName() + '>' : ITypeNames.OBJECT;
	}

	@Override
	public int hashCode() {
		return valueType.hashCode();
	}

	public boolean equals(Object obj) {
		if (obj instanceof RMapType) {
			final RMapType other = (RMapType) obj;
			return valueType.equals(other.valueType);
		}
		return false;
	}

	@Override
	public boolean isExtensible() {
		return true;
	}

	public TypeCompatibility isAssignableFrom(IRType type) {
		if (super.isAssignableFrom(type).ok()) {
			return TypeCompatibility.TRUE;
		}
		if (type instanceof RMapType) {
			return valueType.isAssignableFrom(((RMapType) type).valueType);
		}
		return TypeCompatibility.FALSE;
	}

	public IRType getKeyType() {
		return keyType;
	}

	public IRType getValueType() {
		return valueType;
	}

}
