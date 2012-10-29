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

import static org.eclipse.dltk.javascript.typeinfo.RTypes.any;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.dltk.javascript.internal.core.RRecordMember;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Member;

class RRecordType extends RType implements IRRecordType {

	private final Map<String, IRRecordMember> members = new LinkedHashMap<String, IRRecordMember>();

	public RRecordType(ITypeSystem context, Collection<Member> members) {
		for (Member member : members) {
			final JSType type = member.getType();
			this.members.put(
					member.getName(),
					new RRecordMember(member.getName(), type != null ? RTypes
							.create(context, type) : any(), member));
		}
	}

	public RRecordType(Collection<IRRecordMember> members) {
		for (IRRecordMember member : members) {
			this.members.put(member.getName(), member);
		}
	}

	public String getName() {
		final StringBuilder sb = new StringBuilder();
		sb.append('{');
		for (IRRecordMember member : members.values()) {
			if (sb.length() > 1) {
				sb.append(',');
			}
			sb.append(member.getName());
			if (member.getType() != RTypes.any()) {
				sb.append(':');
				sb.append(member.getType().getName());
			}
		}
		sb.append('}');
		return sb.toString();
	}

	public IRRecordMember getMember(String name) {
		return members.get(name);
	}

	public Collection<IRRecordMember> getMembers() {
		return members.values();
	}

	public TypeCompatibility isAssignableFrom(IRType type) {
		if (super.isAssignableFrom(type).ok()) {
			return TypeCompatibility.TRUE;
		}
		if (type instanceof RRecordType) {
			final Map<String, IRRecordMember> others = ((RRecordType) type).members;
			for (Map.Entry<String, IRRecordMember> entry : others.entrySet()) {
				final IRRecordMember member = members.get(entry.getKey());
				if (member == null) {
					return TypeCompatibility.FALSE;
				}
				if (!member.getType()
						.isAssignableFrom(entry.getValue().getType()).ok()) {
					return TypeCompatibility.FALSE;
				}
			}
			for (Map.Entry<String, IRRecordMember> entry : members.entrySet()) {
				if (!entry.getValue().isOptional()
						&& !others.containsKey(entry.getKey())) {
					return TypeCompatibility.FALSE;
				}
			}
			return TypeCompatibility.TRUE;
		}
		return TypeCompatibility.FALSE;
	}

	@Override
	public int hashCode() {
		return members.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RRecordType) {
			final RRecordType other = (RRecordType) obj;
			return members.equals(other.members);
		}
		return false;
	}

}
