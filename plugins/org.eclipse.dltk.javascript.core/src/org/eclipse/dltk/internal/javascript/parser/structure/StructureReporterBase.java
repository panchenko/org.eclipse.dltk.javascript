package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.List;
import java.util.Stack;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.javascript.ast.AbstractNavigationVisitor;
import org.eclipse.dltk.javascript.structure.IParentNode;
import org.eclipse.dltk.javascript.structure.IStructureHandler;
import org.eclipse.dltk.javascript.structure.IStructureNode;
import org.eclipse.dltk.javascript.typeinfo.ReferenceSource;
import org.eclipse.dltk.javascript.typeinfo.TypeInfoManager;

public class StructureReporterBase extends
		AbstractNavigationVisitor<IStructureNode> {

	private final Stack<IParentNode> parents = new Stack<IParentNode>();
	private final IStructureHandler[] handlers;

	public StructureReporterBase(ReferenceSource source) {
		final List<IStructureHandler> extensions = TypeInfoManager
				.createExtensions(source, IStructureHandler.class, this);
		this.handlers = extensions.toArray(new IStructureHandler[extensions
				.size()]);
	}

	protected void push(IParentNode declaration) {
		parents.push(declaration);
	}

	protected IParentNode pop() {
		return parents.pop();
	}

	public IParentNode peek() {
		return parents.peek();
	}

	@Override
	public IStructureNode visit(ASTNode node) {
		for (IStructureHandler handler : handlers) {
			final IStructureNode value = handler.handle(node);
			if (value != IStructureHandler.CONTINUE) {
				if (value != null) {
					if (!parents.isEmpty()) {
						// TODO skip VarDeclaration, PropertyDeclaration
						parents.peek().getScope().addNested(value);
					}
				}
				return value;
			}
		}
		final IStructureNode value = super.visit(node);
		if (value != null) {
			if (!parents.isEmpty()) {
				// TODO skip VarDeclaration, PropertyDeclaration
				parents.peek().getScope().addNested(value);
			}
		}
		return value;
	}

}
