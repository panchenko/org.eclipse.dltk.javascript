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
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IModelElementVisitor;
import org.eclipse.dltk.core.IModelElementVisitorExtension;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.ISourceReference;
import org.eclipse.dltk.core.search.IDLTKSearchScope;
import org.eclipse.dltk.core.search.SearchDocument;
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
import org.eclipse.dltk.javascript.typeinfo.ReferenceSource;

public class JavaScriptMatchLocator implements IMatchLocator,
		IModelElementVisitor, IModelElementVisitorExtension {

	private static final boolean VERBOSE = DLTKCore.VERBOSE_SEARCH;

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
				.create(inferencer2, pattern);
		if (predicate == null) {
			return;
		}

		final MatchingCollector<MatchingNode> matchingCollector = new MatchingCollector<MatchingNode>(
				predicate, nodeSet);
		for (SearchDocument document : searchDocuments) {
			// TODO report progress
			final ISourceModule module = moduleFactory.create(document);
			if (module == null)
				continue;
			final JavaScriptMatchLocatorVisitor visitor = new JavaScriptMatchLocatorVisitor(
					ReferenceSource.create(module));
			nodeSet.clear();
			final Script script = JavaScriptParserUtil.parse(module);
			visitor.visitScript(script);
			visitor.resolveMatchingNodes(inferencer2, script, module);
			visitor.report(matchingCollector);
			if (!nodeSet.isEmpty()) {
				if (VERBOSE) {
					System.out.println(String.format(
							"- matches in %s: accurate=%d, possible=%d",
							document, nodeSet.countMatchingNodes(),
							nodeSet.countPossibleMatchingNodes()));
				}
				resolvePotentialMatches(predicate);
				participant = document.getParticipant();
				// report matches according to the module structure
				module.accept(this);
				// report remaining matches - the ones at the module level
				for (MatchingNode matchingNode : nodeSet.matchingNodes()) {
					final MatchLevel level = nodeSet
							.removeTrustedMatch(matchingNode);
					if (level != null) {
						requestor.acceptSearchMatch(matchingNode.createMatch(
								module, participant, level));
					}
				}
			} else {
				if (VERBOSE) {
					System.out.println("- no matches in " + document);
				} else if (DLTKCore.DEBUG) {
					JavaScriptPlugin.warning("No matches located in "
							+ document);
				}
			}
		}
	}

	private void resolvePotentialMatches(
			final IMatchingPredicate<MatchingNode> predicate) {
		for (MatchingNode node : nodeSet.getPossibleMatchingNodes()) {
			final MatchLevel level = predicate.resolvePotentialMatch(node);
			if (level != null && level != MatchLevel.POSSIBLE_MATCH) {
				nodeSet.addMatch(node, level);
			}
		}
		nodeSet.clearPossibleMatchingNodes();
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
			// TODO (alex) also capture nodes covered by member JSDoc
			List<MatchingNode> matchingNodes = nodeSet.matchingNodes(
					range.getOffset(), range.getOffset() + range.getLength());
			for (MatchingNode node : matchingNodes) {
				final MatchLevel level = nodeSet.removeTrustedMatch(node);
				if (level != null) {
					requestor.acceptSearchMatch(node.createMatch(element,
							participant, level));
				}
			}
		} catch (CoreException e) {
			JavaScriptPlugin.error(e);
		}
	}

	public void setProgressMonitor(IProgressMonitor progressMonitor) {
		this.progressMonitor = progressMonitor;
	}

	public void setRequestor(SearchRequestor requestor) {
		this.requestor = requestor;
	}

}
