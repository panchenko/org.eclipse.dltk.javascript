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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.search.IDLTKSearchConstants;
import org.eclipse.dltk.core.tests.ProjectSetup;
import org.eclipse.dltk.core.tests.model.TestSearchResults;
import org.eclipse.dltk.javascript.core.tests.AllTests;
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Test;

public class SearchTypeReferenceTests extends Assert implements
		IDLTKSearchConstants {

	@ClassRule
	public static final ProjectSetup PROJECT = new ProjectSetup(
			AllTests.WORKSPACE, "search",
			ProjectSetup.Option.WAIT_INDEXES_READY);

	@Test
	public void testReturnType() throws CoreException {
		final TestSearchResults results = PROJECT.search("Database", TYPE,
				REFERENCES);
		assertEquals(3, results.size());
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
		{
			final IModelElement method = results.locate(IMethod.class, "test");
			final IModelElement parent = method.getParent();
			assertEquals(IModelElement.SOURCE_MODULE, parent.getElementType());
			assertEquals("localVarType.js", parent.getElementName());
		}
	}

	@Test
	public void testFunction() throws CoreException {
		final TestSearchResults results = PROJECT.search(ITypeNames.FUNCTION,
				TYPE, REFERENCES);
		assertEquals(1, results.size());
		final IModelElement method = results.locate(IMethod.class,
				"getDatabaseFunction");
		final IModelElement parent = method.getParent();
		assertEquals(IModelElement.SOURCE_MODULE, parent.getElementType());
		assertEquals("returnFunctionType.js", parent.getElementName());
	}

	@Test
	public void testParamType() throws CoreException {
		final TestSearchResults results = PROJECT.search("Request", TYPE,
				REFERENCES);
		assertEquals(1, results.size());
		final IModelElement method = results.locate(IMethod.class,
				"executeRequest");
		final IModelElement parent = method.getParent();
		assertEquals(IModelElement.SOURCE_MODULE, parent.getElementType());
		assertEquals("paramType.js", parent.getElementName());
	}

	@Test
	public void testVarType() throws CoreException {
		final TestSearchResults results = PROJECT.search("MyApplication", TYPE,
				REFERENCES);
		assertEquals(1, results.size());
		final IModelElement method = results.locate(IField.class, "app");
		final IModelElement parent = method.getParent();
		assertEquals(IModelElement.SOURCE_MODULE, parent.getElementType());
		assertEquals("varType.js", parent.getElementName());
	}

}
