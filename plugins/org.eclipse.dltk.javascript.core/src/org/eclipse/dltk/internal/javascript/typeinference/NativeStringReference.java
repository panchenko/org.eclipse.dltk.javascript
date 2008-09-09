/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

/**
 * @author jcompagner
 * 
 */
public class NativeStringReference extends UnknownReference {

	/**
	 * @param paramOrVarName
	 * @param childIsh
	 */
	public NativeStringReference(String paramOrVarName) {
		super(paramOrVarName, false);
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.UnknownReference#createChilds()
	 */
	protected void createChilds() {

		setChild("toString", new NativeStringReference("toString")
				.setFunctionRef());
		setChild("toSource", new NativeStringReference("toSource")
				.setFunctionRef());
		setChild("valueOf", new NativeStringReference("valueOf")
				.setFunctionRef());
		setChild("charAt", new NativeStringReference("charAt").setFunctionRef());
		setChild("charCodeAt", new NativeNumberReference("charCodeAt")
				.setFunctionRef());
		setChild("indexOf", new NativeNumberReference("indexOf")
				.setFunctionRef());
		setChild("lastIndexOf", new NativeNumberReference("lastIndexOf")
				.setFunctionRef());
		setChild("split", new NativeArrayReference("split").setFunctionRef());
		setChild("substring", new NativeStringReference("substring")
				.setFunctionRef());
		setChild("toLowerCase", new NativeStringReference("toLowerCase")
				.setFunctionRef());
		setChild("toUpperCase", new NativeStringReference("toUpperCase")
				.setFunctionRef());
		setChild("substr", new NativeStringReference("substr").setFunctionRef());
		setChild("concat", new NativeStringReference("concat").setFunctionRef());
		setChild("slice", new NativeStringReference("slice").setFunctionRef());
		setChild("bold", new NativeStringReference("bold").setFunctionRef());
		setChild("italics", new NativeStringReference("italics")
				.setFunctionRef());
		setChild("fixed", new NativeStringReference("fixed").setFunctionRef());
		setChild("strike", new NativeStringReference("strike").setFunctionRef());
		setChild("small", new NativeStringReference("small").setFunctionRef());
		setChild("big", new NativeStringReference("big").setFunctionRef());
		setChild("blink", new NativeStringReference("blink").setFunctionRef());
		setChild("sup", new NativeStringReference("sup").setFunctionRef());
		setChild("sub", new NativeStringReference("sub").setFunctionRef());
		setChild("fontsize", new NativeStringReference("fontsize")
				.setFunctionRef());
		setChild("fontcolor", new NativeStringReference("fontcolor")
				.setFunctionRef());
		setChild("link", new NativeStringReference("link").setFunctionRef());
		setChild("anchor", new NativeStringReference("anchor").setFunctionRef());
		setChild("equals", new NativeBooleanReference("equals")
				.setFunctionRef());
		setChild("equalsIgnoreCase", new NativeBooleanReference(
				"equalsIgnoreCase").setFunctionRef());
		setChild("match", new NativeStringReference("match").setFunctionRef());
		setChild("search", new NativeNumberReference("search").setFunctionRef());
		setChild("replace", new NativeStringReference("replace")
				.setFunctionRef());
		setChild("localeCompare", new NativeNumberReference("localeCompare")
				.setFunctionRef());
		setChild("toLocaleLowerCase", new NativeStringReference(
				"toLocaleLowerCase").setFunctionRef());
		setChild("toLocaleUpperCase", new NativeStringReference(
				"toLocaleUpperCase").setFunctionRef());
	}
}
