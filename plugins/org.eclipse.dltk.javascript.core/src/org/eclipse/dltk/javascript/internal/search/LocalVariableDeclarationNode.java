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

import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public class LocalVariableDeclarationNode extends
		AbstractMatchingNode<Identifier> {

	final ISourceModule module;
	final JSType declaredType;

	/**
	 * @param node
	 */
	public LocalVariableDeclarationNode(Identifier node, ISourceModule module,
			JSType declaredType) {
		super(node);
		this.module = module;
		this.declaredType = declaredType;
	}

}
