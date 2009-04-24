package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterDocument;

public class FormatterForStatementNode extends FormatterBlockWithBeginNode {

	public FormatterForStatementNode(IFormatterDocument document) {
		super(document);
	}

	protected boolean isIndenting() {
		return false;
	}
}
