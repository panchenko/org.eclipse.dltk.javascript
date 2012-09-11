package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.ArrayList;
import java.util.List;

public class ObjectDeclaration extends StructureNode {

	public ObjectDeclaration(IScope parent) {
		super(parent);
	}

	private final List<IStructureNode> children = new ArrayList<IStructureNode>();

	public void addChild(PropertyDeclaration propertyDeclaration) {
		children.add(propertyDeclaration);
	}

	@Override
	public List<IStructureNode> getChildren() {
		return children;
	}

	@Override
	public String toString() {
		return "<object>";
	}

}
