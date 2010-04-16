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

import org.eclipse.dltk.core.search.matching2.MatchingNodeSet;

public class JavaScriptMatchingNodeSet extends MatchingNodeSet<MatchingNode> {

	@Override
	protected boolean checkRange(MatchingNode node, int start, int end) {
		return start <= node.sourceStart() && node.sourceEnd() <= end;
	}

	@Override
	protected long computeNodeKey(MatchingNode node) {
		return ((((long) node.sourceStart()) << 32) + node.sourceEnd());
	}

	public int compare(MatchingNode o1, MatchingNode o2) {
		return o1.sourceStart() - o2.sourceStart();
	}

}
