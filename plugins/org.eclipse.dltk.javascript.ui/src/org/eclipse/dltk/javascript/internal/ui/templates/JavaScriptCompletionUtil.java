/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.templates;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.compiler.env.ModuleSource;
import org.eclipse.dltk.javascript.ast.ErrorExpression;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.JSNode;
import org.eclipse.dltk.javascript.ast.PropertyInitializer;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.StatementBlock;
import org.eclipse.dltk.javascript.core.NodeFinder;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;
import org.eclipse.jface.text.IDocument;

public class JavaScriptCompletionUtil {

	enum ExpressionType {
		PROPERTY_INITIALIZER_VALUE, OTHER
	}

	static class ExpressionContext {
		final ExpressionType expressionType;
		final JSNode node;

		public ExpressionContext(ExpressionType expressionType, JSNode node) {
			this.expressionType = expressionType;
			this.node = node;
		}
	}

	public static ExpressionType evaluateExpressionType(IDocument document,
			int position) {
		final ExpressionContext context = evaluateExpressionContext(document,
				position);
		return context != null ? context.expressionType : null;
	}

	public static ExpressionContext evaluateExpressionContext(
			IDocument document, int position) {
		final String text = document.get();
		final Script script = JavaScriptParserUtil.parse(
				new ModuleSource(text), null);
		if (script != null) {
			int begin = position;
			while (begin > 0 && Character.isWhitespace(text.charAt(begin - 1))) {
				--begin;
			}
			final NodeFinder nodeFinder = new NodeFinder(begin, position);
			// TODO CallExpression: setTimeout(<Ctrl-Space>)
			nodeFinder.locate(script);
			final ASTNode node = nodeFinder.getNode();
			if (node instanceof ErrorExpression) {
				final ErrorExpression error = (ErrorExpression) node;
				if (error.getParent() instanceof PropertyInitializer) {
					return new ExpressionContext(
							ExpressionType.PROPERTY_INITIALIZER_VALUE, error);
				} else {
					return new ExpressionContext(ExpressionType.OTHER, error);
				}
			} else if (node instanceof Identifier) {
				final Identifier identifier = (Identifier) node;
				final ASTNode parent = identifier.getParent();
				if (parent instanceof Script
						|| parent instanceof StatementBlock) {
					// fall thru
				} else if (parent instanceof PropertyInitializer
						&& ((PropertyInitializer) parent).getValue() == node) {
					return new ExpressionContext(
							ExpressionType.PROPERTY_INITIALIZER_VALUE,
							identifier);
				} else {
					return new ExpressionContext(ExpressionType.OTHER,
							identifier);
				}
			}
		}
		return null;
	}

}
