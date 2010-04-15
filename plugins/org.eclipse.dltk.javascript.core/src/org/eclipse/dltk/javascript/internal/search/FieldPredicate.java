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

import org.eclipse.dltk.internal.core.search.matching.FieldPattern;

public class FieldPredicate extends AbstractMatchingPredicate<MatchingNode> {

	private final boolean declarations;
	private final boolean references;

	public FieldPredicate(FieldPattern pattern) {
		super(pattern, pattern.name);
		this.declarations = pattern.findDeclarations;
		this.references = pattern.findReferences;
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
			return matchName(fieldNode.node.getName());
		} else {
			return null;
		}
	}

}
