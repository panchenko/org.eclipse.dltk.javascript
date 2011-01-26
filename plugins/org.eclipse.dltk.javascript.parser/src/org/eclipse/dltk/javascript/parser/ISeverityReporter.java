package org.eclipse.dltk.javascript.parser;

import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.javascript.parser.Reporter.Severity;

public interface ISeverityReporter {
	public Severity getSeverity(IProblemIdentifier problemId, Severity defaultServerity);
}
