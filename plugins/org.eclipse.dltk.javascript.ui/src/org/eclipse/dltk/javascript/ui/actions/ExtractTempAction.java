/*******************************************************************************
 * Copyright (c) 2000, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.dltk.javascript.ui.actions;

import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.ExtractTempRefactoring;
import org.eclipse.dltk.internal.ui.actions.ActionUtil;
import org.eclipse.dltk.internal.ui.actions.SelectionConverter;
import org.eclipse.dltk.internal.ui.editor.ScriptEditor;
import org.eclipse.dltk.internal.ui.refactoring.RefactoringMessages;
import org.eclipse.dltk.internal.ui.refactoring.actions.RefactoringStarter;
import org.eclipse.dltk.javascript.internal.ui.refactoring.ExtractTempWizard;
import org.eclipse.dltk.ui.util.ExceptionHandler;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

/**
 * Extracts an expression into a new local variable and replaces all occurrences
 * of the expression with the local variable.
 * 
 * <p>
 * This class may be instantiated; it is not intended to be subclassed.
 * </p>
 * 
 * @since 2.0
 * 
 * @noextend This class is not intended to be subclassed by clients.
 */
public class ExtractTempAction implements IEditorActionDelegate {
	private ScriptEditor editor;
	private ITextSelection selection;

	public void run(IAction action) {
		try {
			if (!ActionUtil.isEditable(editor))
				return;
			ExtractTempRefactoring refactoring = new ExtractTempRefactoring(
					SelectionConverter.getInputAsSourceModule(editor),
					selection.getOffset(), selection.getLength());
			new RefactoringStarter().activate(refactoring,
					new ExtractTempWizard(refactoring), editor.getEditorSite()
							.getShell(),
					RefactoringMessages.ExtractTempAction_extract_temp, false);
		} catch (ModelException e) {
			ExceptionHandler
					.handle(e,
							RefactoringMessages.OpenRefactoringWizardAction_refactoring,
							RefactoringMessages.OpenRefactoringWizardAction_exception);
		}
	}

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
		action.setEnabled(selection != null
				&& SelectionConverter.getInputAsSourceModule(editor) != null);
	}
}
