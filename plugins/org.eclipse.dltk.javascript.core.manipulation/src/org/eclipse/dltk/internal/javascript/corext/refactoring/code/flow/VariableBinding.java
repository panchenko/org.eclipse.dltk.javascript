package org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow;

import org.eclipse.dltk.javascript.core.dom.Identifier;

public class VariableBinding {
	private String name;
	private int variableId;
	private Identifier declaration;
	public VariableBinding(String name, int variableId, Identifier declaration) {
		this.name = name;
		this.variableId = variableId;
		this.declaration = declaration;
	}
	public String getName() {
		return name;
	}
	public int getVariableId() {
		return variableId;
	}
	public Identifier getDeclaration() {
		return declaration;
	}
}
