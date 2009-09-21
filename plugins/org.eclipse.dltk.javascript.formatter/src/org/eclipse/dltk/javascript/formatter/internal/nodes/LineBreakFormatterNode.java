/**
 * 
 */
package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.FormatterBlockNode;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterWriter;

/**
 * @author jcompagner
 *
 */
public class LineBreakFormatterNode extends FormatterBlockNode
{

	/**
	 * @param document
	 */
	public LineBreakFormatterNode(IFormatterDocument document)
	{
		super(document);
	}
	
	/**
	 * @see org.eclipse.dltk.formatter.FormatterBlockNode#accept(org.eclipse.dltk.formatter.IFormatterContext, org.eclipse.dltk.formatter.IFormatterWriter)
	 */
	@Override
	public void accept(IFormatterContext context, IFormatterWriter visitor) throws Exception
	{
		visitor.writeLineBreak(context);
		super.accept(context, visitor);
	}

}
