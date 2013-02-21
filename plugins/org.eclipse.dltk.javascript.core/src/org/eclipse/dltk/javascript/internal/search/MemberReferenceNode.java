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

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.core.JSBindings;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;

public abstract class MemberReferenceNode extends
		AbstractMatchingNode<Identifier> {

	ReferenceLocation location;
	ReferenceKind kind;

	public MemberReferenceNode(Identifier node, ReferenceLocation location,
			ReferenceKind kind) {
		super(node);
		this.location = location;
		this.kind = kind;
	}

	public MemberReferenceNode(Identifier node) {
		this(node, null, null);
	}

	@Override
	public boolean needsResolve() {
		return location == null;
	}

	@Override
	public MatchingNode resolvePotentialMatch(JSBindings bindings) {
		if (location == null) {
			final IValueReference reference = bindings.get(node);
			if (reference != null) {
				final ReferenceLocation l = reference.getLocation();
				if (l != ReferenceLocation.UNKNOWN) {
					location = l;
					kind = reference.getKind();
				}
			} else {
				final ASTNode parent = node.getParent();
				if (parent instanceof PropertyExpression
						&& ((PropertyExpression) parent).getProperty() == node) {
					final IValueReference parentReference = bindings
							.get(parent);
					if (parentReference != null) {
						final ReferenceLocation l = parentReference
								.getLocation();
						if (l != ReferenceLocation.UNKNOWN) {
							location = l;
							kind = parentReference.getKind();
						}
					}
				}
			}
		}
		return this;
	}

}
