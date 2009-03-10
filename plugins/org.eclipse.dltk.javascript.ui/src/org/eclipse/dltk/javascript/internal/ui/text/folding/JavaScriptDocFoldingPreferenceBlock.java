package org.eclipse.dltk.javascript.internal.ui.text.folding;

import org.eclipse.dltk.ui.preferences.OverlayPreferenceStore;
import org.eclipse.dltk.ui.text.folding.DocumentationFoldingPreferenceBlock;
import org.eclipse.jface.preference.PreferencePage;

public class JavaScriptDocFoldingPreferenceBlock extends
		DocumentationFoldingPreferenceBlock {

	public JavaScriptDocFoldingPreferenceBlock(OverlayPreferenceStore store,
			PreferencePage page) {
		super(store, page);
	}

	protected String getInitiallyFoldDocsText() {
		return JavaScriptFoldingMessages.JavaScriptFoldingPreferenceBlock_initFoldDoc;
	}

	protected boolean supportsDocFolding() {
		return true;
	}
}
