package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

@Structure3
public class FunctionDeclaration extends FunctionNode implements IDeclaration {

	private final String name;

	public FunctionDeclaration(IScope parent, FunctionStatement function,
			JSType type) {
		super(parent, type);
		this.name = function.getFunctionName();
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append('(');
		sb.append(argumentsToString());
		sb.append(")");
		if (getType() != null) {
			sb.append(':');
			sb.append(getType().getName());
		}
		sb.append(" function");
		return sb.toString();
	}

}
