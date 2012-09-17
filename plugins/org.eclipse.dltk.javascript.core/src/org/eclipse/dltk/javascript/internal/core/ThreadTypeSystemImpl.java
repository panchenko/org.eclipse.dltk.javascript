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

import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.dltk.internal.javascript.ti.IValue;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.typeinfo.AttributeKey;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem.ThreadTypeSystem;
import org.eclipse.dltk.javascript.typeinfo.ReferenceSource;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;

public class ThreadTypeSystemImpl extends ThreadLocal<ITypeSystem> implements
		ThreadTypeSystem {

	public ReferenceSource getCurrentSource() {
		final ITypeSystem ts = get();
		return ts instanceof TypeInferencer2 ? ((TypeInferencer2) ts)
				.getSource() : null;
	}

	public void runWith(ITypeSystem typeSystem, Runnable runnable) {
		final ITypeSystem saved = get();
		try {
			set(typeSystem);
			runnable.run();
		} finally {
			set(saved);
		}
	}

	public <V> V runWith(ITypeSystem typeSystem, Callable<V> callable)
			throws Exception {
		final ITypeSystem saved = get();
		try {
			set(typeSystem);
			return callable.call();
		} finally {
			set(saved);
		}
	}

	public static final ITypeSystem DELEGATING_TYPE_SYSTEM = new DelegatingTypeSystem();

	static class DelegatingTypeSystem implements ITypeSystem {

		private ITypeSystem current() {
			return ITypeSystem.CURRENT.get();
		}

		public IValue valueOf(Member member) {
			final ITypeSystem current = current();
			if (current != null) {
				return current.valueOf(member);
			} else {
				return null;
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

		public Type parameterize(Type target, List<IRType> parameters) {
			final ITypeSystem current = current();
			if (current != null) {
				return current.parameterize(target, parameters);
			} else {
				return target;
			}
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
	}

}
