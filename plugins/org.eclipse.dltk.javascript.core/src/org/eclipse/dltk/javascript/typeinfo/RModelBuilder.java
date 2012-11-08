/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.dltk.compiler.problem.IProblemCategory;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.internal.javascript.ti.TypeSystemImpl;
import org.eclipse.dltk.javascript.internal.core.RParameter;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMember;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IVariable;
import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;
import org.eclipse.dltk.javascript.typeinfo.model.Visibility;

public class RModelBuilder {

	private static class RElement implements IRElement {

		private final String name;
		protected final IRType type;
		// nullable
		private final Set<IProblemCategory> suppressedWarnings;
		// nullable
		private final Object source;

		public RElement(String name, IRType type,
				Set<IProblemCategory> suppressedWarnings, Object source) {
			this.name = name;
			this.type = type;
			this.suppressedWarnings = suppressedWarnings;
			this.source = source;
		}

		public String getName() {
			return name;
		}

		public IRType getType() {
			return type;
		}

		public Set<IProblemCategory> getSuppressedWarnings() {
			return suppressedWarnings != null ? suppressedWarnings
					: Collections.<IProblemCategory> emptySet();
		}

		public boolean isSuppressed(IProblemIdentifier problemIdentifier) {
			if (suppressedWarnings != null) {
				for (IProblemCategory category : suppressedWarnings) {
					if (category.contents().contains(problemIdentifier)) {
						return true;
					}
				}
			}
			return false;
		}

		public boolean isDeprecated() {
			if (source instanceof IMember) {
				return ((IMember) source).isDeprecated();
			} else if (source instanceof Element) {
				return ((Element) source).isDeprecated();
			} else {
				return false;
			}
		}

		public Object getSource() {
			return source;
		}

	}

	private static class RMember extends RElement implements IRMember {
		final Visibility visibility;
		final IRTypeDeclaration typeDeclaration;

		public RMember(String name, IRType type,
				Set<IProblemCategory> suppressedWarnings,
				Visibility visibility, Object source,
				IRTypeDeclaration typeDeclaration) {
			super(name, type, suppressedWarnings, source);
			this.visibility = visibility;
			this.typeDeclaration = typeDeclaration;
		}

		public Visibility getVisibility() {
			return visibility;
		}

		public IRTypeDeclaration getDeclaringType() {
			return typeDeclaration;
		}

		public boolean isStatic() {
			return false;
		}

		public boolean isVisible() {
			return true;
		}
	}

	private static class RMethod extends RMember implements IRMethod {

		final List<IRParameter> parameters;

		public RMethod(String name, IRType type,
				Set<IProblemCategory> suppressedWarnings,
				Visibility visibility, List<IRParameter> parameters,
				Object source) {
			super(name, type, suppressedWarnings, visibility, source, null);
			this.parameters = parameters;
		}

		public int getParameterCount() {
			return parameters.size();
		}

		public List<IRParameter> getParameters() {
			return parameters;
		}

		public boolean isTyped() {
			if (type != null) {
				return true;
			}
			for (int i = 0; i < parameters.size(); ++i) {
				final IRParameter parameter = parameters.get(i);
				if (parameter.getType() != RTypes.any()
						|| parameter.getKind() != ParameterKind.NORMAL) {
					return true;
				}
			}
			return false;
		}

		public boolean isAbstract() {
			return false;
		}

		public boolean isGeneric() {
			return false;
		}

		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder();
			sb.append(getName());
			sb.append('(');
			for (int i = 0; i < parameters.size(); ++i) {
				if (i != 0) {
					sb.append(',');
				}
				sb.append(parameters.get(i));
			}
			sb.append(')');
			if (type != null) {
				sb.append(':').append(type);
			}
			return sb.toString();
		}
	}

	private static class RConstructor extends RMethod implements IRConstructor {

		public RConstructor(String name, IRType type,
				Set<IProblemCategory> suppressedWarnings,
				Visibility visibility, List<IRParameter> parameters,
				Object source) {
			super(name, type, suppressedWarnings, visibility, parameters,
					source);
		}

	}

	private static class RVariable extends RMember implements IRVariable {

		public RVariable(String name, IRType type,
				Set<IProblemCategory> suppressedWarnings,
				Visibility visibility, Object source) {
			super(name, type, suppressedWarnings, visibility, source, null);
		}

	}

	public static IRMethod create(ITypeSystem context, IMethod method) {
		if (method.isConstructor()) {
			return new RConstructor(method.getName(), RTypes.create(context,
					method.getType()), method.getSuppressedWarnings(),
					method.getVisibility(), convertParams0(context,
							method.getParameters()), method);
		} else {
			return new RMethod(method.getName(), RTypes.create(context,
					method.getType()), method.getSuppressedWarnings(),
					method.getVisibility(), convertParams0(context,
							method.getParameters()), method);
		}
	}

	public static IRVariable create(ITypeSystem context, IVariable variable) {
		return new RVariable(variable.getName(), RTypes.create(context,
				variable.getType()), variable.getSuppressedWarnings(),
				variable.getVisibility(), variable);
	}

	public static List<IRParameter> convert(ITypeSystem context,
			List<Parameter> parameters) {
		if (parameters.isEmpty()) {
			return Collections.emptyList();
		} else {
			final List<IRParameter> params = new ArrayList<IRParameter>(
					parameters.size());
			for (Parameter parameter : parameters) {
				final IRType paramType = parameter.getType() != null ? RTypes
						.create(context, parameter.getType()) : RTypes.any();
				params.add(new RParameter(parameter.getName(), paramType,
						parameter.getKind()));
			}
			return params;
		}
	}

	private static List<IRParameter> convertParams0(ITypeSystem context,
			List<IParameter> parameters) {
		if (parameters.isEmpty()) {
			return Collections.emptyList();
		} else {
			final List<IRParameter> params = new ArrayList<IRParameter>(
					parameters.size());
			for (IParameter parameter : parameters) {
				final IRType paramType = parameter.getType() != null ? RTypes
						.create(context, parameter.getType()) : RTypes.any();
				params.add(new RParameter(parameter.getName(), paramType,
						parameter.getKind()));
			}
			return params;
		}
	}

	public static IRMethod contextualize(ITypeSystem typeSystem,
			IRMethod method, IRTypeDeclaration contextType) {
		if (TypeSystemImpl.isContextualizable(method)) {
			final IRTypeTransformer transformer = ((TypeSystemImpl) typeSystem)
					.newTypeContextualizer(contextType);
			final List<IRParameter> parameters = TypeSystemImpl
					.transformParameters(method, transformer);
			return new RMethod(method.getName(), transformer.transform(method
					.getType()), method.getSuppressedWarnings(),
					method.getVisibility(), parameters, method.getSource());
		} else {
			return method;
		}
	}

}
