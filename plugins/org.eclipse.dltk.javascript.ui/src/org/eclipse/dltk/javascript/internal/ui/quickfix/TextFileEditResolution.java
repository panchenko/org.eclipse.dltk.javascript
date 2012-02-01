package org.eclipse.dltk.javascript.internal.ui.quickfix;

import org.eclipse.core.filebuffers.FileBuffers;
import org.eclipse.core.filebuffers.ITextFileBuffer;
import org.eclipse.core.filebuffers.ITextFileBufferManager;
import org.eclipse.core.filebuffers.LocationKind;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.ui.editor.IScriptAnnotation;
import org.eclipse.dltk.ui.text.IAnnotationResolution2;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.graphics.Image;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IMarkerResolution2;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

/**
 * Base resolution class when file modification is needed
 * 
 * @author jcompagner
 * 
 */
public abstract class TextFileEditResolution implements IMarkerResolution2,
		IAnnotationResolution2 {
	private IFile scriptFile;
	private int problemStartIdx;

	public TextFileEditResolution(IFile scriptFile, int problemStartIdx) {
		this.scriptFile = scriptFile;
		this.problemStartIdx = problemStartIdx;
	}

	public IFile getScriptFile() {
		return scriptFile;
	}

	public int getProblemStartIdx() {
		return problemStartIdx;
	}

	public Image getImage() {
		return null;
	}

	public final void run() {
		MultiTextEdit textEdit = getTextEdit(scriptFile, problemStartIdx);
		if (!textEdit.hasChildren())
			return;

		ITextFileBufferManager textFileBufferManager = FileBuffers
				.getTextFileBufferManager();
		try {
			textFileBufferManager.connect(scriptFile.getFullPath(),
					LocationKind.IFILE, null);
		} catch (CoreException e) {
			e.printStackTrace();
			return;
		}

		try {
			ITextFileBuffer textFileBuffer = textFileBufferManager
					.getTextFileBuffer(scriptFile.getFullPath(),
							LocationKind.IFILE);
			IDocument document = textFileBuffer.getDocument();

			FileEditorInput editorInput = new FileEditorInput(scriptFile);
			final IEditorPart openEditor = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow() == null ? null : PlatformUI
					.getWorkbench().getActiveWorkbenchWindow().getActivePage()
					.findEditor(editorInput);

			boolean dirty = openEditor != null ? openEditor.isDirty()
					: textFileBuffer.isDirty();

			try {
				textEdit.apply(document);
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (!dirty) {
				if (openEditor != null) {
					openEditor.doSave(null);
				} else {
					try {
						textFileBuffer.commit(null, true);
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		} finally {
			try {
				textFileBufferManager.disconnect(scriptFile.getFullPath(),
						LocationKind.IFILE, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	protected abstract MultiTextEdit getTextEdit(IFile file, int offset);

	/*
	 * @see
	 * org.eclipse.ui.IMarkerResolution#run(org.eclipse.core.resources.IMarker)
	 */
	public final void run(final IMarker marker) {
		run();
	}

	/*
	 * @see
	 * org.eclipse.dltk.ui.text.IAnnotationResolution#run(org.eclipse.dltk.ui
	 * .editor.IScriptAnnotation, org.eclipse.jface.text.IDocument)
	 */
	public final void run(IScriptAnnotation annotation, IDocument document) {
		run();
	}
}