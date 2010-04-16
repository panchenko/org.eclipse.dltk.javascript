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

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IModelElementVisitor;
import org.eclipse.dltk.core.IModelElementVisitorExtension;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.ISourceReference;
import org.eclipse.dltk.core.search.BasicSearchEngine;
import org.eclipse.dltk.core.search.FieldDeclarationMatch;
import org.eclipse.dltk.core.search.FieldReferenceMatch;
import org.eclipse.dltk.core.search.IDLTKSearchScope;
import org.eclipse.dltk.core.search.SearchDocument;
import org.eclipse.dltk.core.search.SearchMatch;
import org.eclipse.dltk.core.search.SearchParticipant;
import org.eclipse.dltk.core.search.SearchPattern;
import org.eclipse.dltk.core.search.SearchRequestor;
import org.eclipse.dltk.core.search.matching.IMatchLocator;
import org.eclipse.dltk.core.search.matching.ModuleFactory;
import org.eclipse.dltk.core.search.matching2.IMatchingPredicate;
import org.eclipse.dltk.core.search.matching2.MatchLevel;
import org.eclipse.dltk.core.search.matching2.MatchingCollector;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;

public class JavaScriptMatchLocator implements IMatchLocator,
		IModelElementVisitor, IModelElementVisitorExtension {

	private IProgressMonitor progressMonitor;
	private SearchRequestor requestor;

	private IDLTKSearchScope scope;
	private SearchPattern pattern;

	public void initialize(SearchPattern pattern, IDLTKSearchScope scope) {
		this.pattern = pattern;
		this.scope = scope;
	}

	private JavaScriptMatchingNodeSet nodeSet = new JavaScriptMatchingNodeSet();
	private SearchParticipant participant;

	public void locateMatches(SearchDocument[] searchDocuments)
			throws CoreException {
		Assert.isNotNull(requestor);
		final ModuleFactory moduleFactory = new ModuleFactory(scope);
		final TypeInferencer2 inferencer2 = new TypeInferencer2();
		final IMatchingPredicate<MatchingNode> predicate = MatchingPredicateFactory
				.create(pattern);
		inferencer2.setVisitor(new JavaScriptMatchingVisitor(inferencer2,
				new MatchingCollector<MatchingNode>(predicate, nodeSet)));
		for (SearchDocument document : searchDocuments) {
			// TODO report progress
			final ISourceModule module = moduleFactory.create(document);
			if (module == null)
				continue;
			nodeSet.clear();
			inferencer2.setModelElement(module);
			final Script script = JavaScriptParserUtil.parse(module);
			inferencer2.doInferencing(script);
			if (!nodeSet.isEmpty()) {
				resolvePotentialMatches(nodeSet);
				participant = document.getParticipant();
				module.accept(this);
			}
			for (MatchingNode matchingNode : nodeSet.matchingNodes()) {
				report(matchingNode, module);
			}
		}
	}

	private void resolvePotentialMatches(JavaScriptMatchingNodeSet nodeSet) {
		for (MatchingNode node : nodeSet.getPossibleMatchingNodes()) {
			nodeSet.addMatch(node, MatchLevel.ACCURATE_MATCH);
		}
		nodeSet.clearPossibleMatchingNodes();
		if (BasicSearchEngine.VERBOSE) {
			System.out
					.print("	- node set: accurate=" + nodeSet.countMatchingNodes() + ", possible=" + nodeSet.countPossibleMatchingNodes()); //$NON-NLS-1$
		}
	}

	public boolean visit(IModelElement element) {
		return element instanceof ISourceModule || element instanceof IMember;
	}

	public void endVisit(IModelElement element) {
		if (!(element instanceof IMember)) {
			return;
		}
		try {
			final ISourceRange range = ((ISourceReference) element)
					.getSourceRange();
			List<MatchingNode> matchingNodes = nodeSet.matchingNodes(range
					.getOffset(), range.getOffset() + range.getLength());
			for (MatchingNode node : matchingNodes) {
				nodeSet.removeTrustedMatch(node);
				report(node, element);
			}
		} catch (CoreException e) {
			JavaScriptPlugin.error(e);
		}
	}

	protected void report(MatchingNode node, IModelElement element)
			throws CoreException {
		if (node instanceof FieldDeclarationNode) {
			requestor.acceptSearchMatch(new FieldDeclarationMatch(element,
					SearchMatch.A_ACCURATE
					/* accuracy */, node.sourceStart(), node.sourceEnd()
							- node.sourceStart(), participant, element
							.getResource()));
		} else if (node instanceof FieldReferenceNode) {
			requestor.acceptSearchMatch(new FieldReferenceMatch(element,
					((FieldReferenceNode) node).node, SearchMatch.A_ACCURATE
					/* accuracy */, node.sourceStart(), node.sourceEnd()
							- node.sourceStart(), true, true, false,
					participant, element.getResource()));
		}
		// TODO Auto-generated method stub

	}

	public void setProgressMonitor(IProgressMonitor progressMonitor) {
		this.progressMonitor = progressMonitor;
	}

	public void setRequestor(SearchRequestor requestor) {
		this.requestor = requestor;
	}

}
