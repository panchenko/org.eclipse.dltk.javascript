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

import static org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory.eINSTANCE;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.dltk.javascript.typeinfo.TypeMemberQuery;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
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

}
