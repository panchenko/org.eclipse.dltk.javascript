package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.javascript.ast.FunctionStatement;

public class FunctionDeclaration extends Scope implements IDeclaration {

	private final String name;

	public FunctionDeclaration(IScope parent, FunctionStatement function) {
		super(parent);
		this.name = function.getFunctionName();
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + ":function";
	}

}
