package org.eclipse.dltk.javascript.formatter.internal;

import org.eclipse.dltk.formatter.FormatterNodeRewriter;
import org.eclipse.dltk.formatter.IFormatterContainerNode;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterNode;
import org.eclipse.dltk.javascript.ast.Comment;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterCommentNode;

public class JavascriptFormatterNodeRewriter extends FormatterNodeRewriter {

	public JavascriptFormatterNodeRewriter(Script ast) {
		for (Comment comment : ast.getComments()) {
			addComment(comment.sourceStart(), comment.sourceEnd(), comment);
		}
	}

	public void rewrite(IFormatterContainerNode root) {
		mergeTextNodes(root);
		insertComments(root);
	}

	@Override
	protected IFormatterNode createCommentNode(IFormatterDocument document,
			int startOffset, int endOffset, Object object) {
		return new FormatterCommentNode(document, startOffset, endOffset,
				((Comment) object).isMultiLine());
	}

}
