package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;

public class FormatterLabelledStatementNode extends FormatterBlockWithBeginNode {

	public FormatterLabelledStatementNode(IFormatterDocument document) {
		super(document);
	}

	protected boolean isIndenting() {
		return getDocument().getBoolean(
				JavaScriptFormatterConstants.INDENT_BLOCK);
	}
}
