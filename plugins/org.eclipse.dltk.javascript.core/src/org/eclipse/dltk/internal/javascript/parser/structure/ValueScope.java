package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.javascript.ast.Identifier;

public class ValueScope extends StructureNode implements IScope {

	public ValueScope(IScope parent) {
		super(parent);
	}

	public void addChild(IStructureNode child) {
		// TODO (alex) implement this and getChildren() ?
	}

	public void addLocalReference(Identifier node, IDeclaration resolved) {
		getParent().addLocalReference(node, resolved);
	}

	public void addMethodReference(String name) {
		getParent().addMethodReference(name);
	}

	public void addFieldReference(String name) {
		getParent().addFieldReference(name);
	}

	public IDeclaration resolve(String name) {
		return getParent().resolve(name);
	}

}
