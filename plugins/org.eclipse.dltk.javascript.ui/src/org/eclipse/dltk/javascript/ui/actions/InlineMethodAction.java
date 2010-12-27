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

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.ScriptModelUtil;
import org.eclipse.dltk.core.SourceRange;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.InlineMethodRefactoring;
import org.eclipse.dltk.internal.ui.actions.SelectionConverter;
import org.eclipse.dltk.internal.ui.editor.ScriptEditor;
import org.eclipse.dltk.internal.ui.refactoring.RefactoringMessages;
import org.eclipse.dltk.internal.ui.refactoring.actions.RefactoringStarter;
import org.eclipse.dltk.javascript.internal.ui.refactoring.code.InlineMethodWizard;
import org.eclipse.dltk.ui.DLTKUIPlugin;
import org.eclipse.dltk.ui.util.ExceptionHandler;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

/**
 * Inlines a method.
 * 
 * <p>
 * This class may be instantiated; it is not intended to be subclassed.
 * </p>
 */
public class InlineMethodAction implements IEditorActionDelegate {
	private ScriptEditor editor;
	private ISelection selection;

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
		checkEnabled(action);
	}

	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		if (targetEditor instanceof ScriptEditor)
			editor = (ScriptEditor) targetEditor;
		else
			editor = null;
		checkEnabled(action);
	}

	public void checkEnabled(IAction action) {
		try {
			action.setEnabled(isInlineMethodAvailable());
		} catch (ModelException e) {
			if (ScriptModelUtil.isExceptionToBeLogged(e))
				DLTKUIPlugin.log(e);
			action.setEnabled(false);
		}
	}

	private boolean isInlineMethodAvailable() throws ModelException {
		if (selection instanceof ITextSelection)
			return true;
		if (!(selection instanceof IStructuredSelection))
			return false;
		IStructuredSelection structured = (IStructuredSelection) selection;
		if (structured.size() != 1)
			return false;
		Object elem = structured.getFirstElement();
		if (!(elem instanceof IMethod))
			return false;
		IMethod method = (IMethod) elem;
		return method.exists() && method.isStructureKnown()
				&& !method.isConstructor()
				&& SourceRange.isAvailable(method.getNameRange());
	}

	public void run(IAction action) {
		if (selection instanceof IStructuredSelection)
			try {
				Assert.isTrue(isInlineMethodAvailable());
				IMethod method = (IMethod) ((IStructuredSelection) selection)
						.getFirstElement();
				ISourceRange nameRange = method.getNameRange();
				run(nameRange.getOffset(), nameRange.getLength(),
						method.getSourceModule());
			} catch (ModelException e) {
				ExceptionHandler
						.handle(e,
								editor.getSite().getShell(),
								RefactoringMessages.InlineMethodAction_dialog_title,
								RefactoringMessages.InlineMethodAction_unexpected_exception);
			}
		if (selection instanceof ITextSelection) {
			ITextSelection text = (ITextSelection) selection;
			ISourceModule typeRoot = (ISourceModule) SelectionConverter
					.getInput(editor);
			if (typeRoot == null)
				return;
			run(text.getOffset(), text.getLength(), typeRoot);
		}
	}

	private void run(int offset, int length, ISourceModule typeRoot) {
		InlineMethodRefactoring refactoring = new InlineMethodRefactoring(
				typeRoot, offset, length);
		try {
			new RefactoringStarter().activate(refactoring,
					new InlineMethodWizard(refactoring), editor.getSite()
							.getShell(),
					RefactoringMessages.InlineMethodAction_dialog_title, false);
		} catch (ModelException e) {
			ExceptionHandler
					.handle(e,
							RefactoringMessages.OpenRefactoringWizardAction_refactoring,
							RefactoringMessages.OpenRefactoringWizardAction_exception);
		}
	}
}
