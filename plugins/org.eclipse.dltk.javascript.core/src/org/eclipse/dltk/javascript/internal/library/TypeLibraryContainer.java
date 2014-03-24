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

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.IBuildpathContainer;
import org.eclipse.dltk.core.IBuildpathContainerExtension2;
import org.eclipse.dltk.core.IBuildpathEntry;
import org.eclipse.dltk.core.IModelStatus;
import org.eclipse.dltk.internal.core.BuildpathEntry;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.javascript.typeinfo.TypeLibrary;
import org.eclipse.dltk.javascript.typeinfo.TypeLibraryManager;
import org.eclipse.osgi.util.NLS;
import org.osgi.framework.Version;

public class TypeLibraryContainer implements IBuildpathContainer,
		IBuildpathContainerExtension2 {

	public static final String ID = "org.eclipse.dltk.javascript.TypeLibrary";

	public static final IPath ENTRY_PREFIX = new Path(
			IBuildpathEntry.BUILDPATH_SPECIAL + ID);

	private final IPath containerPath;
	private IBuildpathEntry[] entries;

	/**
	 * @param project
	 * @param containerPath
	 */
	public TypeLibraryContainer(IPath containerPath) {
		assert containerPath.segmentCount() >= 2;
		this.containerPath = containerPath;
	}

	public synchronized IBuildpathEntry[] getBuildpathEntries() {
		if (entries == null) {
			entries = resolveEntries();
		}
		return entries;
	}

	private IBuildpathEntry[] resolveEntries() {
		Version version = null;
		if (containerPath.segmentCount() > 2) {
			try {
				version = Version.parseVersion(containerPath.segment(2));
			} catch (IllegalArgumentException e) {
				// ignore
			}
		}
		final TypeLibrary library = TypeLibraryManager.getManager().find(
				containerPath.segment(1), version);
		if (library != null) {
			return new IBuildpathEntry[] { DLTKCore.newBuiltinEntry(
					ENTRY_PREFIX.append(library.name()).append(
							library.version().toString()),
					IBuildpathEntry.NO_ACCESS_RULES,
					IBuildpathEntry.NO_EXTRA_ATTRIBUTES,
					BuildpathEntry.INCLUDE_ALL, BuildpathEntry.EXCLUDE_NONE,
					false, true) };
		} else {
			return new IBuildpathEntry[0];
		}
	}

	public String getDescription() {
		return containerPath.segmentCount() > 2 ? containerPath.segment(1)
				+ " " + containerPath.segment(2) : containerPath.segment(1);
	}

	public int getKind() {
		return K_SYSTEM;
	}

	public IPath getPath() {
		return containerPath;
	}

	static class ContainerStatus extends Status implements IModelStatus {

		private final IPath path;

		public ContainerStatus(int severity, String message, IPath path) {
			super(severity, JavaScriptPlugin.PLUGIN_ID, message);
			this.path = path;
		}

		@Override
		public boolean isDoesNotExist() {
			return false;
		}

		@Override
		public IPath getPath() {
			return path;
		}
	}

	@Override
	public IModelStatus validate() {
		Version version = null;
		IllegalArgumentException versionException = null;
		if (containerPath.segmentCount() > 2) {
			try {
				version = Version.parseVersion(containerPath.segment(2));
			} catch (IllegalArgumentException e) {
				versionException = e;
			}
		}
		final TypeLibrary library = TypeLibraryManager.getManager().find(
				containerPath.segment(1), version);
		if (library == null) {
			return new ContainerStatus(IStatus.ERROR, NLS.bind(
					"Type Library {0} not found", containerPath.segment(1)),
					containerPath);
		}
		if (versionException != null) {
			return new ContainerStatus(IStatus.ERROR, NLS.bind(
					"Error parsing {0} type library version {1}",
					containerPath.segment(1), containerPath.segment(2)),
					containerPath);
		}
		return null;
	}
}
