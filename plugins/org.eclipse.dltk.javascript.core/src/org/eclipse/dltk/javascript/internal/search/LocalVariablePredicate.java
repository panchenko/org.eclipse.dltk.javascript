package org.eclipse.dltk.javascript.internal.search;

import org.eclipse.dltk.core.ILocalVariable;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.search.matching2.AbstractMatchingPredicate;
import org.eclipse.dltk.core.search.matching2.MatchLevel;
import org.eclipse.dltk.internal.core.search.matching.LocalVariablePattern;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;

public class LocalVariablePredicate extends
		AbstractMatchingPredicate<MatchingNode> {

	private final boolean declarations;
	private final boolean references;

	private final ISourceModule module;
	private final int nameStart;
	private final int nameEnd;

	public LocalVariablePredicate(LocalVariablePattern pattern) {
		super(pattern, pattern.name);
		final ILocalVariable variable = pattern.getLocalVariable();
		this.module = (ISourceModule) variable
				.getAncestor(IModelElement.SOURCE_MODULE);
		final ISourceRange name = variable.getNameRange();
		this.nameStart = name.getOffset();
		this.nameEnd = name.getOffset() + name.getLength();
		this.declarations = pattern.findDeclarations;
		this.references = pattern.findReferences;
	}

	public MatchLevel match(MatchingNode node) {
		if (node instanceof LocalVariableDeclarationNode) {
			if (!declarations)
				return null;
			final LocalVariableDeclarationNode varNode = (LocalVariableDeclarationNode) node;
			if (varNode.node.sourceStart() == nameStart
					&& varNode.node.sourceEnd() == nameEnd
					&& isSame(varNode.module)) {
				return matchName(varNode.node.getName());
			}
		} else if (node instanceof LocalVariableReferenceNode) {
			if (!references)
				return null;
			final LocalVariableReferenceNode varNode = (LocalVariableReferenceNode) node;
			final ReferenceLocation location = varNode.declarationLoc;
			if (location.getNameStart() == nameStart
					&& location.getNameEnd() == nameEnd
					&& isSame(location.getSourceModule())) {
				return matchName(varNode.node.getName());
			}
		}
		return null;
	}

	private boolean isSame(ISourceModule module) {
		return module != null && module.equals(this.module);
	}

}
