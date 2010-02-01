/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.reference.resolvers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;

public class ResolverManager {

	static private IResolverFactory[] registered;

	static {
		IConfigurationElement[] elements = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(
						"org.eclipse.dltk.javascript.core.resolver");
		List<IResolverFactory> factories = new ArrayList<IResolverFactory>();
		for (IConfigurationElement element : elements) {
			try {
				IResolverFactory factory = (IResolverFactory) element
						.createExecutableExtension("class");
				factories.add(factory);
			} catch (Exception e) {
				JavaScriptPlugin.error("Error instantiating IResolverFactory",
						e);
				e.printStackTrace();
			}
		}
		registered = factories.toArray(new IResolverFactory[factories.size()]);
	}

	public static ReferenceResolverContext createResolverContext(
			ISourceModule module, Map<?, ?> settings, boolean skipSourceBased) {
		ReferenceResolverContext cm = new ReferenceResolverContext(module,
				settings);
		if (module != null) {
			for (int a = 0; a < registered.length; a++) {
				IReferenceResolver create = registered[a].create();
				if (create instanceof SourceBasedResolver) {
					if (!skipSourceBased) {
						cm.resolvers.add(0, create);
					}
				} else if (create.canResolve(module)) {
					cm.resolvers.add(create);
				}
			}
		}
		return cm;
	}
}
