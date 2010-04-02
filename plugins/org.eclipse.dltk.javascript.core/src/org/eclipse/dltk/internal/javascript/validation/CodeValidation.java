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
package org.eclipse.dltk.internal.javascript.validation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.core.builder.IBuildContext;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.javascript.ast.BinaryOperation;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.GetArrayItemExpression;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.UnaryOperation;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.parser.JSParser;
import org.eclipse.dltk.javascript.parser.Reporter;

public class CodeValidation extends AbstractNavigationVisitor<Object> implements
		IBuildParticipant {
	private Reporter reporter;

	public void build(IBuildContext context) throws CoreException {
		final Script script = JavaScriptValidations.parse(context);
		if (script == null) {
			return;
		}
		reporter = JavaScriptValidations.createReporter(context);
		visit(script);
	}

	@Override
	protected void visitCondition(Expression condition) {
		super.visitCondition(condition);
		if (condition instanceof BinaryOperation) {
			BinaryOperation operation = (BinaryOperation) condition;
			if (operation.getOperation() == JSParser.ASSIGN) {
				reporter.reportProblem(JavaScriptProblems.EQUAL_AS_ASSIGN,
						"Test for equality (==) mistyped as assignment (=)?",
						condition.sourceStart(), condition.sourceEnd());
			}
		}
	}

	@Override
	public Object visitBinaryOperation(BinaryOperation node) {
		if (node.getOperation() == JSParser.ASSIGN
				&& !canAssignTo(node.getLeftExpression())) {
			reporter.reportProblem(JavaScriptProblems.INVALID_ASSIGN_LEFT,
					"Invalid assignment left-hand side.", node.sourceStart(),
					node.sourceEnd());
		}
		return super.visitBinaryOperation(node);
	}

	@Override
	public Object visitUnaryOperation(UnaryOperation node) {
		if (isIncDec(node.getOperation()) && !canAssignTo(node.getExpression())) {
			reporter.reportProblem(JavaScriptProblems.INVALID_ASSIGN_LEFT,
					"Invalid assignment left-hand side.", node.sourceStart(),
					node.sourceEnd());
		}
		return super.visitUnaryOperation(node);
	}

	private boolean isIncDec(int operation) {
		return operation == JSParser.INC || operation == JSParser.DEC
				|| operation == JSParser.PINC || operation == JSParser.PDEC;
	}

	private boolean canAssignTo(Expression expression) {
		// TODO what else? XML?
		return expression instanceof Identifier
				|| expression instanceof PropertyExpression
				|| expression instanceof GetArrayItemExpression;
	}
}
