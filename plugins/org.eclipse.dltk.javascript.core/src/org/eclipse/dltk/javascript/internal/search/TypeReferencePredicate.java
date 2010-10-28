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

import org.eclipse.dltk.core.search.matching2.AbstractMatchingPredicate;
import org.eclipse.dltk.core.search.matching2.MatchLevel;
import org.eclipse.dltk.internal.core.search.matching.TypeReferencePattern;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class TypeReferencePredicate extends
		AbstractMatchingPredicate<MatchingNode> {

	/**
	 * @param pattern
	 * @param namePattern
	 */
	public TypeReferencePredicate(TypeReferencePattern pattern) {
		super(pattern, pattern.simpleName);
	}

	public MatchLevel match(MatchingNode node) {
		if (node instanceof MethodDeclarationNode) {
			MethodDeclarationNode mNode = (MethodDeclarationNode) node;
			MatchLevel level = matchName(mNode.method.getType());
			if (level != null) {
				return level;
			}
			for (IParameter parameter : mNode.method.getParameters()) {
				level = matchName(parameter.getType());
				if (level != null) {
					return level;
				}
			}
		} else if (node instanceof FieldDeclarationNode) {
			FieldDeclarationNode fNode = (FieldDeclarationNode) node;
			return matchType(fNode.declaredType);
		}
		return null;
	}

	/**
	 * @param type
	 * @return
	 */
	private MatchLevel matchType(Type type) {
		if (type == null)
			return null;
		return matchName(type.getName());
	}

}
