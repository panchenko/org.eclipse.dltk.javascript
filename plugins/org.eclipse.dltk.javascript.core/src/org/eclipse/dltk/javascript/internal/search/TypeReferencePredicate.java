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
package org.eclipse.dltk.javascript.internal.search;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.dltk.core.search.matching2.AbstractMatchingPredicate;
import org.eclipse.dltk.core.search.matching2.MatchLevel;
import org.eclipse.dltk.internal.core.search.matching.TypeReferencePattern;
import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.ClassType;
import org.eclipse.dltk.javascript.typeinfo.model.FunctionType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.MapType;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("restriction")
public class TypeReferencePredicate extends
		AbstractMatchingPredicate<MatchingNode> {

	final ITypeSystem context;

	/**
	 * @param pattern
	 * @param namePattern
	 */
	public TypeReferencePredicate(ITypeSystem context,
			TypeReferencePattern pattern) {
		super(pattern, pattern.simpleName);
		this.context = context;
	}

	public MatchLevel match(MatchingNode node) {
		if (node instanceof MethodDeclarationNode) {
			MethodDeclarationNode mNode = (MethodDeclarationNode) node;
			MatchLevel level = matchTypeName(mNode.method.getType());
			if (level != null) {
				return level;
			}
			for (IParameter parameter : mNode.method.getParameters()) {
				level = matchTypeName(parameter.getType());
				if (level != null) {
					return level;
				}
			}
		} else if (node instanceof FieldDeclarationNode) {
			FieldDeclarationNode fNode = (FieldDeclarationNode) node;
			return matchTypeName(fNode.declaredType);
		} else if (node instanceof LocalVariableDeclarationNode) {
			LocalVariableDeclarationNode vNode = (LocalVariableDeclarationNode) node;
			return matchTypeName(vNode.declaredType);
		}
		return null;
	}

	private void matchSimpleType(JSType type, AtomicReference<MatchLevel> result) {
		final Type t;
		if (type instanceof MapType) {
			t = Types.OBJECT;
		} else if (type instanceof ArrayType) {
			t = Types.ARRAY;
		} else if (type instanceof FunctionType) {
			t = Types.FUNCTION;
		} else if (type instanceof SimpleType) {
			t = ((SimpleType) type).getTarget();
		} else if (type instanceof ClassType) {
			t = ((ClassType) type).getTarget();
		} else {
			return;
		}
		if (t != null) {
			final MatchLevel m = matchName(t.getName());
			if (m != null) {
				final MatchLevel prev = result.get();
				if (prev == null || m.compareTo(prev) > 0) {
					result.set(m);
				}
			}
		}
	}

	public MatchLevel matchTypeName(JSType type) {
		if (type == null)
			return null;
		final AtomicReference<MatchLevel> result = new AtomicReference<MatchLevel>();
		matchSimpleType(type, result);
		if (result.get() == MatchLevel.ACCURATE_MATCH) {
			return result.get();
		}
		for (Iterator<EObject> i = type.eAllContents(); i.hasNext();) {
			final EObject child = i.next();
			if (child instanceof JSType) {
				matchSimpleType((JSType) child, result);
				if (result.get() == MatchLevel.ACCURATE_MATCH) {
					break;
				}
			}
		}
		return result.get();
	}
}
