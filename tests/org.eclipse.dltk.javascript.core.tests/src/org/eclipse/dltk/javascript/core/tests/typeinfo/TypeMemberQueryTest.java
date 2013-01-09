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

import static org.eclipse.dltk.javascript.core.tests.typeinfo.TypeInfoModelFactoryUtil.newMethod;
import static org.eclipse.dltk.javascript.core.tests.typeinfo.TypeInfoModelFactoryUtil.newType;
import static org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory.eINSTANCE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.dltk.javascript.typeinfo.MemberPredicates;
import org.eclipse.dltk.javascript.typeinfo.TypeMemberQuery;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class TypeMemberQueryTest extends TestCase {

	public void testStaticAndInstanceMembers() {
		final Type type = eINSTANCE.createType();
		type.setName("Test");
		final Method instanceMethod = eINSTANCE.createMethod();
		instanceMethod.setName("run");
		type.getMembers().add(instanceMethod);
		final Method staticMethod = eINSTANCE.createMethod();
		staticMethod.setName("run");
		staticMethod.setStatic(true);
		type.getMembers().add(staticMethod);
		final List<Member> unique = new ArrayList<Member>();
		for (Member member : new TypeMemberQuery(type).ignoreDuplicates()) {
			unique.add(member);
		}
		assertEquals(2, unique.size());
	}

	/**
	 * Make sure that when using the ignoreDuplicates normal members takes
	 * precedence over abstract ones
	 */
	public void testAbstractAndNormalMembers() {
		final Type superClass = eINSTANCE.createType();
		superClass.setName("SuperClass");
		final Method normalMethod = eINSTANCE.createMethod();
		normalMethod.setName("method");
		{
			final Parameter param = eINSTANCE.createParameter();
			param.setName("normalMethodParam");
			normalMethod.getParameters().add(param);
		}
		superClass.getMembers().add(normalMethod);

		final Type middleClass = eINSTANCE.createType();
		middleClass.setName("MiddleClass");
		middleClass.setSuperType(superClass);

		final Type trait = eINSTANCE.createType();
		trait.setName("Trait");
		final Method abstractMethod = eINSTANCE.createMethod();
		abstractMethod.setName("method");
		abstractMethod.setAbstract(true);
		{
			final Parameter param = eINSTANCE.createParameter();
			param.setName("abstractMethodParam");
			abstractMethod.getParameters().add(param);
		}
		trait.getMembers().add(abstractMethod);

		final Type subClass = eINSTANCE.createType();
		subClass.setName("SubClass");
		subClass.setSuperType(middleClass);
		subClass.getTraits().add(trait);

		final Iterator<Member> it = new TypeMemberQuery(subClass)
				.ignoreDuplicates().iterator();
		assertTrue(it.hasNext());
		final Member member = it.next();
		assertFalse(it.hasNext());
		assertSame(normalMethod, member);
	}

	public void testFindSuperMethod() {
		final Type base = newType("Base");
		final Method baseRun = newMethod("run", base);
		baseRun.setAbstract(true);

		final Type child = newType("Child");
		child.setSuperType(base);
		final Method childRun = newMethod("run", child);

		final TypeMemberQuery memberQuery = new TypeMemberQuery(child,
				MemberPredicates.NON_STATIC);
		final Method method = memberQuery.findMethod("run");
		assertNotNull(method);
		assertSame(childRun, method);

		final Method superMethod = memberQuery.findSuperMethod("run");
		assertNotNull(superMethod);
		assertSame(baseRun, superMethod);
	}

	public void testFindSuperMethods() {
		final Type typeA = newType("A");
		final Method methodA = newMethod("run", typeA);
		methodA.setAbstract(true);

		final Type typeB = newType("B");
		typeB.setSuperType(typeA);
		final Method methodB = newMethod("run", typeB);

		final Type typeC = newType("C");
		typeC.setSuperType(typeB);
		@SuppressWarnings("unused")
		final Method methodC = newMethod("run", typeC);

		final TypeMemberQuery memberQuery = new TypeMemberQuery(typeC,
				MemberPredicates.NON_STATIC);

		final List<Method> superMethods = memberQuery.findSuperMethods("run");
		assertEquals(2, superMethods.size());
		assertSame(methodB, superMethods.get(0));
		assertSame(methodA, superMethods.get(1));
	}

}
