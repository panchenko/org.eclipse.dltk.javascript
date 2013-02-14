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

import static java.util.Arrays.asList;
import junit.framework.TestCase;

import org.eclipse.dltk.internal.javascript.ti.TypeSystemImpl;
import org.eclipse.dltk.javascript.typeinfo.CommonSuperTypeFinder;
import org.eclipse.dltk.javascript.typeinfo.IRSimpleType;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.dltk.javascript.typeinfo.RTypes;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;

@SuppressWarnings("restriction")
public class CommonSuperTypeFinderTest extends TestCase {

	private final ITypeSystem typeSystem = new TypeSystemImpl();
	private IRSimpleType a;
	private IRSimpleType b;
	private IRSimpleType c;
	private IRSimpleType e;

	private IRSimpleType createType(String name, Type superType) {
		final Type type = TypeInfoModelFactory.eINSTANCE.createType();
		type.setName(name);
		type.setSuperType(superType);
		return (IRSimpleType) type.toRType(typeSystem);
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		a = createType("A", null);
		b = createType("B", a.getTarget());
		c = createType("C", b.getTarget());
		e = createType("E", a.getTarget());
	}

	private IRType evaluate(IRType... types) {
		final IRType result = CommonSuperTypeFinder.evaluate(typeSystem,
				asList(types));
		for (IRType[] permutation : Permutations.of(types)) {
			assertEquals(result, CommonSuperTypeFinder.evaluate(typeSystem,
					asList(permutation)));
		}
		return result;
	}

	public void testSimpleTypes() {
		assertEquals(b, evaluate(b, c));
		assertEquals(a, evaluate(b, a, c));
		assertEquals(a, evaluate(e, c));
		assertEquals(a, evaluate(a, b, e));
		assertEquals(a, evaluate(a, b, e, c));
		assertEquals(a, evaluate(e, c, b));
	}

	public void testWithAny() {
		assertEquals(RTypes.any(), evaluate(b, RTypes.any()));
	}

	public void testWithUndefined() {
		assertEquals(b, evaluate(b, RTypes.undefined()));
	}

	public void testArray() {
		assertEquals(
				RTypes.arrayOf(typeSystem, a),
				evaluate(RTypes.arrayOf(typeSystem, b),
						RTypes.arrayOf(typeSystem, e)));
	}

	public void testClass() {
		assertEquals(
				RTypes.classType(a.getDeclaration()),
				evaluate(RTypes.classType(b.getDeclaration()),
						RTypes.classType(e.getDeclaration())));
		assertEquals(
				RTypes.classType(a.getDeclaration()),
				evaluate(RTypes.classType(c.getDeclaration()),
						RTypes.classType(e.getDeclaration())));
	}

}
