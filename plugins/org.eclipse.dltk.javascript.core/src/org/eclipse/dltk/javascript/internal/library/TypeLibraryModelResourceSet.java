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
package org.eclipse.dltk.javascript.internal.library;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.dltk.javascript.typeinfo.TypeInfoManager;
import org.eclipse.dltk.javascript.typeinfo.TypeLibraryFormat;
import org.eclipse.dltk.javascript.typeinfo.TypeLibraryManager;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelResourceSet;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.xmi.XMIResource;

import com.google.common.io.Closeables;

public class TypeLibraryModelResourceSet extends TypeInfoModelResourceSet {

	@Override
	protected Type resolveType(String typeName) {
		Type type = super.resolveType(typeName);
		if (type == null) {
			type = TypeInfoModelLoader.getInstance().getType(typeName, true);
		}
		return type;
	}

	@Override
	public Resource createResource(URI uri, String contentType) {
		final XMIResource resource = TypeInfoManager.newResource(uri);
		getResources().add(resource);
		return resource;
	}

	@Override
	protected void demandLoadHelper(Resource resource) {
		final URI uri = resource.getURI();
		if (uri.isFile()
				&& TypeLibraryFormat.FILE_EXTENSION.equals(uri.fileExtension())) {
			final InputStream inputStream;
			try {
				inputStream = TypeLibraryManager.getManager().openEntry(
						new File(uri.toFileString()),
						TypeLibraryFormat.TYPES_FILE);
			} catch (IOException e) {
				handleDemandLoadException(resource, e);
				return;
			}
			try {
				resource.load(inputStream, null);
			} catch (IOException e) {
				handleDemandLoadException(resource, e);
			} finally {
				Closeables.closeQuietly(inputStream);
			}
		} else {
			super.demandLoadHelper(resource);
		}
		configureLoadedResource(resource);
	}

	protected void configureLoadedResource(Resource resource) {
		resource.eAdapters().add(new ModificationListener());
	}

	protected static class ModificationListener extends EContentAdapter {
		@Override
		public void notifyChanged(Notification notification) {
			if (!notification.isTouch()) {
				throw new UnsupportedOperationException(notification.toString());
			}
		}
	}
}
