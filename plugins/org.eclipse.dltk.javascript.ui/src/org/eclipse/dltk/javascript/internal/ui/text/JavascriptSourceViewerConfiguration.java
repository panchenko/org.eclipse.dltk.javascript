/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.text;

import org.eclipse.dltk.javascript.internal.ui.text.completion.JavaScriptCompletionProcessor;
import org.eclipse.dltk.javascript.internal.ui.text.completion.JavaScriptContentAssistPreference;
import org.eclipse.dltk.javascript.ui.text.IJavaScriptPartitions;
import org.eclipse.dltk.ui.text.AbstractScriptScanner;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.dltk.ui.text.ScriptPresentationReconciler;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.dltk.ui.text.TodoTaskPreferencesOnPreferenceStore;
import org.eclipse.dltk.ui.text.completion.ContentAssistPreference;
import org.eclipse.dltk.ui.text.completion.ContentAssistProcessor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.BadPartitioningException;
import org.eclipse.jface.text.DefaultTextDoubleClickStrategy;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.texteditor.ITextEditor;

public class JavascriptSourceViewerConfiguration extends
		ScriptSourceViewerConfiguration {

	private JavascriptCodeScanner fCodeScanner;

	private AbstractScriptScanner fStringScanner;

	private AbstractScriptScanner fCommentScanner;

	private JavascriptDocScanner fDocScanner;

	public JavascriptSourceViewerConfiguration(IColorManager colorManager,
			IPreferenceStore preferenceStore, ITextEditor editor,
			String partitioning) {
		super(colorManager, preferenceStore, editor, partitioning);
	}

	/**
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getDoubleClickStrategy(org.eclipse.jface.text.source.ISourceViewer,
	 *      java.lang.String)
	 * @since 2.0
	 */
	@Override
	public ITextDoubleClickStrategy getDoubleClickStrategy(
			ISourceViewer sourceViewer, String contentType) {
		if (IJavaScriptPartitions.JS_DOC.equals(contentType)) {
			return new JSDocDoubleClickStrategy(
					getConfiguredDocumentPartitioning(sourceViewer));
		}
		return new DefaultTextDoubleClickStrategy() {
			/**
			 * @see org.eclipse.jface.text.DefaultTextDoubleClickStrategy#findExtendedDoubleClickSelection(org.eclipse.jface.text.IDocument,
			 *      int)
			 */
			@Override
			protected IRegion findExtendedDoubleClickSelection(
					IDocument document, int offset) {
				int start = -1;
				int end = -1;
				String text = document.get();

				if (document instanceof IDocumentExtension3) {
					try {
						String contentType = ((IDocumentExtension3) document)
								.getContentType(
										IJavaScriptPartitions.JS_PARTITIONING,
										offset, true);
						if (IJavaScriptPartitions.JS_STRING_SINGLE
								.equals(contentType)
								|| IJavaScriptPartitions.JS_STRING
										.equals(contentType)
								|| IJavaScriptPartitions.JS_REGEXP
										.equals(contentType)) {
							ITypedRegion region = ((IDocumentExtension3) document)
									.getPartition(
											IJavaScriptPartitions.JS_PARTITIONING,
											offset, true);
							if (region != null && region.getLength() > 0) {
								// if reg exp return as is.
								if (IJavaScriptPartitions.JS_REGEXP
										.equals(contentType))
									return region;
								// if it is a string, strip the quotes.
								return new Region(region.getOffset() + 1,
										region.getLength() - 2);
							}
						}
					} catch (BadLocationException ex) {
						ex.printStackTrace();
					} catch (BadPartitioningException ex) {
						ex.printStackTrace();
					}
				}

				// try to find if the text just before the offset is 1 of (,[ or
				// {
				if (offset > 0) {
					char ch = text.charAt(offset - 1);
					char closingChar = 0;

					if (ch == '(')
						closingChar = ')';
					else if (ch == '{')
						closingChar = '}';
					else if (ch == '[')
						closingChar = ']';

					if (closingChar != 0) {
						// it was one of the grouping chars, try to find the
						// closing.
						int closing = findClosing(text, offset, ch,
								closingChar, 1);
						if (closing != -1)
							return new Region(offset, closing - offset);
					}
				}

				// try to find if the text under the offset is 1 of ),] or }
				if (offset >= text.length()) {
					return null;
				}
				char ch = text.charAt(offset);
				char startChar = 0;

				if (ch == ')')
					startChar = '(';
				else if (ch == '}')
					startChar = '{';
				else if (ch == ']')
					startChar = '[';

				if (startChar != 0) {
					// it was one now try to find the start.
					int closing = findClosing(text, offset - 1, ch, startChar,
							-1);
					if (closing != -1)
						return new Region(closing + 1, offset - closing - 1);
				}

				// fall back on just words
				int i = offset;
				while (Character.isJavaIdentifierPart(text.charAt(i--))) {
					if (i == -1) {
						break;
					}
				}
				start = i + 2;

				i = offset;
				while (Character.isJavaIdentifierPart(text.charAt(i++))) {
					if (i == text.length()) {
						break;
					}
				}
				end = i - 1;

				return new Region(start, end - start);
			}

			// pretty simple find next { or }, doesnt skip over strings yet.
			private int findClosing(String text, int offset, char beginChar,
					char endChar, int next) {
				int skip = 0;
				int counter = offset;
				while (counter != -1 && counter < text.length()) {
					char ch = text.charAt(counter);

					if (ch == endChar) {
						if (skip == 0)
							return counter;
						skip--;
					}

					if (ch == beginChar)
						skip++;

					counter += next;
				}
				return -1;
			}
		};
	}

	@Override
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return IJavaScriptPartitions.JS_PARTITION_TYPES;
	}

	@Override
	public String getCommentPrefix() {
		return "//"; //$NON-NLS-1$
	}

	@Override
	protected void alterContentAssistant(ContentAssistant assistant) {
		IContentAssistProcessor scriptProcessor = new JavaScriptCompletionProcessor(
				getEditor(), assistant, IDocument.DEFAULT_CONTENT_TYPE);
		assistant.setContentAssistProcessor(scriptProcessor,
				IDocument.DEFAULT_CONTENT_TYPE);

		ContentAssistProcessor singleLineProcessor = new JavaScriptCompletionProcessor(
				getEditor(), assistant, IJavaScriptPartitions.JS_COMMENT);
		assistant.setContentAssistProcessor(singleLineProcessor,
				IJavaScriptPartitions.JS_COMMENT);

		ContentAssistProcessor stringProcessor = new JavaScriptCompletionProcessor(
				getEditor(), assistant, IJavaScriptPartitions.JS_STRING);
		assistant.setContentAssistProcessor(stringProcessor,
				IJavaScriptPartitions.JS_STRING);

		ContentAssistProcessor stringSingleProcessor = new JavaScriptCompletionProcessor(
				getEditor(), assistant, IJavaScriptPartitions.JS_STRING_SINGLE);
		assistant.setContentAssistProcessor(stringSingleProcessor,
				IJavaScriptPartitions.JS_STRING_SINGLE);

		// TODO JS DOC completion??
		ContentAssistProcessor jsProcessor = new JavaScriptCompletionProcessor(
				getEditor(), assistant, IJavaScriptPartitions.JS_DOC);
		assistant.setContentAssistProcessor(jsProcessor,
				IJavaScriptPartitions.JS_DOC);

	}

	@Override
	protected ContentAssistPreference getContentAssistPreference() {
		return JavaScriptContentAssistPreference.getDefault();
	}

	@Override
	protected void initializeScanners() {
		fCodeScanner = new JavascriptCodeScanner(getColorManager(),
				fPreferenceStore);
		fStringScanner = new JavascriptStringScanner(getColorManager(),
				fPreferenceStore);

		fCommentScanner = new JavaScriptScriptCommentScanner(getColorManager(),
				fPreferenceStore,
				JavascriptColorConstants.JS_SINGLE_LINE_COMMENT,
				JavascriptColorConstants.JS_TODO_TAG,
				new TodoTaskPreferencesOnPreferenceStore(fPreferenceStore));
		fDocScanner = new JavascriptDocScanner(this);

	}

	/**
	 * Returns the Javascript string scanner for this configuration.
	 * 
	 * @return the Javascript string scanner
	 */
	protected RuleBasedScanner getStringScanner() {
		return fStringScanner;
	}

	/**
	 * Returns the Javascript comment scanner for this configuration.
	 * 
	 * @return the Javascript comment scanner
	 */
	protected RuleBasedScanner getCommentScanner() {
		return fCommentScanner;
	}

	@Override
	public IPresentationReconciler getPresentationReconciler(
			ISourceViewer sourceViewer) {
		ScriptPresentationReconciler reconciler = new ScriptPresentationReconciler();
		reconciler
				.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));

		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(
				this.fCodeScanner);
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		// also let the default code scanner color regexp
		reconciler.setDamager(dr, IJavaScriptPartitions.JS_REGEXP);
		reconciler.setRepairer(dr, IJavaScriptPartitions.JS_REGEXP);

		dr = new DefaultDamagerRepairer(getStringScanner());
		reconciler.setDamager(dr, IJavaScriptPartitions.JS_STRING);
		reconciler.setRepairer(dr, IJavaScriptPartitions.JS_STRING);

		dr = new DefaultDamagerRepairer(getStringScanner());
		reconciler.setDamager(dr, IJavaScriptPartitions.JS_STRING_SINGLE);
		reconciler.setRepairer(dr, IJavaScriptPartitions.JS_STRING_SINGLE);

		dr = new DefaultDamagerRepairer(getCommentScanner());
		reconciler.setDamager(dr, IJavaScriptPartitions.JS_COMMENT);
		reconciler.setRepairer(dr, IJavaScriptPartitions.JS_COMMENT);

		dr = new DefaultDamagerRepairer(fDocScanner);
		reconciler.setDamager(dr, IJavaScriptPartitions.JS_DOC);
		reconciler.setRepairer(dr, IJavaScriptPartitions.JS_DOC);

		return reconciler;
	}

	/**
	 * Adapts the behavior of the contained components to the change encoded in
	 * the given event.
	 * <p>
	 * Clients are not allowed to call this method if the old setup with text
	 * tools is in use.
	 * </p>
	 * 
	 * @param event
	 *            the event to which to adapt
	 * @see JavascriptSourceViewerConfiguration#ScriptSourceViewerConfiguration(IColorManager,
	 *      IPreferenceStore, ITextEditor, String)
	 */
	@Override
	public void handlePropertyChangeEvent(PropertyChangeEvent event) {
		if (fCodeScanner.affectsBehavior(event))
			fCodeScanner.adaptToPreferenceChange(event);
		if (fCommentScanner.affectsBehavior(event))
			fCommentScanner.adaptToPreferenceChange(event);
		if (fDocScanner.affectsBehavior(event))
			fDocScanner.adaptToPreferenceChange(event);
		if (fStringScanner.affectsBehavior(event))
			fStringScanner.adaptToPreferenceChange(event);
	}

	/**
	 * Determines whether the preference change encoded by the given event
	 * changes the behavior of one of its contained components.
	 * 
	 * @param event
	 *            the event to be investigated
	 * @return <code>true</code> if event causes a behavioral change
	 * 
	 */
	@Override
	public boolean affectsTextPresentation(PropertyChangeEvent event) {
		return fCodeScanner.affectsBehavior(event)
				|| fCommentScanner.affectsBehavior(event)
				|| fDocScanner.affectsBehavior(event)
				|| fStringScanner.affectsBehavior(event);
	}

	@Override
	public IAutoEditStrategy[] getAutoEditStrategies(
			ISourceViewer sourceViewer, String contentType) {
		// TODO: check contentType. think, do we really need it? :)
		String partitioning = getConfiguredDocumentPartitioning(sourceViewer);
		return new IAutoEditStrategy[] { new JavascriptAutoEditStrategy(
				partitioning, null) };
	}

}
