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
package org.eclipse.dltk.javascript.internal.ui.library;

import org.eclipse.dltk.core.IBuildpathEntry;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.internal.ui.wizards.IBuildpathContainerPage;
import org.eclipse.dltk.ui.wizards.IBuildpathContainerPageExtension;
import org.eclipse.dltk.ui.wizards.NewElementWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class TypeLibraryContainerPage extends NewElementWizardPage implements
		IBuildpathContainerPage, IBuildpathContainerPageExtension {

	private IBuildpathEntry entry;

	public TypeLibraryContainerPage() {
		super("TypeLibraryContainerPage");
		setTitle("Add Type Library");
		setDescription("Add type library to the project build path");
	}

	public void createControl(Composite parent) {
		Label label = new Label(parent, SWT.SEPARATOR);

		setControl(label);
	}

	public boolean finish() {
		return true;
	}

	public IBuildpathEntry getSelection() {
		return entry;
	}

	public void setSelection(IBuildpathEntry containerEntry) {
		this.entry = containerEntry;
	}

	public void initialize(IScriptProject project,
			IBuildpathEntry[] currentEntries) {
		// TODO Auto-generated method stub
	}
}
