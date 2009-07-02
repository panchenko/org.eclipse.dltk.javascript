/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

/**
 * @author jcompagner
 * 
 */
public class NativeNumberReference extends StandardSelfCompletingReference {

	private static StandardSelfCompletingReference toString = new NativeStringReference(
			"toString").setFunctionRef();
	private static StandardSelfCompletingReference toLocaleString = new NativeStringReference(
			"toLocaleString").setFunctionRef();
	private static StandardSelfCompletingReference toSource = new NativeStringReference(
			"toSource").setFunctionRef();
	private static StandardSelfCompletingReference valueOf = new NativeStringReference(
			"valueOf").setFunctionRef();
	private static StandardSelfCompletingReference toFixed = new NativeStringReference(
			"toFixed").setFunctionRef();
	private static StandardSelfCompletingReference toExponential = new NativeStringReference(
			"toExponential").setFunctionRef();
	private static StandardSelfCompletingReference toPrecision = new NativeStringReference(
			"toPrecision").setFunctionRef();

	/**
	 * @param paramOrVarName
	 * @param childIsh
	 */
	public NativeNumberReference(String paramOrVarName) {
		super(paramOrVarName, false);
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.StandardSelfCompletingReference#createChilds()
	 */
	protected void createChilds() {
		setChild("toString", toString);
		setChild("toLocaleString", toLocaleString);
		setChild("toSource", toSource);
		setChild("valueOf", valueOf);
		setChild("toFixed", toFixed);
		setChild("toExponential", toExponential);
		setChild("toPrecision", toPrecision);

	}

	public void setChild(String key, IReference ref) {

		if (ref instanceof StandardSelfCompletingReference) {
			StandardSelfCompletingReference ur = (StandardSelfCompletingReference) ref;
			String name = ref.getName();
			if (name.equals("toString")) {
				ur.setProposalInfo("Returns a String value for this Number.");
			} else if (name.equals("toSource")) {
				ur
						.setProposalInfo("The toSource() method represents the source code of an object.");
			} else if (name.equals("valueOf")) {
				ur
						.setProposalInfo("Returns the primitive value of a Number object.");
			} else if (name.equals("toExponential")) {
				ur
						.setProposalInfo("Converts the value of the object into an exponential notation.");
				ur.setParameterNames(new char[][] { "numberOfDecimals"
						.toCharArray() });

			} else if (name.equals("toFixed")) {
				ur
						.setProposalInfo("Formats a number to the specified number of decimals.");
				ur.setParameterNames(new char[][] { "numberOfDecimals"
						.toCharArray() });
			} else if (name.equals("toLocaleString")) {
			} else if (name.equals("toPrecision")) {
				ur
						.setProposalInfo("Converts a number into an exponential notation if it has more digits than specified.");
				ur.setParameterNames(new char[][] { "numberOfDigits"
						.toCharArray() });
			}
		}
		super.setChild(key, ref);
	}

}
