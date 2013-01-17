/*******************************************************************************
 * Copyright (c) 2013 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Aleksander Kosicki/Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.core.tests.contentassist;

import static com.google.common.base.Preconditions.checkArgument;
import static org.eclipse.dltk.javascript.internal.core.codeassist.JavaScriptCompletionUtil.evaluateExpressionType;
import static org.eclipse.dltk.javascript.internal.core.codeassist.JavaScriptCompletionUtil.ExpressionType.OBJECT_INITIALIZER;
import static org.eclipse.dltk.javascript.internal.core.codeassist.JavaScriptCompletionUtil.ExpressionType.PROPERTY_INITIALIZER_VALUE;

import org.eclipse.dltk.annotations.NonNull;
import org.eclipse.dltk.javascript.internal.core.codeassist.JavaScriptCompletionUtil;
import org.eclipse.dltk.javascript.internal.core.codeassist.JavaScriptCompletionUtil.ExpressionType;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Strings;

@SuppressWarnings("restriction")
public class JavaScriptCompletionUtilTest extends Assert {

	/**
	 * Answers the {@link ExpressionType} at the end of the first occurrence of
	 * the specified substring.
	 */
	private static ExpressionType expressionTypeAfter(@NonNull String code,
			@NonNull String substring) {
		checkArgument(!Strings.isNullOrEmpty(substring));
		int index = code.indexOf(substring);
		checkArgument(index != -1, "Cannot find given position in the code");
		return JavaScriptCompletionUtil.evaluateExpressionType(null, code,
				index + substring.length());
	}

	/**
	 * Answers the string representing {@link ExpressionType}s at the each
	 * position of the specified string.
	 */
	private static String evaluateExpressionTypes(@NonNull String code) {
		final char[] result = new char[code.length() + 1];
		for (int index = 0; index <= code.length(); index++) {
			result[index] = toChar(evaluateExpressionType(null, code, index));
		}
		return new String(result);
	}

	private static char toChar(ExpressionType actualType) {
		if (actualType == null) {
			return ' ';
		}
		switch (actualType) {
		case OBJECT_INITIALIZER:
			return '^';
		case PROPERTY_INITIALIZER_VALUE:
			return 'V';
		case OTHER:
			return '_';
		default:
			return '?';
		}
	}

	@Test
	public void propertyValue_empty() {
		final String program = "var a = { a: };";
		assertEquals(PROPERTY_INITIALIZER_VALUE,
				expressionTypeAfter(program, ":"));
		assertEquals(PROPERTY_INITIALIZER_VALUE,
				expressionTypeAfter(program, ": "));
	}

	@Test
	public void propertyValue_identifier() {
		final String program = "var a = { a: f};";
		assertEquals(PROPERTY_INITIALIZER_VALUE,
				expressionTypeAfter(program, ": "));
		assertEquals(PROPERTY_INITIALIZER_VALUE,
				expressionTypeAfter(program, ": f"));
	}

	@Test
	public void testEvaluateExpressionType_SimpleObjectInitializer() {
		final String program = "var a = { };";
		assertEquals(null, expressionTypeAfter(program, "a = "));
		assertEquals(OBJECT_INITIALIZER, expressionTypeAfter(program, "{"));
		assertEquals(OBJECT_INITIALIZER, expressionTypeAfter(program, "{ "));
		assertEquals(null, expressionTypeAfter(program, "{ }"));
	}

	@Test
	public void testEvaluateExpressionType_ObjectInitializerWithNewLines() {
		final String program = "var a = { \n };";
		assertEquals(null, expressionTypeAfter(program, "a = "));
		assertEquals(OBJECT_INITIALIZER, expressionTypeAfter(program, "{"));
		assertEquals(OBJECT_INITIALIZER, expressionTypeAfter(program, "{ "));
		assertEquals(OBJECT_INITIALIZER, expressionTypeAfter(program, "{ \n"));
		assertEquals(null, expressionTypeAfter(program, "{ \n }"));
		assertEquals(null, expressionTypeAfter(program, "{ \n };"));
	}

	@Test
	public void testEvaluateExpressionType_ComplexObjectInitializer() {
		String code = "var object = {    name   :   'Aleksander '  ,   surname  :  'Kosicki'    };";
		String hits = "    _______   ^^^^_____                   ^^^^^^________             ^^^^^  ";
		assertEquals(hits, evaluateExpressionTypes(code));
	}

	@Test
	public void testEvaluateExpressionType_NestedObjectInitializer() {
		String code = "var object = { a : { c : 'd', e : [{ }], f: [[ { g:[]  , h :{} }, { }, {}   ]]}, b : {} };";
		String hits = "    _______   ^__   ^__     ^^__    ^^ ^^__     ^__  ^^^^__  ^^^   ^^   ^     ^^^__   ^^^  ";
		assertEquals(hits, evaluateExpressionTypes(code));
	}
}
