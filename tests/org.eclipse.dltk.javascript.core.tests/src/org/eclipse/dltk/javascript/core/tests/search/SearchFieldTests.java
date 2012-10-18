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
import static org.eclipse.dltk.javascript.core.tests.contentassist.AbstractContentAssistTest.firstPositionInFile;
import static org.eclipse.dltk.javascript.core.tests.contentassist.AbstractContentAssistTest.lastPositionInFile;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.search.FieldDeclarationMatch;
import org.eclipse.dltk.core.search.FieldReferenceMatch;
import org.eclipse.dltk.core.tests.model.TestSearchResults;

public class SearchFieldTests extends AbstractSearchTest {

	public SearchFieldTests(String testName) {
		super(PLUGIN_ID, testName, "selection");
	}

	public static Suite suite() {
		return new Suite(SearchFieldTests.class);
	}

	public void testFieldAA() throws CoreException {
		if (notYetImplemented())
			return;
		IModuleSource module = getModule("fields.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("aa", module, false));
		assertEquals(1, elements.length);
		final IModelElement field = elements[0];
		final TestSearchResults results = search(field, ALL_OCCURRENCES);
		assertEquals(results.toString(), 2, results.size());
		assertTrue(results.getMatch(0) instanceof FieldDeclarationMatch);
		assertTrue(results.getMatch(1) instanceof FieldReferenceMatch);
	}

	public void testLazyFieldCC() throws CoreException {
		if (notYetImplemented())
			return;
		IModuleSource module = getModule("fields.js");
		IModelElement[] elements = select(module,
				firstPositionInFile("cc", module, false));
		assertEquals(1, elements.length);
		final IModelElement field = elements[0];
		final TestSearchResults results = search(field, ALL_OCCURRENCES);
		assertEquals(results.toString(), 2, results.size());
		assertTrue(results.getMatch(0) instanceof FieldReferenceMatch);
		assertTrue(results.getMatch(1) instanceof FieldDeclarationMatch);
	}

}
