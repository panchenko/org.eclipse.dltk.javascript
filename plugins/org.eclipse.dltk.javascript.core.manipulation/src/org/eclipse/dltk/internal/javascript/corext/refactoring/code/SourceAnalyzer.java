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
 * 	     o bug "Inline refactoring showed bogus error" (see bugzilla
 *         https://bugs.eclipse.org/bugs/show_bug.cgi?id=42753)
 *       o Allow 'this' constructor to be inlined
 *         (see https://bugs.eclipse.org/bugs/show_bug.cgi?id=38093)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.corext.refactoring.code;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.internal.javascript.corext.refactoring.RefactoringCoreMessages;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow.FlowContext;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow.FlowInfo;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow.InOutFlowAnalyzer;
import org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow.VariableBinding;
import org.eclipse.dltk.javascript.core.dom.CallExpression;
import org.eclipse.dltk.javascript.core.dom.DomPackage;
import org.eclipse.dltk.javascript.core.dom.Expression;
import org.eclipse.dltk.javascript.core.dom.FunctionExpression;
import org.eclipse.dltk.javascript.core.dom.Identifier;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.Parameter;
import org.eclipse.dltk.javascript.core.dom.PropertyAccessExpression;
import org.eclipse.dltk.javascript.core.dom.ReturnStatement;
import org.eclipse.dltk.javascript.core.dom.Statement;
import org.eclipse.dltk.javascript.core.dom.ThisExpression;
import org.eclipse.dltk.javascript.core.dom.VariableReference;
import org.eclipse.dltk.javascript.core.dom.rewrite.RefactoringUtils;
import org.eclipse.dltk.javascript.core.dom.rewrite.VariableLookup;
import org.eclipse.dltk.javascript.core.dom.util.DomSwitch;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;


class SourceAnalyzer  {

	/*public static class NameData {
		private String fName;
		private List fReferences;
		public NameData(String n) {
			fName= n;
			fReferences= new ArrayList(2);
		}
		public String getName() {
			return fName;
		}
		public void addReference(SimpleName ref) {
			fReferences.add(ref);
		}
		public List references() {
			return fReferences;
		}
	}*/

	private class ActivationAnalyzer extends DomSwitch<Boolean> {
		public RefactoringStatus status= new RefactoringStatus();
		private Node fLastNode= getLastNode();
		//private IMethodBinding fBinding= getBinding();
		public void traverse(Node node) {
			TreeIterator<EObject> it = node.eAllContents();
			while(it.hasNext()) {
				if (doSwitch(it.next()) != null)
					it.prune();
			}
		}
		public Boolean caseReturnStatement(ReturnStatement node) {
			if (node != fLastNode) {
				interruptedFlow= true;
			}
			return null;
		}
		public Boolean caseFunctionExpression(FunctionExpression node) {
			return false;
		}
		public Boolean caseVariableReference(VariableReference node) {
			IModelElement[] elems;
			try {
				elems = cu.codeSelect(node.getBegin(), node.getEnd()-node.getBegin());
			} catch (ModelException e) {
				status.addFatalError(RefactoringCoreMessages.InlineMethodRefactoring_SourceAnalyzer_declaration_has_errors);
				return false;
			}
			for(IModelElement elem : elems)
				if (elem.equals(method)) {
					status.addFatalError(RefactoringCoreMessages.InlineMethodRefactoring_SourceAnalyzer_recursive_call);
					return false;
				}
			return false;
		}
		private Node getLastNode() {
			List<Statement> statements= declaration.getBody().getStatements();
			if (statements.size() == 0)
				return null;
			return (Node)statements.get(statements.size() - 1);
		}
	}

	private class UpdateCollector extends DomSwitch<Boolean> {
		void traverse(Node node) {
			TreeIterator<EObject> it = node.eAllContents();
			while(it.hasNext()) {
				if (doSwitch(it.next()) != null)
					it.prune();
			}
		}
		public Boolean caseFunctionExpression(FunctionExpression node) {
			return true;
		}
		/*private int fTypeCounter;
		public boolean visit(TypeDeclaration node) {
			return visitType(node);
		}
		public void endVisit(TypeDeclaration node) {
			fTypeCounter--;
		}
		public boolean visit(EnumDeclaration node) {
			return visitType(node);
		}
		public void endVisit(EnumDeclaration node) {
			fTypeCounter--;
		}
		public boolean visit(AnnotationTypeDeclaration node) {
			return visitType(node);
		}
		public void endVisit(AnnotationTypeDeclaration node) {
			fTypeCounter--;
		}
		private boolean visitType(AbstractTypeDeclaration node) {
			if (fTypeCounter++ == 0) {
				addNameReference(node.getName());
			}
			return true;
		}
		public boolean visit(AnonymousClassDeclaration node) {
			fTypeCounter++;
			return true;
		}
		public void endVisit(AnonymousClassDeclaration node) {
			fTypeCounter--;
		}
		public boolean visit(FieldAccess node) {
			// only visit the expression and not the simple name
			node.getExpression().accept(this);
			addReferencesToName(node.getName());
			return false;
		}
		public boolean visit(MethodDeclaration node) {
			if (node.isConstructor()) {
				AbstractTypeDeclaration decl= (AbstractTypeDeclaration) ASTNodes.getParent(node, AbstractTypeDeclaration.class);
				NameData name= (NameData)fNames.get(decl.getName().resolveBinding());
				if (name != null) {
					name.addReference(node.getName());
				}
			}
			return true;
		}*/
		public Boolean caseCallExpression(CallExpression node) {
			//if (fTypeCounter == 0) {
				Expression receiver = RefactoringUtils.getReceiver(node);
				if (receiver == null) {
					implicitReceiversCount++;
				}
			//}
			return null;
		}
		/*public boolean visit(SuperMethodInvocation node) {
			if (fTypeCounter == 0) {
				fHasSuperMethodInvocation= true;
			}
			return true;
		}
		public boolean visit(SuperConstructorInvocation node) {
			if (fTypeCounter == 0) {
				fHasSuperMethodInvocation= true;
			}
			return true;
		}*/
		/*public boolean visit(NewExpression node) {
			if (fTypeCounter == 0) {
				Expression receiver= node.getExpression();
				if (receiver == null) {
					if (node.resolveTypeBinding().isLocal())
						fImplicitReceivers.add(node);
				}
			}
			return true;
		}
		public boolean visit(SingleVariableDeclaration node) {
			if (fTypeCounter == 0)
				addNameReference(node.getName());
			return true;
		}
		public boolean visit(VariableDeclarationFragment node) {
			if (fTypeCounter == 0)
				addNameReference(node.getName());
			return true;
		}
		public boolean visit(SimpleName node) {
			addReferencesToName(node);
			IBinding binding= node.resolveBinding();
			if (binding instanceof ITypeBinding) {
				ITypeBinding type= (ITypeBinding)binding;
				if (type.isTypeVariable()) {
					addTypeVariableReference(type, node);
				}
			} else if (binding instanceof IVariableBinding) {
				IVariableBinding vb= (IVariableBinding)binding;
				if (vb.isField() && ! isStaticallyImported(node)) {
					Name topName= ASTNodes.getTopMostName(node);
					if (node == topName || node == ASTNodes.getLeftMostSimpleName(topName)) {
						StructuralPropertyDescriptor location= node.getLocationInParent();
						if (location != SingleVariableDeclaration.NAME_PROPERTY
							&& location != VariableDeclarationFragment.NAME_PROPERTY) {
							fImplicitReceivers.add(node);
						}
					}
				} else if (!vb.isField()) {
					// we have a local. Check if it is a parameter.
					ParameterData data= (ParameterData)fParameters.get(binding);
					if (data != null) {
						ASTNode parent= node.getParent();
						if (parent instanceof Expression) {
							int precedence= OperatorPrecedence.getExpressionPrecedence((Expression)parent);
							if (precedence != Integer.MAX_VALUE) {
								data.setOperatorPrecedence(precedence);
							}
						}
					}
				}
			}
			return true;
		}*/
		public Boolean caseThisExpression(ThisExpression node) {
			//if (fTypeCounter == 0) {
				implicitReceiversCount++;
			//}
			return true;
		}
		/*private void addReferencesToName(SimpleName node) {
			IBinding binding= node.resolveBinding();
			ParameterData data= (ParameterData)fParameters.get(binding);
			if (data != null)
				data.addReference(node);

			NameData name= (NameData)fNames.get(binding);
			if (name != null)
				name.addReference(node);
		}
		private void addNameReference(SimpleName name) {
			fNames.put(name.resolveBinding(), new NameData(name.getIdentifier()));
		}
		private void addTypeVariableReference(ITypeBinding variable, SimpleName name) {
			NameData data= (NameData)fTypeParameterMapping.get(variable);
			if (data == null) {
				data= (NameData)fMethodTypeParameterMapping.get(variable);
			}
			data.addReference(name);
		}
		private boolean isStaticallyImported(Name name) {
			return fStaticsToImport.contains(name);
		}*/
	}

	/*private class VarargAnalyzer extends ASTVisitor {
		private IBinding fParameter;
		public VarargAnalyzer(IBinding parameter) {
			fParameter= parameter;
		}
		public boolean visit(ArrayAccess node) {
			Expression array= node.getArray();
			if (array instanceof SimpleName && fParameter.isEqualTo(((SimpleName)array).resolveBinding())) {
				fArrayAccess= true;
			}
			return true;
		}
	}*/

	private ISourceModule cu;
	private IMethod method;
	private FunctionExpression declaration;
	private ParameterData[] paramData;
	/*private Map fParameters;
	private Map fNames;*/
	private int implicitReceiversCount;

	/*private boolean fArrayAccess;
	private boolean fHasSuperMethodInvocation;

	private List/*<Name>* fTypesToImport;
	private List/*<Name>* fStaticsToImport;

	private List/*<NameData>* fTypeParameterReferences;
	private Map/*<ITypeBinding, NameData>* fTypeParameterMapping;

	private List/*<NameData>* fMethodTypeParameterReferences;
	private Map/*<ITypeBinding, NameData>* fMethodTypeParameterMapping;*/

	private boolean interruptedFlow;

	public SourceAnalyzer(FunctionExpression declaration, IMethod method) {
		this.cu = method.getSourceModule();
		this.method = method;
		this.declaration= declaration;
	}

	public boolean isExecutionFlowInterrupted() {
		return interruptedFlow;
	}

	public RefactoringStatus checkActivation() {
		RefactoringStatus result= new RefactoringStatus();
		/*if (!fTypeRoot.isStructureKnown()) {
			result.addFatalError(
				RefactoringCoreMessages.InlineMethodRefactoring_SourceAnalyzer_syntax_errors,
				JavaStatusContext.create(fTypeRoot));
			return result;
		}
		IProblem[] problems= ASTNodes.getProblems(fDeclaration, ASTNodes.NODE_ONLY, ASTNodes.ERROR);
		if (problems.length > 0) {
			result.addFatalError(
				RefactoringCoreMessages.InlineMethodRefactoring_SourceAnalyzer_declaration_has_errors,
				JavaStatusContext.create(fTypeRoot, fDeclaration));
			return result;
		}
		final IMethodBinding declarationBinding= fDeclaration.resolveBinding();
		if (declarationBinding != null) {
			final int modifiers= declarationBinding.getModifiers();
			if (Modifier.isAbstract(modifiers)) {
				result.addFatalError(RefactoringCoreMessages.InlineMethodRefactoring_SourceAnalyzer_abstract_methods, JavaStatusContext.create(fTypeRoot, fDeclaration));
				return result;
			} else if (Modifier.isNative(modifiers)) {
				result.addFatalError(RefactoringCoreMessages.InlineMethodRefactoring_SourceAnalyzer_native_methods, JavaStatusContext.create(fTypeRoot, fDeclaration));
				return result;
			}
		} else {
			result.addFatalError(RefactoringCoreMessages.InlineMethodRefactoring_SourceAnalyzer_methoddeclaration_has_errors, JavaStatusContext.create(fTypeRoot));
			return result;
		}*/
		ActivationAnalyzer analyzer= new ActivationAnalyzer();
		analyzer.traverse(declaration);
		result.merge(analyzer.status);
		/*if (!result.hasFatalError()) {
			List parameters= fDeclaration.parameters();
			fParameters= new HashMap(parameters.size() * 2);
			for (Iterator iter= parameters.iterator(); iter.hasNext();) {
				SingleVariableDeclaration element= (SingleVariableDeclaration) iter.next();
				IVariableBinding binding= element.resolveBinding();
				if (binding == null) {
					result.addFatalError(
						RefactoringCoreMessages.InlineMethodRefactoring_SourceAnalyzer_declaration_has_errors,
						JavaStatusContext.create(fTypeRoot, fDeclaration));
					return result;
				}
				fParameters.put(binding, element.getProperty(ParameterData.PROPERTY));
			}
			fNames= new HashMap();
			fImplicitReceivers= new ArrayList(2);

			fTypeParameterReferences= new ArrayList(0);
			fTypeParameterMapping= new HashMap();
			ITypeBinding declaringType= declarationBinding.getDeclaringClass();
			if (declaringType == null) {
				result.addFatalError(
					RefactoringCoreMessages.InlineMethodRefactoring_SourceAnalyzer_typedeclaration_has_errors,
					JavaStatusContext.create(fTypeRoot));
				return result;
			}
			ITypeBinding[] typeParameters= declaringType.getTypeParameters();
			for (int i= 0; i < typeParameters.length; i++) {
				NameData data= new NameData(typeParameters[i].getName());
				fTypeParameterReferences.add(data);
				fTypeParameterMapping.put(typeParameters[i], data);
			}

			fMethodTypeParameterReferences= new ArrayList(0);
			fMethodTypeParameterMapping= new HashMap();
			IMethodBinding method= declarationBinding;
			typeParameters= method.getTypeParameters();
			for (int i= 0; i < typeParameters.length; i++) {
				NameData data= new NameData(typeParameters[i].getName());
				fMethodTypeParameterReferences.add(data);
				fMethodTypeParameterMapping.put(typeParameters[i], data);
			}

		}
		if (fDeclaration.isVarargs()) {
			List parameters= fDeclaration.parameters();
			VarargAnalyzer vAnalyzer= new VarargAnalyzer(
				((SingleVariableDeclaration)parameters.get(parameters.size() - 1)).getName().resolveBinding());
			fDeclaration.getBody().accept(vAnalyzer);
		}*/
		return result;
	}

	public void initialize() {
		//BlockStatement body= declaration.getBody();
		// first collect the static imports. This is necessary to not mark
		// static imported fields and methods as implicit visible.
		//fTypesToImport= new ArrayList();
		//fStaticsToImport= new ArrayList();
		//ImportReferencesCollector.collect(body, fTypeRoot.getJavaProject(), null, fTypesToImport, fStaticsToImport);

		// Now collect implicit references and name references
		new UpdateCollector().traverse(declaration.getBody());

		Map<Identifier,VariableBinding> bindings = VariableLookup.findBindings(declaration);
		FlowContext context= new FlowContext(bindings);
		context.setConsiderAccessMode(true);
		context.setComputeMode(FlowContext.Mode.MERGE);
		InOutFlowAnalyzer flowAnalyzer= new InOutFlowAnalyzer(context);
		List<Statement> statements = declaration.getBody().getStatements();
		FlowInfo info= flowAnalyzer.perform(statements.toArray(new Node[statements.size()]));
		paramData = new ParameterData[declaration.getParameters().size()];
		int i=0;
		Map<VariableBinding,ParameterData> datas = new HashMap<VariableBinding,ParameterData>();
		for(Parameter element : declaration.getParameters()) {
			VariableBinding binding=bindings.get(element.getName());
			//ParameterData data= (ParameterData)element.getProperty(ParameterData.PROPERTY);
			ParameterData data = paramData[i++] = new ParameterData(element.getName());
			data.setAccessMode(info.getAccessMode(context, binding));
			datas.put(binding, data);
		}
		
		for(Map.Entry<Identifier,VariableBinding> entry : bindings.entrySet()) {
			Identifier key = entry.getKey();
			VariableBinding value = entry.getValue();
			if (value.getDeclaration() != key) {
				ParameterData data = datas.get(value);
				if (data != null) data.addReference(key);
				if (key.eContainer().eContainmentFeature() == DomPackage.eINSTANCE.getCallExpression_Applicant())
					data.setFunction(true);
			}
		}
	}

	public String getCode() throws ModelException {
		return cu.getSource();
	}
	
	/*public Collection getUsedNames() {
		return fNames.values();
	}*/

	public int getImplicitReceiversCount() {
		return implicitReceiversCount;
	}

	/*public List getTypesToImport() {
		return fTypesToImport;
	}

	public List getStaticsToImport() {
		return fStaticsToImport;
	}

	public List getTypeParameterReferences() {
		return fTypeParameterReferences;
	}

	public List getMethodTypeParameterReferences() {
		return fMethodTypeParameterReferences;
	}

	public boolean hasArrayAccess() {
		return fArrayAccess;
	}

	public boolean hasSuperMethodInvocation() {
		return fHasSuperMethodInvocation;
	}*/

	public ParameterData getParameterData(int index) {
		return paramData[index];
	}
	
	public ISourceModule getSourceModule() {
		return cu;
	}
}
