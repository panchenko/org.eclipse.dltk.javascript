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
package org.eclipse.dltk.javascript.core.tests.typeinfo;

import junit.framework.TestCase;

import org.eclipse.dltk.compiler.env.ModuleSource;
import org.eclipse.dltk.compiler.problem.ProblemCollector;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.javascript.typeinfo.TypeInfoManager;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;

public class TypeInfoModelTests extends TestCase implements ITypeNames {

	public void testPredefinedTypes() {
		String[] typeNames = { STRING, NUMBER, BOOLEAN, OBJECT, DATE, XML,
				ARRAY };
		for (String typeName : typeNames) {
			Type type = TypeInfoModelLoader.getInstance().getType(typeName);
			assertNotNull(typeName + " not found", type);
			assertEquals(typeName + " should be predefined",
					TypeKind.PREDEFINED, type.getKind());
		}
	}

	public void testLoad() {
		assertTrue(TypeInfoManager.getModelBuilders().length > 0);
		// load parser classes
		final JavaScriptParser parser = new JavaScriptParser();
		parser.parse(new ModuleSource("x=1"), new ProblemCollector());
	}

}
