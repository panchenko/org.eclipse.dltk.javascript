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

import org.eclipse.dltk.javascript.core.dom.BinaryExpression;
import org.eclipse.dltk.javascript.core.dom.BinaryOperator;
import org.eclipse.dltk.javascript.core.dom.CatchClause;
import org.eclipse.dltk.javascript.core.dom.DomPackage;
import org.eclipse.dltk.javascript.core.dom.Identifier;
import org.eclipse.dltk.javascript.core.dom.Label;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.Statement;
import org.eclipse.dltk.javascript.core.dom.TryStatement;
import org.eclipse.dltk.javascript.core.dom.Type;
import org.eclipse.dltk.javascript.core.dom.UnaryExpression;
import org.eclipse.dltk.javascript.core.dom.UnaryOperator;
import org.eclipse.dltk.javascript.core.dom.util.DomSwitch;
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
		EList<Object> list = (EList<Object>)node.eGet(fc.getFeature());
		boolean[] deleted = new boolean[list.size()];
		for(ListChange lc : fc.getListChanges())
			if (lc.getKind() != ChangeKind.ADD_LITERAL)// {
				deleted[lc.getIndex()] = true;
		int first;
		for(first=0; first<list.size() && deleted[first]; first++);
		boolean empty = first == list.size(); 
		for(ListChange lc : fc.getListChanges()) {
			if (lc.getKind() != ChangeKind.REMOVE_LITERAL) {
				int dest = lc.getKind() == ChangeKind.ADD_LITERAL ? lc.getIndex() : lc.getMoveToIndex();
				int off = dest == list.size() ? calcOffset(node,fc.getFeature()) : ((Node)list.get(dest)).getBegin();
				edit.addChild(new InsertEdit(off, generateElement((Node)lc.getReferenceValues().get(0),dest <= first,empty,off)));
				empty = false;
			}
			if (lc.getKind() != ChangeKind.ADD_LITERAL) {
				int idx = lc.getIndex();
				int start = idx < first ? ((Node)list.get(idx)).getBegin() : ((Node)list.get(idx-1)).getEnd();
				int end = idx < first && list.size() > 1 ? ((Node)list.get(idx+1)).getBegin() : ((Node)list.get(idx)).getEnd();
				edit.addChild(new DeleteEdit(start,end - start));
				break;
			}
		}
	}

	@Override
	public Boolean caseNode(Node node) {
		if (cd.getObjectChanges().get(node) != null)
			for(FeatureChange fc : cd.getObjectChanges().get(node))
				processFeature(node, fc);
		for(EObject obj : node.eContents())
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
		return true;
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
		return null;
	}

	@Override
	public Boolean caseLabel(Label node) {
		if (cd.getObjectChanges().get(node) != null)
			for(FeatureChange fc : cd.getObjectChanges().get(node))
				if (fc.getFeature() == DomPackage.eINSTANCE.getLabel_Name())
					edit.addChild(new ReplaceEdit(node.getBegin(), node.getEnd()-node.getBegin(), (String)fc.getValue()));
		return null;
	}

	@Override
	public Boolean caseType(Type node) {
		if (cd.getObjectChanges().get(node) != null)
			for(FeatureChange fc : cd.getObjectChanges().get(node))
				if (fc.getFeature() == DomPackage.eINSTANCE.getType_Name())
					edit.addChild(new ReplaceEdit(node.getBegin(), node.getEnd()-node.getBegin(), (String)fc.getValue()));
		return null;
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
		return true;
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
			if (ref == DomPackage.eINSTANCE.getFunctionExpression_Identifier())
				return node.getBegin()+8; // skip "function"
		}
		return -1;
	}
	public String generateElement(Node node,boolean first,boolean empty,int pos) {
		Generator gen = new Generator(cd, text, pos);
		if (node instanceof Statement) {
			gen.generate(node);
			gen.newLine();
			return gen.toString();
		}
		if (!first)
			gen.append(",");
		gen.generate(node);
		if (first && !empty)
			gen.append(",");
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
		return gen.toString();
	}
}