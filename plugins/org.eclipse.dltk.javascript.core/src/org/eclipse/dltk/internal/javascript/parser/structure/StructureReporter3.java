/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.internal.javascript.ti.JSDocSupport;
import org.eclipse.dltk.internal.javascript.ti.JSMethod;
import org.eclipse.dltk.internal.javascript.ti.JSVariable;
import org.eclipse.dltk.javascript.ast.Argument;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.DecimalLiteral;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.GetMethod;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.ObjectInitializer;
import org.eclipse.dltk.javascript.ast.ObjectInitializerPart;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.PropertyInitializer;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.SetMethod;
import org.eclipse.dltk.javascript.ast.StringLiteral;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.parser.JSProblemReporter;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.ITypeChecker;
import org.eclipse.dltk.javascript.typeinfo.ReferenceSource;

@Structure3
public class StructureReporter3 extends StructureReporterBase {

	private JSDocSupport jsdocSupport = new JSDocSupport();
	private final JSProblemReporter fReporter = null;
	private final ITypeChecker fTypeChecker = null;

	@Override
	public IStructureNode visitScript(Script node) {
		push(new ScriptScope());
		// TODO visit scope declarations?
		super.visitScript(node);
		return pop();
	}

	@Override
	public IStructureNode visitFunctionStatement(FunctionStatement node) {
		final JSMethod method = new JSMethod(node, ReferenceSource.UNKNOWN);
		jsdocSupport.processMethod(node, method, fReporter, fTypeChecker);
		final FunctionNode functionNode;
		if (node.isDeclaration()) {
			functionNode = new FunctionDeclaration(peek(), node, method);
		} else {
			functionNode = new FunctionExpression(peek(), node, method);
		}
		for (Argument argument : node.getArguments()) {
			final String name = argument.getArgumentName();
			final IParameter parameter = method.getParameter(name);
			functionNode.addChild(new ArgumentNode(functionNode, name,
					parameter != null ? parameter.getType() : null));
		}
		peek().getScope().addChild(functionNode);
		push(functionNode);
		// TODO visit scope declarations?
		super.visitFunctionStatement(node);
		return pop();
	}

	@Override
	protected void processVariable(VariableDeclaration declaration) {
		final JSVariable variable = new JSVariable(
				declaration.getVariableName());
		jsdocSupport.processVariable(declaration, variable, fReporter,
				fTypeChecker);
		final VariableNode variableNode = new VariableNode(peek(), declaration,
				variable.getType());
		peek().getScope().addChild(variableNode);
		final Expression initializer = declaration.getInitializer();
		if (initializer != null) {
			push(variableNode);
			variableNode.setValue(visit(initializer));
			pop();
		}
	}

	@Override
	public IStructureNode visitObjectInitializer(ObjectInitializer node) {
		final ObjectDeclaration object = new ObjectDeclaration(peek());
		for (ObjectInitializerPart part : node.getInitializers()) {
			if (part instanceof GetMethod) {
				visitMethod((GetMethod) part);
				// TODO (alex) handle GetMethod
			} else if (part instanceof SetMethod) {
				visitMethod((SetMethod) part);
				// TODO (alex) handle SetMethod
			} else if (part instanceof PropertyInitializer) {
				final PropertyInitializer pi = (PropertyInitializer) part;
				final String name;
				if (pi.getName() instanceof Identifier) {
					name = ((Identifier) pi.getName()).getName();
				} else if (pi.getName() instanceof StringLiteral) {
					name = ((StringLiteral) pi.getName()).getValue();
				} else if (pi.getName() instanceof DecimalLiteral) {
					name = ((DecimalLiteral) pi.getName()).getText();
				} else {
					name = "";
					visit(pi.getName());
				}
				final PropertyDeclaration propertyDeclaration = new PropertyDeclaration(
						peek(), name);
				object.addChild(propertyDeclaration);
				push(propertyDeclaration);
				propertyDeclaration.setValue(visit(pi.getValue()));
				pop();
			}
		}
		return object;
	}

	@Override
	public IStructureNode visitPropertyExpression(PropertyExpression node) {
		visit(node.getObject());
		final Expression property = node.getProperty();
		if (property instanceof Identifier) {
			final String name = ((Identifier) property).getName();
			if (node.getParent() instanceof CallExpression) {
				peek().addMethodReference(name);
			} else {
				peek().addFieldReference(name);
			}
		} else {
			visit(property);
		}
		return null;
	}

	@Override
	public IStructureNode visitIdentifier(Identifier node) {
		final String name = node.getName();
		final IDeclaration resolved = peek().getScope().resolve(name);
		if (resolved != null) {
			peek().addLocalReference(node, resolved);
		} else {
			if (node.getParent() instanceof CallExpression) {
				peek().addMethodReference(name);
			} else {
				peek().addFieldReference(name);
			}
		}
		return null;
	}

}
