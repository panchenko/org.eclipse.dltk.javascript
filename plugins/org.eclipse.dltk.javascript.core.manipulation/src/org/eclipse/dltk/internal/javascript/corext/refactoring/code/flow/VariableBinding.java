package org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow;

import org.eclipse.dltk.javascript.core.dom.Identifier;

public class VariableBinding {
	private String name;
	private int variableId;
	private Identifier declaration;
	private String type;
	public VariableBinding(String name, int variableId, Identifier declaration, String type) {
		this.name = name;
		this.variableId = variableId;
		this.declaration = declaration;
		this.type = type;
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
	public String getTypeName() {
		return type;
	}
}
