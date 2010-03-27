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
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.IfStatement;
import org.eclipse.dltk.javascript.ast.ReturnStatement;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.Statement;
import org.eclipse.dltk.javascript.ast.StatementBlock;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.parser.Reporter;
import org.eclipse.osgi.util.NLS;

public class FlowValidation extends AbstractNavigationVisitor<FlowStatus>
		implements IBuildParticipant {

	private Reporter reporter;
	private FlowScope scope;

	public void build(IBuildContext context) throws CoreException {
		final Script script = JavaScriptValidations.parse(context);
		if (script == null) {
			return;
		}
		reporter = JavaScriptValidations.createReporter(context);
		scope = new FlowScope();
		visit(script);
	}

	@Override
	public FlowStatus visitReturnStatement(ReturnStatement node) {
		final FlowEndKind kind = node.getValue() != null ? FlowEndKind.RETURNS_VALUE
				: FlowEndKind.RETURNS;
		if (scope.add(kind) && scope.size() > 1) {
			reporter.setMessage(JavaScriptProblems.RETURN_INCONSISTENT,
					"return statement is inconsistent with previous usage");
			reporter.setRange(node.sourceStart(), node.sourceEnd());
			reporter.report();
		}
		final FlowStatus status = new FlowStatus();
		if (node.getValue() == null) {
			status.returnValue = true;
		} else {
			status.returnWithoutValue = true;
		}
		return status;
	}

	@Override
	public FlowStatus visitStatementBlock(StatementBlock node) {
		FlowStatus status = new FlowStatus();
		for (Statement statement : node.getStatements()) {
			if (status.isReturned()) {
				reporter.setMessage(JavaScriptProblems.UNREACHABLE_CODE,
						"uneachable code");
				reporter.setRange(statement.sourceStart(), statement
						.sourceEnd());
				reporter.report();
			}
			status.add(visit(statement));
		}
		return status;
	}

	@Override
	public FlowStatus visitIfStatement(IfStatement node) {
		FlowStatus status = new FlowStatus();
		if (node.getThenStatement() != null) {
			status.add(visit(node.getThenStatement()));
		}
		if (node.getElseStatement() != null) {
			status.add(visit(node.getElseStatement()));
		}
		return status;
	}

	@Override
	public FlowStatus visitFunctionStatement(FunctionStatement node) {
		final FlowScope savedScope = scope;
		scope = new FlowScope();
		try {
			final FlowStatus result = super.visitFunctionStatement(node);
			if (scope.contains(FlowEndKind.RETURNS_VALUE)
					&& (scope.contains(FlowEndKind.RETURNS) || result.noReturn)) {
				reporter
						.setMessage(
								JavaScriptProblems.FUNCTION_NOT_ALWAYS_RETURN_VALUE,
								node.getName() != null ? NLS
										.bind(
												"function {0} does not always return a value",
												node.getName().getName())
										: "anonymous function does not always return a value");
				reporter.setRange(node.getBody().getRC(), node.getBody()
						.getRC() + 1);
				reporter.report();
			}
			return result;
		} finally {
			scope = savedScope;
		}
	}
}
