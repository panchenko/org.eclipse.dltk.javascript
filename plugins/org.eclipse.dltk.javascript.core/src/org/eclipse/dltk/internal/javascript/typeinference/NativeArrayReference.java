/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

/**
 * @author jcompagner
 * 
 */
public class NativeArrayReference extends StandardSelfCompletingReference {

	private static StandardSelfCompletingReference toString = new NativeStringReference(
			"toString").setFunctionRef();
	private static StandardSelfCompletingReference toLocaleString = new NativeStringReference(
			"toLocaleString").setFunctionRef();
	private static StandardSelfCompletingReference toSource = new NativeStringReference(
			"toSource").setFunctionRef();
	private static StandardSelfCompletingReference join = new NativeArrayReference(
			"join").setFunctionRef();
	private static StandardSelfCompletingReference reverse = new NativeArrayReference(
			"reverse").setFunctionRef();
	private static StandardSelfCompletingReference sort = new NativeArrayReference(
			"sort").setFunctionRef();
	private static StandardSelfCompletingReference push = new NativeNumberReference(
			"push").setFunctionRef();
	private static StandardSelfCompletingReference pop = new StandardSelfCompletingReference(
			"pop", false).setFunctionRef();
	private static StandardSelfCompletingReference shift = new NativeArrayReference(
			"shift").setFunctionRef();
	private static StandardSelfCompletingReference unshift = new NativeNumberReference(
			"unshift").setFunctionRef();
	private static StandardSelfCompletingReference splice = new StandardSelfCompletingReference(
			"splice", false).setFunctionRef();
	private static StandardSelfCompletingReference concat = new NativeArrayReference(
			"concat").setFunctionRef();
	private static StandardSelfCompletingReference slice = new NativeArrayReference(
			"slice").setFunctionRef();
	private static StandardSelfCompletingReference indexOf = new NativeNumberReference(
			"indexOf").setFunctionRef();
	private static StandardSelfCompletingReference lastIndexOf = new NativeNumberReference(
			"lastIndexOf").setFunctionRef();
	private static StandardSelfCompletingReference every = new NativeBooleanReference(
			"every").setFunctionRef();
	private static StandardSelfCompletingReference filter = new NativeArrayReference(
			"filter").setFunctionRef();
	private static StandardSelfCompletingReference forEach = new StandardSelfCompletingReference(
			"forEach", false).setFunctionRef();
	private static StandardSelfCompletingReference map = new NativeArrayReference(
			"map").setFunctionRef();
	private static StandardSelfCompletingReference some = new NativeBooleanReference(
			"some").setFunctionRef();

	private static StandardSelfCompletingReference length = new NativeNumberReference(
			"length");

	/**
	 * @param paramOrVarName
	 * @param childIsh
	 */
	public NativeArrayReference(String paramOrVarName) {
		super(paramOrVarName, false);

	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.StandardSelfCompletingReference#createChilds()
	 */
	protected void createChilds() {
		setChild("toString", toString);
		setChild("toLocaleString", toLocaleString);
		setChild("toSource", toSource);
		setChild("join", join);
		setChild("reverse", reverse);
		setChild("sort", sort);
		setChild("push", push);
		setChild("pop", pop);
		setChild("shift", shift);
		setChild("unshift", unshift);
		setChild("splice", splice);
		setChild("concat", concat);
		setChild("slice", slice);
		setChild("indexOf", indexOf);
		setChild("lastIndexOf", lastIndexOf);
		setChild("every", every);
		setChild("filter", filter);
		setChild("forEach", forEach);
		setChild("map", map);
		setChild("some", some);
		setChild("length", length);
	}

	public void setChild(String key, IReference ref) {

		if (ref instanceof StandardSelfCompletingReference) {
			StandardSelfCompletingReference ur = (StandardSelfCompletingReference) ref;
			String name = ref.getName();
			if (name.equals("toString")) {
				ur.setProposalInfo("Returns a String value for Array.");
			} else if (name.equals("toSource")) {
				ur
						.setProposalInfo("The toSource() method represents the source code of an object.");
			} else if (name.equals("valueOf")) {
				ur
						.setProposalInfo("Returns the primitive value of a Array object.");
			} else if (name.equals("concat")) {

				ur
						.setProposalInfo("Joins two or more arrays and returns the result.");
				ur.setParameterNames(new String[] { "arrayN", "[arrayX]" });
			} else if (name.equals("slice")) {
				ur
						.setProposalInfo("Returns selected elements from an existing array.");
				ur.setParameterNames(new String[] { "start", "[end]" });

			} else if (name.equals("valueOf")) {
				ur
						.setProposalInfo("Returns the primitive value of a String object.");
			} else if (name.equals("join")) {
				ur
						.setProposalInfo("Puts all the elements of an array into a string. The elements are separated by a specified delimiter.");
				ur.setParameterNames(new String[] { "[separator]" });
			} else if (name.equals("pop")) {
				ur
						.setProposalInfo("Removes and returns the last element of an array.");
			} else if (name.equals("push")) {
				ur
						.setProposalInfo("Adds one or more elements to the end of an array and returns the new length");
				ur.setParameterNames(new String[] { "element1", "[elementX]" });

			} else if (name.equals("reverse")) {
				ur
						.setProposalInfo("Reverses the order of the elements in an array.");
			} else if (name.equals("shift")) {
				ur
						.setProposalInfo("Removes and returns the first element of an array.");
			} else if (name.equals("sort")) {
				ur.setProposalInfo("Sorts the elements of an array.");
				ur.setParameterNames(new String[] { "sortByFunction" });

			} else if (name.equals("splice")) {
				ur
						.setProposalInfo("Removes and adds new elements to an array.");
				ur.setParameterNames(new String[] { "index", "howmany",
						"[newelementX]" });
			} else if (name.equals("filter")) {
				ur
						.setProposalInfo("Creates a new array with all elements that pass the test implemented by the provided function.");
				ur.setParameterNames(new String[] { "callback" });

			} else if (name.equals("every")) {
				ur
						.setProposalInfo("Tests whether all elements in the array pass the test implemented by the provided function.");
				ur.setParameterNames(new String[] { "callback" });
			} else if (name.equals("map")) {
				ur
						.setProposalInfo("Creates a new array with the results of calling a provided function on every element in this array.");
				ur.setParameterNames(new String[] { "callback" });
			} else if (name.equals("some")) {
				ur
						.setProposalInfo("Tests whether some element in the array passes the test implemented by the provided function.");
				ur.setParameterNames(new String[] { "callback" });

			} else if (name.equals("forEach")) {
				ur
						.setProposalInfo("Calls a function for each element in the array.");
				ur.setParameterNames(new String[] { "callback" });
			} else if (name.equals("indexOf")) {
				ur
						.setProposalInfo("Returns the first index at which a given element can be found in the array, or -1 if it is not present.");
				ur.setParameterNames(new String[] { "searchElement",
						"[fromIndex]" });
			} else if (name.equals("lastIndexOf")) {
				ur
						.setProposalInfo("Returns the last (greatest) index of an element within the array equal to the specified value, or -1 if none is found.");
				ur.setParameterNames(new String[] { "searchElement",
						"[formIndex]" });

			} else if (name.equals("unshift")) {
				ur
						.setProposalInfo("Adds one or more elements to the beginning of an array and returns the new length.");
				ur.setParameterNames(new String[] { "newelement1",
						"[newelementX]" });
			} else if (name.equals("length")) {
				ur
						.setProposalInfo("The length returns an integer representing the length of an array.");

			}
		}
		super.setChild(key, ref);
	}

}
