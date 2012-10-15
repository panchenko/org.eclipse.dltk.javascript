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

import java.util.List;

import org.eclipse.dltk.annotations.Nullable;

public interface IScope extends IParentNode {

	void addChild(IStructureNode child);

	void addNested(IStructureNode node);

	List<IStructureNode> getNested();

	@Nullable
	IDeclaration resolve(String name);

}
