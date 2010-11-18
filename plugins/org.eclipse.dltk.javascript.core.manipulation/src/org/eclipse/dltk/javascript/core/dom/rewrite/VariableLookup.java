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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.dltk.javascript.core.dom.CatchClause;
import org.eclipse.dltk.javascript.core.dom.DomPackage;
import org.eclipse.dltk.javascript.core.dom.ExpressionStatement;
import org.eclipse.dltk.javascript.core.dom.FunctionExpression;
import org.eclipse.dltk.javascript.core.dom.GetterAssignment;
import org.eclipse.dltk.javascript.core.dom.Identifier;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.Parameter;
import org.eclipse.dltk.javascript.core.dom.SetterAssignment;
import org.eclipse.dltk.javascript.core.dom.VariableDeclaration;
import org.eclipse.dltk.javascript.core.dom.VariableReference;
import org.eclipse.emf.ecore.EObject;

public class VariableLookup {
	Set<String> result;
	Set<String> hidden = new HashSet<String>();
	public Set<String> getVisibleNames(Node node) {
		result = new HashSet<String>();
		boolean innerMost=true;
		while (node.eContainer() != null) {
			node = (Node)node.eContainer();
			Node body = null;
			switch(node.eClass().getClassifierID()) {
			case DomPackage.CATCH_CLAUSE:
				result.add(((CatchClause)node).getException().getName());
				break;
			case DomPackage.FUNCTION_EXPRESSION:
				FunctionExpression expr = (FunctionExpression)node;
				result.addAll(resolveFunctionScope(expr));
				body = expr.getBody(); 
				break;
			case DomPackage.GETTER_ASSIGNMENT:
				GetterAssignment getter = (GetterAssignment)node;
				result.addAll(resolveGetterScope(getter));
				body = getter.getBody();
				break;
			case DomPackage.SETTER_ASSIGNMENT:
				SetterAssignment setter = (SetterAssignment)node;
				result.addAll(resolveSetterScope(setter));
				body = setter.getBody();
				break;
			case DomPackage.SOURCE:
				findDeclarations(node,result);
				body = node;
				break;
			}
			if (innerMost && body != null) {
				innerMost = false;
				doFindReferences(body);
			}
		}
		return result;
	}
	
	public static List<VariableReference> findReferences(Node root, Set<String> names) {
		return findReferences(root,names,false);
	}
	
	public static List<VariableReference> findReferences(final Node root, Set<String> names,
			final boolean firstOnly) {
		final Set<String> wanted;
		if (firstOnly) {
			wanted = new HashSet<String>();
			wanted.addAll(names);
		} else
			wanted = names;
		return new VariableLookup() {
			List<VariableReference> refs = new ArrayList<VariableReference>();
			List<VariableReference> getResult() {
				doFindReferences(root);
				return refs;
			}
			protected void addReference(VariableReference node) {
				if (wanted.contains(node.getVariable().getName())) {
					refs.add(node);
					if (firstOnly)
						wanted.remove(node.getVariable().getName());
				}
			}
		}.getResult();
	}

	private void addName(Identifier id,Set<String> dst) {
		String str = id.getName();
		if (!hidden.contains(str))
			dst.add(str);
	}
	
	private void findDeclarations(Node node, Set<String> dst) {
		switch(node.eClass().getClassifierID()) {
		case DomPackage.EXPRESSION_STATEMENT:
			ExpressionStatement stmt = (ExpressionStatement)node;
			if (stmt.getExpression() instanceof FunctionExpression) {
				Identifier id = ((FunctionExpression)stmt.getExpression()).getIdentifier();
				if (id != null)
					addName(id,dst);
				return;
			}
			break;
		case DomPackage.FUNCTION_EXPRESSION:
			return;
		case DomPackage.VARIABLE_DECLARATION:
			addName(((VariableDeclaration)node).getIdentifier(),dst);
			break;
		}
		for(EObject obj : node.eContents())
			findDeclarations((Node)obj,dst);
	}

	protected void doFindReferences(Node node) {
		switch(node.eClass().getClassifierID()) {
		case DomPackage.CATCH_CLAUSE:
			String str = ((CatchClause)node).getException().getName();
			if (!hidden.contains(str)) {
				hidden.add(str);
				for(EObject obj : node.eContents())
					doFindReferences((Node)obj);
				hidden.remove(str);
				return;
			}
			break;
		case DomPackage.FUNCTION_EXPRESSION: {
			FunctionExpression expr = (FunctionExpression)node;
			findInScope(expr.getBody(), resolveFunctionScope(expr));
			return;
		}
		case DomPackage.GETTER_ASSIGNMENT: {
			GetterAssignment getter = (GetterAssignment)node;
			findInScope(getter.getBody(), resolveGetterScope(getter));
			return;
		}
		case DomPackage.SETTER_ASSIGNMENT: {
			SetterAssignment setter = (SetterAssignment)node;
			findInScope(setter.getBody(), resolveSetterScope(setter));
			return;
		}
		case DomPackage.VARIABLE_REFERENCE: {
			addReference((VariableReference)node);
			return;
		}
		}
		for(EObject obj : node.eContents())
			doFindReferences((Node)obj);
	}

	protected void addReference(VariableReference node) {
		addName(node.getVariable(), result);
	}

	private Set<String> resolveSetterScope(SetterAssignment setter) {
		Set<String> scope = new HashSet<String>();
		addName(setter.getParameter(), scope);
		findDeclarations(setter.getBody(),scope);
		return scope;
	}

	private Set<String> resolveGetterScope(GetterAssignment getter) {
		Set<String> scope = new HashSet<String>();
		findDeclarations(getter.getBody(),scope);
		return scope;
	}

	private Set<String> resolveFunctionScope(FunctionExpression expr) {
		Set<String> scope = new HashSet<String>();
		if (expr.getIdentifier() != null)
			addName(expr.getIdentifier(),scope);
		for(Parameter param : expr.getParameters())
			addName(param.getName(),scope);
		findDeclarations(expr.getBody(),scope);
		return scope;
	}

	private void findInScope(Node node, Set<String> scope) {
		hidden.addAll(scope);
		doFindReferences(node);
		hidden.removeAll(scope);
	}
}