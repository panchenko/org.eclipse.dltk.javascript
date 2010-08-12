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
package org.eclipse.dltk.javascript.jdt.integration.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.javascript.jdt.integration.JavaReferenceFakeField;
import org.eclipse.dltk.ui.IOpenDelegate;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;

public class JavaEditorAdapter implements IOpenDelegate {

	public boolean supports(Object object) {
		return object instanceof JavaReferenceFakeField;
	}

	public String getName(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	public IEditorPart openInEditor(Object object, boolean activate) throws PartInitException, CoreException {
		return JavaUI.openInEditor(
				((JavaReferenceFakeField) object).getJavaElement(), true, true);
	}

}
