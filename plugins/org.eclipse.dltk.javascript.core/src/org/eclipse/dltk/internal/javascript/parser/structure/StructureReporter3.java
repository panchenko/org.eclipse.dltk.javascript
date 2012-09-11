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

public class StructureReporter3 extends StructureReporterBase {

	@Override
	public IStructureNode visitScript(Script node) {
		push(new ScriptScope());
		super.visitScript(node);
		return pop();
	}

	@Override
	public IStructureNode visitFunctionStatement(FunctionStatement node) {
		if (node.isDeclaration()) {
			final FunctionDeclaration declaration = new FunctionDeclaration(
					peek(), node);
			peek().addChild(declaration);
			push(declaration);
		} else {
			final FunctionExpression expression = new FunctionExpression(peek());
			peek().addChild(expression);
			push(expression);
		}
		super.visitFunctionStatement(node);
		return pop();
	}

	@Override
	protected void processVariable(VariableDeclaration declaration) {
		final Variable variable = new Variable(peek(),
				declaration.getVariableName());
		peek().addChild(variable);
		final Expression initializer = declaration.getInitializer();
		if (initializer != null) {
			push(new ValueScope(peek()));
			variable.setValue(visit(initializer));
			pop();
		}
	}

	@Override
	public IStructureNode visitObjectInitializer(ObjectInitializer node) {
		final ObjectDeclaration object = new ObjectDeclaration(peek());
		for (ObjectInitializerPart part : node.getInitializers()) {
			if (part instanceof GetMethod) {
				visitMethod((GetMethod) part);
				// TODO (alex) handle it
			} else if (part instanceof SetMethod) {
				visitMethod((SetMethod) part);
				// TODO (alex) handle it
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
					name = null;
					visit(pi.getName());
				}
				final Expression value = pi.getValue();
				push(new ValueScope(peek()));
				final IStructureNode propertyValue = visit(value);
				pop();
				if (name != null) {
					final PropertyDeclaration propertyDeclaration = new PropertyDeclaration(
							peek(), name);
					object.addChild(propertyDeclaration);
					propertyDeclaration.setValue(propertyValue);
				}
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
		final IDeclaration resolved = peek().resolve(name);
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
