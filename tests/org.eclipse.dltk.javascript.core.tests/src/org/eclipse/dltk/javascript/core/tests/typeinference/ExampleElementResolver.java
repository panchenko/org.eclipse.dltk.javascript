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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.dltk.compiler.CharOperation;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.javascript.typeinfo.IElementResolver;
import org.eclipse.dltk.javascript.typeinfo.ITypeInfoContext;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;

@SuppressWarnings("nls")
public class ExampleElementResolver implements IElementResolver {

	public static final String MEMBER_VALUE = "AAAAAAAAAAAAAAAAAAAA";

	public Member resolveElement(ITypeInfoContext context, String name) {
		if ("ExampleGlobal".equals(name)) {
			Property property = TypeInfoModelFactory.eINSTANCE.createProperty();
			property.setType(context.getType(ExampleTypeProvider.TYPE_SERVICE));
			property.setName(name);
			property.setDeprecated(true);
			return property;
		} else if ("GLOBALS".equals(name)) {
			Property property = TypeInfoModelFactory.eINSTANCE.createProperty();
			property.setName(name);

			StringList code = new StringList();
			code.add("function hello() { return 'Hello'; }");
			code.add("var name = 'Alex'");

			final Script script = new JavaScriptParser().parse(code.toString(),
					null);
			if (script != null) {
				TypeInferencer2 inferencer = new TypeInferencer2();
				inferencer.doInferencing(script);
				property.setAttribute(MEMBER_VALUE, inferencer.getCollection());
			}
			return property;
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
			property.setDescription("Description for <b>exampleForms</b>");
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

	private static final boolean ENABLE_LIST_GLOBALS = false;

	public Set<String> listGlobals(ITypeInfoContext context, String prefix) {
		if (ENABLE_LIST_GLOBALS) {
			Set<String> result = new HashSet<String>();
			String[] names = new String[] { "ExampleGlobal", "GLOBALS",
					"executeExampleGlobal", "exampleForms", "myExampleForms" };
			for (String name : names) {
				if (CharOperation.prefixEquals(prefix, name)) {
					result.add(name);
				}
			}
			return result;
		} else {
			return null;
		}
	}

}
