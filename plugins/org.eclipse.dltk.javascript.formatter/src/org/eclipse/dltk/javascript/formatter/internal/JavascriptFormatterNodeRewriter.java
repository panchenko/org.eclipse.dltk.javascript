package org.eclipse.dltk.javascript.formatter.internal;

import java.util.List;

import org.eclipse.dltk.formatter.FormatterNodeRewriter;
import org.eclipse.dltk.formatter.IFormatterContainerNode;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterNode;
import org.eclipse.dltk.javascript.ast.Comment;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterCommentNode;

public class JavascriptFormatterNodeRewriter extends FormatterNodeRewriter {

	public JavascriptFormatterNodeRewriter(Script ast) {
		List commentList = ast.getComments();
		if (ast.getComments() != null) {
			for (int i = 0; i < commentList.size(); i++) {
				// Token.CommentType.BLOCK
				// Token.CommentType.HTML
				// Token.CommentType.JSDOC
				Comment comment = (Comment) commentList.get(i);
				addComment(comment.sourceStart(), comment.sourceEnd(), comment);
			}
		}
	}

	public void rewrite(IFormatterContainerNode root) {
		mergeTextNodes(root);
		insertComments(root);
		// insertMissedComments(root);
		// insertComments(root);
		// attachComments(root);
	}

	protected IFormatterNode createCommentNode(IFormatterDocument document,
			int startOffset, int endOffset, Object object) {
		return new FormatterCommentNode(document, startOffset, endOffset,
				((Comment) object).isMultiLine());
	}

	// private void insertComments(IFormatterContainerNode root) {
	// final List body = root.getBody();
	// final List newBody = new ArrayList();
	// boolean changes = false;
	// for (Iterator i = body.iterator(); i.hasNext();) {
	// final IFormatterNode node = (IFormatterNode) i.next();
	// if (isPlainTextNode(node)) {
	// if (hasComments(node.getStartOffset(), node.getEndOffset())) {
	// selectValidRanges(node.getStartOffset(), node
	// .getEndOffset(), newBody);
	// changes = true;
	// } else {
	// newBody.add(node);
	// }
	// } else {
	// newBody.add(node);
	// }
	// }
	//
	// IFormatterNode previous = null;
	// for (Iterator i = body.iterator(); i.hasNext();) {
	// final IFormatterNode node = (IFormatterNode) i.next();
	//
	// if (previous != null
	// && ((node.getStartOffset() - previous.getEndOffset()) > 1)) {
	// changes = insertExistingComments(previous, node, newBody);
	// }
	//
	// previous = node;
	// }
	//
	// if (changes) {
	// body.clear();
	// body.addAll(newBody);
	// }
	// for (Iterator i = body.iterator(); i.hasNext();) {
	// final IFormatterNode node = (IFormatterNode) i.next();
	// if (node instanceof IFormatterContainerNode) {
	// insertComments((IFormatterContainerNode) node);
	// }
	// }
	// }

	// private class FormatterNodeInfo {
	// public IFormatterContainerNode parent;
	// public IFormatterNode node;
	//
	// public FormatterNodeInfo(IFormatterContainerNode parent,
	// IFormatterNode node) {
	// this.parent = parent;
	// this.node = node;
	// }
	//
	// public String toString() {
	// return node.toString() + " (" + node.getStartOffset() + ".."
	// + node.getEndOffset() + ")";
	// }
	// }
	//
	// private class FormatterNodeComparator implements Comparator {
	//
	// private int compareInt(int i1, int i2) {
	// if (i1 == i2)
	// return 0;
	//
	// return i1 > i2 ? 1 : -1;
	// }
	//
	// public int compare(Object o1, Object o2) {
	//
	// FormatterNodeInfo f1 = (FormatterNodeInfo) o1;
	// FormatterNodeInfo f2 = (FormatterNodeInfo) o2;
	//
	// if (f1.node.getStartOffset() == f2.node.getStartOffset())
	// return compareInt(f1.node.getEndOffset(), f2.node
	// .getEndOffset());
	// else
	// return compareInt(f1.node.getStartOffset(), f2.node
	// .getStartOffset());
	// }
	//
	// }

	// private void insertMissedComments(IFormatterContainerNode root) {
	// final List body = root.getBody();
	// final List newBody = new ArrayList();
	// newBody.addAll(body);
	// boolean changes = false;
	// IFormatterNode previous = null;
	//
	// for (Iterator i = body.iterator(); i.hasNext();) {
	// final IFormatterNode node = (IFormatterNode) i.next();
	//
	// if (previous != null
	// && ((node.getStartOffset() - previous.getEndOffset()) > 1)) {
	// changes = insertExistingComments(previous, node, newBody);
	// }
	//
	// previous = node;
	// }
	//
	// if (changes) {
	// body.clear();
	// body.addAll(newBody);
	// }
	// for (Iterator i = body.iterator(); i.hasNext();) {
	// final IFormatterNode node = (IFormatterNode) i.next();
	// if (node instanceof IFormatterContainerNode) {
	// insertMissedComments((IFormatterContainerNode) node);
	// }
	// }
	// }
	//
	// private int insertExistingComments(IFormatterNode start,
	// IFormatterNode end, List list) {
	//
	// int count = 0;
	//
	// int startEnd = start != null ? start.getEndOffset() : 0;
	// int endStart = end.getStartOffset();
	//
	// for (Iterator i = allComments.iterator(); i.hasNext();) {
	// final Comment commentNode = (Comment) i.next();
	// if (commentNode.sourceEnd() <= endStart
	// && commentNode.sourceStart() >= startEnd) {
	//
	// int startOffset = commentNode.sourceStart();
	// int endOffset = commentNode.sourceEnd();
	//
	// if (commentNode.isMultiLine())
	// list.add(list.indexOf(end), new FormatterTextNode(document,
	// startOffset, endOffset));
	// else
	// list.add(list.indexOf(end), new FormatterVirtualTextNode(
	// document, startOffset, endOffset, document.get(
	// startOffset, endOffset)
	// + "\n"));
	//
	// count++;
	// }
	// }
	//
	// return count;
	// }

	// private void attachComments(IFormatterContainerNode root) {
	// final List commentNodes = new ArrayList();
	// final List comments = new ArrayList();
	// final List body = root.getBody();
	// for (Iterator i = body.iterator(); i.hasNext();) {
	// IFormatterNode node = (IFormatterNode) i.next();
	// if (node instanceof FormatterCommentNode) {
	// comments.add(node);
	// } else if (FormatterUtils.isNewLine(node)
	// && !comments.isEmpty()
	// && comments.get(comments.size() - 1) instanceof FormatterCommentNode) {
	// comments.add(node);
	// } else if (!comments.isEmpty()) {
	// if (node instanceof IFormatterCommentableNode) {
	// ((IFormatterCommentableNode) node).insertBefore(comments);
	// commentNodes.addAll(comments);
	// }
	// comments.clear();
	// }
	// }
	// body.removeAll(commentNodes);
	// for (Iterator i = body.iterator(); i.hasNext();) {
	// final IFormatterNode node = (IFormatterNode) i.next();
	// if (node instanceof IFormatterContainerNode) {
	// attachComments((IFormatterContainerNode) node);
	// }
	// }
	// }

	// private boolean isVirtualTextNode(final IFormatterNode node) {
	// return node.getClass() == FormatterVirtualTextNode.class;
	// }

	// private boolean hasComments(int startOffset, int endOffset) {
	//
	// for (Iterator i = comments.iterator(); i.hasNext();) {
	// final Comment commentNode = (Comment) i.next();
	// if (commentNode.sourceStart() < endOffset
	// && startOffset < commentNode.sourceEnd()) {
	// return true;
	// }
	// }
	// return false;
	// }
	//
	// private void selectValidRanges(int start, int end, List result) {
	// for (Iterator i = comments.iterator(); i.hasNext();) {
	// final Comment comment = (Comment) i.next();
	// if (start <= comment.sourceEnd() && comment.sourceStart() <= end) {
	// if (start < comment.sourceStart()) {
	// int validEnd = Math.min(end, comment.sourceStart());
	// result
	// .add(new FormatterTextNode(document, start,
	// validEnd));
	// start = comment.sourceStart();
	// }
	// result.add(new FormatterCommentNode(document, start, Math.min(
	// comment.sourceEnd(), end)));
	// start = comment.sourceEnd();
	// if (start > end) {
	// break;
	// }
	// }
	// }
	// if (start < end) {
	// result.add(new FormatterTextNode(document, start, end));
	// }
	// }

}
