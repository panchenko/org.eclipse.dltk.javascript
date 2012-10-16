package org.eclipse.dltk.javascript.structure;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.javascript.ast.Identifier;

public abstract class ParentNode extends StructureNode implements IParentNode {

	public ParentNode(IParentNode parent) {
		super(parent);
	}

	static abstract class NodeReference {

		final Identifier identifier;

		public NodeReference(Identifier identifier) {
			this.identifier = identifier;
		}

		abstract void reportStructure(IStructureRequestor requestor);
	}

	static class LocalReference extends NodeReference {

		final IDeclaration declaration;

		public LocalReference(Identifier identifier, IDeclaration declaration) {
			super(identifier);
			this.declaration = declaration;
		}

		@Override
		void reportStructure(IStructureRequestor requestor) {
			requestor.acceptLocalReference(identifier, declaration);
		}
	}

	static class FieldReference extends NodeReference {

		public FieldReference(Identifier identifier) {
			super(identifier);
		}

		@Override
		void reportStructure(IStructureRequestor requestor) {
			requestor.acceptFieldReference(identifier);
		}
	}

	static class MethodRefence extends NodeReference {

		final int argCount;

		public MethodRefence(Identifier identifier, int argCount) {
			super(identifier);
			this.argCount = argCount;
		}

		@Override
		void reportStructure(IStructureRequestor requestor) {
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
			boolean allowDeclarations) {
		super.reportChildrenStructure(requestor, allowDeclarations);
		if (references != null) {
			for (NodeReference reference : references) {
				reference.reportStructure(requestor);
			}
		}
	}

}
