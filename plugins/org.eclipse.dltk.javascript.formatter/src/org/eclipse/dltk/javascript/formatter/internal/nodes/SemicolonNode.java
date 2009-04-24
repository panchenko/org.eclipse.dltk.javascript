package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.FormatterTextNode;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterWriter;

public class SemicolonNode extends FormatterTextNode {

	public SemicolonNode(IFormatterDocument document, int offset) {
		super(document, offset, offset + 1);
	}

	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {
		visitor.writeText(context, "");
		super.accept(context, visitor);
	}

}
