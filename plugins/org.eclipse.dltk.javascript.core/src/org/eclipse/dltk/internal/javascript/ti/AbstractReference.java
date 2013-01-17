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
package org.eclipse.dltk.internal.javascript.ti;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.dltk.internal.javascript.validation.JavaScriptValidations;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IRIValueType;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet;

public abstract class AbstractReference implements IValueReference,
		IValueProvider {

	public abstract IValue getValue();

	public abstract IValue createValue();

	public void setValue(IValueReference value) {
		IValue val = createValue();
		if (val != null && value != null) {
			IValue src = ((IValueProvider) value).getValue();
			if (src == PhantomValue.VALUE) {
				if (val.getDeclaredTypes().isEmpty()) {
					val.addReference(src);
				}
				return;
			}
			if (src == null) {
				src = new LazyReferenceValue(value);
				val.addReference(src);
				return;
			}
			val.clear();
			if (src instanceof Value && ((IValueProvider) value).isReference()
					|| value.isParentOf(this)) {
				val.addReference(src);
			} else {
				val.addValue(src);
			}
		}
	}

	public void addValue(IValueReference value, boolean copy) {
		IValue val = createValue();
		if (val != null && value != null) {
			IValue src = ((IValueProvider) value).getValue();
			if (src == PhantomValue.VALUE) {
				if (val.getDeclaredTypes().isEmpty()) {
					val.addReference(src);
				}
				return;
			}
			if (src == null) {
				src = new LazyReferenceValue(value);
				val.addReference(src);
				return;
			}
			if (!copy || src instanceof Value
					&& ((IValueProvider) value).isReference()
					|| value.isParentOf(this)) {
				val.addReference(src);
			} else {
				val.addValue(src);
			}
		}
	}

	public void removeReference(IValueReference reference) {
		IValue value = getValue();
		if (value != null && reference != null
				&& reference instanceof IValueProvider) {
			value.removeReference(((IValueProvider) reference).getValue());
		}
	}

	public boolean isParentOf(IValueReference anotherReference) {
		while (anotherReference != null) {
			if (this.equals(anotherReference)) {
				return true;
			}
			anotherReference = anotherReference.getParent();
		}
		return false;
	}

	public void clear() {
		IValue value = getValue();
		if (value != null) {
			value.clear();
		}
	}

	public boolean exists() {
		return getValue() != null;
	}

	public final Object getAttribute(String key) {
		return getAttribute(key, false);
	}

	public Object getAttribute(String key, boolean includeReferences) {
		IValue value = getValue();
		return value != null ? value.getAttribute(key, includeReferences)
				: null;
	}

	public IRType getDeclaredType() {
		IValue value = getValue();
		return value != null ? value.getDeclaredType() : null;
	}

	public JSTypeSet getDeclaredTypes() {
		IValue value = getValue();
		return value != null ? value.getDeclaredTypes() : JSTypeSet.emptySet();
	}

	public ReferenceKind getKind() {
		IValue value = getValue();
		return value != null ? value.getKind() : ReferenceKind.UNKNOWN;
	}

	public ReferenceLocation getLocation() {
		IValue value = getValue();
		return value != null ? value.getLocation() : ReferenceLocation.UNKNOWN;
	}

	public JSTypeSet getTypes() {
		IValue value = getValue();
		return value != null ? value.getTypes() : JSTypeSet.emptySet();
	}

	public void setAttribute(String key, Object value) {
		IValue val = createValue();
		if (val != null) {
			val.setAttribute(key, value);
		}
	}

	public void setDeclaredType(IRType type) {
		IValue value = createValue();
		if (value != null) {
			value.setDeclaredType(type);
		}
	}

	public void setKind(ReferenceKind kind) {
		IValue value = createValue();
		if (value != null) {
			value.setKind(kind);
		}
	}

	public void setLocation(ReferenceLocation location) {
		IValue value = createValue();
		if (value != null) {
			value.setLocation(location);
		}
	}

	public IValueReference getChild(String name) {
		return new ChildReference(this, name);
	}

	public IValueReference createChild(String name) {
		createValue().createChild(name, IValue.CREATE);
		return getChild(name);
	}

	public boolean hasChild(String name) {
		IValue value = getValue();
		return value != null && value.getChild(name, true) != null;
	}

	public Set<String> getDirectChildren() {
		final IValue value = getValue();
		return value != null ? value.getDirectChildren() : Collections
				.<String> emptySet();
	}

	public Set<String> getDeletedChildren() {
		final IValue value = getValue();
		return value != null ? value.getDeletedChildren() : Collections
				.<String> emptySet();
	}

	private final static class LazyReferenceValue extends Value implements
			ILazyValue {
		private final IValueReference reference;
		private boolean resolved = false;
		private boolean finalResolve;
		private boolean typeResolved;

		public LazyReferenceValue(IValueReference value) {
			this.reference = value;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof LazyReferenceValue) {
				return reference.equals(((LazyReferenceValue) obj).reference);
			}
			return false;
		}

		@Override
		public int hashCode() {
			return reference.hashCode();
		}

		public void resolve() {
			if (!resolved) {
				resolved = true;
				IValue value = ((IValueProvider) reference).getValue();
				if (value != null) {
					if (finalResolve && value instanceof Value) {
						((Value) value).resolveLazyValues(new HashSet<Value>());
					}
					if (value instanceof Value
							&& ((IValueProvider) reference).isReference()) {
						addReference(value);
					} else {
						addValue(value);
					}
				} else if (!reference.getName().equals(FUNCTION_OP)) {
					boolean resolvedToType = false;
					// if not already in the final resolve, try to look if it
					// did already resolve up the chain
					// to a value that already resolved to a type, if that is
					// the case then this lazy reference is
					// most likely just never going to hit on something known.
					if (!finalResolve && !typeResolved) {
						typeResolved = true;
						IValueReference parent = reference.getParent();
						while (parent != null) {
							IRType type = JavaScriptValidations.typeOf(parent);
							if (type != null) {
								resolvedToType = !(type instanceof IRIValueType);
								break;
							}
							parent = parent.getParent();
						}
					}
					resolved = finalResolve || resolvedToType;
				} else {
					resolved = false;
				}
			}
		}

		public void setFinalResolve() {
			finalResolve = true;
		}

		public String getLazyName() {
			return null;
		}

		public boolean isResolved() {
			return resolved;
		}

		@Override
		public String toString() {
			return "LazyReferenceValue[resolved:" + resolved + ",reference:"
					+ reference + ']';
		}

	}
}
