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
package org.eclipse.dltk.javascript.core.tests.validation;

import java.util.Arrays;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.core.builder.IBuildContext;
import org.eclipse.dltk.core.builder.IBuildParticipant;

public class CompoundBuildParticipant implements IBuildParticipant {

	private final IBuildParticipant[] participants;

	public CompoundBuildParticipant(IBuildParticipant... participants) {
		this.participants = Arrays.copyOf(participants, participants.length);
	}

	public void build(IBuildContext context) throws CoreException {
		for (IBuildParticipant participant : participants) {
			participant.build(context);
		}
	}

}
