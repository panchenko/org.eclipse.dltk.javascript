package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;

public class FormatterDoWhileStatementNode extends
		FormatterBlockWithBeginEndNode {

	public FormatterDoWhileStatementNode(IFormatterDocument document) {
		super(document);
		// TODO Auto-generated constructor stub
	}

	protected boolean isIndenting() {
		return getDocument().getBoolean(
				JavaScriptFormatterConstants.INDENT_BLOCK);
	}
	
}
