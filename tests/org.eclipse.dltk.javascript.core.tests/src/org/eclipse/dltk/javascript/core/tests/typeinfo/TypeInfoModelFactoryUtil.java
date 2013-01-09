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

import static org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory.eINSTANCE;

import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

/**
 * Static factory methods to simplify creation of type info model objects in
 * tests.
 * 
 * @noinstantiate This class is not intended to be instantiated by clients.
 */
public class TypeInfoModelFactoryUtil {

	public static Type newType(String name) {
		final Type type = eINSTANCE.createType();
		type.setName(name);
		return type;
	}

	public static Method newMethod(String name, Type declaringType) {
		final Method method = eINSTANCE.createMethod();
		method.setName(name);
		declaringType.getMembers().add(method);
		return method;
	}

	public static Parameter newParameter(String name, Method method) {
		final Parameter parameter = eINSTANCE.createParameter();
		parameter.setName(name);
		method.getParameters().add(parameter);
		return parameter;
	}

	public static Property newProperty(String name, Type declaringType) {
		final Property property = eINSTANCE.createProperty();
		property.setName(name);
		declaringType.getMembers().add(property);
		return property;
	}

}
