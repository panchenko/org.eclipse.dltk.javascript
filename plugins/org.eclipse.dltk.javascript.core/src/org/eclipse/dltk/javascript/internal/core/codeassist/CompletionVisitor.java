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
import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.internal.javascript.ti.IValueCollection;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;

public class CompletionVisitor extends TypeInferencerVisitor {

	private final int position;

	public CompletionVisitor(ITypeInferenceContext context, int position) {
		super(context);
		this.position = position;
	}

	private IValueCollection savedCollection = null;

	@Override
	public IValueReference visit(ASTNode node) {
		final IValueReference result = super.visit(node);
		if (savedCollection == null && node.sourceEnd() > position) {
			savedCollection = peekContext();
		}
		return result;
	}

	@Override
	public IValueCollection getCollection() {
		if (savedCollection != null) {
			return savedCollection;
		}
		return super.getCollection();
	}

}
