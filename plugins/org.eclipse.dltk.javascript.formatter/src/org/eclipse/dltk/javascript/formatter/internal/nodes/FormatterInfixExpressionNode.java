package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterDocument;

public class FormatterInfixExpressionNode extends
		FormatterBlockWithBeginEndNode {

	public FormatterInfixExpressionNode(IFormatterDocument document) {
		super(document);
	}

	protected boolean isIndenting() {
		return false;
	}
	
	
}
