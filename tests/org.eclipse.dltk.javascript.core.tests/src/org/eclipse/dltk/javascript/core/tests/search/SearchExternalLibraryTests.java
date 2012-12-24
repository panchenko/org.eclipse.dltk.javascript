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

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.dltk.annotations.Internal;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IModelElementVisitor;
import org.eclipse.dltk.core.IProjectFragment;
import org.eclipse.dltk.core.IScriptFolder;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.environment.EnvironmentManager;
import org.eclipse.dltk.core.environment.EnvironmentPathUtils;
import org.eclipse.dltk.core.search.IDLTKSearchConstants;
import org.eclipse.dltk.core.search.SearchEngine;
import org.eclipse.dltk.core.tests.IDLTKSearchConstantsForTests;
import org.eclipse.dltk.core.tests.ProjectSetup;
import org.eclipse.dltk.core.tests.model.TestSearchResults;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.core.tests.AllTests;
import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.rules.RuleChain;
import org.junit.rules.TemporaryFolder;

public class SearchExternalLibraryTests extends Assert implements
		IDLTKSearchConstants, IDLTKSearchConstantsForTests {

	private static final String LIB_NAME = "MyLibrary";

	private static final String MY_EXPORTS_JS = "myExports.js";

	@Internal
	static class LibrarySetup extends TemporaryFolder {
		@Override
		protected void before() throws Throwable {
			super.before();
			final File f = new File(getRoot(), MY_EXPORTS_JS);
			final StringList code = new StringList();
			code.add("function myLibraryExports() {");
			code.add("}");
			final FileWriter writer = new FileWriter(f);
			writer.write(code.toString());
			writer.close();
		}

		public IPath getAbsolutePath() {
			return new Path(getRoot().getAbsolutePath());
		}

		public IPath getFullPath() {
			return EnvironmentPathUtils
					.getFullPath(EnvironmentManager.getLocalEnvironment(),
							getAbsolutePath());
		}
	}

	protected static final LibrarySetup LIBRARY = new LibrarySetup();

	protected static final ProjectSetup PROJECT = new ProjectSetup(
			AllTests.WORKSPACE, "searchExtLib",
			ProjectSetup.Option.WAIT_INDEXES_READY);

	@ClassRule
	public static final RuleChain CLASS_RULE_CHAIN = ProjectSetup.chainOf(
			LIBRARY, new ExternalResource() {
				protected void before() throws Throwable {
					DLTKCore.setBuildpathVariable(LIB_NAME,
							LIBRARY.getFullPath(), null);
				}

				protected void after() {
					DLTKCore.removeBuildpathVariable(LIB_NAME, null);
				}
			}, PROJECT);

	@Test
	public void testFindProjectFragment() throws ModelException {
		final IPath libraryPath = LIBRARY.getFullPath();
		final IProjectFragment fragment = PROJECT.getScriptProject()
				.findProjectFragment(libraryPath);
		assertNotNull(fragment);
		assertTrue(EnvironmentPathUtils.isFull(fragment.getPath()));
		assertEquals(libraryPath, fragment.getPath());
	}

	@Test
	public void testFindProjectFragmentWithoutEnv() throws ModelException {
		final IPath libraryPath = LIBRARY.getAbsolutePath();
		final IProjectFragment fragment = PROJECT.getScriptProject()
				.findProjectFragment(libraryPath);
		assertNull(fragment);
	}

	@Test
	public void testFindScriptFolderWithoutEnv() throws ModelException {
		final IPath libraryPath = LIBRARY.getAbsolutePath();
		final IScriptFolder folder = PROJECT.getScriptProject()
				.findScriptFolder(libraryPath);
		assertNotNull(folder);
		assertTrue(EnvironmentPathUtils.isFull(folder.getPath()));
		assertEquals(libraryPath,
				EnvironmentPathUtils.getLocalPath(folder.getPath()));
	}

	@Test
	public void testFindScriptFolderWithEnv() throws ModelException {
		final IPath libraryPath = EnvironmentPathUtils.getFullPath(
				EnvironmentManager.getLocalEnvironment(),
				LIBRARY.getAbsolutePath());
		final IScriptFolder folder = PROJECT.getScriptProject()
				.findScriptFolder(libraryPath);
		assertNotNull(folder);
		assertTrue(EnvironmentPathUtils.isFull(folder.getPath()));
		assertEquals(libraryPath, folder.getPath());
	}

	@Test
	public void testMyLibraryExports() throws CoreException {
		final List<ISourceModule> modules = new ArrayList<ISourceModule>();
		PROJECT.getScriptProject().accept(new IModelElementVisitor() {
			public boolean visit(IModelElement element) {
				if (element.getElementType() == IModelElement.SOURCE_MODULE) {
					if (MY_EXPORTS_JS.equals(element.getElementName())) {
						modules.add((ISourceModule) element);
					}
					return false;
				}
				return true;
			}
		});
		assertEquals(1, modules.size());
		final TestSearchResults results = PROJECT.search("myLibraryExports",
				METHOD, DECLARATIONS, EXACT_RULE,
				SearchEngine.createSearchScope(modules.get(0)));
		assertEquals(1, results.size());
		final IModelElement method = results.locate(IMethod.class,
				"myLibraryExports");
		final IModelElement parent = method.getParent();
		assertEquals(IModelElement.SOURCE_MODULE, parent.getElementType());
		assertEquals(MY_EXPORTS_JS, parent.getElementName());
	}
}
