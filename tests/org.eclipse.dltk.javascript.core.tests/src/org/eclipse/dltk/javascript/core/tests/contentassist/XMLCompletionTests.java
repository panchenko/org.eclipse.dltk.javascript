package org.eclipse.dltk.javascript.core.tests.contentassist;

public class XMLCompletionTests extends AbstractCompletionTest {

	public void test1() {
		String[] names = concat(getMethodsOfXML(), "product", "customer");
		String module = "test-xml1.js";
		int position = lastPositionInFile("order.", module);
		basicTest(module, position, names);
	}

	public void test2() {
		String[] names = concat(getMethodsOfXML(), "@id", "@name");
		String module = "test-xml2.js";
		int position = lastPositionInFile("order.product.", module);
		basicTest(module, position, names);
	}

}
