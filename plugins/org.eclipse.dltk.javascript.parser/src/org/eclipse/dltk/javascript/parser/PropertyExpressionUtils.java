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

import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.PropertyExpression;

public class PropertyExpressionUtils {

	public static String getPath(Expression expression) {
		final StringBuilder buffer = new StringBuilder();
		if (buildPath(buffer, expression)) {
			return buffer.toString();
		} else {
			return null;
		}
	}

	private static boolean buildPath(StringBuilder buffer, Expression expression) {
		if (expression instanceof Identifier) {
			buffer.append(((Identifier) expression).getName());
			return true;
		} else if (expression instanceof PropertyExpression) {
			final PropertyExpression propertyExpression = (PropertyExpression) expression;
			if (!buildPath(buffer, propertyExpression.getObject()))
				return false;
			buffer.append('.');
			if (!buildPath(buffer, propertyExpression.getProperty()))
				return false;
			return true;
		} else {
			return false;
		}
	}

}
