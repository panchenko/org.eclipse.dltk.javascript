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
package org.eclipse.dltk.internal.javascript.validation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.parser.IModuleDeclaration;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.compiler.problem.IValidationStatus;
import org.eclipse.dltk.compiler.problem.ValidationStatus;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceNode;
import org.eclipse.dltk.core.SourceParserUtil;
import org.eclipse.dltk.core.builder.IBuildContext;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.parser.JSProblemReporter;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.javascript.parser.Reporter;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.IRClassType;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet;
import org.eclipse.dltk.javascript.typeinfo.RTypes;
import org.eclipse.dltk.javascript.typeinfo.TypeCompatibility;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.emf.common.util.EList;
import org.eclipse.osgi.util.NLS;

public class JavaScriptValidations {

	static final String ATTR_INCONSISTENT_RETURNS = JavaScriptValidations.class
			.getName() + ".INCONSISTENT_RETURNS";

	public static Script parse(IBuildContext context) {
		final IModuleDeclaration savedAST = (IModuleDeclaration) context
				.get(IBuildContext.ATTR_MODULE_DECLARATION);
		if (savedAST instanceof Script) {
			return (Script) savedAST;
		}
		final ISourceModule module = context.getSourceModule();
		if (module != null) {
			// TODO pass additional predicate here...
			final IModuleDeclaration declaration = SourceParserUtil.parse(
					module, context.getProblemReporter());
			if (declaration instanceof Script) {
				context.set(IBuildContext.ATTR_MODULE_DECLARATION, declaration);
				return (Script) declaration;
			}
		}
		final JavaScriptParser parser = new JavaScriptParser();
		final Script script = parser.parse(context,
				context.getProblemReporter());
		context.set(IBuildContext.ATTR_MODULE_DECLARATION, script);
		return script;
	}

	static final String ATTR_BINDINGS = JavaScriptValidations.class.getName()
			+ ".BINDINGS";

	/**
	 * Returns bindings prepared by {@link TypeInfoValidator}, which is supposed
	 * to be executed before. Is supposed to be called only from
	 * {@link IBuildParticipant} which has dependency on
	 * {@link TypeInfoValidator}.
	 * 
	 * @param context
	 * @return
	 */
	public static Map<ASTNode, IValueReference> getBindings(
			IBuildContext context) {
		@SuppressWarnings("unchecked")
		Map<ASTNode, IValueReference> bindings = (Map<ASTNode, IValueReference>) context
				.get(ATTR_BINDINGS);
		if (bindings == null) {
			bindings = Collections.emptyMap();
		}
		return bindings;
	}

	public static IRType typeOf(IValueReference reference) {
		if (reference != null) {
			if (reference.getDeclaredType() != null) {
				return reference.getDeclaredType();
			}
			JSTypeSet declaredTypes = reference.getDeclaredTypes();
			if (declaredTypes.size() == 1) {
				return declaredTypes.getFirst();
			}
			final JSTypeSet types = reference.getTypes();
			if (types.size() == 1) {
				return types.getFirst();
			}
		}
		return null;
	}

	public static JSTypeSet getTypes(IValueReference reference) {
		if (reference != null) {
			JSTypeSet set = JSTypeSet.create();
			if (reference.getDeclaredType() != null) {
				set.add(reference.getDeclaredType());
			}
			JSTypeSet declaredTypes = reference.getDeclaredTypes();
			set.addAll(declaredTypes);
			JSTypeSet types = reference.getTypes();
			set.addAll(types);
			return set;
		}
		return JSTypeSet.emptySet();
	}

	protected static Reporter createReporter(IBuildContext context) {
		return new Reporter(context.getLineTracker(),
				context.getProblemReporter());
	}

	private static <E extends Member> boolean canConvert(Object value,
			Class<E> elementType) {
		return elementType.isInstance(value) || elementType == Method.class
				&& value instanceof Type
				&& ((Type) value).getStaticConstructor() != null;
	}

	@SuppressWarnings("unchecked")
	private static <E extends Member> E convert(Object value,
			Class<E> elementType) {
		if (elementType.isInstance(value))
			return (E) value;
		else
			return (E) ((Type) value).getStaticConstructor();
	}

	/**
	 * @param reference
	 * @param elementType
	 * @return
	 */
	public static <E extends Member> List<E> extractElements(
			IValueReference reference, Class<E> elementType) {
		final Object value = reference
				.getAttribute(IReferenceAttributes.ELEMENT);
		if (canConvert(value, elementType)) {
			return Collections.singletonList(convert(value, elementType));
		} else if (value instanceof Object[]) {
			final Object[] elements = (Object[]) value;
			List<E> result = null;
			for (Object element : elements) {
				if (canConvert(element, elementType)) {
					if (result == null) {
						result = new ArrayList<E>(elements.length);
					}
					result.add(convert(element, elementType));
				}
			}
			return result;
		}
		return null;
	}

	/**
	 * @param methods
	 * @param arguments
	 * @return
	 */
	public static <METHOD extends Method> METHOD selectMethod(
			ITypeSystem context, List<METHOD> methods,
			IValueReference[] arguments, boolean fallback) {
		if (methods.size() == 1) {
			return methods.get(0);
		}
		List<METHOD> matches = null;
		for (METHOD method : methods) {
			if (checkParameterCount(method, arguments.length)) {
				if (matches == null) {
					matches = new ArrayList<METHOD>(4);
				}
				matches.add(method);
			}
		}
		if (matches != null) {
			if (matches.size() == 1) {
				return matches.get(0);
			}
			OUTER: for (METHOD method : matches) {
				final EList<Parameter> parameters = method.getParameters();
				for (int i = 0; i < Math.min(parameters.size(),
						arguments.length); i++) {
					final JSType parameterType = parameters.get(i).getType();
					if (parameterType == null)
						continue;
					final IRType argumentType = typeOf(arguments[i]);
					if (argumentType == null)
						continue;
					if (RTypes.create(context, parameterType)
							.isAssignableFrom(argumentType) == TypeCompatibility.FALSE)
						continue OUTER;
				}
				return method;
			}
		}
		return fallback ? methods.get(0) : null;
	}

	@Deprecated
	public static boolean isStatic(IValueReference valueRef) {
		if (valueRef == null) {
			return false;
		}
		for (IRType type : valueRef.getDeclaredTypes()) {
			if (type != null && type instanceof IRClassType) {
				return true;
			}
		}
		for (IRType type : valueRef.getTypes()) {
			if (type != null && type instanceof IRClassType) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks the parameter count, returns <code>true</code> if correct.
	 * 
	 * @param method
	 * @param argCount
	 * 
	 * @return
	 */
	static boolean checkParameterCount(Method method, int argCount) {
		final EList<Parameter> params = method.getParameters();
		if (params.size() == argCount) {
			return true;
		} else if (params.size() < argCount) {
			return !params.isEmpty()
					&& params.get(params.size() - 1).getKind() == ParameterKind.VARARGS;
		} else if (params.size() > argCount) {
			final ParameterKind last = params.get(argCount).getKind();
			return last == ParameterKind.OPTIONAL
					|| last == ParameterKind.VARARGS;
		} else {
			return false;
		}
	}

	public static void reportValidationStatus(JSProblemReporter reporter,
			final IValidationStatus result, ISourceNode node,
			final JavaScriptProblems defaultProblemId,
			final String defaultMessage, final String name) {
		if (result instanceof ValidationStatus) {
			final ValidationStatus status = (ValidationStatus) result;
			final int start;
			final int end;
			if (status.hasRange()) {
				start = status.start();
				end = status.end();
			} else {
				start = node.start();
				end = node.end();
			}
			reporter.reportProblem(status.identifier(), status.message(),
					start, end);
		} else if (result instanceof IProblemIdentifier) {
			reporter.reportProblem((IProblemIdentifier) result,
					NLS.bind(defaultMessage, name), node.start(),
					node.end());
		} else if (result == ValidationStatus.OK) {
			return;
		} else {
			reporter.reportProblem(defaultProblemId,
					NLS.bind(defaultMessage, name) + ": " + result,
					node.start(), node.end());
		}
	}
}
