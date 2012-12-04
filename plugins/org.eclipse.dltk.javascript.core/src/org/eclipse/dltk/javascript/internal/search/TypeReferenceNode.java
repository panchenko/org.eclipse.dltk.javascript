/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.search;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.search.SearchMatch;
import org.eclipse.dltk.core.search.SearchParticipant;
import org.eclipse.dltk.core.search.TypeReferenceMatch;
import org.eclipse.dltk.core.search.matching2.MatchLevel;

public class TypeReferenceNode extends AbstractMatchingNode<ASTNode> {


	final Collection<String> typeNames;

	public TypeReferenceNode(ASTNode node, String typeName) {
		super(node);
		this.typeNames = Collections.singletonList(typeName);
	}

	public TypeReferenceNode(ASTNode node, Collection<String> typeNames) {
		super(node);
		this.typeNames = typeNames;
	}

	public SearchMatch createMatch(IModelElement element,
			SearchParticipant participant, MatchLevel level) {
		return new TypeReferenceMatch(element, level.toSearchMatchAccuracy(),
				node.sourceStart(), length(), false, participant,
				element.getResource());
	}

}
