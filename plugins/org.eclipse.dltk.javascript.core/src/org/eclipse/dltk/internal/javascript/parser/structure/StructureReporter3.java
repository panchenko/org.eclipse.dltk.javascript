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
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.ObjectInitializer;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.Script;
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
		push(new FunctionScope(node));
		super.visitFunctionStatement(node);
		return pop();
	}

	@Override
	protected void processVariable(VariableDeclaration declaration) {
		final Variable variable = new Variable(declaration);
		peek().add(variable);
		push(variable);
		super.processVariable(declaration);
		pop();
	}

	@Override
	public IStructureNode visitObjectInitializer(ObjectInitializer node) {
		push(new ObjectDeclaration());
		super.visitObjectInitializer(node);
		return pop();
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
