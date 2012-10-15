package org.eclipse.dltk.javascript.structure;

import java.util.Collections;
import java.util.List;

import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public abstract class StructureNode implements IStructureNode {
	protected final IParentNode parent;

	public StructureNode(IParentNode parent) {
		this.parent = parent;
	}

	public List<? extends IStructureNode> getChildren() {
		return Collections.emptyList();
	}

	public IParentNode getParent() {
		return parent;
	}

	public IScope getScope() {
		return parent.getScope();
	}

	protected String typeToModel(JSType type) {
		return type != null ? type.getName() : null;
	}

	protected void reportChildrenStructure(IStructureRequestor requestor,
			boolean allowDeclarations) {
		for (IStructureNode child : getChildren()) {
			child.reportStructure(requestor, allowDeclarations);
		}
	}

}
