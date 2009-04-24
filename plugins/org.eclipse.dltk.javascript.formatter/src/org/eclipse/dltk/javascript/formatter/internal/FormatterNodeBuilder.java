package org.eclipse.dltk.javascript.formatter.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.formatter.AbstractFormatterNodeBuilder;
import org.eclipse.dltk.formatter.FormatterBlockNode;
import org.eclipse.dltk.formatter.FormatterIndentedBlockNode;
import org.eclipse.dltk.formatter.FormatterUtils;
import org.eclipse.dltk.formatter.IFormatterContainerNode;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterTextNode;
import org.eclipse.dltk.javascript.ast.ArrayInitializer;
import org.eclipse.dltk.javascript.ast.BinaryOperation;
import org.eclipse.dltk.javascript.ast.BooleanLiteral;
import org.eclipse.dltk.javascript.ast.BreakStatement;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.CaseClause;
import org.eclipse.dltk.javascript.ast.CatchClause;
import org.eclipse.dltk.javascript.ast.CommaExpression;
import org.eclipse.dltk.javascript.ast.ConditionalOperator;
import org.eclipse.dltk.javascript.ast.ConstDeclaration;
import org.eclipse.dltk.javascript.ast.ContinueStatement;
import org.eclipse.dltk.javascript.ast.DecimalLiteral;
import org.eclipse.dltk.javascript.ast.DefaultClause;
import org.eclipse.dltk.javascript.ast.DeleteStatement;
import org.eclipse.dltk.javascript.ast.DoWhileStatement;
import org.eclipse.dltk.javascript.ast.EmptyExpression;
import org.eclipse.dltk.javascript.ast.ExceptionFilter;
import org.eclipse.dltk.javascript.ast.FinallyClause;
import org.eclipse.dltk.javascript.ast.ForEachInStatement;
import org.eclipse.dltk.javascript.ast.ForInStatement;
import org.eclipse.dltk.javascript.ast.ForStatement;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.GetArrayItemExpression;
import org.eclipse.dltk.javascript.ast.GetMethod;
import org.eclipse.dltk.javascript.ast.IASTVisitor;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.IfStatement;
import org.eclipse.dltk.javascript.ast.Keyword;
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
import org.eclipse.dltk.javascript.ast.StatementBlock;
import org.eclipse.dltk.javascript.ast.StatementList;
import org.eclipse.dltk.javascript.ast.StringLiteral;
import org.eclipse.dltk.javascript.ast.SwitchStatement;
import org.eclipse.dltk.javascript.ast.ThisExpression;
import org.eclipse.dltk.javascript.ast.ThrowStatement;
import org.eclipse.dltk.javascript.ast.TryStatement;
import org.eclipse.dltk.javascript.ast.TypeOfExpression;
import org.eclipse.dltk.javascript.ast.UnaryOperation;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.ast.VoidExpression;
import org.eclipse.dltk.javascript.ast.VoidOperator;
import org.eclipse.dltk.javascript.ast.WhileStatement;
import org.eclipse.dltk.javascript.ast.WithStatement;
import org.eclipse.dltk.javascript.formatter.internal.nodes.AbstractParensConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.ArrayBracketsConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.BlockBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.BracesNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.BracketsNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.CallParensConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.CaseBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.CatchBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.CatchParensConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.DoWhileBlockBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.ElseBlockBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.ElseIfBlockBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.EmptyArrayBracketsConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.ExpressionParensConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FinallyBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.ForParensConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterBinaryOperationNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterBreakNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterCaseNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterCatchClauseNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterConstDeclarationNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterContinueNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterDeleteStatementNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterElseIfNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterElseKeywordNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterElseNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterExceptionFilterNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterFinallyClauseNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterForInStatementNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterForStatementNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterFunctionNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterGetMethodNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterLabelledStatementNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterNewExpressionNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterObjectInitializerNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterReturnStatementNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterRootNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterScriptNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterSetMethodNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterStringNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterSwitchNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterThrowNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterTypeofNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterUnaryOperationNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterVariableDeclarationNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterVoidExpressionNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FormatterVoidOperatorNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FunctionArgumentsParensConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FunctionBodyBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FunctionExpressionBodyBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.FunctionNoArgumentsParensConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.IBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.IBracketsConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.IParensConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.IfConditionParensConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.ObjectInitializerBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.ParensNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.SemicolonNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.StatementBlockBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.SwitchBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.SwitchConditionParensConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.ThenBlockBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.TrailingColonNode;
import org.eclipse.dltk.javascript.formatter.internal.nodes.TryBodyConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.WhileBlockBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.WhileConditionParensConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.WithBlockBracesConfiguration;
import org.eclipse.dltk.javascript.formatter.internal.nodes.WithConditionParensConfiguration;

public class FormatterNodeBuilder extends AbstractFormatterNodeBuilder {
	public IFormatterContainerNode build(Script astRoot,
			final IFormatterDocument document) {

		final IFormatterContainerNode root = new FormatterRootNode(document);
		start(root);

		astRoot.visitAll(new IASTVisitor() {

			public boolean visit(ASTNode node) {

				// System.out.println(node.getClass());
				// System.out.println(((ISourceable)
				// node).toSourceString("    "));

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

				if (node.getClass() == VoidOperator.class)
					return visitVoidOperator((VoidOperator) node);

				throw new UnsupportedOperationException("Unknown node type: "
						+ node.getClass());
			}

			public boolean visitArrayInitializer(ArrayInitializer node) {

				IBracketsConfiguration configuration;
				if (node.getItems().size() > 0)
					configuration = new ArrayBracketsConfiguration(document);
				else
					configuration = new EmptyArrayBracketsConfiguration(
							document);

				processBrackets(node.getLB(), node.getRB(), node.getItems(),
						configuration);

				return true;
			}

			public boolean visitBinaryOperation(BinaryOperation node) {

				// TODO Think about using begin-end node to insert spaces
				// between arguments and operation symbol!

				FormatterBinaryOperationNode formatterNode = new FormatterBinaryOperationNode(
						document);

				formatterNode.setBegin(createEmptyTextNode(document, node
						.sourceStart()));

				push(formatterNode);

				visit(node.getLeftExpression());

				addChild(createTextNode(document, node.getOperationPosition(),
						node.getOperationPosition()
								+ node.getOperationText().length()));

				visit(node.getRightExpression());

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitBooleanLiteral(BooleanLiteral node) {
				FormatterStringNode strNode = new FormatterStringNode(document,
						node);
				addChild(strNode);
				return false;
			}

			public boolean visitBreakStatement(BreakStatement node) {

				FormatterBreakNode formatterNode = new FormatterBreakNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getBreakKeyword()));

				push(formatterNode);

				if (node.getLabel() != null)
					visit(node.getLabel());

				if (node.getSemicolonPosition() > -1) {

					checkedPop(formatterNode, node.getSemicolonPosition() /*- 1*/);

					addChild(createSemicolonNode(document, node
							.getSemicolonPosition()));
				} else {

					checkedPop(formatterNode, node.sourceEnd());
				}

				return true;
			}

			public boolean visitCallExpression(CallExpression node) {

				FormatterBlockNode formatterNode = new FormatterBlockNode(
						document);

				formatterNode.addChild(createEmptyTextNode(document, node
						.sourceStart()));

				push(formatterNode);

				visit(node.getExpression());

				processParens(node.getLP(), node.getRP(), node.getArguments(),
						new CallParensConfiguration(document));

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			private void processTrailingColon(int colon, ASTNode keywordNode,
					ASTNode valueNode) {
				TrailingColonNode formatterNode = new TrailingColonNode(
						document);

				formatterNode.setBegin(createTextNode(document, keywordNode));

				push(formatterNode);

				if (valueNode != null)
					visit(valueNode);

				formatterNode.addChild(createCharNode(document, colon));

				checkedPop(formatterNode, colon);
			}

			public boolean visitCaseClause(CaseClause node) {
				FormatterCaseNode formatterNode = new FormatterCaseNode(
						document);

				formatterNode.setBegin(createEmptyTextNode(document, node
						.getCaseKeyword().sourceStart()));

				push(formatterNode);

				processTrailingColon(node.getColonPosition(), node
						.getCaseKeyword(), node.getCondition());

				processBraces(node.getStatements(),
						new CaseBracesConfiguration(document));

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitCatchClause(CatchClause node) {

				FormatterCatchClauseNode formatterNode = new FormatterCatchClauseNode(
						document);

				formatterNode.addChild(createTextNode(document, node
						.getCatchKeyword()));

				push(formatterNode);

				List exceptionNodes = new ArrayList();
				exceptionNodes.add(node.getException());
				if (node.getExceptionFilter() != null) {
					exceptionNodes.add(node.getExceptionFilter());
				}

				processParens(node.getLP(), node.getRP(), exceptionNodes,
						new CatchParensConfiguration(document));

				processBraces(node.getStatement(),
						new CatchBracesConfiguration(document));

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitCommaExpression(CommaExpression node) {

				visitNodeList(node.getItems());

				return true;
			}

			public boolean visitConditionalOperator(ConditionalOperator node) {

				FormatterBlockNode formatterNode = new FormatterBlockNode(
						document);

				formatterNode.addChild(createEmptyTextNode(document, node
						.sourceStart()));

				push(formatterNode);

				visit(node.getCondition());
				visit(node.getTrueValue());
				visit(node.getFalseValue());

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitConstDeclaration(ConstDeclaration node) {

				FormatterConstDeclarationNode formatterNode = new FormatterConstDeclarationNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getConstKeyword()));

				push(formatterNode);

				visitNodeList(node.getConsts());

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitContinueStatement(ContinueStatement node) {

				FormatterContinueNode formatterNode = new FormatterContinueNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getContinueKeyword()));

				push(formatterNode);

				if (node.getLabel() != null)
					visit(node.getLabel());

				if (node.getSemicolonPosition() > -1) {

					checkedPop(formatterNode, node.getSemicolonPosition() /*- 1*/);

					addChild(createSemicolonNode(document, node
							.getSemicolonPosition()));
				} else {

					checkedPop(formatterNode, node.sourceEnd());
				}

				return true;
			}

			public boolean visitDecimalLiteral(DecimalLiteral node) {
				FormatterStringNode strNode = new FormatterStringNode(document,
						node);
				addChild(strNode);
				return false;
			}

			public boolean visitDefaultClause(DefaultClause node) {
				FormatterCaseNode formatterNode = new FormatterCaseNode(
						document);

				formatterNode.setBegin(createEmptyTextNode(document, node
						.getDefaultKeyword().sourceStart()));

				push(formatterNode);

				processTrailingColon(node.getColonPosition(), node
						.getDefaultKeyword(), null);

				processBraces(node.getStatements(),
						new CaseBracesConfiguration(document));

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitDeleteStatement(DeleteStatement node) {
				FormatterDeleteStatementNode formatterNode = new FormatterDeleteStatementNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getDeleteKeyword()));

				push(formatterNode);

				visit(node.getExpression());

				if (node.getSemicolonPosition() > -1) {

					checkedPop(formatterNode, node.getSemicolonPosition() /*- 1*/);

					formatterNode.setEnd(createSemicolonNode(document, node
							.getSemicolonPosition()));
				} else {

					checkedPop(formatterNode, node.sourceEnd());
				}

				return true;
			}

			public boolean visitDoWhileStatement(DoWhileStatement node) {

				FormatterBlockNode formatterNode = new FormatterBlockNode(
						document);

				formatterNode.addChild(createTextNode(document, node
						.getDoKeyword()));

				push(formatterNode);

				processBraces(node.getBody(),
						new DoWhileBlockBracesConfiguration(document));

				visit(node.getWhileKeyword());

				processParens(node.getLP(), node.getRP(), node.getCondition(),
						new WhileConditionParensConfiguration(document));

				addChild(createSemicolonNode(document, node.getSemicolon()));
				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitEmptyExpression(EmptyExpression node) {
				// nothing
				return true;
			}

			public boolean visitExceptionFilter(ExceptionFilter node) {
				FormatterExceptionFilterNode formatterNode = new FormatterExceptionFilterNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getIfKeyword()));

				push(formatterNode);

				visit(node.getExpression());

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitFinallyClause(FinallyClause node) {
				FormatterFinallyClauseNode formatterNode = new FormatterFinallyClauseNode(
						document);

				formatterNode.addChild(createTextNode(document, node
						.getFinallyKeyword()));

				push(formatterNode);

				processBraces(node.getStatement(),
						new FinallyBracesConfiguration(document));

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitForEachInStatement(ForEachInStatement node) {

				FormatterForInStatementNode formatterNode = new FormatterForInStatementNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getForKeyword()));

				push(formatterNode);

				List nodes = new ArrayList();

				nodes.add(node.getItem());
				nodes.add(node.getInKeyword());
				nodes.add(node.getIterator());

				processParens(node.getLP(), node.getRP(), nodes,
						new ForParensConfiguration(document));

				if (node.getBody() != null)
					processBraces(node.getBody(), new BlockBracesConfiguration(
							document));

				if (node.getSemicolonPosition() > -1) {

					checkedPop(formatterNode, node.getSemicolonPosition() /*- 1*/);

					addChild(createSemicolonNode(document, node
							.getSemicolonPosition()));

				} else {

					checkedPop(formatterNode, node.sourceEnd());
				}

				return true;
			}

			public boolean visitForInStatement(ForInStatement node) {

				FormatterForInStatementNode formatterNode = new FormatterForInStatementNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getForKeyword()));

				push(formatterNode);

				List nodes = new ArrayList();

				nodes.add(node.getItem());
				nodes.add(node.getInKeyword());
				nodes.add(node.getIterator());

				processParens(node.getLP(), node.getRP(), nodes,
						new ForParensConfiguration(document));

				if (node.getBody() != null)
					processBraces(node.getBody(), new BlockBracesConfiguration(
							document));

				if (node.getSemicolonPosition() > -1) {

					checkedPop(formatterNode, node.getSemicolonPosition() /*- 1*/);

					addChild(createSemicolonNode(document, node
							.getSemicolonPosition()));

				} else {

					checkedPop(formatterNode, node.sourceEnd());
				}

				return true;
			}

			public boolean visitForStatement(ForStatement node) {

				FormatterForStatementNode formatterNode = new FormatterForStatementNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getForKeyword()));

				push(formatterNode);

				List nodes = new ArrayList();

				nodes.add(node.getInitial());
				nodes.add(node.getCondition());
				nodes.add(node.getStep());

				processParens(node.getLP(), node.getRP(), nodes,
						new ForParensConfiguration(document));

				if (node.getBody() != null)
					processBraces(node.getBody(), new BlockBracesConfiguration(
							document));

				if (node.getTrailingSemicolonPosition() > -1) {

					checkedPop(formatterNode, node
							.getTrailingSemicolonPosition()/* - 1 */);

					addChild(createSemicolonNode(document, node
							.getTrailingSemicolonPosition()));

				} else {

					checkedPop(formatterNode, node.sourceEnd());
				}

				return true;
			}

			public boolean visitFunctionStatement(FunctionStatement node) {

				FormatterFunctionNode formatterNode = new FormatterFunctionNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getFunctionKeyword()));

				push(formatterNode);

				if (node.getName() != null)
					visit(node.getName());

				AbstractParensConfiguration argsConfiguration;

				if (node.getArguments().size() == 0) {
					argsConfiguration = new FunctionNoArgumentsParensConfiguration(
							document);
				} else {
					argsConfiguration = new FunctionArgumentsParensConfiguration(
							document);
				}

				processParens(node.getLP(), node.getRP(), node.getArguments(),
						argsConfiguration);

				IBracesConfiguration bodyConfiguration;

				if (node.getName() != null)
					bodyConfiguration = new FunctionBodyBracesConfiguration(
							document);
				else
					bodyConfiguration = new FunctionExpressionBodyBracesConfiguration(
							document);

				processBraces(node.getBody(), bodyConfiguration);

				checkedPop(formatterNode, node.sourceEnd());

				return false;
			}

			public boolean visitGetArrayItemExpression(
					GetArrayItemExpression node) {

				FormatterBlockNode formatterNode = new FormatterBlockNode(
						document);

				formatterNode.addChild(createEmptyTextNode(document, node
						.sourceStart()));

				push(formatterNode);

				visit(node.getArray());

				List nodes = new ArrayList();
				nodes.add(node.getIndex());
				processBrackets(node.getLB(), node.getRB(), nodes,
						new GetItemArrayBracketsConfiguration(document));

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitGetMethod(GetMethod node) {
				FormatterGetMethodNode formatterNode = new FormatterGetMethodNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getGetKeyword()));

				push(formatterNode);

				visit(node.getName());

				processParens(node.getLP(), node.getRP(), (ASTNode) null,
						new FunctionNoArgumentsParensConfiguration(document));

				visit(node.getBody());

				checkedPop(formatterNode, node.sourceEnd());

				return false;
			}

			public boolean visitIdentifier(Identifier node) {
				FormatterStringNode strNode = new FormatterStringNode(document,
						node);
				addChild(strNode);
				return true;
			}

			private void processParens(int leftParen, int rightParen,
					ASTNode expression, IParensConfiguration configuration) {
				ParensNode parens = new ParensNode(document, configuration);
				parens.setBegin(createCharNode(document, leftParen));
				push(parens);
				if (expression != null) {
					skipSpaces(parens, expression.sourceStart());
					visit(expression);
				}
				checkedPop(parens, rightParen);
				parens.setEnd(createCharNode(document, rightParen));
			}

			private void processParens(int leftParen, int rightParen,
					List expressions, IParensConfiguration configuration) {
				ParensNode parens = new ParensNode(document, configuration);
				parens.setBegin(createCharNode(document, leftParen));
				push(parens);
				if (!expressions.isEmpty()) {
					final ASTNode expression0 = (ASTNode) expressions.get(0);
					skipSpaces(parens, expression0.sourceStart());
				}
				visitNodeList(expressions);
				checkedPop(parens, rightParen);
				parens.setEnd(createCharNode(document, rightParen));
			}

			private void skipSpaces(ParensNode parens, int end) {
				final int prev = parens.getEndOffset();
				int pos = prev;
				while (pos < end
						&& FormatterUtils.isSpace(document.charAt(pos))) {
					++pos;
				}
				if (pos > prev) {
					parens.addChild(createEmptyTextNode(document, pos));
				}
			}

			private void processBraces(ASTNode node,
					IBracesConfiguration configuration) {
				if (node instanceof StatementBlock) {
					BracesNode braces = new BracesNode(document, configuration);
					StatementBlock block = (StatementBlock) node;
					braces.setBegin(createCharNode(document, block.getLC()));
					push(braces);
					visitNodeList(block.getStatements());
					checkedPop(braces, block.getRC());
					braces.setEnd(createCharNode(document, block.getRC()));
				} else {
					final FormatterBlockNode block = new FormatterIndentedBlockNode(
							document, configuration.isIndenting());
					block.addChild(createEmptyTextNode(document, node
							.sourceStart()));
					push(block);
					visit(node);
					checkedPop(block, node.sourceEnd());
				}
			}

			private void processBraces(int leftBrace, int rightBrace,
					List nodes, IBracesConfiguration configuration) {
				BracesNode braces = new BracesNode(document, configuration);

				braces.setBegin(createCharNode(document, leftBrace));
				push(braces);
				for (Iterator i = nodes.iterator(); i.hasNext();) {
					visit((ASTNode) i.next());
				}
				checkedPop(braces, rightBrace);
				braces.setEnd(createCharNode(document, rightBrace));
			}

			private void processBrackets(int leftBracket, int rightBracket,
					List nodes, IBracketsConfiguration configuration) {
				BracketsNode brackets = new BracketsNode(document,
						configuration);

				brackets.setBegin(createCharNode(document, leftBracket));
				push(brackets);
				for (Iterator i = nodes.iterator(); i.hasNext();) {
					visit((ASTNode) i.next());
				}
				checkedPop(brackets, rightBracket);
				brackets.setEnd(createCharNode(document, rightBracket));
			}

			public boolean visitIfStatement(IfStatement node) {
				FormatterBlockNode formatterNode = new FormatterBlockNode(
						document);

				formatterNode.addChild(createTextNode(document, node
						.getIfKeyword()));
				push(formatterNode);

				processParens(node.getLP(), node.getRP(), node.getCondition(),
						new IfConditionParensConfiguration(document));

				IBracesConfiguration thenConfiguration;

				if (node.getElseStatement() != null)
					thenConfiguration = new ThenBlockBracesConfiguration(
							document);
				else
					thenConfiguration = new BlockBracesConfiguration(document);

				processBraces(node.getThenStatement(), thenConfiguration);

				checkedPop(formatterNode, node.getThenStatement().sourceEnd());

				if (node.getElseStatement() != null) {
					IBracesConfiguration elseConfiguration;
					FormatterElseNode elseNode = null;

					if (node.getElseStatement() instanceof IfStatement) {
						elseConfiguration = new ElseIfBlockBracesConfiguration(
								document);
						elseNode = new FormatterElseIfNode(document);
					} else {
						elseConfiguration = new ElseBlockBracesConfiguration(
								document);
						elseNode = new FormatterElseNode(document);
					}

					elseNode.addChild(new FormatterElseKeywordNode(document,
							node.getElseKeyword().sourceStart(), node
									.getElseKeyword().sourceEnd()));

					push(elseNode);

					processBraces(node.getElseStatement(), elseConfiguration);

					checkedPop(elseNode, node.getElseStatement().sourceEnd());
				}
				return true;
			}

			public boolean visitKeyword(Keyword node) {
				FormatterStringNode strNode = new FormatterStringNode(document,
						node);
				addChild(strNode);
				return false;
			}

			public boolean visitLabel(Label node) {
				FormatterStringNode strNode = new FormatterStringNode(document,
						node);
				addChild(strNode);
				return true;
			}

			public boolean visitLabelledStatement(LabelledStatement node) {

				FormatterLabelledStatementNode formatterNode = new FormatterLabelledStatementNode(
						document);

				formatterNode.setBegin(createEmptyTextNode(document, node
						.getLabel().sourceStart()));

				push(formatterNode);

				processTrailingColon(node.getColonPosition(), node.getLabel(),
						null);

				processBraces(node.getStatement(), new CaseBracesConfiguration(
						document));

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitNewExpression(NewExpression node) {

				FormatterNewExpressionNode formatterNode = new FormatterNewExpressionNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getNewKeyword()));

				push(formatterNode);

				visit(node.getObjectClass());

				checkedPop(formatterNode, node.sourceEnd());

				return false;
			}

			public boolean visitNullExpression(NullExpression node) {
				FormatterStringNode strNode = new FormatterStringNode(document,
						node);
				addChild(strNode);
				return false;
			}

			public boolean visitObjectInitializer(ObjectInitializer node) {

				FormatterObjectInitializerNode formatterNode = new FormatterObjectInitializerNode(
						document, new ObjectInitializerBracesConfiguration(
								document));

				formatterNode.setBegin(createTextNode(document, node.getLC(),
						node.getLC() + 1));

				push(formatterNode);

				visitNodeList(node.getInitializers());

				checkedPop(formatterNode, node.sourceEnd() - 1);

				formatterNode.setEnd(createTextNode(document, node.getRC(),
						node.getRC() + 1));

				return true;
			}

			public boolean visitParenthesizedExpression(
					ParenthesizedExpression node) {

				processParens(node.getLP(), node.getRP(), node.getExpression(),
						new ExpressionParensConfiguration(document));

				return true;
			}

			public boolean visitPropertyExpression(PropertyExpression node) {

				FormatterBlockNode formatterNode = new FormatterBlockNode(
						document);

				formatterNode.addChild(createEmptyTextNode(document, node
						.sourceStart()));

				push(formatterNode);

				visit(node.getObject());
				visit(node.getProperty());

				checkedPop(formatterNode, node.sourceEnd());

				return false;
			}

			public boolean visitPropertyInitializer(PropertyInitializer node) {

				FormatterBlockNode formatterNode = new FormatterBlockNode(
						document);

				formatterNode.addChild(createEmptyTextNode(document, node
						.sourceStart()));

				push(formatterNode);

				visit(node.getName());
				visit(node.getValue());

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitRegExpLiteral(RegExpLiteral node) {
				FormatterStringNode strNode = new FormatterStringNode(document,
						node);
				addChild(strNode);
				return false;
			}

			public boolean visitReturnStatement(ReturnStatement node) {
				FormatterReturnStatementNode formatterNode = new FormatterReturnStatementNode(
						document);

				formatterNode.addChild(createTextNode(document, node
						.getReturnKeyword()));

				push(formatterNode);

				if (node.getValue() != null)
					visit(node.getValue());

				if (node.getSemicolonPosition() > -1) {

					addChild(createSemicolonNode(document, node
							.getSemicolonPosition()));
				}

				checkedPop(formatterNode, node.sourceEnd());

				return false;
			}

			public boolean visitScript(Script node) {
				FormatterScriptNode scriptNode = new FormatterScriptNode(
						document);

				push(scriptNode);

				visitNodeList(node.getStatements());

				checkedPop(scriptNode, node.sourceEnd());

				return true;
			}

			public boolean visitSetMethod(SetMethod node) {

				FormatterSetMethodNode formatterNode = new FormatterSetMethodNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getSetKeyword()));

				push(formatterNode);

				visit(node.getName());

				processParens(node.getLP(), node.getRP(), node.getArgument(),
						new FunctionArgumentsParensConfiguration(document));

				visit(node.getBody());

				checkedPop(formatterNode, node.sourceEnd());

				return false;
			}

			public boolean visitStatementBlock(StatementBlock node) {

				processBraces(node, new StatementBlockBracesConfiguration(
						document));

				return true;
			}

			public boolean visitStatementList(StatementList node) {

				visitNodeList(node.getStatementList());

				return true;
			}

			public boolean visitStringLiteral(StringLiteral node) {
				FormatterStringNode strNode = new FormatterStringNode(document,
						node);
				addChild(strNode);
				return false;
			}

			public boolean visitSwitchStatement(SwitchStatement node) {

				FormatterSwitchNode formatterNode = new FormatterSwitchNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getSwitchKeyword()));

				push(formatterNode);

				processParens(node.getLP(), node.getRP(), node.getCondition(),
						new SwitchConditionParensConfiguration(document));

				List nodes = new ArrayList();
				nodes.addAll(node.getCaseClauses());
				if (node.getDefaultClause() != null) {
					nodes.add(node.getDefaultClause());
				}

				processBraces(node.getLC(), node.getRC(), nodes,
						new SwitchBracesConfiguration(document));

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitThisExpression(ThisExpression node) {
				FormatterStringNode strNode = new FormatterStringNode(document,
						node);
				addChild(strNode);
				return false;
			}

			public boolean visitThrowStatement(ThrowStatement node) {

				FormatterThrowNode formatterNode = new FormatterThrowNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getThrowKeyword()));

				push(formatterNode);

				if (node.getException() != null)
					visit(node.getException());

				if (node.getSemicolonPosition() > -1) {
					checkedPop(formatterNode, node.getSemicolonPosition() /*- 1*/);

					addChild(createSemicolonNode(document, node
							.getSemicolonPosition()));
				} else {
					checkedPop(formatterNode, node.sourceEnd());
				}
				return true;
			}

			public boolean visitTryStatement(TryStatement node) {

				FormatterBlockNode formatterNode = new FormatterBlockNode(
						document);

				formatterNode.addChild(createTextNode(document, node
						.getTryKeyword()));

				push(formatterNode);

				processBraces(node.getBody(),
						new TryBodyConfiguration(document));

				List nodes = new ArrayList();
				nodes.addAll(node.getCatches());
				if (node.getFinally() != null) {
					nodes.add(node.getFinally());
				}
				visitNodeList(nodes);

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitTypeOfExpression(TypeOfExpression node) {
				FormatterTypeofNode formatterNode = new FormatterTypeofNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getTypeOfKeyword()));

				push(formatterNode);

				visit(node.getExpression());

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitUnaryOperation(UnaryOperation node) {
				FormatterUnaryOperationNode formatterNode = new FormatterUnaryOperationNode(
						document);

				formatterNode.addChild(createEmptyTextNode(document, node
						.sourceStart()));

				push(formatterNode);

				if (!node.isPostfix()) {
					addChild(createTextNode(document, node
							.getOperationPosition(), node
							.getOperationPosition()
							+ node.getOperationText().length()));
				}

				visit(node.getExpression());

				if (node.isPostfix()) {
					addChild(createTextNode(document, node
							.getOperationPosition(), node
							.getOperationPosition()
							+ node.getOperationText().length()));
				}

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitVariableDeclaration(VariableDeclaration node) {
				FormatterVariableDeclarationNode formatterNode = new FormatterVariableDeclarationNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getVarKeyword()));

				push(formatterNode);

				visitNodeList(node.getVariables());

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			public boolean visitVoidExpression(VoidExpression node) {
				FormatterVoidExpressionNode formatterNode = new FormatterVoidExpressionNode(
						document);

				formatterNode.addChild(createEmptyTextNode(document, node
						.sourceStart()));

				push(formatterNode);

				visit(node.getExpression());

				if (node.getSemicolonPosition() > -1) {

					checkedPop(formatterNode, node.getSemicolonPosition() /*- 1 */);

					addChild(createSemicolonNode(document, node
							.getSemicolonPosition()));
				} else {
					checkedPop(formatterNode, node.sourceEnd());
				}

				return false;
			}

			public boolean visitWhileStatement(WhileStatement node) {

				FormatterBlockNode formatterNode = new FormatterBlockNode(
						document);

				formatterNode.addChild(createTextNode(document, node
						.getWhileKeyword()));

				push(formatterNode);

				processParens(node.getLP(), node.getRP(), node.getCondition(),
						new WhileConditionParensConfiguration(document));

				if (node.getBody() != null) {
					processBraces(node.getBody(),
							new WhileBlockBracesConfiguration(document));
				}

				if (node.getTrailingSemicolonPosition() > -1) {

					checkedPop(formatterNode, node
							.getTrailingSemicolonPosition() /*- 1*/);

					addChild(createSemicolonNode(document, node
							.getTrailingSemicolonPosition()));

				} else {

					checkedPop(formatterNode, node.sourceEnd());
				}

				return true;
			}

			public boolean visitWithStatement(WithStatement node) {
				FormatterBlockNode formatterNode = new FormatterBlockNode(
						document);

				formatterNode.addChild(createTextNode(document, node
						.getWithKeyword()));

				push(formatterNode);

				processParens(node.getLP(), node.getRP(), node.getExpression(),
						new WithConditionParensConfiguration(document));

				processBraces(node.getStatement(),
						new WithBlockBracesConfiguration(document));

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

			private void visitNodeList(List nodes) {
				for (int i = 0; i < nodes.size(); i++) {
					visit((ASTNode) nodes.get(i));
				}
			}

			// private void visitCommaList(List nodes, List commas) {
			//
			// for (int i = 0; i < nodes.size(); i++) {
			// if (i > 0) {
			// int offset = ((Integer) commas.get(i - 1)).intValue();
			//
			// addChild(createTextNode(document, offset, offset + 1));
			// }
			//
			// visit((ASTNode) nodes.get(i));
			// }
			// }

			public boolean visitVoidOperator(VoidOperator node) {
				FormatterVoidOperatorNode formatterNode = new FormatterVoidOperatorNode(
						document);

				formatterNode.setBegin(createTextNode(document, node
						.getVoidKeyword()));

				push(formatterNode);

				visit(node.getExpression());

				checkedPop(formatterNode, node.sourceEnd());

				return true;
			}

		});

		checkedPop(root, document.getLength());
		return root;

	}

	private IFormatterTextNode createTextNode(IFormatterDocument document,
			ASTNode node) {
		return createTextNode(document, node.sourceStart(), node.sourceEnd());
	}

	private IFormatterTextNode createCharNode(IFormatterDocument document,
			int startPos) {
		return createTextNode(document, startPos, startPos + 1);
	}

	private IFormatterTextNode createEmptyTextNode(IFormatterDocument document,
			int pos) {
		return createTextNode(document, pos, pos);
	}

	private IFormatterTextNode createSemicolonNode(IFormatterDocument document,
			int offset) {
		return new SemicolonNode(document, offset);
	}

}