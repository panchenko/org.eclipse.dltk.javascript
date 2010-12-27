/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.refactoring.code;

import org.eclipse.dltk.internal.javascript.corext.refactoring.code.InlineMethodRefactoring;
import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.javascript.internal.ui.refactoring.RefactoringMessages;
import org.eclipse.ltk.ui.refactoring.RefactoringWizard;

public class InlineMethodWizard extends RefactoringWizard {

	/* package */static final String DIALOG_SETTING_SECTION = "InlineMethodWizard"; //$NON-NLS-1$

	public InlineMethodWizard(InlineMethodRefactoring ref) {
		super(ref, DIALOG_BASED_USER_INTERFACE);
		setDefaultPageTitle(RefactoringMessages.InlineMethodWizard_page_title);
		setDialogSettings(JavaScriptUI.getDefault().getDialogSettings());
	}

	protected void addUserInputPages() {
		addPage(new InlineMethodInputPage());
	}
}
