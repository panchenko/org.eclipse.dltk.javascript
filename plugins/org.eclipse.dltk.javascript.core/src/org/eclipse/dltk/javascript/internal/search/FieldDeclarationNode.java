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

import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class FieldDeclarationNode extends AbstractMatchingNode<Identifier> {

	final Type declaredType;

	/**
	 * @param node
	 */
	public FieldDeclarationNode(Identifier node, Type declaredType) {
		super(node);
		this.declaredType = declaredType;
	}

}
