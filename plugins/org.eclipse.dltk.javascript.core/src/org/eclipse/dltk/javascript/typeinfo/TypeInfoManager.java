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
package org.eclipse.dltk.javascript.typeinfo;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.utils.SimpleExtensionManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class TypeInfoManager {

	private static final String EXT_POINT = JavaScriptPlugin.PLUGIN_ID
			+ ".typeinfo";

	private static final String MODEL_ELEMENT = "model";
	private static final String RESOURCE_ATTR = "resource";
	private static final String URI_ATTR = "uri";
	private static final String BUILDER_ELEMENT = "builder";
	private static final String PROVIDER_ELEMENT = "provider";
	private static final String RESOLVER_ELEMENT = "resolver";
	private static final String CONVERTER_ELEMENT = "converter";
	private static final String EVALUATOR_ELEMENT = "evaluator";
	private static final String NODE_HANDLER_ELEMENT = "nodeHandler";

	private static String trim(String str) {
		if (str != null) {
			str = str.trim();
			if (str.length() == 0) {
				str = null;
			}
		}
		return str;
	}

	private static URI createURI(IConfigurationElement element, String resource) {
		return URI.createPlatformPluginURI("/"
				+ element.getContributor().getName() + "/" + resource, true);
	}

	private static IConfigurationElement[] getConfigurationElements() {
		return Platform.getExtensionRegistry().getConfigurationElementsFor(
				EXT_POINT);
	}

	private static final SimpleExtensionManager<IModelBuilder> modelBuilderManager = new SimpleExtensionManager<IModelBuilder>(
			IModelBuilder.class, EXT_POINT) {
		@Override
		protected IModelBuilder createInstance(IConfigurationElement element) {
			if (BUILDER_ELEMENT.equals(element.getName())) {
				return super.createInstance(element);
			} else {
				return null;
			}
		}
	};

	private static final SimpleExtensionManager<ITypeProvider> providerManager = new SimpleExtensionManager<ITypeProvider>(
			ITypeProvider.class, EXT_POINT) {
		@Override
		protected ITypeProvider createInstance(IConfigurationElement element) {
			if (PROVIDER_ELEMENT.equals(element.getName())) {
				return super.createInstance(element);
			} else {
				return null;
			}
		}
	};

	private static final SimpleExtensionManager<IElementResolver> resolverManager = new SimpleExtensionManager<IElementResolver>(
			IElementResolver.class, EXT_POINT) {
		@Override
		protected IElementResolver createInstance(IConfigurationElement element) {
			if (RESOLVER_ELEMENT.equals(element.getName())) {
				return super.createInstance(element);
			} else {
				return null;
			}
		}
	};

	private static final SimpleExtensionManager<IElementConverter> converterManager = new SimpleExtensionManager<IElementConverter>(
			IElementConverter.class, EXT_POINT) {
		@Override
		protected IElementConverter createInstance(IConfigurationElement element) {
			if (CONVERTER_ELEMENT.equals(element.getName())) {
				return super.createInstance(element);
			} else {
				return null;
			}
		}
	};

	private static final SimpleExtensionManager<IMemberEvaluator> evaluatorManager = new SimpleExtensionManager<IMemberEvaluator>(
			IMemberEvaluator.class, EXT_POINT) {
		@Override
		protected IMemberEvaluator createInstance(IConfigurationElement element) {
			if (EVALUATOR_ELEMENT.equals(element.getName())) {
				return super.createInstance(element);
			} else {
				return null;
			}
		}
	};

	private static final SimpleExtensionManager<ITypeInferenceHandlerFactory> nodeHandlerManager = new SimpleExtensionManager<ITypeInferenceHandlerFactory>(
			ITypeInferenceHandlerFactory.class, EXT_POINT) {
		@Override
		protected ITypeInferenceHandlerFactory createInstance(
				IConfigurationElement element) {
			if (NODE_HANDLER_ELEMENT.equals(element.getName())) {
				return super.createInstance(element);
			} else {
				return null;
			}
		}
	};

	public static IModelBuilder[] getModelBuilders() {
		return modelBuilderManager.getInstances();
	}

	public static ITypeProvider[] getTypeProviders() {
		return providerManager.getInstances();
	}

	public static IElementResolver[] getElementResolvers() {
		return resolverManager.getInstances();
	}

	public static IElementConverter[] getElementConverters() {
		return converterManager.getInstances();
	}

	public static IMemberEvaluator[] getMemberEvaluators() {
		return evaluatorManager.getInstances();
	}

	public static ITypeInferenceHandlerFactory[] getNodeHandlerFactories() {
		return nodeHandlerManager.getInstances();
	}

	public static ResourceSet loadModelResources() {
		final ResourceSet resourceSet = new ResourceSetImpl();
		for (IConfigurationElement element : getConfigurationElements()) {
			if (MODEL_ELEMENT.equals(element.getName())) {
				final String resource = trim(element
						.getAttribute(RESOURCE_ATTR));
				final String uri = trim(element.getAttribute(URI_ATTR));
				try {
					if (uri != null) {
						if (resource != null) {
							resourceSet
									.getURIConverter()
									.getURIMap()
									.put(URI.createURI(uri),
											createURI(element, resource));
							resourceSet.getResources().add(
									new XMIResourceImpl(URI.createURI(uri)));
						}
					} else if (resource != null) {
						resourceSet.getResources().add(
								new XMIResourceImpl(
										createURI(element, resource)));
					}
				} catch (IllegalArgumentException e) {
					JavaScriptPlugin.error(e);
				}
			}
		}
		/*
		 * iterate over copy, as it's possible that additional resources would
		 * appear while loading
		 */
		for (Resource r : new ArrayList<Resource>(resourceSet.getResources())) {
			if (!r.isLoaded()) {
				try {
					r.load(null);
				} catch (IOException e) {
					JavaScriptPlugin.error("Error loading " + r.getURI(), e);
					if (!r.isLoaded()) {
						r.getContents().clear();
					}
				}
			}
		}
		return resourceSet;
	}

}
