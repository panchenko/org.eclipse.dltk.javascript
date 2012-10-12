package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.Collections;
import java.util.List;

import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

@Structure3
public class PropertyDeclaration extends ParentNode implements IDeclaration {

	private final String name;
	private IStructureNode value;

	public PropertyDeclaration(IParentNode parent, String name) {
		super(parent);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public JSType getType() {
		if (value instanceof IDeclaration) {
			return ((IDeclaration) value).getType();
		} else {
			return null;
		}
	}

	public IStructureNode getValue() {
		return value;
	}

	public void setValue(IStructureNode value) {
		this.value = value;
	}

	public List<IStructureNode> getChildren() {
		return value != null ? Collections.singletonList(value) : Collections
				.<IStructureNode> emptyList();
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(":");
		if (value != null) {
			sb.append(value);
		} else {
			sb.append("<property?>");
		}
		return sb.toString();
	}

	public void reportStructure(ISourceElementRequestor requestor,
			boolean allowDeclarations) {
		if (allowDeclarations) {

		}
		// TODO Auto-generated method stub

	}

}
