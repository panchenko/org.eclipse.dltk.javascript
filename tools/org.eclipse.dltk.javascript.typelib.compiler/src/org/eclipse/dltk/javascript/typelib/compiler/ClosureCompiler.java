/*******************************************************************************
 * Copyright (c) 2014 Alex Panchenko
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Alex Panchenko - initial API and Implementation
 *******************************************************************************/
package org.eclipse.dltk.javascript.typelib.compiler;

import static com.google.common.base.Predicates.instanceOf;

import java.util.List;

import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.core.ISourceNode;
import org.eclipse.dltk.internal.javascript.ti.JSDocSupport;
import org.eclipse.dltk.internal.javascript.ti.JSMethod;
import org.eclipse.dltk.javascript.ast.BinaryOperation;
import org.eclipse.dltk.javascript.ast.Comment;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Literal;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.JSParser;
import org.eclipse.dltk.javascript.parser.JSProblemReporterAdapter;
import org.eclipse.dltk.javascript.parser.PropertyExpressionUtils;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTags;
import org.eclipse.dltk.javascript.parser.jsdoc.SimpleJSDocParser;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.ReferenceSource;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.utils.TextUtils;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;

@SuppressWarnings("restriction")
public class ClosureCompiler extends AbstractTypeLibraryCompiler {

	private class PrintingReporter extends JSProblemReporterAdapter {
		private final ISourceNode node;

		public PrintingReporter(ISourceNode node) {
			this.node = node;
		}

		@Override
		public void reportProblem(IProblemIdentifier identifier, String message, int start, int end) {
			warn(node, "JSDoc error: %s", message);
		}
	}

	private static final String CONST = "@const";
	private static final String INTERFACE_TAG = "@interface";
	private static final String IMPLEMENTS_TAG = "@implements";
	private static final String PROTOTYPE = "prototype";

	private final SimpleJSDocParser jsdocParser = new SimpleJSDocParser();
	private final JSDocSupport jsdocSupport = new JSDocSupport();

	@Override
	public void load(String name, String source) {
		final Script script = parse(source);
		setSourceInformation(name, TextUtils.createLineTracker(source));
		parseTypes(script);
		parseProperties(script);
		parseConstants(script);
		parseMethods(script);
	}

	/**
	 * @param script
	 */
	private void parseTypes(final Script script) {
		for (FunctionStatement function : selectExpressions(script, FunctionStatement.class)) {
			final Comment doc = function.getDocumentation();
			if (doc == null) {
				warn(function, "Function %s() without jsdoc", function.getName());
				continue;
			}
			final JSDocTags tags = jsdocParser.parse(doc.getText(), doc.start());
			final JSDocTag constructorTag = tags.get(JSDocTag.CONSTRUCTOR);
			if (constructorTag != null || tags.get(INTERFACE_TAG) != null) {
				final String name = function.getName().getName();
				if (getType(name) != null) {
					error(function, "Duplicate type %s", name);
					continue;
				}
				final Type type = TypeInfoModelFactory.eINSTANCE.createType();
				type.setName(name);
				type.setInstantiable(constructorTag != null);
				addType(type);
				final JSDocTag extendsTag = tags.get(JSDocTag.EXTENDS);
				if (extendsTag != null) {
					final JSType extendsType = jsdocSupport.parseType(extendsTag, false, null);
					if (extendsType != null) {
						if (extendsType instanceof SimpleType) {
							type.setSuperTypeExpr((SimpleType) extendsType);
						} else {
							warn(extendsTag, "%s invalid type value %s", JSDocTag.EXTENDS, extendsType.getClass().getName());
						}
					}
				}
				for (JSDocTag implementsTag : tags.list(IMPLEMENTS_TAG)) {
					final JSType implementsType = jsdocSupport.parseType(implementsTag, false, null);
					if (implementsType != null) {
						if (implementsType instanceof SimpleType) {
							type.getTraits().add(((SimpleType) implementsType).getTarget());
						} else {
							warn(implementsTag, "%s invalid type value %s", IMPLEMENTS_TAG, implementsType.getClass().getName());
						}
					}
				}
			} else {
				warn(function, "Function %s() without %s/%s", function.getName(), JSDocTag.CONSTRUCTOR, INTERFACE_TAG);
			}
		}
	}

	/**
	 * @param script
	 */
	private void parseMethods(final Script script) {
		final FluentIterable<BinaryOperation> methods = selectExpressions(script, BinaryOperation.class)
				.filter(IS_ASSIGNMENT)
				.filter(Predicates.compose(instanceOf(PropertyExpression.class), LEFT))
				.filter(Predicates.compose(instanceOf(FunctionStatement.class), RIGHT));
		for (BinaryOperation operation : methods) {
			final Expression expression = operation.getLeftExpression();
			final Comment doc = expression.getDocumentation();
			if (doc == null) {
				warn(operation, "No documentation for %s", expression);
				continue;
			}
			final List<String> path = PropertyExpressionUtils.path(expression);
			if (path.size() != 2 && path.size() != 3) {
				warn(operation, "Unexpected expression %s", expression);
				continue;
			}
			if (path.size() == 3 && !PROTOTYPE.equals(path.get(1))) {
				warn(operation, "Expression %s should contain %s in the middle", expression, PROTOTYPE);
				continue;
			}
			final Method method = TypeInfoModelFactory.eINSTANCE.createMethod();
			method.setName(path.get(path.size() - 1));
			method.setStatic(path.size() == 2);
			if (!addToType(operation, method, path.get(0))) {
				continue;
			}
			final JSDocTags tags = jsdocParser.parse(doc.getText(), doc.start());
			final JSMethod jsMethod = new JSMethod((FunctionStatement) operation.getRightExpression(), ReferenceSource.UNKNOWN);
			jsdocSupport.processMethod(jsMethod, tags, new PrintingReporter(expression), null);
			for (IParameter parameter : jsMethod.getParameters()) {
				final Parameter p = TypeInfoModelFactory.eINSTANCE.createParameter();
				p.setName(parameter.getName());
				p.setType(parameter.getType());
				p.setKind(parameter.getKind());
				method.getParameters().add(p);
			}
			method.setType(jsMethod.getType());
			method.setDeprecated(jsMethod.isDeprecated());
		}
	}

	/**
	 * @param script
	 */
	private void parseProperties(final Script script) {
		final FluentIterable<PropertyExpression> properties = selectExpressions(script, PropertyExpression.class);
		for (PropertyExpression expression : properties) {
			final Comment doc = expression.getDocumentation();
			if (doc == null) {
				warn(expression, "No documentation for %s", expression);
				continue;
			}
			final List<String> path = PropertyExpressionUtils.path(expression);
			if (path.size() != 2 && path.size() != 3) {
				warn(expression, "Unsupported expression %s", expression);
				continue;
			}
			if (path.size() == 3 && !PROTOTYPE.equals(path.get(1))) {
				warn(expression, "Expression %s should contain %s in the middle", expression, PROTOTYPE);
				continue;
			}
			final Property property = TypeInfoModelFactory.eINSTANCE.createProperty();
			property.setName(path.get(path.size() - 1));
			property.setStatic(path.size() == 2);
			if (!addToType(expression, property, path.get(0))) {
				continue;
			}
			final JSDocTags tags = jsdocParser.parse(doc.getText(), doc.start());
			final JSDocTag typeTag = tags.get(JSDocTag.TYPE);
			if (typeTag != null) {
				property.setType(jsdocSupport.parseType(typeTag, false, new PrintingReporter(typeTag)));
			} else {
				final JSDocTag constTag = tags.get(CONST);
				if (constTag != null) {
					property.setType(jsdocSupport.parseType(constTag, true, new PrintingReporter(constTag)));
					property.setReadOnly(true);
				} else {
					warn(expression, "No type declaration for %s", fqName(property));
				}
			}
			property.setDeprecated(tags.get(JSDocTag.DEPRECATED) != null);
		}
	}

	/**
	 * @param script
	 */
	private void parseConstants(final Script script) {
		final FluentIterable<PropertyExpression> constants = selectExpressions(script, BinaryOperation.class)
				.filter(IS_ASSIGNMENT)
				.filter(Predicates.compose(instanceOf(Literal.class), RIGHT))
				.transform(LEFT)
				.filter(PropertyExpression.class);
		for (PropertyExpression expression : constants) {
			final Comment doc = expression.getDocumentation();
			if (doc == null) {
				warn(expression, "No documentation for %s", expression);
				continue;
			}
			final List<String> path = PropertyExpressionUtils.path(expression);
			if (path.size() != 2) {
				warn(expression, "Unsupported expression %s", expression);
				continue;
			}
			final Property property = TypeInfoModelFactory.eINSTANCE.createProperty();
			property.setName(path.get(1));
			property.setStatic(true);
			property.setReadOnly(true);
			if (!addToType(expression, property, path.get(0))) {
				continue;
			}
			final JSDocTags tags = jsdocParser.parse(doc.getText(), doc.start());
			final JSDocTag typeTag = tags.get(JSDocTag.TYPE);
			if (typeTag != null) {
				property.setType(jsdocSupport.parseType(typeTag, false, new PrintingReporter(typeTag)));
			} else {
				warn(expression, "No type declaration for %s", fqName(property));
			}
		}
	}

	private static final Predicate<BinaryOperation> IS_ASSIGNMENT = new Predicate<BinaryOperation>() {
		@Override
		public boolean apply(BinaryOperation input) {
			return input.getOperation() == JSParser.ASSIGN;
		}
	};

	private static final Function<BinaryOperation, Expression> LEFT = new Function<BinaryOperation, Expression>() {
		@Override
		public Expression apply(BinaryOperation input) {
			return input.getLeftExpression();
		}
	};

	private static final Function<BinaryOperation, Expression> RIGHT = new Function<BinaryOperation, Expression>() {
		@Override
		public Expression apply(BinaryOperation input) {
			return input.getRightExpression();
		}
	};
}
