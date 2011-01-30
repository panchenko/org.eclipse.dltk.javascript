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
package org.eclipse.dltk.javascript.internal.search;

import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;

public class MethodDeclarationNode extends AbstractMatchingNode<Expression> {

	final IMethod method;

	public MethodDeclarationNode(Expression node, IMethod method) {
		super(node);
		this.method = method;
	}

}
