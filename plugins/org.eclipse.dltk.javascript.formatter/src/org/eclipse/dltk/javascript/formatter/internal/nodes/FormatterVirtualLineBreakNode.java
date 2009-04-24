package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.FormatterTextNode;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterWriter;

public class FormatterVirtualLineBreakNode extends FormatterTextNode {

	public FormatterVirtualLineBreakNode(IFormatterDocument document,
			int startOffset, int endOffset) {
		super(document, startOffset, endOffset);
	}

	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {
		visitor.writeLineBreak(context);
	}

	public String getText() {
		return "\n";
	}
	
}
