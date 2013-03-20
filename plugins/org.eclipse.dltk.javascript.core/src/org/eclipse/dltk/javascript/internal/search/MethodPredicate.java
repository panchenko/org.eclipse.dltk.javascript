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

import java.util.List;

import org.eclipse.dltk.compiler.CharOperation;
import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.search.SearchPattern;
import org.eclipse.dltk.core.search.matching2.AbstractMatchingPredicate;
import org.eclipse.dltk.core.search.matching2.IMatchingPredicate;
import org.eclipse.dltk.core.search.matching2.MatchLevel;
import org.eclipse.dltk.internal.core.search.matching.MethodDeclarationPattern;
import org.eclipse.dltk.internal.core.search.matching.MethodPattern;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;

@SuppressWarnings("restriction")
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
			if (nameStart != -1 && nameEnd != -1 && mNode.method != null) {
				if (nameStart == mNode.sourceStart()
						&& nameEnd == mNode.sourceEnd()
						&& isSame(mNode.method.getLocation().getSourceModule())) {
					return matchName(mNode.getName());
				}
			} else {
				return matchName(mNode.getName());
			}
		} else if (node instanceof FieldDeclarationNode) {
			if (!declarations)
				return null;
			final FieldDeclarationNode fNode = (FieldDeclarationNode) node;
			if (nameStart != -1 && nameEnd != -1) {
				if (nameStart == fNode.sourceStart()
						&& nameEnd == fNode.sourceEnd() && isSame(fNode.module)) {
					return matchName(fNode.getName());
				}
			} else {
				return matchName(fNode.getName());
			}
		} else if (node instanceof MethodReferenceNode) {
			if (!references)
				return null;
			final MethodReferenceNode mNode = (MethodReferenceNode) node;
			if (nameStart != -1 && nameEnd != -1) {
				final ReferenceLocation location = mNode.location;
				if (location != null) {
					if (location.getNameStart() == nameStart
							&& location.getNameEnd() == nameEnd
							&& isSame(location.getSourceModule())) {
						return matchName(mNode.node.getName(),
								MatchLevel.ACCURATE_MATCH);
					}
				} else {
					return matchName(mNode.node.getName());
				}
			} else {
				return matchName(mNode.node.getName(),
						MatchLevel.INACCURATE_MATCH);
			}
		} else if (node instanceof FieldReferenceNode) {
			if (!references)
				return null;
			// also test if the field does reference that function.
			final FieldReferenceNode mNode = (FieldReferenceNode) node;
			if (nameStart != -1 && nameEnd != -1) {
				final ReferenceLocation location = mNode.location;
				if (location != null) {
					if (location.getNameStart() == nameStart
							&& location.getNameEnd() == nameEnd
							&& isSame(location.getSourceModule())) {
						return matchName(mNode.node.getName(),
								MatchLevel.ACCURATE_MATCH);
					}
				} else {
					return matchName(mNode.node.getName());
				}
			} else {
				return matchName(mNode.node.getName(),
						MatchLevel.INACCURATE_MATCH);
			}
		} else if (node instanceof LocalVariableReferenceNode) {
			if (!references)
				return null;
			// also test if the field does reference that function.
			final LocalVariableReferenceNode varNode = (LocalVariableReferenceNode) node;
			if (nameStart != -1 && nameEnd != -1) {
				final ReferenceLocation location = varNode.declarationLoc;
				if (location != null) {
					if (location.getNameStart() == nameStart
							&& location.getNameEnd() == nameEnd
							&& isSame(location.getSourceModule())) {
						return matchName(varNode.node.getName(),
								MatchLevel.ACCURATE_MATCH);
					}
				} else {
					return matchName(varNode.node.getName());
				}
			} else {
				return matchName(varNode.node.getName(),
						MatchLevel.INACCURATE_MATCH);
			}
		} else if (node instanceof LocalVariableDeclarationNode) {
			if (!declarations)
				return null;
			final LocalVariableDeclarationNode varNode = (LocalVariableDeclarationNode) node;
			if (varNode.node.sourceStart() == nameStart
					&& varNode.node.sourceEnd() == nameEnd
					&& isSame(varNode.module)) {
				return matchName(varNode.node.getName(), MatchLevel.ACCURATE_MATCH);
			}
		}
		return null;
	}

	@Override
	public MatchLevel resolvePotentialMatch(MatchingNode node) {
		if (nameStart != -1 && nameEnd != -1) {
			if (node instanceof MemberReferenceNode) {
				final MemberReferenceNode mNode = (MemberReferenceNode) node;
				final ReferenceLocation location = mNode.location;
				return location != null && location.getNameStart() == nameStart
						&& location.getNameEnd() == nameEnd
						&& isSame(location.getSourceModule()) ? MatchLevel.ACCURATE_MATCH
						: null;
			} else if (node instanceof MethodDeclarationNode) {
				Expression exp = ((MethodDeclarationNode) node).node;
				if (exp != null && exp.sourceStart() == nameStart
						&& exp.sourceEnd() == nameEnd
						&& isSame(((MethodDeclarationNode) node).method
								.getLocation().getSourceModule())) {
					return MatchLevel.ACCURATE_MATCH;
				}
			}
		}
		return super.resolvePotentialMatch(node);
	}

	private boolean isSame(ISourceModule module) {
		return module != null && module.equals(this.module);
	}

	@Override
	protected void collectToStringOptions(List<String> options) {
		super.collectToStringOptions(options);
		if (declarations) {
			options.add("declarations");
		}
		if (references) {
			options.add("references");
		}
	}

	@Override
	public boolean contains(IMatchingPredicate<MatchingNode> predicate) {
		if (predicate instanceof MethodPredicate) {
			final MethodPredicate other = (MethodPredicate) predicate;
			if (CharOperation.equals(namePattern, other.namePattern)
					&& (module != null && module.equals(other.module))
					&& nameStart == other.nameStart && nameEnd == other.nameEnd
					&& (references || references == other.references)
					&& (declarations || declarations == other.declarations)) {
				return true;
			}
		}
		return super.contains(predicate);
	}

}
