package org.eclipse.dltk.internal.javascript.parser.structure;

public class FunctionExpression extends Scope {

	public FunctionExpression(IScope parent) {
		super(parent);
	}

	@Override
	public String toString() {
		return "<function>";
	}

}
