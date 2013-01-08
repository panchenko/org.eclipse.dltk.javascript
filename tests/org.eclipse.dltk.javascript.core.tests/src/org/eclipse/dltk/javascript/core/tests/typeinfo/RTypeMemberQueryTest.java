/*******************************************************************************
 * Copyright (c) 2013 NumberFour AG
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

import org.eclipse.dltk.internal.javascript.ti.TypeSystemImpl;
import org.eclipse.dltk.javascript.typeinfo.IRMethod;
import org.eclipse.dltk.javascript.typeinfo.IRTypeDeclaration;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.dltk.javascript.typeinfo.MemberPredicates;
import org.eclipse.dltk.javascript.typeinfo.RTypeMemberQuery;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("restriction")
public class RTypeMemberQueryTest extends Assert {

	private static final TypeInfoModelFactory TIMF = TypeInfoModelFactory.eINSTANCE;

	private final ITypeSystem typeSystem = new TypeSystemImpl();

	@Test
	public void findSuperMethod() {
		final Type base = TIMF.createType();
		base.setName("Base");
		final Method baseRun = TIMF.createMethod();
		baseRun.setAbstract(true);
		baseRun.setName("run");
		base.getMembers().add(baseRun);

		final Type child = TIMF.createType();
		child.setSuperType(base);
		child.setName("Child");
		final Method childRun = TIMF.createMethod();
		childRun.setAbstract(true);
		childRun.setName("run");
		child.getMembers().add(childRun);

		final IRTypeDeclaration declaration = typeSystem.convert(child);
		final RTypeMemberQuery memberQuery = new RTypeMemberQuery(declaration,
				MemberPredicates.NON_STATIC);
		final IRMethod method = memberQuery.findMethod("run");
		assertNotNull(method);
		assertSame(childRun, method.getSource());

		final IRMethod superMethod = memberQuery.findSuperMethod("run");
		assertNotNull(superMethod);
		assertSame(baseRun, superMethod.getSource());
	}

}
