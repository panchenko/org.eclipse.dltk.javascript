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

import static org.eclipse.dltk.core.DLTKCore.newLibraryEntry;
import static org.eclipse.dltk.core.environment.EnvironmentManager.getLocalEnvironment;
import static org.eclipse.dltk.core.environment.EnvironmentPathUtils.getFullPath;

import org.eclipse.core.runtime.IPath;
import org.eclipse.dltk.core.IBuildpathContainer;
import org.eclipse.dltk.core.IBuildpathEntry;
import org.eclipse.dltk.javascript.typeinfo.TypeLibrary;
import org.eclipse.dltk.javascript.typeinfo.TypeLibraryManager;
import org.osgi.framework.Version;

public class TypeLibraryContainer implements IBuildpathContainer {

	public static final String ID = "org.eclipse.dltk.javascript.TypeLibrary";

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
			return new IBuildpathEntry[] { newLibraryEntry(
					getFullPath(getLocalEnvironment(), library.getPath()),
					IBuildpathEntry.NO_ACCESS_RULES,
					IBuildpathEntry.NO_EXTRA_ATTRIBUTES, false, true) };
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
}
