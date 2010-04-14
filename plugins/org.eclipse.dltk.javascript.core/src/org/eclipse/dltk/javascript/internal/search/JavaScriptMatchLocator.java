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

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.search.IDLTKSearchScope;
import org.eclipse.dltk.core.search.SearchDocument;
import org.eclipse.dltk.core.search.SearchPattern;
import org.eclipse.dltk.core.search.SearchRequestor;
import org.eclipse.dltk.core.search.matching.IMatchLocator;
import org.eclipse.dltk.core.search.matching.ModuleFactory;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;

public class JavaScriptMatchLocator implements IMatchLocator {

	private IProgressMonitor progressMonitor;
	private SearchRequestor requestor;

	private IDLTKSearchScope scope;

	public void initialize(SearchPattern pattern, IDLTKSearchScope scope) {
		// TODO Auto-generated method stub

		this.scope = scope;
	}

	public void locateMatches(SearchDocument[] searchDocuments)
			throws CoreException {
		Assert.isNotNull(requestor);
		final ModuleFactory moduleFactory = new ModuleFactory(scope);
		final TypeInferencer2 inferencer2 = new TypeInferencer2();
		inferencer2.setVisitor(new JavaScriptMatchingVisitor(inferencer2));
		for (SearchDocument document : searchDocuments) {
			ISourceModule module = moduleFactory.create(document);
			if (module == null)
				continue;
			inferencer2.setModelElement(module);

		}
	}

	public void setProgressMonitor(IProgressMonitor progressMonitor) {
		this.progressMonitor = progressMonitor;
	}

	public void setRequestor(SearchRequestor requestor) {
		this.requestor = requestor;
	}

}
