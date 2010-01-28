/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.typeinference;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class HostCollection {

	public static final int FUNCTION = 1;
	public static final int NORMAL = 0;

	private final HostCollection parent;
	private final Map<Object, Object> reference = new HashMap<Object, Object>();
	private final int type;
	private final String name;

	public IReference getReference(String key) {
		IReference reference2 = (IReference) reference.get(key);
		if (reference2 == null)
			if (parent != null)
				return parent.getReference(key);
		return reference2;
	}

	private static class Bracket {
		final char ch;
		final int position;

		public Bracket(char ch, int position) {
			this.ch = ch;
			this.position = position;
		}

	}

	public static String parseCompletionString(String id,
			boolean dotBeforeBrackets) {
		StringBuffer sb = new StringBuffer();
		int start = 0;
		int current = id.length();
		final Stack<Bracket> inBrackStack = new Stack<Bracket>();
		boolean inStringSingle = false;
		boolean inStringDouble = false;
		for (int i = id.length(); --i >= 0;) {
			char c = id.charAt(i);
			if (c == '\'') {
				if (inStringSingle) {
					inStringSingle = false;
					continue;
				}
				// end of a string try to skip this.
				if (!inStringDouble)
					inStringSingle = true;
			}
			if (c == '\"') {
				if (inStringDouble) {
					inStringDouble = false;
					continue;
				}
				// end of a string try to skip this.
				if (!inStringSingle)
					inStringDouble = true;
			}
			if (inStringSingle || inStringDouble)
				continue;

			if (c == ']') {
				if (inBrackStack.isEmpty()) {
					String brackets = "[]";
					if (dotBeforeBrackets && i > 0
							&& ((i - 2) < 0 || id.charAt(i - 2) != '.')) {
						brackets = ".[]";
					}
					sb.insert(0, brackets + id.substring(i + 1, current));
				}
				inBrackStack.push(new Bracket('[', i));
				continue;
			}
			if (c == ')') {
				if (inBrackStack.isEmpty()) {
					sb.insert(0, id.substring(i + 1, current));
				}
				inBrackStack.push(new Bracket('(', i));
				continue;
			}
			if (c == '[' || c == '(') {
				if (inBrackStack.isEmpty()) {
					if (i + 1 < id.length() && id.charAt(i + 1) == c) {
						// illegal code like [[xx]. try best guess
						id = id.substring(0, i) + id.substring(i + 1);
						return parseCompletionString(id, dotBeforeBrackets);
					}
					return id.substring(i + 1, current) + sb.toString();
				}
				if (c == inBrackStack.peek().ch) {
					current = i;
					inBrackStack.pop();
				}
				continue;
			}
			if (c != '.'
					&& c != ':'
					&& inBrackStack.isEmpty()
					&& (Character.isWhitespace(c) || !Character
							.isJavaIdentifierPart(c))) {
				start = i + 1;
				break;
			}
		}
		if (start == 0 && current == id.length() && inBrackStack.isEmpty())
			return id;
		if (!inBrackStack.isEmpty()) { // illegal code like []]
			Bracket last = inBrackStack.pop();
			id = id.substring(start, last.position)
					+ id.substring(last.position + 1, id.length());
			return parseCompletionString(id, dotBeforeBrackets);
		}
		sb.insert(0, id.substring(start, current));
		return sb.toString();
	}

	public Set<IReference> queryElements(String completion, boolean useGlobal) {
		completion = parseCompletionString(completion, false);

		IReference r = getReference(completion);
		Set<IReference> res = new HashSet<IReference>();
		if (r != null) {
			res.add(r);
			return res;
		}
		int pos = completion.indexOf('.');
		if (pos == -1)
			return res;
		String rootName = completion.substring(0, pos);
		r = getReference(rootName);
		pos += 1;
		String field;
		while (pos != 0) {
			if (r == null)
				return new HashSet<IReference>();
			int k = completion.indexOf('.', pos);
			if (k == -1)
				field = completion.substring(pos);
			else
				field = completion.substring(pos, k);
			r = r.getChild(field, useGlobal);
			pos = k + 1;
		}
		if (r == null)
			return res;
		res.add(r);
		return res;
	}

	public HostCollection() {
		this(null, null, NORMAL);
	}

	public HostCollection(HostCollection parent) {
		this(parent, null, NORMAL);
	}

	public HostCollection(HostCollection parent, String name, int type) {
		this.parent = parent;
		this.name = name;
		this.type = type;
	}

	public Map getReferences() {
		return reference;
	}

	public void write(String key, IReference ref) {
		if (ref == null)
			throw new IllegalArgumentException();
		reference.put(key, ref);
	}

	public void add(String key, IReference ref) {
		if (ref == null)
			throw new IllegalArgumentException();
		Object object = reference.get(key);
		if (object == null) {
			reference.put(key, ref);
		} else if (object != ref) {
			if (object instanceof CombinedOrReference) {
				((CombinedOrReference) object).addReference(ref);
				return;
			} else if (ref instanceof TransparentRef) {
				if (((TransparentRef) ref).evaluateReference == object) {
					reference.put(key, ref);
					return;
				}
			}

			if (object instanceof TransparentRef
					&& ((TransparentRef) object).evaluateReference instanceof CombinedOrReference) {
				((CombinedOrReference) ((TransparentRef) object).evaluateReference)
						.addReference(ref);
				return;
			} else if (ref instanceof CombinedOrReference) {
				((CombinedOrReference) ref).addReference((IReference) object);
			} else {
				CombinedOrReference cor = new CombinedOrReference();
				cor.addReference(ref);
				cor.addReference((IReference) object);
				ref = cor;
			}

			reference.put(key, ref);
		}
	}

	public void oneOf(String key, IReference ref, IReference other) {
		if (ref == null)
			throw new IllegalArgumentException();
		if (other == null)
			throw new IllegalArgumentException();
		if (ref.isChildishReference() || other.isChildishReference()) {
			add(key, ref);
			add(key, other);
		} else {
			if (ref instanceof CombinedOrReference) {
				CombinedOrReference orReference = ((CombinedOrReference) ref);
				orReference.addReference(other);
				reference.put(key, ref);
			} else if (other instanceof CombinedOrReference) {
				CombinedOrReference orReference = ((CombinedOrReference) other);
				orReference.addReference(ref);
				reference.put(key, other);
			} else {
				CombinedOrReference cor = new CombinedOrReference();
				cor.addReference(ref);
				cor.addReference(other);
				reference.put(key, cor);
			}
		}
	}

	public HostCollection getParent() {
		return parent;
	}

	public void mergeIf(HostCollection cl) {

		Iterator i = cl.reference.keySet().iterator();
		while (i.hasNext()) {

			Object next = i.next();
			if (next instanceof String) {
				String s = (String) next;
				IReference rm = (IReference) cl.reference.get(s);
				add(s, rm);
			}
		}
		cl.pach(this);
	}

	public void mergeElseIf(HostCollection cl, HostCollection cl1) {

		HashSet sm = new HashSet(cl.reference.keySet());
		sm.retainAll(cl1.reference.keySet());
		Iterator i = sm.iterator();
		while (i.hasNext()) {
			String s = (String) i.next();
			IReference rm = (IReference) cl.reference.get(s);
			IReference rm1 = (IReference) cl1.reference.get(s);
			oneOf(s, rm, rm1);
		}
		cl1.pach(this);
		cl.pach(this);
	}

	public void override(HostCollection other) {
		reference.putAll(other.reference);
	}

	public void setReference(String objId, IReference root) {
		this.reference.put(objId, root);
	}

	public IReference getReferenceNoParentContext(String rootName) {
		return (IReference) this.reference.get(rootName);
	}

	public IReference queryElement(String key, boolean useGlobal) {
		Set<IReference> queryElement = this.queryElements(key, useGlobal);
		if (queryElement.isEmpty())
			return null;
		return queryElement.iterator().next();
	}

	private Set<TransparentRef> transparent = new HashSet<TransparentRef>();

	public void addTransparent(TransparentRef transparentRef) {
		transparent.add(transparentRef);
	}

	private void pach(HostCollection col) {
		Iterator iterator = transparent.iterator();
		while (iterator.hasNext()) {
			TransparentRef next = (TransparentRef) iterator.next();
			next.patchRef(col);
		}
	}

	public void recordDelete(String objId) {
		reference.remove(objId);
	}

	public String getName() {
		return name;
	}

	public int getType() {
		return type;
	}

	public void recordFunction(Object function, HostCollection collection) {
		reference.put(function, collection);
	}

	public HostCollection getFunction(Object funObject) {
		return (HostCollection) reference.get(funObject);
	}

	@Override
	public String toString() {
		return "HostCollection(" + (name != null ? name : "") + ")";
	}
}
