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
package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;

class FieldDeclaration extends Declaration {

	/**
	 * @param child
	 */
	public FieldDeclaration(String childName, IValueReference child) {
		super(childName, child);
	}

	@Override
	public void report(StructureReporter reporter, boolean allowFields) {
		final ReferenceLocation location = child.getLocation();
		if (allowFields) {
			reporter.removeReference(childName, location.getNameStart(),
					location.getNameEnd());
			reporter.reportRefs(location.getDeclarationStart());
			final FieldInfo fi = new FieldInfo();
			fi.name = childName;
			fi.type = extractType(child);
			copyLocation(location, fi);
			reporter.fRequestor.enterField(fi);
		}
		reporter.processScope(child, false);
		if (allowFields) {
			reporter.fRequestor.exitField(location.getDeclarationEnd());
		}
	}

}
