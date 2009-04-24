package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.FormatterTextNode;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterWriter;

public class FormatterCommentNode extends FormatterTextNode {

	private final boolean multiLine;

	public FormatterCommentNode(IFormatterDocument document, int startOffset,
			int endOffset, boolean multiLine) {
		super(document, startOffset, endOffset);
		this.multiLine = multiLine;
	}

	protected boolean isIndenting() {
		return false;
	}

	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {
		super.accept(context, visitor);
		if (!multiLine) {
			visitor.disableAppendToPreviousLine();
		}
	}

}
