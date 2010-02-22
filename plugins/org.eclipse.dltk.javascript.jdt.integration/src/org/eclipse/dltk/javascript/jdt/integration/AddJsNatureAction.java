/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.jdt.integration;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.core.IScriptProjectFilenames;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.utils.AdaptUtils;
import org.eclipse.dltk.utils.ResourceUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class AddJsNatureAction implements IObjectActionDelegate {

	private ISelection selection;

	public AddJsNatureAction() {
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Object[] array = ssel.toArray();
			for (int a = 0; a < array.length; a++) {
				final IProject project = AdaptUtils.getAdapter(array[a],
						IProject.class);
				if (project == null) {
					continue;
				}
				try {
					ResourceUtil.addNature(project, null,
							JavaScriptNature.NATURE_ID);
					IFile buildpathFile = project
							.getFile(IScriptProjectFilenames.BUILDPATH_FILENAME);
					if (!buildpathFile.exists()) {
						buildpathFile.create(this.getClass()
								.getResourceAsStream("buildpath.snap"), true,
								null);
					}
				} catch (CoreException e) {
					Activator.error(e);
				}
			}
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
