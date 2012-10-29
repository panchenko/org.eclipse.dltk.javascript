/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladislav Kuzkokov)
 *******************************************************************************/
package org.eclipse.dltk.javascript.core.dom.rewrite;

import org.eclipse.dltk.internal.javascript.core.manipulation.JavascriptManipulationPlugin;
import org.eclipse.dltk.javascript.core.dom.ArrayAccessExpression;
import org.eclipse.dltk.javascript.core.dom.ArrayLiteral;
import org.eclipse.dltk.javascript.core.dom.AttributeIdentifier;
import org.eclipse.dltk.javascript.core.dom.BinaryExpression;
import org.eclipse.dltk.javascript.core.dom.BinaryOperator;
import org.eclipse.dltk.javascript.core.dom.BlockStatement;
import org.eclipse.dltk.javascript.core.dom.BooleanLiteral;
import org.eclipse.dltk.javascript.core.dom.BreakStatement;
import org.eclipse.dltk.javascript.core.dom.CallExpression;
import org.eclipse.dltk.javascript.core.dom.CaseClause;
import org.eclipse.dltk.javascript.core.dom.CatchClause;
import org.eclipse.dltk.javascript.core.dom.Comment;
import org.eclipse.dltk.javascript.core.dom.ConditionalExpression;
import org.eclipse.dltk.javascript.core.dom.ConstStatement;
import org.eclipse.dltk.javascript.core.dom.ContinueStatement;
import org.eclipse.dltk.javascript.core.dom.DefaultClause;
import org.eclipse.dltk.javascript.core.dom.DefaultXmlNamespaceStatement;
import org.eclipse.dltk.javascript.core.dom.DescendantAccessExpression;
import org.eclipse.dltk.javascript.core.dom.DoStatement;
import org.eclipse.dltk.javascript.core.dom.Elision;
import org.eclipse.dltk.javascript.core.dom.EmptyStatement;
import org.eclipse.dltk.javascript.core.dom.Expression;
import org.eclipse.dltk.javascript.core.dom.ExpressionSelector;
import org.eclipse.dltk.javascript.core.dom.ExpressionStatement;
import org.eclipse.dltk.javascript.core.dom.FilterExpression;
import org.eclipse.dltk.javascript.core.dom.FinallyClause;
import org.eclipse.dltk.javascript.core.dom.ForEachInStatement;
import org.eclipse.dltk.javascript.core.dom.ForInStatement;
import org.eclipse.dltk.javascript.core.dom.ForStatement;
import org.eclipse.dltk.javascript.core.dom.FunctionExpression;
import org.eclipse.dltk.javascript.core.dom.GetterAssignment;
import org.eclipse.dltk.javascript.core.dom.IArrayElement;
import org.eclipse.dltk.javascript.core.dom.Identifier;
import org.eclipse.dltk.javascript.core.dom.IfStatement;
import org.eclipse.dltk.javascript.core.dom.Label;
import org.eclipse.dltk.javascript.core.dom.LabeledStatement;
import org.eclipse.dltk.javascript.core.dom.NewExpression;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.NullLiteral;
import org.eclipse.dltk.javascript.core.dom.NumericLiteral;
import org.eclipse.dltk.javascript.core.dom.ObjectLiteral;
import org.eclipse.dltk.javascript.core.dom.Parameter;
import org.eclipse.dltk.javascript.core.dom.ParenthesizedExpression;
import org.eclipse.dltk.javascript.core.dom.PropertyAccessExpression;
import org.eclipse.dltk.javascript.core.dom.PropertyAssignment;
import org.eclipse.dltk.javascript.core.dom.QualifiedIdentifier;
import org.eclipse.dltk.javascript.core.dom.RegularExpressionLiteral;
import org.eclipse.dltk.javascript.core.dom.ReturnStatement;
import org.eclipse.dltk.javascript.core.dom.SetterAssignment;
import org.eclipse.dltk.javascript.core.dom.SimplePropertyAssignment;
import org.eclipse.dltk.javascript.core.dom.Source;
import org.eclipse.dltk.javascript.core.dom.Statement;
import org.eclipse.dltk.javascript.core.dom.StringLiteral;
import org.eclipse.dltk.javascript.core.dom.SwitchElement;
import org.eclipse.dltk.javascript.core.dom.SwitchStatement;
import org.eclipse.dltk.javascript.core.dom.ThisExpression;
import org.eclipse.dltk.javascript.core.dom.ThrowStatement;
import org.eclipse.dltk.javascript.core.dom.TryStatement;
import org.eclipse.dltk.javascript.core.dom.UnaryExpression;
import org.eclipse.dltk.javascript.core.dom.UnaryOperator;
import org.eclipse.dltk.javascript.core.dom.VariableDeclaration;
import org.eclipse.dltk.javascript.core.dom.VariableReference;
import org.eclipse.dltk.javascript.core.dom.VariableStatement;
import org.eclipse.dltk.javascript.core.dom.WhileStatement;
import org.eclipse.dltk.javascript.core.dom.WildcardIdentifier;
import org.eclipse.dltk.javascript.core.dom.WithStatement;
import org.eclipse.dltk.javascript.core.dom.XmlExpressionFragment;
import org.eclipse.dltk.javascript.core.dom.XmlFragment;
import org.eclipse.dltk.javascript.core.dom.XmlInitializer;
import org.eclipse.dltk.javascript.core.dom.XmlTextFragment;
import org.eclipse.dltk.javascript.core.dom.util.DomSwitch;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;

public class Generator extends DomSwitch<StringBuilder> {
	private final StringBuilder sb = new StringBuilder();
	private final ChangeDescription cd;
	private final String text;
	private final String lineDelimiter;
	private String nlStr;

	public Generator(ChangeDescription cd, String text, int pos,
			String lineDelimiter) {
		this.cd = cd;
		this.text = text;
		this.lineDelimiter = lineDelimiter;
		int st, end = pos;
		for (st = pos - 1; st >= 0; st--) {
			try {
				char c = text.charAt(st);
				if (c == '\n' || c == '\r')
					break;
				if (c != ' ' && c != '\t')
					end = st;
			} catch (RuntimeException e) {
				System.err.println("OK");
			}
		}
		nlStr = lineDelimiter + text.substring(st + 1, end);
	}

	public StringBuilder generate(Node node) {
		if (node.getBegin() != -1 && cd != null) {
			RewriteAnalyzer ra = new RewriteAnalyzer(cd, text, lineDelimiter);
			ra.rewrite(node);
			Document doc = new Document(text.substring(node.getBegin(),
					node.getEnd()));
			try {
				TextEdit edit = ra.getEdit();
				if (edit.hasChildren())
					edit.moveTree(-node.getBegin());
				edit.apply(doc);
				String res = doc.get();
				if (res.contains(lineDelimiter)) {
					int st, end = node.getBegin();
					for (st = node.getBegin() - 1; st >= 0; st--) {
						char c = text.charAt(st);
						if (c == '\n' || c == '\r')
							break;
						if (c != ' ' && c != '\t')
							end = st;
					}
					String nl = lineDelimiter + text.substring(st + 1, end);
					sb.append(res.replace(nl, nlStr));
				} else
					sb.append(res);
			} catch (BadLocationException e) {
				JavascriptManipulationPlugin.log(e);
			}
			return sb;
		}
		doSwitch(node);
		return sb;
	}

	public Generator append(String s) {
		sb.append(s);
		return this;
	}

	public String toString() {
		return sb.toString();
	}

	private void indent() {
		nlStr = nlStr + '\t';
	}

	private void unindent() {
		nlStr = nlStr.substring(0, nlStr.length() - 1);
	}

	public String getIndentation() {
		return nlStr;
	}

	public void newLine() {
		sb.append(nlStr);
	}

	@Override
	public StringBuilder caseIdentifier(Identifier object) {
		return sb.append(object.getName());
	}

	@Override
	public StringBuilder caseVariableReference(VariableReference object) {
		return sb.append(object.getVariable().getName());
	}

	@Override
	public StringBuilder caseLabel(Label object) {
		return sb.append(object.getName());
	}

	@Override
	public StringBuilder caseNullLiteral(NullLiteral object) {
		return sb.append("null");
	}

	@Override
	public StringBuilder caseBooleanLiteral(BooleanLiteral object) {
		return sb.append(object.getText());
	}

	@Override
	public StringBuilder caseNumericLiteral(NumericLiteral object) {
		return sb.append(object.getText());
	}

	@Override
	public StringBuilder caseStringLiteral(StringLiteral object) {
		return sb.append(object.getText());
	}

	@Override
	public StringBuilder caseRegularExpressionLiteral(
			RegularExpressionLiteral object) {
		return sb.append(object.getText());
	}

	@Override
	public StringBuilder caseThisExpression(ThisExpression object) {
		return sb.append("this");
	}

	@Override
	public StringBuilder caseArrayLiteral(ArrayLiteral object) {
		sb.append('[');
		boolean first = true;
		for (IArrayElement elem : object.getElements()) {
			if (!first)
				sb.append(',');
			generate(elem);
			first = false;
		}
		return sb.append(']');
	}

	@Override
	public StringBuilder caseElision(Elision object) {
		return sb;
	}

	@Override
	public StringBuilder caseObjectLiteral(ObjectLiteral object) {
		sb.append('{').append(nlStr);
		boolean first = true;
		indent();
		for (PropertyAssignment pa : object.getProperties()) {
			if (!first)
				sb.append(',').append(nlStr);
			generate(pa);
			first = false;
		}
		unindent();
		return sb.append(nlStr).append('}');
	}

	@Override
	public StringBuilder caseSimplePropertyAssignment(
			SimplePropertyAssignment object) {
		generate(object.getName());
		sb.append(':');
		return generate(object.getInitializer());
	}

	private void generateStatements(EList<Statement> list) {
		indent();
		for (int i = 0; i < list.size(); i++) {
			generate(list.get(i));
			if (i == list.size() - 1)
				unindent();
			newLine();
		}
	}

	@Override
	public StringBuilder caseGetterAssignment(GetterAssignment object) {
		sb.append("get ");
		generate(object.getName());
		generate(object.getBody());
		return sb;
	}

	@Override
	public StringBuilder caseSetterAssignment(SetterAssignment object) {
		sb.append("set ");
		generate(object.getName());
		sb.append('(').append(object.getParameter().getName()).append(") ");
		generate(object.getBody());
		return sb;
	}

	@Override
	public StringBuilder caseParenthesizedExpression(
			ParenthesizedExpression object) {
		sb.append('(');
		generate(object.getEnclosed());
		return sb.append(')');
	}

	@Override
	public StringBuilder caseArrayAccessExpression(ArrayAccessExpression object) {
		generate(object.getArray());
		sb.append('[');
		generate(object.getIndex());
		return sb.append(']');
	}

	@Override
	public StringBuilder casePropertyAccessExpression(
			PropertyAccessExpression object) {
		generate(object.getObject());
		sb.append('.');
		return generate(object.getProperty());
	}

	private void generateExpressions(EList<Expression> list) {
		boolean first = true;
		for (Expression expr : list) {
			if (!first)
				sb.append(',');
			generate(expr);
			first = false;
		}
	}

	@Override
	public StringBuilder caseNewExpression(NewExpression object) {
		sb.append("new ");
		generate(object.getConstructor());
		sb.append('(');
		generateExpressions(object.getArguments());
		return sb.append(')');
	}

	@Override
	public StringBuilder caseCallExpression(CallExpression object) {
		generate(object.getApplicant());
		sb.append('(');
		generateExpressions(object.getArguments());
		return sb.append(')');
	}

	@Override
	public StringBuilder caseUnaryExpression(UnaryExpression object) {
		UnaryOperator op = object.getOperation();
		boolean postfix = op == UnaryOperator.POSTFIX_INC
				|| op == UnaryOperator.POSTFIX_DEC;
		boolean text = op == UnaryOperator.DELETE || op == UnaryOperator.VOID
				|| op == UnaryOperator.TYPEOF;
		if (!postfix)
			sb.append(object.getOperation().toString());
		if (text)
			sb.append(' ');
		generate(object.getArgument());
		if (postfix)
			sb.append(object.getOperation().toString());
		return sb;
	}

	@Override
	public StringBuilder caseBinaryExpression(BinaryExpression object) {
		generate(object.getLeft());
		boolean text = object.getOperation() == BinaryOperator.IN
				|| object.getOperation() == BinaryOperator.INSTANCEOF;
		if (text)
			sb.append(' ');
		sb.append(object.getOperation().toString());
		if (text)
			sb.append(' ');
		generate(object.getRight());
		return sb;
	}

	@Override
	public StringBuilder caseConditionalExpression(ConditionalExpression object) {
		generate(object.getPredicate());
		sb.append('?');
		generate(object.getConsequent());
		sb.append(':');
		return generate(object.getAlternative());
	}

	@Override
	public StringBuilder caseBlockStatement(BlockStatement object) {
		indent();
		sb.append('{').append(nlStr);
		unindent();
		generateStatements(object.getStatements());
		sb.append('}');
		return sb;
	}

	@Override
	public StringBuilder caseVariableStatement(VariableStatement object) {
		sb.append("var ");
		boolean first = true;
		for (VariableDeclaration decl : object.getDeclarations()) {
			if (!first)
				sb.append(',');
			generate(decl);
			first = false;
		}
		sb.append(';'); // TODO (alex) conditionally add semicolons for other
						// statements;
		return sb;
	}

	@Override
	public StringBuilder caseConstStatement(ConstStatement object) {
		sb.append("const ");
		boolean first = true;
		for (VariableDeclaration decl : object.getDeclarations()) {
			if (!first)
				sb.append(',');
			generate(decl);
			first = false;
		}
		return sb;
	}

	@Override
	public StringBuilder caseVariableDeclaration(VariableDeclaration object) {
		sb.append(object.getIdentifier().getName());
		if (object.getInitializer() != null) {
			sb.append('=');
			generate(object.getInitializer());
		}
		return sb;
	}

	@Override
	public StringBuilder caseEmptyStatement(EmptyStatement object) {
		return sb.append(';');
	}

	@Override
	public StringBuilder caseExpressionStatement(ExpressionStatement object) {
		return generate(object.getExpression());
	}

	@Override
	public StringBuilder caseIfStatement(IfStatement object) {
		sb.append("if (");
		generate(object.getPredicate());
		sb.append(") ");
		generate(object.getConsequent());
		if (object.getAlternative() != null) {
			sb.append(" else ");
			generate(object.getAlternative());
		}
		return sb;
	}

	@Override
	public StringBuilder caseDoStatement(DoStatement object) {
		sb.append("do ");
		generate(object.getBody());
		sb.append("while (");
		generate(object.getCondition());
		return sb.append(')');
	}

	@Override
	public StringBuilder caseWhileStatement(WhileStatement object) {
		sb.append("while (");
		generate(object.getCondition());
		sb.append(") ");
		return generate(object.getBody());
	}

	@Override
	public StringBuilder caseForStatement(ForStatement object) {
		sb.append("for (");
		if (object.getInitialization() != null)
			generate(object.getInitialization());
		sb.append(';');
		if (object.getCondition() != null)
			generate(object.getCondition());
		sb.append(';');
		if (object.getIncrement() != null)
			generate(object.getIncrement());
		sb.append(") ");
		return generate(object.getBody());
	}

	@Override
	public StringBuilder caseForInStatement(ForInStatement object) {
		sb.append("for (");
		generate(object.getItem());
		sb.append(" in ");
		generate(object.getCollection());
		sb.append(") ");
		return generate(object.getBody());
	}

	@Override
	public StringBuilder caseForEachInStatement(ForEachInStatement object) {
		sb.append("for each(");
		generate(object.getItem());
		sb.append(" in ");
		generate(object.getCollection());
		sb.append(") ");
		return generate(object.getBody());
	}

	@Override
	public StringBuilder caseContinueStatement(ContinueStatement object) {
		sb.append("continue");
		if (object.getLabel() != null)
			sb.append(' ').append(object.getLabel().getName());
		return sb;
	}

	@Override
	public StringBuilder caseBreakStatement(BreakStatement object) {
		sb.append("break");
		if (object.getLabel() != null)
			sb.append(' ').append(object.getLabel().getName());
		return sb;
	}

	@Override
	public StringBuilder caseReturnStatement(ReturnStatement object) {
		sb.append("return");
		if (object.getExpression() != null) {
			sb.append(' ');
			generate(object.getExpression());
		}
		return sb;
	}

	@Override
	public StringBuilder caseWithStatement(WithStatement object) {
		sb.append("with (");
		generate(object.getExpression());
		sb.append(") ");
		return generate(object.getStatement());
	}

	@Override
	public StringBuilder caseSwitchStatement(SwitchStatement object) {
		sb.append("switch (");
		generate(object.getSelector());
		sb.append(") {");
		for (SwitchElement se : object.getElements())
			generate(se);
		return sb.append('}');
	}

	@Override
	public StringBuilder caseCaseClause(CaseClause object) {
		sb.append("case ");
		generate(object.getExpression());
		sb.append(':').append(nlStr);
		generateStatements(object.getStatements());
		return sb;
	}

	@Override
	public StringBuilder caseDefaultClause(DefaultClause object) {
		sb.append("default:").append(nlStr);
		generateStatements(object.getStatements());
		return sb;
	}

	@Override
	public StringBuilder caseLabeledStatement(LabeledStatement object) {
		sb.append(object.getLabel().getName()).append(": ");
		return generate(object.getStatement());
	}

	@Override
	public StringBuilder caseThrowStatement(ThrowStatement object) {
		sb.append("throw ");
		return generate(object.getException());
	}

	@Override
	public StringBuilder caseTryStatement(TryStatement object) {
		sb.append("try ");
		generate(object.getBody());
		for (CatchClause cc : object.getCatches()) {
			sb.append(' ');
			generate(cc);
		}
		if (object.getFinallyClause() != null) {
			sb.append(' ');
			generate(object.getFinallyClause());
		}
		return sb;
	}

	@Override
	public StringBuilder caseCatchClause(CatchClause object) {
		sb.append("catch (");
		generate(object.getException());
		if (object.getFilter() != null) {
			sb.append(" if ");
			generate(object.getFilter());
		}
		sb.append(") ");
		return generate(object.getBody());
	}

	@Override
	public StringBuilder caseFinallyClause(FinallyClause object) {
		sb.append("finally ");
		return generate(object.getBody());
	}

	@Override
	public StringBuilder caseFunctionExpression(FunctionExpression object) {
		if (object.getDocumentation() != null)
			sb.append(object.getDocumentation().getText());
		sb.append("function ");
		if (object.getIdentifier() != null)
			sb.append(object.getIdentifier().getName());
		sb.append('(');
		boolean first = true;
		for (Parameter prm : object.getParameters()) {
			if (!first)
				sb.append(',');
			generate(prm);
			first = false;
		}
		sb.append(')');
		sb.append(' ');
		generate(object.getBody());
		return sb;
	}

	@Override
	public StringBuilder caseSource(Source object) {
		generateStatements(object.getStatements());
		return sb;
	}

	@Override
	public StringBuilder caseXmlInitializer(XmlInitializer object) {
		for (XmlFragment fragment : object.getFragments())
			generate(fragment);
		return sb;
	}

	@Override
	public StringBuilder caseAttributeIdentifier(AttributeIdentifier object) {
		sb.append('@');
		return generate(object.getSelector());
	}

	@Override
	public StringBuilder caseQualifiedIdentifier(QualifiedIdentifier object) {
		generate(object.getNamespace());
		sb.append("::");
		return generate(object.getMember());
	}

	@Override
	public StringBuilder caseWildcardIdentifier(WildcardIdentifier object) {
		return sb.append('*');
	}

	@Override
	public StringBuilder caseExpressionSelector(ExpressionSelector object) {
		sb.append('[');
		generate(object.getIndex());
		return sb.append(']');
	}

	@Override
	public StringBuilder caseXmlTextFragment(XmlTextFragment object) {
		return sb.append(object.getText());
	}

	@Override
	public StringBuilder caseXmlExpressionFragment(XmlExpressionFragment object) {
		sb.append('{');
		generate(object.getExpression());
		return sb.append('}');
	}

	@Override
	public StringBuilder caseDescendantAccessExpression(
			DescendantAccessExpression object) {
		generate(object.getObject());
		sb.append("..");
		return generate(object.getProperty());
	}

	@Override
	public StringBuilder caseFilterExpression(FilterExpression object) {
		generate(object.getObject());
		sb.append(".(");
		generate(object.getFilter());
		return sb.append(')');
	}

	@Override
	public StringBuilder caseDefaultXmlNamespaceStatement(
			DefaultXmlNamespaceStatement object) {
		sb.append("default xml namespace = ");
		return generate(object.getExpression());
	}

	@Override
	public StringBuilder caseParameter(Parameter object) {
		sb.append(object.getName().getName());
		return sb;
	}

	@Override
	public StringBuilder caseComment(Comment object) {
		return sb.append(object.getText());
	}
}
