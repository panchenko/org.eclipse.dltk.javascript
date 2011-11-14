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
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.dltk.annotations.ConfigurationElement;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.utils.LazyExtensionManager;
import org.eclipse.dltk.utils.LazyExtensionManager.Descriptor;
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
	private static final String PROVIDER_ELEMENT = "provider";

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

	private static class ExtManager<E> extends SimpleExtensionManager<E> {

		private final String elementName;

		ExtManager(Class<E> elementType) {
			super(elementType, EXT_POINT);
			this.elementName = elementType.getAnnotation(
					ConfigurationElement.class).value();
		}

		@Override
		protected E createInstance(IConfigurationElement element) {
			if (elementName.equals(element.getName())) {
				return super.createInstance(element);
			} else {
				return null;
			}
		}

	}

	public static <E> SimpleExtensionManager<E> createManager(
			Class<E> elementType) {
		return new ExtManager<E>(elementType);
	}

	private static final SimpleExtensionManager<IModelBuilder> modelBuilderManager = createManager(IModelBuilder.class);

	private static final LazyExtensionManager<ITypeProvider> providerManager = new LazyExtensionManager<ITypeProvider>(
			EXT_POINT) {

		class TypeProviderDescriptor extends Descriptor<ITypeProvider> {

			public TypeProviderDescriptor(
					LazyExtensionManager<ITypeProvider> manager,
					IConfigurationElement configurationElement) {
				super(manager, configurationElement);
			}

			public ITypeProvider get() {
				return create();
			}

		}

		protected boolean isValidElement(IConfigurationElement element) {
			return PROVIDER_ELEMENT.equals(element.getName());
		}

		protected LazyExtensionManager.Descriptor<ITypeProvider> createDescriptor(
				IConfigurationElement element) {
			return new TypeProviderDescriptor(this, element);
		}
	};

	private static final SimpleExtensionManager<IElementResolver> resolverManager = createManager(IElementResolver.class);

	private static final SimpleExtensionManager<IElementConverter> converterManager = createManager(IElementConverter.class);

	private static final SimpleExtensionManager<IMemberEvaluator> evaluatorManager = createManager(IMemberEvaluator.class);

	private static final SimpleExtensionManager<ITypeInferenceHandlerFactory> nodeHandlerManager = createManager(ITypeInferenceHandlerFactory.class);

	private static final SimpleExtensionManager<IRTypeFactory> typeFactoryManager = createManager(IRTypeFactory.class);

	static class ModelBuilderRec {
		IModelBuilder builder;
		int priority;
	}

	/**
	 * Return contributed {@link IModelBuilder}s matching to the specified
	 * context. If context is <code>null</code> all model builders are returned.
	 * 
	 * @param context
	 * @return
	 */
	public static IModelBuilder[] getModelBuilders(ITypeInfoContext context) {
		final IModelBuilder[] all = modelBuilderManager.getInstances();
		if (context == null) {
			return all;
		}
		final Map<String, ModelBuilderRec> recs = new HashMap<String, ModelBuilderRec>();
		for (IModelBuilder builder : all) {
			final int priority = builder.priorityFor(context);
			if (priority == IModelBuilder.PRIORITY_UNSUPPORTED) {
				continue;
			}
			String featureId = builder.getFeatureId();
			ModelBuilderRec rec = recs.get(featureId);
			if (rec != null) {
				if (priority > rec.priority) {
					rec.priority = priority;
					rec.builder = builder;
				}
			} else {
				rec = new ModelBuilderRec();
				rec.builder = builder;
				rec.priority = priority;
				recs.put(featureId, rec);
			}
		}
		final IModelBuilder[] result = new IModelBuilder[recs.size()];
		int index = 0;
		for (ModelBuilderRec rec : recs.values()) {
			result[index++] = rec.builder;
		}
		return result;
	}

	public static ITypeProvider[] createTypeProviders(ITypeInfoContext context) {
		final Descriptor<ITypeProvider>[] descriptors = providerManager
				.getDescriptors();
		final ITypeProvider[] providers = new ITypeProvider[descriptors.length];
		int index = 0;
		for (Descriptor<ITypeProvider> descriptor : descriptors) {
			final ITypeProvider provider = descriptor.get();
			if (provider != null && provider.initialize(context)) {
				providers[index++] = provider;
			}
		}
		if (index != providers.length) {
			final ITypeProvider[] result = new ITypeProvider[index];
			System.arraycopy(providers, 0, result, 0, index);
			return result;
		}
		return providers;
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

	public static IRTypeFactory[] getRTypeFactories() {
		return typeFactoryManager.getInstances();
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
									createResource(URI.createURI(uri)));
						}
					} else if (resource != null) {
						resourceSet.getResources().add(
								createResource(createURI(element, resource)));
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

	private static Resource createResource(URI uri) {
		return new XMIResourceImpl(uri);
	}

}
