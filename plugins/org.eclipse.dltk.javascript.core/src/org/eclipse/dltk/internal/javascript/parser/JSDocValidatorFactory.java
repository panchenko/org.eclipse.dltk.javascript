package org.eclipse.dltk.internal.javascript.parser;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.compiler.problem.DefaultProblem;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.compiler.problem.ProblemSeverities;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.builder.AbstractBuildParticipantType;
import org.eclipse.dltk.core.builder.IBuildContext;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.core.builder.ISourceLineTracker;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;
import org.eclipse.dltk.internal.javascript.validation.JavaScriptValidations;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder;

public class JSDocValidatorFactory extends AbstractBuildParticipantType {

	@Override
	public IBuildParticipant createBuildParticipant(IScriptProject project)
			throws CoreException {
		return new JSDocValidator();
	}

	private static class JSDocValidator implements IBuildParticipant {

		public void build(IBuildContext context) throws CoreException {
			final TypeInferencer2 inferencer2 = new TypeInferencer2();
			TypeInferencerVisitor sr = new TypeInferencerVisitor(inferencer2);
			sr.setProblemReporter(new Reporter(context));
			inferencer2.setVisitor(sr);
			inferencer2.setModelElement(context.getModelElement());
			inferencer2.doInferencing(JavaScriptValidations.parse(context));
		}

	}

	private static class Reporter implements IModelBuilder.IProblemReporter {

		private final IBuildContext context;

		public Reporter(IBuildContext context) {
			this.context = context;
		}

		public void reportProblem(IProblemIdentifier identifier,
				String message, int start, int end) {
			context.getProblemReporter().reportProblem(
					new DefaultProblem(message, 0, null,
							ProblemSeverities.Warning, start, end,
							lineNumberOf(start)));
		}

		private ISourceLineTracker lineTracker = null;

		private int lineNumberOf(int start) {
			if (start < 0) {
				return -1;
			}
			if (lineTracker == null) {
				lineTracker = context.getLineTracker();
			}
			return lineTracker.getLineNumberOfOffset(start) + 1;
		}

	}

}
