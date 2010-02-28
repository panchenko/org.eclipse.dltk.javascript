/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.parser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.parser.IModuleDeclaration;
import org.eclipse.dltk.compiler.IElementRequestor.ElementInfo;
import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.SourceParserUtil;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.internal.javascript.ti.IValueCollection;
import org.eclipse.dltk.internal.javascript.ti.IValueParent;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.ReferenceKind;
import org.eclipse.dltk.internal.javascript.ti.ReferenceLocation;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;

public class JavaScriptSourceElementParser2 extends
		JavaScriptSourceElementParser implements IReferenceAttributes {

	public static final String METHOD_REFERENCES = "METHOD_REFERENCES"; //$NON-NLS-1$

	public static final String FIELD_REFERENCES = "FIELD_REFERENCES"; //$NON-NLS-1$

	protected boolean isEnabled(IModuleSource module) {
		if (module.getModelElement() != null) {
			final String parserId = module.getModelElement().getScriptProject()
					.getOption(DLTKCore.PROJECT_SOURCE_PARSER_ID, false);
			return JavaScriptParser.PARSER_ID.equals(parserId);
		}
		return false;
	}

	private static class MethodRef {
		final String name;
		final int argCount;
		final int start;
		final int end;

		public MethodRef(Identifier identifier, int argCount) {
			this.name = identifier.getName();
			this.start = identifier.sourceStart();
			this.end = identifier.sourceEnd();
			this.argCount = argCount;
		}

	}

	@Override
	public void parseSourceModule(IModuleSource module) {
		if (!isEnabled(module)) {
			super.parseSourceModule(module);
			return;
		}
		final Script script;
		// TODO use cache
		final IModuleDeclaration declaration = SourceParserUtil.parse(module,
				JavaScriptNature.NATURE_ID, fReporter);
		if (declaration instanceof Script) {
			script = (Script) declaration;
		} else {
			script = new JavaScriptParser().parse(module, fReporter);
		}
		final TypeInferencer2 inferencer = createInferencer();
		inferencer.setVisitor(new TypeInferencerVisitor() {
			@Override
			public IValueReference visitCallExpression(CallExpression node) {
				reportMethodRef(node.getExpression(), node.getArguments()
						.size());
				return super.visitCallExpression(node);
			}

			private void reportMethodRef(ASTNode expression, int argCount) {
				if (expression instanceof Identifier) {
					final IValueCollection context = peekContext();
					@SuppressWarnings("unchecked")
					List<MethodRef> references = (List<MethodRef>) context
							.getAttribute(METHOD_REFERENCES);
					if (references == null) {
						references = new ArrayList<MethodRef>();
						context.setAttribute(METHOD_REFERENCES, references);
					}
					references.add(new MethodRef((Identifier) expression,
							argCount));
				} else if (expression instanceof PropertyExpression) {
					reportMethodRef(((PropertyExpression) expression)
							.getProperty(), argCount);
				}
			}

			@Override
			public IValueReference visitIdentifier(Identifier node) {
				reportFieldRef(node);
				return super.visitIdentifier(node);
			}

			@Override
			public IValueReference visitPropertyExpression(
					PropertyExpression node) {
				if (node.getProperty() instanceof Identifier) {
					reportFieldRef((Identifier) node.getProperty());
				}
				return super.visitPropertyExpression(node);
			}

			private void reportFieldRef(Identifier node) {
				final IValueCollection context = peekContext();
				FieldReferenceSet set = (FieldReferenceSet) context
						.getAttribute(FIELD_REFERENCES);
				if (set == null) {
					set = new FieldReferenceSet();
					context.setAttribute(FIELD_REFERENCES, set);
				}
				set.add(node.getName(), node.sourceStart(), node.sourceEnd());
			}

		});
		inferencer.doInferencing(script);
		fRequestor.enterModule();
		processScope(inferencer.getCollection(), new HashSet<IValueReference>());
		fRequestor.exitModule(script.sourceEnd());
	}

	protected TypeInferencer2 createInferencer() {
		return new TypeInferencer2();
	}

	/**
	 * @param statements
	 */
	private void processScope(IValueParent collection,
			Set<IValueReference> processed) {
		@SuppressWarnings("unchecked")
		final List<MethodRef> methodRefs = (List<MethodRef>) collection
				.getAttribute(METHOD_REFERENCES);
		// final FieldReferenceSet fieldReferences = (FieldReferenceSet)
		// collection
		// .getAttribute(FIELD_REFERENCES);
		for (String childName : collection.getDirectChildren()) {
			final IValueReference child = collection.getChild(childName);
			if (child == null || !processed.add(child))
				continue;
			if (child.getKind() == ReferenceKind.LOCAL) {
				final ReferenceLocation location = child.getLocation();
				reportMethodRefs(methodRefs, location.getDeclarationStart());
				final FieldInfo fi = new FieldInfo();
				fi.name = childName;
				fi.type = extractType(child);
				copyLocation(location, fi);
				fRequestor.enterField(fi);
				processScope(child, processed);
				fRequestor.exitField(location.getDeclarationEnd());
			} else if (child.getKind() == ReferenceKind.FUNCTION
					|| child.getChild(IValueReference.FUNCTION_OP) != null) {
				final ReferenceLocation location = child.getLocation();
				reportMethodRefs(methodRefs, location.getDeclarationStart());
				final MethodInfo mi = new MethodInfo();
				mi.name = childName;
				mi.returnType = extractType(child
						.getChild(IValueReference.FUNCTION_OP));
				copyLocation(location, mi);
				final IValueReference[] parameters = (IValueReference[]) child
						.getAttribute(PARAMETERS);
				if (parameters != null && parameters.length != 0) {
					for (IValueReference parameter : parameters) {
						if (extractType(parameter) != null) {
							mi.parameterTypes = new String[parameters.length];
							break;
						}
					}
					mi.parameterNames = new String[parameters.length];
					for (int i = 0; i < parameters.length; ++i) {
						mi.parameterNames[i] = parameters[i].getName();
						if (mi.parameterTypes != null) {
							mi.parameterTypes[i] = extractType(parameters[i]);
						}
					}
				}
				fRequestor.enterMethod(mi);
				final IValueCollection functionScope = (IValueCollection) child
						.getAttribute(FUNCTION_SCOPE);
				if (functionScope != null) {
					processScope(functionScope, processed);
				}
				fRequestor.exitMethod(location.getDeclarationEnd());
			}
		}
		reportMethodRefs(methodRefs, Integer.MAX_VALUE);
	}

	private void reportMethodRefs(List<MethodRef> methodRefs, int position) {
		if (methodRefs == null) {
			return;
		}
		Iterator<MethodRef> i = methodRefs.iterator();
		while (i.hasNext()) {
			final MethodRef ref = i.next();
			if (ref.start < position || position == Integer.MAX_VALUE) {
				fRequestor.acceptMethodReference(ref.name, ref.argCount,
						ref.start, ref.end);
				i.remove();
			} else {
				break;
			}
		}
	}

	private String extractType(IValueReference reference) {
		if (reference != null && reference.getDeclaredType() != null) {
			return reference.getDeclaredType().getName();
		} else {
			return null;
		}
	}

	/**
	 * @param location
	 * @param info
	 */
	private void copyLocation(ReferenceLocation location, ElementInfo info) {
		info.declarationStart = location.getDeclarationStart();
		info.nameSourceStart = location.getNameStart();
		info.nameSourceEnd = location.getNameEnd() - 1;
	}

}
