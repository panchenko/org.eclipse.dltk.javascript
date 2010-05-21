/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.core.codeassist;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.internal.javascript.ti.ConstantValue;
import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.ReferenceKind;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class SelectionVisitor extends TypeInferencerVisitor {

	private final ASTNode target;
	private IValueReference value;

	public SelectionVisitor(ITypeInferenceContext context, ASTNode target) {
		super(context);
		this.target = target;
	}

	public IValueReference getValue() {
		return value;
	}

	@Override
	public IValueReference visit(ASTNode node) {
		final IValueReference result = super.visit(node);
		if (node == target) {
			value = result;
		}
		return result;
	}

	@Override
	protected IValueReference extractNamedChild(IValueReference parent,
			Expression name) {
		final IValueReference result = super.extractNamedChild(parent, name);
		if (name == target) {
			value = result;
		}
		return result;
	}

	@Override
	protected Type resolveType(org.eclipse.dltk.javascript.ast.Type type) {
		final Type result = super.resolveType(type);
		if (type == target) {
			if (result != null) {
				value = new ConstantValue(result);
				value.setKind(ReferenceKind.TYPE);
			} else {
				value = null;
			}
		}
		return result;
	}

}
