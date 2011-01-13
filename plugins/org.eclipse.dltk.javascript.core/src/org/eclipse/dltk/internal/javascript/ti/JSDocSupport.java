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
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.dltk.javascript.ast.BinaryOperation;
import org.eclipse.dltk.javascript.ast.Comment;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.PropertyInitializer;
import org.eclipse.dltk.javascript.ast.VariableStatement;
import org.eclipse.dltk.javascript.parser.JSParser;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder;
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

	public static String[] getTags() {
		return new String[] { DEPRECATED, JSDocTag.PARAM, JSDocTag.TYPE,
				JSDocTag.RETURN, JSDocTag.RETURNS, PRIVATE_TAG,
				CONSTRUCTOR_TAG };
	}

	private static final String PRIVATE_TAG = "@private";

	private static final String CONSTRUCTOR_TAG = "@constructor";

	public void processMethod(FunctionStatement statement, IMethod method) {
		String comment = getFunctionComment(statement);
		if (comment == null) {
			return;
		}
		if (method.getType() == null) {
			parseType(method, comment);
		}
		parseParams(method, comment);

		parseDeprecation(method, comment);

		parsePrivate(method, comment);

		parseConstructor(method, comment);
	}

	public static String getFunctionComment(FunctionStatement statement) {
		Comment documentation = statement.getDocumentation();
		if (documentation != null) {
			return documentation.getText();
		}
		if (statement.getParent() instanceof BinaryOperation) {
			final BinaryOperation binary = (BinaryOperation) statement
					.getParent();
			if (binary.getOperation() == JSParser.ASSIGN
					&& binary.getRightExpression() == statement) {
				documentation = binary.getLeftExpression().getDocumentation();
				if (documentation != null) {
					return documentation.getText();
				}
			}
		} else if (statement.getParent() instanceof PropertyInitializer) {
			final PropertyInitializer property = (PropertyInitializer) statement
					.getParent();
			if (property.getValue() == statement) {
				documentation = property.getName().getDocumentation();
				if (documentation != null) {
					return documentation.getText();
				}
			}
		}
		return null;
	}

	private void parseConstructor(IMethod method, String comment) {
		if (comment.indexOf(CONSTRUCTOR_TAG) != -1) {
			method.setConstructor(true);
		}
	}

	/**
	 * @param method
	 * @param comment
	 */
	private void parsePrivate(IMember member, final String comment) {
		if (comment.indexOf(PRIVATE_TAG) != -1) {
			member.setPrivate(true);
		}
	}

	public void processVariable(VariableStatement statement, IVariable variable) {
		if (statement.getDocumentation() == null) {
			return;
		}
		final String comment = statement.getDocumentation().getText();
		if (variable.getType() == null) {
			parseType(variable, comment);
		}
		parseDeprecation(variable, comment);

		parsePrivate(variable, comment);
	}

	private static final String DEPRECATED = "@deprecated"; //$NON-NLS-1$

	private void parseDeprecation(IMember member, String comment) {
		int index = comment.indexOf(DEPRECATED);
		if (index != -1) {
			member.setDeprecated(true);
		}
	}

	private void parseParams(IMethod method, String comment) {
		int index = comment.indexOf(JSDocTag.PARAM);
		Map<String, Type> objectPropertiesTypes = new HashMap<String, Type>();

		while (index != -1) {
			int endLineIndex = comment.indexOf("\n", index);
			if (endLineIndex == -1) {
				endLineIndex = comment.length();
			}
			String parameterString = comment.substring(
					index + JSDocTag.PARAM.length(), endLineIndex);
			StringTokenizer st = new StringTokenizer(parameterString);
			String type = null;
			boolean varargs = false;
			while (st.hasMoreTokens()) {
				final String token = st.nextToken();
				if (token.startsWith("{") && token.endsWith("}")) {
					type = token.substring(1, token.length() - 1);
					if (type.startsWith("...")) {
						varargs = true;
						type = type.substring(3);
					}
				} else {
					final IParameter parameter;
					boolean optional = false;
					if (token.startsWith("[") && token.endsWith("]")) {
						optional = true;
						String parameterName = token.substring(1,
								token.length() - 1);
						int defaultValueSeperatorIndex = parameterName
								.indexOf('=');
						if (defaultValueSeperatorIndex != -1) {
							parameterName = parameterName.substring(0,
									defaultValueSeperatorIndex);
						}
						parameter = method.getParameter(parameterName);
					} else {
						String parameterName = token;
						int propertiesObjectIndex = parameterName.indexOf('.');
						Type propertiesType = null;
						if (propertiesObjectIndex != -1) {
							String propertyName = parameterName
									.substring(propertiesObjectIndex + 1);
							parameterName = parameterName.substring(0,
									propertiesObjectIndex);

							propertiesType = objectPropertiesTypes
									.get(parameterName);
							if (propertiesType == null) {
								propertiesType = TypeInfoModelFactory.eINSTANCE
										.createType();
								objectPropertiesTypes.put(parameterName,
										propertiesType);
							}
							Property property = TypeInfoModelFactory.eINSTANCE
									.createProperty();
							property.setName(propertyName);
							propertiesType.getMembers().add(property);
						}
						parameter = method.getParameter(parameterName);

						if (parameter != null && propertiesType != null)
							parameter.setPropertiesType(propertiesType);
					}
					if (parameter != null) {
						if (type != null && parameter.getType() == null)
							parameter.setType(translateTypeName(type));
						if (!optional && st.hasMoreTokens()
								&& st.nextToken().equals("optional"))
							optional = true;
						parameter.setOptional(optional);
						parameter.setVarargs(varargs);
					}
					break;
				}
			}
			index = comment.indexOf(JSDocTag.PARAM, endLineIndex);
		}
	}

	private static final String[] RETURN_TAGS = { JSDocTag.RETURNS,
			JSDocTag.RETURN };

	/**
	 * @see St
	 * @param context
	 * @param member
	 * @param comment
	 */
	public void parseType(IElement member, String comment) {
		int index = comment.indexOf(JSDocTag.TYPE);
		if (index != -1) {
			int endLineIndex = comment.indexOf("\n", index);
			if (endLineIndex == -1) {
				endLineIndex = comment.length();
			}
			StringTokenizer st = new StringTokenizer(comment.substring(index
					+ JSDocTag.TYPE.length(), endLineIndex), " \t\n\r\f*");
			if (st.hasMoreTokens()) {
				member.setType(translateTypeName(st.nextToken()));
			}
		} else {
			for (String tag : RETURN_TAGS) {
				index = comment.indexOf(tag);
				if (index != -1) {
					int begingBrace = comment
							.indexOf('{', index + tag.length());
					if (begingBrace != -1) {
						int endBrace = comment.indexOf('}', begingBrace);
						if (endBrace != -1) {
							member.setType(translateTypeName(comment.substring(
									begingBrace + 1, endBrace).trim()));
							break;
						}
					}
				}
			}
		}
	}

	private String translateTypeName(String typeName) {
		final int length = typeName.length();
		if (length > 2 && typeName.charAt(0) == '{'
				&& typeName.charAt(length - 1) == '}') {
			typeName = typeName.substring(1, length - 1);
		}
		return TypeInfoModelLoader.getInstance().translateTypeName(typeName);
	}
}
