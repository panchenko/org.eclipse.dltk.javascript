/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

/**
 * @author jcompagner
 * 
 */
public class NativeNumberReference extends UnknownReference {

	/**
	 * @param paramOrVarName
	 * @param childIsh
	 */
	public NativeNumberReference(String paramOrVarName) {
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
		setChild("valueOf", new NativeStringReference("valueOf")
				.setFunctionRef());
		setChild("toFixed", new NativeStringReference("toFixed")
				.setFunctionRef());
		setChild("toExponential", new NativeStringReference("toExponential")
				.setFunctionRef());
		setChild("toPrecision", new NativeStringReference("toPrecision")
				.setFunctionRef());

	}
}
