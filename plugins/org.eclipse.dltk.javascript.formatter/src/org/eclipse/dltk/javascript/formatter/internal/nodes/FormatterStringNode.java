package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.formatter.FormatterTextNode;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterWriter;

public class FormatterStringNode extends FormatterTextNode {

	/**
	 * @param document
	 * @param startOffset
	 * @param endOffset
	 */
	public FormatterStringNode(IFormatterDocument document, ASTNode node) {
		super(document, node.sourceStart(), node.sourceEnd());
	}

	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {
		visitor.ensureLineStarted(context);
		IFormatterContext strContext = context.copy();
		strContext.setIndenting(false);
		visitor.write(strContext, getStartOffset(), getEndOffset());
	}

}