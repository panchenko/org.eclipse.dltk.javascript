package org.eclipse.dltk.internal.javascript.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.validation.ValidationMessages;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.parser.JSProblemReporter;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinfo.IJSDocTypeChecker;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.MapType;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.RecordType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.dltk.javascript.typeinfo.model.TypeRef;
import org.eclipse.dltk.javascript.typeinfo.model.UnionType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.osgi.util.NLS;

public class JSDocValidatorFactory {

	public static class TypeChecker implements IJSDocTypeChecker {

		private List<TagAndType> lst = new ArrayList<JSDocValidatorFactory.TagAndType>();
		private final TypeInferencer2 context;
		private final JSProblemReporter reporter;

		public TypeChecker(TypeInferencer2 context, JSProblemReporter reporter) {
			this.context = context;
			this.reporter = reporter;
		}

		public void checkType(JSType type, JSDocTag tag) {
			if (type == null) {
				return;
			}
			type = context.resolveTypeRef(type);
			if (type instanceof UnionType) {
				EList<JSType> targets = ((UnionType) type).getTargets();
				for (JSType targetType : targets) {
					checkType(targetType, tag);
				}
			} else if (type instanceof ArrayType) {
				checkType(((ArrayType) type).getItemType(), tag);
			} else if (type instanceof MapType) {
				checkType(((MapType) type).getKeyType(), tag);
				checkType(((MapType) type).getValueType(), tag);
			} else if (type.getKind() == TypeKind.UNKNOWN
					|| type.getKind() == TypeKind.UNRESOLVED) {
				lst.add(new TagAndType(type, tag, context.currentCollection()));
			} else {
				checkDeprecatedType(type, tag);
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
							.getChild(type.getName()).exists())) {

						// if it still is not found, test if it is a
						// "package type"
						// an try to resolve that to a existing child.
						String className = type.getName();
						if (className.indexOf('.') != -1) {
							StringTokenizer st = new StringTokenizer(className,
									".");
							IValueReference child = null;
							while (st.hasMoreTokens()) {
								String token = st.nextToken();
								if (child == null)
									child = collection.getChild(token);
								else {
									if (child.getKind() == ReferenceKind.FUNCTION) {
										IValueCollection function = (IValueCollection) child
												.getAttribute(IReferenceAttributes.FUNCTION_SCOPE);
										if (function != null)
											child = function.getThis();
									}

									child = child.getChild(token);
								}

								if (!child.exists()) {
									child = null;
									break;
								}
							}
							// if the child is not null, it was found.
							if (child != null)
								return;
						}
						reportUnknownType(tag, TypeUtil.getName(type));
					}
				} else if (type instanceof ArrayType) {
					checkType(tag, ((ArrayType) type).getItemType(), collection);
				} else if (type instanceof RecordType) {
					for (Member member : ((RecordType) type).getMembers()) {
						checkType(tag, member.getType(), collection);
					}
				} else if (type instanceof MapType) {
					checkType(tag, ((MapType) type).getValueType(), collection);
					checkType(tag, ((MapType) type).getKeyType(), collection);
				} else if (type instanceof UnionType) {
					EList<JSType> targets = ((UnionType) type).getTargets();
					for (JSType unionTarget : targets) {
						checkType(tag, unionTarget, collection);
					}
				} else {
					checkDeprecatedType(type, tag);
				}
			} else {
				reportUnknownType(tag, TypeUtil.getName(type));
			}
		}

		private void checkDeprecatedType(JSType type, JSDocTag tag) {
			final Type t = TypeUtil.extractType(type);
			if (t != null && t.isDeprecated()) {
				reporter.reportProblem(
						JavaScriptProblems.DEPRECATED_TYPE,
						NLS.bind(ValidationMessages.DeprecatedType,
								TypeUtil.getName(type)), tag.getStart(),
						tag.getEnd());
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

}
