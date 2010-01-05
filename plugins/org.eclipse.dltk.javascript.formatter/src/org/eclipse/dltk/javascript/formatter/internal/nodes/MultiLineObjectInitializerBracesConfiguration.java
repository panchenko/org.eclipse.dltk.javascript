/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladimir Belov)
 *******************************************************************************/

package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.javascript.ast.JSNode;
import org.eclipse.dltk.javascript.ast.ReturnStatement;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;

public class MultiLineObjectInitializerBracesConfiguration extends
		AbstractBracesConfiguration {

	private final JSNode node;

	public MultiLineObjectInitializerBracesConfiguration(
			IFormatterDocument document, JSNode node) {
		super(document);
		this.node = node;

		indentingSettingName = JavaScriptFormatterConstants.INDENT_BLOCK;
		bracesSettingName = JavaScriptFormatterConstants.BRACE_BLOCK;
	}

	@Override
	public int insertBeforeOpenBrace() {
		if (canBreak()) {
			return super.insertBeforeOpenBrace();
		}
		return IBracesConfiguration.ONE_SPACE;
	}

	private boolean canBreak() {
		if (node.getParent() instanceof ReturnStatement) {
			return false;
		}
		return true;
	}

}
