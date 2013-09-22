/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.core;

import java.io.File;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;
import org.eclipse.dltk.core.AbstractLanguageToolkit;
import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.core.environment.IFileHandle;

public class JavaScriptLanguageToolkit extends AbstractLanguageToolkit {
	public static class Factory implements IExecutableExtensionFactory {
		public Object create() throws CoreException {
			return getDefault();
		}
	}

	private static final JavaScriptLanguageToolkit sInstance = new JavaScriptLanguageToolkit();

	public JavaScriptLanguageToolkit() {
	}

	@Override
	public boolean languageSupportZIPBuildpath() {
		return false;
	}

	public String getNatureId() {
		return JavaScriptNature.NATURE_ID;
	}

	public static IDLTKLanguageToolkit getDefault() {
		return sInstance;
	}

	public String getLanguageName() {
		return "Javascript";
	}

	public String getLanguageContentType() {
		return "org.eclipse.dltk.javascriptContentType";
	}

	@Override
	public boolean canValidateContent(IResource resource) {
		return false;
	}

	@Override
	public boolean canValidateContent(File file) {
		return false;
	}

	@Override
	public boolean canValidateContent(IFileHandle file) {
		return false;
	}

	@Override
	public String getPreferenceQualifier() {
		return JavaScriptPlugin.PLUGIN_ID;
	}

}
