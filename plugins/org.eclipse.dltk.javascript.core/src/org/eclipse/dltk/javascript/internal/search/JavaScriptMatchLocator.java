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
import org.eclipse.dltk.core.search.LocalVariableDeclarationMatch;
import org.eclipse.dltk.core.search.LocalVariableReferenceMatch;
import org.eclipse.dltk.core.search.MethodDeclarationMatch;
import org.eclipse.dltk.core.search.MethodReferenceMatch;
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
import org.eclipse.dltk.internal.javascript.parser.structure.StructureContext;
import org.eclipse.dltk.internal.javascript.parser.structure.StructureReporter3;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;
import org.eclipse.dltk.javascript.structure.IStructureNode;
import org.eclipse.dltk.javascript.typeinfo.ReferenceSource;

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
				.create(inferencer2, pattern);
		if (predicate == null) {
			return;
		}

		final MatchingCollectorSourceElementRequestor matchingCollectorRequestor = new MatchingCollectorSourceElementRequestor(
				new MatchingCollector<MatchingNode>(predicate, nodeSet));
		for (SearchDocument document : searchDocuments) {
			// TODO report progress
			final ISourceModule module = moduleFactory.create(document);
			if (module == null)
				continue;
			StructureReporter3 visitor = new StructureReporter3(
					new ReferenceSource(module));
			nodeSet.clear();
			final Script script = JavaScriptParserUtil.parse(module);
			final IStructureNode structureNode = visitor.visitScript(script);
			structureNode.reportStructure(matchingCollectorRequestor,
					StructureContext.ROOT);
			matchingCollectorRequestor.report();
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
			List<MatchingNode> matchingNodes = nodeSet.matchingNodes(
					range.getOffset(), range.getOffset() + range.getLength());
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
					SearchMatch.A_ACCURATE, node.sourceStart(), length(node),
					participant, element.getResource()));
		} else if (node instanceof FieldReferenceNode) {
			requestor.acceptSearchMatch(new FieldReferenceMatch(element,
					((FieldReferenceNode) node).node, SearchMatch.A_ACCURATE,
					node.sourceStart(), length(node), true, true, false,
					participant, element.getResource()));
		} else if (node instanceof MethodDeclarationNode) {
			requestor.acceptSearchMatch(new MethodDeclarationMatch(element,
					SearchMatch.A_ACCURATE, node.sourceStart(), length(node),
					participant, element.getResource()));
		} else if (node instanceof MethodReferenceNode) {
			requestor.acceptSearchMatch(new MethodReferenceMatch(element,
					SearchMatch.A_ACCURATE, node.sourceStart(), length(node),
					false, participant, element.getResource()));
		} else if (node instanceof LocalVariableDeclarationNode
				|| node instanceof ArgumentDeclarationNode) {
			requestor.acceptSearchMatch(new LocalVariableDeclarationMatch(
					element, SearchMatch.A_ACCURATE, node.sourceStart(),
					length(node), participant, element.getResource()));
		} else if (node instanceof LocalVariableReferenceNode) {
			requestor.acceptSearchMatch(new LocalVariableReferenceMatch(
					element, SearchMatch.A_ACCURATE, node.sourceStart(),
					length(node), true, true, false, participant, element
							.getResource()));
		} else {
			throw new IllegalArgumentException(node.getClass().getName()
					+ " support not implemented");
		}
	}

	private static int length(MatchingNode node) {
		return node.sourceEnd() - node.sourceStart();
	}

	public void setProgressMonitor(IProgressMonitor progressMonitor) {
		this.progressMonitor = progressMonitor;
	}

	public void setRequestor(SearchRequestor requestor) {
		this.requestor = requestor;
	}

}
