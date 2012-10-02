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

import static org.eclipse.dltk.javascript.typeinfo.RTypes.arrayOf;
import static org.eclipse.dltk.javascript.typeinfo.RTypes.simple;

import java.util.Collections;

import junit.framework.TestCase;

import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.typeinfo.IRClassType;
import org.eclipse.dltk.javascript.typeinfo.IRFunctionType;
import org.eclipse.dltk.javascript.typeinfo.IRMapType;
import org.eclipse.dltk.javascript.typeinfo.IRParameter;
import org.eclipse.dltk.javascript.typeinfo.IRSimpleType;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.IRTypeDeclaration;
import org.eclipse.dltk.javascript.typeinfo.IRUnionType;
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.javascript.typeinfo.RTypes;
import org.eclipse.dltk.javascript.typeinfo.TypeCompatibility;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.FunctionType;
import org.eclipse.dltk.javascript.typeinfo.model.MapType;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.UnionType;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class RTypeTests extends TestCase implements ITypeNames {

	private static final TypeInfoModelFactory TIMF = TypeInfoModelFactory.eINSTANCE;

	public void testAssignableJavaScriptObject() {
		final IRType object = simple(Types.OBJECT);
		assertEquals(TypeCompatibility.TRUE,
				object.isAssignableFrom(arrayOf(simple(Types.STRING))));
		assertEquals(TypeCompatibility.TRUE, object.isAssignableFrom(RTypes
				.functionType(Collections.<IRParameter> emptyList(),
						simple(Types.STRING))));
	}

	public void testAssignableSuperType() {
		final Type superType = Types.STRING;
		final Type type = TIMF.createType();
		type.setName(EcoreUtil.generateUUID());
		type.setSuperType(superType);
		assertEquals(TypeCompatibility.TRUE, RTypes.simple(superType)
				.isAssignableFrom(RTypes.simple(type)));
	}

	public void testAssignableTrait() {
		final Type trait = Types.STRING;
		final Type type = TIMF.createType();
		type.setName(EcoreUtil.generateUUID());
		type.getTraits().add(trait);
		assertEquals(TypeCompatibility.TRUE, RTypes.simple(trait)
				.isAssignableFrom(RTypes.simple(type)));
	}

	public void testSimpleType() {
		final IRType type = RTypes.create(TypeUtil.ref(Types.STRING));
		assertSame(Types.STRING, ((IRSimpleType) type).getTarget());
	}

	public void testClassType() {
		final IRType type = RTypes.create(TypeUtil.classType(Types.STRING));
		assertSame(Types.STRING, ((IRClassType) type).getTarget());
	}

	public void testMapType() {
		final MapType mapType = TIMF.createMapType();
		mapType.setKeyType(TypeUtil.ref(Types.STRING));
		mapType.setValueType(TypeUtil.ref(Types.NUMBER));
		final IRMapType type = (IRMapType) RTypes.create(mapType);
		assertEquals(RTypes.simple(Types.STRING), type.getKeyType());
		assertEquals(RTypes.simple(Types.NUMBER), type.getValueType());
	}

	public void testUnionType() {
		final UnionType unionType = TIMF.createUnionType();
		unionType.getTargets().add(TypeUtil.ref(Types.STRING));
		unionType.getTargets().add(TypeUtil.ref(Types.NUMBER));
		final IRUnionType type = (IRUnionType) RTypes.create(unionType);
		assertEquals(2, type.getTargets().size());
		assertTrue(type.getTargets().contains(RTypes.simple(Types.STRING)));
		assertTrue(type.getTargets().contains(RTypes.simple(Types.NUMBER)));
	}

	public void testFunctionType() {
		final FunctionType functionType = TIMF.createFunctionType();
		functionType.setReturnType(TypeUtil.ref(Types.STRING));
		final Parameter parameter = TIMF.createParameter();
		parameter.setName("num");
		parameter.setType(TypeUtil.ref(Types.NUMBER));
		functionType.getParameters().add(parameter);
		final IRFunctionType type = (IRFunctionType) RTypes
				.create(functionType);
		assertEquals(RTypes.simple(Types.STRING), type.getReturnType());
		assertEquals(1, type.getParameters().size());
		assertEquals(RTypes.simple(Types.NUMBER), type.getParameters().get(0)
				.getType());
		assertEquals(TypeCompatibility.TRUE,
				type.isAssignableFrom(RTypes.simple(Types.FUNCTION)));
	}

	public void testTypeDeclaration() {
		final IRTypeDeclaration stringType = ((IRSimpleType) RTypes
				.simple(Types.STRING)).getDeclaration();
		assertEquals(Types.STRING.getMembers().size(), stringType.getMembers()
				.size());
		final IRTypeDeclaration objectType = stringType.getSuperType();
		assertEquals(Types.OBJECT.getName(), objectType.getName());
		assertEquals(Types.OBJECT.getMembers().size(), objectType.getMembers()
				.size());
	}

}
