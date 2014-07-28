/*******************************************************************************
 * Copyright (c) 2014 Alex Panchenko
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Alex Panchenko - initial API and Implementation
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinfo;

import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.osgi.framework.Version;

import com.google.common.collect.ImmutableMap;

/**
 * @since 5.1
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface TypeLibrary {
	public enum Kind {
		BUILTIN, USER
	}

	public String name();

	public Version version();

	public Kind kind();

	public File getFile();

	public IPath getPath();

	ImmutableMap<String, String> attributes();
}
