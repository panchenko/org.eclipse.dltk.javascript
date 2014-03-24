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
package org.eclipse.dltk.javascript.typelib.compiler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.eclipse.dltk.javascript.typeinfo.TypeLibraryFormat;
import org.eclipse.emf.ecore.xmi.XMIResource;

import com.google.common.io.Closeables;

public class TypeLibCompilerUtil {

	public static void save(File outputDirectory, Map<String, String> manifest, XMIResource resource) throws IOException {
		outputDirectory.mkdirs();
		final FileOutputStream manifestStream = new FileOutputStream(new File(outputDirectory, TypeLibraryFormat.MANIFEST_FILE));
		try {
			final Properties properties = new Properties();
			properties.putAll(manifest);
			properties.store(manifestStream, null);
		} finally {
			Closeables.closeQuietly(manifestStream);
		}
		final FileOutputStream resourceStream = new FileOutputStream(new File(outputDirectory, TypeLibraryFormat.TYPES_FILE));
		try {
			resource.save(resourceStream, null);
		} finally {
			Closeables.closeQuietly(resourceStream);
		}
	}
}
