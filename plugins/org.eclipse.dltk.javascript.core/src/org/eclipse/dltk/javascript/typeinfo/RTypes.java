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

import org.eclipse.dltk.javascript.typeinfo.JSTypeSet.TypeKey;

/**
 * Static utility methods pertaining to {@code IRType} instances.
 */
public class RTypes {

	private RTypes() {
	}

	private static final IRType UNDEFINED_TYPE = new TypeKey() {
		public String getName() {
			return ITypeNames.UNDEFINED;
		}

		public TypeCompatibility isAssignableFrom(IRType type) {
			return TypeCompatibility.valueOf(type == this);
		}
	};

	/**
	 * Returns the instance of the special <b>undefined</b> type.
	 */
	public static IRType undefined() {
		return UNDEFINED_TYPE;
	}

	private static final IRType ANY_TYPE = new TypeKey() {
		public String getName() {
			return "Any";
		}

		@Override
		public TypeCompatibility isAssignableFrom(IRType type) {
			return TypeCompatibility.TRUE;
		}

		@Override
		public boolean isExtensible() {
			return true;
		}
	};

	/**
	 * Returns the instance of the logical <b>Any</b> type.
	 * 
	 * @return
	 */
	public static IRType any() {
		return ANY_TYPE;
	}

	private static final IRType NONE_TYPE = new TypeKey() {
		public String getName() {
			return "None";
		}

		@Override
		public TypeCompatibility isAssignableFrom(IRType type) {
			return TypeCompatibility.TRUE;
		}

		@Override
		public boolean isExtensible() {
			return true;
		}
	};

	/**
	 * Returns the instance of the logical <b>None</b> type (which is used as a
	 * placeholder if array item type is not known/specified).
	 */
	public static IRType none() {
		return NONE_TYPE;
	}

	/**
	 * Returns the instance of the <b>empty array literal</b>.
	 */
	public static IRArrayType arrayOf() {
		return JSTypeSet.arrayOf(EMPTY_ARRAY_ITEM_TYPE);
	}

	static final IRType EMPTY_ARRAY_ITEM_TYPE = new TypeKey() {
		public String getName() {
			return "empty";
		}

		@Override
		public TypeCompatibility isAssignableFrom(IRType type) {
			return TypeCompatibility.TRUE;
		}

		@Override
		public boolean isExtensible() {
			return true;
		}
	};

}
