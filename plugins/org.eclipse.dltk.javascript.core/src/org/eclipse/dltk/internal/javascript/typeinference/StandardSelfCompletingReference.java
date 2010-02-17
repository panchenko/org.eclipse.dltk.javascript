/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.typeinference;

import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IParameter;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.internal.core.ModelElement;
import org.eclipse.dltk.internal.core.SourceMethod;
import org.eclipse.dltk.internal.core.SourceMethodUtils;
import org.eclipse.dltk.internal.javascript.reference.resolvers.SelfCompletingReference;

/**
 * @since 2.0
 */
public class StandardSelfCompletingReference implements IReference,
		SelfCompletingReference {

	private String name;
	private final boolean childIsh;
	boolean fRef;
	boolean local;

	private IReferenceLocation location;

	private Map<String, IReference> childs;
	private String[] parameterNames;
	private String proposalInfo;
	protected StandardSelfCompletingReference parentRef;
	private URL imageUrl;
	private String returnType;
	private int parameterIndex = -1;

	public StandardSelfCompletingReference(String paramOrVarName,
			boolean childIsh) {
		this.name = paramOrVarName;
		this.childIsh = childIsh;
	}

	public IReferenceLocation getLocation() {
		return location;
	}

	public void setLocationInformation(IReferenceLocation location) {
		this.location = location;
	}

	public Set<IReference> getChilds(boolean resolveLocals) {
		if (childs == null) {
			childs = new HashMap<String, IReference>(3);
			createChilds();
		}
		return new HashSet<IReference>(childs.values());
	}

	public String getName() {
		return name;
	}

	public Set<String> getTypes() {
		return null;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getParentName() {
		return name;
	}

	public IReference getChild(String key, boolean resolveLocals) {
		if (childs == null) {
			childs = new HashMap<String, IReference>(3);
			createChilds();
		}
		return childs.get(key);
	}

	protected void createChilds() {
	}

	public void setChild(String key, IReference ref) {
		if (childs == null) {
			childs = new HashMap<String, IReference>(3);
			createChilds();
		}
		ref = testRecursion(ref);
		childs.put(key, ref);
	}

	protected void addChildren(Collection<IReference> references) {
		for (IReference reference : references) {
			setChild(reference.getName(), reference);
		}
	}

	/**
	 * @param ref
	 * @return
	 */
	private IReference testRecursion(IReference ref) {
		if (ref instanceof StandardSelfCompletingReference) {
			StandardSelfCompletingReference ssr = (StandardSelfCompletingReference) ref;
			ssr.parentRef = this;
			if (parentRef != null) {
				HashSet<IReference> set = new HashSet<IReference>();
				set.add(parentRef);
				IReference child = parentRef.findEqualParent(ref, set);
				if (child != null) {
					ref = child;
				}
			}
		}
		return ref;
	}

	/**
	 * @param ref
	 * @return
	 */
	private IReference findEqualParent(IReference ref, Set<IReference> parents) {
		if (this.equals(ref))
			return this;
		if (parentRef != null && !parents.contains(parentRef)) {
			parents.add(parentRef);
			return parentRef.findEqualParent(ref, parents);
		}
		return null;
	}

	public boolean isChildishReference() {
		return childIsh;
	}

	public void recordDelete(String fieldId) {
		if (childs == null)
			return;
		childs.remove(fieldId);
	}

	public IReference getPrototype(boolean resolveLocals) {
		return getChild("prototype", true);
	}

	public void setPrototype(IReference ref) {
		this.setChild("prototype", ref);
	}

	public void addModelElements(Collection<IModelElement> toAdd) {
		if (location != null) {
			if (isFunctionRef()) {
				MethodReference method = new MethodReference(
						(ModelElement) location.getModelElement(), name,
						getParameters(), getProposalInfo(), getReturnType());
				toAdd.add(method);
			} else {
				FakeField fakeField = new FakeField((ModelElement) location
						.getModelElement(), name, location.getOffset(),
						location.getLength(), getReturnType());
				fakeField.setProposalInfo(getProposalInfo());
				toAdd.add(fakeField);
			}
		}
	}

	public boolean isFunctionRef() {
		return fRef;
	}

	public StandardSelfCompletingReference setFunctionRef() {
		fRef = true;
		return this;
	}

	private static final class Param implements IParameter {

		private final String name;

		public Param(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public String getType() {
			return null;
		}

		public String getDefaultValue() {
			return null;
		}

	}

	private IParameter[] getParameters() {
		if (parameterNames == null || parameterNames.length == 0) {
			return SourceMethodUtils.NO_PARAMETERS;
		}
		final Param[] params = new Param[parameterNames.length];
		for (int i = 0; i < parameterNames.length; ++i) {
			params[i] = new Param(parameterNames[i]);
		}
		return params;
	}

	public String[] getParameterNames() {
		return parameterNames;
	}

	/**
	 * @param parameterNames
	 *            the parameterNames to set
	 */
	public void setParameterNames(String[] parameterNames) {
		this.parameterNames = parameterNames;
	}

	public String getProposalInfo() {
		return proposalInfo;
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.reference.resolvers.SelfCompletingReference#getImageURL()
	 */
	public URL getImageURL() {
		return imageUrl;
	}

	/**
	 * @param imageUrl
	 *            the imageUrl to set
	 */
	public void setImageUrl(URL imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.reference.resolvers.SelfCompletingReference#getReturnType()
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 * @param returnType
	 *            the returntype of this reference
	 */
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	/**
	 * @param proposalInfo
	 *            the proposalInfo to set
	 */
	public void setProposalInfo(String proposalInfo) {
		this.proposalInfo = proposalInfo;
	}

	public boolean isLocal() {
		return local;
	}

	public void setLocal(boolean local) {
		this.local = local;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof StandardSelfCompletingReference) {
			StandardSelfCompletingReference ur = (StandardSelfCompletingReference) obj;
			return ur.name.equals(name) && fRef == ur.fRef
					&& childIsh == ur.childIsh && fRef == ur.fRef
					&& local == ur.local && equals(location, ur.location);
		}
		return false;
	}

	private static boolean equals(IReferenceLocation ref1,
			IReferenceLocation ref2) {
		if (ref1 != null && ref2 != null) {
			return ref1.getOffset() == ref2.getOffset()
					&& ref1.getLength() == ref2.getLength();
		} else {
			return ref1 == null && ref2 == null;
		}
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.reference.resolvers.SelfCompletingReference#getKind()
	 */
	public int getKind() {
		return isFunctionRef() ? CompletionProposal.METHOD_REF
				: CompletionProposal.LOCAL_VARIABLE_REF;
	}

	private static class MethodReference extends SourceMethod implements
			IProposalHolder {

		private final IParameter[] parameters;
		private final String proposalInfo;
		private final String type;

		/**
		 * @param parent
		 * @param name
		 * @param type
		 */
		public MethodReference(ModelElement parent, String name,
				IParameter[] parameters, String proposalInfo, String type) {
			super(parent, name);
			this.parameters = parameters;
			this.proposalInfo = proposalInfo;
			this.type = type;
		}

		@Override
		public String[] getParameterNames() throws ModelException {
			return SourceMethodUtils.getParameterNames(parameters);
		}

		public String getProposalInfo() {
			return proposalInfo;
		}

		@Override
		public IParameter[] getParameters() throws ModelException {
			return parameters;
		}

		@Override
		public String getType() throws ModelException {
			return type;
		}

		@Override
		public boolean exists() {
			return true;
		}

		@Override
		public boolean isConstructor() throws ModelException {
			return false;
		}
	}

	/**
	 * @param b
	 */
	public void setParameterIndex(int index) {
		parameterIndex = index;
	}

	/**
	 * @return the parameter
	 */
	public int getParameterIndex() {
		return parameterIndex;
	}
}
