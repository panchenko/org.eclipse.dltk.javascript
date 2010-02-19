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
package org.eclipse.dltk.internal.javascript.ti;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.javascript.ast.Script;

public class TypeInferencer2 {

	private final TypeInferencerVisitor visitor = new TypeInferencerVisitor();

	public void doInferencing(Script script) {
		visitor.initialize();
		visitor.visit(script);
	}

	public IValueReference evaluate(ASTNode node) {
		visitor.initialize();
		return visitor.visit(node);
	}

	public IValueCollection getCollection() {
		return visitor.getCollection();
	}

}
