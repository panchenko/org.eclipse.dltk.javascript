/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
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

import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.dltk.javascript.typeinfo.model.TypeRef;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;

public class TypeUtil {

	public static TypeRef ref(Type type) {
		if (type != null) {
			final TypeRef ref = TypeInfoModelFactory.eINSTANCE.createTypeRef();
			ref.setTarget(type);
			return ref;
		}
		return null;
	}

	public static JSType ref(String typeName) {
		final Type type = TypeInfoModelLoader.getInstance().getType(typeName);
		if (type != null) {
			return ref(type);
		}
		return ref(TypeInferencer2.createProxy(typeName));
	}

	public static ArrayType arrayOf(String itemType) {
		return arrayOf(ref(itemType));
	}

	public static ArrayType arrayOf(JSType itemType) {
		final ArrayType arrayType = TypeInfoModelFactory.eINSTANCE
				.createArrayType();
		arrayType.setItemType(itemType != null ? itemType
				: ref(TypeInfoModelLoader.getInstance().getType(
						ITypeNames.OBJECT)));
		return arrayType;
	}

	public static Type extractType(JSType type) {
		if (type instanceof TypeRef) {
			return ((TypeRef) type).getTarget();
		} else if (type instanceof ArrayType) {
			return TypeInfoModelLoader.getInstance().getType(ITypeNames.ARRAY);
		} else {
			return null;
		}
	}

	public static JSType extractArrayItemType(JSType type) {
		if (type instanceof ArrayType) {
			return ((ArrayType) type).getItemType();
		} else {
			return null;
		}
	}

	public static String getName(JSType type) {
		return type != null ? type.getName() : null;
	}

	public static String getName(Type type) {
		if (type.isProxy()) {
			return URI.decode(((InternalEObject) type).eProxyURI().fragment());
		} else {
			return type.getName();
		}
	}

}
