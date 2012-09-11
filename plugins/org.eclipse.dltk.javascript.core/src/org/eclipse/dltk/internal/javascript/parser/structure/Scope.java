package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.javascript.ast.Identifier;

public class Scope extends StructureNode implements IScope {

	public Scope(IScope parent) {
		super(parent);
	}

	@Override
	public boolean isScope() {
		return true;
	}

	private final List<IStructureNode> children = new ArrayList<IStructureNode>();

	public void addChild(IStructureNode child) {
		children.add(child);
	}

	@Override
	public List<? extends IStructureNode> getChildren() {
		return children;
	}

	public void addLocalReference(Identifier node, IDeclaration resolved) {
		// TODO Auto-generated method stub

	}

	public void addMethodReference(String name) {
		// TODO Auto-generated method stub

	}

	public void addFieldReference(String name) {
		// TODO Auto-generated method stub

	}

	public IDeclaration resolve(String name) {
		for (IStructureNode child : children) {
			if (child instanceof IDeclaration) {
				final IDeclaration declaration = (IDeclaration) child;
				if (name.equals(declaration.getName())) {
					return declaration;
				}
			}
		}
		return parent != null ? parent.resolve(name) : null;
	}

	@Override
	public String toString() {
		return "<Script>";
	}

}
