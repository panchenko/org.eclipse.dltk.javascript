/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladislav Kuzkokov)
 *******************************************************************************/
package org.eclipse.dltk.javascript.core.dom.rewrite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.search.SearchMatch;
import org.eclipse.dltk.javascript.core.dom.DomPackage;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.Source;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class NodeFinder {
	public static Node findNode(Node node, int left,int right) {
		if (left == right)
			left--;
		TreeIterator<EObject> it = node.eAllContents();
		while(it.hasNext()) {
			Node cur = (Node)it.next();
			if (right <= cur.getBegin() || cur.getEnd() <= left) {
				it.prune();
			}
			if (left <= cur.getBegin() && cur.getEnd() <= right) {
				return cur;
			}
			// check for atomic expressions
			if (cur.getBegin() <= left && right <= cur.getEnd()) {
				switch (cur.eClass().getClassifierID()) {
				case DomPackage.BOOLEAN_LITERAL:
				case DomPackage.NULL_LITERAL:
				case DomPackage.NUMERIC_LITERAL:
				case DomPackage.REGULAR_EXPRESSION_LITERAL:
				case DomPackage.STRING_LITERAL:
				case DomPackage.THIS_EXPRESSION:
				case DomPackage.VARIABLE_REFERENCE:
				case DomPackage.IDENTIFIER:
					return cur;
				}
			}
		}
		return null;
	}
	public static Node[] findNodes(Source cuNode, Iterable<SearchMatch> searchResults) {
		List<Node> result= new ArrayList<Node>();
		for(SearchMatch match : searchResults) {
			Node node= findNode(cuNode, match);
			if (node != null)
				result.add(node);
		}
		return (Node[]) result.toArray(new Node[result.size()]);
	}

	public static Node findNode(Source cuNode, SearchMatch searchResult) {
		Node selectedNode= NodeFinder.findNode(cuNode, searchResult.getOffset(),
				searchResult.getOffset()+searchResult.getLength());
		if (selectedNode == null)
			return null;
		return selectedNode;
	}

	public static Node findNode(Source cuNode, ISourceRange sourceRange) {
		Node selectedNode= NodeFinder.findNode(cuNode, sourceRange.getOffset(),
				sourceRange.getOffset()+sourceRange.getLength());
		if (selectedNode == null)
			return null;
		return selectedNode;
	}
	
	public static Node findEnclosingNode(Node node) {
		while (true) {
			node = (Node)node.eContainer();
			if (node == null)
				return null;
			switch(node.eClass().getClassifierID()) {
			case DomPackage.FUNCTION_EXPRESSION:
			case DomPackage.GETTER_ASSIGNMENT:
			case DomPackage.SETTER_ASSIGNMENT:
			case DomPackage.SOURCE:
				return node;
			}
		}
	}
}
