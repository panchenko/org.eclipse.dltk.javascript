package org.eclipse.dltk.javascript.internal.ui.quickfix;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.dltk.compiler.problem.ProblemCategoryManager;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.ui.editor.IScriptAnnotation;
import org.eclipse.dltk.ui.text.IScriptCorrectionContext;
import org.eclipse.dltk.ui.text.IScriptCorrectionProcessor;

public class JSScriptCorrectionProcessor implements IScriptCorrectionProcessor {

	public JSScriptCorrectionProcessor() {
	}

	public boolean canFix(IScriptAnnotation annotation) {
		if (annotation.getId() == JavaScriptProblems.UNDECLARED_VARIABLE) {
			return true;
		} else {
			return ProblemCategoryManager.getInstance().getID(
					JavaScriptNature.NATURE_ID, JSDocTag.SUPPRESS_WARNINGS,
					annotation.getId()) != null;
		}
	}

	public boolean canFix(IMarker marker) {
		return false;
	}

	public void computeQuickAssistProposals(IScriptAnnotation annotation,
			IScriptCorrectionContext context) {
		if (annotation.getId() == JavaScriptProblems.UNDECLARED_VARIABLE) {
			context.addResolution(new CreateLocalVariableQuickFix(
					(IFile) annotation.getSourceModule().getResource(), context
							.getInvocationContext().getOffset()), annotation);
			context.addResolution(new CreateTopLevelVariable((IFile) annotation
					.getSourceModule().getResource(), context
					.getInvocationContext().getOffset()), annotation);

		} else {
			String id = ProblemCategoryManager.getInstance().getID(
					JavaScriptNature.NATURE_ID, JSDocTag.SUPPRESS_WARNINGS,
					annotation.getId());
			if (id != null) {
				context.addResolution(new GenerateSuppressWarningsResolution(
						(IFile) annotation.getSourceModule().getResource(),
						context.getInvocationContext().getOffset(), id),
						annotation);
			}
		}
	}

	public void computeQuickAssistProposals(IMarker marker,
			IScriptCorrectionContext context) {
		System.err.println(marker);
	}

}
