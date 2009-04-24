package org.eclipse.dltk.javascript.formatter.internal.nodes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.formatter.FormatterBlockNode;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterTextNode;
import org.eclipse.dltk.formatter.IFormatterWriter;

public abstract class FormatterBlockWithBeginNode extends FormatterBlockNode {

	/**
	 * @param document
	 */
	public FormatterBlockWithBeginNode(IFormatterDocument document) {
		super(document);
	}

	private IFormatterTextNode begin;

	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {
		if (begin != null) {
			visitor
					.write(context, begin.getStartOffset(), begin
							.getEndOffset());
		}
		final boolean indenting = isIndenting();
		if (indenting) {
			context.incIndent();
		}
		super.accept(context, visitor);
		if (indenting) {
			context.decIndent();
		}
	}

	/**
	 * @return the begin
	 */
	public IFormatterTextNode getBegin() {
		return begin;
	}

	/**
	 * @param begin
	 *            the begin to set
	 */
	public void setBegin(IFormatterTextNode begin) {
		this.begin = begin;
	}

	/*
	 * @see
	 * org.eclipse.dltk.ruby.formatter.node.FormatterBlockNode#getStartOffset()
	 */
	public int getStartOffset() {
		if (begin != null) {
			return begin.getStartOffset();
		}
		return super.getStartOffset();
	}

	/*
	 * @see
	 * org.eclipse.dltk.ruby.formatter.node.FormatterBlockNode#getEndOffset()
	 */
	public int getEndOffset() {
		if (!super.isEmpty()) {
			return super.getEndOffset();
		}
		if (begin != null) {
			return begin.getEndOffset();
		}
		return DEFAULT_OFFSET;
	}

	/*
	 * @see org.eclipse.dltk.ruby.formatter.node.FormatterBlockNode#isEmpty()
	 */
	public boolean isEmpty() {
		return begin == null && super.isEmpty();
	}

	/*
	 * @see org.eclipse.dltk.formatter.nodes.FormatterBlockNode#getChildren()
	 */
	public List getChildren() {
		if (begin == null) {
			return super.getChildren();
		} else {
			List result = new ArrayList();
			if (begin != null) {
				result.add(begin);
			}
			result.addAll(super.getChildren());
			return result;
		}
	}

	/*
	 * @see org.eclipse.dltk.ruby.formatter.node.FormatterBlockNode#toString()
	 */
	public String toString() {
		return begin + "\n" + super.toString(); //$NON-NLS-1$
	}
}
