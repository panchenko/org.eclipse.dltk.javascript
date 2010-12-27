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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow.VariableBinding;
import org.eclipse.dltk.javascript.core.dom.AccessorAssignment;
import org.eclipse.dltk.javascript.core.dom.CatchClause;
import org.eclipse.dltk.javascript.core.dom.DomPackage;
import org.eclipse.dltk.javascript.core.dom.ExpressionStatement;
import org.eclipse.dltk.javascript.core.dom.FunctionExpression;
import org.eclipse.dltk.javascript.core.dom.GetterAssignment;
import org.eclipse.dltk.javascript.core.dom.Identifier;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.Parameter;
import org.eclipse.dltk.javascript.core.dom.SetterAssignment;
import org.eclipse.dltk.javascript.core.dom.Source;
import org.eclipse.dltk.javascript.core.dom.Type;
import org.eclipse.dltk.javascript.core.dom.VariableDeclaration;
import org.eclipse.dltk.javascript.core.dom.VariableReference;
import org.eclipse.dltk.javascript.core.dom.util.DomSwitch;
import org.eclipse.emf.ecore.EObject;

public abstract class VariableLookup extends DomSwitch<Boolean> {
	private Map<String,List<Identifier>> decls = new HashMap<String,List<Identifier>>();
	private Set<String> scope = new HashSet<String>();
	
	protected abstract void reportDeclaration(Identifier decl);
	protected abstract void reportReference(Identifier ref,Identifier decl);
	
	public final void traverse(Node node) {
		if (doSwitch(node) == null)
			for(EObject obj : node.eContents())
				traverse((Node)obj);
	}
	
	private void addDeclaration(Identifier id) {
		if (scope.contains(id.getName())) {
			List<Identifier> list = decls.get(id.getName());
			reportReference(id, list.get(list.size()-1));
			return;
		}
		reportDeclaration(id);
		List<Identifier> list = decls.get(id.getName());
		if (list == null) {
			list = new ArrayList<Identifier>();
			decls.put(id.getName(), list);
		}
		list.add(id);
		scope.add(id.getName());
	}
	
	private void popScope(Set<String> outerScope) {
		for(String str : scope) {
			List<Identifier> list = decls.get(str);
			list.remove(list.size()-1);
		}
		scope = outerScope;
	}
	
	protected final void findDeclarations(Node node) {
		switch(node.eClass().getClassifierID()) {
		case DomPackage.EXPRESSION_STATEMENT:
			ExpressionStatement stmt = (ExpressionStatement)node;
			if (stmt.getExpression() instanceof FunctionExpression) {
				Identifier id = ((FunctionExpression)stmt.getExpression()).getIdentifier();
				if (id != null)
					addDeclaration(id);
				return;
			}
			break;
		case DomPackage.FUNCTION_EXPRESSION:
			return;
		case DomPackage.VARIABLE_DECLARATION:
			addDeclaration(((VariableDeclaration)node).getIdentifier());
			break;
		}
		for(EObject obj : node.eContents())
			findDeclarations((Node)obj);
	}
	
	private Set<String> pushScope() {
		Set<String> outerScope = scope;
		scope = new HashSet<String>();
		return outerScope;
	}

	@Override
	public Boolean caseVariableReference(VariableReference node) {
		Identifier id = node.getVariable();
		List<Identifier> list = decls.get(id.getName());
		if (list == null || list.size() == 0)
			reportReference(id, null);
		else
			reportReference(id, list.get(list.size()-1));
		return true;
	}
	@Override
	public Boolean caseGetterAssignment(GetterAssignment node) {
		Set<String> outerScope = pushScope();
		findDeclarations(node.getBody());
		traverse(node.getBody());
		popScope(outerScope);
		return true;
	}
	@Override
	public Boolean caseSetterAssignment(SetterAssignment node) {
		Set<String> outerScope = pushScope();
		addDeclaration(node.getParameter());
		findDeclarations(node.getBody());
		traverse(node.getBody());
		popScope(outerScope);
		return true;
	}
	@Override
	public Boolean caseCatchClause(CatchClause node) {
		Set<String> outerScope = pushScope();
		addDeclaration(node.getException());
		traverse(node.getBody());
		popScope(outerScope);
		return true;
	}
	@Override
	public Boolean caseFunctionExpression(FunctionExpression node) {
		Set<String> outerScope = pushScope();
		if (node.getIdentifier() != null && !(node.eContainer() instanceof ExpressionStatement))
			addDeclaration(node.getIdentifier());
		for(Parameter param : node.getParameters())
			addDeclaration(param.getName());
		findDeclarations(node.getBody());
		traverse(node.getBody());
		popScope(outerScope);
		return true;
	}
	@Override
	public Boolean caseSource(Source node) {
		Set<String> outerScope = pushScope();
		findDeclarations(node);
		for (EObject obj : node.getStatements())
			traverse((Node)obj);
		popScope(outerScope);
		return true;
	}
	public static Set<String> getVisibleNames(Node node) {
		final Set<String> result = new HashSet<String>();
		final Boolean[] reportDecls = new Boolean[]{true};
		VariableLookup lookup = new VariableLookup() {
			@Override
			protected void reportDeclaration(Identifier decl) {
				if (reportDecls[0])
					result.add(decl.getName());
			}
			@Override
			protected void reportReference(Identifier ref, Identifier decl) {
				if (decl == null)
					result.add(ref.getName());
			}
		};
		Node body = null;
		while (body == null) {
			node = (Node)node.eContainer();
			switch(node.eClass().getClassifierID()) {
			case DomPackage.FUNCTION_EXPRESSION:
				body = ((FunctionExpression)node).getBody();
				break;
			case DomPackage.GETTER_ASSIGNMENT:
			case DomPackage.SETTER_ASSIGNMENT:
				body = ((AccessorAssignment)node).getBody();
			case DomPackage.SOURCE:
				body = node;
				break;
			}
		}
		lookup.findDeclarations(body);
		reportDecls[0] = false;
		lookup.traverse(node);
		return result;
	}
	
	public static List<Identifier> findReferences(Node root, Set<String> names) {
		return findReferences(root,names,false);
	}
	
	public static List<Identifier> findReferences(Node root, Set<String> names,
			final boolean firstOnly) {
		final Set<String> wanted;
		if (firstOnly) {
			wanted = new HashSet<String>();
			wanted.addAll(names);
		} else
			wanted = names;
		final List<Identifier> refs = new ArrayList<Identifier>();
		VariableLookup lookup =  new VariableLookup() {
			@Override
			protected void reportDeclaration(Identifier decl) {
				// do nothing
			}

			@Override
			protected void reportReference(Identifier ref, Identifier decl) {
				if (decl != null)
					return;
				String str = ref.getName();
				if (wanted.contains(str)) {
					refs.add(ref);
					if (firstOnly)
						wanted.remove(str);
				}
			}
		};
		lookup.traverse(root);
		return refs;
	}
	public static Map<Identifier, VariableBinding> findBindings(Node node) {
		final Map<Identifier, VariableBinding> bindings = new HashMap<Identifier, VariableBinding>();
		VariableLookup lookup = new VariableLookup(){
			@Override
			protected void reportDeclaration(Identifier decl) {
				Node parent = (Node)decl.eContainer();
				Type type = null;
				switch (parent.eClass().getClassifierID()) {
				case DomPackage.VARIABLE_DECLARATION:
					type = ((VariableDeclaration)parent).getType();
					break;
				case DomPackage.PARAMETER:
					type = ((Parameter)parent).getType();
					break;
				}
				String typeName = type == null ? null : type.getName();
				bindings.put(decl, new VariableBinding(decl.getName(), bindings.size(), decl, typeName));
			}
			@Override
			protected void reportReference(Identifier ref, Identifier decl) {
				if (decl != null)
					bindings.put(ref, bindings.get(decl));
			}
		};
		lookup.traverse(node);
		return bindings;
	}
}
