package org.eclipse.dltk.javascript.structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.dltk.javascript.ast.Identifier;

public abstract class ParentNode extends StructureNode implements IParentNode {

	public ParentNode(IParentNode parent) {
		super(parent);
	}

	static abstract class NodeReference implements IStructureNode {

		final Identifier identifier;

		public NodeReference(Identifier identifier) {
			this.identifier = identifier;
		}

		public int start() {
			return identifier.start();
		}

		public boolean isManyChildren() {
			return false;
		}

		public List<? extends IStructureNode> getChildren() {
			return Collections.emptyList();
		}

		public IParentNode getParent() {
			return null;
		}

		public IScope getScope() {
			return null;
		}

	}

	static class LocalReference extends NodeReference {

		final IDeclaration declaration;

		public LocalReference(Identifier identifier, IDeclaration declaration) {
			super(identifier);
			this.declaration = declaration;
		}

		public void reportStructure(IStructureRequestor requestor,
				IStructureContext context) {
			requestor.acceptLocalReference(identifier, declaration);
		}
	}

	static class FieldReference extends NodeReference {

		public FieldReference(Identifier identifier) {
			super(identifier);
		}

		public void reportStructure(IStructureRequestor requestor,
				IStructureContext context) {
			requestor.acceptFieldReference(identifier);
		}
	}

	static class MethodRefence extends NodeReference {

		final int argCount;

		public MethodRefence(Identifier identifier, int argCount) {
			super(identifier);
			this.argCount = argCount;
		}

		public void reportStructure(IStructureRequestor requestor,
				IStructureContext context) {
			requestor.acceptMethodReference(identifier, argCount);
		}
	}

	private List<NodeReference> references;

	private void addReference(NodeReference reference) {
		if (references == null) {
			references = new ArrayList<NodeReference>();
		}
		references.add(reference);
	}

	public void addLocalReference(Identifier node, IDeclaration resolved) {
		addReference(new LocalReference(node, resolved));
	}

	public void addMethodReference(Identifier identifier, int argCount) {
		addReference(new MethodRefence(identifier, argCount));
	}

	public void addFieldReference(Identifier identifier) {
		addReference(new FieldReference(identifier));
	}

	public boolean isStructureKnown() {
		return true;
	}

	@Override
	protected void reportChildrenStructure(IStructureRequestor requestor,
			IStructureContext context) {
		if (references != null) {
			final List<? extends IStructureNode> children = getChildren();
			final List<IStructureNode> nodes = new ArrayList<IStructureNode>(
					children.size() + references.size());
			nodes.addAll(children);
			nodes.addAll(references);
			Collections.sort(nodes, new Comparator<IStructureNode>() {
				public int compare(IStructureNode o1, IStructureNode o2) {
					return o1.start() - o2.start();
				}
			});
			for (IStructureNode node : nodes) {
				node.reportStructure(requestor, context);
			}
		} else {
			super.reportChildrenStructure(requestor, context);
		}
	}

}
