/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.text;

import org.eclipse.dltk.javascript.ui.JavascriptPreferenceConstants;
import org.eclipse.dltk.javascript.ui.text.IJavaScriptPartitions;
import org.eclipse.dltk.ui.editor.highlighting.ISemanticHighlighter;
import org.eclipse.dltk.ui.editor.highlighting.SemanticHighlighting;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.ui.texteditor.ITextEditor;

public class JavascriptTextTools extends ScriptTextTools {

	private final class SH extends SemanticHighlighting {

		private String preferenceKey;

		public String getBackgroundPreferenceKey() {
			return bgColor;
		}

		private String bgColor;

		public SH(String editorXmlTagNameColor, String bgColor) {
			this.preferenceKey = editorXmlTagNameColor;
			this.bgColor = bgColor;
		}

		public String getPreferenceKey() {
			return preferenceKey;
		}

	}

	public JavascriptTextTools(boolean autoDisposeOnDisplayDispose) {
		super(IJavaScriptPartitions.JS_PARTITIONING,
				IJavaScriptPartitions.LEGAL_CONTENT_TYPES,
				autoDisposeOnDisplayDispose);
	}

	public ScriptSourceViewerConfiguration createSourceViewerConfiguraton(
			IPreferenceStore preferenceStore, ITextEditor editor,
			String partitioning) {
		return new JavascriptSourceViewerConfiguration(getColorManager(),
				preferenceStore, editor, partitioning);
	}

	public IPartitionTokenScanner getPartitionScanner() {
		return new JavascriptPartitionScanner();
	}

	public SemanticHighlighting[] getSemanticHighlightings() {
		return new SemanticHighlighting[] {
				new SH(JavascriptPreferenceConstants.EDITOR_XML_TAG_NAME_COLOR,
						null),
				new SH(
						JavascriptPreferenceConstants.EDITOR_XML_ATTR_NAME_COLOR,
						null),
				new SH(JavascriptPreferenceConstants.EDITOR_XML_COMMENT_COLOR,
						null),
				new SH(JavascriptPreferenceConstants.EDITOR_KEYWORD_COLOR, null), };
	}

	public ISemanticHighlighter getSemanticPositionUpdater() {
		return new JavaScriptPositionUpdater();
	}

}
