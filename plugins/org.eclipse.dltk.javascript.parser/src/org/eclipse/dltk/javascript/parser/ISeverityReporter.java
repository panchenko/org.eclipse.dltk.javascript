package org.eclipse.dltk.javascript.parser;

import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.compiler.problem.ProblemSeverity;

public interface ISeverityReporter {
	public ProblemSeverity getSeverity(IProblemIdentifier problemId, ProblemSeverity defaultServerity);
}
