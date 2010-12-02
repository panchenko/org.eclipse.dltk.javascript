/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.javascript.core.dom.ArrayAccessExpression;
import org.eclipse.dltk.javascript.core.dom.ArrayLiteral;
import org.eclipse.dltk.javascript.core.dom.BinaryExpression;
import org.eclipse.dltk.javascript.core.dom.BinaryOperator;
import org.eclipse.dltk.javascript.core.dom.BlockStatement;
import org.eclipse.dltk.javascript.core.dom.BreakStatement;
import org.eclipse.dltk.javascript.core.dom.CallExpression;
import org.eclipse.dltk.javascript.core.dom.CatchClause;
import org.eclipse.dltk.javascript.core.dom.ConditionalExpression;
import org.eclipse.dltk.javascript.core.dom.ConstStatement;
import org.eclipse.dltk.javascript.core.dom.ContinueStatement;
import org.eclipse.dltk.javascript.core.dom.DefaultClause;
import org.eclipse.dltk.javascript.core.dom.DoStatement;
import org.eclipse.dltk.javascript.core.dom.Expression;
import org.eclipse.dltk.javascript.core.dom.ExpressionStatement;
import org.eclipse.dltk.javascript.core.dom.ForEachInStatement;
import org.eclipse.dltk.javascript.core.dom.ForInStatement;
import org.eclipse.dltk.javascript.core.dom.ForStatement;
import org.eclipse.dltk.javascript.core.dom.FunctionExpression;
import org.eclipse.dltk.javascript.core.dom.GetterAssignment;
import org.eclipse.dltk.javascript.core.dom.IfStatement;
import org.eclipse.dltk.javascript.core.dom.Label;
import org.eclipse.dltk.javascript.core.dom.LabeledStatement;
import org.eclipse.dltk.javascript.core.dom.NewExpression;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.ObjectLiteral;
import org.eclipse.dltk.javascript.core.dom.ParenthesizedExpression;
import org.eclipse.dltk.javascript.core.dom.PropertyAccessExpression;
import org.eclipse.dltk.javascript.core.dom.ReturnStatement;
import org.eclipse.dltk.javascript.core.dom.SetterAssignment;
import org.eclipse.dltk.javascript.core.dom.SimplePropertyAssignment;
import org.eclipse.dltk.javascript.core.dom.Source;
import org.eclipse.dltk.javascript.core.dom.Statement;
import org.eclipse.dltk.javascript.core.dom.SwitchElement;
import org.eclipse.dltk.javascript.core.dom.SwitchStatement;
import org.eclipse.dltk.javascript.core.dom.ThrowStatement;
import org.eclipse.dltk.javascript.core.dom.TryStatement;
import org.eclipse.dltk.javascript.core.dom.UnaryExpression;
import org.eclipse.dltk.javascript.core.dom.UnaryOperator;
import org.eclipse.dltk.javascript.core.dom.VariableDeclaration;
import org.eclipse.dltk.javascript.core.dom.VariableReference;
import org.eclipse.dltk.javascript.core.dom.VariableStatement;
import org.eclipse.dltk.javascript.core.dom.WhileStatement;
import org.eclipse.dltk.javascript.core.dom.util.DomSwitch;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;


/**
 * Special flow analyzer to determine the return value of the extracted method
 * and the variables which have to be passed to the method.
 *
 * Note: This analyzer doesn't do a full flow analysis. For example it doesn't
 * do dead code analysis or variable initialization analysis. It analyses the
 * the first access to a variable (read or write) and if all execution paths
 * return a value.
 */
abstract class FlowAnalyzer extends DomSwitch<Boolean> {

	static protected class SwitchData {
		private boolean fHasDefaultCase;
		private List<IRegion> fRanges= new ArrayList<IRegion>(4);
		private List<FlowInfo> fInfos= new ArrayList<FlowInfo>(4);
		public void setHasDefaultCase() {
			fHasDefaultCase= true;
		}
		public boolean hasDefaultCase() {
			return fHasDefaultCase;
		}
		public void add(IRegion range, FlowInfo info) {
			fRanges.add(range);
			fInfos.add(info);
		}
		public IRegion[] getRanges() {
			return (IRegion[]) fRanges.toArray(new IRegion[fRanges.size()]);
		}
		public FlowInfo[] getInfos() {
			return (FlowInfo[]) fInfos.toArray(new FlowInfo[fInfos.size()]);
		}
		public FlowInfo getInfo(int index) {
			return (FlowInfo)fInfos.get(index);
		}
	}

	private Map<Node,FlowInfo> fData = new HashMap<Node,FlowInfo>(100);
	/* package */ FlowContext fFlowContext;

	public FlowAnalyzer(FlowContext context) {
		fFlowContext= context;
	}

	protected abstract boolean createReturnFlowInfo(ReturnStatement node);

	protected abstract boolean isTraverseNeeded(Node node);

	/*protected boolean skipNode(ASTNode node) {
		return !traverseNode(node);
	}

	protected final boolean visitNode(ASTNode node) {
		return traverseNode(node);
	}*/

	//---- Hooks to create Flow info objects. User may introduce their own infos.

	protected ReturnFlowInfo createReturn(ReturnStatement statement) {
		return new ReturnFlowInfo(statement);
	}

	protected ThrowFlowInfo createThrow() {
		return new ThrowFlowInfo();
	}

	protected BranchFlowInfo createBranch(Label label) {
		return new BranchFlowInfo(label, fFlowContext);
	}

	protected GenericSequentialFlowInfo createSequential() {
		return new GenericSequentialFlowInfo();
	}

	protected ConditionalFlowInfo createConditional() {
		return new ConditionalFlowInfo();
	}

	protected ForInFlowInfo createForIn() {
		return new ForInFlowInfo();
	}

	protected ForFlowInfo createFor() {
		return new ForFlowInfo();
	}

	protected TryFlowInfo createTry() {
		return new TryFlowInfo();
	}

	protected WhileFlowInfo createWhile() {
		return new WhileFlowInfo();
	}

	protected IfFlowInfo createIf() {
		return new IfFlowInfo();
	}

	protected DoWhileFlowInfo createDoWhile() {
		return new DoWhileFlowInfo();
	}

	protected SwitchFlowInfo createSwitch() {
		return new SwitchFlowInfo();
	}

	protected BlockFlowInfo createBlock() {
		return new BlockFlowInfo();
	}

	protected MessageSendFlowInfo createMessageSendFlowInfo() {
		return new MessageSendFlowInfo();
	}

	protected FlowContext getFlowContext() {
		return fFlowContext;
	}

	//---- Helpers to access flow analysis objects ----------------------------------------

	protected FlowInfo getFlowInfo(Node node) {
		return fData.remove(node);
	}
	
	protected void setFlowInfo(Node node, FlowInfo info) {
		fData.put(node, info);
	}

	protected FlowInfo assignFlowInfo(Node target, Node source) {
		FlowInfo result= getFlowInfo(source);
		setFlowInfo(target, result);
		return result;
	}

	protected FlowInfo accessFlowInfo(Node node) {
		return (FlowInfo)fData.get(node);
	}

	//---- Helpers to process sequential flow infos -------------------------------------

	protected GenericSequentialFlowInfo processSequential(Node parent, List<? extends Node> nodes) {
		GenericSequentialFlowInfo result= createSequential(parent);
		process(result, nodes);
		return result;
	}

	protected GenericSequentialFlowInfo processSequential(Node parent, Node node1) {
		GenericSequentialFlowInfo result= createSequential(parent);
		if (node1 != null)
			result.merge(getFlowInfo(node1), fFlowContext);
		return result;
	}

	protected GenericSequentialFlowInfo processSequential(Node parent, Node node1, Node node2) {
		GenericSequentialFlowInfo result= createSequential(parent);
		if (node1 != null)
			result.merge(getFlowInfo(node1), fFlowContext);
		if (node2 != null)
			result.merge(getFlowInfo(node2), fFlowContext);
		return result;
	}

	protected GenericSequentialFlowInfo createSequential(Node parent) {
		GenericSequentialFlowInfo result= createSequential();
		setFlowInfo(parent, result);
		return result;
	}

	/*protected GenericSequentialFlowInfo createSequential(List nodes) {
		GenericSequentialFlowInfo result= createSequential();
		process(result, nodes);
		return result;
	}*/

	//---- Generic merge methods --------------------------------------------------------

	protected void process(GenericSequentialFlowInfo info, List<? extends Node> nodes) {
		if (nodes == null)
			return;
		for (Node node : nodes) {
			info.merge(getFlowInfo(node), fFlowContext);
		}
	}

	/*protected void process(GenericSequentialFlowInfo info, ASTNode node) {
		if (node != null)
			info.merge(getFlowInfo(node), fFlowContext);
	}

	protected void process(GenericSequentialFlowInfo info, ASTNode node1, ASTNode node2) {
		if (node1 != null)
			info.merge(getFlowInfo(node1), fFlowContext);
		if (node2 != null)
			info.merge(getFlowInfo(node2), fFlowContext);
	}*/

	//---- Helper to process switch statement ----------------------------------------

	protected SwitchData createSwitchData(SwitchStatement node) {
		SwitchData result= new SwitchData();
		List<SwitchElement> elements= node.getElements();
		if (elements.isEmpty())
			return result;

		int start= -1, end= -1;
		GenericSequentialFlowInfo info= null;

		for (SwitchElement switchCase : elements) {
			if (switchCase instanceof DefaultClause) {
				result.setHasDefaultCase();
			}
			if (info == null) {
				info= createSequential();
				start= switchCase.getBegin();
			} else {
				if (info.isReturn() || info.isPartialReturn() || info.branches()) {
					result.add(new Region(start, end - start), info);
					info= createSequential();
					start= switchCase.getBegin();
				}
			}
			for(Statement element : switchCase.getStatements())
				info.merge(getFlowInfo(element), fFlowContext);
			end= switchCase.getEnd();
		}
		result.add(new Region(start, end - start), info);
		return result;
	}

	protected void caseSwitchStatement(SwitchStatement node, SwitchData data) {
		SwitchFlowInfo switchFlowInfo= createSwitch();
		setFlowInfo(node, switchFlowInfo);
		switchFlowInfo.mergeTest(getFlowInfo(node.getSelector()), fFlowContext);
		FlowInfo[] cases= data.getInfos();
		for (int i= 0; i < cases.length; i++)
			switchFlowInfo.mergeCase(cases[i], fFlowContext);
		switchFlowInfo.mergeDefault(data.hasDefaultCase(), fFlowContext);
		switchFlowInfo.removeLabel(null);
	}

	//---- special visit methods -------------------------------------------------------

	protected void traverse(Node node) {
		if (isTraverseNeeded(node)) {
			for(EObject obj : node.eContents())
				traverse((Node)obj);
			doSwitch(node);
		}
	}

	public Boolean caseArrayAccessExpression(ArrayAccessExpression node) {
		processSequential(node, node.getArray(), node.getIndex());
		return true;
	}

	public Boolean caseArrayLiteral(ArrayLiteral node) {
		//GenericSequentialFlowInfo info= processSequential(node, node.getType());
		//process(info, node.dimensions());
		//process(info, node.getInitializer());
		processSequential(node, node.getElements());
		return true;
	}
	
	@Override
	public Boolean caseObjectLiteral(ObjectLiteral node) {
		processSequential(node, node.getProperties());
		return true;
	}

	public Boolean caseBlockStatement(BlockStatement node) {
		GenericSequentialFlowInfo info= createBlock();
		setFlowInfo(node, info);
		process(info, node.getStatements());
		return true;
	}

	public Boolean caseBreakStatement(BreakStatement node) {
		setFlowInfo(node, createBranch(node.getLabel()));
		return true;
	}

	public Boolean caseCatchClause(CatchClause node) {
		processSequential(node, node.getException(), node.getBody());
		return true;
	}

	public Boolean caseNewExpression(NewExpression node) {
		GenericSequentialFlowInfo info= processSequential(node, node.getConstructor());
		process(info, node.getArguments());
		return true;
	}

	public Boolean caseSource(Source node) {
		processSequential(node, node.getStatements());
		return true;
	}

	public Boolean caseConditionalExpression(ConditionalExpression node) {
		ConditionalFlowInfo info= createConditional();
		setFlowInfo(node, info);
		info.mergeCondition(getFlowInfo(node.getPredicate()), fFlowContext);
		info.merge(
			getFlowInfo(node.getConsequent()),
			getFlowInfo(node.getAlternative()),
			fFlowContext);
		return true;
	}

	public Boolean caseContinueStatement(ContinueStatement node) {
		setFlowInfo(node, createBranch(node.getLabel()));
		return true;
	}

	public Boolean caseDoStatement(DoStatement node) {
		DoWhileFlowInfo info= createDoWhile();
		setFlowInfo(node, info);
		info.mergeAction(getFlowInfo(node.getBody()), fFlowContext);
		info.mergeCondition(getFlowInfo(node.getCondition()), fFlowContext);
		info.removeLabel(null);
		return true;
	}

	public Boolean caseForInStatement(ForInStatement node) {
		ForInFlowInfo forInfo= createForIn();
		setFlowInfo(node, forInfo);
		forInfo.mergeParameter(getFlowInfo(node.getItem()), fFlowContext);
		forInfo.mergeExpression(getFlowInfo(node.getCollection()), fFlowContext);
		forInfo.mergeAction(getFlowInfo(node.getBody()), fFlowContext);
		forInfo.removeLabel(null);
		return true;
	}
	
	public Boolean caseForEachInStatement(ForEachInStatement node) {
		ForInFlowInfo forInfo= createForIn();
		setFlowInfo(node, forInfo);
		forInfo.mergeParameter(getFlowInfo(node.getItem()), fFlowContext);
		forInfo.mergeExpression(getFlowInfo(node.getCollection()), fFlowContext);
		forInfo.mergeAction(getFlowInfo(node.getBody()), fFlowContext);
		forInfo.removeLabel(null);
		return true;
	}

	public Boolean caseExpressionStatement(ExpressionStatement node) {
		assignFlowInfo(node, node.getExpression());
		return true;
	}

	public Boolean casePropertyAccessExpression(PropertyAccessExpression node) {
		processSequential(node, node.getObject(), node.getProperty());
		return true;
	}

	public Boolean caseSimplePropertyAssignment(SimplePropertyAssignment node) {
		processSequential(node, node.getInitializer());
		return true;
	}

	public Boolean caseForStatement(ForStatement node) {
		ForFlowInfo forInfo= createFor();
		setFlowInfo(node, forInfo);
		forInfo.mergeInitializer(getFlowInfo(node.getInitialization()), fFlowContext);
		forInfo.mergeCondition(getFlowInfo(node.getCondition()), fFlowContext);
		forInfo.mergeAction(getFlowInfo(node.getBody()), fFlowContext);
		// Increments are executed after the action.
		forInfo.mergeIncrement(createSequential(node.getIncrement()), fFlowContext);
		forInfo.removeLabel(null);
		return true;
	}

	public Boolean caseIfStatement(IfStatement node) {
		IfFlowInfo info= createIf();
		setFlowInfo(node, info);
		info.mergeCondition(getFlowInfo(node.getPredicate()), fFlowContext);
		info.merge(getFlowInfo(node.getConsequent()), getFlowInfo(node.getAlternative()), fFlowContext);
		return true;
	}

	public Boolean caseBinaryExpression(BinaryExpression node) {
		if (isAssignment(node.getOperation())) {
			FlowInfo lhs= getFlowInfo(node.getLeft());
			FlowInfo rhs= getFlowInfo(node.getRight());
			if (lhs instanceof LocalFlowInfo) {
				LocalFlowInfo llhs= (LocalFlowInfo)lhs;
				llhs.setWriteAccess(fFlowContext);
				if (node.getOperation() != BinaryOperator.ASSIGN) {
					GenericSequentialFlowInfo tmp= createSequential();
					tmp.merge(new LocalFlowInfo(llhs, FlowInfo.READ, fFlowContext), fFlowContext);
					tmp.merge(rhs, fFlowContext);
					rhs= tmp;
				}
			}
			GenericSequentialFlowInfo info= createSequential(node);
			// first process right and side and then left hand side.
			info.merge(rhs, fFlowContext);
			info.merge(lhs, fFlowContext);
		} else
			processSequential(node, node.getLeft(), node.getRight());
		return true;
	}
	
	private boolean isAssignment(BinaryOperator op) {
		switch (op) {
		case ADD_ASSIGN:
		case AND_ASSIGN:
		case ASSIGN:
		case DIV_ASSIGN:
		case LSH_ASSIGN:
		case MOD_ASSIGN:
		case MUL_ASSIGN:
		case OR_ASSIGN:
		case RSH_ASSIGN:
		case SUB_ASSIGN:
		case URSH_ASSIGN:
		case XOR_ASSIGN:
			return true;
		}
		return false;
	}

	public Boolean caseLabeledStatement(LabeledStatement node) {
		FlowInfo info= assignFlowInfo(node, node.getStatement());
		if (info != null)
			info.removeLabel(node.getLabel());
		return true;
	}

	public Boolean caseFunctionExpression(FunctionExpression node) {
		GenericSequentialFlowInfo info= processSequential(node, node.getParameters());
		info.merge(getFlowInfo(node.getBody()), fFlowContext);
		info.setNoReturn();
		return true;
	}
	
	public Boolean caseGetterAssignment(GetterAssignment node) {
		GenericSequentialFlowInfo info= processSequential(node, node.getBody());
		info.setNoReturn();
		return true;
	}

	public Boolean caseSetterAssignment(SetterAssignment node) {
		GenericSequentialFlowInfo info= processSequential(node, node.getParameter());
		info.merge(getFlowInfo(node.getBody()), fFlowContext);
		info.setNoReturn();
		return true;
	}

	public Boolean caseCallExpression(CallExpression node) {
		//getMethodBinding(node.getName())
		MessageSendFlowInfo info= createMessageSendFlowInfo();
		setFlowInfo(node, info);
		for (Expression arg : node.getArguments()) {
			info.mergeArgument(getFlowInfo(arg), fFlowContext);
		}
		info.mergeReceiver(getFlowInfo(node.getApplicant()), fFlowContext);
		//info.mergeExceptions(binding, fFlowContext);
		return true;
	}


	public Boolean caseParenthesizedExpression(ParenthesizedExpression node) {
		assignFlowInfo(node, node.getEnclosed());
		return true;
	}

	public Boolean caseUnaryExpression(UnaryExpression node) {
		if (hasSideEffect(node.getOperation())) {
			FlowInfo info= getFlowInfo(node.getArgument());
			if (info instanceof LocalFlowInfo) {
				// Normally we should do this in the parent node since the write access take place later.
				// But I couldn't come up with a case where this influences the flow analysis. So I kept
				// it here to simplify the code.
				GenericSequentialFlowInfo result= createSequential(node);
				result.merge(info, fFlowContext);
				result.merge(
						new LocalFlowInfo((LocalFlowInfo)info, FlowInfo.WRITE, fFlowContext),
						fFlowContext);
			} else {
				setFlowInfo(node, info);
			}
		} else {
			assignFlowInfo(node, node.getArgument());
		}
		return true;
	}
	
	private boolean hasSideEffect(UnaryOperator op) {
		switch (op) {
		case POSTFIX_DEC:
		case POSTFIX_INC:
		case PREFIX_DEC:
		case PREFIX_INC:
		case DELETE:
			return true;
		}
		return false;
	}

	public Boolean caseReturnStatement(ReturnStatement node) {
		if (createReturnFlowInfo(node)) {
			ReturnFlowInfo info= createReturn(node);
			setFlowInfo(node, info);
			info.merge(getFlowInfo(node.getExpression()), fFlowContext);
		} else {
			assignFlowInfo(node, node.getExpression());
		}
		return true;
	}

	public Boolean caseVariableReference(VariableReference node) {
		VariableBinding binding = fFlowContext.resolve(node.getVariable());
		if (binding != null) {
			setFlowInfo(node, new LocalFlowInfo(
					binding,
					FlowInfo.READ,
					fFlowContext));
		}
		return true;
	}

	public Boolean caseSwitchStatement(SwitchStatement node) {
		caseSwitchStatement(node, createSwitchData(node));
		return true;
	}

	public Boolean caseThrowStatement(ThrowStatement node) {
		ThrowFlowInfo info= createThrow();
		setFlowInfo(node, info);
		Expression expression= node.getException();
		info.merge(getFlowInfo(expression), fFlowContext);
		//info.mergeException(expression.resolveTypeBinding(), fFlowContext);
		return true;
	}

	public Boolean caseTryStatement(TryStatement node) {
		TryFlowInfo info= createTry();
		setFlowInfo(node, info);
		info.mergeTry(getFlowInfo(node.getBody()), fFlowContext);
		//info.removeExceptions(node);
		for (CatchClause element : node.getCatches()) {
			info.mergeCatch(getFlowInfo(element), fFlowContext);
		}
		info.mergeFinally(getFlowInfo(node.getFinallyClause()), fFlowContext);
		return true;
	}

	public Boolean caseVariableStatement(VariableStatement node) {
		processSequential(node, node.getDeclarations());
		return true;
	}

	public Boolean caseConstStatement(ConstStatement node) {
		processSequential(node, node.getDeclarations());
		return true;
	}

	public Boolean caseVariableDeclaration(VariableDeclaration node) {
		VariableBinding binding= fFlowContext.resolve(node.getIdentifier());
		LocalFlowInfo nameInfo= null;
		Expression initializer= node.getInitializer();
		if (binding != null && initializer != null) {
			nameInfo= new LocalFlowInfo(binding, FlowInfo.WRITE, fFlowContext);
		}
		GenericSequentialFlowInfo info= processSequential(node, initializer);
		info.merge(nameInfo, fFlowContext);
		return true;
	}

	public Boolean caseWhileStatement(WhileStatement node) {
		WhileFlowInfo info= createWhile();
		setFlowInfo(node, info);
		info.mergeCondition(getFlowInfo(node.getCondition()), fFlowContext);
		info.mergeAction(getFlowInfo(node.getBody()), fFlowContext);
		info.removeLabel(null);
		return true;
	}

	/*private IMethodBinding getMethodBinding(Name name) {
		if (name == null)
			return null;
		IBinding binding= name.resolveBinding();
		if (binding instanceof IMethodBinding)
			return (IMethodBinding)binding;
		return null;
	}*/
}
