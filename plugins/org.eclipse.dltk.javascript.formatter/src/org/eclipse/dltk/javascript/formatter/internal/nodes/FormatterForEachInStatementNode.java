package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterNode;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;


public class FormatterForEachInStatementNode extends
		FormatterBlockWithParensNode {

	private IFormatterNode eachKeyword;
	
	public FormatterForEachInStatementNode(IFormatterDocument document) {
		super(document);
		// TODO Auto-generated constructor stub
	}

	public IFormatterNode getEachKeyword() {
		return this.eachKeyword;
	}

	public void setEachKeyword(IFormatterNode node) {
		this.eachKeyword = node;
		getBody().add(node);
	}
	
	protected boolean isIndenting() {
		return getDocument().getBoolean(
				JavaScriptFormatterConstants.INDENT_BLOCK);
	}

	protected boolean insertNewLineAfterRP() {
		String option = getDocument().getString(
				JavaScriptFormatterConstants.BRACE_BLOCK);

		return JavaScriptFormatterConstants.BRACE_NEXT_LINE.equals(option) 
				|| JavaScriptFormatterConstants.BRACE_NEXT_LINE_INDENTED.equals(option);
	}

	public boolean isDoubleIndentingBlock() {
		String option = getDocument().getString(
				JavaScriptFormatterConstants.BRACE_BLOCK);

		return JavaScriptFormatterConstants.BRACE_NEXT_LINE_INDENTED.equals(option);
	}

	protected boolean insertSpaceAfterLP() {
		// TODO Auto-generated method stub
		return true;
	}

	protected boolean insertSpaceBeforeLP() {
		// TODO Auto-generated method stub
		return true;
	}

	protected boolean insertSpaceBeforeRP() {
		// TODO Auto-generated method stub
		return true;
	}

}
