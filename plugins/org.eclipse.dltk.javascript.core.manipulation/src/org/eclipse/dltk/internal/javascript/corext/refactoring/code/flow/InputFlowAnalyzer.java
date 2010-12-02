/*******************************************************************************
 * Copyright (c) 2000, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Dmitry Stalnov (dstalnov@fusionone.com) - contributed fix for
 *       o inline call that is used in a field initializer
 *         (see https://bugs.eclipse.org/bugs/show_bug.cgi?id=38137)
 *     Benjamin Muskalla <bmuskalla@eclipsesource.com> - [extract method] Missing return value, while extracting code out of a loop - https://bugs.eclipse.org/bugs/show_bug.cgi?id=213519
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.internal.javascript.corext.refactoring.util.Selection;
import org.eclipse.dltk.javascript.core.dom.ConditionalExpression;
import org.eclipse.dltk.javascript.core.dom.DoStatement;
import org.eclipse.dltk.javascript.core.dom.Expression;
import org.eclipse.dltk.javascript.core.dom.ForEachInStatement;
import org.eclipse.dltk.javascript.core.dom.ForInStatement;
import org.eclipse.dltk.javascript.core.dom.ForStatement;
import org.eclipse.dltk.javascript.core.dom.IfStatement;
import org.eclipse.dltk.javascript.core.dom.IterationStatement;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.ReturnStatement;
import org.eclipse.dltk.javascript.core.dom.Statement;
import org.eclipse.dltk.javascript.core.dom.SwitchStatement;
import org.eclipse.dltk.javascript.core.dom.WhileStatement;
import org.eclipse.jface.text.IRegion;

public class InputFlowAnalyzer extends FlowAnalyzer {
	private static class LoopReentranceVisitor extends FlowAnalyzer {
		private Selection fSelection;
		private Node fLoopNode;
		public LoopReentranceVisitor(FlowContext context, Selection selection, Node loopNode) {
			super(context);
			fSelection= selection;
			fLoopNode= loopNode;
		}
		protected boolean isTraverseNeeded(Node node) {
			return true;
		}
		protected boolean createReturnFlowInfo(ReturnStatement node) {
			// Make sure that the whole return statement is selected or located before the selection.
			return node.getEnd() <= fSelection.getExclusiveEnd();
		}
		protected Node getLoopNode() {
			return fLoopNode;
		}
		public void process(Node node) {
			try {
				//fFlowContext.setLoopReentranceMode(true);
				traverse(node);
			} finally {
				//fFlowContext.setLoopReentranceMode(false);
			}
		}
		public Boolean caseDoStatement(DoStatement node) {
			DoWhileFlowInfo info= createDoWhile();
			setFlowInfo(node, info);
			info.mergeAction(getFlowInfo(node.getBody()), fFlowContext);
			// No need to merge the condition. It was already considered by the InputFlowAnalyzer.
			info.removeLabel(null);
			return true;
		}
		
		public Boolean caseForInStatement(ForInStatement node) {
			FlowInfo paramInfo= getFlowInfo(node.getItem());
			FlowInfo expressionInfo= getFlowInfo(node.getCollection());
			FlowInfo actionInfo= getFlowInfo(node.getBody());
			processForIn(node, paramInfo, expressionInfo, actionInfo);
			return true;
		}
		
		public Boolean caseForEachInStatement(ForEachInStatement node) {
			FlowInfo paramInfo= getFlowInfo(node.getItem());
			FlowInfo expressionInfo= getFlowInfo(node.getCollection());
			FlowInfo actionInfo= getFlowInfo(node.getBody());
			processForIn(node, paramInfo, expressionInfo, actionInfo);
			return true;
		}
		
		private void processForIn(Node node, FlowInfo paramInfo,
				FlowInfo expressionInfo, FlowInfo actionInfo) {
			ForInFlowInfo forInfo= createForIn();
			setFlowInfo(node, forInfo);
			// If the for statement is the outermost loop then we only have to consider
			// the action. The parameter and expression are only evaluated once.
			if (node == fLoopNode) {
				forInfo.mergeAction(actionInfo, fFlowContext);
			} else {
				// Inner for loops are evaluated in the sequence expression, parameter,
				// action.
				forInfo.mergeExpression(expressionInfo, fFlowContext);
				forInfo.mergeParameter(paramInfo, fFlowContext);
				forInfo.mergeAction(actionInfo, fFlowContext);
			}
			forInfo.removeLabel(null);
		}
		
		public Boolean caseForStatement(ForStatement node) {
			FlowInfo initInfo= createSequential(node.getInitialization());
			FlowInfo conditionInfo= getFlowInfo(node.getCondition());
			FlowInfo incrementInfo= createSequential(node.getIncrement());
			FlowInfo actionInfo= getFlowInfo(node.getBody());
			ForFlowInfo forInfo= createFor();
			setFlowInfo(node, forInfo);
			// the for statement is the outermost loop. In this case we only have
			// to consider the increment, condition and action.
			if (node == fLoopNode) {
				forInfo.mergeIncrement(incrementInfo, fFlowContext);
				forInfo.mergeCondition(conditionInfo, fFlowContext);
				forInfo.mergeAction(actionInfo, fFlowContext);
			} else {
				// we have to merge two different cases. One if we reenter the for statement
				// immediatelly (that means we have to consider increments, condition and action)
				// and the other case if we reenter the for in the next loop of
				// the outer loop. Then we have to consider initializations, condtion and action.
				// For a conditional flow info that means:
				// (initializations | increments) & condition & action.
				GenericConditionalFlowInfo initIncr= new GenericConditionalFlowInfo();
				initIncr.merge(initInfo, fFlowContext);
				initIncr.merge(incrementInfo, fFlowContext);
				forInfo.mergeAccessModeSequential(initIncr, fFlowContext);
				forInfo.mergeCondition(conditionInfo, fFlowContext);
				forInfo.mergeAction(actionInfo, fFlowContext);
			}
			forInfo.removeLabel(null);
			return true;
		}
	}

	private Selection fSelection;
	private boolean fDoLoopReentrance;
	private LoopReentranceVisitor fLoopReentranceVisitor;

	public InputFlowAnalyzer(FlowContext context, Selection selection, boolean doLoopReentrance) {
		super(context);
		fSelection= selection;
		Assert.isNotNull(fSelection);
		fDoLoopReentrance= doLoopReentrance;
	}

	public FlowInfo perform(Node node) {
		//Assert.isTrue(!(node instanceof AbstractTypeDeclaration));
		this.traverse(node);
		return getFlowInfo(node);
	}

	protected boolean isTraverseNeeded(Node node) {
		return node.getEnd() > fSelection.getInclusiveEnd();
	}

	protected boolean createReturnFlowInfo(ReturnStatement node) {
		// Make sure that the whole return statement is located after the selection. There can be cases like
		// return i + [x + 10] * 10; In this case we must not create a return info node.
		return node.getBegin() >= fSelection.getInclusiveEnd();
	}
	
	protected void traverse(Node node) {
		if (isTraverseNeeded(node)) {
			if (node instanceof IterationStatement) {
				createLoopReentranceVisitor(node);
			}
			super.traverse(node);
		}
	}

	private void createLoopReentranceVisitor(Node node) {
		if (fLoopReentranceVisitor == null && fDoLoopReentrance && fSelection.coveredBy(node))
			fLoopReentranceVisitor= new LoopReentranceVisitor(fFlowContext, fSelection, node);
	}

	public Boolean caseConditionalExpression(ConditionalExpression node) {
		Expression thenPart= node.getConsequent();
		Expression elsePart= node.getAlternative();
		if ((thenPart != null && fSelection.coveredBy(thenPart)) ||
				(elsePart != null && fSelection.coveredBy(elsePart))) {
			GenericSequentialFlowInfo info= createSequential();
			setFlowInfo(node, info);
			endVisitConditional(info, node.getPredicate(), new Node[] {thenPart, elsePart});
		} else {
			super.caseConditionalExpression(node);
		}
		return true;
	}

	public Boolean caseDoStatement(DoStatement node) {
		super.caseDoStatement(node);
		handleLoopReentrance(node);
		return true;
	}

	public Boolean caseIfStatement(IfStatement node) {
		Statement thenPart= node.getConsequent();
		Statement elsePart= node.getAlternative();
		if ((thenPart != null && fSelection.coveredBy(thenPart)) ||
				(elsePart != null && fSelection.coveredBy(elsePart))) {
			GenericSequentialFlowInfo info= createSequential();
			setFlowInfo(node, info);
			endVisitConditional(info, node.getPredicate(), new Node[] {thenPart, elsePart});
		} else {
			super.caseIfStatement(node);
		}
		return true;
	}

	public Boolean caseForInStatement(ForInStatement node) {
		super.caseForInStatement(node);
		handleLoopReentrance(node);
		return true;
	}

	public Boolean caseForEachInStatement(ForEachInStatement node) {
		super.caseForEachInStatement(node);
		handleLoopReentrance(node);
		return true;
	}

	public Boolean caseForStatement(ForStatement node) {
		super.caseForStatement(node);
		handleLoopReentrance(node);
		return true;
	}

	public Boolean caseSwitchStatement(SwitchStatement node) {
		SwitchData data= createSwitchData(node);
		IRegion[] ranges= data.getRanges();
		for (int i= 0; i < ranges.length; i++) {
			IRegion range= ranges[i];
			if (fSelection.coveredBy(range)) {
				GenericSequentialFlowInfo info= createSequential();
				setFlowInfo(node, info);
				info.merge(getFlowInfo(node.getSelector()), fFlowContext);
				info.merge(data.getInfo(i), fFlowContext);
				info.removeLabel(null);
				return true;
			}
		}
		super.caseSwitchStatement(node, data);
		return true;
	}

	public Boolean caseWhileStatement(WhileStatement node) {
		super.caseWhileStatement(node);
		handleLoopReentrance(node);
		return true;
	}

	private void endVisitConditional(GenericSequentialFlowInfo info, Node condition, Node[] branches) {
		info.merge(getFlowInfo(condition), fFlowContext);
		for (int i= 0; i < branches.length; i++) {
			Node branch= branches[i];
			if (branch != null && fSelection.coveredBy(branch)) {
				info.merge(getFlowInfo(branch), fFlowContext);
				break;
			}
		}
	}

	private void handleLoopReentrance(Node node) {
		if (fLoopReentranceVisitor == null || fLoopReentranceVisitor.getLoopNode() != node)
			return;

		fLoopReentranceVisitor.process(node);
		GenericSequentialFlowInfo info= createSequential();
		info.merge(getFlowInfo(node), fFlowContext);
		info.merge(fLoopReentranceVisitor.getFlowInfo(node), fFlowContext);
		setFlowInfo(node, info);
	}
}
