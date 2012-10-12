package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.javascript.ast.Identifier;

@Structure3
public class ParentNode extends StructureNode implements IParentNode {

	public ParentNode(IParentNode parent) {
		super(parent);
	}

	public void reportStructure(ISourceElementRequestor requestor,
			boolean allowDeclarations) {
		// TODO Auto-generated method stub

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

}
