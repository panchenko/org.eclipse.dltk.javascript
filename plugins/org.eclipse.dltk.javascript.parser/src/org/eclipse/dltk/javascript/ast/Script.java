/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladimir Belov)
 *******************************************************************************/
package org.eclipse.dltk.javascript.ast;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.parser.IModuleDeclaration;
import org.eclipse.dltk.javascript.internal.parser.JSLiterals;

public class Script extends ASTNode implements ISourceable, IModuleDeclaration {

	private final List<Comment> comments = new ArrayList<Comment>();
	private final List<Statement> statements = new ArrayList<Statement>();

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() == 0);
		Assert.isTrue(sourceEnd() > 0);

		StringBuffer buffer = new StringBuffer();

		for (Statement statement : statements) {
			buffer.append(statement.toSourceString(indentationString));
		}

		return buffer.toString();
	}

	public List<Comment> getComments() {
		return this.comments;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public List<Statement> getStatements() {
		return statements;
	}

	public void addStatement(Statement statement) {
		statements.add(statement);
	}

	public <E> void visitAll(ASTVisitor<E> visitor) {
		for (Statement statement : statements) {
			visitor.visit(statement);
		}
	}

	@Override
	public String toString() {
		return toSourceString(JSLiterals.EMPTY);
	}

	@Override
	public void traverse(org.eclipse.dltk.ast.ASTVisitor visitor)
			throws Exception {
		if (visitor.visit(this)) {
			for (Statement statement : statements) {
				statement.traverse(visitor);
			}
			visitor.endvisit(this);
		}
	}
}
