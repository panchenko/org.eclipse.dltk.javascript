/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.core.tests.builder;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.ByteArrayInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IScriptFolder;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceModuleInfoCache;
import org.eclipse.dltk.core.ISourceModuleInfoCache.ISourceModuleInfo;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.SourceParserUtil;
import org.eclipse.dltk.core.tests.ProjectSetup;
import org.eclipse.dltk.internal.core.ModelManager;
import org.eclipse.dltk.javascript.core.tests.AllTests;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import com.google.common.base.Charsets;

@SuppressWarnings("restriction")
public class SourceModuleInfoCacheTest extends Assert {

	@Rule
	public final ProjectSetup PROJECT = new ProjectSetup(AllTests.WORKSPACE,
			"cache");

	@Before
	public void clearCache() {
		getCache().clear();
	}

	private ISourceModuleInfoCache getCache() {
		return ModelManager.getModelManager().getSourceModuleInfoCache();
	}

	private ISourceModuleInfo getCacheEntry(final ISourceModule module) {
		return getCache().get(module);
	}

	@Test
	public void cacheLoaded() throws CoreException {
		final ISourceModule module = checkNotNull(PROJECT.getSourceModule(
				"src", "folder1/a.js"));
		assertTrue(module.exists());
		assertNotNull(SourceParserUtil.parse(module, null));
		assertFalse(getCacheEntry(module).isEmpty());
	}

	@Test
	public void moduleModify() throws CoreException {
		final ISourceModule module = checkNotNull(PROJECT.getSourceModule(
				"src", "folder1/a.js"));
		assertTrue(module.exists());
		assertNotNull(SourceParserUtil.parse(module, null));
		assertFalse(getCacheEntry(module).isEmpty());

		final IFile file = (IFile) module.getResource();
		final String contents = PROJECT.getFileContentsAsString(file);
		file.setContents(
				new ByteArrayInputStream((contents + "//change\n")
						.getBytes(Charsets.UTF_8)), IResource.NONE, null);
		assertTrue(getCacheEntry(module).isEmpty());
	}

	@Test
	public void moduleDelete() throws ModelException {
		final ISourceModule module = checkNotNull(PROJECT.getSourceModule(
				"src", "folder1/a.js"));
		assertTrue(module.exists());
		assertNotNull(SourceParserUtil.parse(module, null));
		assertFalse(getCacheEntry(module).isEmpty());

		module.delete(true, null);
		assertFalse(module.exists());
		assertTrue(getCacheEntry(module).isEmpty());
	}

	@Ignore
	@Test
	public void folderDelete() throws ModelException {
		final ISourceModule module = checkNotNull(PROJECT.getSourceModule(
				"src", "folder1/a.js"));
		assertTrue(module.exists());
		assertNotNull(SourceParserUtil.parse(module, null));
		assertFalse(getCacheEntry(module).isEmpty());

		((IScriptFolder) module.getAncestor(IModelElement.SCRIPT_FOLDER))
				.delete(true, null);
		assertFalse(module.exists());
		assertTrue(getCacheEntry(module).isEmpty());
	}

	@Ignore
	@Test
	public void projectDelete() throws ModelException {
		final ISourceModule module = checkNotNull(PROJECT.getSourceModule(
				"src", "folder1/a.js"));
		assertTrue(module.exists());
		assertNotNull(SourceParserUtil.parse(module, null));
		assertFalse(getCacheEntry(module).isEmpty());

		ProjectSetup.delete(PROJECT);
		assertFalse(module.exists());
		assertTrue(getCacheEntry(module).isEmpty());
	}

}
