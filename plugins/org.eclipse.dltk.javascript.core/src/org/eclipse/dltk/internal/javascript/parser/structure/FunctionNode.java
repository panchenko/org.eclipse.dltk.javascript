package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.javascript.typeinfo.model.JSType;

@Structure3
public abstract class FunctionNode extends Scope {

	private final JSType type;

	public FunctionNode(IScope parent, JSType type) {
		super(parent);
		this.type = type;
	}

	public JSType getType() {
		return type;
	}

	protected String argumentsToString() {
		final StringBuilder sb = new StringBuilder();
		for (IStructureNode node : getChildren()) {
			if (node instanceof ArgumentNode) {
				if (sb.length() != 0) {
					sb.append(',');
				}
				final ArgumentNode argument = (ArgumentNode) node;
				sb.append(argument.getName());
				if (argument.getType() != null) {
					sb.append(':');
					sb.append(argument.getType().getName());
				}
			}
		}
		return sb.toString();
	}

}
