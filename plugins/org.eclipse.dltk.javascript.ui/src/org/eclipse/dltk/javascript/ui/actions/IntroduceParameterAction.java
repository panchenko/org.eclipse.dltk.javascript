/*******************************************************************************
 * Copyright (c) 2000, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.dltk.javascript.ui.actions;

import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.IntroduceParameterRefactoring;
import org.eclipse.dltk.internal.ui.actions.ActionUtil;
import org.eclipse.dltk.internal.ui.actions.SelectionConverter;
import org.eclipse.dltk.internal.ui.editor.ScriptEditor;
import org.eclipse.dltk.internal.ui.refactoring.RefactoringMessages;
import org.eclipse.dltk.internal.ui.refactoring.actions.RefactoringStarter;
import org.eclipse.dltk.javascript.internal.ui.refactoring.IntroduceParameterWizard;
import org.eclipse.dltk.ui.util.ExceptionHandler;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

/**
 * Introduces a new method parameter from a selected expression.
 * 
 * <p>
 * This class may be instantiated; it is not intended to be subclassed.
 * </p>
 * 
 * @since 3.0
 * @noextend This class is not intended to be subclassed by clients.
 */
public class IntroduceParameterAction implements IEditorActionDelegate {

	private ScriptEditor editor;
	private ITextSelection selection;

	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof ITextSelection)
			this.selection = (ITextSelection) selection;
		else
			this.selection = null;
		checkEnabled(action);
	}

	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		if (targetEditor instanceof ScriptEditor)
			editor = (ScriptEditor) targetEditor;
		else
			editor = null;
		checkEnabled(action);
	}

	private void checkEnabled(IAction action) {
		try {
			action.setEnabled(selection != null
					&& SelectionConverter.getInputAsSourceModule(editor) != null);
		} catch (StringIndexOutOfBoundsException e) {
			// (0,0) doesn't work cool
		}
	}

	public void run(IAction action) {
		if (!ActionUtil.isEditable(editor))
			return;
		ISourceModule unit = SelectionConverter.getInputAsSourceModule(editor);
		final IntroduceParameterRefactoring refactoring = new IntroduceParameterRefactoring(
				unit, selection.getOffset(), selection.getLength());
		try {
			new RefactoringStarter().activate(refactoring,
					new IntroduceParameterWizard(refactoring), editor
							.getEditorSite().getShell(),
					RefactoringMessages.IntroduceParameterAction_dialog_title,
					true);
		} catch (ModelException e) {
			ExceptionHandler
					.handle(e,
							RefactoringMessages.OpenRefactoringWizardAction_refactoring,
							RefactoringMessages.OpenRefactoringWizardAction_exception);
		}
	}
}