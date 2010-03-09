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
package org.eclipse.dltk.javascript.parser;

import org.antlr.runtime.Token;
import org.eclipse.dltk.core.builder.ISourceLineTracker;

class LineTracker {

	private final ISourceLineTracker lineTracker;

	public LineTracker(ISourceLineTracker lineTracker) {
		this.lineTracker = lineTracker;
	}

	public int getOffset(int line, int column) {
		return lineTracker.getLineOffset(line - 1) + Math.max(column, 0);
	}

	public int getLength() {
		return lineTracker.getLength();
	}

	public int getOffset(Token token) {
		return getOffset(token.getLine(), token.getCharPositionInLine());
	}

	public int length(Token token) {
		final String sm = token.getText();
		return sm != null ? sm.length() : 1;
	}

}
