package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.FormatterTextNodeWrapper;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterTextNode;
import org.eclipse.dltk.formatter.IFormatterWriter;

public class ColonNodeWrapper extends FormatterTextNodeWrapper {

	public ColonNodeWrapper(IFormatterTextNode target) {
		super(target);
	}

	@Override
	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {
		super.accept(context, visitor);
		context.setBlankLines(-1);
		visitor.writeLineBreak(context);
		visitor.skipNextLineBreaks(context);
	}

}
