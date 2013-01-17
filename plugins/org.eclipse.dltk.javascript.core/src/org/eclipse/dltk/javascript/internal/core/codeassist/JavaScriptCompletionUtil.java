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

import org.eclipse.dltk.annotations.NonNull;
import org.eclipse.dltk.annotations.Nullable;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.compiler.env.ModuleSource;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.javascript.ast.ErrorExpression;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.JSNode;
import org.eclipse.dltk.javascript.ast.ObjectInitializer;
import org.eclipse.dltk.javascript.ast.PropertyInitializer;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.StatementBlock;
import org.eclipse.dltk.javascript.ast.UserExpression;
import org.eclipse.dltk.javascript.core.NodeFinder;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;

/**
 * Static functions for evaluating the context at the specified position, to
 * limit which proposals should be offered, e.g. exclude keywords in the
 * expression context.
 */
public class JavaScriptCompletionUtil {

	public enum ExpressionType {
		PROPERTY_INITIALIZER_VALUE,

		/**
		 * Indicates position within an {@link ObjectInitializer} but not within
		 * any nested {@link PropertyInitializer}.
		 * 
		 * E.g.
		 * 
		 * <pre>
		 * var object = {    name   :   "Aleksander "  ,   surname  :  "Kosicki"    };
		 *               ^^^^^                       ^^^^^^^                    ^^^^^
		 * </pre>
		 * 
		 * Where ^ means between the given and the precedent column
		 */
		OBJECT_INITIALIZER, OTHER
	}

	public static class ExpressionContext {
		public final ExpressionType expressionType;
		public final JSNode node;

		public ExpressionContext(ExpressionType expressionType, JSNode node) {
			this.expressionType = expressionType;
			this.node = node;
		}
	}

	public static ExpressionType evaluateExpressionType(
			@Nullable ISourceModule module, @NonNull CharSequence document,
			int position) {
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

	/**
	 * @param node
	 * @param position
	 * @return <code>true</code> if given position is within the source range of
	 *         some {@link ObjectInitializer} but now within the source range of
	 *         any of its nested {@link PropertyInitializer}s
	 * 
	 * @see {@link ExpressionType#OBJECT_INITIALIZER}
	 */
	private static boolean isDirectlyInObjectInitializer(@NonNull ASTNode node,
			int position) {
		if (node instanceof UserExpression) {
			node = ((UserExpression) node).getOriginal();
		}
		for (ASTNode child : node.getChilds()) {
			if (child.start() < position && child.end() > position) {
				return isDirectlyInObjectInitializer(child, position);
			}
		}
		return node instanceof ObjectInitializer;
	}

	public static ExpressionContext evaluateExpressionContext(Script script,
			CharSequence document, int position) {
		if (script != null) {
			ASTNode node = new NodeFinder(true, position, position).locate(
					script).getNode();
			if (node instanceof Identifier) {
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
			} else if (node instanceof ErrorExpression) {
				final ErrorExpression error = (ErrorExpression) node;
				if (error.getParent() instanceof PropertyInitializer) {
					return new ExpressionContext(
							ExpressionType.PROPERTY_INITIALIZER_VALUE, error);
				} else {
					return new ExpressionContext(ExpressionType.OTHER, error);
				}
			}
			int begin = position;
			while (begin > 0
					&& Character.isWhitespace(document.charAt(begin - 1))) {
				--begin;
			}
			node = new NodeFinder(true, begin, begin).locate(script).getNode();
			if (node instanceof ErrorExpression) {
				final ErrorExpression error = (ErrorExpression) node;
				if (error.getParent() instanceof PropertyInitializer) {
					return new ExpressionContext(
							ExpressionType.PROPERTY_INITIALIZER_VALUE, error);
				} else {
					return new ExpressionContext(ExpressionType.OTHER, error);
				}
			}
			// TODO CallExpression: setTimeout(<Ctrl-Space>)
			if (isDirectlyInObjectInitializer(script, position)) {
				return new ExpressionContext(ExpressionType.OBJECT_INITIALIZER,
						null);
			}
		}
		return null;
	}

}
