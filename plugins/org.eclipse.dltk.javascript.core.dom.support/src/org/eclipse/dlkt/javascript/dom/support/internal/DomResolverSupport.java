package org.eclipse.dlkt.javascript.dom.support.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.dlkt.javascript.dom.support.IDesignTimeDOMProvider;

public class DomResolverSupport {

	private static IDesignTimeDOMProvider[] providers;

	static {
		initProviders();
	}

	private static void initProviders() {
		List<IDesignTimeDOMProvider> providerList = new ArrayList<IDesignTimeDOMProvider>();
		IConfigurationElement[] configurationElements = Platform
				.getExtensionRegistry()
				.getConfigurationElementsFor(
						"org.eclipse.dltk.javascript.core.dom.support.domprovider");
		for (int b = 0; b < configurationElements.length; b++) {
			IConfigurationElement configurationElement = configurationElements[b];
			try {
				Object extension = configurationElement
						.createExecutableExtension("class");
				if (extension instanceof IDesignTimeDOMProvider) {
					providerList.add((IDesignTimeDOMProvider) extension);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		providers = providerList
				.toArray(new IDesignTimeDOMProvider[providerList.size()]);
	}

	public static IDesignTimeDOMProvider[] getProviders() {
		return providers;
	}
}
