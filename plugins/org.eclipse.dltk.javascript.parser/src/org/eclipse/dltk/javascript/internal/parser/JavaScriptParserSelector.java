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
package org.eclipse.dltk.javascript.internal.parser;

import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.DLTKPriorityContributionSelector;
import org.eclipse.dltk.core.IDLTKContributedExtension;

public class JavaScriptParserSelector extends DLTKPriorityContributionSelector {

	@Override
	public IDLTKContributedExtension select(
			IDLTKContributedExtension[] contributions, IProject project) {
		if (contributions.length == 1) {
			return contributions[0];
		} else if (project != null) {
			final String parserId = DLTKCore.create(project).getOption(
					DLTKCore.PROJECT_SOURCE_PARSER_ID, false);
			if (parserId != null) {
				for (IDLTKContributedExtension extension : contributions) {
					if (parserId.equals(extension.getId())) {
						return extension;
					}
				}
			}
		}
		return super.select(contributions, project);
	}

}
