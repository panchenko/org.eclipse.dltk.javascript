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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.dltk.javascript.core.dom.BinaryExpression;
import org.eclipse.dltk.javascript.core.dom.BinaryOperator;
import org.eclipse.dltk.javascript.core.dom.CatchClause;
import org.eclipse.dltk.javascript.core.dom.DomPackage;
import org.eclipse.dltk.javascript.core.dom.FunctionExpression;
import org.eclipse.dltk.javascript.core.dom.Identifier;
import org.eclipse.dltk.javascript.core.dom.Label;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.Statement;
import org.eclipse.dltk.javascript.core.dom.TryStatement;
import org.eclipse.dltk.javascript.core.dom.Type;
import org.eclipse.dltk.javascript.core.dom.UnaryExpression;
import org.eclipse.dltk.javascript.core.dom.UnaryOperator;
import org.eclipse.dltk.javascript.core.dom.util.DomSwitch;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.ChangeKind;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.ecore.change.ListChange;
import org.eclipse.text.edits.DeleteEdit;
import org.eclipse.text.edits.InsertEdit;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;

public class RewriteAnalyzer extends DomSwitch<Boolean> {
	private final ChangeDescription cd;
	private final Set<Node> generated = new HashSet<Node>();
	private final String text;
	private final TextEdit edit;
	public RewriteAnalyzer(ChangeDescription cd, String text) {
		this.cd = cd;
		this.text = text;
		edit = new MultiTextEdit();
	}
	public void rewrite(Node node) {
		doSwitch(node);
	}
	public TextEdit getEdit() {
		return edit;
	}

	// Processes EReference only
	private void processFeature(Node node, FeatureChange fc) {
		if (!fc.getFeature().isMany()) {
			Node o = (Node)node.eGet(fc.getFeature());
			Node n = (Node)fc.getReferenceValue();
			int off = o == null ? calcOffset(node,fc.getFeature()) : o.getBegin();
			int len = o == null ? 0 : o.getEnd()-o.getBegin();
			String value = n == null ? "" : generate(n, node, o == null, off);
			edit.addChild(new ReplaceEdit(off,len,value));
			return;
		}
		EList<? extends Node> original = (EList<? extends Node>)node.eGet(fc.getFeature());
		EList<Object> dst = new BasicEList<Object>();
		dst.addAll(original);
		Set<Node> deleted = new HashSet<Node>();
		Set<Node> generated = new HashSet<Node>();
		for(ListChange lc : fc.getListChanges()) {
			if (lc.getKind() != ChangeKind.ADD_LITERAL)
				deleted.add((Node)dst.get(lc.getIndex()));
			if (lc.getKind() == ChangeKind.MOVE_LITERAL)
				generated.add((Node)dst.get(lc.getIndex()));
			lc.apply(dst);
			if (lc.getKind() == ChangeKind.ADD_LITERAL)
				generated.add((Node)dst.get(lc.getIndex()));
		}
		int i=0;
		boolean first=true;
		for(Node item : original) {
			if (deleted.contains(item)) {
				int off = first ? item.getBegin() : original.get(i-1).getEnd();
				int end = first && i < original.size()-1 ? original.get(i+1).getBegin() : item.getEnd();
				edit.addChild(new DeleteEdit(off,end - off));
			} else
				first=false;
			i++;
		}
		Node last=null;
		for(Object obj : dst) {
			Node item = (Node)obj;
			if (generated.contains(item)) {
				int off;
				if (last == null)
					if (first)
						off = calcOffset(node, fc.getFeature());
					else
						off = ((Node)original.get(0)).getBegin();
				else
					off = last.getEnd();
				edit.addChild(new InsertEdit(off, generateElement(item,last == null,first,off)));
				first = false;
			} else
				last = item;
		}
	}

	@Override
	public Boolean caseNode(Node node) {
		if (cd.getObjectChanges().get(node) != null)
			for(FeatureChange fc : cd.getObjectChanges().get(node))
				processFeature(node, fc);
		for(EObject obj : node.eContents())
			if (!generated.contains(obj))
				rewrite((Node)obj);
		return true;
	}

	@Override
	public Boolean caseUnaryExpression(UnaryExpression node) {
		if (cd.getObjectChanges().get(node) != null)
			for(FeatureChange fc : cd.getObjectChanges().get(node))
				if (fc.getFeature() == DomPackage.eINSTANCE.getUnaryExpression_Operation()) {
					int len = node.getOperation().toString().length();
					if (isPostfix(node.getOperation()))
						edit.addChild(new DeleteEdit(node.getEnd()-len,len));
					else
						edit.addChild(new DeleteEdit(node.getBegin(),len));
					if (isPostfix(fc.getValue()))
						edit.addChild(new InsertEdit(node.getEnd(),fc.getValue().toString()));
					else {
						String r = fc.getValue().toString();
						if (isTextUnary(fc.getValue()))
							r += ' ';
						edit.addChild(new InsertEdit(node.getBegin(),r));
					}
				} else
					processFeature(node,fc);
		return null;
	}
	private static boolean isPostfix(Object op) {
		return op == UnaryOperator.POSTFIX_INC || op == UnaryOperator.POSTFIX_DEC;
	}
	private static boolean isTextUnary(Object op) {
		return op == UnaryOperator.DELETE || op == UnaryOperator.VOID || op == UnaryOperator.TYPEOF || op == UnaryOperator.YIELD;
	}

	@Override
	public Boolean caseIdentifier(Identifier node) {
		if (cd.getObjectChanges().get(node) != null)
			for(FeatureChange fc : cd.getObjectChanges().get(node))
				if (fc.getFeature() == DomPackage.eINSTANCE.getIdentifier_Name())
					edit.addChild(new ReplaceEdit(node.getBegin(), node.getEnd()-node.getBegin(), (String)fc.getValue()));
		return true;
	}

	@Override
	public Boolean caseLabel(Label node) {
		if (cd.getObjectChanges().get(node) != null)
			for(FeatureChange fc : cd.getObjectChanges().get(node))
				if (fc.getFeature() == DomPackage.eINSTANCE.getLabel_Name())
					edit.addChild(new ReplaceEdit(node.getBegin(), node.getEnd()-node.getBegin(), (String)fc.getValue()));
		return true;
	}

	@Override
	public Boolean caseType(Type node) {
		if (cd.getObjectChanges().get(node) != null)
			for(FeatureChange fc : cd.getObjectChanges().get(node))
				if (fc.getFeature() == DomPackage.eINSTANCE.getType_Name())
					edit.addChild(new ReplaceEdit(node.getBegin(), node.getEnd()-node.getBegin(), (String)fc.getValue()));
		return true;
	}

	@Override
	public Boolean caseBinaryExpression(BinaryExpression node) {
		if (cd.getObjectChanges().get(node) != null)
			for(FeatureChange fc : cd.getObjectChanges().get(node))
				if (fc.getFeature() == DomPackage.eINSTANCE.getBinaryExpression_Operation()) {
					BinaryExpression be = (BinaryExpression)node;
					//String s = text.substring(be.getLeft().getEnd(),be.getRight().getBegin());
					int pos = be.getOperatorPosition();
					//int pos = be.getLeft().getEnd()+JsParser.getParser().parse(s, JsParser.SEPARATOR).getEnd();
					int len = be.getOperation().toString().length();
					String r = fc.getValue().toString();
					if (isTextBinary(fc.getValue()))
						r = ' '+r+' ';
					edit.addChild(new ReplaceEdit(pos, len, r));
				} else
					processFeature(node, fc);
		return null;
	}
	private static boolean isTextBinary(Object op) {
		return op == BinaryOperator.IN || op == BinaryOperator.INSTANCEOF;
	}

	// calculates offset for null references and empty lists
	private int calcOffset(Node node, EStructuralFeature sf) {
		EReference ref = (EReference)sf;
		switch (ref.getEContainingClass().getClassifierID()) {
		case DomPackage.SOURCE:
			return node.getBegin();
		case DomPackage.BLOCK_STATEMENT:
			return node.getEnd()-1; // skip right brace
		case DomPackage.VARIABLE_STATEMENT:
			return node.getBegin()+3; // skip "var"
		case DomPackage.CONST_STATEMENT:
			return node.getBegin()+5; // skip "const"
		case DomPackage.VARIABLE_DECLARATION:
		case DomPackage.IF_STATEMENT:
		case DomPackage.CONTINUE_STATEMENT:
		case DomPackage.BREAK_STATEMENT:
		case DomPackage.RETURN_STATEMENT:
		case DomPackage.SWITCH_ELEMENT:
		case DomPackage.PARAMETER:
			return node.getEnd();
		case DomPackage.CALL_EXPRESSION:
			return node.getEnd()-1;
		case DomPackage.SWITCH_STATEMENT:
			throw new IllegalStateException("Empty switch statement");
		case DomPackage.CATCH_CLAUSE:
			CatchClause cc = (CatchClause)node;
			return cc.getException().getEnd();
		case DomPackage.TRY_STATEMENT:
			TryStatement ts = (TryStatement)node;
			if (ts.getFinallyClause() != null)
				return ts.getFinallyClause().getBegin();
			return node.getEnd();
		case DomPackage.FUNCTION_EXPRESSION:
			FunctionExpression expr = (FunctionExpression)node;
			if (ref == DomPackage.eINSTANCE.getFunctionExpression_Identifier())
				return expr.getParametersPosition()-2;
			else
				return expr.getParametersPosition();
		}
		return -1;
	}
	public String generateElement(Node node,boolean first,boolean empty,int pos) {
		Generator gen = new Generator(cd, text, pos);
		if (node instanceof Statement) {
			gen.newLine();
			gen.generate(node);
			return gen.toString();
		}
		if (!first)
			gen.append(",");
		gen.generate(node);
		if (first && !empty)
			gen.append(",");
		generated.add(node);
		return gen.toString();
	}
	public String generate(Node node, Node parent, boolean wasNull,int pos) {
		Generator gen = new Generator(cd, text, pos);
		if (wasNull && parent.eClass() == DomPackage.eINSTANCE.getVariableDeclaration())
			gen.append("=");
		if (wasNull && parent.eClass() == DomPackage.eINSTANCE.getFunctionExpression())
			gen.append(" ");
		if (wasNull && node.eClass() == DomPackage.eINSTANCE.getType())
			gen.append(":");
		if (wasNull && node.eContainmentFeature() == DomPackage.eINSTANCE.getCatchClause_Filter())
			gen.append(" if ");
		gen.generate(node);
		generated.add(node);
		return gen.toString();
	}
}