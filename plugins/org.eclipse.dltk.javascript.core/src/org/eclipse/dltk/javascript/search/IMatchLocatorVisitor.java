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
package org.eclipse.dltk.javascript.search;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.INodeVisitor;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public interface IMatchLocatorVisitor extends INodeVisitor<IMatchLocatorValue> {

	void acceptTypeReference(ASTNode node, String typeName);

	void acceptTypeReference(ASTNode node, JSType type);

	void addFieldDeclaration(Expression identifier, JSType type);

	void addFunctionDeclaration(Expression identifier,
			FunctionStatement function, IMethod method);

	void visitFunctionBody(FunctionStatement function);

}
