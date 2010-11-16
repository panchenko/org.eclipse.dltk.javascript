/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.parser;

import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.core.ISourceElementParser;
import org.eclipse.dltk.internal.javascript.parser.structure.StructureReporter2;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;

public class JavaScriptSourceElementParser2 implements ISourceElementParser {

	protected ISourceElementRequestor fRequestor = null;
	protected IProblemReporter fReporter = null;

	public void setRequestor(ISourceElementRequestor requestor) {
		this.fRequestor = requestor;
	}

	public void setReporter(IProblemReporter reporter) {
		this.fReporter = reporter;
	}

	public void parseSourceModule(IModuleSource module) {
		final Script script = parse(module);

		fRequestor.enterModule();
		try {
			script.visitAll(new StructureReporter2(fRequestor));
		} finally {
			fRequestor.exitModule(script.sourceEnd());
		}
		// final TypeInferencer2 inferencer = createInferencer();
		// inferencer.setModelElement(module.getModelElement());
		// final StructureReporter reporter = new StructureReporter(inferencer,
		// fRequestor);
		// inferencer.setVisitor(reporter);
		// IValueCollection collection = inferencer.doInferencing(script);
		// reporter.beginReporting();
		// reporter.processScope(collection, true);
		// reporter.endReporting(script.sourceEnd());
	}

	protected Script parse(IModuleSource module) {
		return JavaScriptParserUtil.parse(module, fReporter);
	}

	protected TypeInferencer2 createInferencer() {
		return new TypeInferencer2();
	}

}
