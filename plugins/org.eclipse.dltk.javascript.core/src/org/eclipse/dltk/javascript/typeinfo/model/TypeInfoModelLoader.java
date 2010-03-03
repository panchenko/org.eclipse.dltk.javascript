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
package org.eclipse.dltk.javascript.typeinfo.model;

import java.io.IOException;

import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class TypeInfoModelLoader {

	private static TypeInfoModelLoader instance = null;

	public synchronized static TypeInfoModelLoader getInstance() {
		if (instance == null) {
			instance = new TypeInfoModelLoader();
		}
		return instance;
	}

	private final Resource resource;

	private TypeInfoModelLoader() {
		resource = loadResources();
	}

	private static Resource loadResources() {
		final URI uri = URI.createPlatformPluginURI("/"
				+ JavaScriptPlugin.PLUGIN_ID
				+ "/resources/native-references.xml", true);
		Resource resource = new XMIResourceImpl(uri);
		try {
			resource.load(null);
		} catch (IOException e) {
			JavaScriptPlugin.error(e);
			if (!resource.isLoaded()) {
				resource.getContents().clear();
			}
		}
		return resource;
	}

	public Type getType(String typeName) {
		for (EObject object : resource.getContents()) {
			if (object instanceof Type) {
				final Type type = (Type) object;
				if (typeName.equals(type.getName())) {
					return type;
				}
			}
		}
		return null;
	}

}
