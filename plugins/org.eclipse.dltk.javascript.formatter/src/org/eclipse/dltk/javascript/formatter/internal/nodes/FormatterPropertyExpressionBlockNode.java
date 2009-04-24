package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterDocument;

public class FormatterPropertyExpressionBlockNode extends
		FormatterBlockWithBeginNode {

	public FormatterPropertyExpressionBlockNode(IFormatterDocument document) {
		super(document);
		// TODO Auto-generated constructor stub
	}

	protected boolean isIndenting() {
		return false;
	}
	
}
