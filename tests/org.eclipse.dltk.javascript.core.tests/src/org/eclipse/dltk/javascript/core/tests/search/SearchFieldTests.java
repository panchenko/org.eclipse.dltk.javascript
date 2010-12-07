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
import static org.eclipse.dltk.javascript.core.tests.contentassist.AbstractContentAssistTest.firstPositionInFile;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.search.FieldDeclarationMatch;
import org.eclipse.dltk.core.search.FieldReferenceMatch;
import org.eclipse.dltk.core.tests.model.AbstractSingleProjectSearchTests;
import org.eclipse.dltk.core.tests.model.TestSearchResults;
import org.eclipse.dltk.javascript.core.tests.contentassist.SelectionTests;

public class SearchFieldTests extends AbstractSingleProjectSearchTests {

	public SearchFieldTests(String testName) {
		super(PLUGIN_ID, testName, "selection");
	}

	public static Suite suite() {
		return new Suite(SearchFieldTests.class);
	}

	private IModuleSource getModule(String path) throws ModelException {
		return (IModuleSource) getSourceModule(getProjectName(), "src", path);
	}

	public void testFieldAA() throws CoreException {
		IModuleSource module = getModule("fields.js");
		IModelElement[] elements = new SelectionTests(null).select(module,
				lastPositionInFile("aa", module, false));
		assertEquals(1, elements.length);
		final IField field = (IField) elements[0];
		final TestSearchResults results = search(field, ALL_OCCURRENCES);
		assertEquals(2, results.size());
		assertTrue(results.getMatch(0) instanceof FieldDeclarationMatch);
		assertTrue(results.getMatch(1) instanceof FieldReferenceMatch);
	}
	
	
	public void testLazyFieldCC() throws CoreException {
		IModuleSource module = getModule("fields.js");
		IModelElement[] elements = new SelectionTests(null).select(module,
				firstPositionInFile("cc", module, false));
		assertEquals(1, elements.length);
		final IField field = (IField) elements[0];
		final TestSearchResults results = search(field, ALL_OCCURRENCES);
		assertEquals(2, results.size());
		assertTrue(results.getMatch(0) instanceof FieldReferenceMatch);
		assertTrue(results.getMatch(1) instanceof FieldDeclarationMatch);
	}


}
