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
package org.eclipse.dltk.internal.javascript.ti;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.javascript.typeinfo.IElementResolver;
import org.eclipse.dltk.javascript.typeinfo.ITypeProvider;
import org.eclipse.dltk.javascript.typeinfo.TypeInfoManager;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class TypeInferencer2 implements ITypeInferenceContext {

	private TypeInferencerVisitor visitor;
	private IModelElement modelElement;

	private void initializeVisitor() {
		if (visitor == null) {
			visitor = new TypeInferencerVisitor(this);
		} else {
			visitor.initialize();
		}
	}

	public void setVisitor(TypeInferencerVisitor visitor) {
		this.visitor = visitor;
	}

	public void setModelElement(IModelElement modelElement) {
		this.modelElement = modelElement;
	}

	public void doInferencing(Script script) {
		try {
			initializeVisitor();
			visitor.visit(script);
		} catch (PositionReachedException e) {
			throw e;
		} catch (RuntimeException e) {
			log(e);
		} catch (AssertionError e) {
			log(e);
		}
	}

	protected void log(Throwable e) {
		JavaScriptPlugin.error(e);
	}

	public IValueReference evaluate(ASTNode node) {
		initializeVisitor();
		return visitor.visit(node);
	}

	public IValueCollection getCollection() {
		return visitor.getCollection();
	}

	private final Map<String, Type> types = new HashMap<String, Type>();

	public Type getType(String typeName) {
		if (typeName == null || typeName.length() == 0) {
			return null;
		}
		final boolean queryProviders = canQueryTypeProviders();
		return getType(typeName, queryProviders, true, !queryProviders, true);
	}

	public Type getKnownType(String typeName) {
		if (typeName == null || typeName.length() == 0) {
			return null;
		}
		final boolean queryProviders = canQueryTypeProviders();
		return getType(typeName, queryProviders, true, !queryProviders, false);
	}

	public Set<String> listTypes(String prefix) {
		Set<String> result = new HashSet<String>();
		Set<String> typeNames = TypeInfoModelLoader.getInstance().listTypes(
				prefix);
		if (typeNames != null) {
			result.addAll(typeNames);
		}
		for (ITypeProvider provider : TypeInfoManager.getTypeProviders()) {
			typeNames = provider.listTypes(this, prefix);
			if (typeNames != null) {
				result.addAll(typeNames);
			}
		}
		return result;
	}

	public IModelElement getModelElement() {
		return modelElement;
	}

	private enum TypeResolveMode {
		SIMPLE, PROXY, UNKNOWN
	}

	private Type getType(String typeName, boolean queryProviders,
			boolean queryPredefined, boolean allowProxy, boolean allowUnknown) {
		Type type = types.get(typeName);
		if (type != null) {
			return type;
		}
		type = loadType(typeName, queryProviders, queryPredefined);
		if (type != null) {
			types.put(typeName, type);
			addToResource(type);
			return type;
		}
		if (allowProxy) {
			type = createProxy(typeName);
			return type;
		}
		if (allowUnknown) {
			type = createUnknown(typeName);
			addToResource(type);
			types.put(typeName, type);
			return type;
		}
		return null;
	}

	private Type createUnknown(String typeName) {
		final Type type = TypeInfoModelFactory.eINSTANCE.createType();
		type.setName(typeName);
		type.setKind(TypeKind.UNKNOWN);
		return type;
	}

	private final Set<String> activeTypeRequests = new HashSet<String>();

	private boolean canQueryTypeProviders() {
		return activeTypeRequests.isEmpty();
	}

	private Type loadType(String typeName, boolean queryProviders,
			boolean queryPredefined) {
		if (queryProviders) {
			if (activeTypeRequests.add(typeName)) {
				try {
					for (ITypeProvider provider : TypeInfoManager
							.getTypeProviders()) {
						final Type type = provider.getType(this, typeName);
						if (type != null && !isProxy(type)) {
							return type;
						}
					}
				} finally {
					activeTypeRequests.remove(typeName);
				}
			}
		}
		if (queryPredefined) {
			final Type type = TypeInfoModelLoader.getInstance().getType(
					typeName);
			if (type != null) {
				return type;
			}
		}
		return null;
	}

	private void addToResource(final Type type) {
		final EObject object = (EObject) type;
		if (object.eResource() == null) {
			if (typesResource == null) {
				typesResource = new ResourceImpl(URI.createGenericURI(
						PROXY_SCHEME, PROXY_OPAQUE_PART, null));
				typeRS.getResources().add(typesResource);
			}
			typesResource.getContents().add(object);
		}
	}

	private static final String PROXY_SCHEME = "proxy";
	private static final String PROXY_OPAQUE_PART = "dltk/javascript/typeinfo/type";

	/**
	 * @param typeName
	 * @return
	 */
	private Type createProxy(String typeName) {
		final Type type = TypeInfoModelFactory.eINSTANCE.createType();
		((InternalEObject) type).eSetProxyURI(URI.createGenericURI(
				PROXY_SCHEME, PROXY_OPAQUE_PART, typeName));
		return type;
	}

	private class TypeResourceSet extends ResourceSetImpl {

		@Override
		public EObject getEObject(URI uri, boolean loadOnDemand) {
			if (PROXY_SCHEME.equals(uri.scheme())
					&& PROXY_OPAQUE_PART.equals(uri.opaquePart())) {
				final Type type = getType(uri.fragment(), true, false, false,
						false);
				if (type == null) {
					return (EObject) createUnknown(uri.fragment());
				} else if (type instanceof EObject) {
					return (EObject) type;
				} else {
					JavaScriptPlugin.error("proxy resolved to "
							+ type.getClass().getName()
							+ " which is not EObject");
					return (EObject) createUnknown(uri.fragment());
				}
			}
			return super.getEObject(uri, loadOnDemand);
		}

	}

	private final ResourceSet typeRS = new TypeResourceSet();

	private Resource typesResource = null;

	private boolean isProxy(Type type) {
		return type instanceof EObject && ((EObject) type).eIsProxy();
	}

	private IValueTypeFactory factory = new ValueTypeFactoryImpl(this);

	public IValueTypeFactory getFactory() {
		return factory;
	}

	private Map<String, Member> elements = new HashMap<String, Member>();

	public Member resolve(String name) {
		if (name == null)
			return null;
		Member element = elements.get(name);
		if (element != null) {
			return element;
		}
		element = TypeInfoModelLoader.getInstance().getMember(name);
		if (element != null) {
			return element;
		}
		for (IElementResolver resolver : TypeInfoManager.getElementResolvers()) {
			element = resolver.resolveElement(this, name);
			if (element != null) {
				elements.put(name, element);
				return element;
			}
		}
		return null;
	}

	public Set<String> listGlobals(String prefix) {
		final Set<String> result = new HashSet<String>();
		for (Member member : TypeInfoModelLoader.getInstance().listMembers(
				prefix)) {
			result.add(member.getName());
		}
		for (IElementResolver resolver : TypeInfoManager.getElementResolvers()) {
			Set<String> globals = resolver.listGlobals(this, prefix);
			if (globals != null) {
				result.addAll(globals);
			}
		}
		return result;
	}

}
