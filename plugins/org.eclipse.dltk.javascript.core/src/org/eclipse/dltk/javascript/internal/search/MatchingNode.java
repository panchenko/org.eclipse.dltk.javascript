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
import org.eclipse.dltk.core.search.SearchMatch;
import org.eclipse.dltk.core.search.SearchParticipant;
import org.eclipse.dltk.core.search.matching2.MatchLevel;
import org.eclipse.dltk.javascript.core.JSBindings;

public interface MatchingNode {

	int sourceStart();

	int sourceEnd();

	int length();

	/**
	 * Answers if this node needs resolving.
	 */
	boolean needsResolve();

	/**
	 * Resolves the target of this node after it was potentially matched.
	 * Returns <code>true</code> if node was successfully resolved.
	 */
	boolean resolvePotentialMatch(JSBindings bindings);

	/**
	 * @param element
	 *            the element of this search match. In case of a reference
	 *            match, this is the inner-most enclosing element of the
	 *            reference. In case of a declaration match, this is the
	 *            declaration.
	 * @param participant
	 */
	SearchMatch createMatch(IModelElement element,
			SearchParticipant participant, MatchLevel matchLevel);

}
