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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.dltk.core.BuildpathContainerInitializer;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.IBuildpathContainer;
import org.eclipse.dltk.core.IScriptProject;

public class TypeLibraryContainerInitializer extends
		BuildpathContainerInitializer {

	/*
	 * @see BuildpathContainerInitializer#initialize(IPath, IScriptProject)
	 */
	@Override
	public void initialize(IPath containerPath, IScriptProject project)
			throws CoreException {
		if (containerPath.segmentCount() >= 2) {
			final TypeLibraryContainer container = new TypeLibraryContainer(
					containerPath);
			DLTKCore.setBuildpathContainer(containerPath,
					new IScriptProject[] { project },
					new IBuildpathContainer[] { container }, null);
		}
	}
}
