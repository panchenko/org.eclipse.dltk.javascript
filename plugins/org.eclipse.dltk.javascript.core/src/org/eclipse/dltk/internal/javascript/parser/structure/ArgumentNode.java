package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.javascript.typeinfo.model.JSType;

@Structure3
public class ArgumentNode extends StructureNode implements IDeclaration {

	private final String name;
	private final JSType type;

	public ArgumentNode(IScope parent, String name, JSType type) {
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

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(":argument");
		return sb.toString();
	}

	public void reportStructure(IStructureRequestor requestor,
			boolean allowDeclarations) {
		// empty
	}

}
