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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.javascript.parser.JSProblem;
import org.eclipse.dltk.javascript.parser.JSProblemReporter;
import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinfo.IElementResolver;
import org.eclipse.dltk.javascript.typeinfo.IMemberEvaluator;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.ITypeInfoContext;
import org.eclipse.dltk.javascript.typeinfo.ITypeProvider;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet;
import org.eclipse.dltk.javascript.typeinfo.ReferenceSource;
import org.eclipse.dltk.javascript.typeinfo.TypeInfoManager;
import org.eclipse.dltk.javascript.typeinfo.TypeMode;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.GenericType;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.RType;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.dltk.javascript.typeinfo.model.TypeVariable;
import org.eclipse.dltk.javascript.typeinfo.model.TypeVariableReference;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class TypeInferencer2 implements ITypeInferenceContext {

	private TypeInferencerVisitor visitor;
	private ReferenceSource source;

	private void initializeVisitor() {
		if (visitor == null) {
			visitor = new TypeInferencerVisitor(this);
		}
		visitor.initialize();
	}

	public void setVisitor(TypeInferencerVisitor visitor) {
		this.visitor = visitor;
	}

	public void setModelElement(IModelElement modelElement) {
		setSource(new ReferenceSource(modelElement));
	}

	public void setSource(ReferenceSource source) {
		this.source = source;
	}

	private static final boolean DEBUG = false;

	public void doInferencing(Script script) {
		if (DEBUG)
			System.out.println("Visiting "
					+ source
					+ " with "
					+ (visitor != null ? visitor.getClass().getName()
							: "Default") + " in "
					+ Thread.currentThread().getName());
		final TypeInferencer2 saved = CURRENT.get();
		try {
			CURRENT.set(this);
			elements.clear();
			modelBuilders = null;
			typeProviders = null;
			initializeVisitor();
			visitor.visit(script);
			visitor.done();
			// IValueCollection collection = visitor.getCollection();
			// visitor = null;
			// return collection;
		} catch (PositionReachedException e) {
			// visitor = null;
			throw e;
		} catch (RuntimeException e) {
			log(e);
		} catch (AssertionError e) {
			log(e);
		} finally {
			CURRENT.set(saved);
		}
		// return null;
	}

	protected void log(Throwable e) {
		final JSProblemReporter reporter = visitor.getProblemReporter();
		if (reporter != null) {
			reporter.reportProblem(new JSProblem(e));
		}
		JavaScriptPlugin.error(e);
	}

	public IValueReference evaluate(ASTNode node) {
		initializeVisitor();
		return visitor.visit(node);
	}

	public IValueCollection getCollection() {
		return visitor.getCollection();
	}

	public IValueCollection currentCollection() {
		return visitor.peekContext();
	}

	private final Map<String, Type> types = new ConcurrentHashMap<String, Type>();

	public Type getType(String typeName) {
		if (typeName == null || typeName.length() == 0) {
			return null;
		}
		final boolean queryProviders = canQueryTypeProviders();
		return getType(typeName, null, queryProviders, true, !queryProviders,
				true);
	}

	public SimpleType getTypeRef(String typeName) {
		return TypeUtil.ref(getType(typeName));
	}

	public Type getKnownType(String typeName, TypeMode mode) {
		if (typeName == null || typeName.length() == 0) {
			return null;
		}
		final boolean queryProviders = canQueryTypeProviders();
		return getType(typeName, mode, queryProviders, true, !queryProviders,
				false);
	}

	public Type resolveType(Type type) {
		if (type != null && type.isProxy()) {
			return doResolveType(type);
		} else {
			return type;
		}
	}

	protected Type doResolveType(Type type) {
		final String typeName = URI.decode(((InternalEObject) type).eProxyURI()
				.fragment());
		final Type resolved = getType(typeName, null, true, true, false, true);
		if (resolved != null) {
			return resolved;
		}
		return type;
	}

	private String buildParameterizedTypeName(final GenericType genericType,
			List<IRType> parameters) {
		final StringBuilder parameterizedName = new StringBuilder();
		parameterizedName.append(genericType.getName());
		parameterizedName.append("<");
		for (int i = 0; i < genericType.getTypeParameters().size(); ++i) {
			if (i > 0) {
				parameterizedName.append(",");
			}
			if (i < parameters.size()) {
				parameterizedName.append(parameters.get(i).getName());
			} else {
				parameterizedName.append("*");
			}
		}
		parameterizedName.append(">");
		final String name = parameterizedName.toString();
		return name;
	}

	public Type parameterize(Type target, List<IRType> parameters) {
		target = resolveType(target);
		if (target instanceof GenericType) {
			final GenericType genericType = (GenericType) target;
			final String name = buildParameterizedTypeName(genericType,
					parameters);
			Type type = types.get(name);
			if (type != null) {
				if (DEBUG) {
					System.out.println("Returning " + name);
				}
				return type;
			}
			if (DEBUG) {
				System.out.println("Creating " + name);
			}
			final Parameterizer parameterizer = new Parameterizer(genericType,
					parameters);
			type = parameterizer.copy();
			parameterizer.copyReferences();
			type.setName(name);
			types.put(name, type);
			typeRS.addToResource(type);
			return type;
		}
		return target;
	}

	@SuppressWarnings("serial")
	private static class Parameterizer extends EcoreUtil.Copier {

		final GenericType genericType;
		final Map<TypeVariable, IRType> parameters = new HashMap<TypeVariable, IRType>();

		public Parameterizer(GenericType genericType, List<IRType> parameters) {
			super(false);
			this.genericType = genericType;
			for (int i = 0; i < genericType.getTypeParameters().size(); ++i) {
				this.parameters.put(genericType.getTypeParameters().get(i),
						i < parameters.size() ? parameters.get(i) : null);
			}
		}

		public Type copy() {
			return (Type) copy((EObject) genericType);
		}

		@Override
		public EObject copy(EObject eObject) {
			if (eObject == null) {
				return null;
			} else {
				final EObject copyEObject;
				final EClass eClass;
				if (eObject == genericType) {
					// TODO (alex) extension point
					copyEObject = (EObject) TypeInfoModelFactory.eINSTANCE
							.createType();
					eClass = copyEObject.eClass();
				} else if (eObject instanceof TypeVariableReference) {
					final IRType source = parameters
							.get(((TypeVariableReference) eObject)
									.getVariable());
					final RType result = TypeInfoModelFactory.eINSTANCE
							.createRType();
					result.setRuntimeType(source != null ? source : JSTypeSet
							.any());
					return (EObject) result;
				} else {
					copyEObject = createCopy(eObject);
					eClass = eObject.eClass();
				}
				put(eObject, copyEObject);
				for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
					EStructuralFeature eStructuralFeature = eClass
							.getEStructuralFeature(i);
					if (eStructuralFeature.isChangeable()
							&& !eStructuralFeature.isDerived()) {
						if (eStructuralFeature instanceof EAttribute) {
							copyAttribute((EAttribute) eStructuralFeature,
									eObject, copyEObject);
						} else {
							EReference eReference = (EReference) eStructuralFeature;
							if (eReference.isContainment()) {
								copyContainment(eReference, eObject,
										copyEObject);
							}
						}
					}
				}
				copyProxyURI(eObject, copyEObject);
				return copyEObject;
			}
		}

		@Override
		protected void copyReference(EReference eReference, EObject eObject,
				EObject copyEObject) {
			if (eObject instanceof TypeVariableReference)
				return;
			super.copyReference(eReference, eObject, copyEObject);
		}
	}

	public Set<String> listTypes(TypeMode mode, String prefix) {
		Set<String> result = new HashSet<String>();
		Set<String> typeNames = TypeInfoModelLoader.getInstance().listTypes(
				prefix);
		if (typeNames != null) {
			result.addAll(typeNames);
		}
		for (ITypeProvider provider : getTypeProviders()) {
			typeNames = provider.listTypes(this, mode, prefix);
			if (typeNames != null) {
				result.addAll(typeNames);
			}
		}
		return result;
	}

	/**
	 * @return the source
	 */
	public ReferenceSource getSource() {
		return source;
	}

	public IValueCollection getTopValueCollection() {
		if (resolve) {
			for (IMemberEvaluator evaluator : TypeInfoManager
					.getMemberEvaluators()) {
				final IValueCollection collection = evaluator
						.getTopValueCollection(this);
				if (collection != null) {
					return collection;
				}
			}
		}
		return null;
	}

	public IModelElement getModelElement() {
		return source != null ? source.getModelElement() : null;
	}

	public String getContext() {
		return null;
	}

	private enum TypeResolveMode {
		SIMPLE, PROXY, UNKNOWN
	}

	private Type getType(String typeName, TypeMode mode,
			boolean queryProviders, boolean queryPredefined,
			boolean allowProxy, boolean allowUnknown) {
		Type type = types.get(typeName);
		if (type != null) {
			if (!allowUnknown && type.getKind() == TypeKind.UNKNOWN) {
				return null;
			}
			return type;
		}
		type = invariantRS.getCachedType(typeName);
		if (type != null) {
			types.put(typeName, type);
			return type;
		}
		type = loadType(typeName, mode, queryProviders, queryPredefined);
		if (type != null) {
			validateTypeInfo(type);
			types.put(typeName, type);
			typeRS.addToResource(type);
			return type;
		}
		if (allowProxy) {
			type = TypeUtil.createProxy(typeName);
			return type;
		}
		if (allowUnknown) {
			type = createUnknown(typeName);
			typeRS.addToResource(type);
			types.put(typeName, type);
			return type;
		}
		return null;
	}

	private void validateTypeInfo(Type type) {
		final Resource resource = ((EObject) type).eResource();
		if (resource != null) {
			final URI u = resource.getURI();
			if (u != null && (u.isFile() || u.isPlatform())) {
				return;
			}
			boolean validResource = resource == invariantRS.getResource()
					|| TypeInfoModelLoader.getInstance().hasResource(resource);
			if (!validResource) {
				Iterator<InvariantTypeResourceSet> iterator = invariantContextRS
						.values().iterator();
				while (iterator.hasNext()) {
					validResource = iterator.next().getResource() == resource;
					if (validResource)
						break;
				}
				Assert.isTrue(validResource, "Type " + type.getName()
						+ " has invalid resource: " + resource);
			}
		}
		// TODO check that member referenced types are contained or proxy
	}

	public void markInvariant(Type type) {
		if (((EObject) type).eResource() != null) {
			return;
		}
		invariantRS.add(type);
	}

	public void markInvariant(Type type, String context) {
		if (((EObject) type).eResource() != null) {
			return;
		}
		if (context == null) {
			markInvariant(type);
		} else {
			Assert.isLegal(((EObject) type).eContainer() == null);
			Assert.isLegal(((EObject) type).eResource() == null);
			InvariantTypeResourceSet invariantTypeResourceSet = invariantContextRS
					.get(context);
			if (invariantTypeResourceSet == null) {
				invariantTypeResourceSet = new InvariantTypeResourceSet(
						context, invariantRS, invariantContextRS);
				InvariantTypeResourceSet set = invariantContextRS.putIfAbsent(
						context, invariantTypeResourceSet);
				if (set != null) {
					invariantTypeResourceSet = set;
				}
			}
			invariantTypeResourceSet.add(type);
		}
	}

	public Type getInvariantType(String typeName, String context) {
		if (context == null) {
			return invariantRS.getCachedType(typeName);
		} else {
			InvariantTypeResourceSet invariantTypeResourceSet = invariantContextRS
					.get(context);
			if (invariantTypeResourceSet != null) {
				return invariantTypeResourceSet.getCachedType(typeName);
			}
		}
		return null;
	}

	protected static Type createUnknown(String typeName) {
		final Type type = TypeInfoModelFactory.eINSTANCE.createType();
		type.setName(typeName);
		type.setKind(TypeKind.UNKNOWN);
		return type;
	}

	private final Map<String, Boolean> activeTypeRequests = new HashMap<String, Boolean>();

	private boolean canQueryTypeProviders() {
		return activeTypeRequests.isEmpty();
	}

	private Type loadType(String typeName, TypeMode mode,
			boolean queryProviders, boolean queryPredefined) {
		if (queryProviders
				&& activeTypeRequests.put(typeName, Boolean.FALSE) == null) {
			try {
				Type type = invariantRS.getCachedType(typeName);
				if (type != null) {
					return type;
				}
				for (ITypeProvider provider : getTypeProviders()) {
					type = provider.getType(this, mode, typeName);
					if (type != null && !isProxy(type)) {
						return type;
					}
				}
			} finally {
				activeTypeRequests.remove(typeName);
			}
		}
		if (queryPredefined) {
			Type type = TypeInfoModelLoader.getInstance().getType(typeName);
			if (type != null) {
				return type;
			}
		}
		return null;
	}

	private ITypeProvider[] typeProviders = null;

	public ITypeProvider[] getTypeProviders() {
		if (typeProviders == null) {
			typeProviders = createTypeProviders();
		}
		return typeProviders;
	}

	protected ITypeProvider[] createTypeProviders() {
		return TypeInfoManager.createTypeProviders(this);
	}

	static abstract class TypeResourceSet extends ResourceSetImpl {

		@Override
		public EObject getEObject(URI uri, boolean loadOnDemand) {
			if (TypeUtil.isTypeProxy(uri)) {
				final String typeName = URI.decode(uri.fragment());
				final Type type = resolveTypeProxy(typeName);
				if (type == null) {
					return (EObject) createUnknown(typeName);
				} else if (type instanceof EObject) {
					return (EObject) type;
				} else {
					JavaScriptPlugin.error("proxy resolved to "
							+ type.getClass().getName()
							+ " which is not EObject");
					return (EObject) createUnknown(typeName);
				}
			}
			return super.getEObject(uri, loadOnDemand);
		}

		protected abstract Type resolveTypeProxy(String typeName);

		public synchronized Resource getResource() {
			if (typesResource == null) {
				typesResource = new ResourceImpl(
						TypeUtil.createProxyResourceURI());
				getResources().add(typesResource);
			}
			return typesResource;
		}

		private Resource typesResource = null;

		public void addToResource(final Type type) {
			final EObject object = (EObject) type;
			if (object.eResource() == null) {
				add(type);
			}
		}

		protected synchronized void add(Type type) {
			getResource().getContents().add((EObject) type);
		}

	}

	private final TypeResourceSet typeRS = new TypeResourceSet() {
		@Override
		protected Type resolveTypeProxy(String typeName) {
			return getType(typeName, null, true, false, false, false);
		}
	};

	static class InvariantTypeResourceSet extends TypeResourceSet implements
			ITypeInfoContext {

		private final String context;
		private final InvariantTypeResourceSet staticInvariants;
		private final ConcurrentMap<String, InvariantTypeResourceSet> contextInvariants;

		public InvariantTypeResourceSet(
				ConcurrentMap<String, InvariantTypeResourceSet> contextInvariants) {
			this(null, null, contextInvariants);
		}

		public InvariantTypeResourceSet(
				String context,
				InvariantTypeResourceSet staticInvariants,
				ConcurrentMap<String, InvariantTypeResourceSet> contextInvariants) {
			this.context = context;
			this.staticInvariants = staticInvariants;
			this.contextInvariants = contextInvariants;
		}

		private final Set<String> activeTypeRequests = new HashSet<String>();
		private final Map<String, Type> types = new ConcurrentHashMap<String, Type>();

		private boolean canQueryTypeProviders() {
			synchronized (activeTypeRequests) {
				return activeTypeRequests.isEmpty();
			}
		}

		public String getContext() {
			return context;
		}

		private Type getType(String typeName, TypeMode mode,
				boolean queryProviders, boolean queryPredefined,
				boolean allowProxy, boolean allowUnknown) {
			Type type = types.get(typeName);
			if (type != null) {
				return type;
			}
			type = loadType(typeName, mode, queryProviders, queryPredefined);
			if (type != null) {
				// TODO validateTypeInfo(type);
				addToResource(type);
				return type;
			}
			if (allowProxy) {
				type = TypeUtil.createProxy(typeName);
				return type;
			}
			if (allowUnknown) {
				type = createUnknown(typeName);
				addToResource(type);
				return type;
			}
			return null;
		}

		public SimpleType getTypeRef(String typeName) {
			return TypeUtil.ref(getType(typeName));
		}

		private ITypeProvider[] typeProviders = null;

		public ITypeProvider[] getTypeProviders() {
			if (typeProviders == null) {
				typeProviders = TypeInfoManager.createTypeProviders(this);
			}
			return typeProviders;
		}

		private Type loadType(String typeName, TypeMode mode,
				boolean queryProviders, boolean queryPredefined) {
			if (queryProviders) {
				synchronized (activeTypeRequests) {
					while (!activeTypeRequests.add(typeName)) {
						try {
							activeTypeRequests.wait();
						} catch (InterruptedException e) {
						}
					}
				}
				try {
					Type type = types.get(typeName);
					if (type != null) {
						return type;
					}
					for (ITypeProvider provider : getTypeProviders()) {
						type = provider.getType(this, mode, typeName);
						if (type != null && !isProxy(type)) {
							return type;
						}
					}
				} finally {
					synchronized (activeTypeRequests) {
						activeTypeRequests.remove(typeName);
						activeTypeRequests.notifyAll();
					}
				}
			}
			if (queryPredefined) {
				Type type = TypeInfoModelLoader.getInstance().getType(typeName);
				if (type != null) {
					return type;
				}
			}
			return null;
		}

		@Override
		protected Type resolveTypeProxy(String typeName) {
			if (staticInvariants != null) {
				Type cachedType = staticInvariants.getCachedType(typeName);
				if (cachedType != null)
					return cachedType;
			}
			return getType(typeName, null, true, false, false, false);
		}

		public Type getType(String typeName) {
			if (typeName == null || typeName.length() == 0) {
				return null;
			}
			final boolean queryProviders = canQueryTypeProviders();
			return getType(typeName, null, queryProviders, true,
					!queryProviders, true);
		}

		public Type getKnownType(String typeName, TypeMode mode) {
			if (typeName == null || typeName.length() == 0) {
				return null;
			}
			final boolean queryProviders = canQueryTypeProviders();
			return getType(typeName, null, queryProviders, true,
					!queryProviders, false);
		}

		public Type resolveType(Type type) {
			if (type != null && type.isProxy()) {
				final String typeName = URI.decode(((InternalEObject) type)
						.eProxyURI().fragment());
				final Type resolved = getType(typeName, null, true, true,
						false, true);
				if (resolved != null) {
					return resolved;
				}
			}
			return type;
		}

		public void markInvariant(Type type) {
			if (((EObject) type).eResource() != null) {
				return;
			}
			// context == null, this is a static one
			if (staticInvariants == null)
				add(type);
			else
				staticInvariants.add(type);
		}

		public void markInvariant(Type type, String context) {
			if (((EObject) type).eResource() != null) {
				return;
			}
			if (context.equals(this.context)) {
				add(type);
			} else {
				InvariantTypeResourceSet invariantTypeResourceSet = this.contextInvariants
						.get(context);
				if (invariantTypeResourceSet == null) {
					invariantTypeResourceSet = new InvariantTypeResourceSet(
							context, invariantRS, invariantContextRS);
					InvariantTypeResourceSet set = invariantContextRS
							.putIfAbsent(context, invariantTypeResourceSet);
					if (set != null) {
						invariantTypeResourceSet = set;
					}
				}
				invariantTypeResourceSet.add(type);
			}
		}

		public Type getInvariantType(String typeName, String context) {
			if (context == null) {
				if (staticInvariants == null) {
					return getCachedType(typeName);
				} else {
					return staticInvariants.getCachedType(typeName);
				}
			} else if (context.equals(this.context)) {
				return getCachedType(typeName);
			} else {
				InvariantTypeResourceSet invariantTypeResourceSet = invariantContextRS
						.get(context);
				if (invariantTypeResourceSet != null) {
					return invariantTypeResourceSet.getCachedType(typeName);
				}
			}
			return null;
		}

		public IModelElement getModelElement() {
			return null;
		}

		public ReferenceSource getSource() {
			return ReferenceSource.UNKNOWN;
		}

		@Override
		public void add(Type type) {
			super.add(type);
			types.put(type.getName(), type);
		}

		public Type getCachedType(String typeName) {
			return types.get(typeName);
		}

		public void reset() {
			types.clear();
			synchronized (this) {
				getResource().getContents().clear();
			}
		}

		public IValue valueOf(Member member) {
			// TODO (alex) review
			return null;
		}

		public Type parameterize(Type target, List<IRType> parameters) {
			// TODO (alex) review
			return target;
		}

	}

	static final ConcurrentHashMap<String, InvariantTypeResourceSet> invariantContextRS = new ConcurrentHashMap<String, InvariantTypeResourceSet>();
	static final InvariantTypeResourceSet invariantRS = new InvariantTypeResourceSet(
			invariantContextRS);

	protected static boolean isProxy(Type type) {
		return type instanceof EObject && ((EObject) type).eIsProxy();
	}

	private IValueTypeFactory factory = new ValueTypeFactoryImpl(this);

	public IValueTypeFactory getFactory() {
		return factory;
	}

	private boolean resolve = true;

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
			elements.put(name, element);
			return element;
		}
		if (resolve) {
			for (IElementResolver resolver : TypeInfoManager
					.getElementResolvers()) {
				element = resolver.resolveElement(this, name);
				if (element != null) {
					elements.put(name, element);
					return element;
				}
			}
		}
		return null;
	}

	public IValue valueOf(Member member) {
		for (IMemberEvaluator evaluator : TypeInfoManager.getMemberEvaluators()) {
			final IValueCollection collection = evaluator.valueOf(this, member);
			if (collection != null) {
				if (collection instanceof IValueProvider) {
					IValue value = ((IValueProvider) collection).getValue();
					if (member.getType() != null) {
						value.setDeclaredType(JSTypeSet.normalize(this,
								member.getType()));
					}
					if (value.getKind() == ReferenceKind.UNKNOWN) {
						if (member instanceof Property) {
							value.setKind(ReferenceKind.PROPERTY);
						} else {
							value.setKind(ReferenceKind.METHOD);
						}
					}
					if (value instanceof ImmutableValue) {
						ElementValue elementValue = ElementValue.createFor(
								member, this);
						return new ValueWithElementValue(
								(ImmutableValue) value, elementValue);
					}
					return value;
				} else {
					break;
				}
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

	public void setDoResolve(boolean resolve) {
		this.resolve = resolve;
	}

	private IModelBuilder[] modelBuilders = null;

	public IModelBuilder[] getModelBuilders() {
		if (modelBuilders == null) {
			modelBuilders = TypeInfoManager.getModelBuilders(this);
		}
		return modelBuilders;
	}

	private static final ThreadLocal<TypeInferencer2> CURRENT = new ThreadLocal<TypeInferencer2>();

	protected static final ITypeSystem DELEGATING_TYPE_SYSTEM = new DelagatingTypeSystem();

	private static class DelagatingTypeSystem implements ITypeSystem {

		private TypeInferencer2 current() {
			return CURRENT.get();
		}

		public IValue valueOf(Member member) {
			final TypeInferencer2 current = current();
			if (current != null) {
				return current.valueOf(member);
			} else {
				return null;
			}
		}

		public Type resolveType(Type type) {
			if (type != null && type.isProxy()) {
				final TypeInferencer2 current = current();
				if (current != null) {
					return current.doResolveType(type);
				} else {
					final Type resolved = TypeInfoModelLoader.getInstance()
							.getType(type.getName());
					if (resolved != null) {
						return resolved;
					}
				}
			}
			return type;
		}

		public Type parameterize(Type target, List<IRType> parameters) {
			final TypeInferencer2 current = current();
			if (current != null) {
				return current.parameterize(target, parameters);
			} else {
				return target;
			}
		}
	}

}
