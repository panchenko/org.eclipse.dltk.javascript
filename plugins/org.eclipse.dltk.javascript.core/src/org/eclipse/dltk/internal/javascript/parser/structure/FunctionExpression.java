package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.javascript.typeinfo.model.JSType;

@Structure3
public class FunctionExpression extends FunctionNode {

	public FunctionExpression(IScope parent, JSType type) {
		super(parent, type);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("<function(");
		sb.append(argumentsToString());
		sb.append(")");
		if (getType() != null) {
			sb.append(':');
			sb.append(getType().getName());
		}
		sb.append('>');
		return sb.toString();
	}

}
