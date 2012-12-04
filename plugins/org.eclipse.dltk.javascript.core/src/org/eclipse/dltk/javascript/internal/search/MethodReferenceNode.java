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

import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.search.MethodReferenceMatch;
import org.eclipse.dltk.core.search.SearchMatch;
import org.eclipse.dltk.core.search.SearchParticipant;
import org.eclipse.dltk.core.search.matching2.MatchLevel;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;

public class MethodReferenceNode extends MemberReferenceNode {

	public MethodReferenceNode(Identifier node) {
		super(node);
	}

	public MethodReferenceNode(Identifier node, ReferenceLocation location) {
		super(node, location, ReferenceKind.METHOD);
	}

	public SearchMatch createMatch(IModelElement element,
			SearchParticipant participant, MatchLevel level) {
		return new MethodReferenceMatch(element, level.toSearchMatchAccuracy(),
				node.sourceStart(), length(), false, participant,
				element.getResource());
	}

}
