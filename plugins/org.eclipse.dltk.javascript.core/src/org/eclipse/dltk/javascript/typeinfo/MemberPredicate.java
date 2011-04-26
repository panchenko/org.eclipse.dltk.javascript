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
package org.eclipse.dltk.javascript.typeinfo;

import org.eclipse.dltk.core.Predicate;
import org.eclipse.dltk.javascript.typeinfo.model.Member;

public enum MemberPredicate implements Predicate<Member> {
	STATIC {
		public boolean evaluate(Member member) {
			return member.isStatic();
		}
	},
	NON_STATIC {
		public boolean evaluate(Member member) {
			return !member.isStatic();
		}
	},
	ALWAYS_TRUE {
		public boolean evaluate(Member member) {
			return true;
		}
	};
}
