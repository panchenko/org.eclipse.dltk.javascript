package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.core.ISourceNode;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;

@Structure3
public class FunctionExpression extends FunctionNode {

	public FunctionExpression(IParentNode parent, FunctionStatement function,
			IMethod method) {
		super(parent, function, method);
	}

	@Override
	protected String getName() {
		// TODO Auto-generated method stub
		return "<anonymous>";
	}

	@Override
	protected ISourceNode getNameNode() {
		// TODO Auto-generated method stub
		return function.getFunctionKeyword();
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
