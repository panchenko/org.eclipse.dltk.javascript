package org.eclipse.dltk.javascript.formatter.internal;

import org.eclipse.dltk.formatter.FormatterContext;

public class JavaScriptFormatterContext extends FormatterContext {

	public JavaScriptFormatterContext(int indent) {
		super(indent);
	}

	// protected boolean isCountable(IFormatterNode node) {
	// return node instanceof IFormatterContainerNode
	// || node instanceof FormatterRequireNode;
	// }
	
}
