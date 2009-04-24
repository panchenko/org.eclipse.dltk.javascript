package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.FormatterTextNode;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterWriter;

public class FormatterVirtualTextNode extends FormatterTextNode {

	private String text;
	
	public FormatterVirtualTextNode(IFormatterDocument document,
			int startOffset, int endOffset, String text) {
		super(document, startOffset, endOffset);
		this.text = text;
	}

	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {
		// System.out.println(text);
		visitor.writeText(context, text);
	}
	
	public String getText() {
		return this.text;
	}
	
	public String toString() {
		return getText();
	}
}
