package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterWriter;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;

public class FormatterElseNode extends FormatterBlockWithBeginNode {

	public FormatterElseNode(IFormatterDocument document) {
		super(document);
	}

	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {

		if (isLineBreaking())
			visitor.writeLineBreak(context);
		else {
			visitor.appendToPreviousLine(context, " ");
		}

		super.accept(context, visitor);
	}

	protected boolean isIndenting() {
		return false;
	}

	protected boolean isLineBreaking() {
		return getDocument().getBoolean(
				JavaScriptFormatterConstants.NEW_LINE_BEFORE_ELSE_IN_IF);
	}

}
