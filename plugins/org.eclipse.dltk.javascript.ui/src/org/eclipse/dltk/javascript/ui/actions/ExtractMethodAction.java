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
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.ExtractMethodRefactoring;
import org.eclipse.dltk.internal.ui.actions.ActionUtil;
import org.eclipse.dltk.internal.ui.actions.SelectionConverter;
import org.eclipse.dltk.internal.ui.editor.ScriptEditor;
import org.eclipse.dltk.internal.ui.refactoring.RefactoringMessages;
import org.eclipse.dltk.internal.ui.refactoring.actions.RefactoringStarter;
import org.eclipse.dltk.javascript.internal.ui.refactoring.code.ExtractMethodWizard;
import org.eclipse.dltk.ui.util.ExceptionHandler;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

/**
 * Extracts the code selected inside a compilation unit editor into a new
 * method. Necessary arguments, exceptions and returns values are computed and
 * an appropriate method signature is generated.
 * 
 * <p>
 * This class may be instantiated; it is not intended to be subclassed.
 * </p>
 * 
 * @since 2.0
 * 
 * @noextend This class is not intended to be subclassed by clients.
 */
public class ExtractMethodAction implements IEditorActionDelegate {

	private ScriptEditor editor;
	private ITextSelection selection;

	/**
	 * Note: This constructor is for internal use only. Clients should not call
	 * this constructor.
	 * 
	 * @param editor
	 *            the script editor
	 * 
	 * @noreference This method is not intended to be referenced by clients.
	 * 
	 *              public ExtractMethodAction(ScriptEditor editor) {
	 *              setText(RefactoringMessages.ExtractMethodAction_label);
	 *              setEnabled
	 *              (SelectionConverter.getInputAsCompilationUnit(fEditor) !=
	 *              null); PlatformUI.getWorkbench().getHelpSystem()
	 *              .setHelp(this, IJavaHelpContextIds.EXTRACT_METHOD_ACTION); }
	 */

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
					&& selection.getLength() > 0
					&& editor != null
					&& SelectionConverter.getInputAsSourceModule(editor) != null);
		} catch (StringIndexOutOfBoundsException e) {
			// How (-1,-1) selection is better than null really?
		}
	}

	public void run(IAction action) {
		if (!ActionUtil.isEditable(editor))
			return;
		ExtractMethodRefactoring refactoring = new ExtractMethodRefactoring(
				SelectionConverter.getInputAsSourceModule(editor),
				selection.getOffset(), selection.getLength());
		try {
			new RefactoringStarter()
					.activate(
							refactoring,
							new ExtractMethodWizard(refactoring),
							editor.getEditorSite().getShell(),
							RefactoringMessages.ExtractMethodAction_dialog_title,
							false);
		} catch (ModelException e) {
			ExceptionHandler
					.handle(e,
							RefactoringMessages.OpenRefactoringWizardAction_refactoring,
							RefactoringMessages.OpenRefactoringWizardAction_exception);
		}
	}

}
