package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterDocument;

public class FormatterReturnStatementNode extends FormatterBlockWithBeginNode {

	public FormatterReturnStatementNode(IFormatterDocument document) {
		super(document);
	}

	protected boolean isIndenting() {
		return false;
	}
	
}
