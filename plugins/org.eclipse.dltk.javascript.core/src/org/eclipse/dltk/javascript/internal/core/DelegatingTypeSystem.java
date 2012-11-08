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

import static org.eclipse.dltk.javascript.internal.core.TypeSystems.WEAK_TYPE_SYSTEM;

import java.util.List;

import org.eclipse.dltk.internal.javascript.ti.IValue;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.typeinfo.AttributeKey;
import org.eclipse.dltk.javascript.typeinfo.IRMember;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.IRTypeDeclaration;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.dltk.javascript.typeinfo.model.TypeVariable;

class DelegatingTypeSystem implements ITypeSystem {

	private ITypeSystem current() {
		return ITypeSystem.CURRENT.get();
	}

	public IValue valueOf(IRMember member) {
		final ITypeSystem current = current();
		if (current != null) {
			return current.valueOf(member);
		} else {
			return null;
		}
	}

	public Type getKnownType(String typeName) {
		final ITypeSystem current = current();
		if (current != null) {
			return current.getKnownType(typeName);
		} else {
			return TypeInfoModelLoader.getInstance().getType(typeName);
		}
	}

	public Type resolveType(Type type) {
		if (type != null && type.isProxy()) {
			final ITypeSystem current = current();
			if (current != null) {
				if (current instanceof TypeInferencer2) {
					return ((TypeInferencer2) current).doResolveType(type);
				} else {
					return current.resolveType(type);
				}
			} else {
				final Type resolved = TypeInfoModelLoader.getInstance()
						.getType(type.getName());
				if (resolved != null) {
					return resolved;
				}
			}
		}
		return type;
	}

	public IRTypeDeclaration convert(Type type) {
		final ITypeSystem current = current();
		return (current != null ? current : WEAK_TYPE_SYSTEM).convert(type);
	}

	public IRTypeDeclaration parameterize(Type target, List<IRType> parameters) {
		final ITypeSystem current = current();
		return (current != null ? current : WEAK_TYPE_SYSTEM).parameterize(
				target, parameters);
	}

	public <E extends IRMember> E contextualize(E member, IRTypeDeclaration type) {
		final ITypeSystem current = current();
		return (current != null ? current : WEAK_TYPE_SYSTEM).contextualize(
				member, type);
	}

	public <T> T getAttribute(AttributeKey<T> key) {
		final ITypeSystem current = current();
		return current != null ? current.getAttribute(key) : null;
	}

	public Object getValue(Object key) {
		final ITypeSystem current = current();
		return current != null ? current.getValue(key) : null;
	}

	public void setValue(Object key, Object value) {
		final ITypeSystem current = current();
		if (current != null) {
			current.setValue(key, value);
		}
	}

	public IRType contextualize(IRType type, IRTypeDeclaration contextType) {
		final ITypeSystem current = current();
		return (current != null ? current : WEAK_TYPE_SYSTEM).contextualize(
				type, contextType);
	}

	public IRType getTypeVariable(TypeVariable variable) {
		final ITypeSystem current = current();
		return current != null ? current.getTypeVariable(variable) : null;
	}

	public ITypeSystem getPrimary() {
		final ITypeSystem current = current();
		return current != null ? current : WEAK_TYPE_SYSTEM;
	}

}
