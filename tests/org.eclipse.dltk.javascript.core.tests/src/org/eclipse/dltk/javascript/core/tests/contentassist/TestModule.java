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
package org.eclipse.dltk.javascript.core.tests.contentassist;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.Path;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.compiler.util.Util;
import org.eclipse.dltk.core.IModelElement;

class TestModule implements IModuleSource {

	final String content;
	final String elementName;

	public TestModule(String string) {
		this.content = string;
		this.elementName = "noname.js";
	}

	public TestModule(URL resource) {
		try {
			this.elementName = new Path(resource.getPath()).lastSegment();
			this.content = new String(Util.getInputStreamAsCharArray(resource
					.openStream(), -1, "UTF-8"));
		} catch (IOException e) {
			throw new IllegalArgumentException();
		}
	}

	public IModelElement getModelElement() {
		return null;
	}

	public String getSourceContents() {
		return content;
	}

	public char[] getContentsAsCharArray() {
		return content.toCharArray();
	}

	public String getFileName() {
		return elementName;
	}

}
