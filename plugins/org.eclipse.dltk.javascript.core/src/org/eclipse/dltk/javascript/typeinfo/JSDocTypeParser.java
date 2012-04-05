/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinfo;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.eclipse.dltk.javascript.typeinfo.model.FunctionType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;
import org.eclipse.dltk.javascript.typeinfo.model.RecordProperty;
import org.eclipse.dltk.javascript.typeinfo.model.RecordType;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.dltk.javascript.typeinfo.model.UnionType;
import org.eclipse.emf.common.util.EList;

public class JSDocTypeParser extends JSDocTypeParserBase {

	private JSDocTypeParserExtension extension;

	public void setExtension(JSDocTypeParserExtension extension) {
		this.extension = extension;
	}

	public JSType parse(String input) throws ParseException {
		return parse(new ANTLRStringStream(input));
	}

	protected JSType parse(CharStream input) throws ParseException {
		skipSpaces(input);
		final List<JSType> types = new ArrayList<JSType>();
		final boolean inParenthese = input.LT(1) == '(';
		if (inParenthese) {
			input.consume();
		}
		for (;;) {
			final JSType type = parseType(input);
			if (type != null) {
				types.add(type);
				skipSpaces(input);
				if (input.LT(1) == '|') {
					input.consume();
					continue;
				}
			}
			break;
		}
		if (inParenthese) {
			match(input, ')');
		}
		if (types.size() == 1) {
			return types.get(0);
		} else if (types.size() > 1) {
			final UnionType unionType = TypeInfoModelFactory.eINSTANCE
					.createUnionType();
			unionType.getTargets().addAll(types);
			return unionType;
		} else {
			return null;
		}
	}

	protected JSType parseType(CharStream input) throws ParseException {
		if (input.LT(1) == '{') {
			input.consume();
			final RecordType recordType = parseRecordType(input);
			match(input, '}');
			return recordType;
		} else if (input.LT(1) == '*') {
			input.consume();
			return TypeInfoModelFactory.eINSTANCE.createAnyType();
		} else {
			return parseTypeName(input);
		}
	}

	protected JSType parseTypeName(CharStream input) throws ParseException {
		final int start = input.index();
		for (;;) {
			int ch = input.LT(1);
			if (ch == '<') {
				final int baseEnd = input.index();
				final String baseType = input.substring(start, baseEnd - 1);
				input.consume();
				final List<JSType> typeParams = parseParams(input);
				match(input, '>');
				JSType type = createGenericType(baseType, typeParams);
				if (extension != null) {
					extension.reportType(type, start, baseEnd);
				}
				return checkIfArray(input, type);
			} else if (ch == '.' && input.LT(2) == '<') {
				final int baseEnd = input.index();
				final String baseType = input.substring(start, baseEnd - 1);
				input.consume();
				input.consume();
				final List<JSType> typeParams = parseParams(input);
				match(input, '>');
				JSType type = createGenericType(baseType, typeParams);
				if (extension != null) {
					extension.reportType(type, start, baseEnd);
				}
				return checkIfArray(input, type);
			} else if (ch == '('
					&& "function".equals(input.substring(start,
							input.index() - 1))) {
				input.consume();
				final FunctionType functionType = TypeInfoModelFactory.eINSTANCE
						.createFunctionType();
				parseFunctionParams(input, functionType.getParameters());
				match(input, ')');
				skipSpaces(input);
				if (input.LT(1) == ':') {
					input.consume();
					skipSpaces(input);
					functionType.setReturnType(parseType(input));
				}
				return checkIfArray(input, functionType);
			} else if (ch == '[') {
				final JSType itemType = createType(input, start);
				input.consume();
				match(input, ']');
				final JSType array = createArray(itemType);
				return checkIfArray(input, array);
			} else if (ch == CharStream.EOF || Character.isWhitespace(ch)
					|| ch == '|' || ch == ',' || ch == '=' || ch == '}'
					|| ch == '>' || ch == ')' || ch == ']') {
				return input.index() > start ? createType(input, start) : null;
			} else {
				input.consume();
			}
		}
	}

	private JSType createType(CharStream input, final int start) {
		final int end = input.index();
		final JSType type = createType(translate(input
				.substring(start, end - 1)));
		if (extension != null) {
			extension.reportType(type, start, end);
		}
		return type;
	}

	/**
	 * @param input
	 * @param type
	 * @return
	 * @throws ParseException
	 */
	private JSType checkIfArray(CharStream input, JSType type)
			throws ParseException {
		int ch = input.LT(1);
		while (ch == '[') {
			input.consume();
			match(input, ']');
			type = createArray(type);
			ch = input.LT(1);
		}
		return type;
	}

	protected JSType createType(String typeName) {
		if (ITypeNames.UNDEFINED.equals(typeName)) {
			return TypeInfoModelFactory.eINSTANCE.createUndefinedType();
		} else {
			return TypeUtil.ref(typeName);
		}
	}

	protected JSType createArray(JSType itemType) {
		return TypeUtil.arrayOf(itemType);
	}

	protected JSType createGenericType(String baseType, List<JSType> typeParams) {
		if (ITypeNames.ARRAY.equals(baseType)) {
			if (typeParams.size() >= 1) {
				return createArray(typeParams.get(0));
			} else {
				return createArray(createType(ITypeNames.OBJECT));
			}
		} else if (ITypeNames.OBJECT.equals(baseType)) {
			if (typeParams.size() == 1) {
				return TypeUtil.mapOf(null, typeParams.get(0));
			} else if (typeParams.size() >= 2) {
				return TypeUtil.mapOf(typeParams.get(0), typeParams.get(1));
			} else {
				return TypeUtil.mapOf(null, ITypeNames.OBJECT);
			}
		} else {
			return doCreateGenericType(baseType, typeParams);
		}
	}

	protected JSType doCreateGenericType(String baseType,
			List<JSType> typeParams) {
		if (!typeParams.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			sb.append(baseType);
			sb.append('<');
			int index = 0;
			for (JSType typeParam : typeParams) {
				if (++index > 1) {
					sb.append(',');
				}
				sb.append(typeParam.getName());
			}
			sb.append('>');
			return TypeUtil.ref(sb.toString());
		}
		return TypeUtil.ref(baseType);
	}

	protected List<JSType> parseParams(CharStream input) throws ParseException {
		final List<JSType> types = new ArrayList<JSType>();
		for (;;) {
			final JSType type = parse(input);
			if (type != null) {
				types.add(type);
				skipSpaces(input);
				if (input.LT(1) == ',') {
					input.consume();
					continue;
				}
			}
			break;
		}
		return types;
	}

	public void parseFunctionParams(CharStream input,
			EList<Parameter> parameters) throws ParseException {
		for (;;) {
			// TODO support parameter names (at least "this")
			skipSpaces(input);
			boolean varargs = false;
			boolean squareBracket = false;
			if (input.LT(1) == '.' && input.LT(2) == '.' && input.LT(3) == '.') {
				input.consume();
				input.consume();
				input.consume();
				varargs = true;
				if (input.LT(1) == '[') {
					input.consume();
					squareBracket = true;
				}
			}
			final JSType type = parse(input);
			if (type != null) {
				final Parameter parameter = TypeInfoModelFactory.eINSTANCE
						.createParameter();
				parameter.setType(type);
				if (varargs) {
					parameter.setKind(ParameterKind.VARARGS);
					if (squareBracket) {
						match(input, ']');
					}
				} else if (input.LT(1) == '=') {
					parameter.setKind(ParameterKind.OPTIONAL);
					input.consume();
				}
				parameters.add(parameter);
				skipSpaces(input);
				if (input.LT(1) == ',') {
					input.consume();
					continue;
				}
			}
			break;
		}
	}

	protected RecordType parseRecordType(CharStream input)
			throws ParseException {
		final int start = input.index();
		final RecordType type = TypeInfoModelFactory.eINSTANCE
				.createRecordType();
		skipSpaces(input);
		for (;;) {
			int ch = input.LT(1);
			final boolean optional = ch == '[';
			if (optional) {
				input.consume();
				ch = input.LT(1);
			}
			boolean validPropertyName = true;
			final int nameStart = input.index();
			String name = null;
			if (ch == '"' || ch == '\'') {
				input.consume();
				ch = input.LT(1);
				while (ch != '"' && ch != '\'' && ch != -1) {
					input.consume();
					ch = input.LT(1);
				}
				if (ch == -1) {
					throw new ParseException("Ending quote expected",
							input.index());
				}
				validPropertyName = false;
				name = input.substring(nameStart + 1, input.index() - 1);
				input.consume();
			} else if (Character.isJavaIdentifierStart(ch)) {
				input.consume();
				while (Character.isJavaIdentifierPart(input.LT(1))) {
					input.consume();
				}
				name = input.substring(nameStart, input.index() - 1);
			}
			if (name != null) {
				final RecordProperty property = TypeInfoModelFactory.eINSTANCE
						.createRecordProperty();
				property.setName(name);
				skipSpaces(input);
				if (optional) {
					// todo test if it ends on ] ?
					input.consume();
					property.setOptional(true);
				}

				if (input.LT(1) == ':') {
					input.consume();
					final JSType memberType = parse(input);
					ch = input.LT(1);
					if (ch == '=') {
						input.consume();
						property.setOptional(true);
					}
					if (memberType != null) {
						property.setType(memberType);
					} else {
						property.setType(TypeInfoModelFactory.eINSTANCE
								.createAnyType());
					}
				} else {
					property.setType(TypeInfoModelFactory.eINSTANCE
							.createAnyType());
				}
				if (validPropertyName)
					type.getMembers().add(property);
				skipSpaces(input);
				if (input.LT(1) == ',') {
					input.consume();
					continue;
				}
			}
			break;
		}
		type.setTypeName('{' + input.substring(start, input.index() - 1) + '}');
		return type;
	}

	protected String translate(String typeName) {
		return TypeInfoModelLoader.getInstance().translateTypeName(typeName);
	}

}
