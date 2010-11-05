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
import org.eclipse.dltk.core.search.matching2.AbstractMatchingPredicate;
import org.eclipse.dltk.core.search.matching2.MatchLevel;
import org.eclipse.dltk.internal.core.search.matching.FieldPattern;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;

public class FieldPredicate extends AbstractMatchingPredicate<MatchingNode> {

	private final boolean declarations;
	private final boolean references;

	private final ISourceModule module;
	private final int nameStart;
	private final int nameEnd;

	public FieldPredicate(FieldPattern pattern) {
		super(pattern, pattern.name);
		this.declarations = pattern.findDeclarations;
		this.references = pattern.findReferences;

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
		if (node instanceof FieldDeclarationNode) {
			if (!declarations)
				return null;
			final FieldDeclarationNode fieldNode = (FieldDeclarationNode) node;
			return matchName(fieldNode.node.getName());
		} else if (node instanceof FieldReferenceNode) {
			if (!references)
				return null;
			final FieldReferenceNode fieldNode = (FieldReferenceNode) node;

			final ReferenceLocation location = fieldNode.getReferenceLocation();
			if (location != null && nameStart != -1 && nameEnd != -1) {
				if (location.getNameStart() == nameStart
						&& location.getNameEnd() == nameEnd
						&& isSame(location.getSourceModule())) {
					return matchName(fieldNode.node.getName());
				}
			} else {
				return matchName(fieldNode.node.getName());
			}

		}
		return null;
	}

	private boolean isSame(ISourceModule module) {
		return module != null && module.equals(this.module);
	}

}
