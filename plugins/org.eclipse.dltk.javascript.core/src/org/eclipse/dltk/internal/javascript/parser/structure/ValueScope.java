package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.Collections;
import java.util.List;

import org.eclipse.dltk.javascript.ast.Identifier;

@Structure3
public class ValueScope extends StructureNode implements IScope {

	public ValueScope(IScope parent) {
		super(parent);
	}

	public void addChild(IStructureNode child) {
	}

	public void addNested(IStructureNode node) {
	}

	public List<IStructureNode> getNested() {
		return Collections.emptyList();
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
