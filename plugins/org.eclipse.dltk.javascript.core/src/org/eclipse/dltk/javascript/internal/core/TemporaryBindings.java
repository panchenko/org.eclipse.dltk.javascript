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
package org.eclipse.dltk.javascript.internal.core;

import java.util.Map;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.JSBindings;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;

public class TemporaryBindings extends JSBindings {
	public TemporaryBindings(ITypeSystem typeSystem,
			Map<ASTNode, IValueReference> nodeMap) {
		super(typeSystem, nodeMap);
	}

	@Override
	protected boolean isCacheable() {
		return false;
	}

	public static JSBindings build(TypeInferencer2 inferencer,
			ISourceModule module, Script script) {
		final CollectingVisitor collector = new CollectingVisitor(inferencer);
		inferencer.setModelElement(module);
		inferencer.setVisitor(collector);
		inferencer.doInferencing(script);
		return new TemporaryBindings(inferencer, collector.bindings);
	}
}
