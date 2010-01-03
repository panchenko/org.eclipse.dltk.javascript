/**
 * 
 */
package org.eclipse.dltk.javascript.formatter.internal.nodes;

import java.util.List;

import org.eclipse.dltk.formatter.IFormatterContainerNode;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterNode;
import org.eclipse.dltk.formatter.IFormatterNodeProxy;
import org.eclipse.dltk.formatter.IFormatterWriter;

/**
 * @author jcompagner
 * @author Alex Panchenko  
 */
public class LineBreakFormatterNode implements IFormatterContainerNode,
		IFormatterNodeProxy {

	private final IFormatterContainerNode target;

	/**
	 * @param document
	 */
	public LineBreakFormatterNode(IFormatterContainerNode target) {
		this.target = target;
	}

	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {
		visitor.writeLineBreak(context);
		target.accept(context, visitor);
	}

	public void addChild(IFormatterNode child) {
		target.addChild(child);
	}

	public List getBody() {
		return target.getBody();
	}

	public List getChildren() {
		return target.getChildren();
	}

	public IFormatterDocument getDocument() {
		return target.getDocument();
	}

	public int getEndOffset() {
		return target.getEndOffset();
	}

	public int getStartOffset() {
		return target.getStartOffset();
	}

	public boolean isEmpty() {
		return target.isEmpty();
	}

	public IFormatterNode getTargetNode() {
		return target;
	}

}
