/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
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
		final boolean isField = context.allow(IStructureContext.FIELD);
		if (isField) {
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
		} else {
			requestor.enterLocal(declaration.getIdentifier(),
					variable.getType());
		}
		reportChildrenStructure(requestor, context);
		if (isField) {
			requestor.exitField(declaration.end() - 1);
		} else {
			requestor.exitLocal(declaration.end() - 1);
		}
	}

}
