package org.eclipse.dltk.javascript.structure;

import java.util.Collections;
import java.util.List;

import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.internal.javascript.parser.JSModifiers;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IVariable;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public class VariableNode extends ParentNode implements IDeclaration {

	private final IVariable variable;
	private final VariableDeclaration declaration;

	private IStructureNode value;

	public VariableNode(IParentNode parent, VariableDeclaration declaration,
			IVariable variable) {
		super(parent);
		this.declaration = declaration;
		this.variable = variable;
	}

	public String getName() {
		return declaration.getVariableName();
	}

	public JSType getType() {
		return variable.getType();
	}

	public ReferenceLocation getLocation() {
		return variable.getLocation();
	}

	public int start() {
		return getLocation().getDeclarationStart();
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
		sb.append(getName());
		sb.append(":variable");
		if (value != null) {
			sb.append("=");
			sb.append(value);
		}
		return sb.toString();
	}

	public void reportStructure(IStructureRequestor requestor,
			IStructureContext context) {
		final boolean allowed = context.allow(this);
		if (allowed) {
			final FieldInfo info = new FieldInfo();
			info.declarationStart = declaration.start();
			info.name = getName();
			info.nameSourceStart = declaration.getIdentifier().start();
			info.nameSourceEnd = declaration.getIdentifier().end() - 1;
			info.type = typeToModel(variable.getType());
			if (variable.getVisibility() != null) {
				info.modifiers |= variable.getVisibility().getFlags();
			}
			if (variable.isDeprecated()) {
				info.modifiers |= JSModifiers.DEPRECATED;
			}
			requestor.enterField(info, declaration.getIdentifier(),
					variable.getType());
		}
		context.enter(this);
		reportChildrenStructure(requestor, context);
		context.leave(this);
		if (allowed) {
			requestor.exitField(declaration.end() - 1);
		}
	}

}
