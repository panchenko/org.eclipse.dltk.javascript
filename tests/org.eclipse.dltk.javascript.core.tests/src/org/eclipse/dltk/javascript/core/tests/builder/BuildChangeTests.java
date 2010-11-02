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
package org.eclipse.dltk.javascript.core.tests.builder;

import static org.eclipse.dltk.javascript.core.tests.AllTests.PLUGIN_ID;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.builder.IProjectChange;
import org.eclipse.dltk.core.tests.model.AbstractModelTests;
import org.eclipse.dltk.internal.core.builder.IncrementalProjectChange;

/**
 * Tests related to the new build infrastructure. There is no strong preference
 * to use JS, but some language is actually required.
 */
@SuppressWarnings("restriction")
public class BuildChangeTests extends AbstractModelTests {

	private static final String PRJ_NAME = "build";

	public BuildChangeTests(String name) {
		super(PLUGIN_ID, name);
	}

	private static final List<ChangeListener> changeListeners = new ArrayList<BuildChangeTests.ChangeListener>();

	private static class ChangeListener implements IResourceChangeListener {

		public ChangeListener() {
			changeListeners.add(this);
			getWorkspace().addResourceChangeListener(this,
					IResourceChangeEvent.POST_CHANGE);
		}

		final List<IProjectChange> deltas = new ArrayList<IProjectChange>();

		public void resourceChanged(IResourceChangeEvent event) {
			final IResourceDelta delta = event.getDelta().findMember(
					new Path(PRJ_NAME));
			if (delta != null) {
				final IncrementalProjectChange change = new IncrementalProjectChange(
						delta, getProject(PRJ_NAME), new NullProgressMonitor());
				deltas.add(change);
			}
		}

		public void dispose() {
			getWorkspace().removeResourceChangeListener(this);
			changeListeners.remove(this);
		}

		public IProjectChange getChange() {
			assertEquals(1, deltas.size());
			return deltas.get(0);
		}
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		setUpProject(PRJ_NAME);
	}

	@Override
	protected void tearDown() throws Exception {
		for (ChangeListener changeListener : changeListeners
				.toArray(new ChangeListener[changeListeners.size()])) {
			changeListener.dispose();
		}
		changeListeners.clear();
		deleteProject(PRJ_NAME);
		super.tearDown();
	}

	public void testFileCreate() throws CoreException {
		final ChangeListener listener = new ChangeListener();
		getProject(PRJ_NAME).getFile("src/folder1/c.js").create(
				new ByteArrayInputStream("var c=1".getBytes()), true, null);
		final IProjectChange change = listener.getChange();
		assertEquals(0, change.getRenames().size());
		assertEquals(0, change.getDeletes(IProjectChange.DEFAULT).size());
		assertEquals(1, change.getResources(IProjectChange.ALL).size());
		assertEquals(1,
				change.getResources(IProjectChange.ALL | IProjectChange.ADDED)
						.size());
		assertEquals(
				0,
				change.getResources(IProjectChange.ALL | IProjectChange.CHANGED)
						.size());
		assertEquals(0, change.getResources(IProjectChange.DEFAULT).size());
		assertEquals(1, change.getSourceModules(IProjectChange.DEFAULT).size());
		assertEquals(1, change.getSourceModules(IProjectChange.ADDED).size());
		assertEquals(0, change.getSourceModules(IProjectChange.CHANGED).size());
	}

	public void testMultipleFileCreate() throws CoreException {
		final ChangeListener listener = new ChangeListener();
		DLTKCore.run(new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				final IProject p = getProject(PRJ_NAME);
				p.getFile("src/folder1/c.js").create(
						new ByteArrayInputStream("var c=1".getBytes()), true,
						null);
				p.getFile("src/folder1/d.dat").create(
						new ByteArrayInputStream("var c=1".getBytes()), true,
						null);
			}
		}, null);
		final IProjectChange change = listener.getChange();
		assertEquals(0, change.getRenames().size());
		assertEquals(0, change.getDeletes(IProjectChange.DEFAULT).size());
		assertEquals(2, change.getResources(IProjectChange.ALL).size());
		assertEquals(2,
				change.getResources(IProjectChange.ALL | IProjectChange.ADDED)
						.size());
		assertEquals(
				0,
				change.getResources(IProjectChange.ALL | IProjectChange.CHANGED)
						.size());
		assertEquals(1, change.getResources(IProjectChange.DEFAULT).size());
		assertEquals(1, change.getSourceModules(IProjectChange.DEFAULT).size());
		assertEquals(1, change.getSourceModules(IProjectChange.ADDED).size());
		assertEquals(0, change.getSourceModules(IProjectChange.CHANGED).size());
	}

	public void testFileDelete() throws CoreException {
		final ChangeListener listener = new ChangeListener();
		getProject(PRJ_NAME).getFile("src/folder1/a.js").delete(true, null);
		final IProjectChange change = listener.getChange();
		assertEquals(0, change.getResources(IProjectChange.ALL).size());
		assertEquals(0, change.getRenames().size());
		final List<IPath> deletes = change.getDeletes(IProjectChange.DEFAULT);
		assertEquals(1, deletes.size());
		assertEquals("a.js", deletes.get(0).lastSegment());
	}

	public void testFolderDelete() throws CoreException {
		final ChangeListener listener = new ChangeListener();
		getProject(PRJ_NAME).getFolder("src/folder1").delete(true, null);
		final IProjectChange change = listener.getChange();
		assertEquals(0, change.getResources(IProjectChange.ALL).size());
		assertEquals(0, change.getRenames().size());
		final List<IPath> deletes = change.getDeletes(IProjectChange.DEFAULT);
		assertEquals(2, deletes.size());
		assertEquals("a.js", deletes.get(0).lastSegment());
		assertEquals("b.js", deletes.get(1).lastSegment());
	}

	public void testMultipleFileDelete() throws CoreException {
		final ChangeListener listener = new ChangeListener();
		DLTKCore.run(new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				final IProject p = getProject(PRJ_NAME);
				p.getFile("src/folder1/b.js").delete(true, null);
				p.getFile("src/folder1/a.js").delete(true, null);
			}
		}, null);
		final IProjectChange change = listener.getChange();
		assertEquals(0, change.getResources(IProjectChange.ALL).size());
		assertEquals(0, change.getRenames().size());
		final List<IPath> deletes = change.getDeletes(IProjectChange.DEFAULT);
		assertEquals(2, deletes.size());
		assertEquals("a.js", deletes.get(0).lastSegment());
		assertEquals("b.js", deletes.get(1).lastSegment());
	}

	public void testFileRename() throws CoreException {
		final ChangeListener listener = new ChangeListener();
		getProject(PRJ_NAME).getFile("src/folder1/a.js").move(new Path("c.js"),
				true, null);
		final IProjectChange change = listener.getChange();
		assertEquals(1, change.getRenames().size());
		assertEquals(1, change.getDeletes(IProjectChange.DEFAULT).size());
		assertEquals(0, change.getDeletes(IProjectChange.NO_RENAMES).size());
		assertEquals(1, change.getResources(IProjectChange.ALL).size());
		assertEquals(1,
				change.getResources(IProjectChange.ALL | IProjectChange.ADDED)
						.size());
		assertEquals(
				0,
				change.getResources(IProjectChange.ALL | IProjectChange.CHANGED)
						.size());
		assertEquals(0, change.getResources(IProjectChange.DEFAULT).size());
		assertEquals(1, change.getSourceModules(IProjectChange.DEFAULT).size());
		assertEquals(1, change.getSourceModules(IProjectChange.ADDED).size());
		assertEquals(0, change.getSourceModules(IProjectChange.CHANGED).size());
	}

	public void testFolderRename() throws CoreException {
		final ChangeListener listener = new ChangeListener();
		getProject(PRJ_NAME).getFolder("src/folder1").move(new Path("folder2"),
				true, null);
		final IProjectChange change = listener.getChange();
		System.out.println(change);
		assertEquals(2, change.getRenames().size());
		assertEquals(2, change.getDeletes(IProjectChange.DEFAULT).size());
		assertEquals(0, change.getDeletes(IProjectChange.NO_RENAMES).size());
		assertEquals(2, change.getResources(IProjectChange.ALL).size());
		assertEquals(2,
				change.getResources(IProjectChange.ALL | IProjectChange.ADDED)
						.size());
		assertEquals(
				0,
				change.getResources(IProjectChange.ALL | IProjectChange.CHANGED)
						.size());
		assertEquals(0, change.getResources(IProjectChange.DEFAULT).size());
		assertEquals(2, change.getSourceModules(IProjectChange.DEFAULT).size());
		assertEquals(2, change.getSourceModules(IProjectChange.ADDED).size());
		assertEquals(0, change.getSourceModules(IProjectChange.CHANGED).size());
	}
}
