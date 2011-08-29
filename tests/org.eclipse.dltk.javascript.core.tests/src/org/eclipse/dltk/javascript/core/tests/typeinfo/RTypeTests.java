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
package org.eclipse.dltk.javascript.core.tests.typeinfo;

import junit.framework.TestCase;

import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class RTypeTests extends TestCase implements ITypeNames {

	private static Type getType(String typeName) {
		return TypeInfoModelLoader.getInstance().getType(typeName);
	}

	public void testAssignableSuperType() {
		final Type superType = getType(STRING);
		final Type type = TypeInfoModelFactory.eINSTANCE.createType();
		type.setName(EcoreUtil.generateUUID());
		type.setSuperType(superType);
		assertTrue(JSTypeSet.ref(superType).isAssignableFrom(
				JSTypeSet.ref(type)));
	}

	public void testAssignableTrait() {
		final Type trait = getType(STRING);
		final Type type = TypeInfoModelFactory.eINSTANCE.createType();
		type.setName(EcoreUtil.generateUUID());
		type.getTraits().add(trait);
		assertTrue(JSTypeSet.ref(trait).isAssignableFrom(JSTypeSet.ref(type)));
	}

}
