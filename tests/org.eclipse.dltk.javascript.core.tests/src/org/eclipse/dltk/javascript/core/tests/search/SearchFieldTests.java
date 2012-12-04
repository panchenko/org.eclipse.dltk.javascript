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
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.search.FieldDeclarationMatch;
import org.eclipse.dltk.core.search.FieldReferenceMatch;
import org.eclipse.dltk.core.tests.ProjectSetup;
import org.eclipse.dltk.core.tests.model.TestSearchResults;
import org.eclipse.dltk.javascript.core.tests.AllTests;
import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Test;

public class SearchFieldTests extends Assert {

	@ClassRule
	public static final ProjectSetup PROJECT = new ProjectSetup(
			AllTests.WORKSPACE, "selection",
			ProjectSetup.Option.WAIT_INDEXES_READY);

	@Test
	public void testFieldAA() throws CoreException {
		ISourceModule module = PROJECT.getSourceModule("src", "fields.js");
		IModelElement[] elements = on(module).beforeLast("aa").codeSelect();
		assertEquals(1, elements.length);
		final IModelElement field = elements[0];
		final TestSearchResults results = PROJECT
				.search(field, ALL_OCCURRENCES);
		assertEquals(results.toString(), 2, results.size());
		results.sortByOffset();
		assertThat(results.getMatch(0), instanceOf(FieldDeclarationMatch.class));
		assertThat(results.getMatch(1), instanceOf(FieldReferenceMatch.class));
	}

	@Test
	public void testLazyFieldCC() throws CoreException {
		ISourceModule module = PROJECT.getSourceModule("src", "fields.js");
		IModelElement[] elements = on(module).before("cc").codeSelect();
		assertEquals(1, elements.length);
		final IModelElement field = elements[0];
		final TestSearchResults results = PROJECT
				.search(field, ALL_OCCURRENCES);
		assertEquals(results.toString(), 2, results.size());
		assertThat(results.getMatch(0), instanceOf(FieldReferenceMatch.class));
		assertThat(results.getMatch(1), instanceOf(FieldDeclarationMatch.class));
	}

	@Test
	public void testNestedVarUsage() throws CoreException {
		ISourceModule module = PROJECT.getSourceModule("src",
				"nested-var-usage.js");
		IModelElement[] elements = on(module).beforeLast("value").codeSelect();
		assertEquals(1, elements.length);
		final IModelElement value = elements[0];
		final TestSearchResults results = PROJECT
				.search(value, ALL_OCCURRENCES);
		assertEquals(results.toString(), 2, results.size());
		assertThat(results.getMatch(0), instanceOf(FieldDeclarationMatch.class));
		assertThat(results.getMatch(1), instanceOf(FieldReferenceMatch.class));
	}

}
