/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.typeinference;

import java.text.Collator;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.dltk.internal.javascript.reference.resolvers.ReferenceResolverContext;

import com.xored.org.mozilla.javascript.Callable;
import com.xored.org.mozilla.javascript.Context;
import com.xored.org.mozilla.javascript.Function;
import com.xored.org.mozilla.javascript.IdFunctionObject;
import com.xored.org.mozilla.javascript.IdScriptableObject;
import com.xored.org.mozilla.javascript.Kit;
import com.xored.org.mozilla.javascript.RegExpProxy;
import com.xored.org.mozilla.javascript.ScriptRuntime;
import com.xored.org.mozilla.javascript.Scriptable;
import com.xored.org.mozilla.javascript.ScriptableObject;
import com.xored.org.mozilla.javascript.Undefined;
import com.xored.org.mozilla.javascript.Wrapper;

public class NewReference extends AbstractCallResultReference {

	public static NativeString nativeStringProto;
	public static NativeDate nativeDateProto;
	public static NativeNumber nativeNumberProto;
	public static NativeArray nativeArrayProto;
	static {
		nativeStringProto = NativeString.init(null, false);
		nativeDateProto = NativeDate.init(null, false);
		nativeNumberProto = NativeNumber.init(null, false);
		nativeArrayProto = NativeArray.init(null, false);
	}

	public NewReference(String name, String globalName,
			ReferenceResolverContext cs) {
		super(name, globalName, cs);
	}

	public String getResultId() {
		return "this";
	}

	public boolean isFunctionRef() {
		return false;
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.AbstractCallResultReference#internalGetChilds(boolean)
	 */
	protected Set internalGetChilds(boolean resolveLocals) {
		if ("String".equals(getId())) {
			return generateSet(nativeStringProto);
		} else if ("Date".equals(getId())) {
			return generateSet(nativeDateProto);
		} else if ("Array".equals(getId())) {
			return generateSet(nativeArrayProto);
		} else if ("Number".equals(getId())) {
			return generateSet(nativeNumberProto);
		}
		return super.internalGetChilds(resolveLocals);
	}

	/**
	 * @param proto
	 * @return
	 */
	private HashSet generateSet(IdScriptableObject proto) {
		Object[] ids = proto.getAllIds();
		HashSet set = new HashSet();
		for (int i = 0; i < ids.length; i++) {
			UnknownReference ur = new UnknownReference((String) ids[i], true);
			Object object = proto.get((String) ids[i], proto);
			if (object instanceof Function) {
				ur.setFunctionRef();
			}
			set.add(ur);
		}
		return set;
	}

}

final class NativeString extends
		com.xored.org.mozilla.javascript.IdScriptableObject implements Wrapper {
	static final long serialVersionUID = 920268368584188687L;

	private static final Object STRING_TAG = new Object();

	static NativeString protoType;

	static NativeString init(Scriptable scope, boolean sealed) {
		protoType = new NativeString("");
		protoType.exportAsJSClass(MAX_PROTOTYPE_ID, scope, sealed);
		return protoType;
	}

	public NativeString(String s) {
		string = s;
	}

	public String getClassName() {
		return "String";
	}

	private static final int Id_length = 1, MAX_INSTANCE_ID = 1;

	protected int getMaxInstanceId() {
		return MAX_INSTANCE_ID;
	}

	protected int findInstanceIdInfo(String s) {
		if (s.equals("length")) {
			return instanceIdInfo(DONTENUM | READONLY | PERMANENT, Id_length);
		}
		return super.findInstanceIdInfo(s);
	}

	protected String getInstanceIdName(int id) {
		if (id == Id_length) {
			return "length";
		}
		return super.getInstanceIdName(id);
	}

	protected Object getInstanceIdValue(int id) {
		if (id == Id_length) {
			return ScriptRuntime.wrapInt(string.length());
		}
		return super.getInstanceIdValue(id);
	}

	protected void fillConstructorProperties(IdFunctionObject ctor) {
		addIdFunctionProperty(ctor, STRING_TAG, ConstructorId_fromCharCode,
				"fromCharCode", 1);
		super.fillConstructorProperties(ctor);
	}

	protected void initPrototypeId(int id) {
		String s;
		int arity;
		switch (id) {
		case Id_constructor:
			arity = 1;
			s = "constructor";
			break;
		case Id_toString:
			arity = 0;
			s = "toString";
			break;
		case Id_toSource:
			arity = 0;
			s = "toSource";
			break;
		case Id_valueOf:
			arity = 0;
			s = "valueOf";
			break;
		case Id_charAt:
			arity = 1;
			s = "charAt";
			break;
		case Id_charCodeAt:
			arity = 1;
			s = "charCodeAt";
			break;
		case Id_indexOf:
			arity = 1;
			s = "indexOf";
			break;
		case Id_lastIndexOf:
			arity = 1;
			s = "lastIndexOf";
			break;
		case Id_split:
			arity = 2;
			s = "split";
			break;
		case Id_substring:
			arity = 2;
			s = "substring";
			break;
		case Id_toLowerCase:
			arity = 0;
			s = "toLowerCase";
			break;
		case Id_toUpperCase:
			arity = 0;
			s = "toUpperCase";
			break;
		case Id_substr:
			arity = 2;
			s = "substr";
			break;
		case Id_concat:
			arity = 1;
			s = "concat";
			break;
		case Id_slice:
			arity = 2;
			s = "slice";
			break;
		case Id_bold:
			arity = 0;
			s = "bold";
			break;
		case Id_italics:
			arity = 0;
			s = "italics";
			break;
		case Id_fixed:
			arity = 0;
			s = "fixed";
			break;
		case Id_strike:
			arity = 0;
			s = "strike";
			break;
		case Id_small:
			arity = 0;
			s = "small";
			break;
		case Id_big:
			arity = 0;
			s = "big";
			break;
		case Id_blink:
			arity = 0;
			s = "blink";
			break;
		case Id_sup:
			arity = 0;
			s = "sup";
			break;
		case Id_sub:
			arity = 0;
			s = "sub";
			break;
		case Id_fontsize:
			arity = 0;
			s = "fontsize";
			break;
		case Id_fontcolor:
			arity = 0;
			s = "fontcolor";
			break;
		case Id_link:
			arity = 0;
			s = "link";
			break;
		case Id_anchor:
			arity = 0;
			s = "anchor";
			break;
		case Id_equals:
			arity = 1;
			s = "equals";
			break;
		case Id_equalsIgnoreCase:
			arity = 1;
			s = "equalsIgnoreCase";
			break;
		case Id_match:
			arity = 1;
			s = "match";
			break;
		case Id_search:
			arity = 1;
			s = "search";
			break;
		case Id_replace:
			arity = 1;
			s = "replace";
			break;
		case Id_localeCompare:
			arity = 1;
			s = "localeCompare";
			break;
		case Id_toLocaleLowerCase:
			arity = 0;
			s = "toLocaleLowerCase";
			break;
		case Id_toLocaleUpperCase:
			arity = 0;
			s = "toLocaleUpperCase";
			break;
		default:
			throw new IllegalArgumentException(String.valueOf(id));
		}
		initPrototypeMethod(STRING_TAG, id, s, arity);
	}

	public Object execIdCall(IdFunctionObject f, Context cx, Scriptable scope,
			Scriptable thisObj, Object[] args) {
		if (!f.hasTag(STRING_TAG)) {
			return super.execIdCall(f, cx, scope, thisObj, args);
		}
		int id = f.methodId();
		switch (id) {
		case ConstructorId_fromCharCode: {
			int N = args.length;
			if (N < 1)
				return "";
			StringBuffer sb = new StringBuffer(N);
			for (int i = 0; i != N; ++i) {
				sb.append(ScriptRuntime.toUint16(args[i]));
			}
			return sb.toString();
		}

		case Id_constructor: {
			String s = (args.length >= 1) ? ScriptRuntime.toString(args[0])
					: "";
			if (thisObj == null) {
				// new String(val) creates a new String object.
				return new NativeString(s);
			}
			// String(val) converts val to a string value.
			return s;
		}

		case Id_toString:
		case Id_valueOf:
			// ECMA 15.5.4.2: 'the toString function is not generic.
			return realThis(thisObj, f).string;

		case Id_toSource: {
			String s = realThis(thisObj, f).string;
			return "(new String(\"" + ScriptRuntime.escapeString(s) + "\"))";
		}

		case Id_charAt:
		case Id_charCodeAt: {
			// See ECMA 15.5.4.[4,5]
			String target = ScriptRuntime.toString(thisObj);
			double pos = ScriptRuntime.toInteger(args, 0);
			if (pos < 0 || pos >= target.length()) {
				if (id == Id_charAt)
					return "";
				else
					return ScriptRuntime.NaNobj;
			}
			char c = target.charAt((int) pos);
			if (id == Id_charAt)
				return String.valueOf(c);
			else
				return ScriptRuntime.wrapInt(c);
		}

		case Id_indexOf:
			return ScriptRuntime.wrapInt(js_indexOf(ScriptRuntime
					.toString(thisObj), args));

		case Id_lastIndexOf:
			return ScriptRuntime.wrapInt(js_lastIndexOf(ScriptRuntime
					.toString(thisObj), args));

		case Id_split:
			return js_split(cx, scope, ScriptRuntime.toString(thisObj), args);

		case Id_substring:
			return js_substring(cx, ScriptRuntime.toString(thisObj), args);

		case Id_toLowerCase:
			// See ECMA 15.5.4.11
			return ScriptRuntime.toString(thisObj).toLowerCase();

		case Id_toUpperCase:
			// See ECMA 15.5.4.12
			return ScriptRuntime.toString(thisObj).toUpperCase();

		case Id_substr:
			return js_substr(ScriptRuntime.toString(thisObj), args);

		case Id_concat:
			return js_concat(ScriptRuntime.toString(thisObj), args);

		case Id_slice:
			return js_slice(ScriptRuntime.toString(thisObj), args);

		case Id_bold:
			return tagify(thisObj, "b", null, null);

		case Id_italics:
			return tagify(thisObj, "i", null, null);

		case Id_fixed:
			return tagify(thisObj, "tt", null, null);

		case Id_strike:
			return tagify(thisObj, "strike", null, null);

		case Id_small:
			return tagify(thisObj, "small", null, null);

		case Id_big:
			return tagify(thisObj, "big", null, null);

		case Id_blink:
			return tagify(thisObj, "blink", null, null);

		case Id_sup:
			return tagify(thisObj, "sup", null, null);

		case Id_sub:
			return tagify(thisObj, "sub", null, null);

		case Id_fontsize:
			return tagify(thisObj, "font", "size", args);

		case Id_fontcolor:
			return tagify(thisObj, "font", "color", args);

		case Id_link:
			return tagify(thisObj, "a", "href", args);

		case Id_anchor:
			return tagify(thisObj, "a", "name", args);

		case Id_equals:
		case Id_equalsIgnoreCase: {
			String s1 = ScriptRuntime.toString(thisObj);
			String s2 = ScriptRuntime.toString(args, 0);
			return ScriptRuntime.wrapBoolean((id == Id_equals) ? s1.equals(s2)
					: s1.equalsIgnoreCase(s2));
		}

		case Id_match:
		case Id_search:
		case Id_replace: {
			int actionType;
			if (id == Id_match) {
				actionType = RegExpProxy.RA_MATCH;
			} else if (id == Id_search) {
				actionType = RegExpProxy.RA_SEARCH;
			} else {
				actionType = RegExpProxy.RA_REPLACE;
			}
			return ScriptRuntime.checkRegExpProxy(cx).action(cx, scope,
					thisObj, args, actionType);
		}
			// ECMA-262 1 5.5.4.9
		case Id_localeCompare: {
			// For now, create and configure a collator instance. I can't
			// actually imagine that this'd be slower than caching them
			// a la ClassCache, so we aren't trying to outsmart ourselves
			// with a caching mechanism for now.
			Collator collator = Collator.getInstance(cx.getLocale());
			collator.setStrength(Collator.IDENTICAL);
			collator.setDecomposition(Collator.CANONICAL_DECOMPOSITION);
			return ScriptRuntime.wrapNumber(collator.compare(ScriptRuntime
					.toString(thisObj), ScriptRuntime.toString(args, 0)));
		}
		case Id_toLocaleLowerCase: {
			return ScriptRuntime.toString(thisObj).toLowerCase(cx.getLocale());
		}
		case Id_toLocaleUpperCase: {
			return ScriptRuntime.toString(thisObj).toUpperCase(cx.getLocale());
		}
		}
		throw new IllegalArgumentException(String.valueOf(id));
	}

	private static NativeString realThis(Scriptable thisObj, IdFunctionObject f) {
		if (!(thisObj instanceof NativeString))
			throw incompatibleCallError(f);
		return (NativeString) thisObj;
	}

	/*
	 * HTML composition aids.
	 */
	private static String tagify(Object thisObj, String tag, String attribute,
			Object[] args) {
		String str = ScriptRuntime.toString(thisObj);
		StringBuffer result = new StringBuffer();
		result.append('<');
		result.append(tag);
		if (attribute != null) {
			result.append(' ');
			result.append(attribute);
			result.append("=\"");
			result.append(ScriptRuntime.toString(args, 0));
			result.append('"');
		}
		result.append('>');
		result.append(str);
		result.append("</");
		result.append(tag);
		result.append('>');
		return result.toString();
	}

	public String toString() {
		return string;
	}

	/*
	 * Make array-style property lookup work for strings. XXX is this ECMA? A
	 * version check is probably needed. In js too.
	 */
	public Object get(int index, Scriptable start) {
		if (0 <= index && index < string.length()) {
			return string.substring(index, index + 1);
		}
		return super.get(index, start);
	}

	public void put(int index, Scriptable start, Object value) {
		if (0 <= index && index < string.length()) {
			return;
		}
		super.put(index, start, value);
	}

	/*
	 * See ECMA 15.5.4.6. Uses Java String.indexOf() OPT to add - BMH searching
	 * from jsstr.c.
	 */
	private static int js_indexOf(String target, Object[] args) {
		String search = ScriptRuntime.toString(args, 0);
		double begin = ScriptRuntime.toInteger(args, 1);

		if (begin > target.length()) {
			return -1;
		} else {
			if (begin < 0)
				begin = 0;
			return target.indexOf(search, (int) begin);
		}
	}

	/*
	 * See ECMA 15.5.4.7
	 */
	private static int js_lastIndexOf(String target, Object[] args) {
		String search = ScriptRuntime.toString(args, 0);
		double end = ScriptRuntime.toNumber(args, 1);

		if (end != end || end > target.length())
			end = target.length();
		else if (end < 0)
			end = 0;

		return target.lastIndexOf(search, (int) end);
	}

	/*
	 * Used by js_split to find the next split point in target, starting at
	 * offset ip and looking either for the given separator substring, or for
	 * the next re match. ip and matchlen must be reference variables (assumed
	 * to be arrays of length 1) so they can be updated in the leading
	 * whitespace or re case. Return -1 on end of string, >= 0 for a valid index
	 * of the next separator occurrence if found, or the string length if no
	 * separator is found.
	 */
	private static int find_split(Context cx, Scriptable scope, String target,
			String separator, int version, RegExpProxy reProxy, Scriptable re,
			int[] ip, int[] matchlen, boolean[] matched, String[][] parensp) {
		int i = ip[0];
		int length = target.length();

		/*
		 * Perl4 special case for str.split(' '), only if the user has selected
		 * JavaScript1.2 explicitly. Split on whitespace, and skip leading w/s.
		 * Strange but true, apparently modeled after awk.
		 */
		if (version == Context.VERSION_1_2 && re == null
				&& separator.length() == 1 && separator.charAt(0) == ' ') {
			/* Skip leading whitespace if at front of str. */
			if (i == 0) {
				while (i < length && Character.isWhitespace(target.charAt(i)))
					i++;
				ip[0] = i;
			}

			/* Don't delimit whitespace at end of string. */
			if (i == length)
				return -1;

			/* Skip over the non-whitespace chars. */
			while (i < length && !Character.isWhitespace(target.charAt(i)))
				i++;

			/* Now skip the next run of whitespace. */
			int j = i;
			while (j < length && Character.isWhitespace(target.charAt(j)))
				j++;

			/* Update matchlen to count delimiter chars. */
			matchlen[0] = j - i;
			return i;
		}

		/*
		 * Stop if past end of string. If at end of string, we will return
		 * target length, so that "ab,".split(',') => new Array("ab", "") and
		 * the resulting array converts back to the string "ab," for symmetry.
		 * NB: This differs from perl, which drops the trailing empty substring
		 * if the LIMIT argument is omitted.
		 */
		if (i > length)
			return -1;

		/*
		 * Match a regular expression against the separator at or above index i.
		 * Return -1 at end of string instead of trying for a match, so we don't
		 * get stuck in a loop.
		 */
		if (re != null) {
			return reProxy.find_split(cx, scope, target, separator, re, ip,
					matchlen, matched, parensp);
		}

		/*
		 * Deviate from ECMA by never splitting an empty string by any separator
		 * string into a non-empty array (an array of length 1 that contains the
		 * empty string).
		 */
		if (version != Context.VERSION_DEFAULT && version < Context.VERSION_1_3
				&& length == 0)
			return -1;

		/*
		 * Special case: if sep is the empty string, split str into one
		 * character substrings. Let our caller worry about whether to split
		 * once at end of string into an empty substring. For 1.2 compatibility,
		 * at the end of the string, we return the length as the result, and set
		 * the separator length to 1 -- this allows the caller to include an
		 * additional null string at the end of the substring list.
		 */
		if (separator.length() == 0) {
			if (version == Context.VERSION_1_2) {
				if (i == length) {
					matchlen[0] = 1;
					return i;
				}
				return i + 1;
			}
			return (i == length) ? -1 : i + 1;
		}

		/*
		 * Punt to j.l.s.indexOf; return target length if separator is not
		 * found.
		 */
		if (ip[0] >= length)
			return length;

		i = target.indexOf(separator, ip[0]);

		return (i != -1) ? i : length;
	}

	/*
	 * See ECMA 15.5.4.8. Modified to match JS 1.2 - optionally takes a limit
	 * argument and accepts a regular expression as the split argument.
	 */
	private static Object js_split(Context cx, Scriptable scope, String target,
			Object[] args) {
		// create an empty Array to return;
		Scriptable top = getTopLevelScope(scope);
		Scriptable result = ScriptRuntime.newObject(cx, top, "Array", null);

		// return an array consisting of the target if no separator given
		// don't check against undefined, because we want
		// 'fooundefinedbar'.split(void 0) to split to ['foo', 'bar']
		if (args.length < 1) {
			result.put(0, result, target);
			return result;
		}

		// Use the second argument as the split limit, if given.
		boolean limited = (args.length > 1) && (args[1] != Undefined.instance);
		long limit = 0; // Initialize to avoid warning.
		if (limited) {
			/* Clamp limit between 0 and 1 + string length. */
			limit = ScriptRuntime.toUint32(args[1]);
			if (limit > target.length())
				limit = 1 + target.length();
		}

		String separator = null;
		int[] matchlen = new int[1];
		Scriptable re = null;
		RegExpProxy reProxy = null;
		if (args[0] instanceof Scriptable) {
			reProxy = ScriptRuntime.getRegExpProxy(cx);
			if (reProxy != null) {
				Scriptable test = (Scriptable) args[0];
				if (reProxy.isRegExp(test)) {
					re = test;
				}
			}
		}
		if (re == null) {
			separator = ScriptRuntime.toString(args[0]);
			matchlen[0] = separator.length();
		}

		// split target with separator or re
		int[] ip = { 0 };
		int match;
		int len = 0;
		boolean[] matched = { false };
		String[][] parens = { null };
		int version = cx.getLanguageVersion();
		while ((match = find_split(cx, scope, target, separator, version,
				reProxy, re, ip, matchlen, matched, parens)) >= 0) {
			if ((limited && len >= limit) || (match > target.length()))
				break;

			String substr;
			if (target.length() == 0)
				substr = target;
			else
				substr = target.substring(ip[0], match);

			result.put(len, result, substr);
			len++;
			/*
			 * Imitate perl's feature of including parenthesized substrings that
			 * matched part of the delimiter in the new array, after the split
			 * substring that was delimited.
			 */
			if (re != null && matched[0] == true) {
				int size = parens[0].length;
				for (int num = 0; num < size; num++) {
					if (limited && len >= limit)
						break;
					result.put(len, result, parens[0][num]);
					len++;
				}
				matched[0] = false;
			}
			ip[0] = match + matchlen[0];

			if (version < Context.VERSION_1_3
					&& version != Context.VERSION_DEFAULT) {
				/*
				 * Deviate from ECMA to imitate Perl, which omits a final split
				 * unless a limit argument is given and big enough.
				 */
				if (!limited && ip[0] == target.length())
					break;
			}
		}
		return result;
	}

	/*
	 * See ECMA 15.5.4.15
	 */
	private static String js_substring(Context cx, String target, Object[] args) {
		int length = target.length();
		double start = ScriptRuntime.toInteger(args, 0);
		double end;

		if (start < 0)
			start = 0;
		else if (start > length)
			start = length;

		if (args.length <= 1 || args[1] == Undefined.instance) {
			end = length;
		} else {
			end = ScriptRuntime.toInteger(args[1]);
			if (end < 0)
				end = 0;
			else if (end > length)
				end = length;

			// swap if end < start
			if (end < start) {
				if (cx.getLanguageVersion() != Context.VERSION_1_2) {
					double temp = start;
					start = end;
					end = temp;
				} else {
					// Emulate old JDK1.0 java.lang.String.substring()
					end = start;
				}
			}
		}
		return target.substring((int) start, (int) end);
	}

	int getLength() {
		return string.length();
	}

	/*
	 * Non-ECMA methods.
	 */
	private static String js_substr(String target, Object[] args) {
		if (args.length < 1)
			return target;

		double begin = ScriptRuntime.toInteger(args[0]);
		double end;
		int length = target.length();

		if (begin < 0) {
			begin += length;
			if (begin < 0)
				begin = 0;
		} else if (begin > length) {
			begin = length;
		}

		if (args.length == 1) {
			end = length;
		} else {
			end = ScriptRuntime.toInteger(args[1]);
			if (end < 0)
				end = 0;
			end += begin;
			if (end > length)
				end = length;
		}

		return target.substring((int) begin, (int) end);
	}

	/*
	 * Python-esque sequence operations.
	 */
	private static String js_concat(String target, Object[] args) {
		int N = args.length;
		if (N == 0) {
			return target;
		} else if (N == 1) {
			String arg = ScriptRuntime.toString(args[0]);
			return target.concat(arg);
		}

		// Find total capacity for the final string to avoid unnecessary
		// re-allocations in StringBuffer
		int size = target.length();
		String[] argsAsStrings = new String[N];
		for (int i = 0; i != N; ++i) {
			String s = ScriptRuntime.toString(args[i]);
			argsAsStrings[i] = s;
			size += s.length();
		}

		StringBuffer result = new StringBuffer(size);
		result.append(target);
		for (int i = 0; i != N; ++i) {
			result.append(argsAsStrings[i]);
		}
		return result.toString();
	}

	private static String js_slice(String target, Object[] args) {
		if (args.length != 0) {
			double begin = ScriptRuntime.toInteger(args[0]);
			double end;
			int length = target.length();
			if (begin < 0) {
				begin += length;
				if (begin < 0)
					begin = 0;
			} else if (begin > length) {
				begin = length;
			}

			if (args.length == 1) {
				end = length;
			} else {
				end = ScriptRuntime.toInteger(args[1]);
				if (end < 0) {
					end += length;
					if (end < 0)
						end = 0;
				} else if (end > length) {
					end = length;
				}
				if (end < begin)
					end = begin;
			}
			return target.substring((int) begin, (int) end);
		}
		return target;
	}

	// #string_id_map#

	protected int findPrototypeId(String s) {
		int id;
		// #generated# Last update: 2007-05-01 22:11:49 EDT
		L0: {
			id = 0;
			String X = null;
			int c;
			L: switch (s.length()) {
			case 3:
				c = s.charAt(2);
				if (c == 'b') {
					if (s.charAt(0) == 's' && s.charAt(1) == 'u') {
						id = Id_sub;
						break L0;
					}
				} else if (c == 'g') {
					if (s.charAt(0) == 'b' && s.charAt(1) == 'i') {
						id = Id_big;
						break L0;
					}
				} else if (c == 'p') {
					if (s.charAt(0) == 's' && s.charAt(1) == 'u') {
						id = Id_sup;
						break L0;
					}
				}
				break L;
			case 4:
				c = s.charAt(0);
				if (c == 'b') {
					X = "bold";
					id = Id_bold;
				} else if (c == 'l') {
					X = "link";
					id = Id_link;
				}
				break L;
			case 5:
				switch (s.charAt(4)) {
				case 'd':
					X = "fixed";
					id = Id_fixed;
					break L;
				case 'e':
					X = "slice";
					id = Id_slice;
					break L;
				case 'h':
					X = "match";
					id = Id_match;
					break L;
				case 'k':
					X = "blink";
					id = Id_blink;
					break L;
				case 'l':
					X = "small";
					id = Id_small;
					break L;
				case 't':
					X = "split";
					id = Id_split;
					break L;
				}
				break L;
			case 6:
				switch (s.charAt(1)) {
				case 'e':
					X = "search";
					id = Id_search;
					break L;
				case 'h':
					X = "charAt";
					id = Id_charAt;
					break L;
				case 'n':
					X = "anchor";
					id = Id_anchor;
					break L;
				case 'o':
					X = "concat";
					id = Id_concat;
					break L;
				case 'q':
					X = "equals";
					id = Id_equals;
					break L;
				case 't':
					X = "strike";
					id = Id_strike;
					break L;
				case 'u':
					X = "substr";
					id = Id_substr;
					break L;
				}
				break L;
			case 7:
				switch (s.charAt(1)) {
				case 'a':
					X = "valueOf";
					id = Id_valueOf;
					break L;
				case 'e':
					X = "replace";
					id = Id_replace;
					break L;
				case 'n':
					X = "indexOf";
					id = Id_indexOf;
					break L;
				case 't':
					X = "italics";
					id = Id_italics;
					break L;
				}
				break L;
			case 8:
				c = s.charAt(4);
				if (c == 'r') {
					X = "toString";
					id = Id_toString;
				} else if (c == 's') {
					X = "fontsize";
					id = Id_fontsize;
				} else if (c == 'u') {
					X = "toSource";
					id = Id_toSource;
				}
				break L;
			case 9:
				c = s.charAt(0);
				if (c == 'f') {
					X = "fontcolor";
					id = Id_fontcolor;
				} else if (c == 's') {
					X = "substring";
					id = Id_substring;
				}
				break L;
			case 10:
				X = "charCodeAt";
				id = Id_charCodeAt;
				break L;
			case 11:
				switch (s.charAt(2)) {
				case 'L':
					X = "toLowerCase";
					id = Id_toLowerCase;
					break L;
				case 'U':
					X = "toUpperCase";
					id = Id_toUpperCase;
					break L;
				case 'n':
					X = "constructor";
					id = Id_constructor;
					break L;
				case 's':
					X = "lastIndexOf";
					id = Id_lastIndexOf;
					break L;
				}
				break L;
			case 13:
				X = "localeCompare";
				id = Id_localeCompare;
				break L;
			case 16:
				X = "equalsIgnoreCase";
				id = Id_equalsIgnoreCase;
				break L;
			case 17:
				c = s.charAt(8);
				if (c == 'L') {
					X = "toLocaleLowerCase";
					id = Id_toLocaleLowerCase;
				} else if (c == 'U') {
					X = "toLocaleUpperCase";
					id = Id_toLocaleUpperCase;
				}
				break L;
			}
			if (X != null && X != s && !X.equals(s))
				id = 0;
			break L0;
		}
		// #/generated#
		return id;
	}

	/**
	 * @see org.mozilla.javascript.Wrapper#unwrap()
	 */
	public Object unwrap() {
		return string;
	}

	private static final int ConstructorId_fromCharCode = -1,

	Id_constructor = 1, Id_toString = 2, Id_toSource = 3, Id_valueOf = 4,
			Id_charAt = 5, Id_charCodeAt = 6, Id_indexOf = 7,
			Id_lastIndexOf = 8, Id_split = 9, Id_substring = 10,
			Id_toLowerCase = 11, Id_toUpperCase = 12, Id_substr = 13,
			Id_concat = 14, Id_slice = 15, Id_bold = 16, Id_italics = 17,
			Id_fixed = 18, Id_strike = 19, Id_small = 20, Id_big = 21,
			Id_blink = 22, Id_sup = 23, Id_sub = 24, Id_fontsize = 25,
			Id_fontcolor = 26, Id_link = 27, Id_anchor = 28, Id_equals = 29,
			Id_equalsIgnoreCase = 30, Id_match = 31, Id_search = 32,
			Id_replace = 33, Id_localeCompare = 34, Id_toLocaleLowerCase = 35,
			Id_toLocaleUpperCase = 36, MAX_PROTOTYPE_ID = 36;

	// #/string_id_map#

	private String string;
}

final class NativeDate extends IdScriptableObject implements Wrapper {
	static final long serialVersionUID = -8307438915861678966L;

	private static final Object DATE_TAG = new Object();

	private static final String js_NaN_date_str = "Invalid Date";

	static NativeDate init(Scriptable scope, boolean sealed) {
		NativeDate obj = new NativeDate();
		// Set the value of the prototype Date to NaN ('invalid date');
		obj.date = ScriptRuntime.NaN;
		obj.exportAsJSClass(MAX_PROTOTYPE_ID, scope, sealed);
		return obj;
	}

	private NativeDate() {
		if (thisTimeZone == null) {
			// j.u.TimeZone is synchronized, so setting class statics from it
			// should be OK.
			thisTimeZone = java.util.TimeZone.getDefault();
			LocalTZA = thisTimeZone.getRawOffset();
		}
	}

	public NativeDate(Date date) {
		this();
		this.javaDate = date;
		this.date = TimeClip(date.getTime());

	}

	public String getClassName() {
		return "Date";
	}

	public Object getDefaultValue(Class typeHint) {
		if (typeHint == null)
			typeHint = ScriptRuntime.StringClass;
		return super.getDefaultValue(typeHint);
	}

	double getJSTimeValue() {
		return date;
	}

	protected void fillConstructorProperties(IdFunctionObject ctor) {
		addIdFunctionProperty(ctor, DATE_TAG, ConstructorId_now, "now", 0);
		addIdFunctionProperty(ctor, DATE_TAG, ConstructorId_parse, "parse", 1);
		addIdFunctionProperty(ctor, DATE_TAG, ConstructorId_UTC, "UTC", 1);
		super.fillConstructorProperties(ctor);
	}

	protected void initPrototypeId(int id) {
		String s;
		int arity;
		switch (id) {
		case Id_constructor:
			arity = 1;
			s = "constructor";
			break;
		case Id_toString:
			arity = 0;
			s = "toString";
			break;
		case Id_toTimeString:
			arity = 0;
			s = "toTimeString";
			break;
		case Id_toDateString:
			arity = 0;
			s = "toDateString";
			break;
		case Id_toLocaleString:
			arity = 0;
			s = "toLocaleString";
			break;
		case Id_toLocaleTimeString:
			arity = 0;
			s = "toLocaleTimeString";
			break;
		case Id_toLocaleDateString:
			arity = 0;
			s = "toLocaleDateString";
			break;
		case Id_toUTCString:
			arity = 0;
			s = "toUTCString";
			break;
		case Id_toSource:
			arity = 0;
			s = "toSource";
			break;
		case Id_valueOf:
			arity = 0;
			s = "valueOf";
			break;
		case Id_getTime:
			arity = 0;
			s = "getTime";
			break;
		case Id_getYear:
			arity = 0;
			s = "getYear";
			break;
		case Id_getFullYear:
			arity = 0;
			s = "getFullYear";
			break;
		case Id_getUTCFullYear:
			arity = 0;
			s = "getUTCFullYear";
			break;
		case Id_getMonth:
			arity = 0;
			s = "getMonth";
			break;
		case Id_getUTCMonth:
			arity = 0;
			s = "getUTCMonth";
			break;
		case Id_getDate:
			arity = 0;
			s = "getDate";
			break;
		case Id_getUTCDate:
			arity = 0;
			s = "getUTCDate";
			break;
		case Id_getDay:
			arity = 0;
			s = "getDay";
			break;
		case Id_getUTCDay:
			arity = 0;
			s = "getUTCDay";
			break;
		case Id_getHours:
			arity = 0;
			s = "getHours";
			break;
		case Id_getUTCHours:
			arity = 0;
			s = "getUTCHours";
			break;
		case Id_getMinutes:
			arity = 0;
			s = "getMinutes";
			break;
		case Id_getUTCMinutes:
			arity = 0;
			s = "getUTCMinutes";
			break;
		case Id_getSeconds:
			arity = 0;
			s = "getSeconds";
			break;
		case Id_getUTCSeconds:
			arity = 0;
			s = "getUTCSeconds";
			break;
		case Id_getMilliseconds:
			arity = 0;
			s = "getMilliseconds";
			break;
		case Id_getUTCMilliseconds:
			arity = 0;
			s = "getUTCMilliseconds";
			break;
		case Id_getTimezoneOffset:
			arity = 0;
			s = "getTimezoneOffset";
			break;
		case Id_setTime:
			arity = 1;
			s = "setTime";
			break;
		case Id_setMilliseconds:
			arity = 1;
			s = "setMilliseconds";
			break;
		case Id_setUTCMilliseconds:
			arity = 1;
			s = "setUTCMilliseconds";
			break;
		case Id_setSeconds:
			arity = 2;
			s = "setSeconds";
			break;
		case Id_setUTCSeconds:
			arity = 2;
			s = "setUTCSeconds";
			break;
		case Id_setMinutes:
			arity = 3;
			s = "setMinutes";
			break;
		case Id_setUTCMinutes:
			arity = 3;
			s = "setUTCMinutes";
			break;
		case Id_setHours:
			arity = 4;
			s = "setHours";
			break;
		case Id_setUTCHours:
			arity = 4;
			s = "setUTCHours";
			break;
		case Id_setDate:
			arity = 1;
			s = "setDate";
			break;
		case Id_setUTCDate:
			arity = 1;
			s = "setUTCDate";
			break;
		case Id_setMonth:
			arity = 2;
			s = "setMonth";
			break;
		case Id_setUTCMonth:
			arity = 2;
			s = "setUTCMonth";
			break;
		case Id_setFullYear:
			arity = 3;
			s = "setFullYear";
			break;
		case Id_setUTCFullYear:
			arity = 3;
			s = "setUTCFullYear";
			break;
		case Id_setYear:
			arity = 1;
			s = "setYear";
			break;
		default:
			throw new IllegalArgumentException(String.valueOf(id));
		}
		initPrototypeMethod(DATE_TAG, id, s, arity);
	}

	public Object execIdCall(IdFunctionObject f, Context cx, Scriptable scope,
			Scriptable thisObj, Object[] args) {
		if (!f.hasTag(DATE_TAG)) {
			return super.execIdCall(f, cx, scope, thisObj, args);
		}
		int id = f.methodId();
		switch (id) {
		case ConstructorId_now:
			return ScriptRuntime.wrapNumber(now());

		case ConstructorId_parse: {
			String dataStr = ScriptRuntime.toString(args, 0);
			return ScriptRuntime.wrapNumber(date_parseString(dataStr));
		}

		case ConstructorId_UTC:
			return ScriptRuntime.wrapNumber(jsStaticFunction_UTC(args));

		case Id_constructor: {
			// if called as a function, just return a string
			// representing the current time.
			if (thisObj != null)
				return date_format(now(), Id_toString);
			return jsConstructor(args);
		}
		}

		// The rest of Date.prototype methods require thisObj to be Date

		if (!(thisObj instanceof NativeDate))
			throw incompatibleCallError(f);
		NativeDate realThis = (NativeDate) thisObj;
		double t = realThis.date;

		switch (id) {

		case Id_toString:
		case Id_toTimeString:
		case Id_toDateString:
			if (t == t) {
				return date_format(t, id);
			}
			return js_NaN_date_str;

		case Id_toLocaleString:
		case Id_toLocaleTimeString:
		case Id_toLocaleDateString:
			if (t == t) {
				return toLocale_helper(t, id);
			}
			return js_NaN_date_str;

		case Id_toUTCString:
			if (t == t) {
				return js_toUTCString(t);
			}
			return js_NaN_date_str;

		case Id_toSource:
			return "(new Date(" + ScriptRuntime.toString(t) + "))";

		case Id_valueOf:
		case Id_getTime:
			return ScriptRuntime.wrapNumber(t);

		case Id_getYear:
		case Id_getFullYear:
		case Id_getUTCFullYear:
			if (t == t) {
				if (id != Id_getUTCFullYear)
					t = LocalTime(t);
				t = YearFromTime(t);
				if (id == Id_getYear) {
					if (cx.hasFeature(Context.FEATURE_NON_ECMA_GET_YEAR)) {
						if (1900 <= t && t < 2000) {
							t -= 1900;
						}
					} else {
						t -= 1900;
					}
				}
			}
			return ScriptRuntime.wrapNumber(t);

		case Id_getMonth:
		case Id_getUTCMonth:
			if (t == t) {
				if (id == Id_getMonth)
					t = LocalTime(t);
				t = MonthFromTime(t);
			}
			return ScriptRuntime.wrapNumber(t);

		case Id_getDate:
		case Id_getUTCDate:
			if (t == t) {
				if (id == Id_getDate)
					t = LocalTime(t);
				t = DateFromTime(t);
			}
			return ScriptRuntime.wrapNumber(t);

		case Id_getDay:
		case Id_getUTCDay:
			if (t == t) {
				if (id == Id_getDay)
					t = LocalTime(t);
				t = WeekDay(t);
			}
			return ScriptRuntime.wrapNumber(t);

		case Id_getHours:
		case Id_getUTCHours:
			if (t == t) {
				if (id == Id_getHours)
					t = LocalTime(t);
				t = HourFromTime(t);
			}
			return ScriptRuntime.wrapNumber(t);

		case Id_getMinutes:
		case Id_getUTCMinutes:
			if (t == t) {
				if (id == Id_getMinutes)
					t = LocalTime(t);
				t = MinFromTime(t);
			}
			return ScriptRuntime.wrapNumber(t);

		case Id_getSeconds:
		case Id_getUTCSeconds:
			if (t == t) {
				if (id == Id_getSeconds)
					t = LocalTime(t);
				t = SecFromTime(t);
			}
			return ScriptRuntime.wrapNumber(t);

		case Id_getMilliseconds:
		case Id_getUTCMilliseconds:
			if (t == t) {
				if (id == Id_getMilliseconds)
					t = LocalTime(t);
				t = msFromTime(t);
			}
			return ScriptRuntime.wrapNumber(t);

		case Id_getTimezoneOffset:
			if (t == t) {
				t = (t - LocalTime(t)) / msPerMinute;
			}
			return ScriptRuntime.wrapNumber(t);

		case Id_setTime:
			t = TimeClip(ScriptRuntime.toNumber(args, 0));
			realThis.date = t;
			if (realThis.javaDate != null) {
				realThis.javaDate.setTime((long) realThis.date);
			}
			return ScriptRuntime.wrapNumber(t);

		case Id_setMilliseconds:
		case Id_setUTCMilliseconds:
		case Id_setSeconds:
		case Id_setUTCSeconds:
		case Id_setMinutes:
		case Id_setUTCMinutes:
		case Id_setHours:
		case Id_setUTCHours:
			t = makeTime(t, args, id);
			realThis.date = t;
			if (realThis.javaDate != null) {
				realThis.javaDate.setTime((long) realThis.date);
			}
			return ScriptRuntime.wrapNumber(t);

		case Id_setDate:
		case Id_setUTCDate:
		case Id_setMonth:
		case Id_setUTCMonth:
		case Id_setFullYear:
		case Id_setUTCFullYear:
			t = makeDate(t, args, id);
			realThis.date = t;
			if (realThis.javaDate != null) {
				realThis.javaDate.setTime((long) realThis.date);
			}
			return ScriptRuntime.wrapNumber(t);

		case Id_setYear: {
			double year = ScriptRuntime.toNumber(args, 0);

			if (year != year || Double.isInfinite(year)) {
				t = ScriptRuntime.NaN;
			} else {
				if (t != t) {
					t = 0;
				} else {
					t = LocalTime(t);
				}

				if (year >= 0 && year <= 99)
					year += 1900;

				double day = MakeDay(year, MonthFromTime(t), DateFromTime(t));
				t = MakeDate(day, TimeWithinDay(t));
				t = internalUTC(t);
				t = TimeClip(t);
			}
		}
			realThis.date = t;
			if (realThis.javaDate != null) {
				realThis.javaDate.setTime((long) realThis.date);
			}
			return ScriptRuntime.wrapNumber(t);

		default:
			throw new IllegalArgumentException(String.valueOf(id));
		}

	}

	/* ECMA helper functions */

	private static final double HalfTimeDomain = 8.64e15;

	private static final double HoursPerDay = 24.0;

	private static final double MinutesPerHour = 60.0;

	private static final double SecondsPerMinute = 60.0;

	private static final double msPerSecond = 1000.0;

	private static final double MinutesPerDay = (HoursPerDay * MinutesPerHour);

	private static final double SecondsPerDay = (MinutesPerDay * SecondsPerMinute);

	private static final double SecondsPerHour = (MinutesPerHour * SecondsPerMinute);

	private static final double msPerDay = (SecondsPerDay * msPerSecond);

	private static final double msPerHour = (SecondsPerHour * msPerSecond);

	private static final double msPerMinute = (SecondsPerMinute * msPerSecond);

	private static double Day(double t) {
		return Math.floor(t / msPerDay);
	}

	private static double TimeWithinDay(double t) {
		double result;
		result = t % msPerDay;
		if (result < 0)
			result += msPerDay;
		return result;
	}

	private static boolean IsLeapYear(int year) {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}

	/*
	 * math here has to be f.p, because we need floor((1968 - 1969) / 4) == -1
	 */
	private static double DayFromYear(double y) {
		return ((365 * ((y) - 1970) + Math.floor(((y) - 1969) / 4.0)
				- Math.floor(((y) - 1901) / 100.0) + Math
				.floor(((y) - 1601) / 400.0)));
	}

	private static double TimeFromYear(double y) {
		return DayFromYear(y) * msPerDay;
	}

	private static int YearFromTime(double t) {
		int lo = (int) Math.floor((t / msPerDay) / 366) + 1970;
		int hi = (int) Math.floor((t / msPerDay) / 365) + 1970;
		int mid;

		/* above doesn't work for negative dates... */
		if (hi < lo) {
			int temp = lo;
			lo = hi;
			hi = temp;
		}

		/*
		 * Use a simple binary search algorithm to find the right year. This
		 * seems like brute force... but the computation of hi and lo years
		 * above lands within one year of the correct answer for years within a
		 * thousand years of 1970; the loop below only requires six iterations
		 * for year 270000.
		 */
		while (hi > lo) {
			mid = (hi + lo) / 2;
			if (TimeFromYear(mid) > t) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
				if (TimeFromYear(lo) > t) {
					return mid;
				}
			}
		}
		return lo;
	}

	private static double DayFromMonth(int m, int year) {
		int day = m * 30;

		if (m >= 7) {
			day += m / 2 - 1;
		} else if (m >= 2) {
			day += (m - 1) / 2 - 1;
		} else {
			day += m;
		}

		if (m >= 2 && IsLeapYear(year)) {
			++day;
		}

		return day;
	}

	private static int MonthFromTime(double t) {
		int year = YearFromTime(t);
		int d = (int) (Day(t) - DayFromYear(year));

		d -= 31 + 28;
		if (d < 0) {
			return (d < -28) ? 0 : 1;
		}

		if (IsLeapYear(year)) {
			if (d == 0)
				return 1; // 29 February
			--d;
		}

		// d: date count from 1 March
		int estimate = d / 30; // approx number of month since March
		int mstart;
		switch (estimate) {
		case 0:
			return 2;
		case 1:
			mstart = 31;
			break;
		case 2:
			mstart = 31 + 30;
			break;
		case 3:
			mstart = 31 + 30 + 31;
			break;
		case 4:
			mstart = 31 + 30 + 31 + 30;
			break;
		case 5:
			mstart = 31 + 30 + 31 + 30 + 31;
			break;
		case 6:
			mstart = 31 + 30 + 31 + 30 + 31 + 31;
			break;
		case 7:
			mstart = 31 + 30 + 31 + 30 + 31 + 31 + 30;
			break;
		case 8:
			mstart = 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			break;
		case 9:
			mstart = 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			break;
		case 10:
			return 11; // Late december
		default:
			throw Kit.codeBug();
		}
		// if d < mstart then real month since March == estimate - 1
		return (d >= mstart) ? estimate + 2 : estimate + 1;
	}

	private static int DateFromTime(double t) {
		int year = YearFromTime(t);
		int d = (int) (Day(t) - DayFromYear(year));

		d -= 31 + 28;
		if (d < 0) {
			return (d < -28) ? d + 31 + 28 + 1 : d + 28 + 1;
		}

		if (IsLeapYear(year)) {
			if (d == 0)
				return 29; // 29 February
			--d;
		}

		// d: date count from 1 March
		int mdays, mstart;
		switch (d / 30) { // approx number of month since March
		case 0:
			return d + 1;
		case 1:
			mdays = 31;
			mstart = 31;
			break;
		case 2:
			mdays = 30;
			mstart = 31 + 30;
			break;
		case 3:
			mdays = 31;
			mstart = 31 + 30 + 31;
			break;
		case 4:
			mdays = 30;
			mstart = 31 + 30 + 31 + 30;
			break;
		case 5:
			mdays = 31;
			mstart = 31 + 30 + 31 + 30 + 31;
			break;
		case 6:
			mdays = 31;
			mstart = 31 + 30 + 31 + 30 + 31 + 31;
			break;
		case 7:
			mdays = 30;
			mstart = 31 + 30 + 31 + 30 + 31 + 31 + 30;
			break;
		case 8:
			mdays = 31;
			mstart = 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			break;
		case 9:
			mdays = 30;
			mstart = 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			break;
		case 10:
			return d - (31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30) + 1; // Late
			// december
		default:
			throw Kit.codeBug();
		}
		d -= mstart;
		if (d < 0) {
			// wrong estimate: sfhift to previous month
			d += mdays;
		}
		return d + 1;
	}

	private static int WeekDay(double t) {
		double result;
		result = Day(t) + 4;
		result = result % 7;
		if (result < 0)
			result += 7;
		return (int) result;
	}

	private static double now() {
		return System.currentTimeMillis();
	}

	/*
	 * Should be possible to determine the need for this dynamically if we go
	 * with the workaround... I'm not using it now, because I can't think of any
	 * clean way to make toLocaleString() and the time zone (comment) in
	 * toString match the generated string values. Currently it's
	 * wrong-but-consistent in all but the most recent betas of the JRE - seems
	 * to work in 1.1.7.
	 */
	private final static boolean TZO_WORKAROUND = false;

	private static double DaylightSavingTA(double t) {
		// Another workaround! The JRE doesn't seem to know about DST
		// before year 1 AD, so we map to equivalent dates for the
		// purposes of finding dst. To be safe, we do this for years
		// outside 1970-2038.
		if (t < 0.0 || t > 2145916800000.0) {
			int year = EquivalentYear(YearFromTime(t));
			double day = MakeDay(year, MonthFromTime(t), DateFromTime(t));
			t = MakeDate(day, TimeWithinDay(t));
		}
		if (!TZO_WORKAROUND) {
			Date date = new Date((long) t);
			if (thisTimeZone.inDaylightTime(date))
				return msPerHour;
			else
				return 0;
		} else {
			/*
			 * Use getOffset if inDaylightTime() is broken, because it seems to
			 * work acceptably. We don't switch over to it entirely, because it
			 * requires (expensive) exploded date arguments, and the api makes
			 * it impossible to handle dst changeovers cleanly.
			 */

			// Hardcode the assumption that the changeover always
			// happens at 2:00 AM:
			t += LocalTZA + (HourFromTime(t) <= 2 ? msPerHour : 0);

			int year = YearFromTime(t);
			double offset = thisTimeZone.getOffset(year > 0 ? 1 : 0, year,
					MonthFromTime(t), DateFromTime(t), WeekDay(t),
					(int) TimeWithinDay(t));

			if ((offset - LocalTZA) != 0)
				return msPerHour;
			else
				return 0;
			// return offset - LocalTZA;
		}
	}

	/*
	 * Find a year for which any given date will fall on the same weekday. This
	 * function should be used with caution when used other than for determining
	 * DST; it hasn't been proven not to produce an incorrect year for times
	 * near year boundaries.
	 */
	private static int EquivalentYear(int year) {
		int day = (int) DayFromYear(year) + 4;
		day = day % 7;
		if (day < 0)
			day += 7;
		// Years and leap years on which Jan 1 is a Sunday, Monday, etc.
		if (IsLeapYear(year)) {
			switch (day) {
			case 0:
				return 1984;
			case 1:
				return 1996;
			case 2:
				return 1980;
			case 3:
				return 1992;
			case 4:
				return 1976;
			case 5:
				return 1988;
			case 6:
				return 1972;
			}
		} else {
			switch (day) {
			case 0:
				return 1978;
			case 1:
				return 1973;
			case 2:
				return 1974;
			case 3:
				return 1975;
			case 4:
				return 1981;
			case 5:
				return 1971;
			case 6:
				return 1977;
			}
		}
		// Unreachable
		throw Kit.codeBug();
	}

	private static double LocalTime(double t) {
		return t + LocalTZA + DaylightSavingTA(t);
	}

	private static double internalUTC(double t) {
		return t - LocalTZA - DaylightSavingTA(t - LocalTZA);
	}

	private static int HourFromTime(double t) {
		double result;
		result = Math.floor(t / msPerHour) % HoursPerDay;
		if (result < 0)
			result += HoursPerDay;
		return (int) result;
	}

	private static int MinFromTime(double t) {
		double result;
		result = Math.floor(t / msPerMinute) % MinutesPerHour;
		if (result < 0)
			result += MinutesPerHour;
		return (int) result;
	}

	private static int SecFromTime(double t) {
		double result;
		result = Math.floor(t / msPerSecond) % SecondsPerMinute;
		if (result < 0)
			result += SecondsPerMinute;
		return (int) result;
	}

	private static int msFromTime(double t) {
		double result;
		result = t % msPerSecond;
		if (result < 0)
			result += msPerSecond;
		return (int) result;
	}

	private static double MakeTime(double hour, double min, double sec,
			double ms) {
		return ((hour * MinutesPerHour + min) * SecondsPerMinute + sec)
				* msPerSecond + ms;
	}

	private static double MakeDay(double year, double month, double date) {
		year += Math.floor(month / 12);

		month = month % 12;
		if (month < 0)
			month += 12;

		double yearday = Math.floor(TimeFromYear(year) / msPerDay);
		double monthday = DayFromMonth((int) month, (int) year);

		return yearday + monthday + date - 1;
	}

	private static double MakeDate(double day, double time) {
		return day * msPerDay + time;
	}

	private static double TimeClip(double d) {
		if (d != d || d == Double.POSITIVE_INFINITY
				|| d == Double.NEGATIVE_INFINITY
				|| Math.abs(d) > HalfTimeDomain) {
			return ScriptRuntime.NaN;
		}
		if (d > 0.0)
			return Math.floor(d + 0.);
		else
			return Math.ceil(d + 0.);
	}

	/* end of ECMA helper functions */

	/* find UTC time from given date... no 1900 correction! */
	private static double date_msecFromDate(double year, double mon,
			double mday, double hour, double min, double sec, double msec) {
		double day;
		double time;
		double result;

		day = MakeDay(year, mon, mday);
		time = MakeTime(hour, min, sec, msec);
		result = MakeDate(day, time);
		return result;
	}

	/* compute the time in msec (unclipped) from the given args */
	private static final int MAXARGS = 7;

	private static double date_msecFromArgs(Object[] args) {
		double array[] = new double[MAXARGS];
		int loop;
		double d;

		for (loop = 0; loop < MAXARGS; loop++) {
			if (loop < args.length) {
				d = ScriptRuntime.toNumber(args[loop]);
				if (d != d || Double.isInfinite(d)) {
					return ScriptRuntime.NaN;
				}
				array[loop] = ScriptRuntime.toInteger(args[loop]);
			} else {
				if (loop == 2) {
					array[loop] = 1; /* Default the date argument to 1. */
				} else {
					array[loop] = 0;
				}
			}
		}

		/* adjust 2-digit years into the 20th century */
		if (array[0] >= 0 && array[0] <= 99)
			array[0] += 1900;

		return date_msecFromDate(array[0], array[1], array[2], array[3],
				array[4], array[5], array[6]);
	}

	private static double jsStaticFunction_UTC(Object[] args) {
		return TimeClip(date_msecFromArgs(args));
	}

	private static double date_parseString(String s) {
		int year = -1;
		int mon = -1;
		int mday = -1;
		int hour = -1;
		int min = -1;
		int sec = -1;
		char c = 0;
		char si = 0;
		int i = 0;
		int n = -1;
		double tzoffset = -1;
		char prevc = 0;
		int limit = 0;
		boolean seenplusminus = false;

		limit = s.length();
		while (i < limit) {
			c = s.charAt(i);
			i++;
			if (c <= ' ' || c == ',' || c == '-') {
				if (i < limit) {
					si = s.charAt(i);
					if (c == '-' && '0' <= si && si <= '9') {
						prevc = c;
					}
				}
				continue;
			}
			if (c == '(') { /* comments) */
				int depth = 1;
				while (i < limit) {
					c = s.charAt(i);
					i++;
					if (c == '(')
						depth++;
					else if (c == ')')
						if (--depth <= 0)
							break;
				}
				continue;
			}
			if ('0' <= c && c <= '9') {
				n = c - '0';
				while (i < limit && '0' <= (c = s.charAt(i)) && c <= '9') {
					n = n * 10 + c - '0';
					i++;
				}

				/*
				 * allow TZA before the year, so 'Wed Nov 05 21:49:11 GMT-0800
				 * 1997' works
				 */

				/*
				 * uses of seenplusminus allow : in TZA, so Java no-timezone
				 * style of GMT+4:30 works
				 */
				if ((prevc == '+' || prevc == '-')/* && year>=0 */) {
					/* make ':' case below change tzoffset */
					seenplusminus = true;

					/* offset */
					if (n < 24)
						n = n * 60; /* EG. "GMT-3" */
					else
						n = n % 100 + n / 100 * 60; /* eg "GMT-0430" */
					if (prevc == '+') /* plus means east of GMT */
						n = -n;
					if (tzoffset != 0 && tzoffset != -1)
						return ScriptRuntime.NaN;
					tzoffset = n;
				} else if (n >= 70
						|| (prevc == '/' && mon >= 0 && mday >= 0 && year < 0)) {
					if (year >= 0)
						return ScriptRuntime.NaN;
					else if (c <= ' ' || c == ',' || c == '/' || i >= limit)
						year = n < 100 ? n + 1900 : n;
					else
						return ScriptRuntime.NaN;
				} else if (c == ':') {
					if (hour < 0)
						hour = /* byte */n;
					else if (min < 0)
						min = /* byte */n;
					else
						return ScriptRuntime.NaN;
				} else if (c == '/') {
					if (mon < 0)
						mon = /* byte */n - 1;
					else if (mday < 0)
						mday = /* byte */n;
					else
						return ScriptRuntime.NaN;
				} else if (i < limit && c != ',' && c > ' ' && c != '-') {
					return ScriptRuntime.NaN;
				} else if (seenplusminus && n < 60) { /* handle GMT-3:30 */
					if (tzoffset < 0)
						tzoffset -= n;
					else
						tzoffset += n;
				} else if (hour >= 0 && min < 0) {
					min = /* byte */n;
				} else if (min >= 0 && sec < 0) {
					sec = /* byte */n;
				} else if (mday < 0) {
					mday = /* byte */n;
				} else {
					return ScriptRuntime.NaN;
				}
				prevc = 0;
			} else if (c == '/' || c == ':' || c == '+' || c == '-') {
				prevc = c;
			} else {
				int st = i - 1;
				while (i < limit) {
					c = s.charAt(i);
					if (!(('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')))
						break;
					i++;
				}
				int letterCount = i - st;
				if (letterCount < 2)
					return ScriptRuntime.NaN;
				/*
				 * Use ported code from jsdate.c rather than the locale-specific
				 * date-parsing code from Java, to keep js and rhino consistent.
				 * Is this the right strategy?
				 */
				String wtb = "am;pm;"
						+ "monday;tuesday;wednesday;thursday;friday;"
						+ "saturday;sunday;"
						+ "january;february;march;april;may;june;"
						+ "july;august;september;october;november;december;"
						+ "gmt;ut;utc;est;edt;cst;cdt;mst;mdt;pst;pdt;";
				int index = 0;
				for (int wtbOffset = 0;;) {
					int wtbNext = wtb.indexOf(';', wtbOffset);
					if (wtbNext < 0)
						return ScriptRuntime.NaN;
					if (wtb.regionMatches(true, wtbOffset, s, st, letterCount))
						break;
					wtbOffset = wtbNext + 1;
					++index;
				}
				if (index < 2) {
					/*
					 * AM/PM. Count 12:30 AM as 00:30, 12:30 PM as 12:30,
					 * instead of blindly adding 12 if PM.
					 */
					if (hour > 12 || hour < 0) {
						return ScriptRuntime.NaN;
					} else if (index == 0) {
						// AM
						if (hour == 12)
							hour = 0;
					} else {
						// PM
						if (hour != 12)
							hour += 12;
					}
				} else if ((index -= 2) < 7) {
					// ignore week days
				} else if ((index -= 7) < 12) {
					// month
					if (mon < 0) {
						mon = index;
					} else {
						return ScriptRuntime.NaN;
					}
				} else {
					index -= 12;
					// timezones
					switch (index) {
					case 0 /* gmt */:
						tzoffset = 0;
						break;
					case 1 /* ut */:
						tzoffset = 0;
						break;
					case 2 /* utc */:
						tzoffset = 0;
						break;
					case 3 /* est */:
						tzoffset = 5 * 60;
						break;
					case 4 /* edt */:
						tzoffset = 4 * 60;
						break;
					case 5 /* cst */:
						tzoffset = 6 * 60;
						break;
					case 6 /* cdt */:
						tzoffset = 5 * 60;
						break;
					case 7 /* mst */:
						tzoffset = 7 * 60;
						break;
					case 8 /* mdt */:
						tzoffset = 6 * 60;
						break;
					case 9 /* pst */:
						tzoffset = 8 * 60;
						break;
					case 10 /* pdt */:
						tzoffset = 7 * 60;
						break;
					default:
						Kit.codeBug();
					}
				}
			}
		}
		if (year < 0 || mon < 0 || mday < 0)
			return ScriptRuntime.NaN;
		if (sec < 0)
			sec = 0;
		if (min < 0)
			min = 0;
		if (hour < 0)
			hour = 0;

		double msec = date_msecFromDate(year, mon, mday, hour, min, sec, 0);
		if (tzoffset == -1) { /* no time zone specified, have to use local */
			return internalUTC(msec);
		} else {
			return msec + tzoffset * msPerMinute;
		}
	}

	private static String date_format(double t, int methodId) {
		StringBuffer result = new StringBuffer(60);
		double local = LocalTime(t);

		/* Tue Oct 31 09:41:40 GMT-0800 (PST) 2000 */
		/* Tue Oct 31 2000 */
		/* 09:41:40 GMT-0800 (PST) */

		if (methodId != Id_toTimeString) {
			appendWeekDayName(result, WeekDay(local));
			result.append(' ');
			appendMonthName(result, MonthFromTime(local));
			result.append(' ');
			append0PaddedUint(result, DateFromTime(local), 2);
			result.append(' ');
			int year = YearFromTime(local);
			if (year < 0) {
				result.append('-');
				year = -year;
			}
			append0PaddedUint(result, year, 4);
			if (methodId != Id_toDateString)
				result.append(' ');
		}

		if (methodId != Id_toDateString) {
			append0PaddedUint(result, HourFromTime(local), 2);
			result.append(':');
			append0PaddedUint(result, MinFromTime(local), 2);
			result.append(':');
			append0PaddedUint(result, SecFromTime(local), 2);

			// offset from GMT in minutes. The offset includes daylight
			// savings, if it applies.
			int minutes = (int) Math.floor((LocalTZA + DaylightSavingTA(t))
					/ msPerMinute);
			// map 510 minutes to 0830 hours
			int offset = (minutes / 60) * 100 + minutes % 60;
			if (offset > 0) {
				result.append(" GMT+");
			} else {
				result.append(" GMT-");
				offset = -offset;
			}
			append0PaddedUint(result, offset, 4);

			if (timeZoneFormatter == null)
				timeZoneFormatter = new java.text.SimpleDateFormat("zzz");

			// Find an equivalent year before getting the timezone
			// comment. See DaylightSavingTA.
			if (t < 0.0 || t > 2145916800000.0) {
				int equiv = EquivalentYear(YearFromTime(local));
				double day = MakeDay(equiv, MonthFromTime(t), DateFromTime(t));
				t = MakeDate(day, TimeWithinDay(t));
			}
			result.append(" (");
			java.util.Date date = new Date((long) t);
			synchronized (timeZoneFormatter) {
				result.append(timeZoneFormatter.format(date));
			}
			result.append(')');
		}
		return result.toString();
	}

	/* the javascript constructor */
	public static Object jsConstructor(Object[] args) {
		NativeDate obj = new NativeDate();

		// if called as a constructor with no args,
		// return a new Date with the current time.
		if (args.length == 0) {
			obj.date = now();
			return obj;
		}

		// if called with just one arg -
		if (args.length == 1) {
			double date;
			Object arg0 = args[0];
			if (arg0 instanceof Date) {
				obj.javaDate = (Date) arg0;
				date = obj.javaDate.getTime();
			} else {
				if (arg0 instanceof Scriptable)
					arg0 = ((Scriptable) arg0).getDefaultValue(null);
				if (arg0 instanceof String) {
					// it's a string; parse it.
					date = date_parseString((String) arg0);
				} else {
					// if it's not a string, use it as a millisecond date
					date = ScriptRuntime.toNumber(arg0);
				}
			}
			obj.date = TimeClip(date);
			return obj;
		}

		double time = date_msecFromArgs(args);

		if (!Double.isNaN(time) && !Double.isInfinite(time))
			time = TimeClip(internalUTC(time));

		obj.date = time;

		return obj;
	}

	private static String toLocale_helper(double t, int methodId) {
		java.text.DateFormat formatter;
		switch (methodId) {
		case Id_toLocaleString:
			if (localeDateTimeFormatter == null) {
				localeDateTimeFormatter = DateFormat.getDateTimeInstance(
						DateFormat.LONG, DateFormat.LONG);
			}
			formatter = localeDateTimeFormatter;
			break;
		case Id_toLocaleTimeString:
			if (localeTimeFormatter == null) {
				localeTimeFormatter = DateFormat
						.getTimeInstance(DateFormat.LONG);
			}
			formatter = localeTimeFormatter;
			break;
		case Id_toLocaleDateString:
			if (localeDateFormatter == null) {
				localeDateFormatter = DateFormat
						.getDateInstance(DateFormat.LONG);
			}
			formatter = localeDateFormatter;
			break;
		default:
			formatter = null; // unreachable
		}

		synchronized (formatter) {
			return formatter.format(new Date((long) t));
		}
	}

	private static String js_toUTCString(double date) {
		StringBuffer result = new StringBuffer(60);

		appendWeekDayName(result, WeekDay(date));
		result.append(", ");
		append0PaddedUint(result, DateFromTime(date), 2);
		result.append(' ');
		appendMonthName(result, MonthFromTime(date));
		result.append(' ');
		int year = YearFromTime(date);
		if (year < 0) {
			result.append('-');
			year = -year;
		}
		append0PaddedUint(result, year, 4);
		result.append(' ');
		append0PaddedUint(result, HourFromTime(date), 2);
		result.append(':');
		append0PaddedUint(result, MinFromTime(date), 2);
		result.append(':');
		append0PaddedUint(result, SecFromTime(date), 2);
		result.append(" GMT");
		return result.toString();
	}

	private static void append0PaddedUint(StringBuffer sb, int i, int minWidth) {
		if (i < 0)
			Kit.codeBug();
		int scale = 1;
		--minWidth;
		if (i >= 10) {
			if (i < 1000 * 1000 * 1000) {
				for (;;) {
					int newScale = scale * 10;
					if (i < newScale) {
						break;
					}
					--minWidth;
					scale = newScale;
				}
			} else {
				// Separated case not to check against 10 * 10^9 overflow
				minWidth -= 9;
				scale = 1000 * 1000 * 1000;
			}
		}
		while (minWidth > 0) {
			sb.append('0');
			--minWidth;
		}
		while (scale != 1) {
			sb.append((char) ('0' + (i / scale)));
			i %= scale;
			scale /= 10;
		}
		sb.append((char) ('0' + i));
	}

	private static void appendMonthName(StringBuffer sb, int index) {
		// Take advantage of the fact that all month abbreviations
		// have the same length to minimize amount of strings runtime has
		// to keep in memory
		String months = "Jan" + "Feb" + "Mar" + "Apr" + "May" + "Jun" + "Jul"
				+ "Aug" + "Sep" + "Oct" + "Nov" + "Dec";
		index *= 3;
		for (int i = 0; i != 3; ++i) {
			sb.append(months.charAt(index + i));
		}
	}

	private static void appendWeekDayName(StringBuffer sb, int index) {
		String days = "Sun" + "Mon" + "Tue" + "Wed" + "Thu" + "Fri" + "Sat";
		index *= 3;
		for (int i = 0; i != 3; ++i) {
			sb.append(days.charAt(index + i));
		}
	}

	private static double makeTime(double date, Object[] args, int methodId) {
		int maxargs;
		boolean local = true;
		switch (methodId) {
		case Id_setUTCMilliseconds:
			local = false;
			// fallthrough
		case Id_setMilliseconds:
			maxargs = 1;
			break;

		case Id_setUTCSeconds:
			local = false;
			// fallthrough
		case Id_setSeconds:
			maxargs = 2;
			break;

		case Id_setUTCMinutes:
			local = false;
			// fallthrough
		case Id_setMinutes:
			maxargs = 3;
			break;

		case Id_setUTCHours:
			local = false;
			// fallthrough
		case Id_setHours:
			maxargs = 4;
			break;

		default:
			Kit.codeBug();
			maxargs = 0;
		}

		int i;
		double conv[] = new double[4];
		double hour, min, sec, msec;
		double lorutime; /* Local or UTC version of date */

		double time;
		double result;

		/* just return NaN if the date is already NaN */
		if (date != date)
			return date;

		/*
		 * Satisfy the ECMA rule that if a function is called with fewer
		 * arguments than the specified formal arguments, the remaining
		 * arguments are set to undefined. Seems like all the Date.setWhatever
		 * functions in ECMA are only varargs beyond the first argument; this
		 * should be set to undefined if it's not given. This means that "d =
		 * new Date(); d.setMilliseconds()" returns NaN. Blech.
		 */
		if (args.length == 0)
			args = ScriptRuntime.padArguments(args, 1);

		for (i = 0; i < args.length && i < maxargs; i++) {
			conv[i] = ScriptRuntime.toNumber(args[i]);

			// limit checks that happen in MakeTime in ECMA.
			if (conv[i] != conv[i] || Double.isInfinite(conv[i])) {
				return ScriptRuntime.NaN;
			}
			conv[i] = ScriptRuntime.toInteger(conv[i]);
		}

		if (local)
			lorutime = LocalTime(date);
		else
			lorutime = date;

		i = 0;
		int stop = args.length;

		if (maxargs >= 4 && i < stop)
			hour = conv[i++];
		else
			hour = HourFromTime(lorutime);

		if (maxargs >= 3 && i < stop)
			min = conv[i++];
		else
			min = MinFromTime(lorutime);

		if (maxargs >= 2 && i < stop)
			sec = conv[i++];
		else
			sec = SecFromTime(lorutime);

		if (maxargs >= 1 && i < stop)
			msec = conv[i++];
		else
			msec = msFromTime(lorutime);

		time = MakeTime(hour, min, sec, msec);
		result = MakeDate(Day(lorutime), time);

		if (local)
			result = internalUTC(result);
		date = TimeClip(result);

		return date;
	}

	private static double makeDate(double date, Object[] args, int methodId) {
		int maxargs;
		boolean local = true;
		switch (methodId) {
		case Id_setUTCDate:
			local = false;
			// fallthrough
		case Id_setDate:
			maxargs = 1;
			break;

		case Id_setUTCMonth:
			local = false;
			// fallthrough
		case Id_setMonth:
			maxargs = 2;
			break;

		case Id_setUTCFullYear:
			local = false;
			// fallthrough
		case Id_setFullYear:
			maxargs = 3;
			break;

		default:
			Kit.codeBug();
			maxargs = 0;
		}

		int i;
		double conv[] = new double[3];
		double year, month, day;
		double lorutime; /* local or UTC version of date */
		double result;

		/* See arg padding comment in makeTime. */
		if (args.length == 0)
			args = ScriptRuntime.padArguments(args, 1);

		for (i = 0; i < args.length && i < maxargs; i++) {
			conv[i] = ScriptRuntime.toNumber(args[i]);

			// limit checks that happen in MakeDate in ECMA.
			if (conv[i] != conv[i] || Double.isInfinite(conv[i])) {
				return ScriptRuntime.NaN;
			}
			conv[i] = ScriptRuntime.toInteger(conv[i]);
		}

		/*
		 * return NaN if date is NaN and we're not setting the year, If we are,
		 * use 0 as the time.
		 */
		if (date != date) {
			if (args.length < 3) {
				return ScriptRuntime.NaN;
			} else {
				lorutime = 0;
			}
		} else {
			if (local)
				lorutime = LocalTime(date);
			else
				lorutime = date;
		}

		i = 0;
		int stop = args.length;

		if (maxargs >= 3 && i < stop)
			year = conv[i++];
		else
			year = YearFromTime(lorutime);

		if (maxargs >= 2 && i < stop)
			month = conv[i++];
		else
			month = MonthFromTime(lorutime);

		if (maxargs >= 1 && i < stop)
			day = conv[i++];
		else
			day = DateFromTime(lorutime);

		day = MakeDay(year, month, day); /* day within year */
		result = MakeDate(day, TimeWithinDay(lorutime));

		if (local)
			result = internalUTC(result);

		date = TimeClip(result);

		return date;
	}

	// #string_id_map#

	protected int findPrototypeId(String s) {
		int id;
		// #generated# Last update: 2007-05-09 08:15:38 EDT
		L0: {
			id = 0;
			String X = null;
			int c;
			L: switch (s.length()) {
			case 6:
				X = "getDay";
				id = Id_getDay;
				break L;
			case 7:
				switch (s.charAt(3)) {
				case 'D':
					c = s.charAt(0);
					if (c == 'g') {
						X = "getDate";
						id = Id_getDate;
					} else if (c == 's') {
						X = "setDate";
						id = Id_setDate;
					}
					break L;
				case 'T':
					c = s.charAt(0);
					if (c == 'g') {
						X = "getTime";
						id = Id_getTime;
					} else if (c == 's') {
						X = "setTime";
						id = Id_setTime;
					}
					break L;
				case 'Y':
					c = s.charAt(0);
					if (c == 'g') {
						X = "getYear";
						id = Id_getYear;
					} else if (c == 's') {
						X = "setYear";
						id = Id_setYear;
					}
					break L;
				case 'u':
					X = "valueOf";
					id = Id_valueOf;
					break L;
				}
				break L;
			case 8:
				switch (s.charAt(3)) {
				case 'H':
					c = s.charAt(0);
					if (c == 'g') {
						X = "getHours";
						id = Id_getHours;
					} else if (c == 's') {
						X = "setHours";
						id = Id_setHours;
					}
					break L;
				case 'M':
					c = s.charAt(0);
					if (c == 'g') {
						X = "getMonth";
						id = Id_getMonth;
					} else if (c == 's') {
						X = "setMonth";
						id = Id_setMonth;
					}
					break L;
				case 'o':
					X = "toSource";
					id = Id_toSource;
					break L;
				case 't':
					X = "toString";
					id = Id_toString;
					break L;
				}
				break L;
			case 9:
				X = "getUTCDay";
				id = Id_getUTCDay;
				break L;
			case 10:
				c = s.charAt(3);
				if (c == 'M') {
					c = s.charAt(0);
					if (c == 'g') {
						X = "getMinutes";
						id = Id_getMinutes;
					} else if (c == 's') {
						X = "setMinutes";
						id = Id_setMinutes;
					}
				} else if (c == 'S') {
					c = s.charAt(0);
					if (c == 'g') {
						X = "getSeconds";
						id = Id_getSeconds;
					} else if (c == 's') {
						X = "setSeconds";
						id = Id_setSeconds;
					}
				} else if (c == 'U') {
					c = s.charAt(0);
					if (c == 'g') {
						X = "getUTCDate";
						id = Id_getUTCDate;
					} else if (c == 's') {
						X = "setUTCDate";
						id = Id_setUTCDate;
					}
				}
				break L;
			case 11:
				switch (s.charAt(3)) {
				case 'F':
					c = s.charAt(0);
					if (c == 'g') {
						X = "getFullYear";
						id = Id_getFullYear;
					} else if (c == 's') {
						X = "setFullYear";
						id = Id_setFullYear;
					}
					break L;
				case 'M':
					X = "toGMTString";
					id = Id_toGMTString;
					break L;
				case 'T':
					X = "toUTCString";
					id = Id_toUTCString;
					break L;
				case 'U':
					c = s.charAt(0);
					if (c == 'g') {
						c = s.charAt(9);
						if (c == 'r') {
							X = "getUTCHours";
							id = Id_getUTCHours;
						} else if (c == 't') {
							X = "getUTCMonth";
							id = Id_getUTCMonth;
						}
					} else if (c == 's') {
						c = s.charAt(9);
						if (c == 'r') {
							X = "setUTCHours";
							id = Id_setUTCHours;
						} else if (c == 't') {
							X = "setUTCMonth";
							id = Id_setUTCMonth;
						}
					}
					break L;
				case 's':
					X = "constructor";
					id = Id_constructor;
					break L;
				}
				break L;
			case 12:
				c = s.charAt(2);
				if (c == 'D') {
					X = "toDateString";
					id = Id_toDateString;
				} else if (c == 'T') {
					X = "toTimeString";
					id = Id_toTimeString;
				}
				break L;
			case 13:
				c = s.charAt(0);
				if (c == 'g') {
					c = s.charAt(6);
					if (c == 'M') {
						X = "getUTCMinutes";
						id = Id_getUTCMinutes;
					} else if (c == 'S') {
						X = "getUTCSeconds";
						id = Id_getUTCSeconds;
					}
				} else if (c == 's') {
					c = s.charAt(6);
					if (c == 'M') {
						X = "setUTCMinutes";
						id = Id_setUTCMinutes;
					} else if (c == 'S') {
						X = "setUTCSeconds";
						id = Id_setUTCSeconds;
					}
				}
				break L;
			case 14:
				c = s.charAt(0);
				if (c == 'g') {
					X = "getUTCFullYear";
					id = Id_getUTCFullYear;
				} else if (c == 's') {
					X = "setUTCFullYear";
					id = Id_setUTCFullYear;
				} else if (c == 't') {
					X = "toLocaleString";
					id = Id_toLocaleString;
				}
				break L;
			case 15:
				c = s.charAt(0);
				if (c == 'g') {
					X = "getMilliseconds";
					id = Id_getMilliseconds;
				} else if (c == 's') {
					X = "setMilliseconds";
					id = Id_setMilliseconds;
				}
				break L;
			case 17:
				X = "getTimezoneOffset";
				id = Id_getTimezoneOffset;
				break L;
			case 18:
				c = s.charAt(0);
				if (c == 'g') {
					X = "getUTCMilliseconds";
					id = Id_getUTCMilliseconds;
				} else if (c == 's') {
					X = "setUTCMilliseconds";
					id = Id_setUTCMilliseconds;
				} else if (c == 't') {
					c = s.charAt(8);
					if (c == 'D') {
						X = "toLocaleDateString";
						id = Id_toLocaleDateString;
					} else if (c == 'T') {
						X = "toLocaleTimeString";
						id = Id_toLocaleTimeString;
					}
				}
				break L;
			}
			if (X != null && X != s && !X.equals(s))
				id = 0;
			break L0;
		}
		// #/generated#
		return id;
	}

	/**
	 * @see org.mozilla.javascript.Wrapper#unwrap()
	 */
	public Object unwrap() {
		if (javaDate == null) {
			javaDate = new Date((long) this.date);
		}
		return javaDate;
	}

	private static final int ConstructorId_now = -3, ConstructorId_parse = -2,
			ConstructorId_UTC = -1,

			Id_constructor = 1, Id_toString = 2, Id_toTimeString = 3,
			Id_toDateString = 4, Id_toLocaleString = 5,
			Id_toLocaleTimeString = 6, Id_toLocaleDateString = 7,
			Id_toUTCString = 8, Id_toSource = 9, Id_valueOf = 10,
			Id_getTime = 11, Id_getYear = 12, Id_getFullYear = 13,
			Id_getUTCFullYear = 14, Id_getMonth = 15, Id_getUTCMonth = 16,
			Id_getDate = 17, Id_getUTCDate = 18, Id_getDay = 19,
			Id_getUTCDay = 20, Id_getHours = 21, Id_getUTCHours = 22,
			Id_getMinutes = 23, Id_getUTCMinutes = 24, Id_getSeconds = 25,
			Id_getUTCSeconds = 26, Id_getMilliseconds = 27,
			Id_getUTCMilliseconds = 28, Id_getTimezoneOffset = 29,
			Id_setTime = 30, Id_setMilliseconds = 31,
			Id_setUTCMilliseconds = 32, Id_setSeconds = 33,
			Id_setUTCSeconds = 34, Id_setMinutes = 35, Id_setUTCMinutes = 36,
			Id_setHours = 37, Id_setUTCHours = 38, Id_setDate = 39,
			Id_setUTCDate = 40, Id_setMonth = 41, Id_setUTCMonth = 42,
			Id_setFullYear = 43, Id_setUTCFullYear = 44, Id_setYear = 45,

			MAX_PROTOTYPE_ID = 45;

	private static final int Id_toGMTString = Id_toUTCString; // Alias, see
	// Ecma
	// B.2.6
	// #/string_id_map#

	/* cached values */
	private static java.util.TimeZone thisTimeZone;

	private static double LocalTZA;

	private static java.text.DateFormat timeZoneFormatter;

	private static java.text.DateFormat localeDateTimeFormatter;

	private static java.text.DateFormat localeDateFormatter;

	private static java.text.DateFormat localeTimeFormatter;

	private double date;

	private Date javaDate;
}

final class NativeNumber extends IdScriptableObject {
	static final long serialVersionUID = 3504516769741512101L;

	private static final Object NUMBER_TAG = new Object();

	private static final int MAX_PRECISION = 100;

	static NativeNumber init(Scriptable scope, boolean sealed) {
		NativeNumber obj = new NativeNumber(0.0);
		obj.exportAsJSClass(MAX_PROTOTYPE_ID, scope, sealed);
		return obj;
	}

	public NativeNumber(double number) {
		doubleValue = number;
	}

	public String getClassName() {
		return "Number";
	}

	protected void fillConstructorProperties(IdFunctionObject ctor) {
		final int attr = ScriptableObject.DONTENUM | ScriptableObject.PERMANENT
				| ScriptableObject.READONLY;

		ctor.defineProperty("NaN", ScriptRuntime.NaNobj, attr);
		ctor.defineProperty("POSITIVE_INFINITY", ScriptRuntime
				.wrapNumber(Double.POSITIVE_INFINITY), attr);
		ctor.defineProperty("NEGATIVE_INFINITY", ScriptRuntime
				.wrapNumber(Double.NEGATIVE_INFINITY), attr);
		ctor.defineProperty("MAX_VALUE", ScriptRuntime
				.wrapNumber(Double.MAX_VALUE), attr);
		ctor.defineProperty("MIN_VALUE", ScriptRuntime
				.wrapNumber(Double.MIN_VALUE), attr);

		super.fillConstructorProperties(ctor);
	}

	protected void initPrototypeId(int id) {
		String s;
		int arity;
		switch (id) {
		case Id_constructor:
			arity = 1;
			s = "constructor";
			break;
		case Id_toString:
			arity = 1;
			s = "toString";
			break;
		case Id_toLocaleString:
			arity = 1;
			s = "toLocaleString";
			break;
		case Id_toSource:
			arity = 0;
			s = "toSource";
			break;
		case Id_valueOf:
			arity = 0;
			s = "valueOf";
			break;
		case Id_toFixed:
			arity = 1;
			s = "toFixed";
			break;
		case Id_toExponential:
			arity = 1;
			s = "toExponential";
			break;
		case Id_toPrecision:
			arity = 1;
			s = "toPrecision";
			break;
		default:
			throw new IllegalArgumentException(String.valueOf(id));
		}
		initPrototypeMethod(NUMBER_TAG, id, s, arity);
	}

	public Object execIdCall(IdFunctionObject f, Context cx, Scriptable scope,
			Scriptable thisObj, Object[] args) {
		if (!f.hasTag(NUMBER_TAG)) {
			return super.execIdCall(f, cx, scope, thisObj, args);
		}
		int id = f.methodId();
		if (id == Id_constructor) {
			double val = (args.length >= 1) ? ScriptRuntime.toNumber(args[0])
					: 0.0;
			if (thisObj == null) {
				// new Number(val) creates a new Number object.
				return new NativeNumber(val);
			}
			// Number(val) converts val to a number value.
			return ScriptRuntime.wrapNumber(val);
		}

		// The rest of Number.prototype methods require thisObj to be Number

		if (!(thisObj instanceof NativeNumber))
			throw incompatibleCallError(f);
		double value = ((NativeNumber) thisObj).doubleValue;

		switch (id) {

		case Id_toString:
		case Id_toLocaleString: {
			// toLocaleString is just an alias for toString for now
			int base = (args.length == 0) ? 10 : ScriptRuntime.toInt32(args[0]);
			return ScriptRuntime.numberToString(value, base);
		}

		case Id_toSource:
			return "(new Number(" + ScriptRuntime.toString(value) + "))";

		case Id_valueOf:
			return ScriptRuntime.wrapNumber(value);

		default:
			throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	public String toString() {
		return ScriptRuntime.numberToString(doubleValue, 10);
	}

	private static String num_to(double val, Object[] args, int zeroArgMode,
			int oneArgMode, int precisionMin, int precisionOffset) {
		int precision;
		if (args.length == 0) {
			precision = 0;
			oneArgMode = zeroArgMode;
		} else {
			/*
			 * We allow a larger range of precision than ECMA requires; this is
			 * permitted by ECMA.
			 */
			precision = ScriptRuntime.toInt32(args[0]);
			if (precision < precisionMin || precision > MAX_PRECISION) {
				String msg = ScriptRuntime.getMessage1("msg.bad.precision",
						ScriptRuntime.toString(args[0]));
				throw ScriptRuntime.constructError("RangeError", msg);
			}
		}
		StringBuffer sb = new StringBuffer();
		return sb.toString();
	}

	// #string_id_map#

	protected int findPrototypeId(String s) {
		int id;
		// #generated# Last update: 2007-05-09 08:15:50 EDT
		L0: {
			id = 0;
			String X = null;
			int c;
			L: switch (s.length()) {
			case 7:
				c = s.charAt(0);
				if (c == 't') {
					X = "toFixed";
					id = Id_toFixed;
				} else if (c == 'v') {
					X = "valueOf";
					id = Id_valueOf;
				}
				break L;
			case 8:
				c = s.charAt(3);
				if (c == 'o') {
					X = "toSource";
					id = Id_toSource;
				} else if (c == 't') {
					X = "toString";
					id = Id_toString;
				}
				break L;
			case 11:
				c = s.charAt(0);
				if (c == 'c') {
					X = "constructor";
					id = Id_constructor;
				} else if (c == 't') {
					X = "toPrecision";
					id = Id_toPrecision;
				}
				break L;
			case 13:
				X = "toExponential";
				id = Id_toExponential;
				break L;
			case 14:
				X = "toLocaleString";
				id = Id_toLocaleString;
				break L;
			}
			if (X != null && X != s && !X.equals(s))
				id = 0;
			break L0;
		}
		// #/generated#
		return id;
	}

	private static final int Id_constructor = 1, Id_toString = 2,
			Id_toLocaleString = 3, Id_toSource = 4, Id_valueOf = 5,
			Id_toFixed = 6, Id_toExponential = 7, Id_toPrecision = 8,
			MAX_PROTOTYPE_ID = 8;

	// #/string_id_map#

	private double doubleValue;
}

class NativeArray extends IdScriptableObject implements Wrapper {
	static NativeArray prototype;

	static final long serialVersionUID = 7331366857676127338L;

	/*
	 * Optimization possibilities and open issues: - Long vs. double
	 * schizophrenia. I suspect it might be better to use double throughout. -
	 * Most array operations go through getElem or setElem (defined in this
	 * file) to handle the full 2^32 range; it might be faster to have versions
	 * of most of the loops in this file for the (infinitely more common) case
	 * of indices < 2^31. - Functions that need a new Array call "new Array" in
	 * the current scope rather than using a hardwired constructor; "Array"
	 * could be redefined. It turns out that js calls the equivalent of "new
	 * Array" in the current scope, except that it always gets at least an
	 * object back, even when Array == null.
	 */

	private static final Object ARRAY_TAG = new Object();

	private static final Integer NEGATIVE_ONE = new Integer(-1);

	static NativeArray init(Scriptable scope, boolean sealed) {
		prototype = new NativeArray();
		prototype.exportAsJSClass(MAX_PROTOTYPE_ID, scope, sealed);
		return prototype;
	}

	/**
	 * Zero-parameter constructor: just used to create Array.prototype
	 */
	public NativeArray() {
		dense = null;
		this.length = 0;
	}

	public NativeArray(long length) {
		int intLength = (int) length;
		if (intLength == length && intLength > 0) {
			if (intLength > maximumDenseLength)
				intLength = maximumDenseLength;
			dense = new Object[intLength];
			for (int i = 0; i < intLength; i++)
				dense[i] = NOT_FOUND;
		}
		this.length = length;
	}

	public NativeArray(Object[] array) {
		dense = array;
		this.length = array.length;
	}

	public String getClassName() {
		return "Array";
	}

	private static final int Id_length = 1, MAX_INSTANCE_ID = 1;

	protected int getMaxInstanceId() {
		return MAX_INSTANCE_ID;
	}

	protected int findInstanceIdInfo(String s) {
		if (s.equals("length")) {
			return instanceIdInfo(DONTENUM | PERMANENT, Id_length);
		}
		return super.findInstanceIdInfo(s);
	}

	protected String getInstanceIdName(int id) {
		if (id == Id_length) {
			return "length";
		}
		return super.getInstanceIdName(id);
	}

	protected Object getInstanceIdValue(int id) {
		if (id == Id_length) {
			return ScriptRuntime.wrapNumber(length);
		}
		return super.getInstanceIdValue(id);
	}

	protected void setInstanceIdValue(int id, Object value) {
		if (id == Id_length) {
			setLength(value);
			return;
		}
		super.setInstanceIdValue(id, value);
	}

	protected void initPrototypeId(int id) {
		String s;
		int arity;
		switch (id) {
		case Id_constructor:
			arity = 1;
			s = "constructor";
			break;
		case Id_toString:
			arity = 0;
			s = "toString";
			break;
		case Id_toLocaleString:
			arity = 1;
			s = "toLocaleString";
			break;
		case Id_toSource:
			arity = 0;
			s = "toSource";
			break;
		case Id_join:
			arity = 1;
			s = "join";
			break;
		case Id_reverse:
			arity = 0;
			s = "reverse";
			break;
		case Id_sort:
			arity = 1;
			s = "sort";
			break;
		case Id_push:
			arity = 1;
			s = "push";
			break;
		case Id_pop:
			arity = 1;
			s = "pop";
			break;
		case Id_shift:
			arity = 1;
			s = "shift";
			break;
		case Id_unshift:
			arity = 1;
			s = "unshift";
			break;
		case Id_splice:
			arity = 1;
			s = "splice";
			break;
		case Id_concat:
			arity = 1;
			s = "concat";
			break;
		case Id_slice:
			arity = 1;
			s = "slice";
			break;
		case Id_indexOf:
			arity = 1;
			s = "indexOf";
			break;
		case Id_lastIndexOf:
			arity = 1;
			s = "lastIndexOf";
			break;
		case Id_every:
			arity = 1;
			s = "every";
			break;
		case Id_filter:
			arity = 1;
			s = "filter";
			break;
		case Id_forEach:
			arity = 1;
			s = "forEach";
			break;
		case Id_map:
			arity = 1;
			s = "map";
			break;
		case Id_some:
			arity = 1;
			s = "some";
			break;
		default:
			throw new IllegalArgumentException(String.valueOf(id));
		}
		initPrototypeMethod(ARRAY_TAG, id, s, arity);
	}

	public Object execIdCall(IdFunctionObject f, Context cx, Scriptable scope,
			Scriptable thisObj, Object[] args) {
		if (!f.hasTag(ARRAY_TAG)) {
			return super.execIdCall(f, cx, scope, thisObj, args);
		}
		int id = f.methodId();
		switch (id) {
		case Id_constructor: {
			boolean inNewExpr = (thisObj == null);
			if (!inNewExpr) {
				// IdFunctionObject.construct will set up parent, proto
				return f.construct(cx, scope, args);
			}
			return jsConstructor(cx, scope, args);
		}

		case Id_join:
			return js_join(cx, thisObj, args);

		case Id_reverse:
			return js_reverse(cx, thisObj, args);

		case Id_sort:
			return js_sort(cx, scope, thisObj, args);

		case Id_push:
			return js_push(cx, thisObj, args);

		case Id_pop:
			return js_pop(cx, thisObj, args);

		case Id_shift:
			return js_shift(cx, thisObj, args);

		case Id_unshift:
			return js_unshift(cx, thisObj, args);

		case Id_splice:
			return js_splice(cx, scope, thisObj, args);

		case Id_concat:
			return js_concat(cx, scope, thisObj, args);

		case Id_slice:
			return js_slice(cx, thisObj, args);

		case Id_indexOf:
			return indexOfHelper(cx, thisObj, args, false);

		case Id_lastIndexOf:
			return indexOfHelper(cx, thisObj, args, true);

		case Id_every:
		case Id_filter:
		case Id_forEach:
		case Id_map:
		case Id_some:
			return iterativeMethod(cx, id, scope, thisObj, args);
		}
		throw new IllegalArgumentException(String.valueOf(id));
	}

	public Object get(int index, Scriptable start) {
		if (dense != null && 0 <= index && index < dense.length)
			return dense[index];
		return super.get(index, start);
	}

	public boolean has(int index, Scriptable start) {
		if (dense != null && 0 <= index && index < dense.length)
			return dense[index] != NOT_FOUND;
		return super.has(index, start);
	}

	// if id is an array index (ECMA 15.4.0), return the number,
	// otherwise return -1L
	private static long toArrayIndex(String id) {
		double d = ScriptRuntime.toNumber(id);
		if (d == d) {
			long index = ScriptRuntime.toUint32(d);
			if (index == d && index != 4294967295L) {
				// Assume that ScriptRuntime.toString(index) is the same
				// as java.lang.Long.toString(index) for long
				if (Long.toString(index).equals(id)) {
					return index;
				}
			}
		}
		return -1;
	}

	public void put(String id, Scriptable start, Object value) {
		super.put(id, start, value);
		if (start == this) {
			// If the object is sealed, super will throw exception
			long index = toArrayIndex(id);
			if (index >= length) {
				length = index + 1;
			}
		}
	}

	public void put(int index, Scriptable start, Object value) {
		if (start == this && !isSealed() && dense != null && 0 <= index
				&& index < dense.length) {
			// If start == this && sealed, super will throw exception
			dense[index] = value;
		} else {
			super.put(index, start, value);
		}
		if (start == this) {
			// only set the array length if given an array index (ECMA 15.4.0)
			if (this.length <= index) {
				// avoid overflowing index!
				this.length = (long) index + 1;
			}
		}

	}

	public void delete(int index) {
		if (!isSealed() && dense != null && 0 <= index && index < dense.length) {
			dense[index] = NOT_FOUND;
		} else {
			super.delete(index);
		}
	}

	public Object[] getIds() {
		Object[] superIds = super.getIds();
		if (dense == null) {
			return superIds;
		}
		int N = dense.length;
		long currentLength = length;
		if (N > currentLength) {
			N = (int) currentLength;
		}
		if (N == 0) {
			return superIds;
		}
		int superLength = superIds.length;
		Object[] ids = new Object[N + superLength];
		// Make a copy of dense to be immune to removing
		// of array elems from other thread when calculating presentCount
		System.arraycopy(dense, 0, ids, 0, N);
		int presentCount = 0;
		for (int i = 0; i != N; ++i) {
			// Replace existing elements by their indexes
			if (ids[i] != NOT_FOUND) {
				ids[presentCount] = new Integer(i);
				++presentCount;
			}
		}
		if (presentCount != N) {
			// dense contains deleted elems, need to shrink the result
			Object[] tmp = new Object[presentCount + superLength];
			System.arraycopy(ids, 0, tmp, 0, presentCount);
			ids = tmp;
		}
		System.arraycopy(superIds, 0, ids, presentCount, superLength);
		return ids;
	}

	public Object getDefaultValue(Class hint) {
		if (hint == ScriptRuntime.NumberClass) {
			Context cx = Context.getCurrentContext();
			if (cx.getLanguageVersion() == Context.VERSION_1_2)
				return new Long(length);
		}
		return super.getDefaultValue(hint);
	}

	/**
	 * See ECMA 15.4.1,2
	 */
	private static Object jsConstructor(Context cx, Scriptable scope,
			Object[] args) {
		if (args.length == 0)
			return new NativeArray();

		// Only use 1 arg as first element for version 1.2; for
		// any other version (including 1.3) follow ECMA and use it as
		// a length.
		if (cx.getLanguageVersion() == Context.VERSION_1_2) {
			return new NativeArray(args);
		} else {
			Object arg0 = args[0];
			if (args.length > 1 || !(arg0 instanceof Number)) {
				return new NativeArray(args);
			} else {
				long len = ScriptRuntime.toUint32(arg0);
				return new NativeArray(len);
			}
		}
	}

	public long getLength() {
		return length;
	}

	/** @deprecated Use {@link #getLength()} instead. */
	public long jsGet_length() {
		return getLength();
	}

	private void setLength(Object val) {
		/*
		 * XXX do we satisfy this? 15.4.5.1 [[Put]](P, V): 1. Call the
		 * [[CanPut]] method of A with name P. 2. If Result(1) is false, return. ?
		 */

		double d = ScriptRuntime.toNumber(val);
		long longVal = ScriptRuntime.toUint32(d);

		if (longVal < length) {
			// remove all properties between longVal and length
			if (length - longVal > 0x1000) {
				// assume that the representation is sparse
				Object[] e = getIds(); // will only find in object itself
				for (int i = 0; i < e.length; i++) {
					Object id = e[i];
					if (id instanceof String) {
						// > MAXINT will appear as string
						String strId = (String) id;
						long index = toArrayIndex(strId);
						if (index >= longVal)
							delete(strId);
					} else {
						int index = ((Integer) id).intValue();
						if (index >= longVal)
							delete(index);
					}
				}
			} else {
				// assume a dense representation
				for (long i = longVal; i < length; i++) {
					deleteElem(this, i);
				}
			}
		}
		length = longVal;
	}

	/*
	 * Support for generic Array-ish objects. Most of the Array functions try to
	 * be generic; anything that has a length property is assumed to be an
	 * array. getLengthProperty returns 0 if obj does not have the length
	 * property or its value is not convertible to a number.
	 */
	static long getLengthProperty(Context cx, Scriptable obj) {
		// These will both give numeric lengths within Uint32 range.
		if (obj instanceof NativeString) {
			return ((NativeString) obj).getLength();
		} else if (obj instanceof NativeArray) {
			return ((NativeArray) obj).getLength();
		}
		return ScriptRuntime.toUint32(ScriptRuntime.getObjectProp(obj,
				"length", cx));
	}

	private static Object setLengthProperty(Context cx, Scriptable target,
			long length) {
		return ScriptRuntime.setObjectProp(target, "length", ScriptRuntime
				.wrapNumber(length), cx);
	}

	/*
	 * Utility functions to encapsulate index > Integer.MAX_VALUE handling. Also
	 * avoids unnecessary object creation that would be necessary to use the
	 * general ScriptRuntime.get/setElem functions... though this is probably
	 * premature optimization.
	 */
	private static void deleteElem(Scriptable target, long index) {
		int i = (int) index;
		if (i == index) {
			target.delete(i);
		} else {
			target.delete(Long.toString(index));
		}
	}

	private static Object getElem(Context cx, Scriptable target, long index) {
		if (index > Integer.MAX_VALUE) {
			String id = Long.toString(index);
			return ScriptRuntime.getObjectProp(target, id, cx);
		} else {
			return ScriptRuntime.getObjectIndex(target, (int) index, cx);
		}
	}

	private static void setElem(Context cx, Scriptable target, long index,
			Object value) {
		if (index > Integer.MAX_VALUE) {
			String id = Long.toString(index);
			ScriptRuntime.setObjectProp(target, id, value, cx);
		} else {
			ScriptRuntime.setObjectIndex(target, (int) index, value, cx);
		}
	}

	/**
	 * See ECMA 15.4.4.3
	 */
	private static String js_join(Context cx, Scriptable thisObj, Object[] args) {
		String separator;

		long llength = getLengthProperty(cx, thisObj);
		int length = (int) llength;
		// if no args, use "," as separator
		if (args.length < 1 || args[0] == Undefined.instance) {
			separator = ",";
		} else {
			separator = ScriptRuntime.toString(args[0]);
		}
		if (length == 0) {
			return "";
		}
		String[] buf = new String[length];
		int total_size = 0;
		for (int i = 0; i != length; i++) {
			Object temp = getElem(cx, thisObj, i);
			if (temp != null && temp != Undefined.instance) {
				String str = ScriptRuntime.toString(temp);
				total_size += str.length();
				buf[i] = str;
			}
		}
		total_size += (length - 1) * separator.length();
		StringBuffer sb = new StringBuffer(total_size);
		for (int i = 0; i != length; i++) {
			if (i != 0) {
				sb.append(separator);
			}
			String str = buf[i];
			if (str != null) {
				// str == null for undefined or null
				sb.append(str);
			}
		}
		return sb.toString();
	}

	/**
	 * See ECMA 15.4.4.4
	 */
	private static Scriptable js_reverse(Context cx, Scriptable thisObj,
			Object[] args) {
		long len = getLengthProperty(cx, thisObj);

		long half = len / 2;
		for (long i = 0; i < half; i++) {
			long j = len - i - 1;
			Object temp1 = getElem(cx, thisObj, i);
			Object temp2 = getElem(cx, thisObj, j);
			setElem(cx, thisObj, i, temp2);
			setElem(cx, thisObj, j, temp1);
		}
		return thisObj;
	}

	/**
	 * See ECMA 15.4.4.5
	 */
	private static Scriptable js_sort(Context cx, Scriptable scope,
			Scriptable thisObj, Object[] args) {
		long length = getLengthProperty(cx, thisObj);

		if (length <= 1) {
			return thisObj;
		}

		Object compare;
		Object[] cmpBuf;

		if (args.length > 0 && Undefined.instance != args[0]) {
			// sort with given compare function
			compare = args[0];
			cmpBuf = new Object[2]; // Buffer for cmp arguments
		} else {
			// sort with default compare
			compare = null;
			cmpBuf = null;
		}

		// Should we use the extended sort function, or the faster one?
		if (length >= Integer.MAX_VALUE) {
			heapsort_extended(cx, scope, thisObj, length, compare, cmpBuf);
		} else {
			int ilength = (int) length;
			// copy the JS array into a working array, so it can be
			// sorted cheaply.
			Object[] working = new Object[ilength];
			for (int i = 0; i != ilength; ++i) {
				working[i] = getElem(cx, thisObj, i);
			}

			heapsort(cx, scope, working, ilength, compare, cmpBuf);

			// copy the working array back into thisObj
			for (int i = 0; i != ilength; ++i) {
				setElem(cx, thisObj, i, working[i]);
			}
		}
		return thisObj;
	}

	// Return true only if x > y
	private static boolean isBigger(Context cx, Scriptable scope, Object x,
			Object y, Object cmp, Object[] cmpBuf) {
		if (cmp == null) {
			if (cmpBuf != null)
				Kit.codeBug();
		} else {
			if (cmpBuf == null || cmpBuf.length != 2)
				Kit.codeBug();
		}

		Object undef = Undefined.instance;

		// sort undefined to end
		if (undef == y) {
			return false; // x can not be bigger then undef
		} else if (undef == x) {
			return true; // y != undef here, so x > y
		}

		if (cmp == null) {
			// if no cmp function supplied, sort lexicographically
			String a = ScriptRuntime.toString(x);
			String b = ScriptRuntime.toString(y);
			return a.compareTo(b) > 0;
		} else {
			// assemble args and call supplied JS cmp function
			cmpBuf[0] = x;
			cmpBuf[1] = y;
			Callable fun = ScriptRuntime.getValueFunctionAndThis(cmp, cx);
			Scriptable funThis = ScriptRuntime.lastStoredScriptable(cx);

			Object ret = fun.call(cx, scope, funThis, cmpBuf);
			double d = ScriptRuntime.toNumber(ret);

			// XXX what to do when cmp function returns NaN? ECMA states
			// that it's then not a 'consistent compararison function'... but
			// then what do we do? Back out and start over with the generic
			// cmp function when we see a NaN? Throw an error?

			// for now, just ignore it:

			return d > 0;
		}
	}

	/**
	 * Heapsort implementation. See "Introduction to Algorithms" by Cormen,
	 * Leiserson, Rivest for details. Adjusted for zero based indexes.
	 */
	private static void heapsort(Context cx, Scriptable scope, Object[] array,
			int length, Object cmp, Object[] cmpBuf) {
		if (length <= 1)
			Kit.codeBug();

		// Build heap
		for (int i = length / 2; i != 0;) {
			--i;
			Object pivot = array[i];
			heapify(cx, scope, pivot, array, i, length, cmp, cmpBuf);
		}

		// Sort heap
		for (int i = length; i != 1;) {
			--i;
			Object pivot = array[i];
			array[i] = array[0];
			heapify(cx, scope, pivot, array, 0, i, cmp, cmpBuf);
		}
	}

	/**
	 * pivot and child heaps of i should be made into heap starting at i,
	 * original array[i] is never used to have less array access during sorting.
	 */
	private static void heapify(Context cx, Scriptable scope, Object pivot,
			Object[] array, int i, int end, Object cmp, Object[] cmpBuf) {
		for (;;) {
			int child = i * 2 + 1;
			if (child >= end) {
				break;
			}
			Object childVal = array[child];
			if (child + 1 < end) {
				Object nextVal = array[child + 1];
				if (isBigger(cx, scope, nextVal, childVal, cmp, cmpBuf)) {
					++child;
					childVal = nextVal;
				}
			}
			if (!isBigger(cx, scope, childVal, pivot, cmp, cmpBuf)) {
				break;
			}
			array[i] = childVal;
			i = child;
		}
		array[i] = pivot;
	}

	/**
	 * Version of heapsort that call getElem/setElem on target to query/assign
	 * array elements instead of Java array access
	 */
	private static void heapsort_extended(Context cx, Scriptable scope,
			Scriptable target, long length, Object cmp, Object[] cmpBuf) {
		if (length <= 1)
			Kit.codeBug();

		// Build heap
		for (long i = length / 2; i != 0;) {
			--i;
			Object pivot = getElem(cx, target, i);
			heapify_extended(cx, scope, pivot, target, i, length, cmp, cmpBuf);
		}

		// Sort heap
		for (long i = length; i != 1;) {
			--i;
			Object pivot = getElem(cx, target, i);
			setElem(cx, target, i, getElem(cx, target, 0));
			heapify_extended(cx, scope, pivot, target, 0, i, cmp, cmpBuf);
		}
	}

	private static void heapify_extended(Context cx, Scriptable scope,
			Object pivot, Scriptable target, long i, long end, Object cmp,
			Object[] cmpBuf) {
		for (;;) {
			long child = i * 2 + 1;
			if (child >= end) {
				break;
			}
			Object childVal = getElem(cx, target, child);
			if (child + 1 < end) {
				Object nextVal = getElem(cx, target, child + 1);
				if (isBigger(cx, scope, nextVal, childVal, cmp, cmpBuf)) {
					++child;
					childVal = nextVal;
				}
			}
			if (!isBigger(cx, scope, childVal, pivot, cmp, cmpBuf)) {
				break;
			}
			setElem(cx, target, i, childVal);
			i = child;
		}
		setElem(cx, target, i, pivot);
	}

	/**
	 * Non-ECMA methods.
	 */

	private static Object js_push(Context cx, Scriptable thisObj, Object[] args) {
		long length = getLengthProperty(cx, thisObj);
		for (int i = 0; i < args.length; i++) {
			setElem(cx, thisObj, length + i, args[i]);
		}

		length += args.length;
		Object lengthObj = setLengthProperty(cx, thisObj, length);

		/*
		 * If JS1.2, follow Perl4 by returning the last thing pushed. Otherwise,
		 * return the new array length.
		 */
		if (cx.getLanguageVersion() == Context.VERSION_1_2)
			// if JS1.2 && no arguments, return undefined.
			return args.length == 0 ? Undefined.instance
					: args[args.length - 1];

		else
			return lengthObj;
	}

	private static Object js_pop(Context cx, Scriptable thisObj, Object[] args) {
		Object result;
		long length = getLengthProperty(cx, thisObj);
		if (length > 0) {
			length--;

			// Get the to-be-deleted property's value.
			result = getElem(cx, thisObj, length);

			// We don't need to delete the last property, because
			// setLength does that for us.
		} else {
			result = Undefined.instance;
		}
		// necessary to match js even when length < 0; js pop will give a
		// length property to any target it is called on.
		setLengthProperty(cx, thisObj, length);

		return result;
	}

	private static Object js_shift(Context cx, Scriptable thisObj, Object[] args) {
		Object result;
		long length = getLengthProperty(cx, thisObj);
		if (length > 0) {
			long i = 0;
			length--;

			// Get the to-be-deleted property's value.
			result = getElem(cx, thisObj, i);

			/*
			 * Slide down the array above the first element. Leave i set to
			 * point to the last element.
			 */
			if (length > 0) {
				for (i = 1; i <= length; i++) {
					Object temp = getElem(cx, thisObj, i);
					setElem(cx, thisObj, i - 1, temp);
				}
			}
			// We don't need to delete the last property, because
			// setLength does that for us.
		} else {
			result = Undefined.instance;
		}
		setLengthProperty(cx, thisObj, length);
		return result;
	}

	private static Object js_unshift(Context cx, Scriptable thisObj,
			Object[] args) {
		long length = getLengthProperty(cx, thisObj);
		int argc = args.length;

		if (args.length > 0) {
			/* Slide up the array to make room for args at the bottom */
			if (length > 0) {
				for (long last = length - 1; last >= 0; last--) {
					Object temp = getElem(cx, thisObj, last);
					setElem(cx, thisObj, last + argc, temp);
				}
			}

			/* Copy from argv to the bottom of the array. */
			for (int i = 0; i < args.length; i++) {
				setElem(cx, thisObj, i, args[i]);
			}

			/* Follow Perl by returning the new array length. */
			length += args.length;
			return setLengthProperty(cx, thisObj, length);
		}
		return ScriptRuntime.wrapNumber(length);
	}

	private static Object js_splice(Context cx, Scriptable scope,
			Scriptable thisObj, Object[] args) {
		/* create an empty Array to return. */
		scope = getTopLevelScope(scope);
		Object result = ScriptRuntime.newObject(cx, scope, "Array", null);
		int argc = args.length;
		if (argc == 0)
			return result;
		long length = getLengthProperty(cx, thisObj);

		/* Convert the first argument into a starting index. */
		long begin = toSliceIndex(ScriptRuntime.toInteger(args[0]), length);
		argc--;

		/* Convert the second argument into count */
		long count;
		if (args.length == 1) {
			count = length - begin;
		} else {
			double dcount = ScriptRuntime.toInteger(args[1]);
			if (dcount < 0) {
				count = 0;
			} else if (dcount > (length - begin)) {
				count = length - begin;
			} else {
				count = (long) dcount;
			}
			argc--;
		}

		long end = begin + count;

		/* If there are elements to remove, put them into the return value. */
		if (count != 0) {
			if (count == 1 && (cx.getLanguageVersion() == Context.VERSION_1_2)) {
				/*
				 * JS lacks "list context", whereby in Perl one turns the single
				 * scalar that's spliced out into an array just by assigning it
				 * to @single instead of $single, or by using it as Perl push's
				 * first argument, for instance. JS1.2 emulated Perl too closely
				 * and returned a non-Array for the single-splice-out case,
				 * requiring callers to test and wrap in [] if necessary. So
				 * JS1.3, default, and other versions all return an array of
				 * length 1 for uniformity.
				 */
				result = getElem(cx, thisObj, begin);
			} else {
				for (long last = begin; last != end; last++) {
					Scriptable resultArray = (Scriptable) result;
					Object temp = getElem(cx, thisObj, last);
					setElem(cx, resultArray, last - begin, temp);
				}
			}
		} else if (count == 0 && cx.getLanguageVersion() == Context.VERSION_1_2) {
			/* Emulate C JS1.2; if no elements are removed, return undefined. */
			result = Undefined.instance;
		}

		/* Find the direction (up or down) to copy and make way for argv. */
		long delta = argc - count;

		if (delta > 0) {
			for (long last = length - 1; last >= end; last--) {
				Object temp = getElem(cx, thisObj, last);
				setElem(cx, thisObj, last + delta, temp);
			}
		} else if (delta < 0) {
			for (long last = end; last < length; last++) {
				Object temp = getElem(cx, thisObj, last);
				setElem(cx, thisObj, last + delta, temp);
			}
		}

		/* Copy from argv into the hole to complete the splice. */
		int argoffset = args.length - argc;
		for (int i = 0; i < argc; i++) {
			setElem(cx, thisObj, begin + i, args[i + argoffset]);
		}

		/* Update length in case we deleted elements from the end. */
		setLengthProperty(cx, thisObj, length + delta);
		return result;
	}

	/*
	 * See Ecma 262v3 15.4.4.4
	 */
	private static Scriptable js_concat(Context cx, Scriptable scope,
			Scriptable thisObj, Object[] args) {
		// create an empty Array to return.
		scope = getTopLevelScope(scope);
		Function ctor = null;
		Scriptable result = null;
		long length;
		long slot = 0;

		/*
		 * Put the target in the result array; only add it as an array if it
		 * looks like one.
		 */
		if (ScriptRuntime.instanceOf(thisObj, ctor, cx)) {
			length = getLengthProperty(cx, thisObj);

			// Copy from the target object into the result
			for (slot = 0; slot < length; slot++) {
				Object temp = getElem(cx, thisObj, slot);
				setElem(cx, result, slot, temp);
			}
		} else {
			setElem(cx, result, slot++, thisObj);
		}

		/*
		 * Copy from the arguments into the result. If any argument has a
		 * numeric length property, treat it as an array and add elements
		 * separately; otherwise, just copy the argument.
		 */
		for (int i = 0; i < args.length; i++) {
			if (ScriptRuntime.instanceOf(args[i], ctor, cx)) {
				// ScriptRuntime.instanceOf => instanceof Scriptable
				Scriptable arg = (Scriptable) args[i];
				length = getLengthProperty(cx, arg);
				for (long j = 0; j < length; j++, slot++) {
					Object temp = getElem(cx, arg, j);
					setElem(cx, result, slot, temp);
				}
			} else {
				setElem(cx, result, slot++, args[i]);
			}
		}
		return result;
	}

	private Scriptable js_slice(Context cx, Scriptable thisObj, Object[] args) {
		Scriptable scope = getTopLevelScope(this);
		Scriptable result = ScriptRuntime.newObject(cx, scope, "Array", null);
		long length = getLengthProperty(cx, thisObj);

		long begin, end;
		if (args.length == 0) {
			begin = 0;
			end = length;
		} else {
			begin = toSliceIndex(ScriptRuntime.toInteger(args[0]), length);
			if (args.length == 1) {
				end = length;
			} else {
				end = toSliceIndex(ScriptRuntime.toInteger(args[1]), length);
			}
		}

		for (long slot = begin; slot < end; slot++) {
			Object temp = getElem(cx, thisObj, slot);
			setElem(cx, result, slot - begin, temp);
		}

		return result;
	}

	private static long toSliceIndex(double value, long length) {
		long result;
		if (value < 0.0) {
			if (value + length < 0.0) {
				result = 0;
			} else {
				result = (long) (value + length);
			}
		} else if (value > length) {
			result = length;
		} else {
			result = (long) value;
		}
		return result;
	}

	/**
	 * Implements the methods "indexOf" and "lastIndexOf".
	 */
	private Object indexOfHelper(Context cx, Scriptable thisObj, Object[] args,
			boolean isLast) {
		Object compareTo = args.length > 0 ? args[0] : Undefined.instance;
		long length = getLengthProperty(cx, thisObj);
		long start = args.length > 1 ? ScriptRuntime.toInt32(ScriptRuntime
				.toNumber(args[1])) : (isLast ? length : 0);
		if (start < 0) {
			start += length;
			if (start < 0)
				start = 0;
		}
		if (isLast) {
			for (long i = start; i >= 0; i--) {
				if (ScriptRuntime.shallowEq(getElem(cx, thisObj, i), compareTo)) {
					return new Long(i);
				}
			}
		} else {
			for (long i = start; i < length; i++) {
				if (ScriptRuntime.shallowEq(getElem(cx, thisObj, i), compareTo)) {
					return new Long(i);
				}
			}
		}
		return NEGATIVE_ONE;
	}

	/**
	 * Implements the methods "every", "filter", "forEach", "map", and "some".
	 */
	private Object iterativeMethod(Context cx, int id, Scriptable scope,
			Scriptable thisObj, Object[] args) {
		Object callbackArg = args.length > 0 ? args[0] : Undefined.instance;
		if (callbackArg == null || !(callbackArg instanceof Function)) {
			throw ScriptRuntime.notFunctionError(ScriptRuntime
					.toString(callbackArg));
		}
		Function f = (Function) callbackArg;
		Scriptable parent = ScriptableObject.getTopLevelScope(f);
		Scriptable thisArg = args.length > 1 && args[1] instanceof Scriptable ? (Scriptable) args[1]
				: parent;
		long length = getLengthProperty(cx, thisObj);
		Scriptable array = null;
		if (id == Id_filter) {
			array = ScriptRuntime.newObject(cx, scope, "Array", null);
		} else if (id == Id_map) {
			// allocate dense array for efficiency
			Object[] ctorArgs = { new Long(length) };
			array = ScriptRuntime.newObject(cx, scope, "Array", ctorArgs);
		}
		Object[] innerArgs = new Object[3];
		long j = 0;
		for (long i = 0; i < length; i++) {
			innerArgs[0] = getElem(cx, thisObj, i);
			innerArgs[1] = new Long(i);
			innerArgs[2] = thisObj;
			Object result = f.call(cx, parent, thisArg, innerArgs);
			switch (id) {
			case Id_every:
				if (!ScriptRuntime.toBoolean(result))
					return Boolean.FALSE;
				break;
			case Id_filter:
				if (ScriptRuntime.toBoolean(result))
					setElem(cx, array, j++, innerArgs[0]);
				break;
			case Id_forEach:
				break;
			case Id_map:
				setElem(cx, array, j++, result);
				break;
			case Id_some:
				if (ScriptRuntime.toBoolean(result))
					return Boolean.TRUE;
				break;
			}
		}
		switch (id) {
		case Id_every:
			return Boolean.TRUE;
		case Id_filter:
		case Id_map:
			return array;
		case Id_some:
			return Boolean.FALSE;
		case Id_forEach:
		default:
			return Undefined.instance;
		}
	}

	// #string_id_map#

	protected int findPrototypeId(String s) {
		int id;
		// #generated# Last update: 2005-09-26 15:47:42 EDT
		L0: {
			id = 0;
			String X = null;
			int c;
			L: switch (s.length()) {
			case 3:
				c = s.charAt(0);
				if (c == 'm') {
					if (s.charAt(2) == 'p' && s.charAt(1) == 'a') {
						id = Id_map;
						break L0;
					}
				} else if (c == 'p') {
					if (s.charAt(2) == 'p' && s.charAt(1) == 'o') {
						id = Id_pop;
						break L0;
					}
				}
				break L;
			case 4:
				switch (s.charAt(2)) {
				case 'i':
					X = "join";
					id = Id_join;
					break L;
				case 'm':
					X = "some";
					id = Id_some;
					break L;
				case 'r':
					X = "sort";
					id = Id_sort;
					break L;
				case 's':
					X = "push";
					id = Id_push;
					break L;
				}
				break L;
			case 5:
				c = s.charAt(1);
				if (c == 'h') {
					X = "shift";
					id = Id_shift;
				} else if (c == 'l') {
					X = "slice";
					id = Id_slice;
				} else if (c == 'v') {
					X = "every";
					id = Id_every;
				}
				break L;
			case 6:
				c = s.charAt(0);
				if (c == 'c') {
					X = "concat";
					id = Id_concat;
				} else if (c == 'f') {
					X = "filter";
					id = Id_filter;
				} else if (c == 's') {
					X = "splice";
					id = Id_splice;
				}
				break L;
			case 7:
				switch (s.charAt(0)) {
				case 'f':
					X = "forEach";
					id = Id_forEach;
					break L;
				case 'i':
					X = "indexOf";
					id = Id_indexOf;
					break L;
				case 'r':
					X = "reverse";
					id = Id_reverse;
					break L;
				case 'u':
					X = "unshift";
					id = Id_unshift;
					break L;
				}
				break L;
			case 8:
				c = s.charAt(3);
				if (c == 'o') {
					X = "toSource";
					id = Id_toSource;
				} else if (c == 't') {
					X = "toString";
					id = Id_toString;
				}
				break L;
			case 11:
				c = s.charAt(0);
				if (c == 'c') {
					X = "constructor";
					id = Id_constructor;
				} else if (c == 'l') {
					X = "lastIndexOf";
					id = Id_lastIndexOf;
				}
				break L;
			case 14:
				X = "toLocaleString";
				id = Id_toLocaleString;
				break L;
			}
			if (X != null && X != s && !X.equals(s))
				id = 0;
		}
		// #/generated#
		return id;
	}

	/**
	 * @see org.mozilla.javascript.Wrapper#unwrap()
	 */
	public Object unwrap() {
		ArrayList al = new ArrayList();
		Object[] ids = getIds();
		Arrays.sort(ids, new Comparator() {

			public int compare(Object arg0, Object arg1) {
				if (arg0 instanceof Number && arg1 instanceof String) {
					return -1;
				} else if (arg0 instanceof String && arg1 instanceof Number) {
					return 1;
				}
				return ((Comparable) arg0).compareTo(arg1);
			}

		});
		for (int i = 0; i < ids.length; i++) {
			if (ids[i] instanceof String) {
				Object o = get((String) ids[i], this);
				if (o != NOT_FOUND) {
					al.add(o);
				}
			} else if (ids[i] instanceof Number) {
				Object o = get(((Number) ids[i]).intValue(), this);
				if (o != NOT_FOUND) {
					al.add(o);
				}
			}
		}
		return al.toArray();
	}

	private static final int Id_constructor = 1, Id_toString = 2,
			Id_toLocaleString = 3, Id_toSource = 4, Id_join = 5,
			Id_reverse = 6, Id_sort = 7, Id_push = 8, Id_pop = 9,
			Id_shift = 10, Id_unshift = 11, Id_splice = 12, Id_concat = 13,
			Id_slice = 14, Id_indexOf = 15, Id_lastIndexOf = 16, Id_every = 17,
			Id_filter = 18, Id_forEach = 19, Id_map = 20, Id_some = 21,

			MAX_PROTOTYPE_ID = 21;

	// #/string_id_map#

	private long length;

	private Object[] dense;

	private static final int maximumDenseLength = 10000;
}
