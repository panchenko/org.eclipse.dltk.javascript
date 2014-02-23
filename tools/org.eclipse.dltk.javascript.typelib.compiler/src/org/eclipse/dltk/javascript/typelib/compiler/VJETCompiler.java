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

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.internal.javascript.ti.TypeSystemImpl;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.Comment;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.ObjectInitializer;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.PropertyInitializer;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.StringLiteral;
import org.eclipse.dltk.javascript.parser.PropertyExpressionUtils;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.javascript.typeinfo.RModelBuilder;
import org.eclipse.dltk.javascript.typeinfo.RTypes;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.Constructor;
import org.eclipse.dltk.javascript.typeinfo.model.FunctionType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.MConstructor;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModel51Factory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.UnionType;
import org.eclipse.dltk.javascript.typeinfo.model.Visibility;
import org.eclipse.dltk.javascript.typelib.compiler.VJETTokenizer.Token;
import org.eclipse.dltk.utils.TextUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import com.google.common.base.Strings;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;

public class VJETCompiler extends AbstractTypeLibraryCompiler {

	private static final String VJO = "vjo";
	private static final String CTYPE = "ctype";
	private static final String END_TYPE = "endType";

	private final List<Comment> comments = Lists.newArrayList();

	@Override
	public void load(String name, String source) {
		final Script script = parse(source);
		comments.clear();
		comments.addAll(script.getComments());
		setSourceInformation(name, TextUtils.createLineTracker(source));
		final FluentIterable<CallExpression> declarations = selectExpressions(script, CallExpression.class).filter(
				Predicates.compose(instanceOf(PropertyExpression.class), CALL_TARGET));
		int index = 0;
		for (CallExpression callExpression : declarations) {
			if (!isTypeDeclaration(callExpression)) {
				error(callExpression, "Type declaration should end with endType()");
				continue;
			}
			final String namePlaceholder = name + "_temp" + (++index);
			final Type type = TypeInfoModelFactory.eINSTANCE.createType();
			type.setName(namePlaceholder);
			parseType(type, ((PropertyExpression) callExpression.getExpression()).getObject());
			if (!namePlaceholder.equals(type.getName())) {
				addType(type);
			} else {
				error(callExpression, "Type name declaration not found");
			}
		}
	}

	private void parseType(Type type, Expression expression) {
		if (expression instanceof CallExpression) {
			final CallExpression call = (CallExpression) expression;
			if (call.getExpression() instanceof PropertyExpression) {
				final PropertyExpression pe = (PropertyExpression) call.getExpression();
				if (pe.getProperty() instanceof Identifier) {
					final String blockName = ((Identifier) pe.getProperty()).getName();
					if (call.getArguments().size() == 1 && call.getArguments().get(0) instanceof ObjectInitializer) {
						parseTypeDeclarationBlock(type, blockName, (ObjectInitializer) call.getArguments().get(0));
						parseType(type, pe.getObject());
					} else if (call.getArguments().size() == 1 && call.getArguments().get(0) instanceof StringLiteral
							&& PropertyExpressionUtils.equals(pe, VJO, CTYPE)) {
						type.setName(((StringLiteral) call.getArguments().get(0)).getValue());
					} else {
						warn(call, "Unsupported call parameters");
					}
				} else {
					warn(pe.getProperty(), "Unsupported PE, got %s", pe.getProperty().getClass());
				}
			} else {
				warn(call, "Unexpected callExpression format/arguments");
			}
		}
	}

	private void parseTypeDeclarationBlock(Type type, String blockName, ObjectInitializer objectInitializer) {
		info("Parsing %s", blockName);
		if ("protos".equals(blockName)) {
			parseMembers(type, objectInitializer, false);
		} else if ("props".equals(blockName)) {
			parseMembers(type, objectInitializer, true);
		} else {
			for (PropertyInitializer propertyInitializer : objectInitializer.getPropertyInitializers()) {
				info("  %s", PropertyExpressionUtils.nameOf(propertyInitializer.getName()));
			}
		}
	}

	private void parseMembers(Type type, ObjectInitializer objectInitializer, boolean isStatic) {
		PropertyInitializer[] propertyInitializers = objectInitializer.getPropertyInitializers();
		for (int i = 0, length = propertyInitializers.length; i < length; ++i) {
			final PropertyInitializer propertyInitializer = propertyInitializers[i];
			final String memberName = PropertyExpressionUtils.nameOf(propertyInitializer.getName());
			final Expression value = propertyInitializer.getValue();
			if (value instanceof CallExpression && isTypeDeclaration((CallExpression) value)) {
				info("  %s - nested type", memberName);

			} else if (PropertyExpressionUtils.equals(value, VJO, "NEEDS_IMPL") || value instanceof FunctionStatement) {
				int prevEnd = i == 0 ? objectInitializer.getLC() : propertyInitializers[i - 1].getValue().sourceEnd();
				final List<Comment> comments = findComments("//>", prevEnd, value.sourceStart());
				if (comments.isEmpty()) {
					warn(propertyInitializer.getValue(), "%s: no type comment", memberName);
					continue;
				}
				info("  %s - method", memberName);
				for (Comment comment : comments) {
					info("    %s", comment.getText().substring(3).trim());
					final String declaration = comment.getText().substring(3).trim();
					final VJETTokenizer tokenizer = new VJETTokenizer(declaration);
					final Method method;
					try {
						method = parseMethodDeclaration(memberName, isStatic, tokenizer);
					} catch (DeclarationException e) {
						info("%s", declaration);
						info("%s", Strings.repeat(" ", tokenizer.index()) + "^");
						warn(comment, "%s", e.getMessage());
						continue;
					}
					if (method instanceof Constructor) {
						method.setType(TypeUtil.ref(type));
						if (type.getStaticConstructor() == null) {
							type.setStaticConstructor((Constructor) method);
						} else if (type.getStaticConstructor() instanceof MConstructor) {
							((MConstructor) type.getStaticConstructor()).getChildren().add((Constructor) method);
						} else {
							final MConstructor mConstructor = TypeInfoModel51Factory.eINSTANCE.createMConstructor();
							mConstructor.getChildren().add(type.getStaticConstructor());
							mConstructor.getChildren().add((Constructor) method);
							type.setStaticConstructor(mConstructor);
						}
					} else {
						type.getMembers().add(method);
					}
				}
			} else {
				int nextStart = i == length - 1 ? objectInitializer.getRC() : propertyInitializers[i + 1].getName().sourceStart();
				final List<Comment> comments = findComments("//<", value.sourceEnd(), nextStart);
				if (comments.isEmpty()) {
					warn(propertyInitializer.getValue(), "%s: no type comment", memberName);
					continue;
				}
				if (comments.size() != 1) {
					warn(propertyInitializer.getValue(), "%s: multiple comments found", memberName);
					continue;
				}
				final String declaration = comments.get(0).getText().substring(3).trim();
				info("  %s - property (%s)", memberName, declaration);
				final Property property = TypeInfoModelFactory.eINSTANCE.createProperty();
				property.setName(memberName);
				property.setStatic(isStatic);
				final VJETTokenizer tokenizer = new VJETTokenizer(declaration);
				try {
					parsePropertyDeclaration(property, tokenizer);
					type.getMembers().add(property);
				} catch (DeclarationException e) {
					info("%s", declaration);
					info("%s", Strings.repeat(" ", tokenizer.index()) + "^");
					warn(propertyInitializer, "%s", e.getMessage());
				}
			}
		}
	}

	/**
	 * @param propertyInitializer
	 * @param method
	 * @param declaration
	 */
	private Method parseMethodDeclaration(final String methodName, boolean isStatic, VJETTokenizer tokenizer) {
		Visibility visibility = null;
		if (tokenizer.peek() == Token.PUBLIC) {
			visibility = Visibility.PUBLIC;
			tokenizer.consume();
		}
		final JSType returnType = parseType(tokenizer);
		final Method method;
		if (tokenizer.peek() != Token.IDENTIFIER || !methodName.equals(tokenizer.value())) {
			if (tokenizer.peek() == Token.LEFT_PAREN && returnType instanceof SimpleType
					&& "constructs".equals(returnType.getName())) {
				method = TypeInfoModelFactory.eINSTANCE.createConstructor();
			} else {
				throw new DeclarationException("Method name expected, got %s:%s", tokenizer.peek(), tokenizer.value());
			}
		} else {
			method = TypeInfoModelFactory.eINSTANCE.createMethod();
			method.setName(methodName);
			method.setStatic(isStatic);
			method.setType(returnType);
		}
		if (visibility != null) {
			method.setVisibility(visibility);
		}
		if (tokenizer.peek() == Token.IDENTIFIER) {
			tokenizer.consume();
		}
		if (tokenizer.peek() != Token.LEFT_PAREN) {
			throw new DeclarationException("Left parenthesis expected, got %s:%s", tokenizer.peek(), tokenizer.value());
		}
		tokenizer.consume();
		parseParameters(tokenizer, method.getParameters());
		if (tokenizer.peek() != Token.EOF) {
			throw new DeclarationException("Unexpected tokens after method type declaration (%s)", tokenizer.peek());
		}
		return method;
	}

	private void parseParameters(final VJETTokenizer tokenizer, final EList<Parameter> parameters) {
		while (tokenizer.peek() != Token.RIGHT_PAREN) {
			final Parameter parameter = TypeInfoModelFactory.eINSTANCE.createParameter();
			parameter.setType(parseType(tokenizer));
			if (tokenizer.peek() == Token.DOTS) {
				parameter.setKind(ParameterKind.VARARGS);
				tokenizer.consume();
			} else if (tokenizer.peek() == Token.QUESTION) {
				parameter.setKind(ParameterKind.OPTIONAL);
				tokenizer.consume();
			}
			if (tokenizer.peek() != Token.IDENTIFIER) {
				throw new DeclarationException("Parameter name expected, got %s/%s", tokenizer.peek(), tokenizer.value());
			}
			parameter.setName(tokenizer.value());
			tokenizer.consume();
			parameters.add(parameter);
			if (tokenizer.peek() == Token.COMMA) {
				tokenizer.consume();
			}
		}
		tokenizer.consume();
	}

	private void parsePropertyDeclaration(Property property, VJETTokenizer tokenizer) {
		for (;;) {
			final VJETTokenizer.Token token = tokenizer.peek();
			if (token == Token.PUBLIC) {
				property.setVisibility(Visibility.PUBLIC);
			} else if (token == Token.FINAL) {
				// skip
			} else {
				break;
			}
			tokenizer.consume();
		}
		property.setType(parseType(tokenizer));
		if (tokenizer.peek() != Token.EOF) {
			throw new DeclarationException("Unexpected tokens after property type declaration (%s)", tokenizer.peek());
		}
	}

	private JSType parseType(VJETTokenizer tokenizer) {
		if (tokenizer.peek() == Token.IDENTIFIER) {
			final JSType type;
			if ("ObjLiteral".equals(tokenizer.value())) {
				type = TypeUtil.mapOf(ITypeNames.STRING, ITypeNames.OBJECT);
			} else if ("void".equals(tokenizer.value())) {
				type = null;
			} else {
				type = TypeUtil.ref(TypeUtil.type(translateTypeName(tokenizer.value())));
			}
			tokenizer.consume();
			return type;
		} else if (tokenizer.peek() == Token.LEFT_PAREN) {
			tokenizer.consume();
			// public jQuery ready((void fn()) callback)
			final FunctionType functionType = TypeInfoModelFactory.eINSTANCE.createFunctionType();
			functionType.setReturnType(parseType(tokenizer));
			if (tokenizer.peek() != Token.IDENTIFIER) {
				throw new DeclarationException("Functin type: name expected");
			}
			tokenizer.consume();
			if (tokenizer.peek() != Token.LEFT_PAREN) {
				throw new DeclarationException("Functin type: ( expected");
			}
			tokenizer.consume();
			parseParameters(tokenizer, functionType.getParameters());
			if (tokenizer.peek() != Token.RIGHT_PAREN) {
				throw new DeclarationException("Functin type: ) expected");
			}
			tokenizer.consume();
			return functionType;
		} else {
			throw new DeclarationException("Type expected, but got %s", tokenizer.peek());
		}
	}

	private List<Comment> findComments(String prefix, int start, int end) {
		// TODO (alex) binary search ?
		List<Comment> result = null;
		for (Comment comment : comments) {
			if (!comment.isMultiLine() && comment.sourceStart() >= start && comment.sourceStart() < end
					&& comment.getText().startsWith(prefix)) {
				if (result == null) {
					result = Lists.newArrayList();
				}
				result.add(comment);
			}
		}
		return result != null ? result : ImmutableList.<Comment> of();
	}

	private boolean isTypeDeclaration(CallExpression callExpression) {
		final PropertyExpression expression = (PropertyExpression) callExpression.getExpression();
		return expression.getProperty() instanceof Identifier && END_TYPE.equals(((Identifier) expression.getProperty()).getName())
				&& callExpression.getArguments().isEmpty();
	}

	private static final Function<CallExpression, Expression> CALL_TARGET = new Function<CallExpression, Expression>() {
		@Override
		public Expression apply(CallExpression input) {
			return input.getExpression();
		}
	};

	private final TypeSystemImpl typeSystem = new TypeSystemImpl();

	private class MethodKey {
		final String name;
		final List<String> parameters;
		final IRType returnType;

		public MethodKey(Method method) {
			this.name = method.getName();
			this.parameters = FluentIterable.from(method.getParameters()).transform(new Function<Parameter, String>() {
				@Override
				public String apply(Parameter input) {
					return input.getName();
				}
			}).toImmutableList();
			returnType = method.getType() != null ? method.getType().toRType(typeSystem) : RTypes.undefined();
		}

		@Override
		public int hashCode() {
			return name.hashCode() ^ parameters.hashCode() ^ returnType.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof MethodKey) {
				final MethodKey other = (MethodKey) obj;
				return name.equals(other.name) && parameters.equals(other.parameters) && returnType.equals(other.returnType);
			}
			return false;
		}
	}

	public void mergeMethodParameterTypes() {
		typeSystem.reset();
		for (Type type : getTypes()) {
			final ListMultimap<MethodKey, Method> methods = ArrayListMultimap.create();
			for (Method method : Iterables.filter(type.getMembers(), Method.class)) {
				methods.put(new MethodKey(method), method);
			}
			for (Map.Entry<MethodKey, Collection<Method>> entry : methods.asMap().entrySet()) {
				if (entry.getValue().size() > 1) {
					final List<Method> candidates = (List<Method>) entry.getValue();
					boolean changes = false;
					for (int i = 0, paramCount = entry.getKey().parameters.size(); i < paramCount; ++i) {
						final UnionType targetType = TypeInfoModelFactory.eINSTANCE.createUnionType();
						for (Method method : candidates) {
							final JSType paramType = method.getParameters().get(i).getType();
							assert paramType != null;
							if (!contains(targetType.getTargets(), paramType)) {
								targetType.getTargets().add(EcoreUtil.copy(paramType));
							}
						}
						if (targetType.getTargets().size() > 1) {
							candidates.get(0).getParameters().get(i).setType(targetType);
							changes = true;
						}
					}
					if (changes) {
						info(
								"Optimized method signature %s(%s)",
								candidates.get(0).getName(),
								Joiner.on(',').join(RModelBuilder.convert(typeSystem, candidates.get(0).getParameters())));
						type.getMembers().removeAll(candidates.subList(1, candidates.size()));
					} else {
						warn(
								null,
								"Not optimized parameters of %s(%s)",
								entry.getKey().name,
								Joiner.on(',').join(entry.getKey().parameters));
					}
				}
			}
		}
	}

	private boolean contains(EList<JSType> types, JSType paramType) {
		for (JSType type : types) {
			if (EcoreUtil.equals(type, paramType)) {
				return true;
			}
		}
		return false;
	}
}
