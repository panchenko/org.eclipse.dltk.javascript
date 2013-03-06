/**
 * 
 */
package org.eclipse.dltk.javascript.core.tests.contentassist;

import junit.framework.TestCase;

import org.eclipse.dltk.internal.javascript.typeinference.CompletionString;

/**
 * @author jcompagner
 */
public class CompletionStringParsing extends TestCase {

	public static String parse(String id, boolean dotBeforeBrackets) {
		return CompletionString.parse(id, dotBeforeBrackets);
	}

	public void testCompletionWithArrayDotResolving() throws Exception {

		assertEquals("forms.xxx.yyy", parse("forms.xxx.yyy", true));
		assertEquals("forms.xxx.yyy", parse("forms.xxx.yyy()", true));
		assertEquals("forms.xxx.yyy", parse("forms.xxx().yyy()", true));
		assertEquals("forms.xxx.[].yyy.[]", parse("forms.xxx[].yyy[]", true));
		assertEquals("forms.[].yyy", parse("forms[xxx].yyy", true));
		assertEquals("forms.[].yyy", parse("forms[xxx()].yyy", true));
		assertEquals("forms.[].yyy", parse("forms[xxx(1)].yyy", true));
		assertEquals("xxx", parse("forms[xxx", true));
		assertEquals("", parse("forms[xxx(", true));
		assertEquals("a", parse("forms[xxx(a", true));
		assertEquals("xxx", parse("forms[xxx(1)", true));
		assertEquals("xxx.yyy", parse("forms[xxx(1).yyy", true));
		assertEquals("forms.[]", parse("forms[xxx(1).yyy]", true));

		assertEquals("forms.[]", parse("forms[xxx(1).yyy]]", true));
		assertEquals("forms.[]", parse("forms[xxx(1)).yyy]", true));
		assertEquals("forms.[]", parse("forms[[xxx(1).yyy]", true));
		assertEquals("forms.[]", parse("forms[xxx((1).yyy]", true));
		assertEquals("forms.[]", parse("forms[[xxx((1).yyy]", true));
		assertEquals("forms.[]", parse("forms[xxx((1).yyy]]", true));
		assertEquals("forms.[]", parse(")forms[xxx(1)).yyy]", true));

	}

	public void testCompletionWithoutArrayDotResolving() throws Exception {

		assertEquals("forms.xxx.yyy", parse("forms.xxx.yyy", false));
		assertEquals("forms.xxx.yyy", parse("forms.xxx.yyy()", false));
		assertEquals("forms.xxx.yyy", parse("forms.xxx().yyy()", false));
		assertEquals("forms.xxx[].yyy[]", parse("forms.xxx[].yyy[]", false));
		assertEquals("forms[].yyy", parse("forms[xxx].yyy", false));
		assertEquals("forms[].yyy", parse("forms[xxx()].yyy", false));
		assertEquals("forms[].yyy", parse("forms[xxx(1)].yyy", false));
		assertEquals("xxx", parse("forms[xxx", false));
		assertEquals("", parse("forms[xxx(", false));
		assertEquals("a", parse("forms[xxx(a", false));
		assertEquals("xxx", parse("forms[xxx(1)", false));
		assertEquals("xxx.yyy", parse("forms[xxx(1).yyy", false));
		assertEquals("forms[]", parse("forms[xxx(1).yyy]", false));

		assertEquals("forms[]", parse("forms[xxx(1).yyy]]", false));
		assertEquals("forms[]", parse("forms[xxx(1)).yyy]", false));
		assertEquals("forms[]", parse(")forms[xxx(1)).yyy]", false));

	}

	public void testDoubleParsing() throws Exception {
		assertEquals("forms.xxx.[].yyy.[]", parse("forms.xxx.[].yyy.[]", true));

	}

	public void testWithLineEnding() throws Exception {
		assertEquals("forms.xxx.[].yyy.[]",
				parse("someCode\nforms.xxx[xxx].yyy[yyy]", true));
		assertEquals("", parse("someCode\nforms.xxx[xxx].yyy[yyy]\n", true));

	}

	public void testWithWhiteSpace() throws Exception {
		assertEquals("forms.xxx.[].yyy.[]",
				parse("someCode forms.xxx[xxx].yyy[yyy]", true));
		assertEquals("", parse("someCode forms.xxx[xxx].yyy[yyy] ", true));
		assertEquals("", parse("x.f2()\n .\n\tf2()\n\t.\n\tf1()\n", true));
	}
	
	public void testWithValidWhiteSpace() throws Exception {
		assertEquals("x.f2.f2", parse("x.f2().\n\tf2()", true));
		assertEquals("x.f2.f2", parse("x.f2()\n .\n\tf2()", true));
		assertEquals("x.f2.f2.f1", parse("x.f2()\n .\n\tf2()\n\t.\n\tf1()", true));
		assertEquals("x.f2.f2.f1.", parse("x.f2()\n .\n\tf2()\n\t.\n\tf1()\n.", true));
	}

	public void testWithCommentLineEndingWithDot() throws Exception {
		assertEquals("x.f2.f2", parse("// this is a comment.\nx.f2().\n\tf2()", true));
	}
	public void testWithMultiplyParams() throws Exception {
		assertEquals("forms.xxx.[].yyy.[]",
				parse("someCode forms.xxx[xxx,yyy].yyy[xxx,yyy]", true));
		assertEquals(
				"forms.xxx.[].yyy.[]",
				parse("someCode forms.xxx[xxx , yyy].yyy[xxx , yyy, yyy]", true));
		assertEquals("a", parse("someCode forms.xxx[xxx,yyy].yyy[a", true));
		assertEquals("a",
				parse("someCode forms.xxx[xxx , yyy].yyy[xxx,a", true));
		assertEquals("a",
				parse("someCode forms.xxx[xxx , yyy].yyy[xxx , a", true));
	}

	public void testWithString() throws Exception {
		assertEquals("forms.xxx.[].yyy.[]",
				parse("forms.xxx['xxx'].yyy[\"yyy\"]", true));
		assertEquals("forms.xxx.[].yyy.[]",
				parse("forms.xxx['xxx yyy'].yyy[\"xxx yyy\"]", true));
		assertEquals("forms.xxx.[].yyy.[]",
				parse("forms.xxx['xxx yyy'].yyy[\"xxx 'yyy'\"]", true));
		assertEquals("\"xxx 'yyy'\"", parse("\"xxx 'yyy'\"", true));
		assertEquals("'xxx \"yyy\"'", parse("'xxx \"yyy\"'", true));
	}

	public void testXMLSyntax() throws Exception {
		assertEquals(
				"_xml.articulo.art::articulo_catalago.art::articulo_borrador",
				parse("_xml.articulo.art::articulo_catalago.art::articulo_borrador",
						true));
	}

	public void testObjectLiteralSyntax() {
		assertEquals("person.name", parse("var x = { name:person.name", true));
	}

	public void testArrayFunction() throws Exception {
		assertEquals("execute.[]", parse("execute[0]()", true));
	}

	public void testFunctionArray() throws Exception {
		assertEquals("execute.[]", parse("execute()[0]", true));
	}
	
}
