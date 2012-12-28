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
package org.eclipse.dltk.javascript.core.tests.typeinfo;

import static java.util.Collections.singletonList;
import static org.eclipse.dltk.javascript.core.Types.ARRAY;
import static org.eclipse.dltk.javascript.core.Types.NUMBER;
import static org.eclipse.dltk.javascript.core.Types.OBJECT;
import static org.eclipse.dltk.javascript.core.Types.STRING;
import static org.eclipse.dltk.javascript.typeinfo.RTypes.simple;
import junit.framework.TestCase;

import org.eclipse.dltk.internal.javascript.ti.TypeSystemImpl;
import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.typeinfo.IRTypeDeclaration;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.dltk.javascript.typeinfo.TypeCompatibility;
import org.eclipse.dltk.javascript.typeinfo.model.GenericType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeVariable;

@SuppressWarnings("restriction")
public class RTypeDeclarationTests extends TestCase {

	private ITypeSystem typeSystem;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.typeSystem = new TypeSystemImpl();
	}

	public void testAssignableFrom() {
		final IRTypeDeclaration string = typeSystem.convert(STRING);
		final IRTypeDeclaration number = typeSystem.convert(NUMBER);
		final IRTypeDeclaration object = typeSystem.convert(OBJECT);
		assertEquals(TypeCompatibility.TRUE, object.isAssignableFrom(string));
		assertEquals(TypeCompatibility.TRUE, object.isAssignableFrom(number));
		assertEquals(TypeCompatibility.FALSE, number.isAssignableFrom(string));
	}

	public void testAssignableFromArray() {
		final IRTypeDeclaration arrayOfString = typeSystem.parameterize(ARRAY,
				singletonList(simple(typeSystem, STRING)));
		final IRTypeDeclaration arrayOfNumber = typeSystem.parameterize(ARRAY,
				singletonList(simple(typeSystem, NUMBER)));
		final IRTypeDeclaration arrayOfObject = typeSystem.parameterize(ARRAY,
				singletonList(simple(typeSystem, OBJECT)));
		assertEquals(TypeCompatibility.TRUE,
				arrayOfObject.isAssignableFrom(arrayOfString));
		assertEquals(TypeCompatibility.TRUE,
				arrayOfObject.isAssignableFrom(arrayOfNumber));
		assertEquals(TypeCompatibility.UNPARAMETERIZED,
				arrayOfNumber.isAssignableFrom(arrayOfString));
	}

	public void testAssignableFromArrayUntyped() {
		final IRTypeDeclaration arrayOfString = typeSystem.parameterize(ARRAY,
				singletonList(simple(typeSystem, STRING)));
		final IRTypeDeclaration arrayOfNumber = typeSystem.parameterize(ARRAY,
				singletonList(simple(typeSystem, NUMBER)));
		final IRTypeDeclaration array = typeSystem.convert(ARRAY);
		assertEquals(TypeCompatibility.TRUE,
				array.isAssignableFrom(arrayOfString));
		assertEquals(TypeCompatibility.TRUE,
				array.isAssignableFrom(arrayOfNumber));
	}

	public void testAssignableFromGenericChild() {
		final IRTypeDeclaration arrayOfString = typeSystem.parameterize(ARRAY,
				singletonList(simple(typeSystem, STRING)));

		final GenericType listType = TypeInfoModelFactory.eINSTANCE
				.createGenericType();
		listType.setName("List");
		listType.setSuperType(Types.ARRAY);
		final TypeVariable variable = TypeInfoModelFactory.eINSTANCE
				.createTypeVariable();
		variable.setName("T");
		listType.getTypeParameters().add(variable);

		final IRTypeDeclaration listOfString = typeSystem.parameterize(
				listType, singletonList(simple(typeSystem, STRING)));

		assertEquals(TypeCompatibility.TRUE,
				arrayOfString.isAssignableFrom(listOfString));
	}

	public void testAssignableFromParameterized() {
		final GenericType listType = TypeInfoModelFactory.eINSTANCE
				.createGenericType();
		listType.setName("List");
		final TypeVariable variable = TypeInfoModelFactory.eINSTANCE
				.createTypeVariable();
		variable.setName("T");
		listType.getTypeParameters().add(variable);

		final IRTypeDeclaration list = typeSystem.convert(listType);

		final IRTypeDeclaration listOfString = typeSystem.parameterize(
				listType, singletonList(simple(typeSystem, STRING)));

		assertEquals(TypeCompatibility.TRUE,
				list.isAssignableFrom(listOfString));
		assertEquals(TypeCompatibility.TRUE,
				listOfString.isAssignableFrom(list));
	}

	public void testCycles() {
		final Type aType = TypeInfoModelFactory.eINSTANCE.createType();
		aType.setName("A");
		final Type bType = TypeInfoModelFactory.eINSTANCE.createType();
		bType.setName("B");
		aType.setSuperType(bType);
		bType.setSuperType(aType);

		final IRTypeDeclaration a = typeSystem.convert(aType);
		final IRTypeDeclaration b = typeSystem.convert(bType);
		assertSame(b, a.getSuperType());
		assertSame(a, b.getSuperType());
	}

}
