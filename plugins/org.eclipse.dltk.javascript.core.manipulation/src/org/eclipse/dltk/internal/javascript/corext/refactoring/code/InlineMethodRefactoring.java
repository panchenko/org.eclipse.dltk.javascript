/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Dmitry Stalnov (dstalnov@fusionone.com) - contributed fixes for:
 *       o inline call that is used in a field initializer
 *         (see https://bugs.eclipse.org/bugs/show_bug.cgi?id=38137)
 *       o Allow 'this' constructor to be inlined
 *         (see https://bugs.eclipse.org/bugs/show_bug.cgi?id=38093)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.corext.refactoring.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.manipulation.RefactoringChecks;
import org.eclipse.dltk.core.manipulation.SourceModuleChange;
import org.eclipse.dltk.internal.corext.refactoring.ScriptRefactoringDescriptor;
import org.eclipse.dltk.internal.corext.refactoring.changes.DynamicValidationRefactoringChange;
import org.eclipse.dltk.internal.corext.refactoring.util.TextChangeManager;
import org.eclipse.dltk.internal.javascript.core.manipulation.JavascriptManipulationPlugin;
import org.eclipse.dltk.internal.javascript.core.manipulation.Messages;
import org.eclipse.dltk.internal.javascript.corext.refactoring.RefactoringCoreMessages;
import org.eclipse.dltk.javascript.core.dom.CallExpression;
import org.eclipse.dltk.javascript.core.dom.FunctionExpression;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.Source;
import org.eclipse.dltk.javascript.core.dom.rewrite.ASTConverter;
import org.eclipse.dltk.javascript.core.dom.rewrite.NodeFinder;
import org.eclipse.dltk.javascript.core.dom.rewrite.RefactoringUtils;
import org.eclipse.dltk.javascript.core.dom.rewrite.RewriteAnalyzer;
import org.eclipse.dltk.javascript.core.refactoring.descriptors.InlineMethodDescriptor;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.Refactoring;
import org.eclipse.ltk.core.refactoring.RefactoringDescriptor;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextChange;
import org.eclipse.ltk.core.refactoring.participants.ResourceChangeChecker;
import org.eclipse.ltk.internal.core.refactoring.BasicElementLabels;

/*
 * Open items:
 *  - generate import statements for newly generated local variable declarations.
 *  - forbid cases like foo(foo(10)) when inlining foo().
 *  - case ref.foo(); and we want to inline foo. Inline a method in a different context;
 *  - optimize code when the method to be inlined returns an argument and that one is
 *    assigned to a parameter again. No need for a separate local (important to be able
 *    to reverse extract method correctly).
 */
public class InlineMethodRefactoring extends Refactoring {

	private static final String ATTRIBUTE_MODE= "mode"; //$NON-NLS-1$
	private static final String ATTRIBUTE_DELETE= "delete";	 //$NON-NLS-1$

	public enum Mode {
		ALL,SINGLE;
	}
	
	// constructor
	private ISourceModule cu;
	private int offset;
	private int length;
	// initial conditions
	private IMethod method;
	private Mode initialMode;
	private Mode currentMode;
	private boolean deleteSource;
	private Source declRoot;
	private Node declNode; 
	private SourceProvider sourceProvider;
	private TargetProvider targetProvider;
	// final conditions
	private TextChangeManager changeManager;

	public InlineMethodRefactoring(ISourceModule cu, int offset, int length) {
		this.cu = cu;
		this.offset = offset;
		this.length = length;
		deleteSource= false;
	}

	public String getName() {
		return RefactoringCoreMessages.InlineMethodRefactoring_name;
	}

	/**
	 * Returns the method to inline, or null if the method could not be found or
	 * {@link #checkInitialConditions(IProgressMonitor)} has not been called yet.
	 *
	 * @return the method, or <code>null</code>
	 */
	public IMethod getMethod() {
		return method;
	}

	public boolean canEnableDeleteSource() {
		return !method.isReadOnly();
	}

	/*public boolean getDeleteSource() {
		return fDeleteSource;
	}*/

	public void setDeleteSource(boolean remove) {
		if (remove)
			Assert.isTrue(canEnableDeleteSource());
		deleteSource= remove;
	}

	public Mode getInitialMode() {
		return initialMode;
	}

	public RefactoringStatus setCurrentMode(Mode mode) {
		if (currentMode == mode)
			return new RefactoringStatus();
		Assert.isTrue(getInitialMode() == Mode.SINGLE);
		currentMode= mode;
		/*if (mode == Mode.INLINE_SINGLE) {
			if (fInitialNode instanceof MethodInvocation)
				fTargetProvider= TargetProvider.create((ICompilationUnit) fInitialTypeRoot, (MethodInvocation)fInitialNode);
			else if (fInitialNode instanceof SuperMethodInvocation)
				fTargetProvider= TargetProvider.create((ICompilationUnit) fInitialTypeRoot, (SuperMethodInvocation)fInitialNode);
			else if (fInitialNode instanceof ConstructorInvocation)
				fTargetProvider= TargetProvider.create((ICompilationUnit) fInitialTypeRoot, (ConstructorInvocation)fInitialNode);
			else
				throw new IllegalStateException(String.valueOf(fInitialNode));
		} else {
			fTargetProvider= TargetProvider.create(fSourceProvider.getDeclaration());
		}
		return fTargetProvider.checkActivation();*/
		return new RefactoringStatus();
	}

	/**
	 * Creates a new inline method refactoring
	 * @param unit the compilation unit or class file
	 * @param selectionStart start
	 * @param selectionLength length
	 * @return returns the refactoring
	 */
	/*public static InlineMethodRefactoring create(ISourceModule unit, int selectionStart, int selectionLength) {
		try {
			IModelElement[] elements = unit.codeSelect(selectionStart, selectionLength);
			if (elements.length != 1 || !(elements[0] instanceof IMethod))
				return null;
			IMethod method = (IMethod)elements[0];
			if (method.getSourceRange().getOffset() == selectionStart && method.getSourceModule() == unit) {
				return new InlineMethodRefactoring(unit, method, selectionStart, selectionLength, Mode.ALL);
			} else {
				return new InlineMethodRefactoring(unit, method, selectionStart, selectionLength, Mode.SINGLE);
			}
		} catch (ModelException e) {
			JavascriptManipulationPlugin.log(e);
		}
		return null;
	}*/

	public RefactoringStatus checkInitialConditions(IProgressMonitor pm) {
		RefactoringStatus result= new RefactoringStatus();
		if (method == null) {
			try {
				IModelElement[] elements = cu.codeSelect(offset, length);
				if (elements.length != 1 || !(elements[0] instanceof IMethod))
					return RefactoringStatus.createFatalErrorStatus(RefactoringCoreMessages.InlineMethodRefactoring_error_noMethodDeclaration);  
				method = (IMethod)elements[0];
				int start = method.getNameRange().getOffset(); 
				if (start <= offset && offset <= start+method.getNameRange().getLength() && method.getSourceModule() == cu)
					initialMode = Mode.ALL;
				else
					initialMode = Mode.SINGLE;
				currentMode = initialMode;
				declRoot = (Source)ASTConverter.convert(JavaScriptParserUtil.parse(method.getSourceModule()));
				declNode = NodeFinder.findNode(declRoot, method.getNameRange());
				FunctionExpression expr = RefactoringUtils.getFunctionDeclaration(declNode);
				if (expr == null)
					return RefactoringStatus.createFatalErrorStatus(RefactoringCoreMessages.InlineMethodRefactoring_error_noMethodDeclaration);
				sourceProvider = new SourceProvider(expr, method);
				if (result.hasFatalError())
					return result;
			} catch (ModelException e) {
				JavascriptManipulationPlugin.log(e);
				return RefactoringStatus.createFatalErrorStatus(RefactoringCoreMessages.InlineMethodRefactoring_error_noMethodDeclaration);  
			}
		}
		result.merge(sourceProvider.checkActivation());
		return result;
	}

	public RefactoringStatus checkFinalConditions(IProgressMonitor pm) throws CoreException {
		pm.beginTask("", 20); //$NON-NLS-1$
		changeManager= new TextChangeManager();
		RefactoringStatus result= new RefactoringStatus();
		sourceProvider.initialize();
		if (currentMode == Mode.ALL)
			targetProvider = TargetProvider.create(method);
		else {
			targetProvider = TargetProvider.create(cu, offset, length);
			deleteSource = false;
		}
		//fTargetProvider.initialize();

		pm.setTaskName(RefactoringCoreMessages.InlineMethodRefactoring_searching);
		RefactoringStatus searchStatus= new RefactoringStatus();
		/*String binaryRefsDescription= Messages.format(RefactoringCoreMessages.ReferencesInBinaryContext_ref_in_binaries_description , BasicElementLabels.getJavaElementName(fSourceProvider.getMethodName()));
		ReferencesInBinaryContext binaryRefs= new ReferencesInBinaryContext(binaryRefsDescription);*/
		List<ISourceModule> units= targetProvider.getAffectedSourceModules(searchStatus, new SubProgressMonitor(pm, 1));
		//binaryRefs.addErrorIfNecessary(searchStatus);
		if (searchStatus.hasFatalError()) {
			result.merge(searchStatus);
			return result;
		}

		IFile[] filesToBeModified= getFilesToBeModified(units);
		result.merge(RefactoringChecks.validateModifiesFiles(filesToBeModified, getValidationContext()));
		if (result.hasFatalError())
			return result;
		result.merge(ResourceChangeChecker.checkFilesToBeChanged(filesToBeModified, new SubProgressMonitor(pm, 1)));
		// TODO check overrides
		//checkOverridden(result, new SubProgressMonitor(pm, 4));
		IProgressMonitor sub= new SubProgressMonitor(pm, 15);
		sub.beginTask("", (units.size()+1) * 3); //$NON-NLS-1$
		boolean occursInDeclUnit = false;
		for(ISourceModule unit : units) {
			if (!unit.equals(method.getSourceModule()))
				processUnit(unit,sub,result);
			else
				occursInDeclUnit = true;
		}
		if (occursInDeclUnit)
			sub.worked(3);
		if (deleteSource || occursInDeclUnit)
			processUnit(method.getSourceModule(),sub,result);
		result.merge(searchStatus);
		sub.done();
		pm.done();
		return result;
	}
	
	private void processUnit(ISourceModule unit, IProgressMonitor pm, RefactoringStatus result) throws CoreException {
		pm.subTask(Messages.format(RefactoringCoreMessages.InlineMethodRefactoring_processing,  BasicElementLabels.getResourceName(unit.getCorrespondingResource())));
		CallInliner inliner= null;
			boolean modified = false;
			Source root = targetProvider.getRoot(unit);
			ChangeRecorder cr = new ChangeRecorder(targetProvider.getRoot(unit));
			Node[] bodies=targetProvider.getAffectedBodyDeclarations(unit, new SubProgressMonitor(pm, 1));
			if (bodies.length == 0)
				return;
			inliner = new CallInliner(unit, sourceProvider);
			for(Node body : bodies) {
				inliner.initialize(body);
				RefactoringStatus nestedInvocations= new RefactoringStatus();
				CallExpression[] invocations= removeNestedCalls(nestedInvocations, unit,
					targetProvider.getInvocations(body, new SubProgressMonitor(pm, 2)));
				for(CallExpression invocation : invocations) {
					result.merge(inliner.initialize(invocation, targetProvider.getStatusSeverity()));
					if (result.hasFatalError())
						break;
					if (result.getSeverity() >= targetProvider.getStatusSeverity()) {
						deleteSource= false;
					} else {
						modified = true;
						inliner.perform();
					}
				}
				// do this after we have inlined the method calls. We still want
				// to generate the modifications.
				if (!nestedInvocations.isOK()) {
					result.merge(nestedInvocations);
					deleteSource=false;
				}
			}
			if (deleteSource && unit.equals(method.getSourceModule())) {
				modified = true;
				Node node = sourceProvider.getDeclaration();
				node = NodeFinder.findNode(root, node.getBegin(), node.getEnd());
				while (!node.eContainmentFeature().isMany())
					node = (Node)node.eContainer();
				List<? extends Node> list = (List<? extends Node>)node.eContainer().eGet(node.eContainmentFeature());
				list.remove(node);
			}
			if (modified) {
				ChangeDescription cd = cr.endRecording();
				RewriteAnalyzer rewrite = new RewriteAnalyzer(cd, unit.getSource());
				rewrite.rewrite(root);
				cd.apply();
				TextChange change = new SourceModuleChange(unit.getElementName(), unit);
				change.setEdit(rewrite.getEdit());
				changeManager.manage(unit, change);
			} else
				cr.endRecording();
			/*if (!added) {
				changeManager.remove(unit);
			} else {
				root.addChild(inliner.getModifications());
				ImportRewrite rewrite= inliner.getImportEdit();
				if (rewrite.hasRecordedChanges()) {
					TextEdit edit= rewrite.rewriteImports(null);
					if (edit instanceof MultiTextEdit ? ((MultiTextEdit)edit).getChildrenSize() > 0 : true) {
						root.addChild(edit);
						change.addTextEditGroup(
							new TextEditGroup(RefactoringCoreMessages.InlineMethodRefactoring_edit_import, new TextEdit[] {edit}));
					}
				}
			}*/
		pm.worked(1);
		if (pm.isCanceled())
			throw new OperationCanceledException();
	}

	public Change createChange(IProgressMonitor pm) throws CoreException {
		//if (deleteSource && currentMode == Mode.ALL) {
			//TextChange change= changeManager.get((ISourceModule) sourceProvider.getTypeRoot());
			//TextEdit delete= sourceProvider.getDeleteEdit();
			//TextEditGroup description= new TextEditGroup(
			//	RefactoringCoreMessages.InlineMethodRefactoring_edit_delete, new TextEdit[] { delete });
			//TextEdit root= change.getEdit();
			//if (root != null) {
				// TODO instead of finding the right insert position the call inliner should
				// reuse the AST & rewriter of the source provide and we should rewrite the
				// whole AST at the end. However, since recursive calls aren't allowed there
				// shouldn't be a text edit overlap.
				// root.addChild(delete);
				//TextChangeCompatibility.insert(root, delete);
			//} else {
				//change.setEdit(delete);
			//}
			//change.addTextEditGroup(description);
		//}
		final Map arguments= new HashMap();
		String project = null;
		IScriptProject scriptProject= cu.getScriptProject();
		if (scriptProject != null)
			project= scriptProject.getElementName();
		int flags= RefactoringDescriptor.STRUCTURAL_CHANGE | ScriptRefactoringDescriptor.ARCHIVE_REFACTORABLE | ScriptRefactoringDescriptor.ARCHIVE_IMPORTABLE;
		//final IMethodBinding binding= sourceProvider.getDeclaration().resolveBinding();
		//final ITypeBinding declaring= binding.getDeclaringClass();
		//if (!Modifier.isPrivate(binding.getModifiers()))
		//	flags|= RefactoringDescriptor.MULTI_CHANGE;
		final String description= Messages.format(RefactoringCoreMessages.InlineMethodRefactoring_descriptor_description_short, method.getElementName());
		final String header= Messages.format(RefactoringCoreMessages.InlineMethodRefactoring_descriptor_description, new String[] { method.getElementName(), cu.getElementName() });
		//final JDTRefactoringDescriptorComment comment= new JDTRefactoringDescriptorComment(project, this, header);
		//comment.addSetting(Messages.format(RefactoringCoreMessages.InlineMethodRefactoring_original_pattern, BindingLabelProvider.getBindingLabel(binding, JavaElementLabels.ALL_FULLY_QUALIFIED)));
		//if (fDeleteSource)
		//	comment.addSetting(RefactoringCoreMessages.InlineMethodRefactoring_remove_method);
		//if (fCurrentMode == Mode.INLINE_ALL)
		//	comment.addSetting(RefactoringCoreMessages.InlineMethodRefactoring_replace_references);
		final InlineMethodDescriptor descriptor = new InlineMethodDescriptor(project, description, ""/*comment.asString()*/, arguments, flags);
		arguments.put(ScriptRefactoringDescriptor.ATTRIBUTE_INPUT, ScriptRefactoringDescriptor.elementToHandle(project, cu));
		arguments.put(ScriptRefactoringDescriptor.ATTRIBUTE_SELECTION, new Integer(offset).toString() + " " + new Integer(length).toString()); //$NON-NLS-1$
		arguments.put(ATTRIBUTE_DELETE, Boolean.valueOf(deleteSource).toString());
		arguments.put(ATTRIBUTE_MODE, new Integer(currentMode == Mode.ALL ? 1 : 0).toString());
		return new DynamicValidationRefactoringChange(descriptor, RefactoringCoreMessages.InlineMethodRefactoring_edit_inlineCall, changeManager.getAllChanges());
	}
	
	//private static SourceProvider resolveSourceProvider(RefactoringStatus status, Node nameNode) {
		/*IMethodBinding methodBinding= Invocations.resolveBinding(invocation);
		if (methodBinding == null) {
			status.addFatalError(RefactoringCoreMessages.InlineMethodRefactoring_error_noMethodDeclaration);
			return null;
		}*/
		/*MethodDeclaration declaration= (MethodDeclaration)root.findDeclaringNode(methodBinding);
		if (declaration != null) {
			return new SourceProvider(typeRoot, declaration);
		}
		IMethod method= (IMethod)methodBinding.getJavaElement();
		if (method != null) {
			CompilationUnit methodDeclarationAstRoot;
			ICompilationUnit methodCu= method.getCompilationUnit();
			if (methodCu != null) {
				methodDeclarationAstRoot= new RefactoringASTParser(AST.JLS3).parse(methodCu, true);
			} else {
				IClassFile classFile= method.getClassFile();
				if (! JavaElementUtil.isSourceAvailable(classFile)) {
					String methodLabel= JavaElementLabels.getTextLabel(method, JavaElementLabels.M_FULLY_QUALIFIED | JavaElementLabels.M_PARAMETER_TYPES);
					status.addFatalError(Messages.format(RefactoringCoreMessages.InlineMethodRefactoring_error_classFile, methodLabel));
					return null;
				}
				methodDeclarationAstRoot= new RefactoringASTParser(AST.JLS3).parse(classFile, true);
			}
			ASTNode node= methodDeclarationAstRoot.findDeclaringNode(methodBinding.getMethodDeclaration().getKey());
			if (node instanceof MethodDeclaration) {
				return new SourceProvider(methodDeclarationAstRoot.getTypeRoot(), (MethodDeclaration) node);
			}
		}*/
	//}

	private IFile[] getFilesToBeModified(List<ISourceModule> units) {
		List<IFile> result= new ArrayList<IFile>(units.size() + 1);
		for (ISourceModule unit : units) {
			IFile file= getFile(unit);
			if (file != null)
				result.add(file);
		}
		if (deleteSource) {
			IFile file = getFile(method.getSourceModule());
			if (file != null && !units.contains(file))
				result.add(file);
		}
		return (IFile[])result.toArray(new IFile[result.size()]);
	}

	private IFile getFile(ISourceModule unit) {
		unit= unit.getPrimary();
		IResource resource= unit.getResource();
		if (resource != null && resource.getType() == IResource.FILE)
			return (IFile)resource;
		return null;
	}

	/*private void checkOverridden(RefactoringStatus status, IProgressMonitor pm) throws JavaModelException {
		pm.beginTask("", 9); //$NON-NLS-1$
		pm.setTaskName(RefactoringCoreMessages.InlineMethodRefactoring_checking_overridden);
		MethodDeclaration decl= fSourceProvider.getDeclaration();
		IMethod method= (IMethod) decl.resolveBinding().getJavaElement();
		if (method == null || Flags.isPrivate(method.getFlags())) {
			pm.worked(8);
			return;
		}
		IType type= method.getDeclaringType();
		ITypeHierarchy hierarchy= type.newTypeHierarchy(new SubProgressMonitor(pm, 6));
		checkSubTypes(status, method, hierarchy.getAllSubtypes(type), new SubProgressMonitor(pm, 1));
		checkSuperClasses(status, method, hierarchy.getAllSuperclasses(type), new SubProgressMonitor(pm, 1));
		checkSuperInterfaces(status, method, hierarchy.getAllSuperInterfaces(type), new SubProgressMonitor(pm, 1));
		pm.setTaskName(""); //$NON-NLS-1$
	}

	private void checkSubTypes(RefactoringStatus result, IMethod method, IType[] types, IProgressMonitor pm) {
		checkTypes(
			result, method, types,
			RefactoringCoreMessages.InlineMethodRefactoring_checking_overridden_error,
			pm);
	}

	private void checkSuperClasses(RefactoringStatus result, IMethod method, IType[] types, IProgressMonitor pm) {
		checkTypes(
			result, method, types,
			RefactoringCoreMessages.InlineMethodRefactoring_checking_overrides_error,
			pm);
	}

	private void checkSuperInterfaces(RefactoringStatus result, IMethod method, IType[] types, IProgressMonitor pm) {
		checkTypes(
			result, method, types,
			RefactoringCoreMessages.InlineMethodRefactoring_checking_implements_error,
			pm);
	}
	private void checkTypes(RefactoringStatus result, IMethod method, IType[] types, String key, IProgressMonitor pm) {
		pm.beginTask("", types.length); //$NON-NLS-1$
		for (int i= 0; i < types.length; i++) {
			pm.worked(1);
			IMethod[] overridden= types[i].findMethods(method);
			if (overridden != null && overridden.length > 0) {
				result.addError(
					Messages.format(key, JavaElementLabels.getElementLabel(types[i], JavaElementLabels.ALL_DEFAULT)),
					JavaStatusContext.create(overridden[0]));
			}
		}
	}*/

	private CallExpression[] removeNestedCalls(RefactoringStatus status, ISourceModule unit, CallExpression[] invocations) {
		List<Node> result= new ArrayList<Node>();
		for(Node invocation : invocations) {
			boolean ok = true;
			for (Node parent : invocations) {
				parent = (Node)parent.eContainer();
				while (parent != null && parent != invocation)
					parent=(Node)parent.eContainer();
				if (parent != null)
					ok = false;
			}
			if (ok)
				result.add(invocation);
			else
				status.addError(RefactoringCoreMessages.InlineMethodRefactoring_nestedInvocation/*,
					JavaStatusContext.create(unit, parent)*/);
		}
		return result.toArray(new CallExpression[result.size()]);
	}
}
