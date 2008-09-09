/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

/**
 * @author jcompagner
 * 
 */
public class NativeArrayReference extends UnknownReference {

	/**
	 * @param paramOrVarName
	 * @param childIsh
	 */
	public NativeArrayReference(String paramOrVarName) {
		super(paramOrVarName, false);

	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.UnknownReference#createChilds()
	 */
	protected void createChilds() {
		setChild("toString", new NativeStringReference("toString")
				.setFunctionRef());
		setChild("toLocaleString", new NativeStringReference("toLocaleString")
				.setFunctionRef());
		setChild("toSource", new NativeStringReference("toSource")
				.setFunctionRef());
		setChild("reverse", new NativeArrayReference("reverse")
				.setFunctionRef());
		setChild("sort", new NativeArrayReference("sort").setFunctionRef());
		setChild("push", new NativeNumberReference("push").setFunctionRef());
		setChild("pop", new UnknownReference("pop", false));
		setChild("shift", new NativeArrayReference("shift").setFunctionRef());
		setChild("unshift", new NativeNumberReference("unshift")
				.setFunctionRef());
		setChild("splice", new UnknownReference("splice", false));
		setChild("concat", new NativeArrayReference("concat").setFunctionRef());
		setChild("slice", new NativeArrayReference("slice").setFunctionRef());
		setChild("unshift", new NativeNumberReference("unshift")
				.setFunctionRef());
		setChild("indexOf", new NativeNumberReference("indexOf")
				.setFunctionRef());
		setChild("lastIndexOf", new NativeNumberReference("lastIndexOf")
				.setFunctionRef());
		setChild("every", new NativeBooleanReference("every").setFunctionRef());
		setChild("filter", new NativeArrayReference("filter").setFunctionRef());
		setChild("forEach", new UnknownReference("forEach", false));
		setChild("map", new NativeArrayReference("map").setFunctionRef());
		setChild("some", new NativeBooleanReference("some").setFunctionRef());
	}
}
