/*******************************************************************************
 * Copyright (c) 2000, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Dmitry Stalnov (dstalnov@fusionone.com) - contributed fixes for:
 *       o bug "inline method - doesn't handle implicit cast" (see
 *         https://bugs.eclipse.org/bugs/show_bug.cgi?id=24941).
 *       o bug inline method: compile error (array related)
 *         (see https://bugs.eclipse.org/bugs/show_bug.cgi?id=38471)
 *       o inline call that is used in a field initializer
 *         (see https://bugs.eclipse.org/bugs/show_bug.cgi?id=38137)
 *       o inline call a field initializer: could detect self reference
 *         (see https://bugs.eclipse.org/bugs/show_bug.cgi?id=44417)
 *       o Allow 'this' constructor to be inlined
 *         (see https://bugs.eclipse.org/bugs/show_bug.cgi?id=38093)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.corext.refactoring.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.SourceRange;
import org.eclipse.dltk.internal.corext.refactoring.base.ScriptStatusContext;
import org.eclipse.dltk.internal.javascript.core.manipulation.JavascriptManipulationPlugin;
import org.eclipse.dltk.internal.javascript.corext.refactoring.RefactoringCoreMessages;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow.FlowContext;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow.FlowInfo;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow.InputFlowAnalyzer;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow.VariableBinding;
import org.eclipse.dltk.internal.javascript.corext.refactoring.util.Selection;
import org.eclipse.dltk.javascript.core.dom.BinaryExpression;
import org.eclipse.dltk.javascript.core.dom.BinaryOperator;
import org.eclipse.dltk.javascript.core.dom.BlockStatement;
import org.eclipse.dltk.javascript.core.dom.CallExpression;
import org.eclipse.dltk.javascript.core.dom.DomFactory;
import org.eclipse.dltk.javascript.core.dom.DomPackage;
import org.eclipse.dltk.javascript.core.dom.Expression;
import org.eclipse.dltk.javascript.core.dom.ExpressionStatement;
import org.eclipse.dltk.javascript.core.dom.FunctionExpression;
import org.eclipse.dltk.javascript.core.dom.Identifier;
import org.eclipse.dltk.javascript.core.dom.IfStatement;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.ParenthesizedExpression;
import org.eclipse.dltk.javascript.core.dom.ReturnStatement;
import org.eclipse.dltk.javascript.core.dom.Statement;
import org.eclipse.dltk.javascript.core.dom.UnaryExpression;
import org.eclipse.dltk.javascript.core.dom.VariableDeclaration;
import org.eclipse.dltk.javascript.core.dom.VariableReference;
import org.eclipse.dltk.javascript.core.dom.VariableStatement;
import org.eclipse.dltk.javascript.core.dom.rewrite.RefactoringUtils;
import org.eclipse.dltk.javascript.core.dom.rewrite.VariableLookup;
import org.eclipse.dltk.javascript.core.dom.util.DomSwitch;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.RefactoringStatusEntry;

public class CallInliner {

	private ISourceModule cu;
	//private ASTRewrite fRewrite;
	//private ImportRewrite fImportRewrite;
	private SourceProvider sourceProvider;
	//private TypeEnvironment fTypeEnvironment;

	private Node bodyDeclaration;
	//private CodeScopeBuilder.Scope fRootScope;
	//private int fNumberOfLocals;

	private CallExpression invocation;

	/*private int fInsertionIndex;
	private ListRewrite fListRewrite;

	private boolean fNeedsStatement;*/
	private Node targetNode;
	private FlowContext flowContext;
	private FlowInfo flowInfo;
	private Map<Identifier,VariableBinding> bindings;
	private Expression[] realArguments;
	//private CodeScopeBuilder.Scope invocationScope;
	//private boolean fFieldInitializer;
	private Set<String> usedNames;
	private List<String> locals;
	private List<Expression> localInitializers;
	private Expression receiverExpr; 
	//private CallContext fContext;

	private class InlineEvaluator extends DomSwitch<Boolean> {
		private ParameterData formalArgument;
		private boolean result;
		public InlineEvaluator(ParameterData argument) {
			formalArgument= argument;
		}
		public boolean getResult() {
			return result;
		}
		public void traverse(Node node) {
			int accessMode= formalArgument.getSimplifiedAccessMode();
			switch(node.eClass().getClassifierID()) {
			case DomPackage.VARIABLE_REFERENCE:
				VariableBinding binding = bindings.get(((VariableReference)node).getVariable());
				result = accessMode == FlowInfo.READ || accessMode == FlowInfo.UNUSED
					|| flowInfo.hasAccessMode(flowContext, binding, FlowInfo.UNUSED | FlowInfo.WRITE);
			case DomPackage.BOOLEAN_LITERAL:
			case DomPackage.NULL_LITERAL:
			case DomPackage.NUMERIC_LITERAL:
			case DomPackage.REGULAR_EXPRESSION_LITERAL:
			case DomPackage.STRING_LITERAL:
			case DomPackage.THIS_EXPRESSION:
				result = accessMode != FlowInfo.WRITE;
				break;
			case DomPackage.PARENTHESIZED_EXPRESSION:
				traverse(((ParenthesizedExpression)node).getEnclosed());
				break;
			case DomPackage.PROPERTY_ACCESS_EXPRESSION:
			case DomPackage.ARRAY_ACCESS_EXPRESSION:
				result = accessMode == FlowInfo.UNUSED || accessMode == FlowInfo.READ && formalArgument.getNumberOfAccesses() <= 1;
				result = result && !formalArgument.isFunction();
				break;
			default:
				result = accessMode == FlowInfo.UNUSED || accessMode == FlowInfo.READ && formalArgument.getNumberOfAccesses() <= 1;
			}
		}
	}

	/*private static class AmbiguousMethodAnalyzer implements TypeBindingVisitor {
		private TypeEnvironment fTypeEnvironment;
		private TType[] fTypes;
		private IMethodBinding fOriginal;

		public AmbiguousMethodAnalyzer(TypeEnvironment typeEnvironment, IMethodBinding original, TType[] types) {
			fTypeEnvironment= typeEnvironment;
			fOriginal= original;
			fTypes= types;
		}
		public boolean visit(ITypeBinding node) {
			IMethodBinding[] methods= node.getDeclaredMethods();
			for (int i= 0; i < methods.length; i++) {
				IMethodBinding candidate= methods[i];
				if (candidate == fOriginal) {
					continue;
				}
				if (fOriginal.getName().equals(candidate.getName())) {
					if (canImplicitlyCall(candidate)) {
						return false;
					}
				}
			}
			return true;
		}
		/**
		 * Returns <code>true</code> if the method can be called without explicit casts;
		 * otherwise <code>false</code>.
		 * @param candidate the method to test
		 * @return <code>true</code> if the method can be called without explicit casts
		 *
		private boolean canImplicitlyCall(IMethodBinding candidate) {
			ITypeBinding[] parameters= candidate.getParameterTypes();
			if (parameters.length != fTypes.length) {
				return false;
			}
			for (int i= 0; i < parameters.length; i++) {
				if (!fTypes[i].canAssignTo(fTypeEnvironment.create(parameters[i]))) {
					return false;
				}
			}
			return true;
		}
	}*/

	public CallInliner(ISourceModule cu, SourceProvider provider) throws CoreException {
		this.cu = cu;
		sourceProvider= provider;
		//fImportRewrite= StubUtility.createImportRewrite(targetAstRoot, true);
		/*fRewrite= ASTRewrite.create(targetAstRoot.getAST());
		fRewrite.setTargetSourceRangeComputer(new NoCommentSourceRangeComputer());
		fTypeEnvironment= new TypeEnvironment();*/
	}

	/*public ImportRewrite getImportEdit() {
		return fImportRewrite;
	}

	public ASTNode getTargetNode() {
		return fTargetNode;
	}*/

	public void initialize(Node declaration) {
		bodyDeclaration= declaration;
		bindings = VariableLookup.findBindings(declaration);
		/*fRootScope= CodeScopeBuilder.perform(declaration, fSourceProvider.getDeclaration().resolveBinding());
		fNumberOfLocals= 0;
		switch (declaration.getNodeType()) {
			case ASTNode.METHOD_DECLARATION:
			case ASTNode.INITIALIZER:
				fNumberOfLocals= LocalVariableIndex.perform(declaration);
				break;
		}*/
	}

	public RefactoringStatus initialize(CallExpression invocation, int severity) {
		RefactoringStatus result= new RefactoringStatus();
		this.invocation= invocation;
		locals = new ArrayList<String>();
		localInitializers = new ArrayList<Expression>(); 

		//checkMethodDeclaration(result, severity);
		//if (result.getSeverity() >= severity)
		//	return result;

		//initializeRewriteState();
		initializeTargetNode();
		flowAnalysis();

		//context= new CallContext(invocation, invocationScope, targetNode.getNodeType(), importRewrite);

		try {
			computeRealArguments();
			computeReceiver();
		} catch (ModelException exception) {
			JavascriptManipulationPlugin.log(exception);
		}
		checkInvocationContext(result, severity);

		return result;
	}

	/*private void initializeRewriteState() {
		fFieldInitializer= false;
		ASTNode parent= fInvocation.getParent();
		do {
			if (parent instanceof FieldDeclaration) {
				fFieldInitializer= true;
				return;
			} else if (parent instanceof Block) {
				return;
			}
			parent= parent.getParent();
		} while (parent != null);
	}*/

	private void initializeTargetNode() {
		Node parent= (Node)invocation.eContainer();
		int nodeType= parent.eClass().getClassifierID();
		if (nodeType == DomPackage.EXPRESSION_STATEMENT || nodeType == DomPackage.RETURN_STATEMENT) {
			targetNode= parent;
		} else {
			targetNode= invocation;
		}
	}

	// the checks depend on invocation context and therefore can't be done in SourceAnalyzer
	//private void checkMethodDeclaration(RefactoringStatus result, int severity) {
	//	FunctionExpression methodDeclaration= sourceProvider.getDeclaration();
		/*if (fSourceProvider.hasSuperMethodInvocation() && fInvocation.getNodeType() == ASTNode.METHOD_INVOCATION) {
			Expression receiver= ((MethodInvocation)fInvocation).getExpression();
			if (receiver instanceof ThisExpression) {
				result.addEntry(new RefactoringStatusEntry(
					severity,
					RefactoringCoreMessages.CallInliner_super_into_this_expression,
					JavaStatusContext.create(fCUnit, fInvocation)));
			}
		}*/
	//}

	private void checkInvocationContext(RefactoringStatus result, int severity) {
		//Expression exp= getReceiver(invocation);
		//if (exp != null && exp.resolveTypeBinding() == null) {
		//	addEntry(result, RefactoringCoreMessages.CallInliner_receiver_type,
		//		RefactoringStatusCodes.INLINE_METHOD_NULL_BINDING, severity);
		//	return;
		//}
		int nodeType= targetNode.eClass().getClassifierID();
		if (nodeType == DomPackage.EXPRESSION_STATEMENT) {
			if (sourceProvider.isExecutionFlowInterrupted()) {
				addEntry(result, RefactoringCoreMessages.CallInliner_execution_flow, severity);
				return;
			}
		} else if (nodeType == DomPackage.CALL_EXPRESSION) {
			Node parent= (Node)targetNode.eContainer();
			int parentType = parent.eClass().getClassifierID();
			if (parentType == DomPackage.RETURN_STATEMENT) {
				//support inlining even if the execution flow is interrupted
				return;
			}
			if (sourceProvider.isExecutionFlowInterrupted()) {
				addEntry(result, RefactoringCoreMessages.CallInliner_execution_flow, severity);
				return;
			}
			if (parentType == DomPackage.BINARY_EXPRESSION && RefactoringUtils.isAssignment(((BinaryExpression)parent).getOperation())
					&& parent.eContainer().eClass().getClassifierID() == DomPackage.EXPRESSION_STATEMENT) {
				// we support inlining expression in assigment and initializers as
				// long as the execution flow isn't interrupted.
				return;
			}
			if (parentType == DomPackage.VARIABLE_DECLARATION) {
				VariableDeclaration decl = (VariableDeclaration)parent;
				VariableStatement stmt = (VariableStatement)decl.eContainer();
				if (stmt.getDeclarations().get(0) == decl)
					return;
			}
			//boolean isFieldDeclaration= ASTNodes.getParent(invocation, FieldDeclaration.class) != null;
			if (!sourceProvider.isSimpleFunction()) {
				if (isMultiDeclarationFragment(parent)) {
					addEntry(result, RefactoringCoreMessages.CallInliner_multiDeclaration, severity);
				/*} else if (isFieldDeclaration) {
					addEntry(result,
						RefactoringCoreMessages.CallInliner_field_initializer_simple,
						RefactoringStatusCodes.INLINE_METHOD_FIELD_INITIALIZER, severity);*/
				} else {
					addEntry(result, RefactoringCoreMessages.CallInliner_simple_functions, severity);
				}
				return;
			}
			/*if (isFieldDeclaration) {
				int argumentsCount= fContext.arguments.length;
				for (int i= 0; i < argumentsCount; i++) {
					ParameterData parameter= fSourceProvider.getParameterData(i);
					if(parameter.isWrite()) {
						addEntry(result,
							RefactoringCoreMessages.CallInliner_field_initialize_write_parameter,
							RefactoringStatusCodes.INLINE_METHOD_FIELD_INITIALIZER, severity);
						return;
					}
				}
				if(fLocals.size() > 0) {
					addEntry(result,
						RefactoringCoreMessages.CallInliner_field_initialize_new_local,
						RefactoringStatusCodes.INLINE_METHOD_FIELD_INITIALIZER, severity);
					return;
				}
				// verify that the field is not referenced by the initializer method
				VariableDeclarationFragment variable= (VariableDeclarationFragment)ASTNodes.getParent(fInvocation, ASTNode.VARIABLE_DECLARATION_FRAGMENT);
				if(fSourceProvider.isVariableReferenced(variable.resolveBinding())) {
					addEntry(result,
						RefactoringCoreMessages.CallInliner_field_initialize_self_reference,
						RefactoringStatusCodes.INLINE_METHOD_FIELD_INITIALIZER, severity);
					return;
				}
			}*/
		}
	}

	/*private static boolean isAssignment(ASTNode node) {
		return node instanceof Assignment;
	}

	private static boolean isReturnStatement(ASTNode node) {
		return node instanceof ReturnStatement;
	}

	private static boolean isSingleDeclaration(ASTNode node) {
		int type= node.getNodeType();
		if (type == ASTNode.SINGLE_VARIABLE_DECLARATION)
			return true;
		if (type == ASTNode.VARIABLE_DECLARATION_FRAGMENT) {
			node= node.getParent();
			if (node.getNodeType() == ASTNode.VARIABLE_DECLARATION_STATEMENT) {
				VariableDeclarationStatement vs= (VariableDeclarationStatement)node;
				return vs.fragments().size() == 1;
			}
		}
		return false;
	}*/

	private static boolean isMultiDeclarationFragment(Node node) {
		return node instanceof VariableDeclaration && ((VariableStatement)node.eContainer()).getDeclarations().size() > 1;
	}

	private void addEntry(RefactoringStatus result, String message, int severity) {
		result.addEntry(new RefactoringStatusEntry(
			severity, message,
			ScriptStatusContext.create(cu, new SourceRange(invocation.getBegin(),invocation.getEnd()-invocation.getBegin())),
			JavascriptManipulationPlugin.getPluginId(),RefactoringStatusEntry.NO_CODE));
	}

	private void flowAnalysis() {
		//invocationScope = rootScope.findScope(targetNode.getBegin(), targetNode.getEnd());
		//invocationScope.setCursor(targetNode.getBegin());
		flowContext= new FlowContext(bindings);
		flowContext.setConsiderAccessMode(true);
		flowContext.setComputeMode(FlowContext.Mode.ARGUMENTS);
		Selection selection= Selection.createFromStartLength(invocation.getBegin(), invocation.getEnd()-invocation.getBegin());
		flowInfo= new InputFlowAnalyzer(flowContext, selection, true).perform(bodyDeclaration);
	}

	/*public TextEdit getModifications() {
		return fRewrite.rewriteAST(fBuffer.getDocument(), fCUnit.getJavaProject().getOptions(true));
	}*/
	
	private String getUnusedName(String candidate) {
		if (!usedNames.contains(candidate)) {
			usedNames.add(candidate);
			return candidate;
		}
		for(int i=1;;i++) {
			String res = candidate+i;
			if (!usedNames.contains(res)) {
				usedNames.add(res);
				return res;
			}
		}
	}

	private Set<String> computeRealArguments() throws ModelException {
		List<Expression> arguments=invocation.getArguments();
		Set<Expression> canNotInline=crossCheckArguments(arguments);
		//boolean needsVarargBoxing=needsVarargBoxing(arguments);
		//int varargIndex= fSourceProvider.getVarargIndex();
		realArguments= new Expression[arguments.size()];
		usedNames = VariableLookup.getVisibleNames(invocation);
		for (int i= 0; i < arguments.size(); i++) {
			Expression expression= (Expression)arguments.get(i);
			ParameterData parameter= sourceProvider.getParameterData(i);
			if (canInline(expression, parameter) && !canNotInline.contains(expression)) {
				realArguments[i] = (Expression)EcoreUtil.copy(expression);
				//if (argumentNeedsParentheses(expression, parameter)) {
				//	realArguments[i] = "(" + realArguments[i] + ")"; //$NON-NLS-1$ //$NON-NLS-2$
				//}
			} else {
				//String name= invocationScope.createName(parameter.getName(), true);
				Identifier id = DomFactory.eINSTANCE.createIdentifier();
				String name = getUnusedName(parameter.getName());
				id.setName(name);
				VariableReference ref = DomFactory.eINSTANCE.createVariableReference();
				ref.setVariable(id);
				realArguments[i]=ref;
				locals.add(name);
				localInitializers.add(expression);
			}
		}
		/*if (needsVarargBoxing) {
			ParameterData parameter= fSourceProvider.getParameterData(varargIndex);
			String name= fInvocationScope.createName(parameter.getName(), true);
			realArguments[varargIndex]= name;
			AST ast= fInvocation.getAST();
			Type type= fImportRewrite.addImport(parameter.getTypeBinding(), ast);
			VariableDeclarationFragment fragment= ast.newVariableDeclarationFragment();
			fragment.setName(ast.newSimpleName(name));
			ArrayInitializer initializer= ast.newArrayInitializer();
			for (int i= varargIndex; i < arguments.size(); i++) {
				initializer.expressions().add(fRewrite.createCopyTarget((ASTNode)arguments.get(i)));
			}
			fragment.setInitializer(initializer);
			VariableDeclarationStatement decl= ast.newVariableDeclarationStatement(fragment);
			decl.setType(type);
			fLocals.add(decl);
		}*/
		return usedNames;
	}

	private void computeReceiver() {
		Expression receiver = RefactoringUtils.getReceiver(invocation);
		if (receiver == null) {
			receiverExpr = null;
			return;
		}
		//final boolean isName = receiver instanceof VariableReference;
		//if (isName)
		//	fContext.receiverIsStatic= ((Name)receiver).resolveBinding() instanceof ITypeBinding;
		switch(receiver.eClass().getClassifierID()) {
		case DomPackage.BOOLEAN_LITERAL:
		case DomPackage.NULL_LITERAL:
		case DomPackage.NUMERIC_LITERAL:
		case DomPackage.REGULAR_EXPRESSION_LITERAL:
		case DomPackage.STRING_LITERAL:
		case DomPackage.THIS_EXPRESSION:
		case DomPackage.VARIABLE_REFERENCE:
			receiverExpr = receiver;
			return;
		}
		if (sourceProvider.getReceiversToBeUpdated() != 1) {
			while(receiver instanceof ParenthesizedExpression) {
				Expression expr = ((ParenthesizedExpression)receiver).getEnclosed();
				if (expr instanceof BinaryExpression && ((BinaryExpression) expr).getOperation() == BinaryOperator.COMMA)
					break;
				receiver = expr;
			}
			localInitializers.add(receiver);
			Identifier id = DomFactory.eINSTANCE.createIdentifier();
			String name = getUnusedName("r");
			id.setName(name);
			locals.add(name);
			VariableReference ref = DomFactory.eINSTANCE.createVariableReference();
			ref.setVariable(id);
			receiverExpr = ref; 
		} else
			receiverExpr = receiver;
		return;
	}
	/*public String[] getCodeBlocks() {
	final ASTRewrite rewriter = ASTRewrite.create(fDeclaration.getAST());
	replaceParameterWithExpression(rewriter, context.arguments);
	updateImplicitReceivers(rewriter, context);
	makeNamesUnique(rewriter, context.scope);
	updateTypeReferences(rewriter, context);
	updateStaticReferences(rewriter, context);
	updateTypeVariables(rewriter, context);
	updateMethodTypeVariable(rewriter, context);

	List ranges = null;
	if (hasReturnValue()) {
		if (context.callMode == ASTNode.RETURN_STATEMENT) {
			ranges = getStatementRanges();
		} else {
			ranges = getExpressionRanges();
		}
	} else {
		ASTNode last = getLastStatement();
		if (last != null && last.getNodeType() == ASTNode.RETURN_STATEMENT) {
			ranges = getReturnStatementRanges();
		} else {
			ranges = getStatementRanges();
		}
	}

	final TextEdit dummy = rewriter.rewriteAST(fDocument, fTypeRoot
			.getJavaProject().getOptions(true));
	int size = ranges.size();
	RangeMarker[] markers = new RangeMarker[size];
	for (int i = 0; i < markers.length; i++) {
		IRegion range = (IRegion) ranges.get(i);
		markers[i] = new RangeMarker(range.getOffset(), range.getLength());
	}
	int split;
	if (size <= 1) {
		split = Integer.MAX_VALUE;
	} else {
		IRegion region = (IRegion) ranges.get(0);
		split = region.getOffset() + region.getLength();
	}
	TextEdit[] edits = dummy.removeChildren();
	for (int i = 0; i < edits.length; i++) {
		TextEdit edit = edits[i];
		int pos = edit.getOffset() >= split ? 1 : 0;
		markers[pos].addChild(edit);
	}
	MultiTextEdit root = new MultiTextEdit(0, fDocument.getLength());
	root.addChildren(markers);

	try {
		TextEditProcessor processor = new TextEditProcessor(fDocument,
				root, TextEdit.CREATE_UNDO | TextEdit.UPDATE_REGIONS);
		UndoEdit undo = processor.performEdits();
		String[] result = getBlocks(markers);
		// It is faster to undo the changes than coping the buffer over and
		// over again.
		processor = new TextEditProcessor(fDocument, undo,
				TextEdit.UPDATE_REGIONS);
		processor.performEdits();
		return result;
	} catch (MalformedTreeException exception) {
		JavaPlugin.log(exception);
	} catch (BadLocationException exception) {
		JavaPlugin.log(exception);
	}
	return new String[] {};
}*/

	/*
	 * @param status the status
	 * @return <code>true</code> if explicit cast is needed otherwise <code>false</code>
	 *
	private boolean needsExplicitCast(RefactoringStatus status) {
		// if the return type of the method is the same as the type of the
		// returned expression then we don't need an explicit cast.
		if (fSourceProvider.returnTypeMatchesReturnExpressions())
				return false;
		ASTNode parent= fTargetNode.getParent();
		int nodeType= parent.getNodeType();
		if (nodeType == ASTNode.METHOD_INVOCATION) {
			MethodInvocation methodInvocation= (MethodInvocation)parent;
			if(methodInvocation.getExpression() == fTargetNode)
				return false;
			IMethodBinding method= methodInvocation.resolveMethodBinding();
			if (method == null) {
				status.addError(RefactoringCoreMessages.CallInliner_cast_analysis_error,
					JavaStatusContext.create(fCUnit, methodInvocation));
				return false;
			}
			ITypeBinding[] parameters= method.getParameterTypes();
			int argumentIndex= methodInvocation.arguments().indexOf(fInvocation);
			List returnExprs= fSourceProvider.getReturnExpressions();
			// it is inferred that only methods consisting of a single
			// return statement can be inlined as parameters in other
			// method invocations
			if (returnExprs.size() != 1)
				return false;
			parameters[argumentIndex]= ((Expression)returnExprs.get(0)).resolveTypeBinding();

			ITypeBinding type= ASTNodes.getReceiverTypeBinding(methodInvocation);
			TypeBindingVisitor visitor= new AmbiguousMethodAnalyzer(
				fTypeEnvironment, method, fTypeEnvironment.create(parameters));
			if(!visitor.visit(type)) {
				return true;
			}
			else if(type.isInterface()) {
				return !Bindings.visitInterfaces(type, visitor);
			}
			else if(Modifier.isAbstract(type.getModifiers())) {
				return !Bindings.visitHierarchy(type, visitor);
			}
			else {
				// it is not needed to visit interfaces if receiver is a concrete class
				return !Bindings.visitSuperclasses(type, visitor);
			}
		}
		return false;
	}*/

	/*private static boolean needsParentheses(Expression expression) {
		int type= expression.eClass().getClassifierID();
		return type == DomPackage.BINARY_EXPRESSION || type == DomPackage.CONDITIONAL_EXPRESSION
			|| type == DomPackage.UNARY_EXPRESSION;
	}

	private boolean needsParentheses(Statement last) {
		if (!(last instanceof ReturnStatement))
			return false;
		if (!needsParentheses(((ReturnStatement)last).getExpression()))
			return false;
		Node parent= (Node)targetNode.eContainer();
		int type= parent.eClass().getClassifierID();
		boolean isAssignment = type == DomPackage.BINARY_EXPRESSION && RefactoringUtils.isAssignment(((BinaryExpression)parent).getOperation());
		return
			type == DomPackage.CALL_EXPRESSION ||
			(parent instanceof Expression && !isAssignment) ||
			(returnsConditionalExpression(last) &&
				type == DomPackage.VARIABLE_DECLARATION &&
				((VariableDeclaration)parent).getInitializer() == targetNode);
	}
	private boolean returnsConditionalExpression(Statement last) {
		if (last instanceof ReturnStatement) {
			return ((ReturnStatement) last).getExpression() instanceof ConditionalExpression;
		}
		return false;
	}*/

	/*private VariableDeclarationStatement createLocalDeclaration(ITypeBinding type, String name, Expression initializer) {
		ImportRewriteContext context= new ContextSensitiveImportRewriteContext(fTargetNode, fImportRewrite);
		String typeName= fImportRewrite.addImport(type, context);
		VariableDeclarationStatement decl= (VariableDeclarationStatement)ASTNodeFactory.newStatement(
			fInvocation.getAST(), typeName + " " + name + ";"); //$NON-NLS-1$ //$NON-NLS-2$
		((VariableDeclarationFragment)decl.fragments().get(0)).setInitializer(initializer);
		return decl;
	}*/

    /**
     * Checks whether arguments are passed to the method which do some assignments
     * inside the expression. If so these arguments can't be inlined into the
     * calling method since the assignments might be reorder. An example is:
     * <code>
     *   add((field=args).length,field.hashCode());
     * </code>
     * Field might not be initialized when the arguments are reorder in the called
     * method.
     * @param arguments the arguments
     * @return all arguments that cannot be inlined
     */
	private Set<Expression> crossCheckArguments(List<Expression> arguments) {
		//final Set<Expression> assigned= new HashSet<Expression>();
		final Set<Expression> result= new HashSet<Expression>();
		for (Expression arg : arguments) {
			TreeIterator<EObject> it = arg.eAllContents();
			while (it.hasNext()) {
				Node node = (Node)it.next();
				if (node.eClass().getClassifierID() == DomPackage.BINARY_EXPRESSION) {
					BinaryExpression expr = (BinaryExpression)node;
					if (RefactoringUtils.isAssignment(expr.getOperation()))
						result.add(expr);
				}
				if (node.eClass().getClassifierID() == DomPackage.UNARY_EXPRESSION) {
					UnaryExpression expr = (UnaryExpression)node;
					if (RefactoringUtils.hasSideEffect(expr.getOperation()))
						result.add(expr);
				}
			}
		}
		/*for(Expression expression : arguments) {
			if (!result.contains(expression)) {
				expression.accept(new HierarchicalASTVisitor() {
					public boolean visit(Name node) {
						IBinding binding= node.resolveBinding();
						if (binding != null && assigned.contains(binding))
							result.add(expression);
						return false;
					}
				});
			}
		}*/
		return result;
	}

	private boolean canInline(Expression actualParameter, ParameterData formalParameter) {
		InlineEvaluator evaluator= new InlineEvaluator(formalParameter);
		evaluator.traverse(actualParameter);
		//actualParameter.accept(evaluator);
		return evaluator.getResult();
	}

	public RefactoringStatus perform() {
		RefactoringStatus result= new RefactoringStatus();
		Node parentStatement=invocation;
		while (!(parentStatement.eContainmentFeature().getEReferenceType().getClassifierID() == DomPackage.STATEMENT))
			parentStatement = (Node)parentStatement.eContainer();
		Node container = (Node)parentStatement.eContainer();
		EReference ref = parentStatement.eContainmentFeature();
		int nos = sourceProvider.getDeclaration().getBody().getStatements().size() + locals.size();
		if (!ref.isMany() && (nos > 1 || needsBlockAroundDanglingIf())) {
			BlockStatement block = DomFactory.eINSTANCE.createBlockStatement();
			block.getStatements().add((Statement)parentStatement);
			container.eSet(ref, block);
			container = block;
			ref = DomPackage.eINSTANCE.getBlockStatement_Statements();
		}
		List<Statement> list = null;
		int idx = -1;
		if (ref.isMany()) {
			list = (List<Statement>)container.eGet(ref);
			idx = list.lastIndexOf(parentStatement);
		}
		if (!locals.isEmpty()) {
			int i=0;
			for(String str : locals) {
				Expression init = localInitializers.get(i++);
				Identifier id = DomFactory.eINSTANCE.createIdentifier();
				id.setName(str);
				VariableDeclaration decl = DomFactory.eINSTANCE.createVariableDeclaration();
				decl.setIdentifier(id);
				//TODO find out if we need to create a copy
				decl.setInitializer(init);
				VariableStatement stmt = DomFactory.eINSTANCE.createVariableStatement();
				stmt.getDeclarations().add(decl);
				list.add(idx++, stmt);
			}
		}
		//String block=sourceProvider.getCode();
		FunctionExpression declCopy = (FunctionExpression)EcoreUtil.copy(sourceProvider.getDeclaration());
		if (!cu.equals(sourceProvider.getSourceModule())) {
			// TODO handle this without killing old formatting
			TreeIterator<EObject> it = declCopy.eAllContents();
			while(it.hasNext()) {
				Node node = (Node)it.next();
				node.setBegin(-1);
				node.setEnd(-1);
			}
		}
		final Map<Identifier, VariableBinding> bindings = VariableLookup.findBindings(declCopy);
		final Map<VariableBinding, Expression> replacements = new HashMap<VariableBinding, Expression>();
		for(int i=0;i<realArguments.length;i++) {
			VariableBinding binding = bindings.get(declCopy.getParameters().get(i).getName());
			replacements.put(binding, realArguments[i]);
		}
		List<Statement> stmts = new ArrayList<Statement>();
		stmts.addAll(declCopy.getBody().getStatements());
		List<Identifier> references = VariableLookup.findReferences(declCopy.getBody(), usedNames);
		for(Identifier id : references) {
			VariableBinding binding = bindings.get(id);
			if (binding != null && !replacements.containsKey(binding)) {
				Identifier var = DomFactory.eINSTANCE.createIdentifier();
				var.setName(getUnusedName(id.getName()));
				VariableReference expr = DomFactory.eINSTANCE.createVariableReference();
				expr.setVariable(var);
				replacements.put(binding,expr);
			}
		}
		Node node = null;
		if (stmts.isEmpty() && targetNode != null) {
			if (ref.isMany()) {
				list.remove(idx);
			} else {
				container.eSet(ref, DomFactory.eINSTANCE.createEmptyStatement());
			}
		} else {
			for(int i= 0; i < stmts.size()-1; i++) {
				list.add(idx++,stmts.get(i));
			}
			node = stmts.get(stmts.size()-1);
			if (node.eClass().getClassifierID() == DomPackage.RETURN_STATEMENT) {
				node = ((ReturnStatement)node).getExpression();
				if (targetNode instanceof Expression) {
					/*if (needsParentheses((Expression)node)) {
						ParenthesizedExpression pExp = DomFactory.eINSTANCE.createParenthesizedExpression();
						pExp.setEnclosed((Expression)node);
						node= pExp;
					}*/
					Node cont = (Node)targetNode.eContainer();
					EReference target = targetNode.eContainmentFeature();
					if (target.isMany()) {
						List<Expression> targets = (List<Expression>)cont.eGet(target);
						targets.set(targets.lastIndexOf(targetNode),(Expression)node);
					} else
						cont.eSet(target, node);
				} else if (targetNode.eClass().getClassifierID() == DomPackage.EXPRESSION_STATEMENT) {
					if (sourceProvider.mustEvaluateReturnedExpression()) {
						ExpressionStatement stmt = DomFactory.eINSTANCE.createExpressionStatement();
						stmt.setExpression((Expression)node);
						list.set(idx,stmt);
					} else
						list.remove(idx);
				} else {
					list.set(idx,stmts.get(stmts.size()-1));
				}
			} else {
				list.set(idx,stmts.get(stmts.size()-1));
			}
		}
		
		new Object() {
			void traverse(List<? extends Node> list, Node node) {
				traverse(list);
				if (node != null)
					traverse(node);
			}
			void traverse(List<? extends Node> list) {
				for(int i=0;i<list.size();i++) {
					Expression expr = process(list.get(i));
					if (expr != null)
						((List<Expression>)list).set(i, expr);
				}
			}
			void traverse(Node node) {
				for(EReference ref : node.eClass().getEAllReferences())
					if (ref.isMany())
						traverse((List<? extends Node>)node.eGet(ref));
					else {
						Expression expr = process((Node)node.eGet(ref));
						if (expr != null)
							node.eSet(ref,expr);
					}
			}
			Expression process(Node value) {
				if (value == null)
					return null;
				switch(value.eClass().getClassifierID()) {
				case DomPackage.IDENTIFIER: {
					VariableBinding binding = bindings.get((Identifier)value);
					Expression res = replacements.get(binding);
					if (res == null)
						return null;
					if (res instanceof VariableReference) {
						((Identifier)value).setName(((VariableReference) res).getVariable().getName());
						return null;
					}
					throw new IllegalStateException("Replacing variable with expression without removing declaration"); // $NON-NLS-1
				}
				case DomPackage.VARIABLE_REFERENCE:
					VariableBinding binding = bindings.get(((VariableReference)value).getVariable());
					if (binding == null)
						return null;
					Expression res = replacements.get(binding);
					return res == null ? null : (Expression)EcoreUtil.copy(res);
				case DomPackage.THIS_EXPRESSION:
					return (Expression)EcoreUtil.copy(receiverExpr);
				default:
					traverse(value);
					return null;
				}
			}
		}.traverse(stmts,node);
		return result;
	}
	
	/*private void initializeInsertionPoint(int nos) {
		switch(container.eClass().getClassifierID()) {
		case DomPackage.BLOCK_STATEMENT:
			Block block= (Block)container;
			fListRewrite= fRewrite.getListRewrite(block, Block.STATEMENTS_PROPERTY);
			fInsertionIndex= fListRewrite.getRewrittenList().indexOf(parentStatement);
			break;
		case DomPackage.SWITCH_STATEMENT:
			SwitchStatement switchStatement= (SwitchStatement)container;
			fListRewrite= fRewrite.getListRewrite(switchStatement, SwitchStatement.STATEMENTS_PROPERTY);
			fInsertionIndex= fListRewrite.getRewrittenList().indexOf(parentStatement);
			break;
		default: // isControlStatement(container) || type == ASTNode.LABELED_STATEMENT
			fNeedsStatement= true;
			if (nos > 1 || needsBlockAroundDanglingIf()) {
				Block block= fInvocation.getAST().newBlock();
				fInsertionIndex= 0;
				Statement currentStatement= null;
				switch(type) {
					case ASTNode.LABELED_STATEMENT:
						currentStatement= ((LabeledStatement)container).getBody();
						break;
					case ASTNode.FOR_STATEMENT:
						currentStatement= ((ForStatement)container).getBody();
						break;
					case ASTNode.ENHANCED_FOR_STATEMENT:
						currentStatement= ((EnhancedForStatement)container).getBody();
						break;
					case ASTNode.WHILE_STATEMENT:
						currentStatement= ((WhileStatement)container).getBody();
						break;
					case ASTNode.DO_STATEMENT:
						currentStatement= ((DoStatement)container).getBody();
						break;
					case ASTNode.IF_STATEMENT:
						IfStatement node= (IfStatement)container;
						Statement thenPart= node.getThenStatement();
						if (fTargetNode == thenPart || ASTNodes.isParent(fTargetNode, thenPart)) {
							currentStatement= thenPart;
						} else {
							currentStatement= node.getElseStatement();
						}
						break;
				}
				Assert.isNotNull(currentStatement);
				fRewrite.replace(currentStatement, block, null);
				fListRewrite= fRewrite.getListRewrite(block, Block.STATEMENTS_PROPERTY);
				// The method to be inlined is not the body of the control statement.
				if (currentStatement != fTargetNode) {
					fListRewrite.insertLast(fRewrite.createCopyTarget(currentStatement), null);
				} else {
					// We can't replace a copy with something else. So we
					// have to insert all statements to be inlined.
					fTargetNode= null;
				}
			}
		}
		// We only insert one new statement or we delete the existing call.
		// So there is no need to have an insertion index.
	}*/

	private boolean needsBlockAroundDanglingIf() {
		/* see https://bugs.eclipse.org/bugs/show_bug.cgi?id=169331
		 *
		 * Situation:
		 * boolean a, b;
		 * function toInline() {
		 *     if (a)
		 *         hashCode()
		 * }
		 * function m() {
		 *     if (b)
		 *         toInline()
		 *     else
		 *         toString()
		 * }
		 * => needs block around inlined "if (a)..." to avoid attaching else to wrong if.
		 */
		return targetNode.eContainmentFeature() == DomPackage.eINSTANCE.getIfStatement_Consequent()
				&& ((IfStatement)targetNode.eContainer()).getAlternative() == null
				&& sourceProvider.isDanglingIf();
	}

	/*private String getContent(Node node) throws ModelException {
		return cu.getBuffer().getText(node.getBegin(), node.getEnd());
	}*/

	/*private boolean isControlStatement(ASTNode node) {
		int type= node.getNodeType();
		return type == ASTNode.IF_STATEMENT || type == ASTNode.FOR_STATEMENT || type == ASTNode.ENHANCED_FOR_STATEMENT ||
		        type == ASTNode.WHILE_STATEMENT || type == ASTNode.DO_STATEMENT;
	}*/
}
