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
package org.eclipse.dltk.internal.javascript.ti;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.javascript.ast.BinaryOperation;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.Comment;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.JSNode;
import org.eclipse.dltk.javascript.ast.PropertyInitializer;
import org.eclipse.dltk.javascript.ast.Statement;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.ast.VariableStatement;
import org.eclipse.dltk.javascript.parser.JSParser;
import org.eclipse.dltk.javascript.parser.JSProblemReporter;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTags;
import org.eclipse.dltk.javascript.parser.jsdoc.SimpleJSDocParser;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder;
import org.eclipse.dltk.javascript.typeinfo.ITypeInfoContext;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;

/**
 * Implements support for javadocs tags .
 * 
 * @see http://jsdoc.sourceforge.net/
 * @see http://code.google.com/p/jsdoc-toolkit/wiki/TagType
 * @see http://code.google.com/p/jsdoc-toolkit/wiki/TagParam
 */
public class JSDocSupport implements IModelBuilder {

	private static final String DOTS = "...";

	public static String[] getTags() {
		return new String[] { JSDocTag.DEPRECATED, JSDocTag.PARAM,
				JSDocTag.TYPE, JSDocTag.RETURN, JSDocTag.RETURNS,
				JSDocTag.PRIVATE, JSDocTag.CONSTRUCTOR };
	}

	public String getFeatureId() {
		return JSDocSupport.class.getName();
	}

	public int priorityFor(ITypeInfoContext context) {
		return PRIORITY_DEFAULT;
	}

	public JSDocTags parse(Comment comment) {
		return new SimpleJSDocParser().parse(comment.getText(),
				comment.sourceStart());
	}

	public void processMethod(FunctionStatement statement, IMethod method,
			JSProblemReporter reporter) {
		Comment comment = getFunctionComment(statement);
		if (comment == null) {
			return;
		}
		final JSDocTags tags = parse(comment);
		processMethod(method, tags, reporter);
	}

	public void processMethod(IMethod method, final JSDocTags tags,
			JSProblemReporter reporter) {
		if (method.getType() == null) {
			parseType(method, tags, RETURN_TAGS, reporter);
		}
		parseParams(method, tags, reporter);
		parseDeprecation(method, tags, reporter);
		parsePrivate(method, tags, reporter);
		parseConstructor(method, tags, reporter);
	}

	public static Comment getCallComment(CallExpression call) {
		ASTNode node = call;
		while (node != null) {
			if (node instanceof JSNode) {
				final Comment doc = ((JSNode) node).getDocumentation();
				if (doc != null) {
					return doc;
				}
			}
			if (node instanceof Statement) {
				break;
			}
			if (!(node instanceof JSNode)) {
				break;
			}
			node = ((JSNode) node).getParent();
		}
		return null;
	}

	public static Comment getFunctionComment(FunctionStatement statement) {
		Comment documentation = statement.getDocumentation();
		if (documentation != null) {
			return documentation;
		}
		if (statement.getParent() instanceof BinaryOperation) {
			final BinaryOperation binary = (BinaryOperation) statement
					.getParent();
			if (binary.getOperation() == JSParser.ASSIGN
					&& binary.getRightExpression() == statement) {
				documentation = binary.getLeftExpression().getDocumentation();
				if (documentation != null) {
					return documentation;
				}
			}
		} else if (statement.getParent() instanceof PropertyInitializer) {
			final PropertyInitializer property = (PropertyInitializer) statement
					.getParent();
			if (property.getValue() == statement) {
				documentation = property.getName().getDocumentation();
				if (documentation != null) {
					return documentation;
				}
			}
		} else if (statement.getParent() instanceof VariableDeclaration) {
			final VariableDeclaration variable = (VariableDeclaration) statement
					.getParent();
			if (variable.getInitializer() == statement
					&& variable.getParent() instanceof VariableStatement) {
				return ((VariableStatement) variable.getParent())
						.getDocumentation();
			}
		}
		return null;
	}

	private void parseConstructor(IMethod method, JSDocTags tags,
			JSProblemReporter reporter) {
		if (tags.get(JSDocTag.CONSTRUCTOR) != null) {
			method.setConstructor(true);
			validateSingleTag(tags, JSDocTag.CONSTRUCTOR, reporter);
		}
	}

	/**
	 * @param method
	 * @param tags
	 */
	private void parsePrivate(IMember member, final JSDocTags tags,
			JSProblemReporter reporter) {
		if (tags.get(JSDocTag.PRIVATE) != null) {
			member.setPrivate(true);
			validateSingleTag(tags, JSDocTag.PRIVATE, reporter);
		}
	}

	private void validateSingleTag(JSDocTags tags, String tagName,
			JSProblemReporter reporter) {
		if (reporter != null && tags.count(tagName) > 1) {
			final List<JSDocTag> t = tags.list(tagName);
			for (JSDocTag tag : t.subList(1, t.size())) {
				reportProblem(reporter, JSDocProblem.DUPLICATE_TAG, tag,
						tag.name());
			}
		}
	}

	public void processVariable(VariableStatement statement,
			IVariable variable, JSProblemReporter reporter) {
		final Comment comment = statement.getDocumentation();
		if (comment == null) {
			return;
		}
		final JSDocTags tags = parse(comment);
		if (variable.getType() == null) {
			parseType(variable, tags, TYPE_TAGS, reporter);
		}
		parseDeprecation(variable, tags, reporter);
		parsePrivate(variable, tags, reporter);
	}

	private void parseDeprecation(IMember member, JSDocTags tags,
			JSProblemReporter reporter) {
		if (tags.get(JSDocTag.DEPRECATED) != null) {
			member.setDeprecated(true);
			validateSingleTag(tags, JSDocTag.DEPRECATED, reporter);
		}
	}

	protected static class ParamInfo {
		public String type;
		public boolean varargs;
		public boolean optional;

		void clear() {
			type = null;
			varargs = false;
			optional = false;
		}
	}

	protected void parseParams(IMethod method, JSDocTags tags,
			JSProblemReporter reporter) {
		final Map<String, Type> objectPropertiesTypes = new HashMap<String, Type>();
		final Set<String> processedParams = new HashSet<String>();
		final ParamInfo pp = new ParamInfo();
		for (JSDocTag tag : tags.list(JSDocTag.PARAM)) {
			pp.clear();
			final Tokenizer st = new Tokenizer(tag.getValue());
			if (st.hasMoreTokens()) {
				final String token = st.peek();
				if (token.startsWith("{") && token.endsWith("}")) {
					String type = token.substring(1, token.length() - 1);
					if (type.startsWith(DOTS)) {
						pp.varargs = true;
						type = type.substring(DOTS.length());
					} else if (type.endsWith("=")) {
						type = type.substring(0, type.length() - 1);
						pp.optional = true;
					}
					pp.type = type;
					st.nextToken();
				}
			}
			if (st.hasMoreTokens()) {
				String paramName = st.nextToken();
				if (paramName.startsWith("[") && paramName.endsWith("]")) {
					pp.optional = true;
					paramName = paramName.substring(1, paramName.length() - 1);
					int defaultValueSeperatorIndex = paramName.indexOf('=');
					if (defaultValueSeperatorIndex != -1) {
						paramName = paramName.substring(0,
								defaultValueSeperatorIndex);
					}
				} else {
					String propertyName = null;
					int propertiesObjectIndex = paramName.indexOf('.');
					if (propertiesObjectIndex != -1) {
						// http://code.google.com/p/jsdoc-toolkit/wiki/TagParam
						// = Parameters With Properties =
						propertyName = paramName
								.substring(propertiesObjectIndex + 1);
						paramName = paramName.substring(0,
								propertiesObjectIndex);
						Type propertiesType = objectPropertiesTypes
								.get(paramName);
						if (propertiesType == null) {
							propertiesType = TypeInfoModelFactory.eINSTANCE
									.createType();
							objectPropertiesTypes
									.put(paramName, propertiesType);
							final IParameter param = method
									.getParameter(paramName);
							if (param != null) {
								param.setPropertiesType(propertiesType);
							}
						}
						Property property = TypeInfoModelFactory.eINSTANCE
								.createProperty();
						property.setName(propertyName);
						propertiesType.getMembers().add(property);
					}
					if (propertyName == null) {
						if (!processedParams.add(paramName)) {
							reportProblem(reporter,
									JSDocProblem.DUPLICATE_PARAM, tag,
									paramName);
							continue;
						}
					}
				}
				final IParameter parameter = method.getParameter(paramName);
				if (parameter != null) {
					if (!pp.optional && st.hasMoreTokens()
							&& st.nextToken().equals("optional")) {
						pp.optional = true;
					}
					updateParameter(tag, parameter, pp, reporter);
				} else {
					reportProblem(reporter, JSDocProblem.UNKNOWN_PARAM, tag,
							paramName);
				}
			} else {
				reportProblem(reporter, JSDocProblem.MISSING_PARAMETER_NAME,
						tag);
			}
		}
	}

	protected void updateParameter(JSDocTag tag, final IParameter parameter,
			final ParamInfo pp, JSProblemReporter reporter) {
		if (pp.type != null && parameter.getType() == null) {
			parameter.setType(translateTypeName(pp.type));
		}
		parameter.setOptional(pp.optional);
		parameter.setVarargs(pp.varargs);
	}

	private static final String[] RETURN_TAGS = { JSDocTag.RETURNS,
			JSDocTag.RETURN, JSDocTag.TYPE };

	public static final String[] TYPE_TAGS = { JSDocTag.TYPE };

	private static class Tokenizer {

		private final StringTokenizer st;

		public Tokenizer(String content) {
			st = new StringTokenizer(content);
		}

		private boolean hasCurrent = false;
		private String current;

		public boolean hasMoreTokens() {
			if (hasCurrent) {
				return true;
			}
			return st.hasMoreTokens();
		}

		public String peek() {
			if (!hasCurrent) {
				if (st.hasMoreElements()) {
					hasCurrent = true;
					current = st.nextToken();
				} else {
					return null;
				}
			}
			return current;
		}

		public String nextToken() {
			if (hasCurrent) {
				hasCurrent = false;
				return current;
			}
			return st.nextToken();
		}

	}

	/**
	 * @see St
	 * @param context
	 * @param member
	 * @param comment
	 */
	public void parseType(IElement member, JSDocTags tags, String[] tagNames,
			JSProblemReporter reporter) {
		final JSDocTag tag = tags.get(tagNames);
		if (tag != null) {
			if (reporter != null) {
				final int count = tags.count(tagNames);
				if (count > 1) {
					for (JSDocTag t : tags.list(tagNames).subList(1, count)) {
						if (t.name().equals(tag.name())) {
							reportProblem(reporter, JSDocProblem.DUPLICATE_TAG,
									t, t.name());
						} else {
							reportProblem(
									reporter,
									JSDocProblem.DUPLICATE_TAG,
									JSDocProblem.DUPLICATE_TAG.formatMessage(t
											.name())
											+ " (was "
											+ tag.name()
											+ ")", t);
						}
					}
				}
			}
			final Tokenizer st = new Tokenizer(tag.getValue());
			if (st.hasMoreTokens()) {
				member.setType(translateTypeName(st.nextToken()));
			} else {
				reportProblem(reporter, JSDocProblem.MISSING_TYPE_NAME, tag);
			}
		}
	}

	private void reportProblem(JSProblemReporter reporter,
			JSProblemIdentifier problemIdentifier, JSDocTag tag, Object... args) {
		if (reporter != null) {
			reporter.reportProblem(problemIdentifier,
					problemIdentifier.formatMessage(args), tag.getStart(),
					tag.getEnd());
		}
	}

	private void reportProblem(JSProblemReporter reporter,
			JSProblemIdentifier problemIdentifier, String message, JSDocTag tag) {
		if (reporter != null) {
			reporter.reportProblem(problemIdentifier, message, tag.getStart(),
					tag.getEnd());
		}
	}

	protected JSType translateTypeName(String typeName) {
		typeName = cutBraces(typeName);
		final ArrayType arrayType = parseArray(typeName);
		if (arrayType != null) {
			return arrayType;
		}
		return TypeUtil.ref(translate(typeName));
	}

	protected String cutBraces(String typeName) {
		final int length = typeName.length();
		if (length > 2 && typeName.charAt(0) == '{'
				&& typeName.charAt(length - 1) == '}') {
			typeName = typeName.substring(1, length - 1);
		}
		return typeName;
	}

	private static final String ARRAY_PREFIX1 = "Array<";
	private static final String ARRAY_PREFIX2 = "Array.<";
	private static final String ARRAY_SUFFIX = "[]";

	protected ArrayType parseArray(String typeName) {
		if (typeName.endsWith(ARRAY_SUFFIX)) {
			final String itemTypeName = translate(typeName.substring(0,
					typeName.length() - ARRAY_SUFFIX.length()));
			return TypeUtil.arrayOf(TypeUtil.ref(itemTypeName));
		} else if (typeName.startsWith(ARRAY_PREFIX1) && typeName.endsWith(">")) {
			final String itemTypeName = translate(typeName.substring(
					ARRAY_PREFIX1.length(), typeName.length() - 1));
			return TypeUtil.arrayOf(TypeUtil.ref(itemTypeName));
		} else if (typeName.startsWith(ARRAY_PREFIX2) && typeName.endsWith(">")) {
			final String itemTypeName = translate(typeName.substring(
					ARRAY_PREFIX2.length(), typeName.length() - 1));
			return TypeUtil.arrayOf(TypeUtil.ref(itemTypeName));
		} else {
			return null;
		}
	}

	protected String translate(String typeName) {
		return TypeInfoModelLoader.getInstance().translateTypeName(typeName);
	}
}
