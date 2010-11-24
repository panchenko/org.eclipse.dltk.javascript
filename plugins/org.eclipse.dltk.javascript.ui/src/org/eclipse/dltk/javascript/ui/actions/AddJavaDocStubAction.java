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

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.IType;
import org.eclipse.dltk.core.ScriptModelUtil;
import org.eclipse.dltk.internal.ui.actions.ActionUtil;
import org.eclipse.dltk.internal.ui.actions.SelectionConverter;
import org.eclipse.dltk.internal.ui.actions.WorkbenchRunnableAdapter;
import org.eclipse.dltk.internal.ui.editor.EditorUtility;
import org.eclipse.dltk.internal.ui.editor.ScriptEditor;
import org.eclipse.dltk.javascript.internal.corext.codemanipulation.AddJavaDocStubOperation;
import org.eclipse.dltk.ui.DLTKUIPlugin;
import org.eclipse.dltk.ui.actions.SelectionDispatchAction;
import org.eclipse.dltk.ui.util.ElementValidator;
import org.eclipse.dltk.ui.util.ExceptionHandler;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchSite;
import org.eclipse.ui.PlatformUI;

/**
 * Create Javadoc comment stubs for the selected members.
 * <p>
 * Will open the parent compilation unit in a Java editor. The result is
 * unsaved, so the user can decide if the changes are acceptable.
 * <p>
 * The action is applicable to structured selections containing elements of type
 * <code>IMember</code>.
 * 
 * <p>
 * This class may be instantiated; it is not intended to be subclassed.
 * </p>
 * 
 * @noextend This class is not intended to be subclassed by clients.
 */
public class AddJavaDocStubAction extends SelectionDispatchAction {

	private ScriptEditor fEditor;

	/**
	 * Creates a new <code>AddJavaDocStubAction</code>. The action requires that
	 * the selection provided by the site's selection provider is of type <code>
	 * org.eclipse.jface.viewers.IStructuredSelection</code>.
	 * 
	 * @param site
	 *            the site providing context information for this action
	 */
	public AddJavaDocStubAction(IWorkbenchSite site) {
		super(site);
		setText("Generate Element Commen&t");
		setDescription("Add a comment stub to the member element");
		setToolTipText("Add a Comment Stub to the Member Element");
		// PlatformUI.getWorkbench().getHelpSystem()
		// .setHelp(this, IJavaHelpContextIds.ADD_JAVADOC_STUB_ACTION);
	}

	/**
	 * Note: This constructor is for internal use only. Clients should not call
	 * this constructor.
	 * 
	 * @param editor
	 *            the compilation unit editor
	 * 
	 * @noreference This constructor is not intended to be referenced by
	 *              clients.
	 */
	public AddJavaDocStubAction(ScriptEditor editor) {
		this(editor.getEditorSite());
		fEditor = editor;
		setEnabled(checkEnabledEditor());
	}

	// ---- Structured Viewer
	// -----------------------------------------------------------

	/*
	 * (non-Javadoc) Method declared on SelectionDispatchAction
	 */
	public void selectionChanged(IStructuredSelection selection) {
		IMember[] members = getSelectedMembers(selection);
		setEnabled(members != null && members.length > 0);
	}

	/*
	 * (non-Javadoc) Method declared on SelectionDispatchAction
	 */
	public void run(IStructuredSelection selection) {
		IMember[] members = getSelectedMembers(selection);
		if (members == null || members.length == 0) {
			return;
		}

		try {
			ISourceModule cu = members[0].getSourceModule();
			if (!ActionUtil.isEditable(getShell(), cu)) {
				return;
			}

			// open the editor, forces the creation of a working copy
			IEditorPart editor = DLTKUIPlugin.openInEditor(cu);

			if (ElementValidator.check(members, getShell(), getDialogTitle(),
					false))
				run(members);
			ScriptModelUtil.reconcile(cu);
			EditorUtility.revealInEditor(editor, members[0]);

		} catch (CoreException e) {
			ExceptionHandler.handle(e, getShell(), getDialogTitle(),
					"Error while adding comment");
		}
	}

	// ---- Java Editor
	// --------------------------------------------------------------

	/*
	 * (non-Javadoc) Method declared on SelectionDispatchAction
	 */
	public void selectionChanged(ITextSelection selection) {
	}

	private boolean checkEnabledEditor() {
		return fEditor != null && SelectionConverter.canOperateOn(fEditor);
	}

	/*
	 * (non-Javadoc) Method declared on SelectionDispatchAction
	 */
	public void run(ITextSelection selection) {
		try {
			IModelElement element = SelectionConverter
					.getElementAtOffset(fEditor);
			if (!ActionUtil.isEditable(fEditor, getShell(), element))
				return;
			while ((element instanceof IType || element instanceof IMethod)
					&& element.getElementName().length() == 0) {
				// anonymous type/function
				element = element.getParent();
			}
			int type = element != null ? element.getElementType() : -1;
			if (type != IModelElement.METHOD && type != IModelElement.TYPE
					&& type != IModelElement.FIELD) {
				element = SelectionConverter.getTypeAtOffset(fEditor);
				if (element == null) {
					MessageDialog
							.openInformation(
									getShell(),
									getDialogTitle(),
									"The operation is not applicable to the current selection. Select a type or method.");
					return;
				}
			}
			IMember[] members = new IMember[] { (IMember) element };
			if (ElementValidator.checkValidateEdit(members, getShell(),
					getDialogTitle()))
				run(members);
		} catch (CoreException e) {
			ExceptionHandler.handle(e, getShell(), getDialogTitle(),
					"Error while adding comment");
		}
	}

	// ---- Helpers
	// -------------------------------------------------------------------

	/**
	 * Note this method is for internal use only.
	 * 
	 * @param members
	 *            an array of members
	 */
	private void run(IMember[] members) {
		AddJavaDocStubOperation op = new AddJavaDocStubOperation(members);
		if (members.length < 11) {
			try {
				op.run(null);
			} catch (CoreException e) {
				ExceptionHandler.handle(e, getShell(), getDialogTitle(),
						"Error while adding comment");
			} catch (OperationCanceledException e) {
				// operation canceled
			}
			return;
		}

		try {
			PlatformUI
					.getWorkbench()
					.getProgressService()
					.runInUI(
							PlatformUI.getWorkbench().getProgressService(),
							new WorkbenchRunnableAdapter(op, op
									.getScheduleRule()), op.getScheduleRule());
		} catch (InvocationTargetException e) {
			ExceptionHandler.handle(e, getShell(), getDialogTitle(),
					"Error while adding comment");
		} catch (InterruptedException e) {
			// operation canceled
		}
	}

	private IMember[] getSelectedMembers(IStructuredSelection selection) {
		List elements = selection.toList();
		int nElements = elements.size();
		if (nElements > 0) {
			IMember[] res = new IMember[nElements];
			ISourceModule cu = null;
			for (int i = 0; i < nElements; i++) {
				Object curr = elements.get(i);
				if (curr instanceof IMethod || curr instanceof IType
						|| curr instanceof IField) {
					IMember member = (IMember) curr; // limit to methods, types
														// & fields
					if (!member.exists()) {
						return null;
					}
					if (i == 0) {
						cu = member.getSourceModule();
						if (cu == null) {
							return null;
						}
					} else if (!cu.equals(member.getSourceModule())) {
						return null;
					}
					if ((member instanceof IType || member instanceof IMethod)
							&& member.getElementName().length() == 0) {
						return null; // anonymous type/function
					}
					res[i] = member;
				} else {
					return null;
				}
			}
			return res;
		}
		return null;
	}

	private String getDialogTitle() {
		return "Generate Element Comment";
	}
}
