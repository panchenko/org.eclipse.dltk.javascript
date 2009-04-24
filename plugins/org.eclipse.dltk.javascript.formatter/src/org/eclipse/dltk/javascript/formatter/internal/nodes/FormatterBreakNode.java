package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterWriter;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;

public class FormatterBreakNode extends FormatterBlockWithBeginNode {

	public FormatterBreakNode(IFormatterDocument document) {
		super(document);
	}

	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {

		if (isCaseIndenting())
			context.decIndent();

		if (isIndenting())
			context.incIndent();

		super.accept(context, visitor);

		if (isIndenting())
			context.decIndent();

		if (isCaseIndenting())
			context.incIndent();
	}

	private boolean isCaseIndenting() {
		return getDocument().getBoolean(
				JavaScriptFormatterConstants.INDENT_CASE);
	}

	protected boolean isIndenting() {
		return getDocument().getBoolean(
				JavaScriptFormatterConstants.INDENT_BREAK);
	}

}
