/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

/**
 * @author jcompagner
 * 
 */
public class NativeArrayReference extends UnknownReference {

	private static UnknownReference toString = new NativeStringReference(
			"toString").setFunctionRef();
	private static UnknownReference toLocaleString = new NativeStringReference(
			"toLocaleString").setFunctionRef();
	private static UnknownReference toSource = new NativeStringReference(
			"toSource").setFunctionRef();
	private static UnknownReference reverse = new NativeArrayReference(
			"reverse").setFunctionRef();
	private static UnknownReference sort = new NativeArrayReference("sort")
			.setFunctionRef();
	private static UnknownReference push = new NativeNumberReference("push")
			.setFunctionRef();
	private static UnknownReference pop = new UnknownReference("pop", false)
			.setFunctionRef();
	private static UnknownReference shift = new NativeArrayReference("shift")
			.setFunctionRef();
	private static UnknownReference unshift = new NativeNumberReference(
			"unshift").setFunctionRef();
	private static UnknownReference splice = new UnknownReference("splice",
			false).setFunctionRef();
	private static UnknownReference concat = new NativeArrayReference("concat")
			.setFunctionRef();
	private static UnknownReference slice = new NativeArrayReference("slice")
			.setFunctionRef();
	private static UnknownReference indexOf = new NativeNumberReference(
			"indexOf").setFunctionRef();
	private static UnknownReference lastIndexOf = new NativeNumberReference(
			"lastIndexOf").setFunctionRef();
	private static UnknownReference every = new NativeBooleanReference("every")
			.setFunctionRef();
	private static UnknownReference filter = new NativeArrayReference("filter")
			.setFunctionRef();
	private static UnknownReference forEach = new UnknownReference("forEach",
			false).setFunctionRef();
	private static UnknownReference map = new NativeArrayReference("map")
			.setFunctionRef();
	private static UnknownReference some = new NativeBooleanReference("some")
			.setFunctionRef();

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
		setChild("toString", toString);
		setChild("toLocaleString", toLocaleString);
		setChild("toSource", toSource);
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
	}

	public void setChild(String key, IReference ref) {

		if (ref instanceof UnknownReference) {
			UnknownReference ur = (UnknownReference) ref;
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
				ur.setParameterNames(new char[][] { "arrayN".toCharArray(),
						"[arrayX]".toCharArray() });
			} else if (name.equals("slice")) {
				ur
						.setProposalInfo("Returns selected elements from an existing array.");
				ur.setParameterNames(new char[][] { "start".toCharArray(),
						"[end]".toCharArray() });

			} else if (name.equals("valueOf")) {
				ur
						.setProposalInfo("Returns the primitive value of a String object.");
			} else if (name.equals("join")) {
				ur
						.setProposalInfo("Puts all the elements of an array into a string. The elements are separated by a specified delimiter.");
				ur
						.setParameterNames(new char[][] { "[separator]"
								.toCharArray() });
			} else if (name.equals("pop")) {
				ur
						.setProposalInfo("Removes and returns the last element of an array.");
			} else if (name.equals("push")) {
				ur
						.setProposalInfo("Adds one or more elements to the end of an array and returns the new length");
				ur.setParameterNames(new char[][] { "element1".toCharArray(),
						"[elementX]".toCharArray() });

			} else if (name.equals("reverse")) {
				ur
						.setProposalInfo("Reverses the order of the elements in an array.");
			} else if (name.equals("shift")) {
				ur
						.setProposalInfo("Removes and returns the first element of an array.");
			} else if (name.equals("sort")) {
				ur.setProposalInfo("Sorts the elements of an array.");
				ur.setParameterNames(new char[][] { "sortByFunction"
						.toCharArray() });

			} else if (name.equals("splice")) {
				ur
						.setProposalInfo("Removes and adds new elements to an array.");
				ur
						.setParameterNames(new char[][] {
								"index".toCharArray(), "howmany".toCharArray(),
								"[newelementX]".toCharArray() });
			} else if (name.equals("unshift")) {
				ur
						.setProposalInfo("Adds one or more elements to the beginning of an array and returns the new length.");
				ur.setParameterNames(new char[][] {
						"newelement1".toCharArray(),
						"[newelementX]".toCharArray() });
			}
		}
		super.setChild(key, ref);
	}

}
