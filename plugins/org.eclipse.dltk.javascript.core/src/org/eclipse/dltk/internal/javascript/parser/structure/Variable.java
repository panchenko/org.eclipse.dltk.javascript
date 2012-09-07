package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.javascript.ast.VariableDeclaration;

public class Variable extends Scope implements IDeclaration {

	private final String name;

	public Variable(VariableDeclaration declaration) {
		this.name = declaration.getVariableName();
	}

}
