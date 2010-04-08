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

import org.eclipse.dltk.ast.parser.IModuleDeclaration;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.SourceParserUtil;
import org.eclipse.dltk.internal.javascript.validation.AbstractNavigationVisitor;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Method;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.ui.text.folding.IFoldingBlockProvider;
import org.eclipse.dltk.ui.text.folding.IFoldingBlockRequestor;
import org.eclipse.dltk.ui.text.folding.IFoldingContent;
import org.eclipse.jface.text.Region;

public class JavaScriptCodeFoldingBlockProvider extends
		AbstractNavigationVisitor<Object> implements IFoldingBlockProvider {

	private static Script parse(IFoldingContent content) {
		if (content.getModelElement() instanceof ISourceModule) {
			IModuleDeclaration declaration = SourceParserUtil.parse(
					(ISourceModule) content.getModelElement(), null);
			if (declaration instanceof Script) {
				return (Script) declaration;
			}
		}
		JavaScriptParser parser = new JavaScriptParser();
		// TODO use project option
		parser.setTypeInformationEnabled(true);
		return parser.parse(content, null);
	}

	private IFoldingBlockRequestor requestor;

	public void setRequestor(IFoldingBlockRequestor requestor) {
		this.requestor = requestor;
	}

	public void computeFoldableBlocks(IFoldingContent content) {
		final Script script = parse(content);
		if (script != null) {
			visitScript(script);
		}
	}

	@Override
	public Object visitFunctionStatement(FunctionStatement node) {
		requestor.acceptBlock(new Region(node.sourceStart(), node.sourceEnd()
				- node.sourceStart()), JavaScriptFoldingBlockKind.FUNCTION,
				null);
		return super.visitFunctionStatement(node);
	}

	@Override
	protected Object visitMethod(Method method) {
		requestor.acceptBlock(new Region(method.sourceStart(), method
				.sourceEnd()
				- method.sourceStart()), JavaScriptFoldingBlockKind.FUNCTION,
				null);
		return super.visitMethod(method);
	}

}
