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
import org.eclipse.dltk.javascript.ast.Argument;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class ArgumentDeclarationNode extends AbstractMatchingNode<Argument> {

	final ISourceModule module;
	final Type declaredType;

	/**
	 * @param node
	 */
	public ArgumentDeclarationNode(Argument node, ISourceModule module,
			Type declaredType) {
		super(node);
		this.module = module;
		this.declaredType = declaredType;
	}

}
