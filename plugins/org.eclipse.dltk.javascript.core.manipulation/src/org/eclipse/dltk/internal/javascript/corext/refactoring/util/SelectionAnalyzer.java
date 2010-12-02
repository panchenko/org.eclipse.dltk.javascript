/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.corext.refactoring.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.javascript.core.dom.Expression;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.util.DomSwitch;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;



/**
 * Maps a selection to a set of AST nodes.
 */
public class SelectionAnalyzer extends DomSwitch<Boolean>{

	private Selection fSelection;
	private boolean fTraverseSelectedNode;
	private Node fLastCoveringNode;

	// Selected nodes
	private List<Node> fSelectedNodes;

	public SelectionAnalyzer(Selection selection, boolean traverseSelectedNode) {
		//super(true);
		Assert.isNotNull(selection);
		fSelection= selection;
		fTraverseSelectedNode= traverseSelectedNode;
	}

	public boolean hasSelectedNodes() {
		return fSelectedNodes != null && !fSelectedNodes.isEmpty();
	}

	public Node[] getSelectedNodes() {
		if (fSelectedNodes == null || fSelectedNodes.isEmpty())
			return new Node[0];
		return (Node[]) fSelectedNodes.toArray(new Node[fSelectedNodes.size()]);
	}

	public Node getFirstSelectedNode() {
		if (fSelectedNodes == null || fSelectedNodes.isEmpty())
			return null;
		return fSelectedNodes.get(0);
	}

	/*public ASTNode getLastSelectedNode() {
		if (fSelectedNodes == null || fSelectedNodes.isEmpty())
			return null;
		return (ASTNode)fSelectedNodes.get(fSelectedNodes.size() - 1);
	}*/

	public boolean isExpressionSelected() {
		if (!hasSelectedNodes())
			return false;
		return fSelectedNodes.get(0) instanceof Expression;
	}

	public IRegion getSelectedNodeRange() {
		if (fSelectedNodes == null || fSelectedNodes.isEmpty())
			return null;
		Node firstNode= fSelectedNodes.get(0);
		Node lastNode= fSelectedNodes.get(fSelectedNodes.size() - 1);
		int start= firstNode.getBegin();
		return new Region(start, lastNode.getEnd() - start);
	}

	public Node getLastCoveringNode() {
		return fLastCoveringNode;
	}

	protected Selection getSelection() {
		return fSelection;
	}

	//--- node management ---------------------------------------------------------*/
	
	public void traverse(Node node) {
		if (isTraverseNeeded(node))
			for(EObject item : node.eContents())
				traverse((Node)item);
		doSwitch(node);
	}

	public Boolean isTraverseNeeded(Node node) {
		// The selection lies behind the node.
		if (fSelection.liesOutside(node)) {
			return false;
		} else if (fSelection.covers(node)) {
			if (isFirstNode()) {
				handleFirstSelectedNode(node);
			} else {
				handleNextSelectedNode(node);
			}
			return fTraverseSelectedNode;
		} else if (fSelection.coveredBy(node)) {
			fLastCoveringNode= node;
			return true;
		} else if (fSelection.endsIn(node)) {
			return handleSelectionEndsIn(node);
		}
		// There is a possibility that the user has selected trailing semicolons that don't belong
		// to the statement. So dive into it to check if sub nodes are fully covered.
		return true;
	}

	protected void reset() {
		fSelectedNodes= null;
	}

	protected void handleFirstSelectedNode(Node node) {
		fSelectedNodes= new ArrayList<Node>(5);
		fSelectedNodes.add(node);
	}

	protected void handleNextSelectedNode(Node node) {
		if (getFirstSelectedNode().eContainer() == node.eContainer()) {
			fSelectedNodes.add(node);
		}
	}

	protected boolean handleSelectionEndsIn(Node node) {
		return false;
	}

	/*protected List internalGetSelectedNodes() {
		return fSelectedNodes;
	}*/

	private boolean isFirstNode() {
		return fSelectedNodes == null;
	}
}