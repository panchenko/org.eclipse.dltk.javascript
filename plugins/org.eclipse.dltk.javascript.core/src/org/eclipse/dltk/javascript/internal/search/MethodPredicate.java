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

import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.search.SearchPattern;
import org.eclipse.dltk.core.search.matching2.AbstractMatchingPredicate;
import org.eclipse.dltk.core.search.matching2.MatchLevel;
import org.eclipse.dltk.internal.core.search.matching.MethodDeclarationPattern;
import org.eclipse.dltk.internal.core.search.matching.MethodPattern;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;

public class MethodPredicate extends AbstractMatchingPredicate<MatchingNode> {

	private final boolean declarations;
	private final boolean references;

	private final ISourceModule module;
	private final int nameStart;
	private final int nameEnd;

	public MethodPredicate(MethodPattern pattern) {
		this(pattern, pattern.selector, pattern.findDeclarations,
				pattern.findReferences);
	}

	public MethodPredicate(MethodDeclarationPattern pattern) {
		this(pattern, pattern.simpleName, true, false);
	}

	private MethodPredicate(SearchPattern pattern, char[] pat,
			boolean declarations, boolean references) {
		super(pattern, pat);
		this.declarations = declarations;
		this.references = references;
		ISourceRange nameRange = null;
		if (pattern.focus instanceof IMember) {
			try {
				nameRange = ((IMember) pattern.focus).getNameRange();
			} catch (ModelException e) {
			}
		}

		if (nameRange != null) {
			nameStart = nameRange.getOffset();
			nameEnd = nameStart + nameRange.getLength();
			if (pattern.focus != null)
				module = (ISourceModule) pattern.focus
						.getAncestor(IModelElement.SOURCE_MODULE);
			else
				module = null;
		} else {
			nameStart = -1;
			nameEnd = -1;
			module = null;
		}
	}

	public MatchLevel match(MatchingNode node) {
		if (node instanceof MethodDeclarationNode) {
			if (!declarations)
				return null;
			final MethodDeclarationNode mNode = (MethodDeclarationNode) node;
			return matchName(mNode.getName());
		} else if (node instanceof MethodReferenceNode) {
			if (!references)
				return null;
			final MethodReferenceNode mNode = (MethodReferenceNode) node;
			final ReferenceLocation location = mNode.location;
			if (location != null && nameStart != -1 && nameEnd != -1) {
				if (location.getNameStart() == nameStart
						&& location.getNameEnd() == nameEnd
						&& isSame(location.getSourceModule())) {
					return matchName(mNode.node.getName());
				}
			} else {
				return matchName(mNode.node.getName());
			}
		} else if (node instanceof FieldReferenceNode) {
			if (!references)
				return null;
			// also test if the field does reference that function.
			final FieldReferenceNode mNode = (FieldReferenceNode) node;
			final ReferenceLocation location = mNode.location;
			if (location != null && nameStart != -1 && nameEnd != -1) {
				if (location.getNameStart() == nameStart
						&& location.getNameEnd() == nameEnd
						&& isSame(location.getSourceModule())) {
					return matchName(mNode.node.getName());
				}
			}
		} else if (node instanceof LocalVariableReferenceNode) {
			if (!references)
				return null;
			// also test if the field does reference that function.
			final LocalVariableReferenceNode varNode = (LocalVariableReferenceNode) node;
			final ReferenceLocation location = varNode.declarationLoc;
			if (location != null && nameStart != -1 && nameEnd != -1) {
				if (location.getNameStart() == nameStart
						&& location.getNameEnd() == nameEnd
						&& isSame(location.getSourceModule())) {
					return matchName(varNode.node.getName());
				}
			}
		}
		return null;
	}

	private boolean isSame(ISourceModule module) {
		return module != null && module.equals(this.module);
	}
}
