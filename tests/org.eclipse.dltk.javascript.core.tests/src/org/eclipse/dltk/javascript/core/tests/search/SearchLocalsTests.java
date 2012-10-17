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
import org.eclipse.dltk.core.ILocalVariable;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.search.LocalVariableDeclarationMatch;
import org.eclipse.dltk.core.search.LocalVariableReferenceMatch;
import org.eclipse.dltk.core.tests.model.TestSearchResults;

public class SearchLocalsTests extends AbstractSearchTest {

	public SearchLocalsTests(String testName) {
		super(PLUGIN_ID, testName, "selection");
	}

	public static Suite suite() {
		return new Suite(SearchLocalsTests.class);
	}

	public void testLocalVariableReference() throws CoreException {
		IModuleSource module = getModule("locals.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("beta", module, false));
		assertEquals(1, elements.length);
		final ILocalVariable var = (ILocalVariable) elements[0];
		final TestSearchResults results = search(var, ALL_OCCURRENCES);
		assertEquals(3, results.size());
		assertTrue(results.getMatch(0) instanceof LocalVariableDeclarationMatch);
		assertTrue(results.getMatch(1) instanceof LocalVariableReferenceMatch);
		assertTrue(results.getMatch(2) instanceof LocalVariableReferenceMatch);
	}

	public void testLocalVariableAsArgumentReference() throws CoreException {
		IModuleSource module = getModule("locals.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("alpha", module, false));
		assertEquals(1, elements.length);
		final ILocalVariable var = (ILocalVariable) elements[0];
		final TestSearchResults results = search(var, ALL_OCCURRENCES);
		assertEquals(2, results.size());
		assertTrue(results.getMatch(0) instanceof LocalVariableDeclarationMatch);
		assertTrue(results.getMatch(1) instanceof LocalVariableReferenceMatch);
	}

}
