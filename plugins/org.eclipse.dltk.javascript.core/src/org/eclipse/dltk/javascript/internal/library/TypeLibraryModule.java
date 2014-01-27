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

import java.io.InputStream;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.internal.core.AbstractExternalSourceModule;
import org.eclipse.dltk.internal.core.DefaultWorkingCopyOwner;
import org.eclipse.dltk.javascript.core.JavaScriptNature;

@SuppressWarnings("restriction")
public class TypeLibraryModule extends AbstractExternalSourceModule {

	protected TypeLibraryModule(TypeLibraryFolder parent, String name) {
		super(parent, name, DefaultWorkingCopyOwner.PRIMARY);
	}

	@Override
	public IResource getUnderlyingResource() throws ModelException {
		return null;
	}

	public InputStream getContents() throws CoreException {
		throw newNotPresentException();
	}

	public IPath getFullPath() {
		// return archive-related path
		final TypeLibraryFolder folder = (TypeLibraryFolder) getParent();
		return folder.path.append(getElementName());
	}

	public String getName() {
		return getElementName();
	}

	public String getFileName() {
		return getElementName();
	}

	protected char[] getBufferContent() throws ModelException {
		throw newNotPresentException();
	}

	@Override
	protected String getNatureId() {
		return JavaScriptNature.NATURE_ID;
	}

	@Override
	protected ISourceModule getOriginalSourceModule() {
		return this;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof TypeLibraryModule)) {
			return false;
		}
		return super.equals(obj);
	}

	@Override
	public boolean exists() {
		return false;
	}
}
