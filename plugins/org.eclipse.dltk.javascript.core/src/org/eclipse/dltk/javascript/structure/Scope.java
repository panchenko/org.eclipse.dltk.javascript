package org.eclipse.dltk.javascript.structure;

import java.util.ArrayList;
import java.util.List;

public abstract class Scope extends ParentNode implements IScope {

	public Scope(IParentNode parent) {
		super(parent);
	}

	@Override
	public IScope getScope() {
		return this;
	}

	public boolean isStructureKnown() {
		return false;
	}

	private final List<IStructureNode> children = new ArrayList<IStructureNode>();

	public void addChild(IStructureNode child) {
		assert child != null;
		children.add(child);
	}

	@Override
	public List<? extends IStructureNode> getChildren() {
		return children;
	}

	@Override
	public boolean isManyChildren() {
		return true;
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
		return parent != null ? parent.getScope().resolve(name) : null;
	}

	public void reportStructure(IStructureRequestor requestor,
			boolean allowDeclarations) {
		reportChildrenStructure(requestor, allowDeclarations);
	}

}
