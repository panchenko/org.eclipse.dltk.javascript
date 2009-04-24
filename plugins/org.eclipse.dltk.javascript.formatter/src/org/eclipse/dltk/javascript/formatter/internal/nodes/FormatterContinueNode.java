package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterDocument;

public class FormatterContinueNode extends FormatterBlockWithBeginNode {

	public FormatterContinueNode(IFormatterDocument document) {
		super(document);
	}

	protected boolean isIndenting() {
		return true;
	}

}
