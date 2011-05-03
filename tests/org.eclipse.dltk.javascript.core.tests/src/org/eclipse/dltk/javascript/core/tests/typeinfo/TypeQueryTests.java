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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.javascript.typeinfo.TypeQuery;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;

import junit.framework.TestCase;

public class TypeQueryTests extends TestCase implements ITypeNames {

	private static Type getType(String typeName) {
		return TypeInfoModelLoader.getInstance().getType(typeName);
	}

	private List<Type> toList(final Iterable<Type> iterable) {
		final List<Type> types = new ArrayList<Type>();
		for (Type type : iterable) {
			types.add(type);
		}
		return types;
	}

	public void testHierarchy() {
		final Type type = TypeInfoModelFactory.eINSTANCE.createType();
		type.getTraits().add(getType(STRING));
		type.getTraits().add(getType(NUMBER));
		final TypeQuery query = new TypeQuery(type);
		final List<Type> all = query.getHierarchy();
		assertEquals(4, all.size());
		assertSame(type, all.get(0));
		assertSame(getType(STRING), all.get(1));
		assertSame(getType(NUMBER), all.get(2));
		assertSame(getType(OBJECT), all.get(3));
	}

	public void testTraits() {
		final Type base = TypeInfoModelFactory.eINSTANCE.createType();
		base.getTraits().add(getType(STRING));
		base.getTraits().add(getType(NUMBER));
		final Type type = TypeInfoModelFactory.eINSTANCE.createType();
		type.setSuperType(base);
		type.getTraits().add(getType(NUMBER));
		final List<Type> traits = toList(new TypeQuery(type).getAllTraits());
		assertEquals(2, traits.size());
		assertSame(getType(NUMBER), traits.get(0));
		assertSame(getType(STRING), traits.get(1));
	}

}
