/*******************************************************************************
 * Copyright (c) 2000, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.corext.refactoring.util;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.SourceRange;
import org.eclipse.dltk.internal.corext.refactoring.base.ScriptStatusContext;
import org.eclipse.dltk.internal.javascript.corext.refactoring.RefactoringCoreMessages;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.Source;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.RefactoringStatusContext;


/**
 * Analyzer to check if a selection covers a valid set of statements of an abstract syntax
 * tree. The selection is valid iff
 * <ul>
 * 	<li>it does not start or end in the middle of a comment. (TODO)</li>
 * 	<li>no extract characters except the empty statement ";" is included in the selection.</li>
 * </ul>
 */
public class StatementAnalyzer extends SelectionAnalyzer {
	protected ISourceModule fCUnit;
	//private TokenScanner fScanner;
	private RefactoringStatus fStatus;

	public StatementAnalyzer(ISourceModule cunit, Selection selection, boolean traverseSelectedNode) {
		super(selection, traverseSelectedNode);
		Assert.isNotNull(cunit);
		fCUnit= cunit;
		fStatus= new RefactoringStatus();
		//fScanner= new TokenScanner(fCUnit);
	}

	protected void checkSelectedNodes() {
		Node[] nodes= getSelectedNodes();
		if (nodes.length == 0)
			return;
		Node first = nodes[0];
		Node last = nodes[nodes.length-1];
		if (first.eContainingFeature() != last.eContainingFeature()) {
			SourceRange range = new SourceRange(getSelection().getOffset(),getSelection().getLength());
			invalidSelection(RefactoringCoreMessages.StatementAnalyzer_doesNotCover, ScriptStatusContext.create(fCUnit, range));
		}
	}

	public RefactoringStatus getStatus() {
		return fStatus;
	}

	/*protected ISourceModule getCompilationUnit() {
		return fCUnit;
	}

	protected TokenScanner getTokenScanner() {
		return fScanner;
	}*/

	public Boolean caseSource(Source node) {
		if (hasSelectedNodes() && !fStatus.hasFatalError())
			checkSelectedNodes();
		return null;
	}

	/*private boolean doAfterValidation(Node node, Node[] selectedNodes) {
		return selectedNodes.length > 0 && node == selectedNodes[0].eContainer() && getSelection().getEndVisitSelectionMode(node) == Selection.AFTER;
	}

	protected void invalidSelection(String message) {
		fStatus.addFatalError(message);
		reset();
	}*/

	protected void invalidSelection(String message, RefactoringStatusContext context) {
		fStatus.addFatalError(message, context);
		reset();
	}

	/*private static List getSwitchCases(SwitchStatement node) {
		List result= new ArrayList();
		for (Iterator iter= node.statements().iterator(); iter.hasNext(); ) {
			Object element= iter.next();
			if (element instanceof SwitchCase)
				result.add(element);
		}
		return result;
	}*/

	/*protected static boolean contains(Node[] nodes, Node node) {
		for (int i = 0; i < nodes.length; i++) {
			if (nodes[i] == node)
				return true;
		}
		return false;
	}*/

	/*protected static boolean contains(ASTNode[] nodes, List list) {
		for (int i = 0; i < nodes.length; i++) {
			if (list.contains(nodes[i]))
				return true;
		}
		return false;
	}*/
}
