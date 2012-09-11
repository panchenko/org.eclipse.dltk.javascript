package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.Collections;
import java.util.List;

public class StructureNode implements IStructureNode {
	protected final IScope parent;

	public StructureNode(IScope parent) {
		this.parent = parent;
	}

	public List<? extends IStructureNode> getChildren() {
		return Collections.emptyList();
	}

	public boolean isScope() {
		return false;
	}

	public IScope getParent() {
		return parent;
	}

}
