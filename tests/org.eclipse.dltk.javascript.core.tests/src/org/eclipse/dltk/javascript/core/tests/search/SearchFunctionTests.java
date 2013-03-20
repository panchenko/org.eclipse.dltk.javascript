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

import static org.eclipse.dltk.core.index2.search.ISearchEngine.SearchFor.ALL_OCCURRENCES;
import static org.eclipse.dltk.core.tests.CodeAssistUtil.on;
import static org.hamcrest.CoreMatchers.instanceOf;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.index2.search.ISearchEngine.SearchFor;
import org.eclipse.dltk.core.search.FieldDeclarationMatch;
import org.eclipse.dltk.core.search.FieldReferenceMatch;
import org.eclipse.dltk.core.search.LocalVariableDeclarationMatch;
import org.eclipse.dltk.core.search.LocalVariableReferenceMatch;
import org.eclipse.dltk.core.search.MethodDeclarationMatch;
import org.eclipse.dltk.core.search.MethodReferenceMatch;
import org.eclipse.dltk.core.tests.ProjectSetup;
import org.eclipse.dltk.core.tests.model.TestSearchResults;
import org.eclipse.dltk.javascript.core.tests.AllTests;
import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.Test;

public class SearchFunctionTests extends Assert {

	@ClassRule
	public static final ProjectSetup PROJECT = new ProjectSetup(
			AllTests.WORKSPACE, "selection",
			ProjectSetup.Option.WAIT_INDEXES_READY);

	@Test
	public void testFunctionGlobalField() throws CoreException {
		ISourceModule module = PROJECT.getSourceModule("src", "functions.js");
		IModelElement[] elements = on(module).beforeLast("fun1").codeSelect();
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final TestSearchResults results = PROJECT.search(method,
				ALL_OCCURRENCES);
		assertEquals(2, results.size());
		assertThat(results.getMatch(0), instanceOf(FieldDeclarationMatch.class));
		assertThat(results.getMatch(1), instanceOf(FieldReferenceMatch.class));
	}

	@Test
	public void testFunctionLocalField() throws CoreException {
		ISourceModule module = PROJECT.getSourceModule("src", "functions.js");
		IModelElement[] elements = on(module).beforeLast("fun2").codeSelect();
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final TestSearchResults results = PROJECT.search(method,
				ALL_OCCURRENCES);
		assertEquals(2, results.size());
		assertThat(results.getMatch(0),
				instanceOf(LocalVariableDeclarationMatch.class));
		assertThat(results.getMatch(1),
				instanceOf(LocalVariableReferenceMatch.class));
	}

	@Test
	public void testFunctionLocalFieldWithDoubleName() throws CoreException {
		ISourceModule module = PROJECT.getSourceModule("src", "functions.js");
		IModelElement[] elements = on(module).beforeLast("fun4").codeSelect();
		assertEquals(0, elements.length);
	}

	@Ignore
	@Test
	public void testFunctionThisField() throws CoreException {
		ISourceModule module = PROJECT.getSourceModule("src", "functions.js");
		IModelElement[] elements = on(module).beforeLast("fun5").codeSelect();
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final TestSearchResults results = PROJECT.search(method,
				ALL_OCCURRENCES);
		assertEquals(2, results.size());
		assertThat(results.getMatch(0),
				instanceOf(MethodDeclarationMatch.class));
		assertThat(results.getMatch(1), instanceOf(MethodReferenceMatch.class));
	}

	@Test
	public void testFunctionThisFieldOuterCall() throws CoreException {
		ISourceModule module = PROJECT.getSourceModule("src", "functions.js");
		IModelElement[] elements = on(module).beforeLast("fun6").codeSelect();
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final TestSearchResults results = PROJECT.search(method,
				ALL_OCCURRENCES);
		assertEquals(2, results.size());
		assertThat(results.getMatch(0),
				instanceOf(MethodDeclarationMatch.class));
		assertThat(results.getMatch(1), instanceOf(MethodReferenceMatch.class));
	}

	@Test
	public void testFunctionThisFieldWithInnerFunction() throws CoreException {
		ISourceModule module = PROJECT.getSourceModule("src", "functions.js");
		IModelElement[] elements = on(module).beforeLast("fun8").codeSelect();
		assertEquals(0, elements.length);
	}

	@Test
	public void testFunctionThisFieldWithInnerFunctionCall()
			throws CoreException {
		ISourceModule module = PROJECT.getSourceModule("src", "functions.js");
		IModelElement[] elements = on(module).beforeLast("funA").codeSelect();
		assertEquals(0, elements.length);
	}

	@Test
	public void testGlobalInitializerFunctionField() throws CoreException {
		ISourceModule module = PROJECT.getSourceModule("src", "functions.js");
		IModelElement[] elements = on(module).beforeLast("funB").codeSelect();
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final TestSearchResults results = PROJECT.search(method,
				ALL_OCCURRENCES);
		assertEquals(results.toString(), 2, results.size());
		assertThat(results.getMatch(0), instanceOf(MethodDeclarationMatch.class));
		assertThat(results.getMatch(1), instanceOf(MethodReferenceMatch.class));
	}

	@Test
	public void testLocalInitializerFunctionField() throws CoreException {
		ISourceModule module = PROJECT.getSourceModule("src", "functions.js");
		IModelElement[] elements = on(module).beforeLast("funC").codeSelect();
		assertEquals(1, elements.length);
		final IModelElement method = elements[0];
		final TestSearchResults results = PROJECT.search(method,
				SearchFor.ALL_OCCURRENCES);
		assertEquals(2, results.size());
		assertThat(results.getMatch(0), instanceOf(MethodDeclarationMatch.class));
		assertThat(results.getMatch(1), instanceOf(MethodReferenceMatch.class));
	}

}
