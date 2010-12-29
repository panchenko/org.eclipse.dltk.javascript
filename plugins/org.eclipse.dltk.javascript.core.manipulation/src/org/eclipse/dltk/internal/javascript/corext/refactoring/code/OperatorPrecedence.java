/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.corext.refactoring.code;

import org.eclipse.dltk.javascript.core.dom.BinaryExpression;
import org.eclipse.dltk.javascript.core.dom.DomPackage;
import org.eclipse.dltk.javascript.core.dom.Expression;
import org.eclipse.dltk.javascript.core.dom.UnaryExpression;

public class OperatorPrecedence {
	public static final int SEQUENCE =			0;
	public static final int ASSIGNMENT = 		1;
	public static final int CONDITIONAL =		2;
	public static final int LOGICAL_OR = 		3;
	public static final int LOGICAL_AND = 		4;
	public static final int BITWISE_OR =		5;
	public static final int BITWISE_XOR =		6;
	public static final int BITWISE_AND =		7;
	public static final int EQUALITY =			8;
	public static final int RELATIONAL =		9;
	public static final int SHIFT =				10;
	public static final int ADDITIVE =			11;
	public static final int MULTIPLICATIVE =	12;
	public static final int PREFIX =			14;
	public static final int POSTFIX =			15;
	public static final int INSTANTIATION =		16;
	public static final int CALL =				17;
	
	public static int getExpressionPrecedence(Expression expression) {
		switch(expression.eClass().getClassifierID()) {
		case DomPackage.BINARY_EXPRESSION:
			switch(((BinaryExpression)expression).getOperation()) {
			case COMMA:
				return SEQUENCE;
			case LOG_OR:
				return LOGICAL_OR;
			case LOG_AND:
				return LOGICAL_AND;
			case BW_OR:
				return BITWISE_OR;
			case BW_XOR:
				return BITWISE_XOR;
			case BW_AND:
				return BITWISE_AND;
			case EQ:
			case NEQ:
			case SAME:
			case NSAME:
				return EQUALITY;
			case LESS:
			case GREATER:
			case LEQ:
			case GEQ:
			case IN:
			case INSTANCEOF:
				return RELATIONAL;
			case LSH:
			case RSH:
			case URSH:
				return SHIFT;
			case ADD:
			case SUB:
				return ADDITIVE;
			case MUL:
			case DIV:
			case MOD:
				return MULTIPLICATIVE;
			default:
				return ASSIGNMENT;
			}
		case DomPackage.CONDITIONAL_EXPRESSION:
			return CONDITIONAL;
		case DomPackage.UNARY_EXPRESSION:
			switch(((UnaryExpression)expression).getOperation()) {
			case POSTFIX_DEC:
			case POSTFIX_INC:
				return POSTFIX;
			default:
				return PREFIX;
			}
		case DomPackage.NEW_EXPRESSION:
			return INSTANTIATION;
		case DomPackage.ARRAY_ACCESS_EXPRESSION:
		case DomPackage.PROPERTY_ACCESS_EXPRESSION:
		case DomPackage.CALL_EXPRESSION:
			return CALL;
		default:
			return Integer.MAX_VALUE;
		}
	}
}
