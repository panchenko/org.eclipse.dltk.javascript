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

package org.eclipse.dltk.javascript.parser;

import org.antlr.runtime.tree.Tree;
import org.eclipse.core.runtime.Assert;

public abstract class JSVisitor {

	private int maxRecursionDeep;
	private int currentRecursionDeep;

	protected JSVisitor(int maxRecursionDeep) {
		this.maxRecursionDeep = maxRecursionDeep;
		this.currentRecursionDeep = 0;
	}

	protected final boolean visitNode(Tree node) {

		boolean accept = visit(node);

		if (!accept) {
			for (int i = 0; i < node.getChildCount(); i++) {
				visitNode(node.getChild(i));
			}
		}

		return true;
	}

	protected boolean visit(Tree node) {

		Assert.isNotNull(node);

		if (currentRecursionDeep > maxRecursionDeep)
			throw new IllegalArgumentException("Too many AST deep");

		currentRecursionDeep++;

		try {

			switch (node.getType()) {

			case JSParser.Identifier:
				return visitIdentifier(node);

			case JSParser.ARGS:
				return visitArguments(node);

			case JSParser.BLOCK:
				return visitBlock(node);

			case JSParser.TRUE:
			case JSParser.FALSE:
				return visitBooleanLiteral(node);

			case JSParser.THIS:
				return visitThis(node);

			case JSParser.DecimalLiteral:
				return visitDecimalLiteral(node);

			case JSParser.StringLiteral:
				return visitStringLiteral(node);

			case JSParser.BYFIELD:
				return visitByField(node);

			case JSParser.BYINDEX:
				return visitByIndex(node);

			case JSParser.EXPR:
				return visitExpression(node);

			case JSParser.CALL:
				return visitCall(node);

			case JSParser.NULL:
				return visitNull(node);

				// arithmetic
			case JSParser.ADD:
			case JSParser.SUB:
			case JSParser.MUL:
			case JSParser.DIV:
			case JSParser.MOD:
				// assign
			case JSParser.ASSIGN:
			case JSParser.ADDASS:
			case JSParser.SUBASS:
			case JSParser.MULASS:
			case JSParser.DIVASS:
			case JSParser.MODASS:
				// conditional
			case JSParser.LT:
			case JSParser.GT:
			case JSParser.LTE:
			case JSParser.GTE:
				// bitwise
			case JSParser.AND:
			case JSParser.OR:
			case JSParser.XOR:
			case JSParser.ANDASS:
			case JSParser.XORASS:
			case JSParser.ORASS:
			case JSParser.SHL:
			case JSParser.SHR:
			case JSParser.SHU:
			case JSParser.SHLASS:
			case JSParser.SHRASS:
			case JSParser.SHUASS:
				// logical
			case JSParser.LOR:
			case JSParser.LAND:
			case JSParser.SAME:
			case JSParser.EQ:
			case JSParser.NEQ:
			case JSParser.NSAME:
				// special
			case JSParser.IN:
			case JSParser.INSTANCEOF:
				return visitBinaryOperation(node);

			case JSParser.PINC:
			case JSParser.PDEC:
			case JSParser.INC:
			case JSParser.DEC:
			case JSParser.NEG:
			case JSParser.NOT:
			case JSParser.INV:
				return visitUnaryOperation(node);

			case JSParser.RETURN:
				return visitReturn(node);

			case JSParser.SWITCH:
				return visitSwitch(node);

			case JSParser.DEFAULT:
				return visitDefault(node);

			case JSParser.CASE:
				return visitCase(node);

			case JSParser.BREAK:
				return visitBreak(node);

			case JSParser.CONTINUE:
				return visitContinue(node);

			case JSParser.DO:
				return visitDoWhile(node);

			case JSParser.WHILE:
				return visitWhile(node);

			case JSParser.FOR:
				return visitFor(node);

			case JSParser.OBJECT:
				return visitObjectInitializer(node);

			case JSParser.NAMEDVALUE:
				return visitPropertyInitializer(node);

			case JSParser.EACH:
				return visitForEachInStatement(node);

			case JSParser.IF:
				return visitIf(node);

			case JSParser.QUE:
				return visitConditional(node);

			case JSParser.PAREXPR:
				return visitParenthesizedExpression(node);

			case JSParser.TRY:
				return visitTry(node);

			case JSParser.THROW:
				return visitThrow(node);

			case JSParser.CATCH:
				return visitCatch(node);

			case JSParser.FINALLY:
				return visitFinally(node);

			case JSParser.NEW:
				return visitNew(node);

			case JSParser.ARRAY:
				return visitArray(node);

			case JSParser.CEXPR:
				return visitCommaExpression(node);

			case JSParser.RegularExpressionLiteral:
				return visitRegExp(node);

			case JSParser.WITH:
				return visitWith(node);

			case JSParser.LABELLED:
				return visitLabelled(node);

			case JSParser.DELETE:
				return visitDelete(node);

			case JSParser.VOID:
				return visitVoid(node);

			case JSParser.GET:
				return visitGet(node);

			case JSParser.SET:
				return visitSet(node);

			case JSParser.TYPEOF:
				return visitTypeOf(node);

			case JSParser.VAR:
				return visitVarDeclaration(node);

			case JSParser.CONST:
				return visitConst(node);

			case 0:
				return visitScript(node);

			case JSParser.FUNCTION:
				return visitFunction(node);

			case JSParser.XMLLiteral:
				return visitXmlLiteral(node);

			case JSParser.NAMESPACE:
				return visitNamespace(node);

			case JSParser.XmlAttribute:
				return visitXmlAttribute(node);

			case JSParser.ALLCHILDREN:
				return visitGetAllChildren(node);

			case JSParser.LOCALNAME:
				return visitGetLocalName(node);

			case JSParser.HexIntegerLiteral:
				return visitHexIntegerLiteral(node);

			case JSParser.OctalIntegerLiteral:
				return visitOctalIntegerLiteral(node);

			case JSParser.YIELD:
				return visitYield(node);

			default:
				throw new UnsupportedOperationException("Unknown token: "
						+ node.getType());
			}
		} finally {
			currentRecursionDeep--;
		}
	}

	protected abstract boolean visitScript(Tree node);

	protected abstract boolean visitFunction(Tree node);

	protected abstract boolean visitIdentifier(Tree node);

	protected abstract boolean visitXmlLiteral(Tree node);

	protected abstract boolean visitNamespace(Tree node);

	protected abstract boolean visitXmlAttribute(Tree node);

	protected abstract boolean visitGetAllChildren(Tree node);

	protected abstract boolean visitGetLocalName(Tree node);

	protected abstract boolean visitHexIntegerLiteral(Tree node);

	protected abstract boolean visitOctalIntegerLiteral(Tree node);

	protected abstract boolean visitYield(Tree node);

	protected abstract boolean visitArguments(Tree node);

	protected abstract boolean visitBlock(Tree node);

	protected abstract boolean visitSwitch(Tree node);

	protected abstract boolean visitDefault(Tree node);

	protected abstract boolean visitCase(Tree node);

	protected abstract boolean visitReturn(Tree node);

	protected abstract boolean visitBooleanLiteral(Tree node);

	protected abstract boolean visitDecimalLiteral(Tree node);

	protected abstract boolean visitStringLiteral(Tree node);

	protected abstract boolean visitBinaryOperation(Tree node);

	protected abstract boolean visitUnaryOperation(Tree node);

	protected abstract boolean visitBreak(Tree node);

	protected abstract boolean visitCall(Tree node);

	protected abstract boolean visitDoWhile(Tree node);

	protected abstract boolean visitWhile(Tree node);

	protected abstract boolean visitForEachInStatement(Tree node);

	protected abstract boolean visitFor(Tree node);

	protected abstract boolean visitExpression(Tree node);

	protected abstract boolean visitContinue(Tree node);

	protected abstract boolean visitVarDeclaration(Tree node);

	protected abstract boolean visitObjectInitializer(Tree node);

	protected abstract boolean visitPropertyInitializer(Tree node);

	protected abstract boolean visitByField(Tree node);

	protected abstract boolean visitByIndex(Tree node);

	protected abstract boolean visitIf(Tree node);

	protected abstract boolean visitConditional(Tree node);

	protected abstract boolean visitParenthesizedExpression(Tree node);

	protected abstract boolean visitTry(Tree node);

	protected abstract boolean visitCatch(Tree node);

	protected abstract boolean visitFinally(Tree node);

	protected abstract boolean visitThrow(Tree node);

	protected abstract boolean visitNew(Tree node);

	protected abstract boolean visitArray(Tree node);

	protected abstract boolean visitCommaExpression(Tree node);

	protected abstract boolean visitRegExp(Tree node);

	protected abstract boolean visitWith(Tree node);

	protected abstract boolean visitThis(Tree node);

	protected abstract boolean visitLabelled(Tree node);

	protected abstract boolean visitDelete(Tree node);

	protected abstract boolean visitGet(Tree node);

	protected abstract boolean visitSet(Tree node);

	protected abstract boolean visitNull(Tree node);

	protected abstract boolean visitTypeOf(Tree node);

	protected abstract boolean visitConst(Tree node);

	protected abstract boolean visitVoid(Tree node);

}
