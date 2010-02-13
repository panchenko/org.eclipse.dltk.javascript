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
package org.eclipse.dltk.javascript.parser.tests;

import java.util.List;

import junit.framework.Assert;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.javascript.ast.ASTVisitor;
import org.eclipse.dltk.javascript.ast.Argument;
import org.eclipse.dltk.javascript.ast.ArrayInitializer;
import org.eclipse.dltk.javascript.ast.AsteriskExpression;
import org.eclipse.dltk.javascript.ast.BinaryOperation;
import org.eclipse.dltk.javascript.ast.BooleanLiteral;
import org.eclipse.dltk.javascript.ast.BreakStatement;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.CaseClause;
import org.eclipse.dltk.javascript.ast.CatchClause;
import org.eclipse.dltk.javascript.ast.CommaExpression;
import org.eclipse.dltk.javascript.ast.ConditionalOperator;
import org.eclipse.dltk.javascript.ast.ConstStatement;
import org.eclipse.dltk.javascript.ast.ContinueStatement;
import org.eclipse.dltk.javascript.ast.DecimalLiteral;
import org.eclipse.dltk.javascript.ast.DefaultClause;
import org.eclipse.dltk.javascript.ast.DefaultXmlNamespaceStatement;
import org.eclipse.dltk.javascript.ast.DeleteStatement;
import org.eclipse.dltk.javascript.ast.DoWhileStatement;
import org.eclipse.dltk.javascript.ast.EmptyExpression;
import org.eclipse.dltk.javascript.ast.ExceptionFilter;
import org.eclipse.dltk.javascript.ast.FinallyClause;
import org.eclipse.dltk.javascript.ast.ForEachInStatement;
import org.eclipse.dltk.javascript.ast.ForInStatement;
import org.eclipse.dltk.javascript.ast.ForStatement;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.GetAllChildrenExpression;
import org.eclipse.dltk.javascript.ast.GetArrayItemExpression;
import org.eclipse.dltk.javascript.ast.GetLocalNameExpression;
import org.eclipse.dltk.javascript.ast.GetMethod;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.IfStatement;
import org.eclipse.dltk.javascript.ast.Keyword;
import org.eclipse.dltk.javascript.ast.Keywords;
import org.eclipse.dltk.javascript.ast.Label;
import org.eclipse.dltk.javascript.ast.LabelledStatement;
import org.eclipse.dltk.javascript.ast.NewExpression;
import org.eclipse.dltk.javascript.ast.NullExpression;
import org.eclipse.dltk.javascript.ast.ObjectInitializer;
import org.eclipse.dltk.javascript.ast.ParenthesizedExpression;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.PropertyInitializer;
import org.eclipse.dltk.javascript.ast.RegExpLiteral;
import org.eclipse.dltk.javascript.ast.ReturnStatement;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.SetMethod;
import org.eclipse.dltk.javascript.ast.SimpleType;
import org.eclipse.dltk.javascript.ast.StatementBlock;
import org.eclipse.dltk.javascript.ast.StringLiteral;
import org.eclipse.dltk.javascript.ast.SwitchComponent;
import org.eclipse.dltk.javascript.ast.SwitchStatement;
import org.eclipse.dltk.javascript.ast.ThisExpression;
import org.eclipse.dltk.javascript.ast.ThrowStatement;
import org.eclipse.dltk.javascript.ast.TryStatement;
import org.eclipse.dltk.javascript.ast.TypeOfExpression;
import org.eclipse.dltk.javascript.ast.UnaryOperation;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.ast.VariableStatement;
import org.eclipse.dltk.javascript.ast.VoidExpression;
import org.eclipse.dltk.javascript.ast.VoidOperator;
import org.eclipse.dltk.javascript.ast.WhileStatement;
import org.eclipse.dltk.javascript.ast.WithStatement;
import org.eclipse.dltk.javascript.ast.XmlAttributeIdentifier;
import org.eclipse.dltk.javascript.ast.XmlExpressionFragment;
import org.eclipse.dltk.javascript.ast.XmlFragment;
import org.eclipse.dltk.javascript.ast.XmlLiteral;
import org.eclipse.dltk.javascript.ast.XmlTextFragment;
import org.eclipse.dltk.javascript.ast.YieldOperator;

public class ASTVerifier extends ASTVisitor<Boolean> {

	private String source;
	private Script root;

	public ASTVerifier(Script root, String source) {
		this.root = root;
		this.source = source;
	}

	public void verify() {
		visit(root);
	}

	private void testChar(char ch, int charAt) {
		Assert.assertEquals(ch, source.charAt(charAt));
	}

	private void testCharIfExists(char ch, int charAt) {

		if (charAt > -1)
			Assert.assertEquals(ch, source.charAt(charAt));
	}

	private void testCharList(char ch, List<Integer> charIndexes) {
		for (int i = 0; i < charIndexes.size(); i++) {
			int charAt = charIndexes.get(i).intValue();
			Assert.assertTrue(charAt > -1);
			testChar(ch, charAt);
		}
	}

	private void testString(String text, int start, int end) {

		Assert.assertTrue(start >= 0);
		Assert.assertTrue(end > 0);
		Assert.assertTrue(end > start);

		Assert.assertEquals(text, source.substring(start, end));
	}

	@Override
	public Boolean visitArrayInitializer(ArrayInitializer node) {

		testCharList(Keywords.COMMA, node.getCommas());
		visit(node.getItems());
		testChar(Keywords.LB, node.getLB());
		testChar(Keywords.RB, node.getRB());

		return true;
	}

	@Override
	public Boolean visitBinaryOperation(BinaryOperation node) {

		testString(node.getOperationText(), node.getOperationPosition(), node
				.getOperationPosition()
				+ node.getOperationText().length());

		visit(node.getLeftExpression());
		visit(node.getRightExpression());

		return true;
	}

	@Override
	public Boolean visitBooleanLiteral(BooleanLiteral node) {

		testString(node.getText(), node.sourceStart(), node.sourceEnd());

		return true;
	}

	@Override
	public Boolean visitBreakStatement(BreakStatement node) {

		visit(node.getBreakKeyword());
		testLabel(node.getLabel());
		testChar(Keywords.SEMI, node.getSemicolonPosition());

		return true;
	}

	@Override
	public Boolean visitCallExpression(CallExpression node) {

		visit(node.getExpression());
		visit(node.getArguments());

		testChar(Keywords.LP, node.getLP());
		testChar(Keywords.RP, node.getRP());
		testCharList(Keywords.COMMA, node.getCommas());

		return true;
	}

	@Override
	public Boolean visitCatchClause(CatchClause node) {

		visit(node.getCatchKeyword());
		visit(node.getException());
		if (node.getExceptionFilter() != null)
			visit(node.getExceptionFilter());
		visit(node.getStatement());

		testChar(Keywords.LP, node.getLP());
		testChar(Keywords.RP, node.getRP());

		return true;
	}

	@Override
	public Boolean visitCommaExpression(CommaExpression node) {

		testCharList(Keywords.COMMA, node.getCommas());
		visit(node.getItems());

		return true;
	}

	@Override
	public Boolean visitConditionalOperator(ConditionalOperator node) {

		visit(node.getCondition());
		visit(node.getTrueValue());
		visit(node.getFalseValue());

		testChar(Keywords.COLON, node.getColonPosition());
		testChar(Keywords.HOOK, node.getQuestionPosition());

		return true;
	}

	@Override
	public Boolean visitConstDeclaration(ConstStatement node) {
		visit(node.getConstKeyword());
		visit(node.getVariables());

		testChar(Keywords.SEMI, node.getSemicolonPosition());

		return true;
	}

	@Override
	public Boolean visitContinueStatement(ContinueStatement node) {

		visit(node.getContinueKeyword());
		testLabel(node.getLabel());
		testCharIfExists(Keywords.SEMI, node.getSemicolonPosition());

		return true;
	}

	@Override
	public Boolean visitDecimalLiteral(DecimalLiteral node) {

		testString(node.getText(), node.sourceStart(), node.sourceEnd());

		return true;
	}

	@Override
	public Boolean visitDeleteStatement(DeleteStatement node) {

		visit(node.getDeleteKeyword());
		visit(node.getExpression());

		return true;
	}

	@Override
	public Boolean visitDoWhileStatement(DoWhileStatement node) {

		visit(node.getDoKeyword());
		visit(node.getBody());
		visit(node.getWhileKeyword());
		visit(node.getCondition());

		testChar(Keywords.LP, node.getLP());
		testChar(Keywords.RP, node.getRP());
		testChar(Keywords.SEMI, node.getSemicolonPosition());

		return true;
	}

	@Override
	public Boolean visitEmptyExpression(EmptyExpression node) {

		// Assert.assertTrue(node.sourceStart() < 0);
		// Assert.assertTrue(node.sourceEnd() < 0);

		return true;
	}

	@Override
	public Boolean visitExceptionFilter(ExceptionFilter node) {

		visit(node.getIfKeyword());
		visit(node.getExpression());

		return true;
	}

	@Override
	public Boolean visitFinallyClause(FinallyClause node) {

		visit(node.getFinallyKeyword());
		visit(node.getStatement());

		return true;
	}

	@Override
	public Boolean visitForEachInStatement(ForEachInStatement node) {

		visit(node.getForKeyword());
		visit(node.getEachKeyword());

		if (node.getBody() != null)
			node.getBody();

		visit(node.getItem());
		visit(node.getInKeyword());
		visit(node.getIterator());

		testChar(Keywords.LP, node.getLP());
		testChar(Keywords.RP, node.getRP());
		testCharIfExists(Keywords.SEMI, node.getSemicolonPosition());

		return true;
	}

	@Override
	public Boolean visitGetArrayItemExpression(GetArrayItemExpression node) {

		visit(node.getArray());
		visit(node.getIndex());

		testChar(Keywords.LB, node.getLB());
		testChar(Keywords.RB, node.getRB());

		return true;
	}

	@Override
	public Boolean visitGetMethod(GetMethod node) {

		visit(node.getName());
		visit(node.getGetKeyword());
		visit(node.getBody());
		testChar(Keywords.LP, node.getLP());
		testChar(Keywords.RP, node.getRP());

		return true;
	}

	@Override
	public Boolean visitIdentifier(Identifier node) {

		testString(node.getName(), node.sourceStart(), node.sourceEnd());

		return true;
	}

	@Override
	public Boolean visitSimpleType(SimpleType node) {
		testString(node.getName(), node.sourceStart(), node.sourceEnd());
		return true;
	}

	@Override
	public Boolean visitIfStatement(IfStatement node) {

		visit(node.getIfKeyword());
		visit(node.getCondition());
		visit(node.getThenStatement());
		if (node.getElseStatement() != null) {
			visit(node.getElseKeyword());
			visit(node.getElseStatement());
		}
		testChar(Keywords.LP, node.getLP());
		testChar(Keywords.RP, node.getRP());

		return true;
	}

	@Override
	public Boolean visitKeyword(Keyword node) {

		testString(node.getKeyword(), node.sourceStart(), node.sourceEnd());

		return true;
	}

	private void testLabel(Label node) {
		if (node != null) {
			testString(node.getText(), node.sourceStart(), node.sourceEnd());
		}
	}

	@Override
	public Boolean visitLabelledStatement(LabelledStatement node) {

		testLabel(node.getLabel());
		testChar(Keywords.COLON, node.getColonPosition());
		visit(node.getStatement());

		return true;
	}

	@Override
	public Boolean visitNewExpression(NewExpression node) {

		visit(node.getNewKeyword());
		visit(node.getObjectClass());

		return true;
	}

	@Override
	public Boolean visitNullExpression(NullExpression node) {

		testString(node.getText(), node.sourceStart(), node.sourceEnd());

		return true;
	}

	@Override
	public Boolean visitObjectInitializer(ObjectInitializer node) {

		testCharList(Keywords.COMMA, node.getCommas());
		visit(node.getInitializers());

		testChar(Keywords.LC, node.getLC());
		testChar(Keywords.RC, node.getRC());

		return true;
	}

	@Override
	public Boolean visitParenthesizedExpression(ParenthesizedExpression node) {

		visit(node.getExpression());

		testChar(Keywords.LP, node.getLP());
		testChar(Keywords.RP, node.getRP());

		return true;
	}

	@Override
	public Boolean visitPropertyExpression(PropertyExpression node) {

		testChar(Keywords.DOT, node.getDotPosition());

		visit(node.getObject());
		visit(node.getProperty());

		return true;
	}

	@Override
	public Boolean visitPropertyInitializer(PropertyInitializer node) {

		testChar(Keywords.COLON, node.getColon());

		visit(node.getName());
		visit(node.getValue());

		return true;
	}

	@Override
	public Boolean visitRegExpLiteral(RegExpLiteral node) {

		testString(node.getText(), node.sourceStart(), node.sourceEnd());

		return true;
	}

	@Override
	public Boolean visitReturnStatement(ReturnStatement node) {

		visitKeyword(node.getReturnKeyword());

		if (node.getValue() != null)
			visit(node.getValue());

		testCharIfExists(Keywords.SEMI, node.getSemicolonPosition());

		return true;
	}

	@Override
	public Boolean visitScript(Script node) {

		Assert.assertEquals(0, node.sourceStart());
		Assert.assertEquals(source.length(), node.sourceEnd());

		visit(node.getStatements());
		return true;
	}

	@Override
	public Boolean visitSetMethod(SetMethod node) {

		visit(node.getSetKeyword());
		visit(node.getName());
		visit(node.getArgument());
		visit(node.getBody());

		testChar(Keywords.LP, node.getLP());
		testChar(Keywords.RP, node.getRP());

		return true;
	}

	@Override
	public Boolean visitStatementBlock(StatementBlock node) {

		testChar(Keywords.LC, node.getLC());
		testChar(Keywords.RC, node.getRC());

		visit(node.getStatements());

		return true;
	}

	@Override
	public Boolean visitStringLiteral(StringLiteral node) {

		testString(node.getText(), node.sourceStart(), node.sourceEnd());

		return true;
	}

	@Override
	public Boolean visitSwitchStatement(SwitchStatement node) {

		visit(node.getCondition());
		for (SwitchComponent component : node.getCaseClauses()) {
			if (component instanceof CaseClause) {
				final CaseClause caseClause = (CaseClause) component;
				visit(caseClause.getCaseKeyword());
				visit(caseClause.getCondition());
				testChar(Keywords.COLON, caseClause.getColonPosition());
				visit(caseClause.getStatements());
			} else {
				final DefaultClause defaultClause = (DefaultClause) component;
				visit(defaultClause.getDefaultKeyword());
				testChar(Keywords.COLON, defaultClause.getColonPosition());
				visit(defaultClause.getStatements());
			}
		}

		testChar(Keywords.LC, node.getLC());
		testChar(Keywords.RC, node.getRC());
		testChar(Keywords.LP, node.getLP());
		testChar(Keywords.RP, node.getRP());

		return true;
	}

	@Override
	public Boolean visitThisExpression(ThisExpression node) {

		visitKeyword(node.getThisKeyword());

		return true;
	}

	@Override
	public Boolean visitThrowStatement(ThrowStatement node) {

		visit(node.getThrowKeyword());
		visit(node.getException());

		if (node.getSemicolonPosition() > 0)
			testChar(Keywords.SEMI, node.getSemicolonPosition());

		return true;
	}

	@Override
	public Boolean visitTryStatement(TryStatement node) {

		visit(node.getTryKeyword());
		visit(node.getBody());
		visit(node.getCatches());

		if (node.getFinally() != null)
			visit(node.getFinally());

		return true;
	}

	@Override
	public Boolean visitTypeOfExpression(TypeOfExpression node) {

		visit(node.getExpression());
		visit(node.getTypeOfKeyword());

		return true;
	}

	@Override
	public Boolean visitUnaryOperation(UnaryOperation node) {

		visit(node.getExpression());

		testString(node.getOperationText(), node.getOperationPosition(), node
				.getOperationPosition()
				+ node.getOperationText().length());

		return true;
	}

	@Override
	public Boolean visitVariableStatment(VariableStatement node) {

		visit(node.getVarKeyword());
		visit(node.getVariables());

		return true;
	}

	@Override
	public Boolean visitVariableDeclaration(VariableDeclaration declaration) {
		visit(declaration.getIdentifier());
		if (declaration.getType() != null) {
			visit(declaration.getType());
		}
		if (declaration.getInitializer() != null) {
			visit(declaration.getInitializer());
		}
		if (declaration.getColonPosition() != -1) {
			testChar(':', declaration.getColonPosition());
		}
		if (declaration.getAssignPosition() != -1) {
			testChar('=', declaration.getAssignPosition());
		}
		if (declaration.getCommaPosition() != -1) {
			testChar(',', declaration.getCommaPosition());
		}
		return true;
	}

	@Override
	public Boolean visitVoidExpression(VoidExpression node) {

		testCharIfExists(Keywords.SEMI, node.getSemicolonPosition());

		visit(node.getExpression());

		return true;
	}

	@Override
	public Boolean visitWhileStatement(WhileStatement node) {

		visit(node.getWhileKeyword());
		visit(node.getCondition());

		if (node.getBody() != null)
			visit(node.getBody());

		testChar(Keywords.LP, node.getLP());
		testChar(Keywords.RP, node.getRP());

		return true;
	}

	@Override
	public Boolean visitWithStatement(WithStatement node) {

		testChar(Keywords.LP, node.getLP());
		testChar(Keywords.RP, node.getRP());

		visit(node.getWithKeyword());
		visit(node.getExpression());
		visit(node.getStatement());

		return true;
	}

	@Override
	public Boolean visitForInStatement(ForInStatement node) {

		visit(node.getForKeyword());

		if (node.getBody() != null)
			node.getBody();

		visit(node.getItem());
		visit(node.getInKeyword());
		visit(node.getIterator());

		testChar(Keywords.LP, node.getLP());
		testChar(Keywords.RP, node.getRP());
		testCharIfExists(Keywords.SEMI, node.getSemicolonPosition());

		return true;
	}

	@Override
	public Boolean visitFunctionStatement(FunctionStatement node) {

		visit(node.getFunctionKeyword());
		visit(node.getArguments());
		visit(node.getBody());

		if (node.getName() != null)
			visit(node.getName());

		testChar(Keywords.LP, node.getLP());
		testChar(Keywords.RP, node.getRP());

		return true;
	}

	@Override
	public Boolean visitArgument(Argument argument) {
		visit(argument.getIdentifier());
		if (argument.getType() != null) {
			visit(argument.getType());
		}
		if (argument.getColonPosition() != -1) {
			testChar(':', argument.getColonPosition());
		}
		if (argument.getCommaPosition() != -1) {
			testChar(',', argument.getCommaPosition());
		}
		return true;
	}

	@Override
	public Boolean visitForStatement(ForStatement node) {

		visit(node.getForKeyword());

		visit(node.getInitial());
		visit(node.getCondition());
		visit(node.getStep());

		if (node.getBody() != null)
			visit(node.getBody());

		testChar(Keywords.SEMI, node.getConditionalSemicolonPosition());
		testChar(Keywords.SEMI, node.getInitialSemicolonPosition());
		testCharIfExists(Keywords.SEMI, node.getSemicolonPosition());
		testChar(Keywords.LP, node.getLP());
		testChar(Keywords.RP, node.getRP());

		return true;
	}

	@Override
	public Boolean visitVoidOperator(VoidOperator node) {
		visit(node.getExpression());
		visit(node.getVoidKeyword());

		return true;
	}

	@Override
	public Boolean visitXmlLiteral(XmlLiteral node) {
		for (XmlFragment fragment : node.getFragments()) {
			if (fragment instanceof XmlTextFragment) {
				XmlTextFragment textFragment = (XmlTextFragment) fragment;
				testString(textFragment.getXml(), fragment.sourceStart(),
						fragment.sourceEnd());
			} else {
				XmlExpressionFragment expression = (XmlExpressionFragment) fragment;
				visit(expression.getExpression());
				// TODO curly braces
			}
		}
		return true;
	}

	@Override
	public Boolean visitDefaultXmlNamespace(DefaultXmlNamespaceStatement node) {

		visit(node.getDefaultKeyword());
		visit(node.getXmlKeyword());
		visit(node.getNamespaceKeyword());

		testChar(Keywords.ASSIGN, node.getAssignOperation());
		testCharIfExists(Keywords.SEMI, node.getSemicolonPosition());

		return true;
	}

	@Override
	public Boolean visitAsteriskExpression(AsteriskExpression node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean visitGetAllChildrenExpression(GetAllChildrenExpression node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean visitGetLocalNameExpression(GetLocalNameExpression node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean visitXmlPropertyIdentifier(XmlAttributeIdentifier node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean visitYieldOperator(YieldOperator node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean visitUnknownNode(ASTNode node) {
		return false;
	}
}
