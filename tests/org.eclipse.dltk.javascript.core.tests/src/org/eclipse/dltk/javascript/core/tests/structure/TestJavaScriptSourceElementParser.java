package org.eclipse.dltk.javascript.core.tests.structure;

import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.internal.javascript.parser.JavaScriptSourceElementParser2;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;

/**
 * 
 */
final class TestJavaScriptSourceElementParser extends
		JavaScriptSourceElementParser2 {
	@Override
	protected TypeInferencer2 createInferencer() {
		return new TypeInferencer2() {
			@Override
			protected void log(Throwable e) {
				NewStructureParserTests.fail(e.toString());
			}
		};
	}

	@Override
	protected boolean isEnabled(IModuleSource module) {
		return true;
	}
}