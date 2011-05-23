/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.PreferencesLookupDelegate;
import org.eclipse.dltk.core.manipulation.SourceModuleChange;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.ui.editor.saveparticipant.IPostSaveListener;
import org.eclipse.dltk.ui.formatter.FormatterException;
import org.eclipse.dltk.ui.formatter.IScriptFormatter;
import org.eclipse.dltk.ui.formatter.IScriptFormatterFactory;
import org.eclipse.dltk.ui.formatter.ScriptFormatterManager;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.TextUtilities;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;

public class CodeFormatSaveParticipant implements IPostSaveListener {

	public String getName() {
		return "Format source code";
	}

	public String getId() {
		return ID;
	}

	static final String ID = "CodeFormat";

	/**
	 * Preference prefix that is appended to the id of
	 * {@link SaveParticipantDescriptor save participants}.
	 * 
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 */
	static final String EDITOR_SAVE_PARTICIPANT_PREFIX = "editor_save_participant_"; //$NON-NLS-1$

	public boolean isEnabled(ISourceModule compilationUnit) {
		return new PreferencesLookupDelegate(compilationUnit.getScriptProject()
				.getProject()).getBoolean(JavaScriptUI.PLUGIN_ID,
				EDITOR_SAVE_PARTICIPANT_PREFIX + getId());
	}

	public boolean needsChangedRegions(ISourceModule compilationUnit)
			throws CoreException {
		// TODO Auto-generated method stub
		return false;
	}

	public void saved(ISourceModule compilationUnit, IRegion[] changedRegions,
			IProgressMonitor monitor) throws CoreException {
		final IDocument document = new Document(compilationUnit.getSource());
		final IScriptFormatterFactory factory = ScriptFormatterManager
				.getSelected(JavaScriptNature.NATURE_ID, compilationUnit
						.getScriptProject().getProject());
		if (factory != null) {
			final IScriptFormatter formatter = factory.createFormatter(
					TextUtilities.getDefaultLineDelimiter(document), factory
							.retrievePreferences(new PreferencesLookupDelegate(
									compilationUnit.getScriptProject()
											.getProject())));
			try {
				final TextEdit edit = formatter.format(document.get(), 0,
						document.getLength(), 0);
				if (edit != null) {
					final SourceModuleChange change = new SourceModuleChange(
							"Format " + compilationUnit.getElementName(),
							compilationUnit);
					change.setSaveMode(TextFileChange.LEAVE_DIRTY);
					change.setEdit(edit);
					change.perform(monitor);
				}
			} catch (FormatterException e) {
				throw new CoreException(new Status(IStatus.ERROR,
						JavaScriptUI.PLUGIN_ID, e.toString(), e));
			} catch (MalformedTreeException e) {
				throw new CoreException(new Status(IStatus.ERROR,
						JavaScriptUI.PLUGIN_ID, e.toString(), e));
			}
		}
	}

}
