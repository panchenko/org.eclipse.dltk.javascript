/*******************************************************************************
 * Copyright (c) 2000, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Benjamin Muskalla <bmuskalla@eclipsesource.com> - [extract method] Extract method and continue https://bugs.eclipse.org/bugs/show_bug.cgi?id=48056
 *     Benjamin Muskalla <bmuskalla@eclipsesource.com> - [extract method] Name ambiguous return value in error message - https://bugs.eclipse.org/bugs/show_bug.cgi?id=50607
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.corext.refactoring.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.ast.statements.Block;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.SourceRange;
import org.eclipse.dltk.internal.corext.refactoring.base.ScriptStatusContext;
import org.eclipse.dltk.internal.javascript.core.manipulation.Messages;
import org.eclipse.dltk.internal.javascript.corext.refactoring.RefactoringCoreMessages;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow.FlowContext;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow.FlowInfo;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow.InOutFlowAnalyzer;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow.InputFlowAnalyzer;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow.VariableBinding;
import org.eclipse.dltk.internal.javascript.corext.refactoring.util.Selection;
import org.eclipse.dltk.internal.javascript.corext.refactoring.util.StatementAnalyzer;
import org.eclipse.dltk.javascript.core.dom.BlockStatement;
import org.eclipse.dltk.javascript.core.dom.BreakStatement;
import org.eclipse.dltk.javascript.core.dom.ContinueStatement;
import org.eclipse.dltk.javascript.core.dom.DoStatement;
import org.eclipse.dltk.javascript.core.dom.DomPackage;
import org.eclipse.dltk.javascript.core.dom.Expression;
import org.eclipse.dltk.javascript.core.dom.ForEachInStatement;
import org.eclipse.dltk.javascript.core.dom.ForInStatement;
import org.eclipse.dltk.javascript.core.dom.ForStatement;
import org.eclipse.dltk.javascript.core.dom.FunctionExpression;
import org.eclipse.dltk.javascript.core.dom.Identifier;
import org.eclipse.dltk.javascript.core.dom.Label;
import org.eclipse.dltk.javascript.core.dom.LabeledStatement;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.Source;
import org.eclipse.dltk.javascript.core.dom.Statement;
import org.eclipse.dltk.javascript.core.dom.Type;
import org.eclipse.dltk.javascript.core.dom.WhileStatement;
import org.eclipse.dltk.javascript.core.dom.rewrite.VariableLookup;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;

import com.ibm.icu.text.MessageFormat;


/* package */ class ExtractMethodAnalyzer extends StatementAnalyzer {

	public static final int ERROR=					-2;
	public static final int UNDEFINED=				-1;
	public static final int NO=						0;
	public static final int EXPRESSION=				1;
	public static final int ACCESS_TO_LOCAL=		2;
	public static final int RETURN_STATEMENT_VOID=	3;
	public static final int RETURN_STATEMENT_VALUE=	4;
	public static final int MULTIPLE=				5;

	/** This is either a method declaration or an initializer */
	private Node fEnclosingNode;
	//private IMethodBinding fEnclosingMethodBinding;
	//private int fMaxVariableId;

	private int fReturnKind;
	private String fReturnTypeName;
	//private ITypeBinding fReturnTypeBinding;

	private FlowInfo fInputFlowInfo;
	private FlowContext fInputFlowContext;

	private VariableBinding[] fArguments;
	private VariableBinding[] fMethodLocals;
	//private ITypeBinding[] fTypeVariables;

	private VariableBinding fReturnValue;
	private VariableBinding[] fCallerLocals;
	private VariableBinding fReturnLocal;

	/*private ITypeBinding[] fAllExceptions;
	private ITypeBinding fExpressionBinding;

	private boolean fForceStatic;*/
	private boolean fIsLastStatementSelected;
	private Label fEnclosingLoopLabel;
	
	public ExtractMethodAnalyzer(ISourceModule unit, Selection selection) {
		super(unit, selection, false);
	}

	public Node getEnclosingNode() {
		return fEnclosingNode;
	}

	public int getReturnKind() {
		return fReturnKind;
	}

	/*public boolean extractsExpression() {
		return fReturnKind == EXPRESSION;
	}*/

	public String getReturnTypeName() {
		return fReturnTypeName;
	}

	/*public ITypeBinding getReturnTypeBinding() {
		return fReturnTypeBinding;
	}

	public boolean generateImport() {
		switch (fReturnKind) {
			case EXPRESSION:
				return true;
			default:
				return false;
		}
	}*/

	public VariableBinding[] getArguments() {
		return fArguments;
	}

	public VariableBinding[] getMethodLocals() {
		return fMethodLocals;
	}

	public VariableBinding getReturnValue() {
		return fReturnValue;
	}

	public VariableBinding[] getCallerLocals() {
		return fCallerLocals;
	}

	public VariableBinding getReturnLocal() {
		return fReturnLocal;
	}

	/*public ITypeBinding getExpressionBinding() {
		return fExpressionBinding;
	}

	public boolean getForceStatic() {
		return fForceStatic;
	}

	public ITypeBinding[] getTypeVariables() {
		return fTypeVariables;
	}*/

	//---- Activation checking ---------------------------------------------------------------------------

	public RefactoringStatus checkInitialConditions(Source root) {
		RefactoringStatus result= getStatus();
		traverse(root);
		if (result.hasFatalError())
			return result;

		fReturnKind= UNDEFINED;
		if (analyzeSelection(result).hasFatalError())
			return result;

		int returns= fReturnKind == NO ? 0 : 1;
		if (fReturnValue != null) {
			fReturnKind= ACCESS_TO_LOCAL;
			returns++;
		}
		if (isExpressionSelected()) {
			fReturnKind= EXPRESSION;
			returns++;
		}

		if (returns > 1) {
			fReturnKind= MULTIPLE;
			addFatalError(result, RefactoringCoreMessages.ExtractMethodAnalyzer_ambiguous_return_value);
			return result;
		}
		initReturnType();
		return result;
	}
	
	private void addFatalError(RefactoringStatus status, String message) {
		SourceRange range = new SourceRange(getSelection().getOffset(),getSelection().getLength());
		status.addFatalError(message, ScriptStatusContext.create(fCUnit, range));
	}

	private void addError(RefactoringStatus status, String message) {
		SourceRange range = new SourceRange(getSelection().getOffset(),getSelection().getLength());
		status.addError(message, ScriptStatusContext.create(fCUnit, range));
	}

	private void addWarning(RefactoringStatus status, String message) {
		SourceRange range = new SourceRange(getSelection().getOffset(),getSelection().getLength());
		status.addWarning(message, ScriptStatusContext.create(fCUnit, range));
	}

	private void initReturnType() {
		fReturnTypeName = null;
		//fReturnTypeBinding= null;
		switch (fReturnKind) {
			case ACCESS_TO_LOCAL:
				fReturnTypeName = fReturnValue.getTypeName();
				break;
			// TODO here's where type inference is to be used
			/*case EXPRESSION:
				Expression expression= (Expression)getFirstSelectedNode();
				if (expression.getNodeType() == ASTNode.CLASS_INSTANCE_CREATION) {
					fExpressionBinding= ((ClassInstanceCreation)expression).getType().resolveBinding();
				} else {
					fExpressionBinding= expression.resolveTypeBinding();
				}
				if (fExpressionBinding != null) {
					if (fExpressionBinding.isNullType()) {
						getStatus().addFatalError(RefactoringCoreMessages.ExtractMethodAnalyzer_cannot_extract_null_type, JavaStatusContext.create(fCUnit, expression));
					} else {
						ITypeBinding normalizedBinding= Bindings.normalizeForDeclarationUse(fExpressionBinding, ast);
						if (normalizedBinding != null) {
							ImportRewriteContext context= new ContextSensitiveImportRewriteContext(fEnclosingNode, rewriter);
							fReturnType= rewriter.addImport(normalizedBinding, ast, context);
							fReturnTypeBinding= normalizedBinding;
						}
					}
				} else {
					fReturnType= ast.newPrimitiveType(PrimitiveType.VOID);
					fReturnTypeBinding= ast.resolveWellKnownType("void"); //$NON-NLS-1$
					getStatus().addError(RefactoringCoreMessages.ExtractMethodAnalyzer_cannot_determine_return_type, JavaStatusContext.create(fCUnit, expression));
				}
				break;*/
			case RETURN_STATEMENT_VALUE:
				if (fEnclosingNode.eClass().getClassifierID() == DomPackage.FUNCTION_EXPRESSION) {
					Type type = ((FunctionExpression) fEnclosingNode).getReturnType();
					if (type != null)
						fReturnTypeName = type.getName();
					//fReturnTypeBinding= fReturnType != null ? fReturnType.resolveBinding() : null;
				}
				break;
			default:
				//fReturnType= ast.newPrimitiveType(PrimitiveType.VOID);
				//fReturnTypeBinding= ast.resolveWellKnownType("void");
		}
		/*if (fReturnType == null)
			fReturnType= ast.newPrimitiveType(PrimitiveType.VOID);
			fReturnTypeBinding= ast.resolveWellKnownType("void");*/
	}

	//	 !!! -- +/- same as in ExtractTempRefactoring
	/*public boolean isLiteralNodeSelected() {
		ASTNode[] nodes= getSelectedNodes();
		if (nodes.length != 1)
			return false;
		ASTNode node= nodes[0];
		switch (node.getNodeType()) {
			case ASTNode.BOOLEAN_LITERAL :
			case ASTNode.CHARACTER_LITERAL :
			case ASTNode.NULL_LITERAL :
			case ASTNode.NUMBER_LITERAL :
				return true;

			default :
				return false;
		}
	}*/

	//---- Input checking -----------------------------------------------------------------------------------

	/*public void checkInput(RefactoringStatus status, String methodName) {
		ITypeBinding[] arguments= getArgumentTypes();
		ITypeBinding type= ASTNodes.getEnclosingType(fEnclosingNode);
		status.merge(Checks.checkMethodInType(type, methodName, arguments));
		status.merge(Checks.checkMethodInHierarchy(type.getSuperclass(), methodName, null, arguments));
	}

	private ITypeBinding[] getArgumentTypes() {
		ITypeBinding[] result= new ITypeBinding[fArguments.length];
		for (int i= 0; i < fArguments.length; i++) {
			result[i]= fArguments[i].getType();
		}
		return result;
	}*/

	private RefactoringStatus analyzeSelection(RefactoringStatus status) {
		final Map<Identifier, VariableBinding> bindings = VariableLookup.findBindings(fEnclosingNode);
		fInputFlowContext= new FlowContext(bindings);
		fInputFlowContext.setConsiderAccessMode(true);
		fInputFlowContext.setComputeMode(FlowContext.Mode.ARGUMENTS);
		InOutFlowAnalyzer flowAnalyzer= new InOutFlowAnalyzer(fInputFlowContext);
		fInputFlowInfo= flowAnalyzer.perform(getSelectedNodes());

		if (fInputFlowInfo.branches()) {
			String canHandleBranchesProblem= canHandleBranches();
			if (canHandleBranchesProblem != null) {
				addFatalError(status, canHandleBranchesProblem);
				fReturnKind= ERROR;
				return status;
			}
		}
		if (fInputFlowInfo.isValueReturn()) {
			fReturnKind= RETURN_STATEMENT_VALUE;
		} else  if (fInputFlowInfo.isVoidReturn() || (fInputFlowInfo.isPartialReturn()/* && isVoidMethod()*/ && isLastStatementSelected())) {
			fReturnKind= RETURN_STATEMENT_VOID;
		} else if (fInputFlowInfo.isNoReturn() || fInputFlowInfo.isThrow() || fInputFlowInfo.isUndefined()) {
			fReturnKind= NO;
		}

		if (fReturnKind == UNDEFINED) {
			addError(status, RefactoringCoreMessages.FlowAnalyzer_execution_flow);
			fReturnKind= NO;
		}
		computeInput();
		//computeExceptions();
		computeOutput(status, bindings);
		if (status.hasFatalError())
			return status;

		adjustArgumentsAndMethodLocals();
		//compressArrays();
		return status;
	}

	private String canHandleBranches() {
		if (fReturnValue != null)
			return RefactoringCoreMessages.ExtractMethodAnalyzer_branch_mismatch;
		
		Node[] selectedNodes= getSelectedNodes();
		final Node lastSelectedNode= selectedNodes[selectedNodes.length - 1];
		Statement body= getParentLoopBody((Node)lastSelectedNode.eContainer());
		if (!(body instanceof Block))
			return RefactoringCoreMessages.ExtractMethodAnalyzer_branch_mismatch;
		
		if (body != lastSelectedNode) {
			BlockStatement block= (BlockStatement)body;
			List<Statement> statements= block.getStatements();
			Statement lastStatementInLoop= statements.get(statements.size() - 1);
			if (lastSelectedNode != lastStatementInLoop)
				return RefactoringCoreMessages.ExtractMethodAnalyzer_branch_mismatch;
		}
		
		for (int i= 0; i < selectedNodes.length; i++) {
			Node node= selectedNodes[i];
			List<String> localLoopLabels = new ArrayList<String>();
			TreeIterator<EObject> it = node.eAllContents();
			while (it.hasNext()) {
				Node cur = (Node)it.next();
				switch(node.eClass().getClassifierID()) {
				case DomPackage.BREAK_STATEMENT: {
					Label label = ((BreakStatement)cur).getLabel();
					if (label != null && !localLoopLabels.contains(label.getName())) {
						return Messages.format(
								RefactoringCoreMessages.ExtractMethodAnalyzer_branch_break_mismatch,
								new Object[] { ("break " + label.getName()) }); //$NON-NLS-1$
					}
					break;
				}
				case DomPackage.CONTINUE_STATEMENT: {
					Label label = ((ContinueStatement)cur).getLabel();
					if (label != null && !localLoopLabels.contains(label.getName())) {
						if (fEnclosingLoopLabel == null || !label.getName().equals(fEnclosingLoopLabel.getName())) {
							return Messages.format(
									RefactoringCoreMessages.ExtractMethodAnalyzer_branch_continue_mismatch,
									new Object[] { "continue " + label.getName() }); //$NON-NLS-1$
						}
					}
				}
				case DomPackage.LABELED_STATEMENT: {
					Label label = ((LabeledStatement)cur).getLabel();
					if (label != null)
						localLoopLabels.add(label.getName());
				}
				}
			}
		}
		return null;
	}

	private Statement getParentLoopBody(Node node) {
		Statement stmt= null;
		Node start= node;
		while (start != null
				&& !(start instanceof ForStatement)
				&& !(start instanceof DoStatement)
				&& !(start instanceof WhileStatement)
				&& !(start instanceof ForInStatement)
				&& !(start instanceof ForEachInStatement)) {
			start= (Node)start.eContainer();
		}
		if (start instanceof ForStatement) {
			stmt= ((ForStatement)start).getBody();
		} else if (start instanceof DoStatement) {
			stmt= ((DoStatement)start).getBody();
		} else if (start instanceof WhileStatement) {
			stmt= ((WhileStatement)start).getBody();
		} else if (start instanceof ForInStatement) {
			stmt= ((ForInStatement)start).getBody();
		} else if (start instanceof ForEachInStatement) {
			stmt= ((ForEachInStatement)start).getBody();
		}
		if (start.eContainer() instanceof LabeledStatement) {
			LabeledStatement labeledStatement= (LabeledStatement)start.eContainer();
			fEnclosingLoopLabel= labeledStatement.getLabel();
		}
		return stmt;
	}

	/*private boolean isVoidMethod() {
		// if we have an initializer
		if (fEnclosingMethodBinding == null)
			return true;
		ITypeBinding binding= fEnclosingMethodBinding.getReturnType();
		if (fEnclosingNode.getAST().resolveWellKnownType("void").equals(binding)) //$NON-NLS-1$
			return true;
		return false;
	}*/

	public boolean isLastStatementSelected() {
		return fIsLastStatementSelected;
	}

	private void computeLastStatementSelected() {
		Node[] nodes= getSelectedNodes();
		if (nodes.length == 0) {
			fIsLastStatementSelected= false;
		} else {
			BlockStatement body= null;
			if (fEnclosingNode instanceof FunctionExpression) {
				body= ((FunctionExpression) fEnclosingNode).getBody();
			}// else if (fEnclosingNode instanceof Initializer) {
			//	body= ((Initializer) fEnclosingNode).getBody();
			//}
			if (body != null) {
				List<Statement> statements= body.getStatements();
				fIsLastStatementSelected= nodes[nodes.length - 1] == statements.get(statements.size() - 1);
			}
		}
	}

	private void computeInput() {
		int argumentMode= FlowInfo.READ | FlowInfo.READ_POTENTIAL | FlowInfo.WRITE_POTENTIAL | FlowInfo.UNKNOWN;
		fArguments= removeSelectedDeclarations(fInputFlowInfo.get(fInputFlowContext, argumentMode));
		fMethodLocals= removeSelectedDeclarations(fInputFlowInfo.get(fInputFlowContext, FlowInfo.WRITE | FlowInfo.WRITE_POTENTIAL));
		//fTypeVariables= computeTypeVariables(fInputFlowInfo.getTypeVariables());
	}

	private VariableBinding[] removeSelectedDeclarations(VariableBinding[] bindings) {
		List<VariableBinding> result= new ArrayList<VariableBinding>(bindings.length);
		Selection selection= getSelection();
		for (int i= 0; i < bindings.length; i++) {
			Node decl=bindings[i].getDeclaration();
			if (!selection.covers(decl))
				result.add(bindings[i]);
		}
		return (VariableBinding[])result.toArray(new VariableBinding[result.size()]);
	}

	/*private ITypeBinding[] computeTypeVariables(ITypeBinding[] bindings) {
		Selection selection= getSelection();
		Set result= new HashSet();
		// first remove all type variables that come from outside of the method
		// or are covered by the selection
		CompilationUnit compilationUnit= (CompilationUnit)fEnclosingNode.getRoot();
		for (int i= 0; i < bindings.length; i++) {
			ASTNode decl= compilationUnit.findDeclaringNode(bindings[i]);
			if (decl == null || (!selection.covers(decl) && decl.getParent() instanceof MethodDeclaration))
				result.add(bindings[i]);
		}
		// all all type variables which are needed since a local variable uses it
		for (int i= 0; i < fArguments.length; i++) {
			IVariableBinding arg= fArguments[i];
			ITypeBinding type= arg.getType();
			if (type != null && type.isTypeVariable()) {
				ASTNode decl= compilationUnit.findDeclaringNode(type);
				if (decl == null || (!selection.covers(decl) && decl.getParent() instanceof MethodDeclaration))
					result.add(type);
			}
		}
		return (ITypeBinding[])result.toArray(new ITypeBinding[result.size()]);
	}*/

	private void computeOutput(RefactoringStatus status, Map<Identifier, VariableBinding> bindings) {
		// First find all writes inside the selection.
		FlowContext flowContext= new FlowContext(bindings);
		flowContext.setConsiderAccessMode(true);
		flowContext.setComputeMode(FlowContext.Mode.RETURN_VALUES);
		FlowInfo returnInfo = new InOutFlowAnalyzer(flowContext).perform(getSelectedNodes());
		VariableBinding[] returnValues = returnInfo.get(flowContext, FlowInfo.WRITE | FlowInfo.WRITE_POTENTIAL | FlowInfo.UNKNOWN);
		InOutFlowAnalyzer analyzer = new InOutFlowAnalyzer(flowContext);
		analyzer.perform(new Node[]{fEnclosingNode});
		FlowInfo closureInfo = analyzer.closureInfo;
		VariableBinding[] closureReads = closureInfo.get(flowContext, FlowInfo.READ | FlowInfo.READ_POTENTIAL);
		for(VariableBinding binding : returnValues) {
			for (VariableBinding read : closureReads) {
				if (read == binding) {
					addWarning(status,Messages.format(RefactoringCoreMessages.ExtractMethodAnalyzer_closure,binding.getName()));
				}
			}
		}
		VariableBinding[] closureRW = closureInfo.get(flowContext, FlowInfo.UNKNOWN);
		for(VariableBinding binding : closureRW) {
			addWarning(status,Messages.format(RefactoringCoreMessages.ExtractMethodAnalyzer_closure,binding.getName()));
		}

		// Compute a selection that exactly covers the selected nodes
		IRegion region= getSelectedNodeRange();
		Selection selection= Selection.createFromStartLength(region.getOffset(), region.getLength());

		List<VariableBinding> localReads= new ArrayList<VariableBinding>();
		flowContext.setComputeMode(FlowContext.Mode.ARGUMENTS);
		FlowInfo argInfo = new InputFlowAnalyzer(flowContext, selection, true).perform(fEnclosingNode);
		VariableBinding[] reads= argInfo.get(flowContext, FlowInfo.READ | FlowInfo.READ_POTENTIAL | FlowInfo.UNKNOWN);
		VariableBinding[] closureWrites = closureInfo.get(flowContext, FlowInfo.WRITE | FlowInfo.WRITE_POTENTIAL);
		for(VariableBinding binding : reads) {
			for (VariableBinding write : closureWrites) {
				if (write == binding) {
					addWarning(status,Messages.format(RefactoringCoreMessages.ExtractMethodAnalyzer_closure,binding.getName()));
				}
			}
		}
		
		outer: for (int i= 0; i < returnValues.length && localReads.size() < returnValues.length; i++) {
			VariableBinding binding= returnValues[i];
			for (int x= 0; x < reads.length; x++) {
				if (reads[x] == binding) {
					localReads.add(binding);
					fReturnValue= binding;
					continue outer;
				}
			}
		}
		switch (localReads.size()) {
			case 0:
				fReturnValue= null;
				break;
			case 1:
				break;
			default:
				fReturnValue= null;
				StringBuffer affectedLocals= new StringBuffer();
				for (int i= 0; i < localReads.size(); i++) {
					VariableBinding binding= localReads.get(i);
					//String bindingName= BindingLabelProvider.getBindingLabel(binding, BindingLabelProvider.DEFAULT_TEXTFLAGS | JavaElementLabels.F_PRE_TYPE_SIGNATURE);
					//affectedLocals.append(bindingName);
					affectedLocals.append(binding);
					if (i != localReads.size() - 1) {
						affectedLocals.append('\n');
					}
				}
				String message= MessageFormat.format(RefactoringCoreMessages.ExtractMethodAnalyzer_assignments_to_local, new Object[] { affectedLocals.toString() });
				addFatalError(status,message);
				return;
		}
		List<VariableBinding> callerLocals= new ArrayList<VariableBinding>(5);
		FlowInfo localInfo= new InputFlowAnalyzer(flowContext, selection, false).perform(fEnclosingNode);
		VariableBinding[] writes= localInfo.get(flowContext, FlowInfo.WRITE | FlowInfo.WRITE_POTENTIAL | FlowInfo.UNKNOWN);
		for (int i= 0; i < writes.length; i++) {
			VariableBinding write= writes[i];
			if (getSelection().covers(write.getDeclaration()))
				callerLocals.add(write);
		}
		fCallerLocals= callerLocals.toArray(new VariableBinding[callerLocals.size()]);
		if (fReturnValue != null && getSelection().covers(fReturnValue.getDeclaration()))
			fReturnLocal= fReturnValue;
	}

	private void adjustArgumentsAndMethodLocals() {
		for (int i= 0; i < fArguments.length; i++) {
			//IVariableBinding argument= fArguments[i];
			VariableBinding argument = fArguments[i];
			// Both arguments and locals consider FlowInfo.WRITE_POTENTIAL. But at the end a variable
			// can either be a local of an argument. Fix this based on the compute return type which
			// didn't exist when we computed the locals and arguments (see computeInput())
			if (fInputFlowInfo.hasAccessMode(fInputFlowContext, argument, FlowInfo.WRITE_POTENTIAL)) {
				if (argument != fReturnValue)
					fArguments[i]= null;
				// We didn't remove the argument. So we have to remove the local declaration
				if (fArguments[i] != null) {
					for (int l= 0; l < fMethodLocals.length; l++) {
						if (fMethodLocals[l] == argument)
							fMethodLocals[l]= null;
					}
				}
			}
		}
	}

	/*private void compressArrays() {
		fArguments= compressArray(fArguments);
		fCallerLocals= compressArray(fCallerLocals);
		fMethodLocals= compressArray(fMethodLocals);
	}
	
	private IVariableBinding[] compressArray(IVariableBinding[] array) {
		if (array == null)
			return null;
		int size= 0;
		for (int i= 0; i < array.length; i++) {
			if (array[i] != null)
				size++;
		}
		if (size == array.length)
			return array;
		IVariableBinding[] result= new IVariableBinding[size];
		for (int i= 0, r= 0; i < array.length; i++) {
			if (array[i] != null)
				result[r++]= array[i];
		}
		return result;
	}

	//---- Change creation ----------------------------------------------------------------------------------

	public void aboutToCreateChange() {
	}

	//---- Exceptions -----------------------------------------------------------------------------------------

	public ITypeBinding[] getExceptions(boolean includeRuntimeExceptions) {
		if (includeRuntimeExceptions)
			return fAllExceptions;
		List result= new ArrayList(fAllExceptions.length);
		for (int i= 0; i < fAllExceptions.length; i++) {
			ITypeBinding exception= fAllExceptions[i];
			if (!includeRuntimeExceptions && Bindings.isRuntimeException(exception))
				continue;
			result.add(exception);
		}
		return (ITypeBinding[]) result.toArray(new ITypeBinding[result.size()]);
	}

	private void computeExceptions() {
		fAllExceptions= ExceptionAnalyzer.perform(getSelectedNodes());
	}

	//---- Special visitor methods ---------------------------------------------------------------------------

	protected void handleNextSelectedNode(ASTNode node) {
		super.handleNextSelectedNode(node);
		checkParent(node);
	}

	protected boolean handleSelectionEndsIn(ASTNode node) {
		invalidSelection(RefactoringCoreMessages.StatementAnalyzer_doesNotCover, JavaStatusContext.create(fCUnit, node));
		return super.handleSelectionEndsIn(node);
	}

	private void checkParent(ASTNode node) {
		ASTNode firstParent= getFirstSelectedNode().getParent();
		do {
			node= node.getParent();
			if (node == firstParent)
				return;
		} while (node != null);
		invalidSelection(RefactoringCoreMessages.ExtractMethodAnalyzer_parent_mismatch);
	}*/

	public Boolean caseSource(Source node) {
		RefactoringStatus status= getStatus();
		if (status.hasFatalError())
			return super.caseSource(node);
		if (!hasSelectedNodes()) {
			/*Node coveringNode= getLastCoveringNode();
			if (coveringNode instanceof BlockStatement && (coveringNode.eContainer()) instanceof FunctionExpression) {
				FunctionExpression methodDecl= (FunctionExpression)coveringNode.eContainer();
				Message[] messages= ASTNodes.getMessages(methodDecl, ASTNodes.NODE_ONLY);
				if (messages.length > 0) {
					status.addFatalError(Messages.format(
						RefactoringCoreMessages.ExtractMethodAnalyzer_compile_errors,
						BasicElementLabels.getJavaElementName(methodDecl.getName().getIdentifier())), JavaStatusContext.create(fCUnit, methodDecl));
					break superCall;
				}
			}*/
			status.addFatalError(RefactoringCoreMessages.ExtractMethodAnalyzer_only_method_body);
			return super.caseSource(node);
		}
		Node cur = (Node)getFirstSelectedNode();
		boolean ok = true;
		while (ok) {
			cur = (Node)cur.eContainer();
			switch(cur.eClass().getClassifierID()) {
			case DomPackage.FUNCTION_EXPRESSION:
			case DomPackage.GETTER_ASSIGNMENT:
			case DomPackage.SETTER_ASSIGNMENT:
			case DomPackage.SOURCE:
				ok = false;
			}
		}
		fEnclosingNode = cur;
		/*if (fEnclosingNode == null ||
				(fEnclosingNode.getNodeType() != ASTNode.METHOD_DECLARATION &&
				 fEnclosingNode.getNodeType() != ASTNode.FIELD_DECLARATION &&
				 fEnclosingNode.getNodeType() != ASTNode.INITIALIZER)) {
			status.addFatalError(RefactoringCoreMessages.ExtractMethodAnalyzer_only_method_body);
			break superCall;
		} else if (ASTNodes.getEnclosingType(fEnclosingNode) == null) {
			status.addFatalError(RefactoringCoreMessages.ExtractMethodAnalyzer_compile_errors_no_parent_binding);
			break superCall;
		} else if (fEnclosingNode.getNodeType() == ASTNode.METHOD_DECLARATION) {
			fEnclosingMethodBinding= ((MethodDeclaration)fEnclosingNode).resolveBinding();
		}*/
		if (!isSingleExpressionOrStatementSet()) {
			status.addFatalError(RefactoringCoreMessages.ExtractMethodAnalyzer_single_expression_or_set);
			return super.caseSource(node);
		}
		/*if (isExpressionSelected()) {
			Node expression= getFirstSelectedNode();
			if (expression instanceof VariableReference) {
				VariableReference name= (VariablerReference)expression;
				if (name.resolveBinding() instanceof ITypeBinding) {
					status.addFatalError(RefactoringCoreMessages.ExtractMethodAnalyzer_cannot_extract_type_reference);
					break superCall;
				}
				if (name.resolveBinding() instanceof IMethodBinding) {
					status.addFatalError(RefactoringCoreMessages.ExtractMethodAnalyzer_cannot_extract_method_name_reference);
					break superCall;
				}
				if (name.resolveBinding() instanceof IVariableBinding) {
					StructuralPropertyDescriptor locationInParent= name.getLocationInParent();
					if (locationInParent == QualifiedName.NAME_PROPERTY || (locationInParent == FieldAccess.NAME_PROPERTY && !(((FieldAccess) name.getParent()).getExpression() instanceof ThisExpression)))  {
						status.addFatalError(RefactoringCoreMessages.ExtractMethodAnalyzer_cannot_extract_part_of_qualified_name);
						break superCall;
					}
				}
				if (name.isSimpleName() && ((SimpleName)name).isDeclaration()) {
					status.addFatalError(RefactoringCoreMessages.ExtractMethodAnalyzer_cannot_extract_name_in_declaration);
					break superCall;
				}
			}
			fForceStatic=
				ASTNodes.getParent(expression, ASTNode.SUPER_CONSTRUCTOR_INVOCATION) != null ||
				ASTNodes.getParent(expression, ASTNode.CONSTRUCTOR_INVOCATION) != null;
		}*/
		//status.merge(LocalTypeAnalyzer.perform(fEnclosingNode, getSelection()));
		computeLastStatementSelected();
		return super.caseSource(node);
	}

	/*public boolean visit(AnonymousClassDeclaration node) {
		boolean result= super.visit(node);
		if (isFirstSelectedNode(node)) {
			invalidSelection(RefactoringCoreMessages.ExtractMethodAnalyzer_cannot_extract_anonymous_type, JavaStatusContext.create(fCUnit, node));
			return false;
		}
		return result;
	}

	public boolean visit(Assignment node) {
		boolean result= super.visit(node);
		if (getSelection().getVisitSelectionMode(node.getLeftHandSide()) == Selection.SELECTED) {
			invalidSelection(
				RefactoringCoreMessages.ExtractMethodAnalyzer_leftHandSideOfAssignment,
				JavaStatusContext.create(fCUnit, node));
			return false;
		}
		return result;
	}

	public boolean visit(DoStatement node) {
		boolean result= super.visit(node);

		try {
			int actionStart= getTokenScanner().getTokenEndOffset(ITerminalSymbols.TokenNamedo, node.getStartPosition());
			if (getSelection().getOffset() == actionStart) {
				invalidSelection(RefactoringCoreMessages.ExtractMethodAnalyzer_after_do_keyword, JavaStatusContext.create(fCUnit, getSelection()));
				return false;
			}
		} catch (CoreException e) {
			// ignore
		}

		return result;
	}

	public boolean visit(MethodDeclaration node) {
		Block body= node.getBody();
		if (body == null)
			return false;
		Selection selection= getSelection();
		int nodeStart= body.getStartPosition();
		int nodeExclusiveEnd= nodeStart + body.getLength();
		// if selection node inside of the method body ignore method
		if (!(nodeStart < selection.getOffset() && selection.getExclusiveEnd() < nodeExclusiveEnd))
			return false;
		return super.visit(node);
	}

	public boolean visit(ConstructorInvocation node) {
		return visitConstructorInvocation(node, super.visit(node));
	}

	public boolean visit(SuperConstructorInvocation node) {
		return visitConstructorInvocation(node, super.visit(node));
	}

	private boolean visitConstructorInvocation(ASTNode node, boolean superResult) {
		if (getSelection().getVisitSelectionMode(node) == Selection.SELECTED) {
			invalidSelection(RefactoringCoreMessages.ExtractMethodAnalyzer_super_or_this, JavaStatusContext.create(fCUnit, node));
			return false;
		}
		return superResult;
	}

	public boolean visit(VariableDeclarationFragment node) {
		boolean result= super.visit(node);
		if (isFirstSelectedNode(node)) {
			invalidSelection(RefactoringCoreMessages.ExtractMethodAnalyzer_cannot_extract_variable_declaration_fragment, JavaStatusContext.create(fCUnit, node));
			return false;
		}
		return result;
	}

	public void endVisit(ForStatement node) {
		if (getSelection().getEndVisitSelectionMode(node) == Selection.AFTER) {
			if (node.initializers().contains(getFirstSelectedNode())) {
				invalidSelection(RefactoringCoreMessages.ExtractMethodAnalyzer_cannot_extract_for_initializer, JavaStatusContext.create(fCUnit, getSelection()));
			} else if (node.updaters().contains(getLastSelectedNode())) {
				invalidSelection(RefactoringCoreMessages.ExtractMethodAnalyzer_cannot_extract_for_updater, JavaStatusContext.create(fCUnit, getSelection()));
			}
		}
		super.endVisit(node);
	}

	public void endVisit(VariableDeclarationExpression node) {
		checkTypeInDeclaration(node.getType());
		super.endVisit(node);
	}

	public void endVisit(VariableDeclarationStatement node) {
		checkTypeInDeclaration(node.getType());
		super.endVisit(node);
	}

	private boolean isFirstSelectedNode(ASTNode node) {
		return getSelection().getVisitSelectionMode(node) == Selection.SELECTED && getFirstSelectedNode() == node;
	}

	private void checkTypeInDeclaration(Type node) {
		if (getSelection().getEndVisitSelectionMode(node) == Selection.SELECTED && getFirstSelectedNode() == node) {
			invalidSelection(RefactoringCoreMessages.ExtractMethodAnalyzer_cannot_extract_variable_declaration, JavaStatusContext.create(fCUnit, getSelection()));
		}
	}*/

	private boolean isSingleExpressionOrStatementSet() {
		Node first= getFirstSelectedNode();
		if (first == null)
			return true;
		if (first instanceof Expression && getSelectedNodes().length != 1)
			return false;
		return true;
	}
}

