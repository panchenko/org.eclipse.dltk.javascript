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

import java.util.Collection;

import org.eclipse.dltk.ast.ASTNode;

public abstract class ASTVisitor implements IASTVisitor {

	public void visit(Collection<? extends ASTNode> nodes) {
		for (ASTNode node : nodes) {
			visit(node);
		}
	}

	public boolean visit(ASTNode node) {
		if (node.getClass() == ArrayInitializer.class)
			return visitArrayInitializer((ArrayInitializer) node);

		if (node.getClass() == BinaryOperation.class)
			return visitBinaryOperation((BinaryOperation) node);

		if (node.getClass() == BooleanLiteral.class)
			return visitBooleanLiteral((BooleanLiteral) node);

		if (node.getClass() == BreakStatement.class)
			return visitBreakStatement((BreakStatement) node);

		if (node.getClass() == CallExpression.class)
			return visitCallExpression((CallExpression) node);

		if (node.getClass() == CaseClause.class)
			return visitCaseClause((CaseClause) node);

		if (node.getClass() == CatchClause.class)
			return visitCatchClause((CatchClause) node);

		if (node.getClass() == CommaExpression.class)
			return visitCommaExpression((CommaExpression) node);

		if (node.getClass() == ConditionalOperator.class)
			return visitConditionalOperator((ConditionalOperator) node);

		if (node.getClass() == ConstStatement.class)
			return visitConstDeclaration((ConstStatement) node);

		if (node.getClass() == ContinueStatement.class)
			return visitContinueStatement((ContinueStatement) node);

		if (node.getClass() == DecimalLiteral.class)
			return visitDecimalLiteral((DecimalLiteral) node);

		if (node.getClass() == DefaultClause.class)
			return visitDefaultClause((DefaultClause) node);

		if (node.getClass() == DeleteStatement.class)
			return visitDeleteStatement((DeleteStatement) node);

		if (node.getClass() == DoWhileStatement.class)
			return visitDoWhileStatement((DoWhileStatement) node);

		if (node.getClass() == EmptyExpression.class)
			return visitEmptyExpression((EmptyExpression) node);

		if (node.getClass() == ExceptionFilter.class)
			return visitExceptionFilter((ExceptionFilter) node);

		if (node.getClass() == FinallyClause.class)
			return visitFinallyClause((FinallyClause) node);

		if (node.getClass() == ForStatement.class)
			return visitForStatement((ForStatement) node);

		if (node.getClass() == ForInStatement.class)
			return visitForInStatement((ForInStatement) node);

		if (node.getClass() == ForEachInStatement.class)
			return visitForEachInStatement((ForEachInStatement) node);

		if (node.getClass() == FunctionStatement.class)
			return visitFunctionStatement((FunctionStatement) node);

		if (node.getClass() == Argument.class)
			return visitArgument((Argument) node);

		if (node.getClass() == GetArrayItemExpression.class)
			return visitGetArrayItemExpression((GetArrayItemExpression) node);

		if (node.getClass() == GetMethod.class)
			return visitGetMethod((GetMethod) node);

		if (node.getClass() == Identifier.class)
			return visitIdentifier((Identifier) node);

		if (node.getClass() == IfStatement.class)
			return visitIfStatement((IfStatement) node);

		if (node.getClass() == Keyword.class)
			return visitKeyword((Keyword) node);

		if (node.getClass() == Label.class)
			return visitLabel((Label) node);

		if (node.getClass() == LabelledStatement.class)
			return visitLabelledStatement((LabelledStatement) node);

		if (node.getClass() == NewExpression.class)
			return visitNewExpression((NewExpression) node);

		if (node.getClass() == NullExpression.class)
			return visitNullExpression((NullExpression) node);

		if (node.getClass() == ObjectInitializer.class)
			return visitObjectInitializer((ObjectInitializer) node);

		if (node.getClass() == ParenthesizedExpression.class)
			return visitParenthesizedExpression((ParenthesizedExpression) node);

		if (node.getClass() == PropertyExpression.class)
			return visitPropertyExpression((PropertyExpression) node);

		if (node.getClass() == PropertyInitializer.class)
			return visitPropertyInitializer((PropertyInitializer) node);

		if (node.getClass() == RegExpLiteral.class)
			return visitRegExpLiteral((RegExpLiteral) node);

		if (node.getClass() == ReturnStatement.class)
			return visitReturnStatement((ReturnStatement) node);

		if (node.getClass() == Script.class)
			return visitScript((Script) node);

		if (node.getClass() == SetMethod.class)
			return visitSetMethod((SetMethod) node);

		if (node.getClass() == StatementBlock.class)
			return visitStatementBlock((StatementBlock) node);

		if (node.getClass() == StringLiteral.class)
			return visitStringLiteral((StringLiteral) node);

		if (node.getClass() == SwitchStatement.class)
			return visitSwitchStatement((SwitchStatement) node);

		if (node.getClass() == ThisExpression.class)
			return visitThisExpression((ThisExpression) node);

		if (node.getClass() == ThrowStatement.class)
			return visitThrowStatement((ThrowStatement) node);

		if (node.getClass() == TryStatement.class)
			return visitTryStatement((TryStatement) node);

		if (node.getClass() == TypeOfExpression.class)
			return visitTypeOfExpression((TypeOfExpression) node);

		if (node.getClass() == UnaryOperation.class)
			return visitUnaryOperation((UnaryOperation) node);

		if (node.getClass() == VariableStatement.class)
			return visitVariableStatment((VariableStatement) node);

		if (node.getClass() == VariableDeclaration.class)
			return visitVariableDeclaration((VariableDeclaration) node);

		if (node.getClass() == VoidExpression.class)
			return visitVoidExpression((VoidExpression) node);

		if (node.getClass() == WhileStatement.class)
			return visitWhileStatement((WhileStatement) node);

		if (node.getClass() == WithStatement.class)
			return visitWithStatement((WithStatement) node);

		if (node.getClass() == VoidOperator.class)
			return visitVoidOperator((VoidOperator) node);

		if (node.getClass() == XmlLiteral.class)
			return visitXmlLiteral((XmlLiteral) node);

		if (node.getClass() == DefaultXmlNamespaceStatement.class)
			return visitDefaultXmlNamespace((DefaultXmlNamespaceStatement) node);

		if (node.getClass() == XmlAttributeIdentifier.class)
			return visitXmlPropertyIdentifier((XmlAttributeIdentifier) node);

		if (node.getClass() == AsteriskExpression.class)
			return visitAsteriskExpression((AsteriskExpression) node);

		if (node.getClass() == GetAllChildrenExpression.class)
			return visitGetAllChildrenExpression((GetAllChildrenExpression) node);

		if (node.getClass() == GetLocalNameExpression.class)
			return visitGetLocalNameExpression((GetLocalNameExpression) node);

		if (node.getClass() == YieldOperator.class)
			return visitYieldOperator((YieldOperator) node);

		if (!visitUnknownNode(node)) {
			throw new UnsupportedOperationException("Unknown node type: "
					+ node.getClass());
		} else {
			return true;
		}
	}

}
