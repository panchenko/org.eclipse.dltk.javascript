/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.core;

import java.util.Collections;
import java.util.Set;

import org.eclipse.dltk.compiler.problem.IProblemCategory;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.javascript.typeinfo.IRFunctionType;
import org.eclipse.dltk.javascript.typeinfo.IRMethod;
import org.eclipse.dltk.javascript.typeinfo.IRRecordMember;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.IRTypeDeclaration;
import org.eclipse.dltk.javascript.typeinfo.model.Visibility;

public class RRecordMemberFunction implements IRRecordMember {

	private final String name;
	private final IRFunctionType type;
	private final IRMethod method;

	public RRecordMemberFunction(String name, IRFunctionType type,
			IRMethod method) {
		this.name = name;
		this.type = type;
		this.method = method;
	}

	public String getName() {
		return name;
	}

	public IRType getType() {
		return type;
	}

	public boolean isOptional() {
		return false;
	}

	@Override
	public String toString() {
		return name + ":" + type;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RRecordMemberFunction) {
			final RRecordMemberFunction other = (RRecordMemberFunction) obj;
			return name.equals(other.name) && type.equals(other.type);
		}
		return false;
	}

	public Visibility getVisibility() {
		return Visibility.PUBLIC;
	}

	public IRTypeDeclaration getDeclaringType() {
		return null;
	}

	public boolean isStatic() {
		return false;
	}

	public boolean isVisible() {
		return true;
	}

	public Set<IProblemCategory> getSuppressedWarnings() {
		return Collections.emptySet();
	}

	public boolean isSuppressed(IProblemIdentifier problemIdentifier) {
		return false;
	}

	public boolean isDeprecated() {
		return method.isDeprecated();
	}

	public Object getSource() {
		return method;
	}
}
