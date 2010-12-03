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
import static org.eclipse.dltk.javascript.core.tests.contentassist.AbstractContentAssistTest.lastPositionInFile;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.search.FieldDeclarationMatch;
import org.eclipse.dltk.core.search.FieldReferenceMatch;
import org.eclipse.dltk.core.search.MethodDeclarationMatch;
import org.eclipse.dltk.core.search.MethodReferenceMatch;
import org.eclipse.dltk.core.tests.model.AbstractSingleProjectSearchTests;
import org.eclipse.dltk.core.tests.model.TestSearchResults;
import org.eclipse.dltk.javascript.core.tests.contentassist.SelectionTests;

public class SearchFunctionTests extends AbstractSingleProjectSearchTests {

	public SearchFunctionTests(String testName) {
		super(PLUGIN_ID, testName, "selection");
	}

	public static Suite suite() {
		return new Suite(SearchFunctionTests.class);
	}

	private IModuleSource getModule(String path) throws ModelException {
		return (IModuleSource) getSourceModule(getProjectName(), "src", path);
	}

	public void testFunctionGlobalField() throws CoreException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = new SelectionTests(null).select(module,
				lastPositionInFile("fun1", module, false));
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final TestSearchResults results = search(method, ALL_OCCURRENCES);
		assertEquals(2, results.size());
		// TODO check should first a declaration be found and then the reference?
		assertTrue(results.getMatch(1) instanceof MethodDeclarationMatch);
		assertTrue(results.getMatch(0) instanceof MethodReferenceMatch);
	}
	
	public void testFunctionLocalField() throws CoreException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = new SelectionTests(null).select(module,
				lastPositionInFile("fun2", module, false));
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final TestSearchResults results = search(method, ALL_OCCURRENCES);
		assertEquals(2, results.size());
		assertTrue(results.getMatch(0) instanceof MethodDeclarationMatch);
		assertTrue(results.getMatch(1) instanceof MethodReferenceMatch);
	}

	public void testFunctionLocalFieldWithDoubleName() throws CoreException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = new SelectionTests(null).select(module,
				lastPositionInFile("fun4", module, false));
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final TestSearchResults results = search(method, ALL_OCCURRENCES);
		assertEquals(2, results.size());
		assertTrue(results.getMatch(0) instanceof MethodDeclarationMatch);
		assertTrue(results.getMatch(1) instanceof MethodReferenceMatch);
	}

	public void testFunctionThisField() throws CoreException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = new SelectionTests(null).select(module,
				lastPositionInFile("fun5", module, false));
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final TestSearchResults results = search(method, ALL_OCCURRENCES);
		assertEquals(2, results.size());
		assertTrue(results.getMatch(0) instanceof MethodDeclarationMatch);
		assertTrue(results.getMatch(1) instanceof MethodReferenceMatch);
	}
	
	public void testFunctionThisFieldOuterCall() throws CoreException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = new SelectionTests(null).select(module,
				lastPositionInFile("fun6", module, false));
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final TestSearchResults results = search(method, ALL_OCCURRENCES);
		assertEquals(2, results.size());
		assertTrue(results.getMatch(0) instanceof MethodDeclarationMatch);
		assertTrue(results.getMatch(1) instanceof MethodReferenceMatch);
	}

	public void testFunctionThisFieldWithInnerFunction() throws CoreException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = new SelectionTests(null).select(module,
				lastPositionInFile("fun8", module, false));
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final TestSearchResults results = search(method, ALL_OCCURRENCES);
		assertEquals(2, results.size());
		assertTrue(results.getMatch(0) instanceof MethodDeclarationMatch);
		assertTrue(results.getMatch(1) instanceof MethodReferenceMatch);
	}

	public void testFunctionThisFieldWithInnerFunctionCall() throws CoreException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = new SelectionTests(null).select(module,
				lastPositionInFile("funA", module, false));
		assertEquals(0, elements.length);
	}

	public void testGlobalInitializerFunctionField() throws CoreException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = new SelectionTests(null).select(module,
				lastPositionInFile("funB", module, false));
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final TestSearchResults results = search(method, ALL_OCCURRENCES);
		assertEquals(2, results.size());
		assertTrue(results.getMatch(0) instanceof MethodDeclarationMatch);
		assertTrue(results.getMatch(1) instanceof MethodReferenceMatch);
	}
	
	public void testLocalInitializerFunctionField() throws CoreException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = new SelectionTests(null).select(module,
				lastPositionInFile("funC", module, false));
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final TestSearchResults results = search(method, ALL_OCCURRENCES);
		assertEquals(2, results.size());
		assertTrue(results.getMatch(0) instanceof MethodDeclarationMatch);
		assertTrue(results.getMatch(1) instanceof MethodReferenceMatch);
	}



}
