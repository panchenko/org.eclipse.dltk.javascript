package org.eclipse.dltk.javascript.structure;

import java.util.Collections;
import java.util.List;

import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.core.ISourceNode;
import org.eclipse.dltk.javascript.ast.PropertyInitializer;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public class PropertyDeclaration extends ParentNode implements IDeclaration {

	private final String name;
	private final PropertyInitializer initializer;
	private final ReferenceLocation location;
	private IStructureNode value;

	public PropertyDeclaration(IParentNode parent, String name,
			PropertyInitializer initializer, ReferenceLocation location) {
		super(parent);
		this.name = name;
		this.initializer = initializer;
		this.location = location;
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

	public ReferenceLocation getLocation() {
		return location;
	}

	public IStructureNode getValue() {
		return value;
	}

	public void setValue(IStructureNode value) {
		this.value = value;
	}

	public ISourceNode getNameNode() {
		return initializer.getName();
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

	public void reportStructure(IStructureRequestor requestor,
			boolean allowDeclarations) {
		if (allowDeclarations) {
			if (value instanceof FunctionNode) {
				value.reportStructure(requestor, allowDeclarations);
			} else {
				final FieldInfo info = new FieldInfo();
				info.declarationStart = initializer.start();
				info.name = getName();
				info.nameSourceStart = initializer.getName().start();
				info.nameSourceEnd = initializer.getName().end();
				// info.type = typeToModel(type);
				requestor.enterField(info, initializer.getName(), null);
				reportChildrenStructure(requestor, allowDeclarations);
				requestor.exitField(initializer.end() - 1);
			}
		}
	}

}
