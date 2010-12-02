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


import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.ReturnStatement;

public class InOutFlowAnalyzer extends FlowAnalyzer {

	public InOutFlowAnalyzer(FlowContext context) {
		super(context);
	}

	public FlowInfo perform(Node[] selectedNodes) {
		FlowContext context= getFlowContext();
		GenericSequentialFlowInfo result= createSequential();
		for (int i= 0; i < selectedNodes.length; i++) {
			Node node= selectedNodes[i];
			traverse(node);
			result.merge(getFlowInfo(node), context);
		}
		return result;
	}

	protected boolean isTraverseNeeded(Node node) {
		return true;
	}

	protected boolean createReturnFlowInfo(ReturnStatement node) {
		// we are only traversing selected nodes.
		return true;
	}

	/*public Boolean caseCatchClause(CatchClause node) {
		super.caseCatchClause(node);
		clearAccessMode(accessFlowInfo(node), node.getException());
		return true;
	}

	public Boolean caseForInStatement(ForInStatement node) {
		super.caseForInStatement(node);
		clearAccessMode(accessFlowInfo(node), node.getItem());
		return true;
	}

	public Boolean caseForEachInStatement(ForEachInStatement node) {
		super.caseForEachInStatement(node);
		clearAccessMode(accessFlowInfo(node), node.getItem());
		return true;
	}

	public Boolean caseForStatement(ForStatement node) {
		super.caseForStatement(node);
		clearAccessMode(accessFlowInfo(node), node.getInitialization());
		return true;
	}

	public Boolean caseFunctionExpression(FunctionExpression node) {
		super.caseFunctionExpression(node);
		FlowInfo info= accessFlowInfo(node);
		for (Parameter parameter : node.getParameters())
			clearAccessMode(info, parameter.getName());
		clearAccessMode(info, node.getBody());
		return true;
	}

	public Boolean caseGetterAssignment(GetterAssignment node) {
		super.caseGetterAssignment(node);
		FlowInfo info= accessFlowInfo(node);
		clearAccessMode(info, node.getBody());
		return true;
	}

	public Boolean caseSetterAssignment(SetterAssignment node) {
		super.caseSetterAssignment(node);
		FlowInfo info= accessFlowInfo(node);
		clearAccessMode(info, node.getParameter());
		clearAccessMode(info, node.getBody());
		return true;
	}

	private void clearAccessMode(FlowInfo info, Identifier decl) {
		//IVariableBinding binding= decl.resolveBinding();
		//if (binding != null && !binding.isField())
		//	info.clearAccessMode(binding, fFlowContext);
	}
	
	private void clearAccessMode(FlowInfo info, BlockStatement block) {
		TreeIterator<EObject> it = block.eAllContents();
		while (it.hasNext()) {
			Node cur = (Node)it.next();
			if (cur instanceof VariableDeclaration) {
			}
		}
	}

	private void clearAccessMode(FlowInfo info, IForInitializer init) {
		if (init == null || info == null)
			return;
		if (init instanceof VariableStatement)
			for(VariableDeclaration decl : ((VariableStatement)init).getDeclarations())
				clearAccessMode(info, decl.getIdentifier());
	}*/
}

