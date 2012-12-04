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

import java.util.Collection;

import org.eclipse.dltk.compiler.CharOperation;
import org.eclipse.dltk.core.DLTKLanguageManager;
import org.eclipse.dltk.core.ISearchPatternProcessor;
import org.eclipse.dltk.core.search.matching2.AbstractMatchingPredicate;
import org.eclipse.dltk.core.search.matching2.MatchLevel;
import org.eclipse.dltk.internal.core.search.matching.TypeReferencePattern;
import org.eclipse.dltk.internal.javascript.parser.structure.StructureRequestor;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

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
		super(pattern, concat(pattern.qualification, pattern.simpleName));
		this.context = context;
	}

	private static char[] concat(char[] qualification, char[] simpleName) {
		if (qualification != null) {
			final ISearchPatternProcessor patternProcessor = DLTKLanguageManager
					.getSearchPatternProcessor(JavaScriptNature.NATURE_ID);
			final char[] separator = (patternProcessor != null ? patternProcessor
					.getDelimiterReplacementString() : "/").toCharArray();
			return CharOperation.concat(CharOperation.replace(qualification,
					new char[] { '$' }, separator), separator, simpleName);
		}
		return simpleName;
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
		} else if (node instanceof LocalVariableDeclarationNode
				&& !(node instanceof ArgumentDeclarationNode)) {
			LocalVariableDeclarationNode vNode = (LocalVariableDeclarationNode) node;
			return matchTypeName(vNode.declaredType);
		} else if (node instanceof TypeReferenceNode) {
			final TypeReferenceNode ref = (TypeReferenceNode) node;
			return matchTypeNames(ref.typeNames);
		}
		return null;
	}

	private MatchLevel matchTypeNames(final Collection<String> typeNames) {
		MatchLevel result = null;
		for (String typeName : typeNames) {
			final MatchLevel level = matchName(typeName,
					MatchLevel.ACCURATE_MATCH);
			if (level != null
					&& (result == null || level.compareTo(result) > 0)) {
				result = level;
			}
		}
		return result;
	}

	private MatchLevel matchTypeName(JSType type) {
		if (type == null)
			return null;
		return matchTypeNames(StructureRequestor
				.collectContainedTypeNames(type));
	}
}
