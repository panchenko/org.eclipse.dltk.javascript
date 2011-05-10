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

import org.eclipse.dltk.ast.parser.IModuleDeclaration;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.SourceParserUtil;
import org.eclipse.dltk.core.builder.IBuildContext;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.javascript.parser.Reporter;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet;
import org.eclipse.dltk.javascript.typeinfo.model.ClassType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.emf.common.util.EList;

public class JavaScriptValidations {

	public static Script parse(IBuildContext context) {
		final ISourceModule module = context.getSourceModule();
		if (module != null) {
			final String parserId = module.getScriptProject().getOption(
					DLTKCore.PROJECT_SOURCE_PARSER_ID, false);
			if (parserId != null
					&& !JavaScriptParser.PARSER_ID.equals(parserId)) {
				return null;
			}
		}
		final IModuleDeclaration savedAST = (IModuleDeclaration) context
				.get(IBuildContext.ATTR_MODULE_DECLARATION);
		if (savedAST instanceof Script) {
			return (Script) savedAST;
		}
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

	public static JSType typeOf(IValueReference reference) {
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

	protected static Reporter createReporter(IBuildContext context) {
		return new Reporter(context.getLineTracker(),
				context.getProblemReporter());
	}

	private static <E extends Member> boolean canConvert(Object value,
			Class<E> elementType) {
		return elementType.isInstance(value) || elementType == Method.class
				&& value instanceof Type
				&& ((Type) value).getConstructor() != null;
	}

	@SuppressWarnings("unchecked")
	private static <E extends Member> E convert(Object value,
			Class<E> elementType) {
		if (elementType.isInstance(value))
			return (E) value;
		else
			return (E) ((Type) value).getConstructor();
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
	public static Method selectMethod(List<Method> methods,
			IValueReference[] arguments) {
		if (methods.size() == 1) {
			return methods.get(0);
		}
		Method argCountMatches = null;
		for (Method method : methods) {
			if (method.getParameters().size() == arguments.length) {
				boolean match = true;
				EList<Parameter> parameters = method.getParameters();
				for (int i = 0; i < parameters.size(); i++) {
					JSType parameterType = parameters.get(i).getType();
					if (parameterType == null)
						continue;
					JSType argumentType = typeOf(arguments[i]);
					// todo should we have the context here to call
					// context.resolveTypeRef()?
					match = JSTypeSet
							.normalize(parameterType)
							.isAssignableFrom(JSTypeSet.normalize(argumentType));
					if (!match)
						break;
				}
				if (match) {
					argCountMatches = method;
					break;
				}
			}
		}
		if (argCountMatches != null) {
			return argCountMatches;
		}
		return methods.get(0);
	}

	@Deprecated
	public static boolean isStatic(IValueReference valueRef) {
		if (valueRef == null) {
			return false;
		}
		for (JSType type : valueRef.getDeclaredTypes()) {
			if (type != null && type instanceof ClassType) {
				return true;
			}
		}
		for (JSType type : valueRef.getTypes()) {
			if (type != null && type instanceof ClassType) {
				return true;
			}
		}
		return false;
	}
}
