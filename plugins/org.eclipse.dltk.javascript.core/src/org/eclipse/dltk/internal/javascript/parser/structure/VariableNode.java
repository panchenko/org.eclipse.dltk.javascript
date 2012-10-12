package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.Collections;
import java.util.List;

import org.eclipse.dltk.javascript.typeinfo.model.JSType;

@Structure3
public class VariableNode extends StructureNode implements IDeclaration {

	private final String name;
	private final JSType type;
	private IStructureNode value;

	public VariableNode(IScope parent, String name, JSType type) {
		super(parent);
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public JSType getType() {
		return type;
	}

	public IStructureNode getValue() {
		return value;
	}

	public void setValue(IStructureNode value) {
		this.value = value;
	}

	@Override
	public List<IStructureNode> getChildren() {
		return value != null ? Collections.singletonList(value) : Collections
				.<IStructureNode> emptyList();
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(":variable");
		if (value != null) {
			sb.append("=");
			sb.append(value);
		}
		return sb.toString();
	}

}
