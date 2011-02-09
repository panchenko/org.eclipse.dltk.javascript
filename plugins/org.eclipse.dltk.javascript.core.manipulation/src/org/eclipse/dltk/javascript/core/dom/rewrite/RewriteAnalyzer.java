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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.ChangeKind;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.ecore.change.ListChange;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.DeleteEdit;
import org.eclipse.text.edits.InsertEdit;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;

public class RewriteAnalyzer extends DomSwitch<Boolean> {
	private final ChangeDescription cd;
	private final Set<Node> generated = new HashSet<Node>();
	private final String text;
	protected final String lineDelimiter;
	private final TextEdit edit;
	public RewriteAnalyzer(ChangeDescription cd, String text) {
		this.cd = cd;
		this.text = text;
		this.lineDelimiter = new Document(text).getDefaultLineDelimiter();
		edit = new MultiTextEdit();
	}
	public RewriteAnalyzer(ChangeDescription cd, String text, String lineDelimiter) {
		this.cd = cd;
		this.text = text;
		this.lineDelimiter = lineDelimiter;
		edit = new MultiTextEdit();
	}
	public void rewrite(Node node) {
		doSwitch(node);
		for(EObject obj : node.eContents())
			if (!generated.contains(obj))
				rewrite((Node)obj);
	}
	public TextEdit getEdit() {
		return edit;
	}
	protected void addEdit(TextEdit edit, Node node) {
		this.edit.addChild(edit);
	}

	// Processes EReference only
	private void processFeature(Node node, FeatureChange fc) {
		if (fc.getFeature() instanceof EAttribute)
			return;
		if (!fc.getFeature().isMany()) {
			Node n = (Node)node.eGet(fc.getFeature());
			Node o = (Node)fc.getReferenceValue();
			int off = o == null ? calcOffset(node,fc.getFeature()) : o.getBegin();
			int len = o == null ? 0 : o.getEnd()-o.getBegin();
			String value = n == null ? "" : generate(n, node, o == null, off);
			addEdit(new ReplaceEdit(off,len,value),n);
			return;
		}
		@SuppressWarnings("unchecked")
		EList<? extends Node> dst = (EList<? extends Node>)node.eGet(fc.getFeature());
		EList<Object> src = new BasicEList<Object>();
		src.addAll(dst);
		Set<Node> deleted = new HashSet<Node>();
		Set<Node> generated = new HashSet<Node>();
		for(ListChange lc : fc.getListChanges()) {
			if (lc.getKind() != ChangeKind.ADD_LITERAL)
				generated.add((Node)src.get(lc.getIndex()));
			if (lc.getKind() == ChangeKind.MOVE_LITERAL)
				deleted.add((Node)src.get(lc.getIndex()));
			lc.apply((EList<Object>)src);
			if (lc.getKind() == ChangeKind.ADD_LITERAL)
				deleted.add((Node)src.get(lc.getIndex()));
		}
		if (fc.getListChanges().isEmpty()) {
			src.clear();
			generated.addAll(dst);
		}
		List<Node> original = new ArrayList<Node>(src.size());
		for(Object obj : src)
			original.add((Node)obj);
		Node last = null;
		for(Node item : original)
			if (!deleted.contains(item))
				last = item;

		// DELETING ELEMENTS
		// 1) general case: a,(b,)c,(d,)(e,)f
		// 2) at the end: a,(b,)c,d(,e)(,f)
		// 3) all of it: (a)(,b)(,c)
		// we delete element with following separator so that this will work
		// with statements and line feeds/semicolons.
		boolean isLast = last == null;
		for(int i=0;i<original.size();i++) {
			Node item = original.get(i);
			if (deleted.contains(item)) {
				int off = isLast && i!=0 ? original.get(i-1).getEnd() : item.getBegin();
				int end = isLast ? item.getEnd() : original.get(i+1).getBegin();
				addEdit(new DeleteEdit(off,end - off),item);
			} else
				isLast = item == last;
		}
		
		// OFFSETS
		// each element is added at the beginning of the next element
		// or at the end
		List<Integer> offs = new ArrayList<Integer>();
		int cur = original.isEmpty() ? calcOffset(node, fc.getFeature())
				: original.get(original.size()-1).getEnd();
		for(int i=dst.size()-1;i>=0;i--) {
			Node item = dst.get(i);
			if (!generated.contains(item)) {
				cur = item.getBegin();
			}
			offs.add(cur);
		}
		Collections.reverse(offs);
		
		// ADDING ELEMENTS
		// adding is done by the same rules as deleting
		// cases 1-3 are processed in generateElement
		isLast = last == null;
		for(int i=0;i<dst.size();i++) {
			Node item = dst.get(i);
			if (generated.contains(item)) {
				int off = offs.get(i);
				addEdit(new InsertEdit(off, generateElement(item,i==0,isLast,off)),item);
			} else
				isLast = item == last;
		}
	}

	@Override
	public Boolean caseNode(Node node) {
		if (cd.getObjectChanges().get(node) != null)
			for(FeatureChange fc : cd.getObjectChanges().get(node))
				processFeature(node, fc);
		return true;
	}

	@Override
	public Boolean caseUnaryExpression(UnaryExpression node) {
		if (cd.getObjectChanges().get(node) != null)
			for(FeatureChange fc : cd.getObjectChanges().get(node))
				if (fc.getFeature() == DomPackage.eINSTANCE.getUnaryExpression_Operation()) {
					UnaryOperator n = node.getOperation();
					UnaryOperator o = (UnaryOperator)fc.getValue();
					int len = o.toString().length();
					if (isPostfix(o))
						addEdit(new DeleteEdit(node.getEnd()-len,len),node);
					else
						addEdit(new DeleteEdit(node.getBegin(),len),node);
					if (isPostfix(n))
						addEdit(new InsertEdit(node.getEnd(),n.toString()),node);
					else {
						String r = n.toString();
						if (isTextUnary(n))
							r += ' ';
						addEdit(new InsertEdit(node.getBegin(),r),node);
					}
				} else
					processFeature(node, fc);
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
					addEdit(new ReplaceEdit(node.getBegin(), node.getEnd()-node.getBegin(), node.getName()),node);
		return true;
	}

	@Override
	public Boolean caseLabel(Label node) {
		if (cd.getObjectChanges().get(node) != null)
			for(FeatureChange fc : cd.getObjectChanges().get(node))
				if (fc.getFeature() == DomPackage.eINSTANCE.getLabel_Name())
					addEdit(new ReplaceEdit(node.getBegin(), node.getEnd()-node.getBegin(), node.getName()),node);
		return true;
	}

	@Override
	public Boolean caseType(Type node) {
		if (cd.getObjectChanges().get(node) != null)
			for(FeatureChange fc : cd.getObjectChanges().get(node))
				if (fc.getFeature() == DomPackage.eINSTANCE.getType_Name())
					addEdit(new ReplaceEdit(node.getBegin(), node.getEnd()-node.getBegin(), node.getName()),node);
		return true;
	}

	@Override
	public Boolean caseBinaryExpression(BinaryExpression node) {
		if (cd.getObjectChanges().get(node) != null)
			for(FeatureChange fc : cd.getObjectChanges().get(node))
				if (fc.getFeature() == DomPackage.eINSTANCE.getBinaryExpression_Operation()) {
					BinaryExpression be = (BinaryExpression)node;
					String r = be.getOperation().toString();
					if (isTextBinary(fc.getValue()))
						r = ' '+r+' ';
					addEdit(new ReplaceEdit(be.getOperatorPosition(), fc.getValue().toString().length(), r),node);
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
			FunctionExpression expr = (FunctionExpression)node;
			if (ref == DomPackage.eINSTANCE.getFunctionExpression_Identifier())
				return expr.getParametersPosition()-1;
			else
				return expr.getParametersPosition();
		}
		return -1;
	}
	public String generateElement(Node node,boolean first,boolean last,int pos) {
		Generator gen = new Generator(cd, text, pos, lineDelimiter);
		if (node instanceof Statement) {
			if (!first && last)
				gen.newLine();
			gen.generate(node);
			if (!last)
				gen.newLine();
			generated.add(node);
			return gen.toString();
		}
		if (!first && last)
			gen.append(",");
		gen.generate(node);
		if (!last)
			gen.append(",");
		generated.add(node);
		return gen.toString();
	}
	public String generate(Node node, Node parent, boolean wasNull,int pos) {
		Generator gen = new Generator(cd, text, pos, lineDelimiter);
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