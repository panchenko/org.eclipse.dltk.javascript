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

import org.eclipse.dltk.javascript.typeinfo.IElementResolver;
import org.eclipse.dltk.javascript.typeinfo.ITypeInfoContext;
import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;

@SuppressWarnings("nls")
public class ExampleElementResolver implements IElementResolver {

	public Element resolveElement(ITypeInfoContext context, String name) {
		if ("ExampleGlobal".equals(name)) {
			return context.getType(ExampleTypeProvider.TYPE_SERVICE);
		} else if ("executeExampleGlobal".equals(name)) {
			final Type type = context.getType(ExampleTypeProvider.TYPE_SERVICE);
			for (Member member : type.getMembers()) {
				if ("execute".equals(member.getName())) {
					return member;
				}
			}
		} else if ("exampleForms".equals(name)) {
			Property property = TypeInfoModelFactory.eINSTANCE.createProperty();
			property.setType(context
					.getType(ExampleTypeProvider.TYPE_EXAMPLE_FORMS));
			property.setName(name);
			return property;
		} else if ("myExampleForms".equals(name)) {
			Property property = TypeInfoModelFactory.eINSTANCE.createProperty();
			property.setType(context
					.getType(ExampleTypeProvider.TYPE_EXAMPLE_FORMS));
			property.setName(name);
			property.setDeprecated(true);
			return property;
		}
		return null;
	}

}
