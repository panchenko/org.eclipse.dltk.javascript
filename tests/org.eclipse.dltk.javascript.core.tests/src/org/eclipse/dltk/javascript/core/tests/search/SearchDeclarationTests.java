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
import org.eclipse.dltk.core.tests.model.AbstractSingleProjectSearchTests;
import org.eclipse.dltk.core.tests.model.TestSearchResults;

public class SearchDeclarationTests extends AbstractSingleProjectSearchTests {

	public SearchDeclarationTests(String testName) {
		super("org.eclipse.dltk.javascript.core.tests", testName, "search");
	}

	public static Suite suite() {
		return new Suite(SearchDeclarationTests.class);
	}

	public void testFunctionHello1() throws CoreException {
		final TestSearchResults results = search("hello", METHOD, DECLARATIONS);
		assertEquals(1, results.size());
		final IModelElement method = results.locate(IMethod.class, "hello");
		final IModelElement parent = method.getParent();
		assertEquals(IModelElement.SOURCE_MODULE, parent.getElementType());
		assertEquals("hello.js", parent.getElementName());
	}

	public void testFunctionHello2() throws CoreException {
		final TestSearchResults results = search("hello2", METHOD, DECLARATIONS);
		assertEquals(1, results.size());
		final IModelElement method = results.locate(IMethod.class, "hello2");
		final IModelElement parent = method.getParent();
		assertEquals(IModelElement.SOURCE_MODULE, parent.getElementType());
		assertEquals("hello2.js", parent.getElementName());
	}

	public void testVarA() throws CoreException {
		final TestSearchResults results = search("a", FIELD, DECLARATIONS);
		assertEquals(1, results.size());
		final IModelElement method = results.locate(IField.class, "a");
		final IModelElement parent = method.getParent();
		assertEquals(IModelElement.SOURCE_MODULE, parent.getElementType());
		assertEquals("a.js", parent.getElementName());
	}

	public void testVarB() throws CoreException {
		final TestSearchResults results = search("b", FIELD, DECLARATIONS);
		assertEquals(1, results.size());
		final IModelElement method = results.locate(IField.class, "b");
		final IModelElement parent = method.getParent();
		assertEquals(IModelElement.SOURCE_MODULE, parent.getElementType());
		assertEquals("b.js", parent.getElementName());
	}

}
