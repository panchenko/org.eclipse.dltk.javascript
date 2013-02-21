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

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.search.FieldDeclarationMatch;
import org.eclipse.dltk.core.search.FieldReferenceMatch;
import org.eclipse.dltk.core.search.MethodDeclarationMatch;
import org.eclipse.dltk.core.search.MethodReferenceMatch;
import org.eclipse.dltk.core.search.SearchMatch;
import org.eclipse.dltk.core.search.SearchParticipant;
import org.eclipse.dltk.core.search.matching2.MatchLevel;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.core.JSBindings;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;

public class FieldReferenceNode extends MemberReferenceNode {

	public FieldReferenceNode(Identifier node) {
		super(node);
	}

	public FieldReferenceNode(Identifier node, ReferenceLocation location) {
		super(node, location, ReferenceKind.FIELD);
	}

	public SearchMatch createMatch(IModelElement element,
			SearchParticipant participant, MatchLevel level) {
		if (kind == ReferenceKind.FUNCTION) {
			if (location.getNameStart() == node.start()
					&& location.getNameEnd() == node.end()) {
				return new MethodDeclarationMatch(element,
						level.toSearchMatchAccuracy(), node.sourceStart(),
						length(), participant, element.getResource());
			} else {
				return new MethodReferenceMatch(element,
						level.toSearchMatchAccuracy(), node.sourceStart(),
						length(), true, true, false, participant,
						element.getResource(), node);
			}
		}
		if (location != null && location.getNameStart() == node.start()
				&& location.getNameEnd() == node.end()) {
			return new FieldDeclarationMatch(element,
					level.toSearchMatchAccuracy(), node.sourceStart(),
					length(), participant, element.getResource());
		}
		return new FieldReferenceMatch(element, node,
				level.toSearchMatchAccuracy(), node.sourceStart(), length(),
				true, true, false, participant, element.getResource());
	}

	@Override
	public MatchingNode resolvePotentialMatch(JSBindings bindings) {
		super.resolvePotentialMatch(bindings);
		if (kind == ReferenceKind.FUNCTION) {
			if (location.getNameStart() == node.start()
					&& location.getNameEnd() == node.end()) {
				IValueReference reference = bindings.get(node);
				if (reference == null) {
					final ASTNode parent = node.getParent();
					if (parent instanceof PropertyExpression
							&& ((PropertyExpression) parent).getProperty() == node) {
						reference = bindings
								.get(parent);
					}
				}
				if (reference != null) {
					IMethod method = (IMethod) reference
							.getAttribute(IReferenceAttributes.METHOD);
					if (method != null)
						return new MethodDeclarationNode(node, method);
				}
			} else {
				return new MethodReferenceNode(node, location);
			}
		}
		if (location != null && location.getNameStart() == node.start()
				&& location.getNameEnd() == node.end()) {
			// TODO where to get the JSType from? Reference for a
			// "this.test = 10" doesn't have it.
			return new FieldDeclarationNode(node, location.getSourceModule(),
					null);
		}
		return this;
	}

}
