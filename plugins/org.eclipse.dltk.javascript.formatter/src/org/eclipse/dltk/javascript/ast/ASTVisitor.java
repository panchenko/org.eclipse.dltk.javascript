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

package org.eclipse.dltk.javascript.ast;

import org.eclipse.dltk.ast.ASTNode;

public final class ASTVisitor {

	public static boolean visit(ASTNode node, IASTVisitor visitor) {
		if (node.getClass() == ArrayInitializer.class)
			return visitor.visitArrayInitializer((ArrayInitializer) node);

		if (node.getClass() == BinaryOperation.class)
			return visitor.visitBinaryOperation((BinaryOperation) node);

		if (node.getClass() == BooleanLiteral.class)
			return visitor.visitBooleanLiteral((BooleanLiteral) node);

		if (node.getClass() == BreakStatement.class)
			return visitor.visitBreakStatement((BreakStatement) node);

		if (node.getClass() == CallExpression.class)
			return visitor.visitCallExpression((CallExpression) node);

		if (node.getClass() == CaseClause.class)
			return visitor.visitCaseClause((CaseClause) node);

		if (node.getClass() == CatchClause.class)
			return visitor.visitCatchClause((CatchClause) node);

		if (node.getClass() == CommaExpression.class)
			return visitor.visitCommaExpression((CommaExpression) node);

		if (node.getClass() == ConditionalOperator.class)
			return visitor.visitConditionalOperator((ConditionalOperator) node);

		if (node.getClass() == ConstDeclaration.class)
			return visitor.visitConstDeclaration((ConstDeclaration) node);

		if (node.getClass() == ContinueStatement.class)
			return visitor.visitContinueStatement((ContinueStatement) node);

		if (node.getClass() == DecimalLiteral.class)
			return visitor.visitDecimalLiteral((DecimalLiteral) node);

		if (node.getClass() == DefaultClause.class)
			return visitor.visitDefaultClause((DefaultClause) node);

		if (node.getClass() == DeleteStatement.class)
			return visitor.visitDeleteStatement((DeleteStatement) node);

		if (node.getClass() == DoWhileStatement.class)
			return visitor.visitDoWhileStatement((DoWhileStatement) node);

		if (node.getClass() == EmptyExpression.class)
			return visitor.visitEmptyExpression((EmptyExpression) node);

		if (node.getClass() == ExceptionFilter.class)
			return visitor.visitExceptionFilter((ExceptionFilter) node);

		if (node.getClass() == FinallyClause.class)
			return visitor.visitFinallyClause((FinallyClause) node);

		if (node.getClass() == ForStatement.class)
			return visitor.visitForStatement((ForStatement) node);

		if (node.getClass() == ForInStatement.class)
			return visitor.visitForInStatement((ForInStatement) node);

		if (node.getClass() == ForEachInStatement.class)
			return visitor.visitForEachInStatement((ForEachInStatement) node);

		if (node.getClass() == FunctionStatement.class)
			return visitor.visitFunctionStatement((FunctionStatement) node);

		if (node.getClass() == GetArrayItemExpression.class)
			return visitor
					.visitGetArrayItemExpression((GetArrayItemExpression) node);

		if (node.getClass() == GetMethod.class)
			return visitor.visitGetMethod((GetMethod) node);

		if (node.getClass() == Identifier.class)
			return visitor.visitIdentifier((Identifier) node);

		if (node.getClass() == IfStatement.class)
			return visitor.visitIfStatement((IfStatement) node);

		if (node.getClass() == Keyword.class)
			return visitor.visitKeyword((Keyword) node);

		if (node.getClass() == Label.class)
			return visitor.visitLabel((Label) node);

		if (node.getClass() == LabelledStatement.class)
			return visitor.visitLabelledStatement((LabelledStatement) node);

		if (node.getClass() == NewExpression.class)
			return visitor.visitNewExpression((NewExpression) node);

		if (node.getClass() == NullExpression.class)
			return visitor.visitNullExpression((NullExpression) node);

		if (node.getClass() == ObjectInitializer.class)
			return visitor.visitObjectInitializer((ObjectInitializer) node);

		if (node.getClass() == ParenthesizedExpression.class)
			return visitor
					.visitParenthesizedExpression((ParenthesizedExpression) node);

		if (node.getClass() == PropertyExpression.class)
			return visitor.visitPropertyExpression((PropertyExpression) node);

		if (node.getClass() == PropertyInitializer.class)
			return visitor.visitPropertyInitializer((PropertyInitializer) node);

		if (node.getClass() == RegExpLiteral.class)
			return visitor.visitRegExpLiteral((RegExpLiteral) node);

		if (node.getClass() == ReturnStatement.class)
			return visitor.visitReturnStatement((ReturnStatement) node);

		if (node.getClass() == Script.class)
			return visitor.visitScript((Script) node);

		if (node.getClass() == SetMethod.class)
			return visitor.visitSetMethod((SetMethod) node);

		if (node.getClass() == StatementBlock.class)
			return visitor.visitStatementBlock((StatementBlock) node);

		if (node.getClass() == StatementList.class)
			return visitor.visitStatementList((StatementList) node);

		if (node.getClass() == StringLiteral.class)
			return visitor.visitStringLiteral((StringLiteral) node);

		if (node.getClass() == SwitchStatement.class)
			return visitor.visitSwitchStatement((SwitchStatement) node);

		if (node.getClass() == ThisExpression.class)
			return visitor.visitThisExpression((ThisExpression) node);

		if (node.getClass() == ThrowStatement.class)
			return visitor.visitThrowStatement((ThrowStatement) node);

		if (node.getClass() == TryStatement.class)
			return visitor.visitTryStatement((TryStatement) node);

		if (node.getClass() == TypeOfExpression.class)
			return visitor.visitTypeOfExpression((TypeOfExpression) node);

		if (node.getClass() == UnaryOperation.class)
			return visitor.visitUnaryOperation((UnaryOperation) node);

		if (node.getClass() == VariableDeclaration.class)
			return visitor.visitVariableDeclaration((VariableDeclaration) node);

		if (node.getClass() == VoidExpression.class)
			return visitor.visitVoidExpression((VoidExpression) node);

		if (node.getClass() == WhileStatement.class)
			return visitor.visitWhileStatement((WhileStatement) node);

		if (node.getClass() == WithStatement.class)
			return visitor.visitWithStatement((WithStatement) node);

		if (node.getClass() == VoidOperator.class)
			return visitor.visitVoidOperator((VoidOperator) node);

		if (node.getClass() == XmlLiteral.class)
			return visitor.visitXmlLiteral((XmlLiteral) node);

		if (node.getClass() == DefaultXmlNamespaceStatement.class)
			return visitor
					.visitDefaultXmlNamespace((DefaultXmlNamespaceStatement) node);

		if (node.getClass() == XmlAttributeIdentifier.class)
			return visitor
					.visitXmlPropertyIdentifier((XmlAttributeIdentifier) node);

		if (node.getClass() == AsteriskExpression.class)
			return visitor.visitAsteriskExpression((AsteriskExpression) node);

		if (node.getClass() == GetAllChildrenExpression.class)
			return visitor
					.visitGetAllChildrenExpression((GetAllChildrenExpression) node);

		if (node.getClass() == GetLocalNameExpression.class)
			return visitor
					.visitGetLocalNameExpression((GetLocalNameExpression) node);

		if (node.getClass() == YieldOperator.class)
			return visitor.visitYieldOperator((YieldOperator) node);

		throw new UnsupportedOperationException("Unknown node type: "
				+ node.getClass());
	}

}
