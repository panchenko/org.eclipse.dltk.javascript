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

class RArrayType extends RType implements IRArrayType {

	private final IRType itemType;

	public RArrayType(ITypeSystem typeSystem, IRType itemType) {
		super(typeSystem);
		this.itemType = itemType;
	}

	public RArrayType(IRType itemType) {
		this.itemType = itemType;
	}

	public String getName() {
		return ITypeNames.ARRAY + '<' + itemType.getName() + '>';
	}

	public IRType getItemType() {
		return itemType;
	}

	@Override
	public int hashCode() {
		return itemType.hashCode();
	}

	public boolean equals(Object obj) {
		if (obj instanceof RArrayType) {
			final RArrayType other = (RArrayType) obj;
			return itemType.equals(other.itemType);
		}
		return false;
	}

	public TypeCompatibility isAssignableFrom(IRType type) {
		if (super.isAssignableFrom(type).ok()) {
			return TypeCompatibility.TRUE;
		}
		if (type instanceof RArrayType) {
			final IRType ortherItem = ((RArrayType) type).itemType;
			if (ortherItem == RTypes.EMPTY_ARRAY_ITEM_TYPE) {
				return TypeCompatibility.TRUE;
			}
			final TypeCompatibility compatibility = itemType
					.isAssignableFrom(ortherItem);
			return compatibility == TypeCompatibility.TRUE ? compatibility
					: TypeCompatibility.UNPARAMETERIZED;
		} else {
			return TypeCompatibility.FALSE;
		}
	}

	@Override
	public IRType transform(IRTypeTransformer function) {
		final IRType value = function.transform(itemType);
		if (value != itemType) {
			return new RArrayType(value);
		} else {
			return this;
		}
	}

}
