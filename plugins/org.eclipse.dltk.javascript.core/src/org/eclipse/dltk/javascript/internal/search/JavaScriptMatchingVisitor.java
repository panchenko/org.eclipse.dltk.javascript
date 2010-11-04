/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.search;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Stack;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.core.search.matching2.MatchingCollector;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.internal.javascript.ti.JSMethod;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;

public class JavaScriptMatchingVisitor extends TypeInferencerVisitor {

	private final MatchingCollector<MatchingNode> locator;

	/**
	 * @param context
	 */
	public JavaScriptMatchingVisitor(ITypeInferenceContext context,
			MatchingCollector<MatchingNode> locator) {
		super(context);
		this.locator = locator;
	}

	private static enum VisitorMode {
		NORMAL, CALL
	}

	private final Map<ASTNode, VisitorMode> modes = new IdentityHashMap<ASTNode, VisitorMode>();

	private final Stack<ASTNode> visitStack = new Stack<ASTNode>();

	@Override
	public IValueReference visit(ASTNode node) {
		visitStack.push(node);
		try {
			return super.visit(node);
		} finally {
			visitStack.pop();
		}
	}

	private VisitorMode currentMode() {
		final VisitorMode mode = modes.get(visitStack.peek());
		return mode != null ? mode : VisitorMode.NORMAL;
	}

	@Override
	public IValueReference visitCallExpression(CallExpression node) {
		final ASTNode expression = node.getExpression();
		modes.put(expression, VisitorMode.CALL);
		final IValueReference reference = visit(expression);
		modes.remove(expression);
		for (ASTNode argument : node.getArguments()) {
			visit(argument);
		}
		if (reference != null) {
			return reference.getChild(IValueReference.FUNCTION_OP);
		} else {
			return null;
		}
	}

	@Override
	public IValueReference visitIdentifier(Identifier node) {
		final IValueReference result = peekContext().getChild(node.getName());
		if (result != null && result.getKind().isLocal() && inFunction()) {
			locator.report(new LocalVariableReferenceNode(node, result
					.getLocation()));
		} else if (currentMode() == VisitorMode.CALL) {
			locator.report(new MethodReferenceNode(node));
		} else {
			locator.report(new FieldReferenceNode(node));
		}
		return result;
	}

	@Override
	public IValueReference visitPropertyExpression(PropertyExpression node) {
		final IValueReference object = visit(node.getObject());
		final Expression property = node.getProperty();
		if (property instanceof Identifier) {
			final Identifier prop = (Identifier) property;
			if (currentMode() == VisitorMode.CALL) {
				locator.report(new MethodReferenceNode(prop));
			} else {
				locator.report(new FieldReferenceNode(prop));
			}
		}
		return extractNamedChild(object, property);
	}

	@Override
	protected IValueReference createVariable(IValueCollection context,
			VariableDeclaration declaration) {
		final IValueReference result = super.createVariable(context,
				declaration);
		if (inFunction()) {
			locator.report(new LocalVariableDeclarationNode(declaration
					.getIdentifier(), getSource().getSourceModule(), result
					.getDeclaredType()));
		} else {
			locator.report(new FieldDeclarationNode(
					declaration.getIdentifier(), result.getDeclaredType()));
		}
		return result;
	}

	@Override
	public IValueReference visitFunctionStatement(FunctionStatement node) {
		final IValueReference result = super.visitFunctionStatement(node);
		Identifier name = node.getName();
		if (name != null) {
			IMethod method = (JSMethod) result
					.getAttribute(IReferenceAttributes.PARAMETERS);
			locator.report(new MethodDeclarationNode(name, method));
		}
		return result;
	}

}
