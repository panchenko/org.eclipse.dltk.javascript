/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.dltk.utils.CompoundIterator;

public class TypeMemberQuery implements Iterable<Member> {

	private static class QueueItem {
		final Type type;
		final MemberPredicate predicate;

		public QueueItem(Type type, MemberPredicate predicate) {
			this.type = type;
			this.predicate = predicate;
		}

		@Override
		public int hashCode() {
			return type.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof QueueItem) {
				final QueueItem other = (QueueItem) obj;
				return type.equals(other.type)
						&& predicate.equals(other.predicate);
			}
			return false;
		}

		@Override
		public String toString() {
			return predicate + ":" + type;
		}

	}

	private final List<QueueItem> types = new ArrayList<QueueItem>();

	public TypeMemberQuery() {
	}

	public TypeMemberQuery(Type type) {
		add(type);
	}

	public TypeMemberQuery(Type type, MemberPredicate predicate) {
		add(type, predicate);
	}

	public void add(Type type) {
		add(type, MemberPredicate.ALWAYS_TRUE);
	}

	public void add(Type type, MemberPredicate predicate) {
		types.add(new QueueItem(type, predicate));
	}

	protected boolean isValid(Type type) {
		return true;
	}

	private class TypeIterator extends CompoundIterator<QueueItem> {
		private final Set<QueueItem> visited = new HashSet<QueueItem>();
		private final List<QueueItem> queue = new ArrayList<QueueItem>();
		private final List<QueueItem> skipQueue = new ArrayList<QueueItem>();

		public TypeIterator() {
			queue.addAll(types);
			current = queue.iterator();
		}

		private boolean canVisit(QueueItem item) {
			return visited.add(item);
		}

		protected boolean fetchNext() {
			if (!skipQueue.isEmpty()) {
				queue.addAll(skipQueue);
				skipQueue.clear();
			}
			if (!queue.isEmpty()) {
				final QueueItem[] copy = queue.toArray(new QueueItem[queue
						.size()]);
				queue.clear();
				for (QueueItem item : copy) {
					final Type type = item.type;
					final Type superType = type.getSuperType();
					if (superType != null) {
						final QueueItem superItem = new QueueItem(superType,
								item.predicate);
						if (canVisit(superItem) && isValid(superType)) {
							queue.add(superItem);
						}
					}
					for (Type trait : type.getTraits()) {
						final QueueItem traitItem = new QueueItem(trait,
								item.predicate);
						if (canVisit(traitItem) && isValid(trait)) {
							queue.add(traitItem);
						}
					}
				}
				current = queue.iterator();
				return current.hasNext();
			}
			return false;
		}
	}

	private class MemberIterator extends CompoundIterator<Member> {

		private final TypeIterator typeIterator;

		public MemberIterator() {
			typeIterator = new TypeIterator();
			current = Collections.<Member> emptyList().iterator();
		}

		protected Collection<Member> filter(Collection<Member> members) {
			return members;
		}

		@Override
		protected boolean fetchNext() {
			while (typeIterator.hasNext()) {
				final QueueItem item = typeIterator.next();
				if (item.predicate == MemberPredicate.ALWAYS_TRUE) {
					current = filter(item.type.getMembers()).iterator();
				} else {
					final List<Member> filtered = new ArrayList<Member>(
							item.type.getMembers().size());
					for (Member member : item.type.getMembers()) {
						if (item.predicate.evaluate(member)) {
							filtered.add(member);
						}
					}
					current = filter(filtered).iterator();
				}
				if (current.hasNext()) {
					return true;
				}
			}
			return false;
		}

	}

	public Iterator<Member> iterator() {
		return new MemberIterator();
	}

	private class IgnoreDuplicateMemberIterator extends MemberIterator {

		private final Set<Object> processed = new HashSet<Object>();

		public IgnoreDuplicateMemberIterator(Collection<String> ignoreMembers) {
			if (ignoreMembers != null) {
				processed.addAll(ignoreMembers);
			}
		}

		@Override
		protected Collection<Member> filter(Collection<Member> members) {
			final List<Member> result = new ArrayList<Member>();
			for (Member member : members) {
				if (processed.add(MethodKey.createKey(member))) {
					result.add(member);
				}
			}
			return result;
		}
	}

	private static class MethodKey {
		final String name;
		final String signature;

		/**
		 * @param name
		 */
		public MethodKey(Method method) {
			this.name = method.getName();
			StringBuilder sb = new StringBuilder();
			for (Parameter parameter : method.getParameters()) {
				final JSType paramType = parameter.getType();
				if (paramType != null) {
					sb.append(paramType.getName());
				}
				sb.append(',');
			}
			this.signature = sb.toString();
		}

		@Override
		public int hashCode() {
			return name.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof MethodKey) {
				final MethodKey other = (MethodKey) obj;
				return name.equals(other.name)
						&& signature.equals(other.signature);
			}
			return false;
		}

		protected static Object createKey(Member member) {
			if (member instanceof Method && member.getDeclaringType() != null
					&& member.getDeclaringType().getKind() == TypeKind.JAVA) {
				return new MethodKey((Method) member);
			} else {
				return member.getName();
			}
		}

	}

	/**
	 * Iterates over type members skipping overloaded methods
	 */
	public Iterable<Member> ignoreDuplicates() {
		return ignoreDuplicates(null);
	}

	/**
	 * Iterates over type members skipping overloaded methods and also skipping
	 * the specified members
	 * 
	 * @param ignoreMembers
	 *            member names to skip or <code>null</code> if nothing to skip
	 */
	public Iterable<Member> ignoreDuplicates(
			final Collection<String> ignoreMembers) {
		return new Iterable<Member>() {
			public Iterator<Member> iterator() {
				return new IgnoreDuplicateMemberIterator(ignoreMembers);
			}
		};
	}

	public Member findMember(String memberName) {
		for (Member member : this) {
			if (memberName.equals(member.getName())) {
				return member;
			}
		}
		return null;
	}

	public boolean contains(Type type) {
		for (QueueItem item : types) {
			if (type == item.type) {
				return true;
			}
		}
		return false;
	}

}
