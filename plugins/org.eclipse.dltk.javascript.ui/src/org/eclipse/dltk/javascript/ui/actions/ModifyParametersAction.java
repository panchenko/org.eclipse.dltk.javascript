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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.internal.javascript.corext.refactoring.structure.ChangeSignatureProcessor;
import org.eclipse.dltk.internal.ui.actions.ActionUtil;
import org.eclipse.dltk.internal.ui.actions.SelectionConverter;
import org.eclipse.dltk.internal.ui.editor.ScriptEditor;
import org.eclipse.dltk.internal.ui.refactoring.RefactoringMessages;
import org.eclipse.dltk.internal.ui.refactoring.actions.RefactoringStarter;
import org.eclipse.dltk.javascript.internal.ui.refactoring.ChangeSignatureWizard;
import org.eclipse.dltk.ui.DLTKUIPlugin;
import org.eclipse.dltk.ui.util.ExceptionHandler;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ltk.core.refactoring.Refactoring;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.ProcessorBasedRefactoring;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

/**
 * Action to start the modify parameters refactoring. The refactoring supports
 * swapping and renaming of arguments.
 * <p>
 * This action is applicable to selections containing a method with one or more
 * arguments.
 * 
 * <p>
 * This class may be instantiated; it is not intended to be subclassed.
 * </p>
 * 
 * @since 2.0
 * 
 * @noextend This class is not intended to be subclassed by clients.
 */
public class ModifyParametersAction implements IEditorActionDelegate {
	private ScriptEditor editor;
	private ISelection selection;

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
		IMethod method = null;
		if (selection instanceof IStructuredSelection)
			method = getSingleSelectedMethod((IStructuredSelection) selection);
		else if (selection instanceof ITextSelection) {
			try {
				method = getSingleSelectedMethod((ITextSelection) selection);
			} catch (ModelException e) {
				DLTKUIPlugin.log(e);
			} catch (StringIndexOutOfBoundsException e) {
				// we're initialized with (-1,-1) selection
			}
		}
		action.setEnabled(editor != null && selection != null && method != null);
	}

	public void run(IAction action) {
		try {
			if (!ActionUtil.isEditable(editor))
				return;
			IMethod method = null;
			if (selection instanceof IStructuredSelection)
				method = getSingleSelectedMethod((IStructuredSelection) selection);
			else if (selection instanceof ITextSelection)
				method = getSingleSelectedMethod((ITextSelection) selection);
			if (method != null)
				startChangeSignatureRefactoring(method);
			else {
				MessageDialog
						.openInformation(
								editor.getEditorSite().getShell(),
								RefactoringMessages.OpenRefactoringWizardAction_unavailable,
								RefactoringMessages.ModifyParametersAction_unavailable);
			}
		} catch (ModelException e) {
			ExceptionHandler
					.handle(e,
							RefactoringMessages.OpenRefactoringWizardAction_refactoring,
							RefactoringMessages.OpenRefactoringWizardAction_exception);
		}

	}

	private static IMethod getSingleSelectedMethod(
			IStructuredSelection selection) {
		if (selection.isEmpty() || selection.size() != 1)
			return null;
		if (selection.getFirstElement() instanceof IMethod)
			return (IMethod) selection.getFirstElement();
		return null;
	}

	private IMethod getSingleSelectedMethod(ITextSelection selection)
			throws ModelException {
		// - when caret/selection on method name (call or declaration) -> that
		// method
		// - otherwise: caret position's enclosing method declaration
		// - when caret inside argument list of method declaration -> enclosing
		// method declaration
		// - when caret inside argument list of method call -> enclosing method
		// declaration (and NOT method call)
		IModelElement[] elements = SelectionConverter.codeResolve(editor);
		if (elements.length > 1)
			return null;
		if (elements.length == 1 && elements[0] instanceof IMethod)
			return (IMethod) elements[0];
		IModelElement elementAt = SelectionConverter.getInputAsSourceModule(
				editor).getElementAt(selection.getOffset());
		if (elementAt instanceof IMethod)
			return (IMethod) elementAt;
		return null;
	}

	private void startChangeSignatureRefactoring(final IMethod method)
			throws ModelException {
		// if
		// (!RefactoringAvailabilityTester.isChangeSignatureAvailable(method))
		// return;
		try {
			ChangeSignatureProcessor processor = new ChangeSignatureProcessor(
					method);
			RefactoringStatus status = processor
					.checkInitialConditions(new NullProgressMonitor());
			Refactoring refactoring = new ProcessorBasedRefactoring(processor);
			ChangeSignatureWizard wizard = new ChangeSignatureWizard(processor,
					refactoring);
			new RefactoringStarter().activate(refactoring, wizard, editor
					.getEditorSite().getShell(), wizard.getDefaultPageTitle(),
					false);
		} catch (CoreException e) {
			ExceptionHandler
					.handle(e,
							RefactoringMessages.OpenRefactoringWizardAction_refactoring,
							RefactoringMessages.RefactoringStarter_unexpected_exception);
		}
	}
}
