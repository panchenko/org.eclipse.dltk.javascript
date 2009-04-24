package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterDocument;

public class FormatterExpressionStatementNode extends
		FormatterBlockWithBeginEndNode {

	public FormatterExpressionStatementNode(IFormatterDocument document) {
		super(document);
	}

	protected boolean isIndenting() {
		return false;
	}
	
	
}
