/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

/**
 * @author jcompagner
 * 
 */
public class NativeDateReference extends UnknownReference {

	/**
	 * @param paramOrVarName
	 * @param childIsh
	 */
	public NativeDateReference(String paramOrVarName) {
		super(paramOrVarName, false);
		setFunctionRef();
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.UnknownReference#createChilds()
	 */
	protected void createChilds() {
		setChild("toString", new NativeStringReference("toString")
				.setFunctionRef());
		setChild("toTimeString", new NativeStringReference("toTimeString")
				.setFunctionRef());
		setChild("toDateString", new NativeStringReference("toDateString")
				.setFunctionRef());
		setChild("toLocaleString", new NativeStringReference("toLocaleString")
				.setFunctionRef());
		setChild("toLocaleTimeString", new NativeStringReference(
				"toLocaleTimeString").setFunctionRef());
		setChild("toLocaleDateString", new NativeStringReference(
				"toLocaleDateString").setFunctionRef());
		setChild("toUTCString", new NativeStringReference("toUTCString")
				.setFunctionRef());
		setChild("toSource", new NativeStringReference("toSource")
				.setFunctionRef());
		setChild("valueOf", new NativeStringReference("valueOf")
				.setFunctionRef());
		setChild("getTime", new NativeNumberReference("getTime")
				.setFunctionRef());
		setChild("getYear", new NativeNumberReference("getYear")
				.setFunctionRef());
		setChild("getFullYear", new NativeNumberReference("getFullYear")
				.setFunctionRef());
		setChild("getUTCFullYear", new NativeNumberReference("getUTCFullYear")
				.setFunctionRef());
		setChild("getMonth", new NativeNumberReference("getMonth")
				.setFunctionRef());
		setChild("getUTCMonth", new NativeNumberReference("getUTCMonth")
				.setFunctionRef());
		setChild("getDate", new NativeNumberReference("getDate")
				.setFunctionRef());
		setChild("getUTCDate", new NativeNumberReference("getUTCDate")
				.setFunctionRef());
		setChild("getDay", new NativeNumberReference("getDay").setFunctionRef());
		setChild("getUTCDay", new NativeNumberReference("getUTCDay")
				.setFunctionRef());
		setChild("getHours", new NativeNumberReference("getHours")
				.setFunctionRef());
		setChild("getUTCHours", new NativeNumberReference("getUTCHours")
				.setFunctionRef());
		setChild("getMinutes", new NativeNumberReference("getMinutes")
				.setFunctionRef());
		setChild("getUTCMinutes", new NativeNumberReference("getUTCMinutes")
				.setFunctionRef());
		setChild("getSeconds", new NativeNumberReference("getSeconds")
				.setFunctionRef());
		setChild("getUTCSeconds", new NativeNumberReference("getUTCSeconds")
				.setFunctionRef());
		setChild("getMilliseconds",
				new NativeNumberReference("getMilliseconds").setFunctionRef());
		setChild("getUTCMilliseconds", new NativeNumberReference(
				"getUTCMilliseconds").setFunctionRef());
		setChild("getTimezoneOffset", new NativeNumberReference(
				"getTimezoneOffset").setFunctionRef());
		setChild("setTime", new NativeNumberReference("setTime")
				.setFunctionRef());
		setChild("setMilliseconds",
				new NativeNumberReference("setMilliseconds").setFunctionRef());
		setChild("setUTCMilliseconds", new NativeNumberReference(
				"setUTCMilliseconds").setFunctionRef());
		setChild("setSeconds", new NativeNumberReference("setSeconds")
				.setFunctionRef());
		setChild("setUTCSeconds", new NativeNumberReference("setUTCSeconds")
				.setFunctionRef());
		setChild("setMinutes", new NativeNumberReference("setMinutes")
				.setFunctionRef());
		setChild("setUTCMinutes", new NativeNumberReference("setUTCMinutes")
				.setFunctionRef());
		setChild("setHours", new NativeNumberReference("setHours")
				.setFunctionRef());
		setChild("setUTCHours", new NativeNumberReference("setUTCHours")
				.setFunctionRef());
		setChild("setDate", new NativeNumberReference("setDate")
				.setFunctionRef());
		setChild("setUTCDate", new NativeNumberReference("setUTCDate")
				.setFunctionRef());
		setChild("setMonth", new NativeNumberReference("setMonth")
				.setFunctionRef());
		setChild("setUTCMonth", new NativeNumberReference("setUTCMonth")
				.setFunctionRef());
		setChild("setFullYear", new NativeNumberReference("setFullYear")
				.setFunctionRef());
		setChild("setUTCFullYear", new NativeNumberReference("setUTCFullYear")
				.setFunctionRef());
		setChild("setYear", new NativeNumberReference("setYear")
				.setFunctionRef());
	}
}