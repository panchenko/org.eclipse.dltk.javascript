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
package org.eclipse.dltk.internal.javascript.validation;

import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.IRMember;
import org.eclipse.dltk.javascript.validation.IMemberValidationEvent;

public class MemberValidationEvent implements IMemberValidationEvent {

	private IValueReference reference;
	private IRMember member;
	private boolean memberEvaluated;

	public IValueReference getReference() {
		return reference;
	}

	public IRMember getRMember() {
		if (!memberEvaluated) {
			member = (IRMember) reference
					.getAttribute(IReferenceAttributes.R_METHOD);
			if (member == null) {
				member = (IRMember) reference
						.getAttribute(IReferenceAttributes.R_VARIABLE);
			}
			memberEvaluated = true;
		}
		return member;
	}

	public void set(IValueReference reference, IRMember member) {
		this.reference = reference;
		this.member = member;
		this.memberEvaluated = member != null;
	}

}
