/*******************************************************************************
 * Copyright (c) 2014 Alex Panchenko
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Alex Panchenko - initial API and Implementation
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.library;

import static org.eclipse.core.resources.ResourcesPlugin.getWorkspace;
import static org.eclipse.dltk.core.IScriptProjectFilenames.BUILDPATH_FILENAME;

import java.util.concurrent.TimeUnit;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.IProjectFragment;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.environment.EnvironmentPathUtils;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.emf.common.util.URI;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class TypeLibraryModelResourceSetCache {

	static LoadingCache<IProject, TypeLibraryModelResourceSet> cache;

	public static synchronized LoadingCache<IProject, TypeLibraryModelResourceSet> getInstance() {
		if (cache == null) {
			cache = CacheBuilder
					.newBuilder()
					.maximumSize(4)
					.expireAfterAccess(10, TimeUnit.MINUTES)
					.build(new CacheLoader<IProject, TypeLibraryModelResourceSet>() {
						@Override
						public TypeLibraryModelResourceSet load(IProject key)
								throws ModelException {
							final TypeLibraryModelResourceSet resourceSet = new TypeLibraryModelResourceSet();
							for (IProjectFragment fragment : DLTKCore.create(
									key).getProjectFragments()) {
								if (fragment instanceof TypeLibraryProjectFragment) {
									final URI uri = URI
											.createFileURI(EnvironmentPathUtils
													.getLocalPath(
															fragment.getPath())
													.toFile().toString());
									resourceSet.getResource(uri, true);
								}
							}
							return resourceSet;
						}
					});
			getWorkspace().addResourceChangeListener(
					new IResourceChangeListener() {
						public void resourceChanged(IResourceChangeEvent event) {
							try {
								event.getDelta().accept(new DeltaVisitor());
							} catch (CoreException e) {
								JavaScriptPlugin.error(
										"Error processing resource delta", e);
							}
						}
					}, IResourceChangeEvent.POST_CHANGE);
		}
		return cache;
	}

	static class DeltaVisitor implements IResourceDeltaVisitor {
		public boolean visit(IResourceDelta delta) throws CoreException {
			final IResource resource = delta.getResource();
			if (resource.getType() == IResource.ROOT) {
				return true;
			}
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				if (resource.getType() == IResource.PROJECT) {
					final IProject project = (IProject) resource;
					if (project.isOpen()) {
						cache.invalidate(project);
					}
					return true;
				} else {
					if (resource.getType() == IResource.FILE
							&& affects((IFile) resource)) {
						cache.invalidate(resource.getProject());
					}
					return false;
				}
			case IResourceDelta.CHANGED:
				if (resource.getType() == IResource.PROJECT) {
					if ((delta.getFlags() & IResourceDelta.OPEN) != 0) {
						final IProject project = (IProject) resource;
						cache.invalidate(project);
					}
					return true;
				} else {
					if (((delta.getFlags() & IResourceDelta.CONTENT) != 0)
							&& resource.getType() == IResource.FILE
							&& affects((IFile) resource)) {
						cache.invalidate(resource.getProject());
					}
					return false;
				}
			case IResourceDelta.REMOVED:
				if (resource.getType() == IResource.PROJECT) {
					final IProject project = (IProject) resource;
					cache.invalidate(project);
					return true;
				} else {
					if (resource.getType() == IResource.FILE
							&& affects((IFile) resource)) {
						cache.invalidate(resource.getProject());
					}
					return false;
				}
			}
			return false;
		}

		private static boolean affects(IFile file) {
			return file.getParent() instanceof IProject
					&& BUILDPATH_FILENAME.equals(file.getName());
		}
	}
}
