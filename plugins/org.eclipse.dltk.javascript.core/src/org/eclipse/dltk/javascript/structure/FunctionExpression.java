package org.eclipse.dltk.javascript.structure;

import org.eclipse.dltk.core.ISourceNode;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;

public class FunctionExpression extends FunctionNode {

	public FunctionExpression(IParentNode parent, FunctionStatement function,
			IMethod method) {
		super(parent, function, method);
	}

	@Override
	protected String getName() {
		if (parent instanceof PropertyDeclaration) {
			return ((PropertyDeclaration) parent).getName();
		} else {
			return "<anonymous>";
		}
	}

	@Override
	protected ISourceNode getNameNode() {
		if (parent instanceof PropertyDeclaration) {
			return ((PropertyDeclaration) parent).getNameNode();
		} else {
			return function.getFunctionKeyword();
		}
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
