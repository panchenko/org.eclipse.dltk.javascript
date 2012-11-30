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
package org.eclipse.dltk.javascript.core.tests.search;

import static org.eclipse.dltk.javascript.core.tests.AllTests.PLUGIN_ID;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.tests.model.AbstractSingleProjectSearchTests;
import org.eclipse.dltk.core.tests.model.TestSearchResults;
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;

public class SearchTypeReferenceTests extends AbstractSingleProjectSearchTests {

	public SearchTypeReferenceTests(String testName) {
		super(PLUGIN_ID, testName, "search");
	}

	public static Suite suite() {
		return new Suite(SearchTypeReferenceTests.class);
	}

	public void testReturnType() throws CoreException {
		final TestSearchResults results = search("Database", TYPE, REFERENCES);
		assertEquals(2, results.size());
		{
			final IModelElement method = results.locate(IMethod.class,
					"getDatabase");
			final IModelElement parent = method.getParent();
			assertEquals(IModelElement.SOURCE_MODULE, parent.getElementType());
			assertEquals("returnType.js", parent.getElementName());
		}
		{
			final IModelElement method = results.locate(IMethod.class,
					"getDatabaseFunction");
			final IModelElement parent = method.getParent();
			assertEquals(IModelElement.SOURCE_MODULE, parent.getElementType());
			assertEquals("returnFunctionType.js", parent.getElementName());
		}
	}

	public void testFunction() throws CoreException {
		final TestSearchResults results = search(ITypeNames.FUNCTION, TYPE,
				REFERENCES);
		assertEquals(1, results.size());
		final IModelElement method = results.locate(IMethod.class,
				"getDatabaseFunction");
		final IModelElement parent = method.getParent();
		assertEquals(IModelElement.SOURCE_MODULE, parent.getElementType());
		assertEquals("returnFunctionType.js", parent.getElementName());
	}

	public void testParamType() throws CoreException {
		final TestSearchResults results = search("Request", TYPE, REFERENCES);
		assertEquals(1, results.size());
		final IModelElement method = results.locate(IMethod.class,
				"executeRequest");
		final IModelElement parent = method.getParent();
		assertEquals(IModelElement.SOURCE_MODULE, parent.getElementType());
		assertEquals("paramType.js", parent.getElementName());
	}

	public void testVarType() throws CoreException {
		final TestSearchResults results = search("MyApplication", TYPE,
				REFERENCES);
		assertEquals(1, results.size());
		final IModelElement method = results.locate(IField.class, "app");
		final IModelElement parent = method.getParent();
		assertEquals(IModelElement.SOURCE_MODULE, parent.getElementType());
		assertEquals("varType.js", parent.getElementName());
	}

}
