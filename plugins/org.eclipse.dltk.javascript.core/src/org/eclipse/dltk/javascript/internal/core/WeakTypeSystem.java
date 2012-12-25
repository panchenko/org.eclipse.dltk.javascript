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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.dltk.internal.javascript.ti.TypeSystemImpl;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.IRTypeDeclaration;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class WeakTypeSystem extends TypeSystemImpl {

	@Override
	public IRTypeDeclaration convert(Type type) {
		final IRTypeDeclaration result = super.convert(type);
		schedulePurge();
		return result;
	}

	@Override
	public IRTypeDeclaration parameterize(Type target, List<IRType> parameters) {
		final IRTypeDeclaration result = super.parameterize(target, parameters);
		schedulePurge();
		return result;
	}

	private volatile long lastSchedule;
	private Job purgeJob;

	private void schedulePurge() {
		final long now = System.currentTimeMillis();
		final long lastSchedule = this.lastSchedule;
		if (lastSchedule == 0 || now > lastSchedule + 1000) {
			this.lastSchedule = now;
			synchronized (this) {
				if (purgeJob == null) {
					purgeJob = new Job(getClass().getSimpleName() + " purge") {
						@Override
						protected IStatus run(IProgressMonitor monitor) {
							final TypeSystemStats stats = stats();
							reset();
							JavaScriptPlugin.warning(WeakTypeSystem.class
									.getSimpleName() + ".reset " + stats);
							return Status.OK_STATUS;
						}
					};
					purgeJob.setSystem(true);
				} else {
					purgeJob.cancel();
				}
				purgeJob.schedule(60 * 1000);
			}
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}
