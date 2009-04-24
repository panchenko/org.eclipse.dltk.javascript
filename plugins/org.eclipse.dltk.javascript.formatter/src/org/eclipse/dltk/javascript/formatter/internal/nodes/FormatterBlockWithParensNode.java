package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterNode;
import org.eclipse.dltk.formatter.IFormatterTextNode;

public abstract class FormatterBlockWithParensNode extends
		FormatterBlockWithBeginNode {

	private IFormatterTextNode keyword;
	private IFormatterNode LP;
	private IFormatterNode expression;
	private IFormatterNode RP;
	private IFormatterNode statement;

	public FormatterBlockWithParensNode(IFormatterDocument document) {
		super(document);
	}

	public IFormatterTextNode getKeyword() {
		return keyword;
	}

	public void setKeyword(IFormatterTextNode keyword) {
		this.keyword = keyword;
		this.setBegin(keyword);
	}

	public IFormatterNode getExpression() {
		return expression;
	}

	public void setExpression(IFormatterNode expression) {
		this.expression = expression;
	}

	public IFormatterNode getStatement() {
		return statement;
	}

	public void setStatement(IFormatterNode statement) {
		this.statement = statement;
	}

	public IFormatterNode getLP() {
		return LP;
	}

	public void setLP(IFormatterNode LP) {
		this.LP = LP;
		getBody().add(LP);
	}

	public IFormatterNode getRP() {
		return RP;
	}

	public void setRP(IFormatterNode RP) {
		this.RP = RP;
		getBody().add(RP);
	}

	protected abstract boolean insertSpaceBeforeLP();

	protected abstract boolean insertSpaceAfterLP();

	protected abstract boolean insertSpaceBeforeRP();

	protected abstract boolean insertNewLineAfterRP();

}
