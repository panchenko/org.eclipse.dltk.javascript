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
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.eclipse.dltk.javascript.typeinfo.TypeLibraryFormat;
import org.eclipse.emf.ecore.xmi.XMIResource;

import com.google.common.io.Closeables;

public class TypeLibCompilerUtil {

	public static void save(File output, Map<String, String> manifest, XMIResource resource) throws IOException {
		final FileOutputStream outputStream = new FileOutputStream(output);
		try {
			final ZipOutputStream zip = new ZipOutputStream(outputStream);
			try {
				zip.putNextEntry(new ZipEntry(TypeLibraryFormat.MANIFEST_FILE));
				final Properties properties = new Properties();
				properties.putAll(manifest);
				properties.store(zip, null);
				zip.putNextEntry(new ZipEntry(TypeLibraryFormat.TYPES_FILE));
				resource.save(zip, null);
			} finally {
				Closeables.closeQuietly(zip);
			}
		} finally {
			Closeables.closeQuietly(outputStream);
		}
	}
}
