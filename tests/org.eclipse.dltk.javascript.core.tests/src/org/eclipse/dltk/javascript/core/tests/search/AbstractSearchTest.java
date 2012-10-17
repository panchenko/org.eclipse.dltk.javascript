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
package org.eclipse.dltk.javascript.core.tests.search;

import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.tests.model.AbstractSingleProjectSearchTests;
import org.eclipse.dltk.javascript.core.tests.contentassist.SelectionTests;

public class AbstractSearchTest extends AbstractSingleProjectSearchTests {

	protected AbstractSearchTest(String testPluginName, String testName,
			String scriptProjectName) {
		super(testPluginName, testName, scriptProjectName);
	}

	protected IModelElement[] select(IModuleSource module, int position) {
		return new SelectionTests(null).select(module, position);
	}

	protected IModuleSource getModule(String path) throws ModelException {
		return (IModuleSource) getSourceModule(getProjectName(), "src", path);
	}

}
