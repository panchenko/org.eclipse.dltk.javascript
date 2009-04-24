package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.FormatterBlockNode;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterWriter;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;

public class FormatterFinallyClauseNode extends FormatterBlockNode {

	public FormatterFinallyClauseNode(IFormatterDocument document) {
		super(document);
	}

	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {

		if (isNewLineBreaking())
			visitor.writeLineBreak(context);

		super.accept(context, visitor);
	}

	private boolean isNewLineBreaking() {
		return getDocument().getBoolean(
				JavaScriptFormatterConstants.NEW_LINE_BEFORE_FINALLY_IN_TRY);

	}

}
