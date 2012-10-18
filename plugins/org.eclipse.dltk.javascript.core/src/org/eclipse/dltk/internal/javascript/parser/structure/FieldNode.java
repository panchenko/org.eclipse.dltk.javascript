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
package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.Collections;
import java.util.List;

import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.structure.IDeclaration;
import org.eclipse.dltk.javascript.structure.IParentNode;
import org.eclipse.dltk.javascript.structure.IStructureContext;
import org.eclipse.dltk.javascript.structure.IStructureNode;
import org.eclipse.dltk.javascript.structure.IStructureRequestor;
import org.eclipse.dltk.javascript.structure.ParentNode;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public class FieldNode extends ParentNode implements IDeclaration {

	private final Expression node;
	private final String name;
	private final ReferenceLocation location;
	private IStructureNode value;

	public FieldNode(IParentNode parent, Expression node, String name,
			ReferenceLocation location) {
		super(parent);
		this.node = node;
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public JSType getType() {
		return null;
	}

	public ReferenceLocation getLocation() {
		return location;
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
		sb.append("this.");
		sb.append(getName());
		sb.append(":field");
		if (value != null) {
			sb.append("=");
			sb.append(value);
		}
		return sb.toString();
	}

	public void reportStructure(IStructureRequestor requestor,
			IStructureContext context) {
		final FieldInfo info = new FieldInfo();
		info.declarationStart = location.getDeclarationStart();
		info.name = getName();
		info.nameSourceStart = location.getNameStart();
		info.nameSourceEnd = location.getNameEnd() - 1;
		// info.type = typeToModel(variable.getType());
		// if (variable.isDeprecated()) {
		// info.modifiers |= JSModifiers.DEPRECATED;
		// }
		requestor.enterField(info, node, null, true);
		reportChildrenStructure(requestor, context);
		requestor.exitField(location.getDeclarationEnd() - 1);
	}

}
