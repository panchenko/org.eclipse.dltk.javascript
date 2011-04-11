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
import org.eclipse.dltk.javascript.parser.JSProblemIdentifier;
import org.eclipse.dltk.javascript.parser.JSProblemReporter;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTags;
import org.eclipse.dltk.javascript.parser.jsdoc.SimpleJSDocParser;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IJSDocTypeChecker;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder;
import org.eclipse.dltk.javascript.typeinfo.ITypeInfoContext;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.MapType;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.RecordType;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.dltk.javascript.typeinfo.model.UnionType;
import org.eclipse.dltk.utils.TextUtils;

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

	public JSDocTags parse(Comment comment) {
		return new SimpleJSDocParser().parse(comment.getText(),
				comment.sourceStart());
	}

	public void processMethod(FunctionStatement statement, IMethod method,
			JSProblemReporter reporter, IJSDocTypeChecker typeChecker) {
		Comment comment = getFunctionComment(statement);
		if (comment == null) {
			return;
		}
		final JSDocTags tags = parse(comment);
		processMethod(method, tags, reporter, typeChecker);
	}

	public void processMethod(IMethod method, final JSDocTags tags,
			JSProblemReporter reporter, IJSDocTypeChecker typeChecker) {
		if (method.getType() == null) {
			parseType(method, tags, RETURN_TAGS, reporter, typeChecker);
		}
		parseParams(method, tags, reporter, typeChecker);
		parseDeprecation(method, tags, reporter);
		parsePrivate(method, tags, reporter);
		parseConstructor(method, tags, reporter);
		parseThrows(method, tags, reporter, typeChecker);
	}

	private void parseThrows(IMethod method, JSDocTags tags,
			JSProblemReporter reporter, IJSDocTypeChecker typeChecker) {
		if (typeChecker != null) {
			List<JSDocTag> throwsTags = tags.list(JSDocTag.THROWS);
			for (JSDocTag throwsTag : throwsTags) {
				String value = throwsTag.getValue();
				String[] split = value.split(" ");
				if (split.length > 0) {
					if (split[0].startsWith("{")) {
						JSType type = translateTypeName(cutBraces(split[0]));
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
			IVariable variable, JSProblemReporter reporter,
			IJSDocTypeChecker typeChecker) {
		final Comment comment = statement.getDocumentation();
		if (comment == null) {
			return;
		}
		final JSDocTags tags = parse(comment);
		if (variable.getType() == null) {
			parseType(variable, tags, TYPE_TAGS, reporter, typeChecker);
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
			JSProblemReporter reporter, IJSDocTypeChecker typeChecker) {
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
						propertiesType.setTarget(TypeInfoModelFactory.eINSTANCE
								.createType());
						propertiesType.getTarget().setName(
								'{' + objectName + '}');
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
					Property property = TypeInfoModelFactory.eINSTANCE
							.createProperty();
					property.setName(propertyName);
					if (pp.type != null) {
						JSType type = translateTypeName(pp.type);
						if (typeChecker != null)
							typeChecker.checkType(type, tag);
						property.setType(type);
					}
					if (pp.optional)
						property.setAttribute(IReferenceAttributes.OPTIONAL,
								Boolean.TRUE);
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
				final IParameter parameter = method.getParameter(paramName);
				if (parameter != null) {
					if (!pp.optional && st.hasMoreTokens()
							&& st.nextToken().equals("optional")) {
						pp.optional = true;
					}
					updateParameter(tag, parameter, pp, reporter, typeChecker);
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
			IJSDocTypeChecker typeChecker) {
		if (pp.type != null && parameter.getType() == null) {
			JSType type = translateTypeName(pp.type);
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
			JSProblemReporter reporter, IJSDocTypeChecker typeChecker) {
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
			final boolean requireBraces = requireBraces(tag.name());
			final Tokenizer st = new Tokenizer(tag.getValue());
			if (st.hasMoreTokens()) {
				final String typeName = st.nextToken();
				if (!requireBraces || isBraced(typeName)) {
					JSType type = translateTypeName(cutBraces(typeName));
					if (typeChecker != null)
						typeChecker.checkType(type, tag);
					member.setType(type);
				}
			} else if (!requireBraces) {
				reportProblem(reporter, JSDocProblem.MISSING_TYPE_NAME, tag);
			}
		}
	}

	protected boolean requireBraces(String tagName) {
		return JSDocTag.RETURN.equals(tagName)
				|| JSDocTag.RETURNS.equals(tagName);
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
		final ArrayType arrayType = parseArray(typeName);
		if (arrayType != null) {
			return arrayType;
		}
		final MapType mapType = parseMap(typeName);
		if (mapType != null) {
			return mapType;
		}
		if (typeName.contains("|")) {
			final String[] parts = TextUtils.split(typeName, '|');
			final UnionType unionType = TypeInfoModelFactory.eINSTANCE
					.createUnionType();
			for (String part : parts) {
				unionType.getTargets().add(translateTypeName(part.trim()));
			}
			return unionType;
		} else if (typeName.startsWith("{") && typeName.endsWith("}")) {
			final RecordType type = TypeInfoModelFactory.eINSTANCE
					.createRecordType();
			type.setTarget(TypeInfoModelFactory.eINSTANCE.createType());
			type.getTarget().setName(typeName);
			StringTokenizer st = new StringTokenizer(typeName.substring(1,
					typeName.length() - 1), ",");
			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				int index = token.indexOf(':');
				if (index != -1) {
					// function support?
					Property property = TypeInfoModelFactory.eINSTANCE
							.createProperty();
					property.setName(token.substring(0, index));
					property.setType(translateTypeName(token
							.substring(index + 1)));
					type.getMembers().add(property);
				} else {
					// any type
					Property property = TypeInfoModelFactory.eINSTANCE
							.createProperty();
					property.setName(token);
					property.setType(TypeInfoModelFactory.eINSTANCE
							.createAnyType());
					type.getMembers().add(property);
				}
			}
			return type;
		}
		return TypeUtil.ref(translate(typeName));
	}

	protected String cutBraces(String typeName) {
		if (isBraced(typeName)) {
			typeName = typeName.substring(1, typeName.length() - 1);
		}
		return typeName;
	}

	private boolean isBraced(String typeName) {
		final int length = typeName.length();
		return length > 2 && typeName.charAt(0) == '{'
				&& typeName.charAt(length - 1) == '}';
	}

	private static final String MAP_PREFIX1 = "Object<";
	private static final String MAP_PREFIX2 = "Object.<";

	protected MapType parseMap(String typeName) {
		if (typeName.startsWith(MAP_PREFIX1) && typeName.endsWith(">")) {
			return translateMapType(typeName.substring(MAP_PREFIX1.length(),
					typeName.length() - 1));
		} else if (typeName.startsWith(MAP_PREFIX2) && typeName.endsWith(">")) {
			return translateMapType(typeName.substring(MAP_PREFIX2.length(),
					typeName.length() - 1));
		} else {
			return null;
		}
	}

	private MapType translateMapType(String typeName) {
		int commaIndex = typeName.indexOf(',');
		if (commaIndex == -1) {
			return TypeUtil.mapOf(null, translateTypeName(typeName));
		} else {
			String keyTypeName = typeName.substring(0, commaIndex).trim();
			String valueTypeName = typeName.substring(commaIndex + 1).trim();
			return TypeUtil.mapOf(translateTypeName(keyTypeName),
					translateTypeName(valueTypeName));
		}
	}

	private static final String ARRAY_PREFIX1 = "Array<";
	private static final String ARRAY_PREFIX2 = "Array.<";
	private static final String ARRAY_SUFFIX = "[]";

	protected ArrayType parseArray(String typeName) {
		if (typeName.endsWith(ARRAY_SUFFIX)) {
			final String itemTypeName = translate(typeName.substring(0,
					typeName.length() - ARRAY_SUFFIX.length()));
			return arrayOf(itemTypeName);
		} else if (typeName.startsWith(ARRAY_PREFIX1) && typeName.endsWith(">")) {
			final String itemTypeName = translate(typeName.substring(
					ARRAY_PREFIX1.length(), typeName.length() - 1));
			return arrayOf(itemTypeName);
		} else if (typeName.startsWith(ARRAY_PREFIX2) && typeName.endsWith(">")) {
			final String itemTypeName = translate(typeName.substring(
					ARRAY_PREFIX2.length(), typeName.length() - 1));
			return arrayOf(itemTypeName);
		} else {
			return null;
		}
	}

	private ArrayType arrayOf(final String itemTypeName) {
		return TypeUtil.arrayOf(translateTypeName(itemTypeName));
	}

	protected String translate(String typeName) {
		return TypeInfoModelLoader.getInstance().translateTypeName(typeName);
	}
}
