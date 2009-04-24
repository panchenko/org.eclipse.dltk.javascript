package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterDocument;

public class FormatterFunctionNode extends FormatterBlockWithBeginNode {

	public FormatterFunctionNode(IFormatterDocument document) {
		super(document);
	}
	
	protected boolean isIndenting() {
		return false;
	}
	
}
