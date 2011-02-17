package org.eclipse.dltk.javascript.parser;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.dltk.compiler.problem.DefaultProblemIdentifier;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.compiler.problem.ProblemSeverity;

public class JavaScriptParserSeverityReporter implements ISeverityReporter {

	public ProblemSeverity getSeverity(IProblemIdentifier problemId,
			ProblemSeverity defaultSeverity) {
		if (defaultSeverity == null)
			defaultSeverity = ProblemSeverity.WARNING;

		String severity = new InstanceScope().getNode(
				JavaScriptParserPlugin.PLUGIN_ID).get(
				DefaultProblemIdentifier.encode(problemId), null);
		if (severity != null) {
			if (ProblemSeverity.ERROR.name().equals(severity)) {
				return ProblemSeverity.ERROR;
			} else if (ProblemSeverity.WARNING.name().equals(severity)) {
				return ProblemSeverity.WARNING;
			} else if (ProblemSeverity.IGNORE.name().equals(severity)) {
				return null;
			}
		}
		return defaultSeverity;
	}

}
