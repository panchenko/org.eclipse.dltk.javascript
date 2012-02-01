package org.eclipse.dltk.javascript.internal.ui.quickfix;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.dltk.compiler.problem.DefaultProblemIdentifier;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.compiler.problem.ProblemCategoryManager;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.ui.IMarkerResolution;
import org.eclipse.ui.IMarkerResolutionGenerator;

public class JSProblemMarkerResolutionGenerator implements
		IMarkerResolutionGenerator {
	private static IMarkerResolution[] NONE = new IMarkerResolution[0];

	public IMarkerResolution[] getResolutions(IMarker marker) {
		IProblemIdentifier problemId = DefaultProblemIdentifier
				.getProblemId(marker);
		if (problemId == JavaScriptProblems.UNDECLARED_VARIABLE) {
			return new IMarkerResolution[] {
					new CreateLocalVariableQuickFix(
							(IFile) marker.getResource(), marker.getAttribute(
									IMarker.CHAR_START, -1)),
					new CreateTopLevelVariable((IFile) marker.getResource(),
							marker.getAttribute(IMarker.CHAR_START, -1)) };
		} else {
			String id = ProblemCategoryManager.getInstance().getID(
					JavaScriptNature.NATURE_ID, JSDocTag.SUPPRESS_WARNINGS,
					problemId);
			if (id != null) {
				return new IMarkerResolution[] { new GenerateSuppressWarningsResolution(
						(IFile) marker.getResource(), marker.getAttribute(
								IMarker.CHAR_START, -1), id) };
			}
		}
		return NONE;
	}

}
