/*******************************************************************************
 * Copyright (c) 2000, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Dmitry Stalnov (dstalnov@fusionone.com) - contributed fixes for:
 *       o Allow 'this' constructor to be inlined
 *         (see https://bugs.eclipse.org/bugs/show_bug.cgi?id=38093)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.corext.refactoring.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.SourceRange;
import org.eclipse.dltk.core.search.IDLTKSearchConstants;
import org.eclipse.dltk.core.search.IDLTKSearchScope;
import org.eclipse.dltk.core.search.SearchEngine;
import org.eclipse.dltk.core.search.SearchMatch;
import org.eclipse.dltk.core.search.SearchPattern;
import org.eclipse.dltk.internal.corext.refactoring.CollectingSearchRequestor;
import org.eclipse.dltk.internal.corext.refactoring.RefactoringScopeFactory;
import org.eclipse.dltk.internal.corext.refactoring.base.ScriptStatusContext;
import org.eclipse.dltk.internal.corext.util.SearchUtils;
import org.eclipse.dltk.internal.javascript.corext.refactoring.RefactoringCoreMessages;
import org.eclipse.dltk.javascript.core.JavaScriptLanguageToolkit;
import org.eclipse.dltk.javascript.core.dom.CallExpression;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.Source;
import org.eclipse.dltk.javascript.core.dom.rewrite.ASTConverter;
import org.eclipse.dltk.javascript.core.dom.rewrite.NodeFinder;
import org.eclipse.dltk.javascript.core.dom.rewrite.RefactoringUtils;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;


/**
 * A TargetProvider provides all targets that have to be adapted, i.e. all method invocations that should be inlined.
 */
abstract class TargetProvider {

	//public abstract void initialize();

	public abstract List<ISourceModule> getAffectedSourceModules(RefactoringStatus status, IProgressMonitor pm)  throws CoreException;

	public abstract Source getRoot(ISourceModule unit);

	public abstract Node[] getAffectedBodyDeclarations(ISourceModule unit, IProgressMonitor pm);

	// constructor invocation is not an expression but a statement
	public abstract CallExpression[] getInvocations(Node declaration, IProgressMonitor pm);

	public abstract int getStatusSeverity();

	/*public boolean isSingle() {
		return false;
	}*/
	
	public static TargetProvider create(IMethod method) {
		return new MemberTypeTargetProvider(method);
	}
	
	public static TargetProvider create(ISourceModule cu, int offset, int length) {
		return new SingleCallTargetProvider(cu, offset, length);
	}

	/*public static TargetProvider create(MethodDeclaration declaration) {
		IMethodBinding method= declaration.resolveBinding();
		if (method == null)
			return new ErrorTargetProvider(RefactoringStatus.createFatalErrorStatus(RefactoringCoreMessages.TargetProvider_method_declaration_not_unique));
		ITypeBinding type= method.getDeclaringClass();
		if (type.isLocal()) {
			if (((IType) type.getJavaElement()).isBinary()) {
				return new ErrorTargetProvider(RefactoringStatus.createFatalErrorStatus(RefactoringCoreMessages.TargetProvider_cannot_local_method_in_binary));
			} else {
				IType declaringClassOfLocal= (IType) type.getDeclaringClass().getJavaElement();
				return new LocalTypeTargetProvider(declaringClassOfLocal.getCompilationUnit(), declaration);
			}
		} else {
			return new MemberTypeTargetProvider(declaration.resolveBinding());
		}
	}*/

	static void fastDone(IProgressMonitor pm) {
		if (pm == null)
			return;
		pm.beginTask("", 1); //$NON-NLS-1$
		pm.worked(1);
		pm.done();
	}

	/*static class ErrorTargetProvider extends TargetProvider {
		private RefactoringStatus fErrorStatus;
		public ErrorTargetProvider(RefactoringStatus status) {
			fErrorStatus= status;
		}
		public RefactoringStatus checkActivation() throws JavaModelException {
			return fErrorStatus;
		}
		public void initialize() {
		}
		public ICompilationUnit[] getAffectedCompilationUnits(RefactoringStatus status, ReferencesInBinaryContext binaryRefs, IProgressMonitor pm) throws JavaModelException {
			return null;
		}
		public BodyDeclaration[] getAffectedBodyDeclarations(ICompilationUnit unit, IProgressMonitor pm) {
			return null;
		}
		public ASTNode[] getInvocations(BodyDeclaration declaration, IProgressMonitor pm) {
			return null;
		}
		public int getStatusSeverity() {
			return 0;
		}
	}*/

	static class SingleCallTargetProvider extends TargetProvider {
		private ISourceModule cu;
		private Source root;
		private CallExpression invocation;
		//private boolean fIterated;
		public SingleCallTargetProvider(ISourceModule cu, int offset, int length) {
			this.cu = cu;
			root = (Source)ASTConverter.convert(JavaScriptParserUtil.parse(cu));
			invocation = RefactoringUtils.getFunctionReference(NodeFinder.findNode(root, offset, offset+length));
		}
		/*public void initialize() {
			fIterated= false;
		}*/
		@Override
		public List<ISourceModule> getAffectedSourceModules(RefactoringStatus status, IProgressMonitor pm) {
			List<ISourceModule> res= new ArrayList<ISourceModule>(1);
			res.add(cu);
			return res;
		}
		
		@Override
		public Source getRoot(ISourceModule unit) {
			Assert.isTrue(unit == cu);
			return root;
		}
		
		@Override
		public Node[] getAffectedBodyDeclarations(ISourceModule unit, IProgressMonitor pm) {
			Assert.isTrue(unit == cu);
			//if (fIterated)
			//	return new BodyDeclaration[0];
			fastDone(pm);
			return new Node[] { NodeFinder.findEnclosingNode(invocation) };
		}

		@Override
		public CallExpression[] getInvocations(Node declaration, IProgressMonitor pm) {
			fastDone(pm);
			//if (fIterated)
			//	return null;
			//fIterated= true;
			return new CallExpression[] { invocation };
		}
		@Override
		public int getStatusSeverity() {
			return RefactoringStatus.FATAL;
		}
		/*public boolean isSingle() {
			return true;
		}*/
	}

	/*private static class BodyData {
		private List<Identifier> fInvocations;

		public BodyData() {
		}
		public void addInvocation(Identifier node) {
			if (fInvocations == null)
				fInvocations= new ArrayList(2);
			fInvocations.add(node);
		}
		public Node[] getInvocations() {
			return (Node[])fInvocations.toArray(new ASTNode[fInvocations.size()]);
		}
		public boolean hasInvocations() {
			return fInvocations != null && !fInvocations.isEmpty();
		}
	}

	private static class InvocationFinder extends ASTVisitor {
		Map/*<BodyDeclaration, BodyData>* result= new HashMap(2);
		Stack/*<BodyData>* fBodies= new Stack();
		BodyData fCurrent;
		private IMethodBinding fBinding;
		public InvocationFinder(IMethodBinding binding) {
			Assert.isNotNull(binding);
			fBinding= binding.getMethodDeclaration();
			Assert.isNotNull(fBinding);
		}
		public boolean visit(MethodInvocation node) {
			if (matches(node.getName().resolveBinding()) && fCurrent != null) {
				fCurrent.addInvocation(node);
			}
			return true;
		}
		public boolean visit(SuperMethodInvocation node) {
			if (matches(node.getName().resolveBinding()) && fCurrent != null) {
				fCurrent.addInvocation(node);
			}
			return true;
		}
		public boolean visit(ConstructorInvocation node) {
			if (matches(node.resolveConstructorBinding()) && fCurrent != null) {
				fCurrent.addInvocation(node);
			}
			return true;
		}
		public boolean visit(ClassInstanceCreation node) {
			if (matches(node.resolveConstructorBinding()) && fCurrent != null) {
				fCurrent.addInvocation(node);
			}
			return true;
		}
		public boolean visit(TypeDeclaration node) {
			return visitType();
		}
		public void endVisit(TypeDeclaration node) {
			endVisitBodyDeclaration();
		}
		public boolean visit(EnumDeclaration node) {
			return visitType();
		}
		public void endVisit(EnumDeclaration node) {
			endVisitBodyDeclaration();
		}
		public boolean visit(AnnotationTypeDeclaration node) {
			return visitType();
		}
		public void endVisit(AnnotationTypeDeclaration node) {
			endVisitBodyDeclaration();
		}
		private boolean visitType() {
			fBodies.add(fCurrent);
			fCurrent= null;
			return true;
		}
		protected boolean visitNonTypeBodyDeclaration() {
			fBodies.add(fCurrent);
			fCurrent= new BodyData();
			return true;
		}
		protected void endVisitBodyDeclaration() {
			fCurrent= (BodyData)fBodies.remove(fBodies.size() - 1);
		}
		public boolean visit(FieldDeclaration node) {
			return visitNonTypeBodyDeclaration();
		}
		public void endVisit(FieldDeclaration node) {
			if (fCurrent.hasInvocations()) {
				result.put(node, fCurrent);
			}
			endVisitBodyDeclaration();
		}
		public boolean visit(MethodDeclaration node) {
			return visitNonTypeBodyDeclaration();
		}
		public void endVisit(MethodDeclaration node) {
			if (fCurrent.hasInvocations()) {
				result.put(node, fCurrent);
			}
			endVisitBodyDeclaration();

		}
		public boolean visit(Initializer node) {
			return visitNonTypeBodyDeclaration();
		}
		public void endVisit(Initializer node) {
			if (fCurrent.hasInvocations()) {
				result.put(node, fCurrent);
			}
			endVisitBodyDeclaration();
		}
		private boolean matches(IBinding binding) {
			if (!(binding instanceof IMethodBinding))
				return false;
			return fBinding.isEqualTo(((IMethodBinding)binding).getMethodDeclaration());
		}
	}

	private static class LocalTypeTargetProvider extends TargetProvider {
		private ICompilationUnit fCUnit;
		private MethodDeclaration fDeclaration;
		private Map fBodies;
		public LocalTypeTargetProvider(ICompilationUnit unit, MethodDeclaration declaration) {
			Assert.isNotNull(unit);
			Assert.isNotNull(declaration);
			fCUnit= unit;
			fDeclaration= declaration;
		}
		public void initialize() {
			IMethodBinding methodBinding= fDeclaration.resolveBinding();
			InvocationFinder finder;
			ASTNode type= ASTNodes.getParent(fDeclaration, AbstractTypeDeclaration.class);
			if (methodBinding.getDeclaringClass().isAnonymous()) {
				finder= new InvocationFinder(methodBinding);
				type.accept(finder);
			} else {
				//scope of local class is enclosing block
				ASTNode block= type.getParent().getParent();
				finder= new InvocationFinder(methodBinding) {
					public boolean visit(Block node) {
						return visitNonTypeBodyDeclaration();
					}
					public void endVisit(Block node) {
						if (fCurrent.hasInvocations()) {
							result.put(ASTNodes.getParent(node, BodyDeclaration.class), fCurrent);
						}
						endVisitBodyDeclaration();
					}
				};
				block.accept(finder);
			}
			fBodies= finder.result;
		}
		public ICompilationUnit[] getAffectedCompilationUnits(RefactoringStatus status, ReferencesInBinaryContext binaryRefs, IProgressMonitor pm) {
			fastDone(pm);
			return new ICompilationUnit[] { fCUnit };
		}

		public BodyDeclaration[] getAffectedBodyDeclarations(ICompilationUnit unit, IProgressMonitor pm) {
			Assert.isTrue(unit == fCUnit);
			Set result= fBodies.keySet();
			fastDone(pm);
			return (BodyDeclaration[])result.toArray(new BodyDeclaration[result.size()]);
		}

		public ASTNode[] getInvocations(BodyDeclaration declaration, IProgressMonitor pm) {
			BodyData data= (BodyData)fBodies.get(declaration);
			Assert.isNotNull(data);
			fastDone(pm);
			return data.getInvocations();
		}

		public RefactoringStatus checkActivation() throws JavaModelException {
			return new RefactoringStatus();
		}

		public int getStatusSeverity() {
			return RefactoringStatus.ERROR;
		}
	}*/

	private static class MemberTypeTargetProvider extends TargetProvider {
		private final IMethod method;
		private final Map<ISourceModule,Source> roots = new HashMap<ISourceModule,Source>();
		private Map<ISourceModule,List<SearchMatch>> calls;
		private Map<Node,List<CallExpression>> currentBodies;
		public MemberTypeTargetProvider(IMethod method) {
			Assert.isNotNull(method);
			this.method = method;
		}

		@Override
		public List<ISourceModule> getAffectedSourceModules(final RefactoringStatus status, IProgressMonitor pm) throws CoreException {
			SearchPattern pattern= SearchPattern.createPattern(method, IDLTKSearchConstants.REFERENCES, SearchUtils.GENERICS_AGNOSTIC_MATCH_RULE, JavaScriptLanguageToolkit.getDefault());
			IDLTKSearchScope scope= RefactoringScopeFactory.create(method, true, false);
			//SearchPattern pattern= SearchPattern.createPattern(method.getElementName(), IDLTKSearchConstants.METHOD, IDLTKSearchConstants.REFERENCES, SearchUtils.GENERICS_AGNOSTIC_MATCH_RULE, JavaScriptLanguageToolkit.getDefault());
			//IDLTKSearchScope scope = SearchEngine.createWorkspaceScope(JavaScriptLanguageToolkit.getDefault()); 
			if (calls == null) {
				calls = new HashMap<ISourceModule,List<SearchMatch>>();
				CollectingSearchRequestor requestor= new CollectingSearchRequestor() {
					public void acceptSearchMatch(SearchMatch match) throws CoreException {
						if (filterMatch(match))
							return;
						if (match.isInsideDocComment())
							return; // TODO: should warn user
						ISourceModule unit= SearchUtils.getSourceModule(match);
						if (match.getAccuracy() == SearchMatch.A_INACCURATE) {
							if (unit != null) {
								status.addError(RefactoringCoreMessages.TargetProvider_inaccurate_match,
										ScriptStatusContext.create(unit, new SourceRange(match.getOffset(), match.getLength())));
							} else {
								status.addError(RefactoringCoreMessages.TargetProvider_inaccurate_match);
							}
						} else if (unit != null) {
							List<SearchMatch> list = calls.get(unit);
							if (list == null) {
								list = new ArrayList<SearchMatch>();
								calls.put(unit,list);
							}
							list.add(match);
						}
					}
				};
				new SearchEngine().search(pattern, SearchUtils.getDefaultSearchParticipants(), scope, requestor, new SubProgressMonitor(pm, 1));
			}
			return new ArrayList<ISourceModule>(calls.keySet());
		}
		@Override
		public Source getRoot(ISourceModule unit) {
			Source root = roots.get(unit);
			if (root == null) {
				root = (Source)ASTConverter.convert(JavaScriptParserUtil.parse(unit));
				roots.put(unit,root);
			}
			return root;
		}

		@Override
		public Node[] getAffectedBodyDeclarations(ISourceModule unit, IProgressMonitor pm) {
			Source root=roots.get(unit);
			currentBodies = new HashMap<Node,List<CallExpression>>();
			for(Node node : NodeFinder.findNodes(root, calls.get(unit))) {
				CallExpression expr = RefactoringUtils.getFunctionReference(node);
				// TODO something with bad references
				if (expr == null)
					continue;
				Node enclosing = NodeFinder.findEnclosingNode(expr);
				List<CallExpression> list = currentBodies.get(enclosing);
				if (list == null) {
					list = new ArrayList<CallExpression>();
					currentBodies.put(enclosing,list);
				}
				list.add(expr);
			}
			Set<Node> result= currentBodies.keySet();
			fastDone(pm);
			return (Node[])result.toArray(new Node[result.size()]);
		}

		@Override
		public CallExpression[] getInvocations(Node declaration, IProgressMonitor pm) {
			List<CallExpression> list = currentBodies.get(declaration);
			return list.toArray(new CallExpression[list.size()]);
		}

		@Override
		public int getStatusSeverity() {
			return RefactoringStatus.ERROR;
		}
	}
}
