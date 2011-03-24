package org.eclipse.dltk.javascript.parser;

import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.compiler.problem.DefaultProblemIdentifier;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.compiler.problem.IProblemIdentifierExtension2;
import org.eclipse.dltk.compiler.problem.ProblemSeverity;
import org.eclipse.dltk.core.PreferencesLookupDelegate;

public class JavaScriptParserSeverityReporter implements ISeverityReporter {

	public ProblemSeverity getSeverity(IProblemIdentifier problemId,
			ProblemSeverity defaultSeverity) {
		if (problemId instanceof IProblemIdentifierExtension2) {
			final IProblemIdentifier prime = ((IProblemIdentifierExtension2) problemId)
					.getPrimeIdentifier();
			if (prime != null) {
				problemId = prime;
			}
		}
		if (defaultSeverity == null)
			defaultSeverity = ProblemSeverity.WARNING;

		// TODO local caching
		final String severity = new PreferencesLookupDelegate((IProject) null)
				.getString(problemId.contributor(),
						DefaultProblemIdentifier.encode(problemId));

		if (severity != null && severity.length() != 0) {
			if (ProblemSeverity.ERROR.name().equals(severity)) {
				return ProblemSeverity.ERROR;
			} else if (ProblemSeverity.WARNING.name().equals(severity)) {
				return ProblemSeverity.WARNING;
			} else if (ProblemSeverity.INFO.name().equals(severity)) {
				return ProblemSeverity.INFO;
			} else if (ProblemSeverity.IGNORE.name().equals(severity)) {
				return null;
			}
		}
		return defaultSeverity;
	}

}
