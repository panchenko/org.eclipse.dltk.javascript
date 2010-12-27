/*******************************************************************************
 * Copyright (c) 2000, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Dmitry Stalnov (dstalnov@fusionone.com) - contributed fix for
 *       o bug "inline method - doesn't handle implicit cast" (see
 *         https://bugs.eclipse.org/bugs/show_bug.cgi?id=24941).
 *       o inline call that is used in a field initializer
 *         (see https://bugs.eclipse.org/bugs/show_bug.cgi?id=38137)
 *       o inline call a field initializer: could detect self reference
 *         (see https://bugs.eclipse.org/bugs/show_bug.cgi?id=44417)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.corext.refactoring.code;

import java.util.List;

import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.javascript.core.dom.DomPackage;
import org.eclipse.dltk.javascript.core.dom.FunctionExpression;
import org.eclipse.dltk.javascript.core.dom.IfStatement;
import org.eclipse.dltk.javascript.core.dom.IterationStatement;
import org.eclipse.dltk.javascript.core.dom.LabeledStatement;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.ReturnStatement;
import org.eclipse.dltk.javascript.core.dom.Statement;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;


/**
 * A SourceProvider encapsulates a piece of code (source) and the logic to
 * inline it into given CallContexts.
 */
public class SourceProvider {

	//private ISourceModule fTypeRoot;
	//private IDocument fDocument;
	private FunctionExpression declaration;
	private SourceAnalyzer analyzer;
	private String code;
	private boolean mustEvalReturnedExpression;
	/*private boolean fReturnValueNeedsLocalVariable;
	private List fReturnExpressions;
	private IDocument fSource;

	private static final int EXPRESSION_MODE = 1;
	private static final int STATEMENT_MODE = 2;
	private static final int RETURN_STATEMENT_MODE = 3;
	private int fMarkerMode;*/

	public SourceProvider(FunctionExpression declaration, IMethod method) {
		//fTypeRoot = typeRoot;
		this.declaration = declaration;
		/*List parameters = fDeclaration.parameters();
		for (Iterator iter = parameters.iterator(); iter.hasNext();) {
			SingleVariableDeclaration element = (SingleVariableDeclaration) iter
					.next();
			ParameterData data = new ParameterData(element);
			element.setProperty(ParameterData.PROPERTY, data);
		}*/
		analyzer = new SourceAnalyzer(declaration, method);
		//fReturnValueNeedsLocalVariable = true;
		//fReturnExpressions = new ArrayList();
	}

	/*
	 * TODO: unit's source does not match contents of source document and
	 * declaration node.
	 * 
	 * @param typeRoot
	 *            the type root
	 * @param source
	 *            document contining the content of the type root
	 * @param declaration
	 *
	public SourceProvider(ITypeRoot typeRoot, IDocument source,
			MethodDeclaration declaration) {
		this(typeRoot, declaration);
		fSource = source;
	}*/

	public RefactoringStatus checkActivation() {
		return analyzer.checkActivation();
	}

	public void initialize() throws ModelException {
		//fDocument = fSource == null ? new Document(fTypeRoot.getBuffer()
		//		.getContents()) : fSource;
		analyzer.initialize();
		code = analyzer.getCode();
		List<Statement> list = declaration.getBody().getStatements();
		if (list.isEmpty())
			return;
		Node last = list.get(list.size()-1);
		if (last.eClass().getClassifierID() == DomPackage.RETURN_STATEMENT)
			analyzeReturn(last);
	}

	private void analyzeReturn(Node ret) {
		TreeIterator<EObject> it = ret.eAllContents();
		while(it.hasNext()) {
			Node node = (Node)it.next();
			switch(node.eClass().getClassifierID()) {
			case DomPackage.CALL_EXPRESSION:
			case DomPackage.NEW_EXPRESSION:
				mustEvalReturnedExpression = true;
				return;
			}
		}
	}

	public boolean isExecutionFlowInterrupted() {
		return analyzer.isExecutionFlowInterrupted();
	}

	/*static class VariableReferenceFinder extends ASTVisitor {
		private boolean fResult;
		private IVariableBinding fBinding;

		public VariableReferenceFinder(IVariableBinding binding) {
			fBinding = binding;
		}

		public boolean getResult() {
			return fResult;
		}

		public boolean visit(SimpleName node) {
			if (!fResult) {
				fResult = Bindings.equals(fBinding, node.resolveBinding());
			}
			return false;
		}
	}

	/**
	 * Checks whether variable is referenced by the method declaration or not.
	 * 
	 * @param binding
	 *            binding of variable to check.
	 * @return <code>true</code> if variable is referenced by the method,
	 *         otherwise <code>false</code>
	 *
	public boolean isVariableReferenced(IVariableBinding binding) {
		VariableReferenceFinder finder = new VariableReferenceFinder(binding);
		fDeclaration.accept(finder);
		return finder.getResult();
	}

	public boolean hasReturnValue() {
		IMethodBinding binding = fDeclaration.resolveBinding();
		return binding.getReturnType() != fDeclaration.getAST()
				.resolveWellKnownType("void"); //$NON-NLS-1$
	}

	// returns true if the declaration has a vararg and
	// the body contains an array access to the vararg
	public boolean hasArrayAccess() {
		return fAnalyzer.hasArrayAccess();
	}

	public boolean hasSuperMethodInvocation() {
		return fAnalyzer.hasSuperMethodInvocation();
	}*/

	public boolean mustEvaluateReturnedExpression() {
		return mustEvalReturnedExpression;
	}

	/*public boolean returnValueNeedsLocalVariable() {
		return fReturnValueNeedsLocalVariable;
	}

	public int getNumberOfStatements() {
		return fDeclaration.getBody().statements().size();
	}*/

	public boolean isSimpleFunction() {
		List<Statement> statements = declaration.getBody().getStatements();
		if (statements.size() != 1)
			return false;
		return statements.get(0) instanceof ReturnStatement;
	}

	/*public boolean isLastStatementReturn() {
		List statements = fDeclaration.getBody().statements();
		if (statements.size() == 0)
			return false;
		return statements.get(statements.size() - 1) instanceof ReturnStatement;
	}*/

	public boolean isDanglingIf() {
		List<Statement> statements = declaration.getBody().getStatements();
		if (statements.size() != 1)
			return false;

		Statement last = (Statement)statements.get(0);

		while (true) {
			switch(last.eClass().getClassifierID()) {
			case DomPackage.IF_STATEMENT:
				return ((IfStatement)last).getAlternative() == null;
			case DomPackage.BLOCK_STATEMENT:
				return false;
			case DomPackage.WHILE_STATEMENT:
			case DomPackage.FOR_STATEMENT:
			case DomPackage.FOR_IN_STATEMENT:
			case DomPackage.FOR_EACH_IN_STATEMENT:
			case DomPackage.DO_STATEMENT:
				last = ((IterationStatement)last).getBody();
				break;
			case DomPackage.LABELED_STATEMENT:
				last = ((LabeledStatement)last).getStatement();
				break;
			default:
				return false;
			}
		}
	}

	public FunctionExpression getDeclaration() {
		return declaration;
	}

	/*public String getMethodName() {
		return fDeclaration.getName().getIdentifier();
	}

	public ITypeBinding getReturnType() {
		return fDeclaration.resolveBinding().getReturnType();
	}

	public List getReturnExpressions() {
		return fReturnExpressions;
	}

	public boolean returnTypeMatchesReturnExpressions() {
		ITypeBinding returnType = getReturnType();
		for (Iterator iter = fReturnExpressions.iterator(); iter.hasNext();) {
			Expression expression = (Expression) iter.next();
			if (!Bindings.equals(returnType, expression.resolveTypeBinding()))
				return false;
		}
		return true;
	}*/

	public ParameterData getParameterData(int index) {
		return analyzer.getParameterData(index);
		/*SingleVariableDeclaration decl = (SingleVariableDeclaration) fDeclaration
				.parameters().get(index);
		return (ParameterData) decl.getProperty(ParameterData.PROPERTY);*/
	}

	/*public ITypeRoot getTypeRoot() {
		return fTypeRoot;
	}*/

	/*public boolean needsReturnedExpressionParenthesis() {
		ASTNode last = getLastStatement();
		if (last instanceof ReturnStatement) {
			return ASTNodes.needsParentheses(((ReturnStatement) last)
					.getExpression());
		}
		return false;
	}*/

	/*public boolean returnsConditionalExpression() {
		ASTNode last = getLastStatement();
		if (last instanceof ReturnStatement) {
			return ((ReturnStatement) last).getExpression() instanceof ConditionalExpression;
		}
		return false;
	}*/

	public int getReceiversToBeUpdated() {
		return analyzer.getImplicitReceiversCount();
	}

	/*public boolean isVarargs() {
		return fDeclaration.isVarargs();
	}

	public int getVarargIndex() {
		return fDeclaration.parameters().size() - 1;
	}

	public TextEdit getDeleteEdit() {
		final ASTRewrite rewriter = ASTRewrite.create(fDeclaration.getAST());
		rewriter.remove(fDeclaration, null);
		return rewriter.rewriteAST(fDocument, fTypeRoot.getJavaProject()
				.getOptions(true));
	}*/
	
	public String getCode() {
		return code;
	}
	
	private Statement getLastStatement() {
		List<Statement> statements = declaration.getBody().getStatements();
		if (statements.isEmpty())
			return null;
		return statements.get(statements.size() - 1);
	}

	/*private List getReturnStatementRanges() {
		fMarkerMode = RETURN_STATEMENT_MODE;
		List result = new ArrayList(1);
		List statements = fDeclaration.getBody().statements();
		int size = statements.size();
		if (size <= 1)
			return result;
		result.add(createRange(statements, size - 2));
		return result;
	}

	private List getStatementRanges() {
		fMarkerMode = STATEMENT_MODE;
		List result = new ArrayList(1);
		List statements = fDeclaration.getBody().statements();
		int size = statements.size();
		if (size == 0)
			return result;
		result.add(createRange(statements, size - 1));
		return result;
	}

	private List getExpressionRanges() {
		fMarkerMode = EXPRESSION_MODE;
		List result = new ArrayList(2);
		List statements = fDeclaration.getBody().statements();
		ReturnStatement rs = null;
		int size = statements.size();
		ASTNode node;
		switch (size) {
		case 0:
			return result;
		case 1:
			node = (ASTNode) statements.get(0);
			if (node.getNodeType() == ASTNode.RETURN_STATEMENT) {
				rs = (ReturnStatement) node;
			} else {
				result.add(createRange(node, node));
			}
			break;
		default: {
			node = (ASTNode) statements.get(size - 1);
			if (node.getNodeType() == ASTNode.RETURN_STATEMENT) {
				result.add(createRange(statements, size - 2));
				rs = (ReturnStatement) node;
			} else {
				result.add(createRange(statements, size - 1));
			}
			break;
		}
		}
		if (rs != null) {
			Expression exp = rs.getExpression();
			result.add(createRange(exp, exp));
		}
		return result;
	}

	private IRegion createRange(List statements, int end) {
		ASTNode first = (ASTNode) statements.get(0);
		ASTNode last = (ASTNode) statements.get(end);
		return createRange(first, last);
	}

	private IRegion createRange(ASTNode first, ASTNode last) {
		ASTNode root = first.getRoot();
		if (root instanceof CompilationUnit) {
			CompilationUnit unit = (CompilationUnit) root;
			int start = unit.getExtendedStartPosition(first);
			int length = unit.getExtendedStartPosition(last) - start
					+ unit.getExtendedLength(last);
			IRegion range = new Region(start, length);
			return range;
		} else {
			int start = first.getStartPosition();
			int length = last.getStartPosition() - start + last.getLength();
			IRegion range = new Region(start, length);
			return range;
		}
	}

	private String[] getBlocks(RangeMarker[] markers)
			throws BadLocationException {
		String[] result = new String[markers.length];
		for (int i = 0; i < markers.length; i++) {
			RangeMarker marker = markers[i];
			String content = fDocument.get(marker.getOffset(),
					marker.getLength());
			String lines[] = Strings.convertIntoLines(content);
			Strings.trimIndentation(lines, fTypeRoot.getJavaProject(), false);
			if (fMarkerMode == STATEMENT_MODE && lines.length == 2
					&& isSingleControlStatementWithoutBlock()) {
				lines[1] = CodeFormatterUtil.createIndentString(1,
						fTypeRoot.getJavaProject())
						+ lines[1];
			}
			result[i] = Strings.concatenate(lines,
					TextUtilities.getDefaultLineDelimiter(fDocument));
		}
		return result;
	}

	private boolean isSingleControlStatementWithoutBlock() {
		List statements = fDeclaration.getBody().statements();
		int size = statements.size();
		if (size != 1)
			return false;
		Statement statement = (Statement) statements.get(size - 1);
		int nodeType = statement.getNodeType();
		if (nodeType == ASTNode.IF_STATEMENT) {
			IfStatement ifStatement = (IfStatement) statement;
			return !(ifStatement.getThenStatement() instanceof Block)
					&& !(ifStatement.getElseStatement() instanceof Block);
		} else if (nodeType == ASTNode.FOR_STATEMENT) {
			return !(((ForStatement) statement).getBody() instanceof Block);
		} else if (nodeType == ASTNode.WHILE_STATEMENT) {
			return !(((WhileStatement) statement).getBody() instanceof Block);
		}
		return false;
	}*/
	
	public ISourceModule getSourceModule() {
		return analyzer.getSourceModule();
	}
}
