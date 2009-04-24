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

public abstract class ASTVisitor implements IASTVisitor {

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

		if (node.getClass() == ConstDeclaration.class)
			return visitConstDeclaration((ConstDeclaration) node);

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

		if (node.getClass() == StatementList.class)
			return visitStatementList((StatementList) node);

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

		if (node.getClass() == VariableDeclaration.class)
			return visitVariableDeclaration((VariableDeclaration) node);

		if (node.getClass() == VoidExpression.class)
			return visitVoidExpression((VoidExpression) node);

		if (node.getClass() == WhileStatement.class)
			return visitWhileStatement((WhileStatement) node);

		if (node.getClass() == WithStatement.class)
			return visitWithStatement((WithStatement) node);

		throw new UnsupportedOperationException("Unknown node type: "
				+ node.getClass());
	}

	public abstract boolean visitArrayInitializer(ArrayInitializer node);

	public abstract boolean visitBinaryOperation(BinaryOperation node);

	public abstract boolean visitBooleanLiteral(BooleanLiteral node);

	public abstract boolean visitBreakStatement(BreakStatement node);

	public abstract boolean visitCallExpression(CallExpression node);

	public abstract boolean visitCaseClause(CaseClause node);

	public abstract boolean visitCatchClause(CatchClause node);

	public abstract boolean visitCommaExpression(CommaExpression node);

	public abstract boolean visitConditionalOperator(ConditionalOperator node);

	public abstract boolean visitConstDeclaration(ConstDeclaration node);

	public abstract boolean visitContinueStatement(ContinueStatement node);

	public abstract boolean visitDecimalLiteral(DecimalLiteral node);

	public abstract boolean visitDefaultClause(DefaultClause node);

	public abstract boolean visitDeleteStatement(DeleteStatement node);

	public abstract boolean visitDoWhileStatement(DoWhileStatement node);

	public abstract boolean visitEmptyExpression(EmptyExpression node);

	public abstract boolean visitExceptionFilter(ExceptionFilter node);

	public abstract boolean visitFinallyClause(FinallyClause node);

	public abstract boolean visitForStatement(ForStatement node);

	public abstract boolean visitForInStatement(ForInStatement node);

	public abstract boolean visitForEachInStatement(ForEachInStatement node);

	public abstract boolean visitFunctionStatement(FunctionStatement node);

	public abstract boolean visitGetArrayItemExpression(
			GetArrayItemExpression node);

	public abstract boolean visitGetMethod(GetMethod node);

	public abstract boolean visitIdentifier(Identifier node);

	public abstract boolean visitIfStatement(IfStatement node);

	public abstract boolean visitKeyword(Keyword node);

	public abstract boolean visitLabel(Label node);

	public abstract boolean visitLabelledStatement(LabelledStatement node);

	public abstract boolean visitNewExpression(NewExpression node);

	public abstract boolean visitNullExpression(NullExpression node);

	public abstract boolean visitObjectInitializer(ObjectInitializer node);

	public abstract boolean visitParenthesizedExpression(
			ParenthesizedExpression node);

	public abstract boolean visitPropertyExpression(PropertyExpression node);

	public abstract boolean visitPropertyInitializer(PropertyInitializer node);

	public abstract boolean visitRegExpLiteral(RegExpLiteral node);

	public abstract boolean visitReturnStatement(ReturnStatement node);

	public abstract boolean visitScript(Script node);

	public abstract boolean visitSetMethod(SetMethod node);

	public abstract boolean visitStatementBlock(StatementBlock node);

	public abstract boolean visitStatementList(StatementList node);

	public abstract boolean visitStringLiteral(StringLiteral node);

	public abstract boolean visitSwitchStatement(SwitchStatement node);

	public abstract boolean visitThisExpression(ThisExpression node);

	public abstract boolean visitThrowStatement(ThrowStatement node);

	public abstract boolean visitTryStatement(TryStatement node);

	public abstract boolean visitTypeOfExpression(TypeOfExpression node);

	public abstract boolean visitUnaryOperation(UnaryOperation node);

	public abstract boolean visitVariableDeclaration(VariableDeclaration node);

	public abstract boolean visitVoidExpression(VoidExpression node);

	public abstract boolean visitWhileStatement(WhileStatement node);

	public abstract boolean visitWithStatement(WithStatement node);
}
