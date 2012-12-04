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

import org.eclipse.dltk.core.search.SearchPattern;
import org.eclipse.dltk.core.search.matching2.IMatchingPredicate;
import org.eclipse.dltk.core.search.matching2.OrMatchingPredicate;
import org.eclipse.dltk.internal.core.search.matching.FieldPattern;
import org.eclipse.dltk.internal.core.search.matching.LocalVariablePattern;
import org.eclipse.dltk.internal.core.search.matching.MethodDeclarationPattern;
import org.eclipse.dltk.internal.core.search.matching.MethodPattern;
import org.eclipse.dltk.internal.core.search.matching.OrPattern;
import org.eclipse.dltk.internal.core.search.matching.TypeReferencePattern;
import org.eclipse.dltk.javascript.typeinfo.ITypeInfoContext;

@SuppressWarnings("restriction")
public class MatchingPredicateFactory {

	static IMatchingPredicate<MatchingNode> create(ITypeInfoContext context,
			SearchPattern pattern) {
		if (pattern instanceof FieldPattern) {
			return new FieldPredicate((FieldPattern) pattern);
		} else if (pattern instanceof MethodPattern) {
			return new MethodPredicate((MethodPattern) pattern);
		} else if (pattern instanceof MethodDeclarationPattern) {
			return new MethodPredicate((MethodDeclarationPattern) pattern);
		} else if (pattern instanceof TypeReferencePattern) {
			return new TypeReferencePredicate(context,
					(TypeReferencePattern) pattern);
		} else if (pattern instanceof LocalVariablePattern) {
			return new LocalVariablePredicate((LocalVariablePattern) pattern);
		} else if (pattern instanceof OrPattern) {
			OrMatchingPredicate<MatchingNode> predicate = new OrMatchingPredicate<MatchingNode>();
			for (SearchPattern p : ((OrPattern) pattern).getPatterns()) {
				final IMatchingPredicate<MatchingNode> pp = create(context, p);
				if (pp != null) {
					predicate.addPredicate(pp);
				}
			}
			return predicate.optimize();
		}
		return null;
	}
}
