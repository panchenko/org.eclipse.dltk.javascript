package org.eclipse.dltk.javascript.core.manipulation;

import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.manipulation.IRefactoringEngine;
import org.eclipse.dltk.internal.corext.refactoring.rename.ScriptRenameProcessor;
import org.eclipse.dltk.internal.javascript.corext.refactoring.Checks;
import org.eclipse.dltk.internal.javascript.corext.refactoring.rename.RenameFunctionProcessor;
import org.eclipse.dltk.internal.javascript.corext.refactoring.rename.RenameLocalVariableProcessor;

public class RefactoringEngine implements IRefactoringEngine {

	public boolean isRenameAvailable(IModelElement element)
			throws ModelException {
		return Checks.isAvailable(element);
	}

	public ScriptRenameProcessor createRenameProcessor(IModelElement element) {
		switch (element.getElementType()) {
//		case IModelElement.TYPE:
//			return RenameSupport.create((IType) element, newName, flags);
//		case IModelElement.METHOD:
//			final IMethod method= (IMethod) element;
//			if (method.isConstructor())
//				return createRenameSupport(method.getDeclaringType(), newName, flags);
//			else
//				return RenameSupport.create((IMethod) element, newName, flags);
//		case IModelElement.FIELD:
//			return RenameSupport.create((IField) element, newName, flags);
//		case IModelElement.TYPE_PARAMETER:
//			return RenameSupport.create((ITypeParameter) element, newName, flags);
		case IModelElement.TYPE:
		case IModelElement.METHOD:
			return new RenameFunctionProcessor(element);
		case IModelElement.FIELD:
		case IModelElement.LOCAL_VARIABLE:
			return new RenameLocalVariableProcessor(element);
		}
		return null;
	}
}
