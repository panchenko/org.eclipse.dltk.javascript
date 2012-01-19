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

public abstract class JSVisitor<E> {

	protected JSVisitor() {
	}

	protected final E visitNode(Tree node) {
		E accept = visit(node);
		if (accept == null) {
			for (int i = 0; i < node.getChildCount(); i++) {
				visitNode(node.getChild(i));
			}
		}
		return accept;
	}

	protected E visit(Tree node) {
		Assert.isNotNull(node);
		switch (node.getType()) {

		case JSParser.Identifier:
		case JSParser.WXML:
		case JSParser.GET:
		case JSParser.SET:
		case JSParser.EACH:
		case JSParser.NAMESPACE:
			return visitIdentifier(node);

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
		case JSParser.POS:
		case JSParser.NOT:
		case JSParser.INV:
		case JSParser.DELETE:
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

		case JSParser.FOREACH:
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

		case JSParser.VOID:
			return visitVoid(node);

		case JSParser.GETTER:
			return visitGet(node);

		case JSParser.SETTER:
			return visitSet(node);

		case JSParser.TYPEOF:
			return visitTypeOf(node);

		case JSParser.VAR:
			return visitVarDeclaration(node);

		case JSParser.CONST:
			return visitConst(node);

		case JSParser.FUNCTION:
		case JSParser.FUNCTION_DECLARATION:
			return visitFunction(node);

		case JSParser.XML_LITERAL:
			return visitXmlLiteral(node);

		case JSParser.DEFAULT_XML_NAMESPACE:
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

		case JSParser.EMPTY_STATEMENT:
			return visitEmptyStatement(node);

		default:
			return visitUnknown(node);
		}
	}

	protected E visitUnknown(Tree node) {
		throw new UnsupportedOperationException("Unknown token "
				+ JSParser.tokenNames[node.getType()] + " (" + node.getText()
				+ ")");
	}

	protected abstract E visitFunction(Tree node);

	protected abstract E visitIdentifier(Tree node);

	protected abstract E visitXmlLiteral(Tree node);

	protected abstract E visitNamespace(Tree node);

	protected abstract E visitXmlAttribute(Tree node);

	protected abstract E visitGetAllChildren(Tree node);

	protected abstract E visitGetLocalName(Tree node);

	protected abstract E visitHexIntegerLiteral(Tree node);

	protected abstract E visitOctalIntegerLiteral(Tree node);

	protected abstract E visitYield(Tree node);

	protected abstract E visitBlock(Tree node);

	protected abstract E visitSwitch(Tree node);

	protected abstract E visitDefault(Tree node);

	protected abstract E visitCase(Tree node);

	protected abstract E visitReturn(Tree node);

	protected abstract E visitBooleanLiteral(Tree node);

	protected abstract E visitDecimalLiteral(Tree node);

	protected abstract E visitStringLiteral(Tree node);

	protected abstract E visitBinaryOperation(Tree node);

	protected abstract E visitUnaryOperation(Tree node);

	protected abstract E visitBreak(Tree node);

	protected abstract E visitCall(Tree node);

	protected abstract E visitDoWhile(Tree node);

	protected abstract E visitWhile(Tree node);

	protected abstract E visitForEachInStatement(Tree node);

	protected abstract E visitFor(Tree node);

	protected abstract E visitExpression(Tree node);

	protected abstract E visitContinue(Tree node);

	protected abstract E visitVarDeclaration(Tree node);

	protected abstract E visitObjectInitializer(Tree node);

	protected abstract E visitPropertyInitializer(Tree node);

	protected abstract E visitByField(Tree node);

	protected abstract E visitByIndex(Tree node);

	protected abstract E visitIf(Tree node);

	protected abstract E visitConditional(Tree node);

	protected abstract E visitParenthesizedExpression(Tree node);

	protected abstract E visitTry(Tree node);

	protected abstract E visitCatch(Tree node);

	protected abstract E visitFinally(Tree node);

	protected abstract E visitThrow(Tree node);

	protected abstract E visitNew(Tree node);

	protected abstract E visitArray(Tree node);

	protected abstract E visitCommaExpression(Tree node);

	protected abstract E visitRegExp(Tree node);

	protected abstract E visitWith(Tree node);

	protected abstract E visitThis(Tree node);

	protected abstract E visitLabelled(Tree node);

	protected abstract E visitGet(Tree node);

	protected abstract E visitSet(Tree node);

	protected abstract E visitNull(Tree node);

	protected abstract E visitTypeOf(Tree node);

	protected abstract E visitConst(Tree node);

	protected abstract E visitVoid(Tree node);

	protected abstract E visitEmptyStatement(Tree node);

}
