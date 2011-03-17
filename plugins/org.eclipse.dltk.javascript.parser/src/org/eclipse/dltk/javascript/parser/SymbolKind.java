package org.eclipse.dltk.javascript.parser;

public enum SymbolKind {
	PARAM(JavaScriptParserProblems.DUPLICATE_PARAMETER, null),

	VAR(JavaScriptParserProblems.DUPLICATE_VAR,
			JavaScriptParserProblems.VAR_HIDES_PARAM),

	CONST(JavaScriptParserProblems.DUPLICATE_CONST,
			JavaScriptParserProblems.CONST_HIDES_PARAM);

	final JSProblemIdentifier duplicateProblem;
	final JSProblemIdentifier hideProblem;

	SymbolKind(JSProblemIdentifier duplicateProblem,
			JSProblemIdentifier hideProblem) {
		this.duplicateProblem = duplicateProblem;
		this.hideProblem = hideProblem;
	}
}
