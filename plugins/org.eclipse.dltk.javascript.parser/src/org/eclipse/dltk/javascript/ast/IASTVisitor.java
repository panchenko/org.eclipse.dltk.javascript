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

public interface IASTVisitor {

	public boolean visitArrayInitializer(ArrayInitializer node);

	public boolean visitBinaryOperation(BinaryOperation node);

	public boolean visitBooleanLiteral(BooleanLiteral node);

	public boolean visitBreakStatement(BreakStatement node);

	public boolean visitCallExpression(CallExpression node);

	public boolean visitCaseClause(CaseClause node);

	public boolean visitCatchClause(CatchClause node);

	public boolean visitCommaExpression(CommaExpression node);

	public boolean visitConditionalOperator(ConditionalOperator node);

	public boolean visitConstDeclaration(ConstStatement node);

	public boolean visitContinueStatement(ContinueStatement node);

	public boolean visitDecimalLiteral(DecimalLiteral node);

	public boolean visitDefaultClause(DefaultClause node);

	public boolean visitDeleteStatement(DeleteStatement node);

	public boolean visitDoWhileStatement(DoWhileStatement node);

	public boolean visitEmptyExpression(EmptyExpression node);

	public boolean visitExceptionFilter(ExceptionFilter node);

	public boolean visitFinallyClause(FinallyClause node);

	public boolean visitForStatement(ForStatement node);

	public boolean visitForInStatement(ForInStatement node);

	public boolean visitForEachInStatement(ForEachInStatement node);

	public boolean visitFunctionStatement(FunctionStatement node);

	public boolean visitArgument(Argument argument);

	public boolean visitGetArrayItemExpression(GetArrayItemExpression node);

	public boolean visitGetMethod(GetMethod node);

	public boolean visitIdentifier(Identifier node);

	public boolean visitSimpleType(SimpleType node);

	public boolean visitIfStatement(IfStatement node);

	public boolean visitKeyword(Keyword node);

	public boolean visitLabel(Label node);

	public boolean visitLabelledStatement(LabelledStatement node);

	public boolean visitNewExpression(NewExpression node);

	public boolean visitNullExpression(NullExpression node);

	public boolean visitObjectInitializer(ObjectInitializer node);

	public boolean visitParenthesizedExpression(ParenthesizedExpression node);

	public boolean visitPropertyExpression(PropertyExpression node);

	public boolean visitPropertyInitializer(PropertyInitializer node);

	public boolean visitRegExpLiteral(RegExpLiteral node);

	public boolean visitReturnStatement(ReturnStatement node);

	public boolean visitScript(Script node);

	public boolean visitSetMethod(SetMethod node);

	public boolean visitStatementBlock(StatementBlock node);

	public boolean visitStringLiteral(StringLiteral node);

	public boolean visitSwitchStatement(SwitchStatement node);

	public boolean visitThisExpression(ThisExpression node);

	public boolean visitThrowStatement(ThrowStatement node);

	public boolean visitTryStatement(TryStatement node);

	public boolean visitTypeOfExpression(TypeOfExpression node);

	public boolean visitUnaryOperation(UnaryOperation node);

	public boolean visitVariableStatment(VariableStatement node);

	public boolean visitVariableDeclaration(VariableDeclaration node);

	public boolean visitVoidExpression(VoidExpression node);

	public boolean visitVoidOperator(VoidOperator node);

	public boolean visitYieldOperator(YieldOperator node);

	public boolean visitWhileStatement(WhileStatement node);

	public boolean visitWithStatement(WithStatement node);

	public boolean visitXmlLiteral(XmlLiteral node);

	public boolean visitDefaultXmlNamespace(DefaultXmlNamespaceStatement node);

	public boolean visitXmlPropertyIdentifier(XmlAttributeIdentifier node);

	public boolean visitAsteriskExpression(AsteriskExpression node);

	public boolean visitGetAllChildrenExpression(GetAllChildrenExpression node);

	public boolean visitGetLocalNameExpression(GetLocalNameExpression node);

	/**
	 * @since 2.0
	 */
	public boolean visitUnknownNode(ASTNode node);

}
