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
package org.eclipse.dltk.javascript.internal.core.codeassist;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.compiler.env.ModuleSource;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.javascript.ast.ErrorExpression;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.JSNode;
import org.eclipse.dltk.javascript.ast.PropertyInitializer;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.StatementBlock;
import org.eclipse.dltk.javascript.core.NodeFinder;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;

/**
 * Static functions for evaluating the context at the specified position, to
 * limit which proposals should be offered, e.g. exclude keywords in the
 * expression context.
 */
public class JavaScriptCompletionUtil {

	public enum ExpressionType {
		PROPERTY_INITIALIZER_VALUE, OTHER
	}

	public static class ExpressionContext {
		public final ExpressionType expressionType;
		public final JSNode node;

		public ExpressionContext(ExpressionType expressionType, JSNode node) {
			this.expressionType = expressionType;
			this.node = node;
		}
	}

	public static ExpressionType evaluateExpressionType(ISourceModule module,
			CharSequence document, int position) {
		final ExpressionContext context = evaluateExpressionContext(module,
				document, position);
		return context != null ? context.expressionType : null;
	}

	public static ExpressionContext evaluateExpressionContext(
			ISourceModule module, CharSequence document, int position) {
		final Script script = module != null ? JavaScriptParserUtil
				.parse(module) : JavaScriptParserUtil.parse(new ModuleSource(
				document.toString()), null);
		return evaluateExpressionContext(script, document, position);
	}

	public static ExpressionContext evaluateExpressionContext(Script script,
			CharSequence document, int position) {
		if (script != null) {
			int begin = position;
			while (begin > 0
					&& Character.isWhitespace(document.charAt(begin - 1))) {
				--begin;
			}
			final NodeFinder nodeFinder = new NodeFinder(true, begin, position);
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
