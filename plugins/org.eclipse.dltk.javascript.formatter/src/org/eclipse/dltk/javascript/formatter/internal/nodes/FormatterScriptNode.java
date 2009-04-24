package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.FormatterBlockNode;
import org.eclipse.dltk.formatter.IFormatterDocument;

public class FormatterScriptNode extends FormatterBlockNode {

	public FormatterScriptNode(IFormatterDocument document) {
		super(document);
	}

	 protected boolean isIndenting() {
		return false;
	}

}
