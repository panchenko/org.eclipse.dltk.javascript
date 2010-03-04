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

import org.eclipse.dltk.compiler.IElementRequestor.ElementInfo;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

abstract class Declaration implements Comparable<Declaration> {

	final String childName;
	final IValueReference child;

	public Declaration(String childName, IValueReference child) {
		this.childName = childName;
		this.child = child;
	}

	public int compareTo(Declaration o) {
		return child.getLocation().getNameStart()
				- o.child.getLocation().getNameStart();
	}

	abstract void report(StructureReporter reporter);

	protected static String extractType(IValueReference reference) {
		return reference != null ? extractType(reference.getDeclaredType())
				: null;
	}

	protected static String extractType(final Type type) {
		return type != null ? type.getName() : null;
	}

	/**
	 * @param location
	 * @param info
	 */
	protected static void copyLocation(ReferenceLocation location,
			ElementInfo info) {
		info.declarationStart = location.getDeclarationStart();
		info.nameSourceStart = location.getNameStart();
		info.nameSourceEnd = location.getNameEnd() - 1;
	}

}
