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

import java.util.List;
import java.util.Stack;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.internal.javascript.ti.JSDocSupport;
import org.eclipse.dltk.internal.javascript.ti.JSMethod;
import org.eclipse.dltk.internal.javascript.ti.JSVariable;
import org.eclipse.dltk.javascript.ast.AbstractNavigationVisitor;
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
import org.eclipse.dltk.javascript.structure.ArgumentNode;
import org.eclipse.dltk.javascript.structure.FunctionDeclaration;
import org.eclipse.dltk.javascript.structure.FunctionExpression;
import org.eclipse.dltk.javascript.structure.FunctionNode;
import org.eclipse.dltk.javascript.structure.IDeclaration;
import org.eclipse.dltk.javascript.structure.IParentNode;
import org.eclipse.dltk.javascript.structure.IStructureHandler;
import org.eclipse.dltk.javascript.structure.IStructureNode;
import org.eclipse.dltk.javascript.structure.IStructureVisitor;
import org.eclipse.dltk.javascript.structure.ObjectDeclaration;
import org.eclipse.dltk.javascript.structure.PropertyDeclaration;
import org.eclipse.dltk.javascript.structure.ScriptScope;
import org.eclipse.dltk.javascript.structure.VariableNode;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.ITypeChecker;
import org.eclipse.dltk.javascript.typeinfo.ReferenceSource;
import org.eclipse.dltk.javascript.typeinfo.TypeInfoManager;

public class StructureReporter3 extends
		AbstractNavigationVisitor<IStructureNode> implements IStructureVisitor {

	private final ReferenceSource referenceSource;
	private final Stack<IParentNode> parents = new Stack<IParentNode>();
	private final IStructureHandler[] handlers;

	private JSDocSupport jsdocSupport = new JSDocSupport();
	private final JSProblemReporter fReporter = null;
	private final ITypeChecker fTypeChecker = null;

	public StructureReporter3(ReferenceSource referenceSource) {
		this.referenceSource = referenceSource;
		final List<IStructureHandler> extensions = TypeInfoManager
				.createExtensions(referenceSource, IStructureHandler.class,
						this);
		this.handlers = extensions.toArray(new IStructureHandler[extensions
				.size()]);
	}

	@Override
	public IStructureNode visit(ASTNode node) {
		for (IStructureHandler handler : handlers) {
			final IStructureNode value = handler.handle(node);
			if (value != IStructureHandler.CONTINUE) {
				if (value != null) {
					if (!parents.isEmpty()) {
						// TODO skip VarDeclaration, PropertyDeclaration
						parents.peek().getScope().addNested(value);
					}
				}
				return value;
			}
		}
		final IStructureNode value = super.visit(node);
		if (value != null) {
			if (!parents.isEmpty()) {
				// TODO skip VarDeclaration, PropertyDeclaration
				parents.peek().getScope().addNested(value);
			}
		}
		return value;
	}

	protected void push(IParentNode declaration) {
		parents.push(declaration);
	}

	protected IParentNode pop() {
		return parents.pop();
	}

	public IParentNode peek() {
		return parents.peek();
	}

	@Override
	public IStructureNode visitScript(Script node) {
		push(new ScriptScope());
		// TODO visit scope declarations first?
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
					parameter != null ? parameter.getType() : null,
					ReferenceLocation.create(referenceSource, argument.start(),
							argument.end())));
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
				variable,
				declaration.getInitializer() != null ? ReferenceLocation
						.create(referenceSource, declaration.start(),
								declaration.end(), declaration.getIdentifier()
										.start(), declaration.getIdentifier()
										.end())
						: ReferenceLocation.create(referenceSource,
								declaration.start(), declaration.end()));
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
						peek(), name, pi, ReferenceLocation.create(
								referenceSource, pi.start(), pi.end(), pi
										.getName().start(), pi.getName().end()));
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
			final Identifier identifier = (Identifier) property;
			if (isCallExpression(node)) {
				peek().addMethodReference(
						identifier,
						((CallExpression) node.getParent()).getArguments()
								.size());
			} else {
				peek().addFieldReference(identifier);
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
			// if (resolved.getParent() instanceof ScriptScope) {
			// // TODO (alex) option to treat it always as local or not
			// if (resolved instanceof FunctionDeclaration) {
			// peek().addMethodReference(node);
			// } else {
			// peek().addFieldReference(name);
			// }
			// } else {
			peek().addLocalReference(node, resolved);
			// }
		} else {
			if (isCallExpression(node)) {
				peek().addMethodReference(
						node,
						((CallExpression) node.getParent()).getArguments()
								.size());
			} else {
				peek().addFieldReference(node);
			}
		}
		return null;
	}

	private boolean isCallExpression(Expression node) {
		final ASTNode parent = node.getParent();
		return parent instanceof CallExpression
				&& ((CallExpression) parent).getExpression() == node;
	}

}
