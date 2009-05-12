package org.eclipse.dltk.javascript.formatter.internal;

import org.eclipse.dltk.formatter.FormatterContext;

public class JavaScriptFormatterContext extends FormatterContext {

	private String additionalIndent;

	public JavaScriptFormatterContext(int indent) {
		super(indent);
	}

	public String getAdditionalIndent() {
		return additionalIndent;
	}

	public void setAdditionalIndent(String value) {
		this.additionalIndent = value;
	}

}
