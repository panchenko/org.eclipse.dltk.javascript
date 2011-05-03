package org.eclipse.dltk.javascript.parser.tests;

import org.eclipse.dltk.core.tests.util.StringList;

public class Bug20110503 extends AbstractJSParserTest {

	/**
	 * @see org.eclipse.dltk.javascript.parser.JavaScriptParser.JSInternalParser#combineFollows(boolean)
	 */
	public void testCombinedFollowsNPE() {
		final StringList code = new StringList();
		code.add("var x = test({");
		code.add("  a : {");
		code.add("	  b : function () {");
		code.add("	    var q = new Q(");
		code.add("	  }");
		code.add("	}");
		code.add("});");
		parse(code.toString());
	}

}
