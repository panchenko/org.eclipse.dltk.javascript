package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.javascript.ast.Identifier;

@Structure3
public abstract class ParentNode extends StructureNode implements IParentNode {

	public ParentNode(IParentNode parent) {
		super(parent);
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

	@Override
	protected void reportChildrenStructure(IStructureRequestor requestor,
			boolean allowDeclarations) {
		super.reportChildrenStructure(requestor, allowDeclarations);
		// TODO (alex) report references
	}

}
