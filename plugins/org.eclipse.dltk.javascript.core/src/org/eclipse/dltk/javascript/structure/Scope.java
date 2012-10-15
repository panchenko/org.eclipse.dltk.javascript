package org.eclipse.dltk.javascript.structure;

import java.util.ArrayList;
import java.util.List;

public class Scope extends ParentNode implements IScope {

	public Scope(IParentNode parent) {
		super(parent);
	}

	@Override
	public IScope getScope() {
		return this;
	}

	private final List<IStructureNode> children = new ArrayList<IStructureNode>();

	public void addChild(IStructureNode child) {
		if (!children.contains(child)) {
			children.add(child);
			nested.remove(child);
		}
	}

	private final List<IStructureNode> nested = new ArrayList<IStructureNode>();

	public void addNested(IStructureNode node) {
		if (!children.contains(node) && !nested.contains(node)) {
			nested.add(node);
		}
	}

	public List<IStructureNode> getNested() {
		return nested;
	}

	@Override
	public List<? extends IStructureNode> getChildren() {
		return children;
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

	@Override
	public String toString() {
		return "<Script>";
	}

	public void reportStructure(IStructureRequestor requestor,
			boolean allowDeclarations) {
		reportChildrenStructure(requestor, allowDeclarations);
	}

	@Override
	protected void reportChildrenStructure(IStructureRequestor requestor,
			boolean allowDeclarations) {
		super.reportChildrenStructure(requestor, allowDeclarations);
		for (IStructureNode child : getNested()) {
			child.reportStructure(requestor, false);
		}
	}

}
