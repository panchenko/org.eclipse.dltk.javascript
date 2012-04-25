package org.eclipse.dltk.internal.javascript.corext.refactoring;

import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.ILocalVariable;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.internal.javascript.core.manipulation.Messages;
import org.eclipse.dltk.javascript.core.JavaScriptLanguageUtil;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;

public class Checks {
    private Checks() {
    }

    public static boolean isAvailable(IModelElement element) throws ModelException {
        if (element == null)
            return false;
        if (!element.exists())
            return false;
        if (element.isReadOnly())
            return false;
        // work around for https://bugs.eclipse.org/bugs/show_bug.cgi?id=48422
        // the Java project is now cheating regarding its children so we
        // shouldn't
        // call isStructureKnown if the project isn't open.
        // see bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=52474
        // if (!(element instanceof ILocalVariable) &&
        // !element.isStructureKnown())
        // return false;
        // if (element instanceof IMember && ((IMember)element).isBinary())
        // return false;
        return element instanceof IField || element instanceof IMethod || element instanceof ILocalVariable;
    }

    public static RefactoringStatus validateIdentifier(String newName) {
        if ("".equals(newName)) //$NON-NLS-1$
            return RefactoringStatus.createFatalErrorStatus(RefactoringCoreMessages.Checks_Choose_name);
        if (JavaScriptLanguageUtil.isValidIdentifier(newName))
            return new RefactoringStatus();
        else
            return RefactoringStatus.createFatalErrorStatus(Messages.format(
                    RefactoringCoreMessages.Checks_illegal_identifier,
                    newName));
    }
}
