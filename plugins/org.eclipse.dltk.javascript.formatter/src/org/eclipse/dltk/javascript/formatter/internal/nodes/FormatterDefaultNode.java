package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterTextNode;
import org.eclipse.dltk.formatter.IFormatterWriter;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;

public class FormatterDefaultNode extends FormatterBlockWithBeginEndNode {

	public FormatterDefaultNode(IFormatterDocument document) {
		super(document);
	}

	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {
		context.setBlankLines(getBlankLinesBefore(context));
		if (getBegin() != null) {
			IFormatterTextNode[] nodes = getBegin();

			for (int i = 0; i < nodes.length; i++) {
				nodes[i].accept(context, visitor);

				if (i == nodes.length - 1) {
					context.setBlankLines(-1);
					visitor.writeLineBreak(context);
				}
			}
		}
		acceptBody(context, visitor);
	}

	protected boolean isIndenting() {
		return getDocument().getBoolean(
				JavaScriptFormatterConstants.INDENT_CASE);
	}

}
