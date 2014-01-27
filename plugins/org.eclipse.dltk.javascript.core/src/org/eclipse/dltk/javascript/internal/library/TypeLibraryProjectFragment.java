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

import java.io.File;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.core.IBuildpathEntry;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IModelStatusConstants;
import org.eclipse.dltk.core.IProjectFragment;
import org.eclipse.dltk.core.IScriptFolder;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.WorkingCopyOwner;
import org.eclipse.dltk.core.environment.EnvironmentPathUtils;
import org.eclipse.dltk.core.environment.IFileHandle;
import org.eclipse.dltk.internal.core.CopyProjectFragmentOperation;
import org.eclipse.dltk.internal.core.MementoModelElementUtil;
import org.eclipse.dltk.internal.core.ModelElement;
import org.eclipse.dltk.internal.core.ModelElementInfo;
import org.eclipse.dltk.internal.core.ModelStatus;
import org.eclipse.dltk.internal.core.Openable;
import org.eclipse.dltk.internal.core.OpenableElementInfo;
import org.eclipse.dltk.internal.core.ScriptProject;
import org.eclipse.dltk.internal.core.util.MementoTokenizer;

@SuppressWarnings("restriction")
public class TypeLibraryProjectFragment extends Openable implements
		IProjectFragment {

	private final IPath libaryPath;

	public TypeLibraryProjectFragment(ScriptProject parent, IPath path)
			throws IllegalArgumentException {
		super(parent);
		this.libaryPath = path;
	}

	public int getElementType() {
		return PROJECT_FRAGMENT;
	}

	public IResource getResource() {
		return null;
	}

	@Override
	public IResource getUnderlyingResource() throws ModelException {
		return null;
	}

	public IPath getPath() {
		return libaryPath;
	}

	public int getKind() throws ModelException {
		return K_BINARY;
	}

	public IScriptFolder getScriptFolder(IPath path) {
		return new TypeLibraryFolder(this, path);
	}

	public IScriptFolder getScriptFolder(String path) {
		return getScriptFolder(new Path(path).makeRelative()
				.removeTrailingSeparator());
	}

	public Object[] getForeignResources() throws ModelException {
		return ModelElementInfo.NO_NON_SCRIPT_RESOURCES;
	}

	public IBuildpathEntry getRawBuildpathEntry() throws ModelException {
		IBuildpathEntry rawEntry = null;
		ScriptProject project = (ScriptProject) this.getScriptProject();
		// force the reverse rawEntry cache to be populated
		project.getResolvedBuildpath();
		Map<IPath, IBuildpathEntry> rootPathToRawEntries = project
				.getPerProjectInfo().rootPathToRawEntries;
		if (rootPathToRawEntries != null) {
			rawEntry = rootPathToRawEntries.get(this.getPath());
		}
		if (rawEntry == null) {
			throw new ModelException(new ModelStatus(
					IModelStatusConstants.ELEMENT_NOT_ON_BUILDPATH, this));
		}
		return rawEntry;
	}

	public boolean isArchive() {
		return true;
	}

	public boolean isExternal() {
		return true;
	}

	public boolean isBuiltin() {
		return false;
	}

	public IScriptFolder createScriptFolder(String name, boolean force,
			IProgressMonitor monitor) throws ModelException {
		throw new ModelException(new ModelStatus(ModelStatus.READ_ONLY,
				"createScriptFolder"));
	}

	public void delete(int updateResourceFlags, int updateModelFlags,
			IProgressMonitor monitor) throws ModelException {
		throw new ModelException(new ModelStatus(ModelStatus.READ_ONLY,
				"delete"));
	}

	public void copy(IPath destination, int updateResourceFlags,
			int updateModelFlags, IBuildpathEntry sibling,
			IProgressMonitor monitor) throws ModelException {
		CopyProjectFragmentOperation op = new CopyProjectFragmentOperation(
				this, destination, updateResourceFlags, updateModelFlags,
				sibling);
		op.runOperation(monitor);
	}

	public void move(IPath destination, int updateResourceFlags,
			int updateModelFlags, IBuildpathEntry sibling,
			IProgressMonitor monitor) throws ModelException {
		throw new ModelException(new ModelStatus(ModelStatus.READ_ONLY, "move"));
	}

	public boolean isBinary() {
		return true;
	}

	@Override
	protected boolean buildStructure(OpenableElementInfo info,
			IProgressMonitor pm, @SuppressWarnings("rawtypes") Map newElements,
			IResource underlyingResource) throws ModelException {
		// check whether this project fragment can be opened
		IStatus status = this.validateOnBuildpath();
		if (!status.isOK()) {
			throw this.newModelException(status);
		}
		if (!this.resourceExists()) {
			throw this.newNotPresentException();
		}
		return true;
	}

	protected File getLibraryFile() {
		return EnvironmentPathUtils.getLocalPath(libaryPath).toFile();
	}

	@Override
	protected Object createElementInfo() {
		return new OpenableElementInfo();
	}

	@Override
	public IModelElement getHandleFromMemento(String token,
			MementoTokenizer memento, WorkingCopyOwner owner) {
		switch (token.charAt(0)) {
		case JEM_SCRIPTFOLDER:
			if (!memento.hasMoreTokens())
				return this;
			String classFileName = memento.nextToken();
			ModelElement classFile = (ModelElement) getScriptFolder(classFileName);
			return classFile.getHandleFromMemento(memento, owner);
		case JEM_USER_ELEMENT:
			return MementoModelElementUtil.getHandleFromMemento(memento, this,
					owner);
		}
		return null;
	}

	@Override
	protected char getHandleMementoDelimiter() {
		return JEM_USER_ELEMENT;
	}

	@Override
	public String getElementName() {
		return libaryPath.lastSegment();
	}

	@Override
	public int hashCode() {
		return this.libaryPath.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o instanceof TypeLibraryProjectFragment) {
			final TypeLibraryProjectFragment other = (TypeLibraryProjectFragment) o;
			return this.libaryPath.equals(other.libaryPath);
		} else {
			return false;
		}
	}

	/**
	 * Returns whether the corresponding resource or associated file exists
	 */
	@Override
	protected boolean resourceExists() {
		final IFileHandle file = EnvironmentPathUtils.getFile(libaryPath);
		return file != null && file.isFile();
	}

	/*
	 * Validate whether this project fragment is on the buildpath of its
	 * project.
	 */
	protected IStatus validateOnBuildpath() {
		IPath path = this.getPath();
		try {
			// check project fragment on buildpath of its project
			final ScriptProject project = (ScriptProject) this
					.getScriptProject();
			final IBuildpathEntry[] buildpath = project.getResolvedBuildpath();
			for (int i = 0, length = buildpath.length; i < length; i++) {
				IBuildpathEntry entry = buildpath[i];
				if (entry.getPath().equals(path)) {
					return Status.OK_STATUS;
				}
			}
		} catch (ModelException e) {
			// could not read buildpath, then assume it is outside
			return e.getModelStatus();
		}
		return new ModelStatus(IModelStatusConstants.ELEMENT_NOT_ON_BUILDPATH,
				this);
	}
}
