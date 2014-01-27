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

import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IScriptFolder;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.WorkingCopyOwner;
import org.eclipse.dltk.internal.core.MementoModelElementUtil;
import org.eclipse.dltk.internal.core.ModelElement;
import org.eclipse.dltk.internal.core.ModelElementInfo;
import org.eclipse.dltk.internal.core.ModelStatus;
import org.eclipse.dltk.internal.core.Openable;
import org.eclipse.dltk.internal.core.OpenableElementInfo;
import org.eclipse.dltk.internal.core.ScriptFolder;
import org.eclipse.dltk.internal.core.util.MementoTokenizer;
import org.eclipse.dltk.internal.core.util.Messages;

@SuppressWarnings("restriction")
public class TypeLibraryFolder extends Openable implements IScriptFolder {

	protected final IPath path;
	private final String elementName;

	protected TypeLibraryFolder(TypeLibraryProjectFragment parent, IPath path) {
		super(parent);
		this.path = path;
		this.elementName = ScriptFolder.pathToString(path);
	}

	public int getElementType() {
		return SCRIPT_FOLDER;
	}

	public IResource getResource() {
		return null;
	}

	public IResource getUnderlyingResource() throws ModelException {
		return null;
	}

	public IPath getPath() {
		return getParent().getPath().append(path);
	}

	public void copy(IModelElement container, IModelElement sibling,
			String rename, boolean replace, IProgressMonitor monitor)
			throws ModelException {
		if (container == null) {
			throw new IllegalArgumentException(Messages.operation_nullContainer);
		}
		IModelElement[] elements = new IModelElement[] { this };
		IModelElement[] containers = new IModelElement[] { container };
		IModelElement[] siblings = null;
		if (sibling != null) {
			siblings = new IModelElement[] { sibling };
		}
		String[] renamings = null;
		if (rename != null) {
			renamings = new String[] { rename };
		}
		getModel().copy(elements, containers, siblings, renamings, replace,
				monitor);
	}

	public void delete(boolean force, IProgressMonitor monitor)
			throws ModelException {
		throw new ModelException(new ModelStatus(ModelStatus.READ_ONLY,
				"delete"));
	}

	public void move(IModelElement container, IModelElement sibling,
			String rename, boolean replace, IProgressMonitor monitor)
			throws ModelException {
		throw new ModelException(new ModelStatus(ModelStatus.READ_ONLY, "move"));
	}

	public void rename(String name, boolean replace, IProgressMonitor monitor)
			throws ModelException {
		throw new ModelException(new ModelStatus(ModelStatus.READ_ONLY,
				"rename"));
	}

	public ISourceModule getSourceModule(String name) {
		return new TypeLibraryModule(this, name);
	}

	public boolean isRootFolder() {
		return path.segmentCount() == 0;
	}

	public ISourceModule[] getSourceModules() throws ModelException {
		return new ISourceModule[0];
	}

	public Object[] getForeignResources() throws ModelException {
		return ModelElementInfo.NO_NON_SCRIPT_RESOURCES;
	}

	public boolean hasSubfolders() throws ModelException {
		throw newNotPresentException();
	}

	public boolean containsScriptResources() throws ModelException {
		throw newNotPresentException();
	}

	public ISourceModule createSourceModule(String name, String contents,
			boolean force, IProgressMonitor monitor) throws ModelException {
		throw new ModelException(new ModelStatus(ModelStatus.READ_ONLY,
				"createSourceModule"));
	}

	public boolean exists() {
		return false;
	}

	protected boolean buildStructure(OpenableElementInfo info,
			IProgressMonitor pm, @SuppressWarnings("rawtypes") Map newElements,
			IResource underlyingResource) throws ModelException {
		return false;
	}

	protected Object createElementInfo() {
		return new OpenableElementInfo();
	}

	public IModelElement getHandleFromMemento(String token,
			MementoTokenizer memento, WorkingCopyOwner owner) {
		switch (token.charAt(0)) {
		case JEM_SOURCEMODULE:
			if (!memento.hasMoreTokens())
				return this;
			String classFileName = memento.nextToken();
			ModelElement classFile = (ModelElement) getSourceModule(classFileName);
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
		return elementName;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof TypeLibraryFolder)) {
			return false;
		}
		return super.equals(obj);
	}

}
