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
package org.eclipse.dltk.javascript.typelib.closure;

import static com.google.common.base.Predicates.instanceOf;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.compiler.problem.ProblemCollector;
import org.eclipse.dltk.core.ISourceNode;
import org.eclipse.dltk.core.builder.ISourceLineTracker;
import org.eclipse.dltk.internal.javascript.ti.JSDocSupport;
import org.eclipse.dltk.internal.javascript.ti.JSMethod;
import org.eclipse.dltk.javascript.ast.BinaryOperation;
import org.eclipse.dltk.javascript.ast.Comment;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Literal;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.VoidExpression;
import org.eclipse.dltk.javascript.parser.JSParser;
import org.eclipse.dltk.javascript.parser.JSProblemReporterAdapter;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.javascript.parser.JavaScriptParserProblems;
import org.eclipse.dltk.javascript.parser.PropertyExpressionUtils;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTags;
import org.eclipse.dltk.javascript.parser.jsdoc.SimpleJSDocParser;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.ReferenceSource;
import org.eclipse.dltk.javascript.typeinfo.TypeInfoManager;
import org.eclipse.dltk.javascript.typeinfo.TypeLibraryFormat;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelResourceSet;
import org.eclipse.dltk.javascript.typelib.compiler.TypeLibCompilerUtil;
import org.eclipse.dltk.utils.TextUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import com.google.common.io.Files;

@SuppressWarnings("restriction")
public class ClosureCompiler {

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
	private final XMIResource resource = TypeInfoManager.newResource();
	private final Map<String, Type> types = new HashMap<String, Type>();

	private ISourceLineTracker lineTracker;

	public void load(File file, Charset charset) throws IOException {
		load(Files.toString(file, charset));
	}

	public void load(String source) {
		final ProblemCollector collector = new ProblemCollector() {
			@Override
			public void reportProblem(IProblem problem) {
				if (JavaScriptParserProblems.isSyntaxError(problem)) {
					super.reportProblem(problem);
				}
			}
		};
		final Script script = new JavaScriptParser().parse(source, collector);
		if (!collector.isEmpty()) {
			throw new IllegalArgumentException(collector.toString());
		}
		lineTracker = TextUtils.createLineTracker(source);
		parseTypes(script);
		parseProperties(script);
		parseConstants(script);
		parseMethods(script);
	}

	public void save(File output) throws IOException {
		TypeLibCompilerUtil.save(
				output,
				ImmutableMap.of(TypeLibraryFormat.NAME_HEADER, "w3c_dom", TypeLibraryFormat.VERSION_HEADER, "1.0"),
				resource);
		info("Saved to %s", output);
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
				if (types.containsKey(name)) {
					error(function, "Duplicate type %s", name);
					continue;
				}
				final Type type = TypeInfoModelFactory.eINSTANCE.createType();
				type.setName(name);
				type.setInstantiable(constructorTag != null);
				types.put(name, type);
				resource.getContents().add(type);
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

	private String fqName(Member member) {
		final Type type = member.getDeclaringType();
		return (type != null ? type.getName() : "?") + "." + member.getName();
	}

	private boolean addToType(ISourceNode expression, Property property, String typeName) {
		final Type type = types.get(typeName);
		if (type == null) {
			warn(expression, "Declaring type %s not found", typeName);
			return false;
		}
		if (!findMembers(type, property.getName(), property.isStatic()).isEmpty()) {
			error(expression, "Duplicate %smember %s.%s ", property.isStatic() ? "static " : "", typeName, property.getName());
			return false;
		}
		type.getMembers().add(property);
		return true;
	}

	private boolean addToType(ISourceNode expression, Method method, String typeName) {
		final Type type = types.get(typeName);
		if (type == null) {
			warn(expression, "Declaring type %s not found", typeName);
			return false;
		}
		if (!Collections2.filter(findMembers(type, method.getName(), method.isStatic()), instanceOf(Property.class)).isEmpty()) {
			error(
					expression,
					"Properties duplicated by %smethod %s.%s ",
					method.isStatic() ? "static " : "",
					typeName,
					method.getName());
			return false;
		}
		type.getMembers().add(method);
		return true;
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

	private static Collection<Member> findMembers(Type type, final String memberName, final boolean isStatic) {
		return Collections2.filter(type.getMembers(), new Predicate<Member>() {
			@Override
			public boolean apply(Member input) {
				return memberName.equals(input.getName()) && isStatic == input.isStatic();
			}
		});
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

	private void error(ISourceNode node, String format, Object... args) {
		log("Error", node, format, args);
	}

	private void warn(ISourceNode node, String format, Object... args) {
		log("Warning", node, format, args);
	}

	private void info(String format, Object... args) {
		System.out.println("INFO: " + String.format(format, args));
	}

	private void log(String level, ISourceNode node, String format, Object... args) {
		final StringBuilder sb = new StringBuilder();
		sb.append(level);
		if (node != null) {
			sb.append(" ");
			sb.append(lineTracker.getLineNumberOfOffset(node.start()) + 1);
		}
		sb.append(": ");
		new Formatter(sb).format(format, args);
		System.out.println(sb.toString());
	}

	public void reset() {
		types.clear();
	}

	private <E> FluentIterable<E> selectExpressions(Script script, final Class<E> type) {
		return FluentIterable.from(script.getStatements()).filter(VoidExpression.class).filter(new Predicate<VoidExpression>() {
			@Override
			public boolean apply(VoidExpression input) {
				return type.isInstance(input.getExpression());
			}
		}).transform(new Function<VoidExpression, E>() {
			@SuppressWarnings("unchecked")
			@Override
			public E apply(VoidExpression input) {
				return (E) input.getExpression();
			}
		});
	}

	public void resolveTypes() {
		if (resource.getResourceSet() == null) {
			new TypeInfoModelResourceSet().getResources().add(resource); // for proxy resolution
		}
		final Set<String> proxies = Sets.newHashSet();
		for (Iterator<EObject> i = resource.getAllContents(); i.hasNext();) {
			final EObject o = i.next();
			if (o instanceof SimpleType) {
				final SimpleType simple = (SimpleType) o;
				final Type type = simple.getTarget();
				if (type.isProxy()) {
					String name = type.getName();
					if (name.endsWith("?")) { // workaround for (opts:number?=) parameter declaration
						name = TypeInfoModelLoader.getInstance().translateTypeName(name.substring(0, name.length() - 1));
						simple.setTarget(TypeUtil.type(name));
						if (!simple.getTarget().isProxy()) {
							continue;
						}
					}
					proxies.add(name);
				}
			} else if (o instanceof Type) {
				for (Type trait : ((Type) o).getTraits()) {
					if (trait.isProxy()) {
						proxies.add(trait.getName());
					}
				}
			}
		}
		if (!proxies.isEmpty()) {
			warn(null, "Unresolved type(s): %s", Joiner.on(',').join(proxies));
			final SetView<String> intersection = Sets.intersection(proxies, types.keySet());
			if (!intersection.isEmpty()) {
				error(null, "Proxy resolution failed for " + intersection);
			}
		}
	}
}
