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

import org.eclipse.dltk.core.IBuildpathEntry;
import org.eclipse.dltk.core.IProjectFragment;
import org.eclipse.dltk.core.IProjectFragmentFactory;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.internal.core.ScriptProject;
import org.eclipse.dltk.javascript.typeinfo.TypeLibraryFormat;

@SuppressWarnings("restriction")
public class TypeLibraryProjectFragmentFactory implements
		IProjectFragmentFactory {

	public IProjectFragment create(IScriptProject project,
			IBuildpathEntry resolvedEntry) {
		if (TypeLibraryFormat.FILE_EXTENSION.equals(resolvedEntry.getPath()
				.getFileExtension())) {
			return new TypeLibraryProjectFragment((ScriptProject) project,
					resolvedEntry.getPath());
		}
		return null;
	}
}
