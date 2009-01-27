package org.eclipse.dltk.internal.javascript.typeinference;

public class NativeXMLReference extends UnknownReference {

	public NativeXMLReference(String paramOrVarName) {
		super(paramOrVarName, false);
	}

	private static UnknownReference toXMLString = new NativeStringReference(
			"toXMLString").setFunctionRef();
	private static UnknownReference text = new NativeStringReference("text")
			.setFunctionRef();
	private static UnknownReference toString = new NativeStringReference(
			"toString").setFunctionRef();

	private static UnknownReference addNamespace = new NativeXMLReference(
			"addNamespace").setFunctionRef();
	private static UnknownReference appendChild = new NativeXMLReference(
			"appendChild").setFunctionRef();
	private static UnknownReference attribute = new NativeXMLReference(
			"attribute").setFunctionRef();
	private static UnknownReference attributes = new NativeXMLReference(
			"attributes").setFunctionRef();
	private static UnknownReference child = new NativeXMLReference("child")
			.setFunctionRef();
	private static UnknownReference childIndex = new NativeNumberReference(
			"childIndex").setFunctionRef();
	private static UnknownReference children = new NativeXMLReference(
			"children").setFunctionRef();
	private static UnknownReference comments = new NativeXMLReference(
			"comments").setFunctionRef();
	private static UnknownReference contains = new NativeBooleanReference(
			"contains").setFunctionRef();
	private static UnknownReference copy = new NativeXMLReference("copy")
			.setFunctionRef();
	private static UnknownReference descendants = new NativeXMLReference(
			"descendants").setFunctionRef();
	private static UnknownReference elements = new NativeXMLReference(
			"elements").setFunctionRef();
	private static UnknownReference hasComplexContent = new NativeBooleanReference(
			"hasComplexContent").setFunctionRef();
	private static UnknownReference hasOwnProperty = new NativeBooleanReference(
			"hasOwnProperty").setFunctionRef();
	private static UnknownReference hasSimpleContent = new NativeBooleanReference(
			"hasSimpleContent").setFunctionRef();
	private static UnknownReference inScopeNamespaces = new NativeArrayReference(
			"inScopeNamespaces").setFunctionRef();
	private static UnknownReference insertChildAfter = new NativeXMLReference(
			"insertChildAfter").setFunctionRef();
	private static UnknownReference insertChildBefore = new NativeXMLReference(
			"insertChildBefore").setFunctionRef();
	private static UnknownReference length = new NativeNumberReference("length")
			.setFunctionRef();
	private static UnknownReference localName = new NativeStringReference(
			"localName").setFunctionRef();
	private static UnknownReference name = new NativeStringReference("name")
			.setFunctionRef();
	private static UnknownReference namespace = new NativeXMLReference(
			"namespace").setFunctionRef();
	private static UnknownReference namespaceDeclarations = new NativeArrayReference(
			"namespaceDeclarations").setFunctionRef();
	private static UnknownReference nodeKind = new NativeStringReference(
			"nodeKind").setFunctionRef();
	private static UnknownReference normalize = new NativeXMLReference(
			"normalize").setFunctionRef();
	private static UnknownReference parent = new NativeXMLReference("parent")
			.setFunctionRef();
	private static UnknownReference processingInstructions = new NativeXMLReference(
			"processingInstructions").setFunctionRef();
	// propertyIsEnumerable
	private static UnknownReference propertyIsEnumerable = new NativeBooleanReference(
			"propertyIsEnumerable").setFunctionRef();
	private static UnknownReference prependChild = new NativeXMLReference(
			"prependChild").setFunctionRef();
	private static UnknownReference removeNamespace = new NativeXMLReference(
			"removeNamespace").setFunctionRef();
	private static UnknownReference replace = new NativeXMLReference("replace")
			.setFunctionRef();
	private static UnknownReference setChildren = new NativeXMLReference(
			"setChildren").setFunctionRef();
	private static UnknownReference setName = new NativeXMLReference("setName")
			.setFunctionRef();
	private static UnknownReference setNamespace = new NativeXMLReference(
			"setNamespace").setFunctionRef();
	private static UnknownReference valueOf = new NativeXMLReference("valueOf")
			.setFunctionRef();
	private static UnknownReference setLocalName = new NativeXMLReference(
			"setLocalName").setFunctionRef();

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.UnknownReference#createChilds()
	 */
	protected void createChilds() {

		setChild("toXMLString", toXMLString);
		setChild("text", text);
		setChild("toString", toString);
		setChild("addNamespace", addNamespace);
		setChild("appendChild", appendChild);
		setChild("attribute", attribute);
		setChild("attributes", attributes);
		setChild("child", child);
		setChild("childIndex", childIndex);
		setChild("children", children);
		setChild("comments", comments);
		setChild("contains", contains);
		setChild("copy", copy);
		setChild("descendants", descendants);
		setChild("elements", elements);
		setChild("hasComplexContent", hasComplexContent);
		setChild("hasOwnProperty", hasOwnProperty);
		setChild("hasSimpleContent", hasSimpleContent);
		setChild("inScopeNamespaces", inScopeNamespaces);
		setChild("insertChildAfter", insertChildAfter);
		setChild("insertChildBefore", insertChildBefore);
		setChild("length", length);
		setChild("localName", localName);
		setChild("name", name);
		setChild("namespace", namespace);
		setChild("namespaceDeclarations", namespaceDeclarations);
		setChild("nodeKind", nodeKind);
		setChild("normalize", normalize);
		setChild("parent", parent);
		setChild("processingInstructions", processingInstructions);
		setChild("propertyIsEnumerable", propertyIsEnumerable);
		setChild("prependChild", prependChild);
		setChild("removeNamespace", removeNamespace);
		setChild("replace", replace);
		setChild("setChildren", setChildren);
		setChild("setName", setName);
		setChild("setNamespace", setNamespace);
		setChild("setLocalName", setLocalName);
		setChild("valueOf", valueOf);

		// constants
		setChild("prototype", new NativeXMLReference("prototype"));
		setChild("ignoreComments", new NativeBooleanReference("ignoreComments"));
		setChild("ignoreProcessingInstructions", new NativeBooleanReference(
				"ignoreProcessingInstructions"));
		setChild("ignoreWhitespace", new NativeBooleanReference(
				"ignoreWhitespace"));
		setChild("length", new NativeNumberReference("length"));
		setChild("name", new NativeStringReference("name"));
		setChild("prettyIndent", new NativeNumberReference("prettyIndent"));
		setChild("prettyPrinting", new NativeBooleanReference("prettyPrinting"));

	}

	public void setChild(String key, IReference ref) {

		if (ref instanceof UnknownReference) {
			UnknownReference ur = (UnknownReference) ref;
			String name = ref.getName();
			if (name.equals("toXMLString")) {
				ur.setProposalInfo("Returns a String value for this object.");
			} else if (name.equals("text")) {
				ur
						.setProposalInfo("The text() method represents the source code of an object.");
			} else if (name.equals("toString")) {
				ur.setProposalInfo("Returns a String value for this object.");
			} else if (name.equals("addNamespace")) {
				ur
						.setProposalInfo("The addNamespace method adds a namespace declaration to the in scope namespaces for this XML object and returns this XML object.");

				ur
						.setParameterNames(new char[][] { "namespace"
								.toCharArray() });
			} else if (name.equals("appendChild")) {

				ur
						.setProposalInfo("The appendChild method appends the given child to the end of this XML object’s properties and returns this XML object.");
				ur.setParameterNames(new char[][] { "child".toCharArray() });

			} else if (name.equals("attribute")) {
				ur
						.setProposalInfo("The attribute method returns an XMLList containing zero or one XML attributes associated with this XML object that have the given attributeName. ");
				ur.setParameterNames(new char[][] { "child".toCharArray() });

			} else if (name.equals("attributes")) {
				ur
						.setProposalInfo("The attributes method returns an XMLList containing the XML attributes of this object.");

			} else if (name.equals("child")) {
				ur
						.setProposalInfo("The child method returns the list of children in this XML object matching the given propertyName.");
				ur.setParameterNames(new char[][] { "propertyName"
						.toCharArray() });

			} else if (name.equals("childIndex")) {
				ur
						.setProposalInfo("The childIndex method returns a Number representing the ordinal position of this XML object within the context of its parent.");

			} else if (name.equals("children")) {
				ur
						.setProposalInfo("The children method returns an XMLList containing all the properties of this XML object in order");

			} else if (name.equals("comments")) {
				ur
						.setProposalInfo("The comments method returns an XMLList containing the properties of this XML object that represent XML comments.");

			} else if (name.equals("contains")) {
				ur
						.setProposalInfo("The contains method returns the result of comparing this XML object with the given value.");
				ur.setParameterNames(new char[][] { "value".toCharArray() });

			} else if (name.equals("copy")) {
				ur
						.setProposalInfo("The copy method returns a deep copy of this XML object with the internal [[Parent]] property set to null.");

			} else if (name.equals("descendants")) {
				ur
						.setProposalInfo("The descendants method returns all the XML valued descendants (children, grandchildren, great-grandchildren, etc.) of this XML object with the given name. If the name parameter is omitted, it returns all descendants of this XML object.");
				ur.setParameterNames(new char[][] { "[name]".toCharArray() });

			} else if (name.equals("elements")) {
				ur
						.setProposalInfo("When the elements method is called with one parameter name, it returns an XMLList containing all the children of this XML object that are XML elements with the given name. When the elements method is called with no parameters, it returns an XMLList containing all the children of this XML object that are XML elements regardless of their name.");
				ur.setParameterNames(new char[][] { "[name]".toCharArray() });

			} else if (name.equals("hasComplexContent")) {
				ur
						.setProposalInfo("The hasComplexContent method returns a Boolean value indicating whether this XML object contains complex content. An XML object is considered to contain complex content if it represents an XML element that has child elements. XML objects representing attributes, comments, processing instructions and text nodes do not have complex content. The existence of attributes, comments, processing instructions and text nodes within an XML object is not significant in determining if it has complex content.");

			} else if (name.equals("hasOwnProperty")) {
				ur
						.setProposalInfo("The hasOwnProperty method returns a Boolean value indicating whether this object has the property specified by P. For all XML objects except the XML prototype object, this is the same result returned by the internal method [[HasProperty]]. For the XML prototype object, hasOwnProperty also examines the list of local properties to determine if there is a method property with the given name.");
				ur.setParameterNames(new char[][] { " P ".toCharArray() });

			} else if (name.equals("hasSimpleContent")) {
				ur
						.setProposalInfo("The hasSimpleContent method returns a Boolean value indicating whether this XML object contains simple content. An XML object is considered to contain simple content if it represents a text node, represents an attribute node or if it represents an XML element that has no child elements. XML objects representing comments and processing instructions do not have simple content. The existence of attributes, comments, processing instructions and text nodes within an XML object is not significant in determining if it has simple content.");

			} else if (name.equals("inScopeNamespaces")) {
				ur
						.setProposalInfo("The inScopeNamespaces method returns an Array of Namespace objects representing the namespaces in scope for this XML object in the context of its parent. If the parent of this XML object is modified, the associated namespace declarations may change. The set of namespaces returned by this method may be a super set of the namespaces used by this value.");

			} else if (name.equals("insertChildAfter")) {
				ur
						.setProposalInfo("The insertChildAfter method inserts the given child2 after the given child1 in this XML object and returns this XML object. If child1 is null, the insertChildAfter method inserts child2 before all children of this XML object (i.e., after none of them). If child1 does not exist in this XML object, it returns without modifying this XML object.");
				ur.setParameterNames(new char[][] { "child1 , child2"
						.toCharArray() });

			} else if (name.equals("insertChildBefore")) {
				ur
						.setProposalInfo("he insertChildBefore method inserts the given child2 before the given child1 in this XML object and returns this XML object. If child1 is null, the insertChildBefore method inserts child2 after all children in this XML object (i.e., before none of them). If child1 does not exist in this XML object, it returns without modifying this XML object.");
				ur.setParameterNames(new char[][] { "child1 , child2"
						.toCharArray() });

			} else if (name.equals("length")) {
				ur
						.setProposalInfo("The length method always returns the integer 1 for XML objects. This treatment intentionally blurs the distinction between a single XML object and an XMLList containing only one value");

			} else if (name.equals("name")) {
				ur
						.setProposalInfo("The name method returns the qualified name associated with this XML object");

			} else if (name.equals("namespace")) {
				ur
						.setProposalInfo("If no prefix is specified, the namespace method returns the Namespace associated with the qualified name of this XML object. If a prefix is specified, the namespace method looks for a namespace in scope for this XML object with the given prefix and, if found, returns it. If no such namespace is found, the namespace method returns undefined");
				ur.setParameterNames(new char[][] { "[prefix]".toCharArray() });

			} else if (name.equals("namespaceDeclarations")) {
				ur
						.setProposalInfo("The namespaceDeclarations method returns an Array of Namespace objects representing the namespace declarations associated with this XML object in the context of its parent. If the parent of this XML object is modified, the associated namespace declarations may change");

			} else if (name.equals("nodeKind")) {
				ur
						.setProposalInfo("he nodeKind method returns a string representing the [[Class]] of this XML object.");

			} else if (name.equals("normalize")) {
				ur
						.setProposalInfo("The normalize method puts all text nodes in this and all descendant XML objects into a normal form by merging adjacent text nodes and eliminating empty text nodes. It returns this XML object.");

			} else if (name.equals("parent")) {
				ur
						.setProposalInfo("The parent method returns the parent of this XML object.");

			} else if (name.equals("processingInstructions")) {
				ur
						.setProposalInfo("When the processingInstructions method is called with one parameter name, it returns an XMLList containing all the children of this XML object that are processing-instructions with the given name. When the processingInstructions method is called with no parameters, it returns an XMLList containing all the children of this XML object that are processing-instructions regardless of their name");
				ur.setParameterNames(new char[][] { "[name]".toCharArray() });

			} else if (name.equals("propertyIsEnumerable")) {
				ur
						.setProposalInfo("The propertyIsEnumerable method returns a Boolean value indicating whether the property P will be included in the set of properties iterated over when this XML object is used in a for-in statement. This method returns truewhen ToString(P) is \"0\"; otherwise, it returns false. This treatment intentionally blurs the distinction between a single XML object and an XMLList containing only one value");
				ur.setParameterNames(new char[][] { " P ".toCharArray() });

			} else if (name.equals("prependChild")) {
				ur
						.setProposalInfo("The prependChild method inserts the given child into this object prior to its existing XML properties and returns this XML object.");
				ur.setParameterNames(new char[][] { "value".toCharArray() });

			} else if (name.equals("removeNamespace")) {
				ur
						.setProposalInfo("The removeNamespace method removes the given namespace from the in scope namespaces of this object and all its descendents, then returns a copy of this XML object. The removeNamespaces method will not remove a namespace from an object where it is referenced by that object’s QName or the QNames of that object’s attributes");
				ur
						.setParameterNames(new char[][] { "namespace"
								.toCharArray() });

			} else if (name.equals("replace")) {
				ur
						.setProposalInfo("The replace method replaces the XML properties of this XML object specified by propertyName with value and returns this XML object. If this XML object contains no properties that match propertyName, the replace method returns without modifying this XML object. The propertyName parameter may be a numeric property name, an unqualified name for a set of XML elements, a qualified name for a set of XML elements or the properties wildcard \"*\". When the propertyName parameter is an unqualified name, it identifies XML elements in the default namespace. The value parameter may be an XML object, XMLList object or any value that may be converted to a String with ToString(). ");
				ur.setParameterNames(new char[][] { "propertyName , value"
						.toCharArray() });

			} else if (name.equals("setChildren")) {
				ur
						.setProposalInfo("The setChildren method replaces the XML properties of this XML object with a new set of XML properties from value. value may be a single XML object or an XMLList. setChildren returns this XML object.");
				ur.setParameterNames(new char[][] { "value".toCharArray() });

			} else if (name.equals("setName")) {
				ur
						.setProposalInfo("The setName method replaces the name of this XML object with a QName or AttributeName constructed from the given name");
				ur.setParameterNames(new char[][] { "name".toCharArray() });

			} else if (name.equals("setNamespace")) {
				ur
						.setProposalInfo("The setNamespace method replaces the namespace associated with the name of this XML object with the given namespace");
				ur.setParameterNames(new char[][] { "ns".toCharArray() });

			} else if (name.equals("setLocalName")) {
				ur
						.setProposalInfo("The setLocalName method replaces the local name of this XML object with a string constructed from the givenname");
				ur.setParameterNames(new char[][] { "name".toCharArray() });

			} else if (name.equals("valueOf")) {
				ur
						.setProposalInfo("The valueOf method returns this XML object");

			}
		}
		super.setChild(key, ref);
	}
}
