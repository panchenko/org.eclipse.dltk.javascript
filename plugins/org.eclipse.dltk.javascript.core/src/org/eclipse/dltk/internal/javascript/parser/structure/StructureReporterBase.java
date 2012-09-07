package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.Stack;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.javascript.ast.AbstractNavigationVisitor;

public class StructureReporterBase extends
		AbstractNavigationVisitor<IStructureNode> {

	private final Stack<IScope> parents = new Stack<IScope>();

	protected void push(IScope declaration) {
		parents.push(declaration);
	}

	protected IScope pop() {
		return parents.pop();
	}

	protected IScope peek() {
		return parents.peek();
	}

	@Override
	public IStructureNode visit(ASTNode node) {
		final IStructureNode result = super.visit(node);
		if (result != null) {
			peek().add(result);
		}
		return result;
	}

}
