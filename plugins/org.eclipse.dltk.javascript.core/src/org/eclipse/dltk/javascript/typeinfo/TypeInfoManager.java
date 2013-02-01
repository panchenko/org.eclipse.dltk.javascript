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

import static java.util.Collections.unmodifiableList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.dltk.annotations.ConfigurationElement;
import org.eclipse.dltk.annotations.Nullable;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.javascript.typeinfo.model.NamedElement;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelResourceSet;
import org.eclipse.dltk.javascript.typeinfo.model.TypeVariable;
import org.eclipse.dltk.utils.LazyExtensionManager;
import org.eclipse.dltk.utils.LazyExtensionManager.Descriptor;
import org.eclipse.dltk.utils.SimpleExtensionManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.osgi.util.NLS;

public class TypeInfoManager {

	public static final String EXT_POINT = JavaScriptPlugin.PLUGIN_ID
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

			@Override
			public ITypeProvider get() {
				return create();
			}

		}

		@Override
		protected boolean isValidElement(IConfigurationElement element) {
			return PROVIDER_ELEMENT.equals(element.getName());
		}

		@Override
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

	/**
	 * Creates extensions of the specified type for the specified context.
	 * 
	 * @param context
	 *            can be adapted to {@link ITypeInfoContext} or
	 *            {@link ReferenceSource}
	 * @param extensionClass
	 *            extension type, see {@link ITypeInferenceExtensionFactory} for
	 *            the list of supported extensions.
	 * @param arg
	 *            extension specific parameter, can be <code>null</code>
	 * @see ITypeInferenceExtensionFactory
	 */
	@SuppressWarnings("unchecked")
	public static <E> List<E> createExtensions(IAdaptable context,
			Class<E> extensionClass, Object arg) {
		final List<E> extensions = new ArrayList<E>();
		for (ITypeInferenceHandlerFactory factory : TypeInfoManager
				.getNodeHandlerFactories()) {
			if (factory instanceof ITypeInferenceExtensionFactory) {
				final Object extension = ((ITypeInferenceExtensionFactory) factory)
						.createExtension(context, extensionClass, arg);
				if (extension != null && extensionClass.isInstance(extension)) {
					extensions.add((E) extension);
				}
			}
		}
		return extensions;
	}

	public static IRTypeFactory[] getRTypeFactories() {
		return typeFactoryManager.getInstances();
	}

	public static TypeInfoModelResourceSet loadModelResources() {
		final TypeInfoModelResourceSet resourceSet = new TypeInfoModelResourceSet();
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
									newResource(URI.createURI(uri)));
						}
					} else if (resource != null) {
						resourceSet.getResources().add(
								newResource(createURI(element, resource)));
					}
				} catch (IllegalArgumentException e) {
					JavaScriptPlugin.error(e);
				}
			}
		}
		/*
		 * iterate over copy, as it's possible that additional resources will
		 * appear while loading.
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

	public static XMIResource newResource() {
		return new TypeInfoXMIResource();
	}

	public static XMIResource newResource(URI uri) {
		return new TypeInfoXMIResource(uri);
	}

	/**
	 * Resource implementation which provides human readable fragments for
	 * {@link TypeVariable} references.
	 */
	public static class TypeInfoXMIResource extends XMIResourceImpl {

		public TypeInfoXMIResource() {
			super();
		}

		public TypeInfoXMIResource(URI uri) {
			super(uri);
		}

		@Override
		public EObject getEObject(String uriFragment) {
			if (uriFragment.startsWith(ROOT)
					&& uriFragment.length() > ROOT.length()
					&& uriFragment.charAt(ROOT.length()) == '/') {
				final StringTokenizer tokenizer = new StringTokenizer(
						uriFragment.substring(ROOT.length() + 1), "/");
				Object obj = this;
				TOKENS: while (tokenizer.hasMoreTokens()) {
					final String name = URI.decode(tokenizer.nextToken());
					List<EObject> children = obj instanceof Resource ? ((Resource) obj)
							.getContents() : ((EObject) obj).eContents();
					for (EObject child : children) {
						if (child instanceof NamedElement) {
							if (name.equals(((NamedElement) child).getName())) {
								obj = child;
								continue TOKENS;
							}
						}
					}
					return super.getEObject(uriFragment);
				}
				return (EObject) obj;
			}
			return super.getEObject(uriFragment);
		}

		private static final String ROOT = "@ROOT";

		@Override
		public String getURIFragment(final EObject eObject) {
			if (eObject.eContainer() != null) {
				final List<String> path = new ArrayList<String>();
				EObject obj = eObject;
				for (;;) {
					path.add(((NamedElement) obj).getName());
					obj = obj.eContainer();
					if (obj == null) {
						break;
					}
					if (!(obj instanceof NamedElement)) {
						return super.getURIFragment(eObject);
					}
				}
				final StringBuilder sb = new StringBuilder();
				sb.append(ROOT);
				for (int i = path.size() - 1; i >= 0; --i) {
					sb.append('/');
					sb.append(URI.encodeSegment(path.get(i), false));
				}
				return sb.toString();
			}
			return super.getURIFragment(eObject);
		}
	}

	private static final SimpleExtensionManager<MetaType> metaTypeManager = createManager(MetaType.class);

	private static final Set<String> reportedMetaTypeIds = new HashSet<String>();

	public static MetaType getMetaType(String initialValue) {
		if (initialValue != null) {
			for (MetaType metaType : metaTypeManager.getInstances()) {
				if (initialValue.equals(metaType.getId())) {
					return metaType;
				}
			}
			synchronized (reportedMetaTypeIds) {
				if (reportedMetaTypeIds.size() < 16
						&& reportedMetaTypeIds.add(initialValue)) {
					JavaScriptPlugin.error(NLS.bind("MetaType {0} not found",
							initialValue));
				}
			}
		}
		return DefaultMetaType.DEFAULT;
	}

	/**
	 * Returns the unmodifiable list of all the registered {@link MetaType
	 * metatypes}.
	 */
	public static List<MetaType> getMetaTypes() {
		return unmodifiableList(Arrays.asList(metaTypeManager.getInstances()));
	}

	/**
	 * Converts the specified JavaScript model element to {@link IModelElement}
	 * using all the contributed {@link IElementConverter}, returns the
	 * corresponding {@link IModelElement} or <code>null</code>.
	 */
	@Nullable
	public static IModelElement convertElement(ISourceModule module,
			Element element) {
		for (IElementConverter converter : TypeInfoManager
				.getElementConverters()) {
			final IModelElement converted = converter.convert(module, element);
			if (converted != null) {
				return converted;
			}
		}
		return null;
	}
}
