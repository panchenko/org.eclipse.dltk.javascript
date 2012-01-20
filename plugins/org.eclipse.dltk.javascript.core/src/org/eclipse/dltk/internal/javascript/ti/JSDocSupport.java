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

import java.text.ParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.compiler.problem.IProblemCategory;
import org.eclipse.dltk.compiler.problem.ProblemCategoryManager;
import org.eclipse.dltk.javascript.ast.BinaryOperation;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.Comment;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.IVariableStatement;
import org.eclipse.dltk.javascript.ast.JSNode;
import org.eclipse.dltk.javascript.ast.PropertyInitializer;
import org.eclipse.dltk.javascript.ast.Statement;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.ast.VariableStatement;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.parser.JSParser;
import org.eclipse.dltk.javascript.parser.JSProblemIdentifier;
import org.eclipse.dltk.javascript.parser.JSProblemReporter;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTags;
import org.eclipse.dltk.javascript.parser.jsdoc.SimpleJSDocParser;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder;
import org.eclipse.dltk.javascript.typeinfo.ITypeChecker;
import org.eclipse.dltk.javascript.typeinfo.ITypeInfoContext;
import org.eclipse.dltk.javascript.typeinfo.JSDocTypeParser;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.RecordProperty;
import org.eclipse.dltk.javascript.typeinfo.model.RecordType;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.osgi.util.NLS;

/**
 * Implements support for javadocs tags .
 * 
 * @see http://jsdoc.sourceforge.net/
 * @see http://code.google.com/p/jsdoc-toolkit/wiki/TagType
 * @see http://code.google.com/p/jsdoc-toolkit/wiki/TagParam
 */
public class JSDocSupport implements IModelBuilder {

	private static final String DOTS = "...";

	public String getFeatureId() {
		return JSDocSupport.class.getName();
	}

	public int priorityFor(ITypeInfoContext context) {
		return PRIORITY_DEFAULT;
	}

	public static JSDocTags parse(Comment comment) {
		return new SimpleJSDocParser().parse(comment.getText(),
				comment.sourceStart());
	}

	public void processMethod(FunctionStatement statement, IMethod method,
			JSProblemReporter reporter, ITypeChecker typeChecker) {
		Comment comment = getComment(statement);
		if (comment == null) {
			return;
		}
		final JSDocTags tags = parse(comment);
		processMethod(method, tags, reporter, typeChecker);
	}

	public void processMethod(IMethod method, final JSDocTags tags,
			JSProblemReporter reporter, ITypeChecker typeChecker) {
		if (method.getType() == null) {
			parseType(method, tags, RETURN_TAGS, reporter, typeChecker);
		}
		parseParams(method, tags, reporter, typeChecker);
		parseDeprecation(method, tags, reporter);
		parsePrivate(method, tags, reporter);
		parseProtected(method, tags, reporter);
		parseConstructor(method, tags, reporter);
		parseThrows(method, tags, reporter, typeChecker);
		parseSuppressWarnings(method, tags, reporter);
	}

	protected void parseSuppressWarnings(IElement element, JSDocTags tags,
			JSProblemReporter reporter) {
		final List<JSDocTag> suppressWarnings = tags
				.list(JSDocTag.SUPPRESS_WARNINGS);
		if (!suppressWarnings.isEmpty()) {
			for (JSDocTag tag : suppressWarnings) {
				processSuppressWarnings(tag, reporter, element);
			}
		}
	}

	private void parseThrows(IMethod method, JSDocTags tags,
			JSProblemReporter reporter, ITypeChecker typeChecker) {
		if (typeChecker != null) {
			List<JSDocTag> throwsTags = tags.list(JSDocTag.THROWS);
			for (JSDocTag throwsTag : throwsTags) {
				String value = throwsTag.value();
				String[] split = value.split(" ");
				if (split.length > 0) {
					if (isBraced(split[0])) {
						JSType type = translateTypeName(cutBraces(split[0]),
								throwsTag, reporter);
						typeChecker.checkType(type, throwsTag);
					}
				}
			}
		}

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

	@Deprecated
	public static Comment getFunctionComment(FunctionStatement statement) {
		return getComment(statement);
	}

	public static Comment getComment(JSNode statement) {
		Comment documentation = statement.getDocumentation();
		if (documentation != null) {
			return documentation;
		}
		final ASTNode parent = statement.getParent();
		if (parent instanceof BinaryOperation) {
			final BinaryOperation binary = (BinaryOperation) parent;
			if (binary.getOperation() == JSParser.ASSIGN
					&& binary.getRightExpression() == statement) {
				documentation = binary.getLeftExpression().getDocumentation();
				if (documentation != null) {
					return documentation;
				}
			}
		} else if (parent instanceof PropertyInitializer) {
			final PropertyInitializer property = (PropertyInitializer) parent;
			if (property.getValue() == statement) {
				documentation = property.getName().getDocumentation();
				if (documentation != null) {
					return documentation;
				}
			}
		} else if (parent instanceof VariableDeclaration) {
			final VariableDeclaration variable = (VariableDeclaration) parent;
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
			if (reporter != null && tags.count(JSDocTag.PROTECTED) > 0) {
				final List<JSDocTag> t = tags.list(JSDocTag.PROTECTED);
				for (JSDocTag tag : t) {
					reportProblem(reporter, JSDocProblem.IGNORED_TAG, tag,
							tag.name(), JSDocTag.PRIVATE);
				}
			}
		}
	}

	/**
	 * @param method
	 * @param tags
	 */
	private void parseProtected(IMember member, final JSDocTags tags,
			JSProblemReporter reporter) {
		if (tags.get(JSDocTag.PROTECTED) != null) {
			member.setProtected(true);
			validateSingleTag(tags, JSDocTag.PROTECTED, reporter);
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

	public void processVariable(VariableDeclaration declaration,
			IVariable variable, JSProblemReporter reporter,
			ITypeChecker typeChecker) {
		Comment comment = declaration.getDocumentation();
		if (comment == null) {
			final IVariableStatement statement = declaration.getStatement();
			final List<VariableDeclaration> vars = statement.getVariables();
			if (!vars.isEmpty() && vars.get(0) == declaration) {
				comment = statement.getDocumentation();
				if (comment == null) {
					return;
				}
			} else {
				return;
			}
		}
		final JSDocTags tags = parse(comment);
		if (variable.getType() == null) {
			parseType(variable, tags, TYPE_TAGS, reporter, typeChecker);
		}
		parseDeprecation(variable, tags, reporter);
		parsePrivate(variable, tags, reporter);
		parseProtected(variable, tags, reporter);
		parseSuppressWarnings(variable, tags, reporter);
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
			JSProblemReporter reporter, ITypeChecker typeChecker) {
		final List<JSDocTag> paramTags = tags.list(JSDocTag.PARAM);
		if (paramTags.isEmpty()) {
			return;
		}
		int problemCount = 0;
		final Map<String, RecordType> objectPropertiesTypes = new HashMap<String, RecordType>();
		final Set<String> processedParams = new HashSet<String>();
		final ParamInfo pp = new ParamInfo();
		for (JSDocTag tag : paramTags) {
			pp.clear();
			final Tokenizer st = new Tokenizer(tag.value());
			if (st.hasMoreTokens()) {
				final String token = st.peek();
				if (isBraced(token)) {
					String type = cutBraces(token);
					if (type.startsWith(DOTS)) {
						pp.varargs = true;
						type = type.substring(DOTS.length());
					} else if (type.endsWith(DOTS)) {
						pp.varargs = true;
						type = type.substring(0, type.length() - DOTS.length());
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
				}
				String propertyName = null;
				int propertiesObjectIndex = paramName.indexOf('.');
				if (propertiesObjectIndex != -1) {
					// http://code.google.com/p/jsdoc-toolkit/wiki/TagParam
					// = Parameters With Properties =
					propertyName = paramName
							.substring(propertiesObjectIndex + 1);
					String objectName = paramName.substring(0,
							propertiesObjectIndex);
					RecordType propertiesType = objectPropertiesTypes
							.get(objectName);
					if (propertiesType == null) {
						propertiesType = TypeInfoModelFactory.eINSTANCE
								.createRecordType();
						propertiesType.setTypeName('{' + objectName + '}');
						objectPropertiesTypes.put(objectName, propertiesType);
						final IParameter param = method
								.getParameter(objectName);
						if (param != null) {
							param.setType(propertiesType);
						} else {
							++problemCount;
							reportProblem(reporter, JSDocProblem.UNKNOWN_PARAM,
									tag, objectName);
						}
					}
					final RecordProperty property = TypeInfoModelFactory.eINSTANCE
							.createRecordProperty();
					property.setName(propertyName);
					if (pp.type != null) {
						JSType type = translateTypeName(pp.type, tag, reporter);
						if (typeChecker != null)
							typeChecker.checkType(type, tag);
						property.setType(type);
					}
					property.setOptional(pp.optional);
					propertiesType.getMembers().add(property);
					continue;
				}
				if (method.getParameter(paramName) != null
						&& !processedParams.add(paramName)) {
					++problemCount;
					reportProblem(reporter, JSDocProblem.DUPLICATE_PARAM, tag,
							paramName);
					continue;
				}
				IParameter parameter = method.getParameter(paramName);
				if (parameter != null) {
					if (!pp.optional && st.hasMoreTokens()
							&& st.nextToken().equals("optional")) {
						pp.optional = true;
					}
					updateParameter(tag, parameter, pp, reporter, typeChecker);
				} else if (pp.varargs) {
					/*
					 * create virtual parameter for varargs as most of the time
					 * passed values are accessed via "arguments" object and
					 * parameter declaration in code is not required.
					 */
					parameter = method.createParameter();
					parameter.setName(paramName);
					updateParameter(tag, parameter, pp, reporter, typeChecker);
					method.getParameters().add(parameter);
				} else {
					++problemCount;
					reportProblem(reporter, JSDocProblem.UNKNOWN_PARAM, tag,
							paramName);
				}
			} else {
				++problemCount;
				reportProblem(reporter, JSDocProblem.MISSING_PARAMETER_NAME,
						tag);
			}
		}
		if (problemCount == 0 && reporter != null) {
			for (IParameter parameter : method.getParameters()) {
				if (!processedParams.contains(parameter.getName())
						&& !objectPropertiesTypes.containsKey(parameter
								.getName())) {
					final ReferenceLocation location = parameter.getLocation();
					reporter.reportProblem(
							JSDocProblem.PARAMETER_MISSING_ANNOTATION,
							JSDocProblem.PARAMETER_MISSING_ANNOTATION
									.formatMessage(parameter.getName()),
							location.getNameStart(), location.getNameEnd());
				}
			}
		}
	}

	protected void updateParameter(JSDocTag tag, final IParameter parameter,
			final ParamInfo pp, JSProblemReporter reporter,
			ITypeChecker typeChecker) {
		if (pp.type != null && parameter.getType() == null) {
			JSType type = translateTypeName(pp.type, tag, reporter);
			if (typeChecker != null)
				typeChecker.checkType(type, tag);
			parameter.setType(type);
		}
		parameter.setOptional(pp.optional);
		parameter.setVarargs(pp.varargs);
	}

	protected static final String[] RETURN_TAGS = { JSDocTag.RETURNS,
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
					current = getNextToken();
				} else {
					return null;
				}
			}
			return current;
		}

		/**
		 * @return
		 */
		private String getNextToken() {
			String token = st.nextToken();
			while (!isClosed(token) && st.hasMoreTokens()) {
				token += st.nextToken();
			}
			return token;
		}

		private boolean isClosed(String str) {
			int open = 0;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch == '{')
					open++;
				else if (ch == '}')
					open--;
			}
			return open == 0;
		}

		public String nextToken() {
			if (hasCurrent) {
				hasCurrent = false;
				return current;
			}
			return getNextToken();
		}

	}

	/**
	 * @see St
	 * @param context
	 * @param member
	 * @param comment
	 */
	public void parseType(IElement member, JSDocTags tags, String[] tagNames,
			JSProblemReporter reporter, ITypeChecker typeChecker) {
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
			final JSType type = parseType(tag, requireBraces(tag.name()),
					reporter);
			if (type != null) {
				if (typeChecker != null)
					typeChecker.checkType(type, tag);
				member.setType(type);
			}
		}
	}

	public JSType parseType(JSDocTag tag, boolean requireBraces,
			JSProblemReporter reporter) {
		final Tokenizer st = new Tokenizer(tag.value());
		if (st.hasMoreTokens()) {
			final String typeName = st.nextToken();
			if (!requireBraces || isBraced(typeName)) {
				return translateTypeName(cutBraces(typeName), tag, reporter);
			}
		} else if (!requireBraces) {
			reportProblem(reporter, JSDocProblem.WRONG_TYPE_SYNTAX,
					"Missing type name", tag);
		}
		return null;
	}

	protected boolean requireBraces(String tagName) {
		return JSDocTag.RETURN.equals(tagName)
				|| JSDocTag.RETURNS.equals(tagName);
	}

	private void reportProblem(JSProblemReporter reporter,
			JSProblemIdentifier problemIdentifier, JSDocTag tag, Object... args) {
		if (reporter != null) {
			reporter.reportProblem(problemIdentifier,
					problemIdentifier.formatMessage(args), tag.start(),
					tag.end());
		}
	}

	private void reportProblem(JSProblemReporter reporter,
			JSProblemIdentifier problemIdentifier, String message, JSDocTag tag) {
		if (reporter != null) {
			reporter.reportProblem(problemIdentifier, message, tag.start(),
					tag.end());
		}
	}

	protected JSType translateTypeName(String typeName, JSDocTag tag,
			JSProblemReporter reporter) {
		JSDocTypeParser parser = createTypeParser();
		try {
			return parser.parse(typeName);
		} catch (ParseException e) {
			if (reporter != null) {
				reporter.reportProblem(
						JSDocProblem.WRONG_TYPE_SYNTAX,
						e.getMessage() + " after "
								+ typeName.substring(0, e.getErrorOffset()),
						tag.start(), tag.end());
			}
			return null;
		}
	}

	public JSDocTypeParser createTypeParser() {
		return new JSDocTypeParser();
	}

	public static String cutBraces(String typeName) {
		if (isBraced(typeName)) {
			typeName = typeName.substring(1, typeName.length() - 1);
		}
		return typeName;
	}

	private static boolean isBraced(String typeName) {
		final int length = typeName.length();
		return length > 2 && typeName.charAt(0) == '{'
				&& typeName.charAt(length - 1) == '}';
	}

	private void processSuppressWarnings(JSDocTag tag,
			JSProblemReporter reporter, IElement element) {
		final CharStream input = new ANTLRStringStream(tag.value());
		final boolean hasParenthesis = input.LT(1) == '(';
		if (hasParenthesis) {
			input.consume();
		}
		final int problemCount = reporter != null ? reporter.getProblemCount()
				: 0;
		for (;;) {
			int ch = input.LT(1);
			while (Character.isWhitespace(ch)) {
				input.consume();
				ch = input.LT(1);
			}
			if (ch == '"' || ch == '\'') {
				final char quote = (char) ch;
				input.consume();
				final int start = input.index();
				for (;;) {
					ch = input.LT(1);
					if (ch == quote) {
						suppressWarning(tag, reporter, element, input, start);
						input.consume();
						break;
					} else if (ch == CharStream.EOF) {
						if (reporter != null) {
							reporter.reportProblem(
									JSDocProblem.WRONG_SUPPRESS_WARNING,
									"Closing " + quote + " expected",
									tag.start(), tag.end());
						}
						break;
					}
					input.consume();
				}
			} else {
				final int start = input.index();
				for (;;) {
					ch = input.LT(1);
					if (ch == ',' || ch == ')' || ch == CharStream.EOF
							|| Character.isWhitespace(ch)) {
						suppressWarning(tag, reporter, element, input, start);
						break;
					}
					input.consume();
				}
			}
			ch = input.LT(1);
			while (ch != CharStream.EOF && Character.isWhitespace(ch)) {
				input.consume();
				ch = input.LT(1);
			}
			if (ch != ',') {
				break;
			}
			input.consume();
		}
		if (hasParenthesis) {
			if (input.LT(1) == ')') {
				input.consume();
			} else if (reporter != null) {
				reporter.reportProblem(JSDocProblem.WRONG_SUPPRESS_WARNING,
						"Closing ) expected", tag.start(), tag.end());
			}
		}
		if (reporter != null && reporter.getProblemCount() == problemCount
				&& input.LT(1) != CharStream.EOF) {
			reporter.reportProblem(JSDocProblem.WRONG_SUPPRESS_WARNING,
					"Unexpected content", tag.start(), tag.end());
		}
	}

	private void suppressWarning(JSDocTag tag, JSProblemReporter reporter,
			IElement element, final CharStream input, final int start) {
		final String categoryId = input.substring(start, input.index() - 1);
		if (categoryId.length() != 0) {
			final IProblemCategory category = getCategory(categoryId);
			if (category != null) {
				element.addSuppressedWarning(category);
			} else if (reporter != null) {
				reporter.reportProblem(JSDocProblem.WRONG_SUPPRESS_WARNING, NLS
						.bind("Unsupported {0}({1})",
								JSDocTag.SUPPRESS_WARNINGS, categoryId), tag
						.start(), tag.end());
			}
		} else if (reporter != null) {
			reporter.reportProblem(JSDocProblem.WRONG_SUPPRESS_WARNING,
					"warning identifier expected", tag.start(), tag.end());
		}
	}

	protected IProblemCategory getCategory(final String categoryId) {
		return ProblemCategoryManager.getInstance().getCategory(
				JavaScriptNature.NATURE_ID, JSDocTag.SUPPRESS_WARNINGS,
				categoryId);
	}
}
