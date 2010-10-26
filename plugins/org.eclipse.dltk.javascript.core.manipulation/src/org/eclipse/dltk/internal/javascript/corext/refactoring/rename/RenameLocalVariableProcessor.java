package org.eclipse.dltk.internal.javascript.corext.refactoring.rename;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.manipulation.SourceModuleChange;
import org.eclipse.dltk.core.search.IDLTKSearchConstants;
import org.eclipse.dltk.core.search.IDLTKSearchScope;
import org.eclipse.dltk.core.search.SearchEngine;
import org.eclipse.dltk.core.search.SearchMatch;
import org.eclipse.dltk.core.search.SearchParticipant;
import org.eclipse.dltk.core.search.SearchPattern;
import org.eclipse.dltk.core.search.SearchRequestor;
import org.eclipse.dltk.internal.corext.refactoring.RefactoringCoreMessages;
import org.eclipse.dltk.internal.corext.refactoring.rename.RenameModelElementProcessor;
import org.eclipse.dltk.internal.corext.util.SearchUtils;
import org.eclipse.dltk.internal.javascript.corext.refactoring.Checks;
import org.eclipse.dltk.javascript.core.JavaScriptLanguageToolkit;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.text.edits.TextEditGroup;

public class RenameLocalVariableProcessor extends
		RenameModelElementProcessor {
	public RenameLocalVariableProcessor(IModelElement localVariable) {
		super(localVariable);
	}

	public RefactoringStatus checkNewElementName(String newName) throws CoreException {
		return Checks.validateIdentifier(newName);
	}

	@Override
	public boolean isApplicable() throws CoreException {
		return Checks.isAvailable(fLocalVariable);
	}

	@Override
	protected RefactoringStatus doCheckFinalConditions(IProgressMonitor pm,
			CheckConditionsContext context) throws CoreException,
			OperationCanceledException {
		try {
			pm.beginTask("", 1);	 //$NON-NLS-1$

			RefactoringStatus result= checkNewElementName(getNewElementName());
			if (result.hasFatalError())
				return result;
			createEdits(pm);
			//LocalAnalyzePackage[] localAnalyzePackages= new RenameAnalyzeUtil.LocalAnalyzePackage[] { fLocalAnalyzePackage };
			//result.merge(RenameAnalyzeUtil.analyzeLocalRenames(localAnalyzePackages, fChange, fCompilationUnitNode, true));
			return result;
		} finally {
			pm.done();
		}
	}

	private void createEdits(IProgressMonitor pm) throws CoreException{
		IDLTKLanguageToolkit toolkit = JavaScriptLanguageToolkit.getDefault();
		IDLTKSearchScope scope = SearchEngine.createWorkspaceScope(toolkit);
		SearchEngine engine = new SearchEngine();
		int rule = fUpdateReferences ? IDLTKSearchConstants.ALL_OCCURRENCES : IDLTKSearchConstants.DECLARATIONS;
		SearchPattern pattern= SearchPattern.createPattern(fLocalVariable, rule, SearchUtils.GENERICS_AGNOSTIC_MATCH_RULE, toolkit);
		IProgressMonitor monitor = new SubProgressMonitor(pm, 1000);
		final List<TextEdit> edits = new ArrayList<TextEdit>();
		engine.search(pattern, new SearchParticipant[]{ SearchEngine.getDefaultSearchParticipant() }, scope, new SearchRequestor() {
			@Override
			public void acceptSearchMatch(SearchMatch match) throws CoreException {
				if (match.getResource().equals(fCu.getCorrespondingResource()))
					edits.add(new ReplaceEdit(match.getOffset(), fCurrentName.length(), getNewElementName()));
			}
		}, monitor);
		fChange= new SourceModuleChange(RefactoringCoreMessages.RenameTempRefactoring_rename, fCu);
		MultiTextEdit rootEdit= new MultiTextEdit();
		fChange.setEdit(rootEdit);
		fChange.setKeepPreviewEdits(true);
		for (TextEdit edit : edits) {
			rootEdit.addChild(edit);
			fChange.addTextEditGroup(new TextEditGroup(RefactoringCoreMessages.RenameTempRefactoring_changeName, edit));
		}
	}
}
