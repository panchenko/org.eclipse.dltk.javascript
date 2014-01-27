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

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.javascript.typeinfo.TypeLibrary;
import org.eclipse.dltk.javascript.typeinfo.TypeLibraryFormat;
import org.eclipse.dltk.javascript.typeinfo.TypeLibraryManager;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.viewers.DecoratingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class TypeLibraryPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage, ISelectionChangedListener {

	public static final String PAGE_ID = "org.eclipse.dltk.javascript.TypeLibraryPreferencePage";

	private TreeViewer libraryTree;
	private Button addButton;
	private Button removeButton;

	public void init(IWorkbench workbench) {
	}

	public TypeLibraryPreferencePage() {
		noDefaultAndApplyButton();
	}

	/**
	 * Initially retrieved in {@link #createContents(Composite)} from
	 * {@link TypeLibraryManager}, possibly modified by the user, and later stored
	 * back in {@link #performOk()}.
	 */
	private final List<TypeLibrary> libraries = new ArrayList<TypeLibrary>();

	/**
	 * Creates the page's UI content.
	 */
	protected Control createContents(Composite parent) {
		libraries.clear();
		Collections.addAll(libraries, TypeLibraryManager.getManager().list());

		final Composite page = new Composite(parent, SWT.NULL);
		page.setLayout(GridLayoutFactory.swtDefaults().numColumns(2).create());
		page.setLayoutData(GridDataFactory.fillDefaults().grab(true, true)
				.create());

		libraryTree = new TreeViewer(page);
		libraryTree.getTree().setLayoutData(
				GridDataFactory.fillDefaults().grab(true, true).create());
		libraryTree.setContentProvider(new LibraryContentProvider());
		libraryTree.setLabelProvider(new DecoratingStyledCellLabelProvider(
				new LibraryLabelProvider(), new LibraryDecorator(libraries),
				null));
		libraryTree.setComparator(new LibraryComparator());
		libraryTree.setInput(libraries);
		libraryTree.addSelectionChangedListener(this);

		final Composite buttons = new Composite(page, SWT.NULL);
		buttons.setLayout(GridLayoutFactory.fillDefaults().create());
		buttons.setLayoutData(GridDataFactory.fillDefaults().create());

		addButton = new Button(buttons, SWT.PUSH);
		addButton.setText("Add...");
		addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				promptForLibrary();
			}
		});
		setButtonLayoutData(addButton);

		removeButton = new Button(buttons, SWT.PUSH);
		removeButton.setText("Remove...");
		removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeLibraries();
			}
		});
		setButtonLayoutData(removeButton);

		applyDialogFont(page);
		selectionChanged(libraryTree.getSelection());
		return page;
	}

	@Override
	public boolean performOk() {
		try {
			TypeLibraryManager.getManager().saveToPreferences(libraries);
		} catch (Exception e) {
			ErrorDialog.openError(getShell(), "Error in Library", e
					.getMessage(), new Status(IStatus.ERROR,
					JavaScriptPlugin.PLUGIN_ID, e.getMessage(), e));
			return false;
		}
		return super.performOk();
	}

	protected void promptForLibrary() {
		final FileDialog dialog = new FileDialog(getShell(), SWT.OPEN
				| SWT.MULTI);
		dialog.setText("Select Type Libary");
		dialog.setFilterExtensions(new String[] { "*."
				+ TypeLibraryFormat.FILE_EXTENSION });
		if (dialog.open() != null) {
			TypeLibrary library = null;
			for (String filename : dialog.getFileNames()) {
				final File file = new File(dialog.getFilterPath(), filename)
						.getAbsoluteFile();
				if (isNew(file)) {
					try {
						library = TypeLibraryManager.getManager().openLibrary(file);
						libraries.add(library);
					} catch (Exception e) {
						ErrorDialog.openError(
								getShell(),
								"Error in Type Library",
								e.getMessage(),
								new Status(IStatus.ERROR,
										JavaScriptPlugin.PLUGIN_ID, e
												.getMessage(), e));
					}
				}
			}
			if (library != null) {
				libraryTree.refresh();
				libraryTree.setSelection(new StructuredSelection(library));
			}
		}
	}

	private boolean isNew(File file) {
		for (TypeLibrary library : libraries) {
			if (file.equals(library.getFile())) {
				return false;
			}
		}
		return true;
	}

	public void selectionChanged(SelectionChangedEvent event) {
		selectionChanged(event.getSelection());
	}

	private void selectionChanged(ISelection selection) {
		if (selection.isEmpty()) {
			removeButton.setEnabled(false);
		} else if (selection instanceof IStructuredSelection) {
			for (Iterator<?> i = ((IStructuredSelection) selection).iterator(); i
					.hasNext();) {
				final Object item = i.next();
				if (!canRemove(item)) {
					removeButton.setEnabled(false);
					return;
				}
			}
			removeButton.setEnabled(true);
		} else {
			removeButton.setEnabled(false);
		}
	}

	private boolean canRemove(Object item) {
		final List<TypeLibrary> libraries = toLibraries(item);
		if (libraries == null) {
			return false;
		}
		for (TypeLibrary library : libraries) {
			if (!canRemove(library)) {
				return false;
			}
		}
		return true;
	}

	private boolean canRemove(TypeLibrary library) {
		return library.kind() == TypeLibrary.Kind.USER;
	}

	private List<TypeLibrary> toLibraries(Object item) {
		if (item instanceof TypeLibrary) {
			return Collections.singletonList((TypeLibrary) item);
		} else if (item instanceof LibVersion) {
			return Collections.singletonList(((LibVersion) item).library);
		} else if (item instanceof LibName) {
			return ((LibName) item).filter(libraries);
		} else {
			return null;
		}
	}

	protected void removeLibraries() {
		final ISelection selection = libraryTree.getSelection();
		if (selection instanceof IStructuredSelection) {
			final Set<TypeLibrary> libraries = new HashSet<TypeLibrary>();
			for (Iterator<?> i = ((IStructuredSelection) selection).iterator(); i
					.hasNext();) {
				List<TypeLibrary> libs = toLibraries(i.next());
				if (libs == null) {
					return;
				}
				libraries.addAll(libs);
			}
			if (libraries.isEmpty()) {
				return;
			}
			for (TypeLibrary library : libraries) {
				if (!canRemove(library)) {
					return;
				}
			}
			if (MessageDialog.openConfirm(getShell(), "Remove Type Libraries",
					"Are you sure want to remove " + libraries.size()
							+ " libraries?")) {
				this.libraries.removeAll(libraries);
				libraryTree.refresh();
				selectionChanged(libraryTree.getSelection());
			}
		}
	}
}
