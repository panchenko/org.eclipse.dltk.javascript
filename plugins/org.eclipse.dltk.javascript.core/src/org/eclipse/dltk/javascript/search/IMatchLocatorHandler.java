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
package org.eclipse.dltk.javascript.search;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.javascript.internal.search.JavaScriptMatchLocator;
import org.eclipse.dltk.javascript.typeinfo.ITypeInferenceExtensionFactory;

/**
 * Handler which can be used as plugin for {@link JavaScriptMatchLocator}, it is
 * created by {@link ITypeInferenceExtensionFactory}.
 */
public interface IMatchLocatorHandler {

	/**
	 * The special value to return if next handler should be called
	 */
	public static final IMatchLocatorValue CONTINUE = new IMatchLocatorValue() {
	};

	IMatchLocatorValue handle(ASTNode node);

}
