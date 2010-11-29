/*******************************************************************************
 * Copyright (c) 2000, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.corext.refactoring.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.manipulation.RefactoringChecks;
import org.eclipse.dltk.core.manipulation.SourceModuleChange;
import org.eclipse.dltk.internal.corext.refactoring.ScriptRefactoringDescriptor;
import org.eclipse.dltk.internal.corext.refactoring.util.ResourceUtil;
import org.eclipse.dltk.internal.javascript.core.manipulation.JavascriptManipulationPlugin;
import org.eclipse.dltk.internal.javascript.core.manipulation.Messages;
import org.eclipse.dltk.internal.javascript.corext.refactoring.Checks;
import org.eclipse.dltk.internal.javascript.corext.refactoring.RefactoringCoreMessages;
import org.eclipse.dltk.javascript.core.dom.BlockStatement;
import org.eclipse.dltk.javascript.core.dom.DomFactory;
import org.eclipse.dltk.javascript.core.dom.DomPackage;
import org.eclipse.dltk.javascript.core.dom.Expression;
import org.eclipse.dltk.javascript.core.dom.ExpressionStatement;
import org.eclipse.dltk.javascript.core.dom.Identifier;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.Source;
import org.eclipse.dltk.javascript.core.dom.Statement;
import org.eclipse.dltk.javascript.core.dom.VariableDeclaration;
import org.eclipse.dltk.javascript.core.dom.VariableReference;
import org.eclipse.dltk.javascript.core.dom.VariableStatement;
import org.eclipse.dltk.javascript.core.dom.rewrite.ASTConverter;
import org.eclipse.dltk.javascript.core.dom.rewrite.NodeFinder;
import org.eclipse.dltk.javascript.core.dom.rewrite.RewriteAnalyzer;
import org.eclipse.dltk.javascript.core.dom.rewrite.VariableLookup;
import org.eclipse.dltk.javascript.core.refactoring.descriptors.ExtractLocalDescriptor;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.Refactoring;
import org.eclipse.ltk.core.refactoring.RefactoringChangeDescriptor;
import org.eclipse.ltk.core.refactoring.RefactoringDescriptor;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.text.edits.TextEditGroup;

/**
 * Extract Local Variable (from selected expression inside method or
 * initializer).
 */
public class ExtractTempRefactoring extends Refactoring {

	//private static final String ATTRIBUTE_REPLACE = "replace"; //$NON-NLS-1$
	//private static final String ATTRIBUTE_FINAL = "final"; //$NON-NLS-1$

	/*private static final class ForStatementChecker extends ASTVisitor {

		private final Collection fForInitializerVariables;

		private boolean fReferringToForVariable = false;

		public ForStatementChecker(Collection forInitializerVariables) {
			Assert.isNotNull(forInitializerVariables);
			fForInitializerVariables = forInitializerVariables;
		}

		public boolean isReferringToForVariable() {
			return fReferringToForVariable;
		}

		public boolean visit(SimpleName node) {
			IBinding binding = node.resolveBinding();
			if (binding != null && fForInitializerVariables.contains(binding)) {
				fReferringToForVariable = true;
			}
			return false;
		}
	}

	private static boolean allArraysEqual(Object[][] arrays, int position) {
		Object element = arrays[0][position];
		for (int i = 0; i < arrays.length; i++) {
			Object[] array = arrays[i];
			if (!element.equals(array[position]))
				return false;
		}
		return true;
	}

	private static boolean canReplace(IASTFragment fragment) {
		ASTNode node = fragment.getAssociatedNode();
		ASTNode parent = node.getParent();
		if (parent instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment vdf = (VariableDeclarationFragment) parent;
			if (node.equals(vdf.getName()))
				return false;
		}
		if (isMethodParameter(node))
			return false;
		if (isThrowableInCatchBlock(node))
			return false;
		if (parent instanceof ExpressionStatement)
			return false;
		if (isLeftValue(node))
			return false;
		if (isReferringToLocalVariableFromFor((Expression) node))
			return false;
		if (isUsedInForInitializerOrUpdater((Expression) node))
			return false;
		if (parent instanceof SwitchCase)
			return false;
		return true;
	}

	private static Object[] getArrayPrefix(Object[] array, int prefixLength) {
		Assert.isTrue(prefixLength <= array.length);
		Assert.isTrue(prefixLength >= 0);
		Object[] prefix = new Object[prefixLength];
		for (int i = 0; i < prefix.length; i++) {
			prefix[i] = array[i];
		}
		return prefix;
	}

	// return List<IVariableBinding>
	private static List getForInitializedVariables(
			VariableDeclarationExpression variableDeclarations) {
		List forInitializerVariables = new ArrayList(1);
		for (Iterator iter = variableDeclarations.fragments().iterator(); iter
				.hasNext();) {
			VariableDeclarationFragment fragment = (VariableDeclarationFragment) iter
					.next();
			IVariableBinding binding = fragment.resolveBinding();
			if (binding != null)
				forInitializerVariables.add(binding);
		}
		return forInitializerVariables;
	}

	private static Object[] getLongestArrayPrefix(Object[][] arrays) {
		int length = -1;
		if (arrays.length == 0)
			return new Object[0];
		int minArrayLength = arrays[0].length;
		for (int i = 1; i < arrays.length; i++)
			minArrayLength = Math.min(minArrayLength, arrays[i].length);

		for (int i = 0; i < minArrayLength; i++) {
			if (!allArraysEqual(arrays, i))
				break;
			length++;
		}
		if (length == -1)
			return new Object[0];
		return getArrayPrefix(arrays[0], length + 1);
	}

	private static ASTNode[] getParents(ASTNode node) {
		ASTNode current = node;
		List parents = new ArrayList();
		do {
			parents.add(current.getParent());
			current = current.getParent();
		} while (current.getParent() != null);
		Collections.reverse(parents);
		return (ASTNode[]) parents.toArray(new ASTNode[parents.size()]);
	}

	private static boolean isLeftValue(ASTNode node) {
		ASTNode parent = node.getParent();
		if (parent instanceof Assignment) {
			Assignment assignment = (Assignment) parent;
			if (assignment.getLeftHandSide() == node)
				return true;
		}
		if (parent instanceof PostfixExpression)
			return true;
		if (parent instanceof PrefixExpression) {
			PrefixExpression.Operator op = ((PrefixExpression) parent)
					.getOperator();
			if (op.equals(PrefixExpression.Operator.DECREMENT))
				return true;
			if (op.equals(PrefixExpression.Operator.INCREMENT))
				return true;
			return false;
		}
		return false;
	}

	private static boolean isMethodParameter(ASTNode node) {
		return (node instanceof SimpleName)
				&& (node.getParent() instanceof SingleVariableDeclaration)
				&& (node.getParent().getParent() instanceof MethodDeclaration);
	}*/

	/*private static boolean isThrowableInCatchBlock(ASTNode node) {
		return (node instanceof SimpleName)
				&& (node.getParent() instanceof SingleVariableDeclaration)
				&& (node.getParent().getParent() instanceof CatchClause);
	}*/

	private static boolean isUsedInFor(Expression expression) {
		EStructuralFeature sf = expression.eContainingFeature();
		if (sf == DomPackage.eINSTANCE.getForStatement_Initialization()) return true;
		if (sf == DomPackage.eINSTANCE.getForStatement_Condition()) return true;
		if (sf == DomPackage.eINSTANCE.getForStatement_Increment()) return true;
		if (sf == DomPackage.eINSTANCE.getForInStatement_Item()) return true;
		if (sf == DomPackage.eINSTANCE.getForEachInStatement_Item()) return true;
		return false;
	}

	/*private static IASTFragment[] retainOnlyReplacableMatches(
			IASTFragment[] allMatches) {
		List result = new ArrayList(allMatches.length);
		for (int i = 0; i < allMatches.length; i++) {
			if (canReplace(allMatches[i]))
				result.add(allMatches[i]);
		}
		return (IASTFragment[]) result.toArray(new IASTFragment[result.size()]);
	}*/

	private Source fCompilationUnitNode;

	//private CompilationUnitRewrite fCURewrite;

	private ISourceModule fCu;
	private String fSource;

	//private boolean fDeclareFinal;

	private String[] fExcludedVariableNames;

	private boolean fReplaceAllOccurrences;

	// caches:
	private Expression fSelectedExpression;

	private int fSelectionLength;

	private int fSelectionStart;

	private String fTempName;
	/*private String[] fGuessedTempNames;

	private boolean fCheckResultForCompileProblems;*/

	private SourceModuleChange fChange;

	//private LinkedProposalModel fLinkedProposalModel;

	//private static final String KEY_NAME = "name"; //$NON-NLS-1$
	//private static final String KEY_TYPE = "type"; //$NON-NLS-1$

	/**
	 * Creates a new extract temp refactoring
	 * 
	 * @param unit
	 *            the compilation unit, or <code>null</code> if invoked by
	 *            scripting
	 * @param selectionStart
	 *            start of selection
	 * @param selectionLength
	 *            length of selection
	 */
	public ExtractTempRefactoring(ISourceModule unit, int selectionStart,
			int selectionLength) {
		Assert.isTrue(selectionStart >= 0);
		Assert.isTrue(selectionLength >= 0);
		fSelectionStart = selectionStart;
		fSelectionLength = selectionLength;
		fCu = unit;
		fCompilationUnitNode = null;

		fReplaceAllOccurrences = true; // default
		//fDeclareFinal = false; // default
		fTempName = ""; //$NON-NLS-1$

		//fLinkedProposalModel = null;
		//fCheckResultForCompileProblems = true;
	}

	/*public ExtractTempRefactoring(CompilationUnit astRoot, int selectionStart,
			int selectionLength) {
		Assert.isTrue(selectionStart >= 0);
		Assert.isTrue(selectionLength >= 0);
		Assert.isTrue(astRoot.getTypeRoot() instanceof ISourceModule);

		fSelectionStart = selectionStart;
		fSelectionLength = selectionLength;
		fCu = (ISourceModule) astRoot.getTypeRoot();
		fCompilationUnitNode = astRoot;

		fReplaceAllOccurrences = true; // default
		fDeclareFinal = false; // default
		fTempName = ""; //$NON-NLS-1$

		fLinkedProposalModel = null;
		fCheckResultForCompileProblems = true;
	}

	public ExtractTempRefactoring(JavaRefactoringArguments arguments,
			RefactoringStatus status) {
		this((ISourceModule) null, 0, 0);
		RefactoringStatus initializeStatus = initialize(arguments);
		status.merge(initializeStatus);
	}

	public void setCheckResultForCompileProblems(
			boolean checkResultForCompileProblems) {
		fCheckResultForCompileProblems = checkResultForCompileProblems;
	}

	public void setLinkedProposalModel(LinkedProposalModel linkedProposalModel) {
		fLinkedProposalModel = linkedProposalModel;
	}

	private void addReplaceExpressionWithTemp() throws JavaModelException {
		IASTFragment[] fragmentsToReplace = retainOnlyReplacableMatches(getMatchingFragments());
		// TODO: should not have to prune duplicates here...
		ASTRewrite rewrite = fCURewrite.getASTRewrite();
		HashSet seen = new HashSet();
		for (int i = 0; i < fragmentsToReplace.length; i++) {
			IASTFragment fragment = fragmentsToReplace[i];
			if (!seen.add(fragment))
				continue;
			SimpleName tempName = fCURewrite.getAST().newSimpleName(fTempName);
			TextEditGroup description = fCURewrite
					.createGroupDescription(RefactoringCoreMessages.ExtractTempRefactoring_replace);

			fragment.replace(rewrite, tempName, description);
			if (fLinkedProposalModel != null)
				fLinkedProposalModel.getPositionGroup(KEY_NAME, true)
						.addPosition(rewrite.track(tempName), false);
		}
	}*/

	// !! Same as in ExtractConstantRefactoring
	/*private RefactoringStatus checkExpressionFragmentIsRValue() throws ModelException {
		switch (Checks.checkExpressionIsRValue(getSelectedExpression()
				.getAssociatedExpression())) {
		case Checks.NOT_RVALUE_MISC:
			return RefactoringStatus
					.createStatus(
							RefactoringStatus.FATAL,
							RefactoringCoreMessages.ExtractTempRefactoring_select_expression,
							null, Corext.getPluginId(),
							RefactoringStatusCodes.EXPRESSION_NOT_RVALUE, null);
		case Checks.NOT_RVALUE_VOID:
			return RefactoringStatus.createStatus(RefactoringStatus.FATAL,
					RefactoringCoreMessages.ExtractTempRefactoring_no_void,
					null, Corext.getPluginId(),
					RefactoringStatusCodes.EXPRESSION_NOT_RVALUE_VOID, null);
		case Checks.IS_RVALUE_GUESSED:
		case Checks.IS_RVALUE:
			return new RefactoringStatus();
		default:
			Assert.isTrue(false);
			return null;
		}
	}*/

	/*private ITypeBinding guessBindingForReference(Expression expression) {
		ITypeBinding binding = expression.resolveTypeBinding();
		if (binding == null) {
			binding = ASTResolving.guessBindingForReference(expression);
		}
		return binding;
	}*/

	public RefactoringStatus checkFinalConditions(IProgressMonitor pm)
			throws CoreException {
		try {
			pm.beginTask(
					RefactoringCoreMessages.ExtractTempRefactoring_checking_preconditions,
					4);
			ChangeRecorder cr = new ChangeRecorder(fCompilationUnitNode);
			// Expression
			Expression selected = getSelectedExpression();
			Expression[] expressions;
			if (fReplaceAllOccurrences) {
				expressions = findSimilarExpressions(selected);
			} else {
				expressions = new Expression[]{ selected };
			}
			// Statement
			Statement stmt = findFirstStatement(expressions[0],expressions[expressions.length-1]);
			EReference stmtRef = stmt.eContainmentFeature();
			// Expression -> Reference
			for(Expression expr : expressions) {
				Identifier refId = DomFactory.eINSTANCE.createIdentifier();
				refId.setName(fTempName);
				VariableReference varRef = DomFactory.eINSTANCE.createVariableReference();
				varRef.setVariable(refId);
				EReference exprRef = expr.eContainmentFeature();
				if (exprRef.isMany()) {
					EList<Expression> exprList = (EList<Expression>)expr.eContainer().eGet(exprRef);
					exprList.set(exprList.lastIndexOf(expr), varRef);
				} else {
					expr.eContainer().eSet(exprRef, varRef);
				}
			}
			// Declaration
			Identifier declId = DomFactory.eINSTANCE.createIdentifier();
			declId.setName(fTempName);
			VariableDeclaration decl = DomFactory.eINSTANCE.createVariableDeclaration();
			decl.setIdentifier(declId);
			decl.setInitializer(selected);
			VariableStatement varStmt = DomFactory.eINSTANCE.createVariableStatement();
			varStmt.getDeclarations().add(decl);
			// << Declaration
			if (stmtRef.isMany()) {
				EList<Statement> stmtList = (EList<Statement>)stmt.eContainer().eGet(stmtRef);
				stmtList.add(stmtList.lastIndexOf(stmt), varStmt);
			} else {
				BlockStatement block = DomFactory.eINSTANCE.createBlockStatement();
				block.getStatements().add(varStmt);
				stmt.eContainer().eSet(stmtRef, block);
				block.getStatements().add(stmt);
			}
			ChangeDescription cd = cr.endRecording();
			final SourceModuleChange change = new SourceModuleChange(RefactoringCoreMessages.ExtractTempRefactoring_name, fCu);
			final TextEditGroup addDecl = new TextEditGroup(RefactoringCoreMessages.ExtractTempRefactoring_declare_local_variable);
			RewriteAnalyzer ra = new RewriteAnalyzer(cd, fCu.getSource()) {
				@Override
				protected void addEdit(TextEdit edit, Node node) {
					if (node instanceof VariableReference)
						change.addTextEditGroup(new TextEditGroup(RefactoringCoreMessages.ExtractTempRefactoring_replace, edit));
					else
						addDecl.addTextEdit(edit);
					super.addEdit(edit, node);
				}
			};
			change.setEdit(ra.getEdit());
			ra.rewrite(fCompilationUnitNode);
			change.addTextEditGroup(addDecl);
			cd.apply();
			fChange = change;
			return new RefactoringStatus();
		} finally {
			pm.done();
		}
	}
	
	private static Expression[] findSimilarExpressions(Expression expr) {
		List<Expression> res = new ArrayList<Expression>();
		Node root = (Node)expr.eContainer();
		while (true) {
			int cl = root.eClass().getClassifierID();
			if (cl == DomPackage.GETTER_ASSIGNMENT
					|| cl == DomPackage.SETTER_ASSIGNMENT
					|| cl == DomPackage.FUNCTION_EXPRESSION
					|| cl == DomPackage.SOURCE) break;
			root = (Node)root.eContainer();
		}
		Set<Identifier> set = new HashSet<Identifier>();
		set.addAll(VariableLookup.findReferences(root, VariableLookup.getVisibleNames(expr)));
		TreeIterator<EObject> it = root.eAllContents();
		while(it.hasNext()) {
			Node cur = (Node)it.next();
			if (match(expr,cur,set)) {
				res.add((Expression)cur);
				it.prune();
			}
		}
		return res.toArray(new Expression[res.size()]);
	}
	
	private static boolean match(Node one, Node another, Set<Identifier> resolved) {
		if (one == null)
			return another == null;
		EClass cl = one.eClass();
		if (cl != another.eClass()) {
			return false;
		}
		if (resolved.contains(one) != resolved.contains(another))
			return false;
		for(EAttribute attr : cl.getEAllAttributes()) {
			if (attr.getFeatureID() == DomPackage.NODE__BEGIN
					|| attr.getFeatureID() == DomPackage.NODE__END
					|| attr == DomPackage.eINSTANCE.getBinaryExpression_OperatorPosition()
					|| attr == DomPackage.eINSTANCE.getFunctionExpression_ParametersPosition()) continue;
			if (!one.eGet(attr).equals(another.eGet(attr)))
				return false;
		}
		for(EReference ref : cl.getEAllReferences()) {
			if (ref.isMany()) {
				List<? extends Node> first = (List<? extends Node>)one.eGet(ref);
				List<? extends Node> second = (List<? extends Node>)another.eGet(ref);
				if (first.size() != second.size())
					return false;
				for(int i=0;i<first.size();i++)
					if (!match(first.get(i),second.get(i),resolved))
						return false;
			} else
				if (!match((Node)one.eGet(ref),(Node)another.eGet(ref),resolved))
					return false;
		}
		return true;
	}
	
	private static Statement findFirstStatement(EObject first,EObject last) {
		int x = getDepth(first);
		int y = getDepth(last);
		while (x>y) {
			x--;
			first = first.eContainer();
		}
		while (y>x) {
			y--;
			last = last.eContainer();
		}
		while (first.eContainer() != last.eContainer()) {
			first = first.eContainer();
			last = last.eContainer();
		}
		while (first.eContainmentFeature().getEReferenceType() != DomPackage.eINSTANCE.getStatement())
			first = first.eContainer();
		return (Statement)first;
	}
	
	private static int getDepth(EObject node) {
		int i=0;
		while (node != null) {
			i++;
			node = node.eContainer();
		}
		return i;
	}
	
	private ExtractLocalDescriptor createRefactoringDescriptor() {
		String project = null;
		IScriptProject scriptProject = fCu.getScriptProject();
		if (scriptProject != null)
			project = scriptProject.getElementName();
		//final String description = Messages.format(RefactoringCoreMessages.ExtractTempRefactoring_descriptor_description_short,
		//				BasicElementLabels.getModelElementName(fTempName));
		final String description = Messages.format(RefactoringCoreMessages.ExtractTempRefactoring_descriptor_description_short,fTempName);
		//final String expression = ASTNodes.asString(fSelectedExpression.getAssociatedExpression());
		//final String header = Messages
		//		.format(RefactoringCoreMessages.ExtractTempRefactoring_descriptor_description,
		//				new String[] {
		//						BasicElementLabels
		//								.getJavaElementName(fTempName),
		//						BasicElementLabels
		//								.getJavaCodeString(expression) });
		//final ScriptRefactoringDescriptorComment comment = new JDTRefactoringDescriptorComment(
		//		project, this, header);
		//comment.addSetting(Messages.format(
		//		RefactoringCoreMessages.ExtractTempRefactoring_name_pattern,
		//		BasicElementLabels.getJavaElementName(fTempName)));
		//final BodyDeclaration decl = (BodyDeclaration) ASTNodes.getParent(
		//		fSelectedExpression.getAssociatedExpression(),
		//		BodyDeclaration.class);
		//if (decl instanceof MethodDeclaration) {
		//	final IMethodBinding method = ((MethodDeclaration) decl)
		//			.resolveBinding();
		//	final String label = method != null ? BindingLabelProvider
		//			.getBindingLabel(method,
		//					JavaElementLabels.ALL_FULLY_QUALIFIED)
		//			: BasicElementLabels
		//					.getJavaElementName('{' + JavaElementLabels.ELLIPSIS_STRING + '}');
		//	comment.addSetting(Messages
		//			.format(RefactoringCoreMessages.ExtractTempRefactoring_destination_pattern,
		//					label));
		//}
		//comment.addSetting(Messages
		//		.format(RefactoringCoreMessages.ExtractTempRefactoring_expression_pattern,
		//				BasicElementLabels.getJavaCodeString(expression)));
		//if (fReplaceAllOccurrences)
		//	comment.addSetting(RefactoringCoreMessages.ExtractTempRefactoring_replace_occurrences);
		//if (fDeclareFinal)
		//	comment.addSetting(RefactoringCoreMessages.ExtractTempRefactoring_declare_final);
		final Map arguments = new HashMap();
		arguments.put(ScriptRefactoringDescriptor.ATTRIBUTE_INPUT,
				ScriptRefactoringDescriptor.elementToHandle(project, fCu));
		arguments.put(ScriptRefactoringDescriptor.ATTRIBUTE_NAME, fTempName);
		arguments.put(ScriptRefactoringDescriptor.ATTRIBUTE_SELECTION,
				new Integer(fSelectionStart).toString()
						+ " " + new Integer(fSelectionLength).toString()); //$NON-NLS-1$
		//arguments.put(ATTRIBUTE_REPLACE, Boolean
		//		.valueOf(fReplaceAllOccurrences).toString());
		//arguments.put(ATTRIBUTE_FINAL, Boolean.valueOf(fDeclareFinal)
		//		.toString());
		final ExtractLocalDescriptor descriptor = new ExtractLocalDescriptor(project, description, /*comment.asString()*/ "", arguments, RefactoringDescriptor.NONE);
		return descriptor;
	}

	/*private void doCreateChange(IProgressMonitor pm) throws CoreException {
		try {
			pm.beginTask(
					RefactoringCoreMessages.ExtractTempRefactoring_checking_preconditions,
					1);
			try {
				createTempDeclaration();
			} catch (CoreException exception) {
				JavaPlugin.log(exception);
			}
			addReplaceExpressionWithTemp();
		} finally {
			pm.done();
		}
	}

	private void checkNewSource(SubProgressMonitor monitor,
			RefactoringStatus result) throws CoreException {
		String newCuSource = fChange
				.getPreviewContent(new NullProgressMonitor());
		CompilationUnit newCUNode = new RefactoringASTParser(AST.JLS3).parse(
				newCuSource, fCu, true, true, monitor);
		IProblem[] newProblems = RefactoringAnalyzeUtil
				.getIntroducedCompileProblems(newCUNode, fCompilationUnitNode);
		for (int i = 0; i < newProblems.length; i++) {
			IProblem problem = newProblems[i];
			if (problem.isError())
				result.addEntry(new RefactoringStatusEntry(
						(problem.isError() ? RefactoringStatus.ERROR
								: RefactoringStatus.WARNING), problem
								.getMessage(),
						new JavaStringStatusContext(newCuSource,
								SourceRangeFactory.create(problem))));
		}
	}*/

	public RefactoringStatus checkInitialConditions(IProgressMonitor pm)
			throws CoreException {
		try {
			pm.beginTask("", 6); //$NON-NLS-1$

			RefactoringStatus result = RefactoringChecks.validateModifiesFiles(
					ResourceUtil.getFiles(new ISourceModule[] { fCu }),
					getValidationContext());
			if (result.hasFatalError())
				return result;

			if (fCompilationUnitNode == null) {
				fCompilationUnitNode = (Source)ASTConverter.convert(JavaScriptParserUtil.parse(fCu));
			}
			pm.worked(3);

			fSource = fCu.getSource();
			result.merge(checkSelection(new SubProgressMonitor(pm, 3)));
			//if (!result.hasFatalError() && isLiteralNodeSelected())
			//	fReplaceAllOccurrences = false;
			return result;

		} finally {
			pm.done();
		}
	}

	/*private RefactoringStatus checkMatchingFragments()
			throws JavaModelException {
		RefactoringStatus result = new RefactoringStatus();
		IASTFragment[] matchingFragments = getMatchingFragments();
		for (int i = 0; i < matchingFragments.length; i++) {
			ASTNode node = matchingFragments[i].getAssociatedNode();
			if (isLeftValue(node)
					&& !isReferringToLocalVariableFromFor((Expression) node)) {
				String msg = RefactoringCoreMessages.ExtractTempRefactoring_assigned_to;
				result.addWarning(msg, JavaStatusContext.create(fCu, node));
			}
		}
		return result;
	}*/

	private RefactoringStatus checkSelection(IProgressMonitor pm) throws ModelException {
		try {
			pm.beginTask("", 2); //$NON-NLS-1$

			Expression selectedExpression = getSelectedExpression();

			if (selectedExpression == null) {
				String message = RefactoringCoreMessages.ExtractTempRefactoring_select_expression;
				//return CodeRefactoringUtil.checkMethodSyntaxErrors(
				//		fSelectionStart, fSelectionLength,
				//		fCompilationUnitNode, message);
				return RefactoringStatus.createFatalErrorStatus(message);
			}
			pm.worked(1);

			if (isUsedInFor(getSelectedExpression()))
				return RefactoringStatus
						.createFatalErrorStatus(RefactoringCoreMessages.ExtractTempRefactoring_for_initializer_updater);
			pm.worked(1);

			return new RefactoringStatus();
		} finally {
			pm.done();
		}
	}

	public RefactoringStatus checkTempName(String newName) {
		RefactoringStatus status = Checks.validateIdentifier(newName);
		if (status.hasFatalError())
			return status;
		if (Arrays.asList(getExcludedVariableNames()).contains(newName))
			status.addWarning(Messages
					.format(RefactoringCoreMessages.ExtractTempRefactoring_another_variable,
							newName /*BasicElementLabels.getJavaElementName(newName)*/));
		return status;
	}

	/*private void createAndInsertTempDeclaration() throws CoreException {
		Expression initializer = getSelectedExpression().createCopyTarget(
				fCURewrite.getASTRewrite(), true);
		VariableDeclarationStatement vds = createTempDeclaration(initializer);

		if ((!fReplaceAllOccurrences)
				|| (retainOnlyReplacableMatches(getMatchingFragments()).length <= 1)) {
			insertAt(getSelectedExpression().getAssociatedNode(), vds);
			return;
		}

		ASTNode[] firstReplaceNodeParents = getParents(getFirstReplacedExpression()
				.getAssociatedNode());
		ASTNode[] commonPath = findDeepestCommonSuperNodePathForReplacedNodes();
		Assert.isTrue(commonPath.length <= firstReplaceNodeParents.length);

		ASTNode deepestCommonParent = firstReplaceNodeParents[commonPath.length - 1];
		if (deepestCommonParent instanceof Block)
			insertAt(firstReplaceNodeParents[commonPath.length], vds);
		else
			insertAt(deepestCommonParent, vds);
	}

	private VariableDeclarationStatement createTempDeclaration(
			Expression initializer) throws CoreException {
		AST ast = fCURewrite.getAST();

		VariableDeclarationFragment vdf = ast.newVariableDeclarationFragment();
		vdf.setName(ast.newSimpleName(fTempName));
		vdf.setInitializer(initializer);

		VariableDeclarationStatement vds = ast
				.newVariableDeclarationStatement(vdf);
		if (fDeclareFinal) {
			vds.modifiers().add(ast.newModifier(ModifierKeyword.FINAL_KEYWORD));
		}
		vds.setType(createTempType());

		if (fLinkedProposalModel != null) {
			ASTRewrite rewrite = fCURewrite.getASTRewrite();
			LinkedProposalPositionGroup nameGroup = fLinkedProposalModel
					.getPositionGroup(KEY_NAME, true);
			nameGroup.addPosition(rewrite.track(vdf.getName()), true);

			String[] nameSuggestions = guessTempNames();
			if (nameSuggestions.length > 0
					&& !nameSuggestions[0].equals(fTempName)) {
				nameGroup.addProposal(fTempName, null,
						nameSuggestions.length + 1);
			}
			for (int i = 0; i < nameSuggestions.length; i++) {
				nameGroup.addProposal(nameSuggestions[i], null,
						nameSuggestions.length - i);
			}
		}
		return vds;
	}

	private void insertAt(ASTNode target, Statement declaration) {
		ASTRewrite rewrite = fCURewrite.getASTRewrite();
		TextEditGroup groupDescription = fCURewrite
				.createGroupDescription(RefactoringCoreMessages.ExtractTempRefactoring_declare_local_variable);

		ASTNode parent = target.getParent();
		StructuralPropertyDescriptor locationInParent = target
				.getLocationInParent();
		while (locationInParent != Block.STATEMENTS_PROPERTY
				&& locationInParent != SwitchStatement.STATEMENTS_PROPERTY) {
			if (locationInParent == IfStatement.THEN_STATEMENT_PROPERTY
					|| locationInParent == IfStatement.ELSE_STATEMENT_PROPERTY
					|| locationInParent == ForStatement.BODY_PROPERTY
					|| locationInParent == EnhancedForStatement.BODY_PROPERTY
					|| locationInParent == DoStatement.BODY_PROPERTY
					|| locationInParent == WhileStatement.BODY_PROPERTY) {
				// create intermediate block if target was the body property of
				// a control statement:
				Block replacement = rewrite.getAST().newBlock();
				ListRewrite replacementRewrite = rewrite.getListRewrite(
						replacement, Block.STATEMENTS_PROPERTY);
				replacementRewrite.insertFirst(declaration, null);
				replacementRewrite.insertLast(rewrite.createMoveTarget(target),
						null);
				rewrite.replace(target, replacement, groupDescription);
				return;
			}
			target = parent;
			parent = parent.getParent();
			locationInParent = target.getLocationInParent();
		}
		ListRewrite listRewrite = rewrite.getListRewrite(parent,
				(ChildListPropertyDescriptor) locationInParent);
		listRewrite.insertBefore(declaration, target, groupDescription);
	}*/

	public Change createChange(IProgressMonitor pm) throws CoreException {
		try {
			pm.beginTask(
					RefactoringCoreMessages.ExtractTempRefactoring_checking_preconditions,
					1);

			ExtractLocalDescriptor descriptor = createRefactoringDescriptor();
			fChange.setDescriptor(new RefactoringChangeDescriptor(descriptor));
			return fChange;
		} finally {
			pm.done();
		}
	}

	private String[] getExcludedVariableNames() {
		if (fExcludedVariableNames == null) {
			try {
				//ScopeLookup look = new ScopeLookup();
				//look.findNamesInScope(getSelectedExpression());
				Set<String> visible = VariableLookup.getVisibleNames(getSelectedExpression());
				fExcludedVariableNames = visible.toArray(new String[visible.size()]);
			} catch (ModelException e) {
				JavascriptManipulationPlugin.log(e); //who cares, but still
				fExcludedVariableNames = new String[0];
			}
		}
		return fExcludedVariableNames;
	}

	/*private IExpressionFragment getFirstReplacedExpression()
			throws JavaModelException {
		if (!fReplaceAllOccurrences)
			return getSelectedExpression();
		IASTFragment[] nodesToReplace = retainOnlyReplacableMatches(getMatchingFragments());
		if (nodesToReplace.length == 0)
			return getSelectedExpression();
		Comparator comparator = new Comparator() {

			public int compare(Object o1, Object o2) {
				return ((IASTFragment) o1).getStartPosition()
						- ((IASTFragment) o2).getStartPosition();
			}
		};
		Arrays.sort(nodesToReplace, comparator);
		return (IExpressionFragment) nodesToReplace[0];
	}

	private IASTFragment[] getMatchingFragments() throws JavaModelException {
		if (fReplaceAllOccurrences) {
			IASTFragment[] allMatches = ASTFragmentFactory
					.createFragmentForFullSubtree(getEnclosingBodyNode())
					.getSubFragmentsMatching(getSelectedExpression());
			return allMatches;
		} else
			return new IASTFragment[] { getSelectedExpression() };
	}

	private ASTNode[] getMatchNodes() throws JavaModelException {
		IASTFragment[] matches = retainOnlyReplacableMatches(getMatchingFragments());
		ASTNode[] result = new ASTNode[matches.length];
		for (int i = 0; i < matches.length; i++)
			result[i] = matches[i].getAssociatedNode();
		return result;
	}*/

	public String getName() {
		return RefactoringCoreMessages.ExtractTempRefactoring_name;
	}

	private Expression getSelectedExpression() throws ModelException {
		if (fSelectedExpression != null)
			return fSelectedExpression;
		Node node = NodeFinder.findExpression(fCompilationUnitNode, fSelectionStart, fSelectionStart+fSelectionLength);
		if (node == null) return null;
		for(int i=fSelectionStart;i<node.getBegin();i++)
			if (!Character.isWhitespace(fSource.charAt(i))) return null;
		for(int i=node.getEnd();i<fSelectionStart+fSelectionLength;i++)
			if (!Character.isWhitespace(fSource.charAt(i))) return null;
		if (node instanceof ExpressionStatement)
			return fSelectedExpression = ((ExpressionStatement)node).getExpression();
		if (node instanceof Expression)
			return fSelectedExpression = (Expression)node;
		return null;
		/*IASTFragment selectedFragment = ASTFragmentFactory
				.createFragmentForSourceRange(new SourceRange(fSelectionStart,
						fSelectionLength), fCompilationUnitNode, fCu);

		if (selectedFragment instanceof IExpressionFragment
				&& !Checks
						.isInsideJavadoc(selectedFragment.getAssociatedNode())) {
			fSelectedExpression = (IExpressionFragment) selectedFragment;
		} else if (selectedFragment != null) {
			if (selectedFragment.getAssociatedNode() instanceof ExpressionStatement) {
				ExpressionStatement exprStatement = (ExpressionStatement) selectedFragment
						.getAssociatedNode();
				Expression expression = exprStatement.getExpression();
				fSelectedExpression = (IExpressionFragment) ASTFragmentFactory
						.createFragmentForFullSubtree(expression);
			} else if (selectedFragment.getAssociatedNode() instanceof Assignment) {
				Assignment assignment = (Assignment) selectedFragment
						.getAssociatedNode();
				fSelectedExpression = (IExpressionFragment) ASTFragmentFactory
						.createFragmentForFullSubtree(assignment);
			}
		}

		if (fSelectedExpression != null
				&& Checks.isEnumCase(fSelectedExpression
						.getAssociatedExpression().getParent())) {
			fSelectedExpression = null;
		}

		return fSelectedExpression;*/
	}

	/*private Type createTempType() throws CoreException {
		Expression expression = getSelectedExpression()
				.getAssociatedExpression();

		Type resultingType = null;
		ITypeBinding typeBinding = expression.resolveTypeBinding();

		ASTRewrite rewrite = fCURewrite.getASTRewrite();
		AST ast = rewrite.getAST();

		if (expression instanceof ClassInstanceCreation) {
			resultingType = (Type) rewrite
					.createCopyTarget(((ClassInstanceCreation) expression)
							.getType());
		} else if (expression instanceof CastExpression) {
			resultingType = (Type) rewrite
					.createCopyTarget(((CastExpression) expression).getType());
		} else {
			if (typeBinding == null) {
				typeBinding = ASTResolving.guessBindingForReference(expression);
			}
			if (typeBinding != null) {
				typeBinding = Bindings.normalizeForDeclarationUse(typeBinding,
						ast);
				ImportRewrite importRewrite = fCURewrite.getImportRewrite();
				ImportRewriteContext context = new ContextSensitiveImportRewriteContext(
						expression, importRewrite);
				resultingType = importRewrite.addImport(typeBinding, ast,
						context);
			} else {
				resultingType = ast.newSimpleType(ast.newSimpleName("Object")); //$NON-NLS-1$
			}
		}
		if (fLinkedProposalModel != null) {
			LinkedProposalPositionGroup typeGroup = fLinkedProposalModel
					.getPositionGroup(KEY_TYPE, true);
			typeGroup.addPosition(rewrite.track(resultingType), false);
			if (typeBinding != null) {
				ITypeBinding[] relaxingTypes = ASTResolving.getNarrowingTypes(
						ast, typeBinding);
				for (int i = 0; i < relaxingTypes.length; i++) {
					typeGroup.addProposal(relaxingTypes[i], fCURewrite.getCu(),
							relaxingTypes.length - i);
				}
			}
		}
		return resultingType;
	}

	public String guessTempName() {
		String[] proposals = guessTempNames();
		if (proposals.length == 0)
			return fTempName;
		else
			return proposals[0];
	}*/

	/**
	 * @return proposed variable names (may be empty, but not null). The first
	 *         proposal should be used as "best guess" (if it exists).
	 */
	/*public String[] guessTempNames() {
		if (fGuessedTempNames == null) {
			try {
				Expression expression = getSelectedExpression()
						.getAssociatedExpression();
				if (expression != null) {
					ITypeBinding binding = guessBindingForReference(expression);
					fGuessedTempNames = StubUtility.getVariableNameSuggestions(
							NamingConventions.VK_LOCAL, fCu.getJavaProject(),
							binding, expression,
							Arrays.asList(getExcludedVariableNames()));
				}
			} catch (JavaModelException e) {
			}
			if (fGuessedTempNames == null)
				fGuessedTempNames = new String[0];
		}
		return fGuessedTempNames;
	}

	private boolean isLiteralNodeSelected() throws JavaModelException {
		IExpressionFragment fragment = getSelectedExpression();
		if (fragment == null)
			return false;
		Expression expression = fragment.getAssociatedExpression();
		if (expression == null)
			return false;
		switch (expression.getNodeType()) {
		case ASTNode.BOOLEAN_LITERAL:
		case ASTNode.CHARACTER_LITERAL:
		case ASTNode.NULL_LITERAL:
		case ASTNode.NUMBER_LITERAL:
			return true;

		default:
			return false;
		}
	}

	private boolean isUsedInExplicitConstructorCall() throws JavaModelException {
		Expression selectedExpression = getSelectedExpression()
				.getAssociatedExpression();
		if (ASTNodes.getParent(selectedExpression, ConstructorInvocation.class) != null)
			return true;
		if (ASTNodes.getParent(selectedExpression,
				SuperConstructorInvocation.class) != null)
			return true;
		return false;
	}*/

	public boolean replaceAllOccurrences() {
		return fReplaceAllOccurrences;
	}

	/*private void replaceSelectedExpressionWithTempDeclaration()
			throws CoreException {
		ASTRewrite rewrite = fCURewrite.getASTRewrite();
		Expression selectedExpression = getSelectedExpression()
				.getAssociatedExpression(); // whole expression selected

		Expression initializer = (Expression) rewrite
				.createMoveTarget(selectedExpression);
		ASTNode replacement = createTempDeclaration(initializer); // creates a
																	// VariableDeclarationStatement

		ExpressionStatement parent = (ExpressionStatement) selectedExpression
				.getParent();
		if (ASTNodes.isControlStatementBody(parent.getLocationInParent())) {
			Block block = rewrite.getAST().newBlock();
			block.statements().add(replacement);
			replacement = block;

		}
		rewrite.replace(
				parent,
				replacement,
				fCURewrite
						.createGroupDescription(RefactoringCoreMessages.ExtractTempRefactoring_declare_local_variable));
	}

	public void setDeclareFinal(boolean declareFinal) {
		fDeclareFinal = declareFinal;
	}*/

	public void setReplaceAllOccurrences(boolean replaceAllOccurrences) {
		fReplaceAllOccurrences = replaceAllOccurrences;
	}

	public void setTempName(String newName) {
		fTempName = newName;
	}

	/*private boolean shouldReplaceSelectedExpressionWithTempDeclaration()
			throws JavaModelException {
		IExpressionFragment selectedFragment = getSelectedExpression();
		return selectedFragment.getAssociatedNode().getParent() instanceof ExpressionStatement
				&& selectedFragment.matches(ASTFragmentFactory
						.createFragmentForFullSubtree(selectedFragment
								.getAssociatedNode()));
	}

	private RefactoringStatus initialize(RefactoringArguments arguments) {
		final String selection = arguments
				.getAttribute(JavaRefactoringDescriptorUtil.ATTRIBUTE_SELECTION);
		if (selection != null) {
			int offset = -1;
			int length = -1;
			final StringTokenizer tokenizer = new StringTokenizer(selection);
			if (tokenizer.hasMoreTokens())
				offset = Integer.valueOf(tokenizer.nextToken()).intValue();
			if (tokenizer.hasMoreTokens())
				length = Integer.valueOf(tokenizer.nextToken()).intValue();
			if (offset >= 0 && length >= 0) {
				fSelectionStart = offset;
				fSelectionLength = length;
			} else
				return RefactoringStatus
						.createFatalErrorStatus(Messages
								.format(RefactoringCoreMessages.InitializableRefactoring_illegal_argument,
										new Object[] {
												selection,
												JavaRefactoringDescriptorUtil.ATTRIBUTE_SELECTION }));
		} else
			return RefactoringStatus
					.createFatalErrorStatus(Messages
							.format(RefactoringCoreMessages.InitializableRefactoring_argument_not_exist,
									JavaRefactoringDescriptorUtil.ATTRIBUTE_SELECTION));
		final String handle = arguments
				.getAttribute(JavaRefactoringDescriptorUtil.ATTRIBUTE_INPUT);
		if (handle != null) {
			final IJavaElement element = JavaRefactoringDescriptorUtil
					.handleToElement(arguments.getProject(), handle, false);
			if (element == null
					|| !element.exists()
					|| element.getElementType() != IJavaElement.COMPILATION_UNIT)
				return JavaRefactoringDescriptorUtil.createInputFatalStatus(
						element, getName(),
						IJavaRefactorings.EXTRACT_LOCAL_VARIABLE);
			else
				fCu = (ISourceModule) element;
		} else
			return RefactoringStatus
					.createFatalErrorStatus(Messages
							.format(RefactoringCoreMessages.InitializableRefactoring_argument_not_exist,
									JavaRefactoringDescriptorUtil.ATTRIBUTE_INPUT));
		final String name = arguments
				.getAttribute(JavaRefactoringDescriptorUtil.ATTRIBUTE_NAME);
		if (name != null && !"".equals(name)) //$NON-NLS-1$
			fTempName = name;
		else
			return RefactoringStatus
					.createFatalErrorStatus(Messages
							.format(RefactoringCoreMessages.InitializableRefactoring_argument_not_exist,
									JavaRefactoringDescriptorUtil.ATTRIBUTE_NAME));
		final String replace = arguments.getAttribute(ATTRIBUTE_REPLACE);
		if (replace != null) {
			fReplaceAllOccurrences = Boolean.valueOf(replace).booleanValue();
		} else
			return RefactoringStatus
					.createFatalErrorStatus(Messages
							.format(RefactoringCoreMessages.InitializableRefactoring_argument_not_exist,
									ATTRIBUTE_REPLACE));
		final String declareFinal = arguments.getAttribute(ATTRIBUTE_FINAL);
		if (declareFinal != null) {
			fDeclareFinal = Boolean.valueOf(declareFinal).booleanValue();
		} else
			return RefactoringStatus
					.createFatalErrorStatus(Messages
							.format(RefactoringCoreMessages.InitializableRefactoring_argument_not_exist,
									ATTRIBUTE_FINAL));
		return new RefactoringStatus();
	}*/
}
