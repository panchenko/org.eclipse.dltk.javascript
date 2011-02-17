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
package org.eclipse.dltk.javascript.internal.ui.text.folding;

import org.eclipse.dltk.ui.text.folding.IFoldingBlockKind;

public enum JavaScriptFoldingBlockKind implements IFoldingBlockKind {
	FUNCTION(false), XML(false), MULTILINESTRING(false), OBJECT_INITIALIZER(
			false), COMMENT(true), JSDOC(true);

	final boolean isComment;

	private JavaScriptFoldingBlockKind(boolean isComment) {
		this.isComment = isComment;
	}

	public boolean isComment() {
		return isComment;
	}

}
