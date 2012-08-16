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

import junit.framework.TestCase;

import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.javascript.typeinfo.TypeQuery;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;

public class TypeQueryTests extends TestCase implements ITypeNames {

	private List<Type> toList(final Iterable<Type> iterable) {
		final List<Type> types = new ArrayList<Type>();
		for (Type type : iterable) {
			types.add(type);
		}
		return types;
	}

	public void testHierarchy() {
		final Type type = TypeInfoModelFactory.eINSTANCE.createType();
		type.getTraits().add(Types.STRING);
		type.getTraits().add(Types.NUMBER);
		final TypeQuery query = new TypeQuery(type);
		final List<Type> all = query.getHierarchy();
		assertEquals(4, all.size());
		assertSame(type, all.get(0));
		assertSame(Types.STRING, all.get(1));
		assertSame(Types.NUMBER, all.get(2));
		assertSame(Types.OBJECT, all.get(3));
	}

	public void testTraits() {
		final Type base = TypeInfoModelFactory.eINSTANCE.createType();
		base.getTraits().add(Types.STRING);
		base.getTraits().add(Types.NUMBER);
		final Type type = TypeInfoModelFactory.eINSTANCE.createType();
		type.setSuperType(base);
		type.getTraits().add(Types.NUMBER);
		final List<Type> traits = toList(new TypeQuery(type).getAllTraits());
		assertEquals(2, traits.size());
		assertSame(Types.NUMBER, traits.get(0));
		assertSame(Types.STRING, traits.get(1));
	}

	public void testTraits2() {
		final Type base = TypeInfoModelFactory.eINSTANCE.createType();
		base.getTraits().add(Types.STRING);
		base.getTraits().add(Types.NUMBER);
		final Type type = TypeInfoModelFactory.eINSTANCE.createType();
		type.setSuperType(base);
		final List<Type> traits = toList(new TypeQuery(type).getAllTraits());
		assertEquals(2, traits.size());
		assertSame(Types.STRING, traits.get(0));
		assertSame(Types.NUMBER, traits.get(1));
	}

}
