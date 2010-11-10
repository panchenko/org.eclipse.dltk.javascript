package org.eclipse.dltk.javascript.core.dom.rewrite;

import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class NodeFinder {
	public static Node findNode(Node node, int left,int right) {
		TreeIterator<EObject> it = node.eAllContents();
		while(it.hasNext()) {
			Node cur = (Node)it.next();
			if (right <= cur.getBegin() || cur.getEnd() <= left)
				it.prune();
			if (left <= cur.getBegin() && cur.getEnd() <= right) {
				return cur;
			}
		}
		return null;
	}
}
