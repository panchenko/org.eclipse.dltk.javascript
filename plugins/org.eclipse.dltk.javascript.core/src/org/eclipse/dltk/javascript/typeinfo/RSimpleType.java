/*******************************************************************************
 * Copyright (c) 2011,2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinfo;

import org.eclipse.dltk.annotations.NonNull;
import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;

public class RSimpleType extends RType implements IRSimpleType {

	@NonNull
	private final IRTypeDeclaration declaration;

	protected RSimpleType(ITypeSystem typeSystem, Type target) {
		super(typeSystem);
		assert target != null;
		if (DEBUG)
			checkType(target);
		this.declaration = convert(target);
	}

	protected RSimpleType(Type type) {
		this(null, type);
	}

	protected RSimpleType(ITypeSystem typeSystem, IRTypeDeclaration declaration) {
		super(typeSystem);
		assert declaration != null;
		this.declaration = declaration;
	}

	protected RSimpleType(IRTypeDeclaration declaration) {
		this.declaration = declaration;
	}

	public String getName() {
		return declaration.getName();
	}

	public Type getTarget() {
		return declaration.getSource();
	}

	public IRTypeDeclaration getDeclaration() {
		return declaration;
	}

	@Override
	public int hashCode() {
		return declaration.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final RSimpleType other = (RSimpleType) obj;
		return declaration.equals(other.declaration);
	}

	@Override
	public TypeCompatibility isAssignableFrom(IRType type) {
		if (super.isAssignableFrom(type).ok()) {
			return TypeCompatibility.TRUE;
		} else if (Types.OBJECT == this.declaration.getSource()) {
			return TypeCompatibility.valueOf(type.isJavaScriptObject());
		} else if (type instanceof RSimpleType) {
			final IRTypeDeclaration other = ((RSimpleType) type)
					.getDeclaration();
			return declaration.isAssignableFrom(other);
		}
		return testAssignableTo(type);
	}

	@Override
	public boolean isJavaScriptObject() {
		final TypeKind kind = declaration.getSource().getKind();
		return kind == TypeKind.PREDEFINED || kind == TypeKind.JAVASCRIPT;
	}

	@Override
	public IRType transform(IRTypeTransformer function) {
		final IRTypeDeclaration value = function.transform(declaration);
		if (value != declaration) {
			return new RSimpleType(value);
		} else {
			return this;
		}
	}
}
