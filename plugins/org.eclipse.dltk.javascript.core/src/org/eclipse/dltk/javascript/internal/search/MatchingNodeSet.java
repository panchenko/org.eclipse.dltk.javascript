/*******************************************************************************
 * Copyright (c) 2000, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A set of matches and possible matches, which need to be resolved.
 */
public abstract class MatchingNodeSet<E> {
	/**
	 * Map of matching ast nodes that don't need to be resolved to their
	 * accuracy level. Each node is removed as it is reported.
	 */
	private Map<E, MatchLevel> matchingNodes = new HashMap<E, MatchLevel>();

	// sourceRange -> node
	private HashtableOfLong<E> matchingNodesKeys = new HashtableOfLong<E>();

	/**
	 * Set of possible matching ast nodes. They need to be resolved to determine
	 * if they really match the search pattern.
	 */
	private Set<E> possibleMatchingNodesSet = new HashSet<E>();

	// sourceRange -> node
	private HashtableOfLong<E> possibleMatchingNodesKeys = new HashtableOfLong<E>();

	public MatchLevel addMatch(E node, MatchLevel matchLevel) {
		switch (matchLevel) {
		case POSSIBLE_MATCH:
			addPossibleMatch(node);
			break;
		case INACCURATE_MATCH:
			addTrustedMatch(node, MatchLevel.INACCURATE_MATCH);
			break;
		case EXACT_MATCH:
			addTrustedMatch(node, MatchLevel.EXACT_MATCH);
			break;
		}
		return matchLevel;
	}

	public void addPossibleMatch(E node) {
		// remove existing node at same position from set
		// (case of recovery that created the same node several time
		// see http://bugs.eclipse.org/bugs/show_bug.cgi?id=29366)
		long key = computeNodeKey(node);
		E existing = this.possibleMatchingNodesKeys.get(key);
		if (existing != null && existing.getClass().equals(node.getClass()))
			this.possibleMatchingNodesSet.remove(existing);
		// add node to set
		this.possibleMatchingNodesSet.add(node);
		this.possibleMatchingNodesKeys.put(key, node);
	}

	public void addTrustedMatch(E node, boolean isExact) {
		addTrustedMatch(node, isExact ? MatchLevel.EXACT_MATCH
				: MatchLevel.INACCURATE_MATCH);
	}

	private void addTrustedMatch(E node, MatchLevel level) {
		// remove existing node at same position from set
		// (case of recovery that created the same node several time
		// see http://bugs.eclipse.org/bugs/show_bug.cgi?id=29366)
		long key = computeNodeKey(node);
		E existing = this.matchingNodesKeys.get(key);
		if (existing != null && existing.getClass().equals(node.getClass()))
			this.matchingNodes.remove(existing);
		// map node to its accuracy level
		this.matchingNodes.put(node, level);
		this.matchingNodesKeys.put(key, node);
	}

	protected boolean hasPossibleNodes(int start, int end) {
		for (E node : possibleMatchingNodesSet) {
			if (checkRange(node, start, end)) {
				return true;
			}
		}
		for (E node : matchingNodes.keySet()) {
			if (checkRange(node, start, end)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns the matching nodes that are in the given range in the source
	 * order.
	 */
	public List<E> matchingNodes(int start, int end) {
		List<E> nodes = null;
		for (E node : matchingNodes.keySet()) {
			if (checkRange(node, start, end)) {
				if (nodes == null)
					nodes = new ArrayList<E>();
				nodes.add(node);
			}
		}
		if (nodes == null)
			return Collections.emptyList();
		Collections.sort(nodes, getNodeComparator());
		return nodes;
	}

	public boolean removePossibleMatch(E node) {
		long key = computeNodeKey(node);
		E existing = this.possibleMatchingNodesKeys.get(key);
		if (existing == null)
			return false;
		this.possibleMatchingNodesKeys.put(key, null);
		return this.possibleMatchingNodesSet.remove(node);
	}

	protected abstract long computeNodeKey(E node);

	protected abstract boolean checkRange(E node, int start, int end);

	protected abstract Comparator<E> getNodeComparator();

	public MatchLevel removeTrustedMatch(E node) {
		long key = computeNodeKey(node);
		E existing = this.matchingNodesKeys.get(key);
		if (existing == null)
			return null;
		this.matchingNodesKeys.put(key, null);
		return this.matchingNodes.remove(node);
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Exact matches:"); //$NON-NLS-1$
		List<E> nodes = new ArrayList<E>(matchingNodes.keySet());
		Collections.sort(nodes, getNodeComparator());
		for (E node : nodes) {
			result.append("\n\t"); //$NON-NLS-1$
			result.append(matchingNodes.get(node)); //$NON-NLS-1$
			result.append(describeNode(node));
		}
		result.append("\nPossible matches:"); //$NON-NLS-1$
		nodes.clear();
		nodes.addAll(possibleMatchingNodesSet);
		Collections.sort(nodes, getNodeComparator());
		for (E node : nodes) {
			result.append("\nPOSSIBLE_MATCH: "); //$NON-NLS-1$
			result.append(describeNode(node));
		}
		return result.toString();
	}

	protected String describeNode(E node) {
		return node.toString();
	}
}
