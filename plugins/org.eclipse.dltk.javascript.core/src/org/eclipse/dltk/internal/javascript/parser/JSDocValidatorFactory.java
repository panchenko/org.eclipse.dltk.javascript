package org.eclipse.dltk.internal.javascript.parser;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.compiler.problem.DefaultProblem;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.compiler.problem.ProblemSeverity;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.builder.AbstractBuildParticipantType;
import org.eclipse.dltk.core.builder.IBuildContext;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.core.builder.ISourceLineTracker;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;
import org.eclipse.dltk.internal.javascript.validation.JavaScriptValidations;
import org.eclipse.dltk.internal.javascript.validation.ValidationMessages;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.parser.JSProblemReporter;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinfo.IJSDocTypeChecker;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.dltk.javascript.typeinfo.model.TypeRef;
import org.eclipse.osgi.util.NLS;

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
			TypeChecker typeChecker = new TypeChecker(inferencer2,
					sr.getProblemReporter());
			sr.setJSDocTypeChecker(typeChecker);
			inferencer2.setVisitor(sr);
			inferencer2.setModelElement(context.getModelElement());
			inferencer2.doInferencing(JavaScriptValidations.parse(context));
			typeChecker.validate();
		}

	}

	private static class TypeChecker implements IJSDocTypeChecker {

		private List<TagAndType> lst = new ArrayList<JSDocValidatorFactory.TagAndType>();
		private final TypeInferencer2 context;
		private final JSProblemReporter reporter;

		public TypeChecker(TypeInferencer2 context, JSProblemReporter reporter) {
			this.context = context;
			this.reporter = reporter;
		}

		public void checkType(JSType type, JSDocTag tag) {
			type = context.resolveTypeRef(type);
			if (type.getKind() == TypeKind.UNKNOWN
					|| type.getKind() == TypeKind.UNRESOLVED) {
				lst.add(new TagAndType(type, tag, context.currentCollection()));
			}
		}

		public void validate() {
			for (TagAndType tagAndType : lst) {
				checkType(tagAndType.tag, tagAndType.type,
						tagAndType.collection);
			}
		}

		protected void checkType(JSDocTag tag, JSType type,
				IValueCollection collection) {
			if (type != null) {
				type = context.resolveTypeRef(type);
				Assert.isTrue(type.getKind() != TypeKind.UNRESOLVED);
				if (type.getKind() == TypeKind.UNKNOWN) {
					if (!(type instanceof TypeRef && collection != null && collection
							.getChild(((TypeRef) type).getName()).exists())) {
						reportUnknownType(tag, TypeUtil.getName(type));
					}
				} else if (type instanceof ArrayType) {
					checkType(tag, ((ArrayType) type).getItemType(), collection);
				} else {
					final Type t = TypeUtil.extractType(type);
					if (t != null && t.isDeprecated()) {
						reporter.reportProblem(
								JavaScriptProblems.DEPRECATED_TYPE, NLS.bind(
										ValidationMessages.DeprecatedType,
										TypeUtil.getName(type)),
								tag.getStart(), tag.getEnd());
					}
				}
			} else {
				reportUnknownType(tag, TypeUtil.getName(type));
			}
		}

		public void reportUnknownType(JSDocTag tag, String name) {
			reportUnknownType(JavaScriptProblems.UNKNOWN_TYPE, tag, name);
		}

		public void reportUnknownType(IProblemIdentifier identifier,
				JSDocTag tag, String name) {
			int end = tag.getEnd();
			int start = end - tag.getValue().length();
			int index = tag.getValue().indexOf('{');
			if (index != -1) {
				int index2 = tag.getValue().indexOf('}', index);
				if (index2 != -1) {
					start = start + index + 1;
					end = start + index2 - 1;
				}
			}
			reporter.reportProblem(identifier,
					NLS.bind(ValidationMessages.UnknownType, name), start, end);
		}
	}

	private static class TagAndType {

		private final JSType type;
		private final JSDocTag tag;
		private final IValueCollection collection;

		public TagAndType(JSType type, JSDocTag tag, IValueCollection collection) {
			this.type = type;
			this.tag = tag;
			this.collection = collection;
		}

	}
	private static class Reporter implements JSProblemReporter {

		private final IBuildContext context;

		public Reporter(IBuildContext context) {
			this.context = context;
		}

		public void reportProblem(IProblemIdentifier identifier,
				String message, int start, int end) {
			reportProblem(ProblemSeverity.WARNING, identifier, message, start,
					end);
		}

		public void reportProblem(ProblemSeverity severity,
				IProblemIdentifier identifier, String message, int start,
				int end) {
			context.getProblemReporter().reportProblem(
					new DefaultProblem(message, identifier, null, severity,
							start, end, lineNumberOf(start)));
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
