/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.core.tests.typeinference;

import org.eclipse.dltk.javascript.typeinfo.ITypeInfoContext;
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.javascript.typeinfo.ITypeProvider;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;

public class ExampleTypeProvider implements ITypeProvider {

	private static final String TYPE_SERVICE = "ExampleService";
	private static final String TYPE_RESPONSE = "ExampleResponse";

	public Type getType(ITypeInfoContext context, String typeName) {
		if (TYPE_SERVICE.equals(typeName)) {
			Type type = TypeInfoModelFactory.eINSTANCE.createType();
			type.setName(typeName);
			type.setKind(TypeKind.JAVA);
			Method method1 = TypeInfoModelFactory.eINSTANCE.createMethod();
			method1.setName("execute");
			method1.setType(context.getType(TYPE_RESPONSE));
			type.getMembers().add(method1);
			Property prop1 = TypeInfoModelFactory.eINSTANCE.createProperty();
			prop1.setName("name");
			prop1.setType(context.getType(ITypeNames.STRING));
			type.getMembers().add(prop1);
			return type;
		} else if (TYPE_RESPONSE.equals(typeName)) {
			Type type = TypeInfoModelFactory.eINSTANCE.createType();
			type.setName(typeName);
			type.setKind(TypeKind.JAVA);
			Property prop1 = TypeInfoModelFactory.eINSTANCE.createProperty();
			prop1.setName("status");
			prop1.setType(context.getType(ITypeNames.NUMBER));
			type.getMembers().add(prop1);
			Property prop2 = TypeInfoModelFactory.eINSTANCE.createProperty();
			prop2.setName("service");
			prop2.setType(context.getType(TYPE_SERVICE));
			type.getMembers().add(prop2);
			return type;
		}
		return null;
	}

}
