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
package org.eclipse.dltk.javascript.internal.core.codeassist;

public class PositionCalculator {

	private boolean isMember;
	private final String completion;

	// private final String completionPart;
	// private final String corePart;

	public PositionCalculator(String conString, int pos, boolean bothSides) {
		if (bothSides) {
			int maxPos = conString.length();
			if (pos < maxPos) {
				while (pos < maxPos) {
					char charAt = conString.charAt(pos);
					if (Character.isJavaIdentifierPart(charAt)) {
						pos++;
						continue;
					} else {
						break;
					}
				}
			} else
				pos = maxPos;
		}
		completion = conString.substring(0, pos);
		int lastDot = completion.lastIndexOf('.');
		if (lastDot != -1) {
			isMember = true;
			// completionPart = completion.substring(lastDot + 1);
			// corePart = completion.substring(0, lastDot);
		} else {
			isMember = false;
			// completionPart = completion;
			// corePart = completion;
		}
	}

	public String getCompletion() {
		return completion;
	}

	// public String getCompletionPart() {
	// return completionPart;
	// }
	//
	// public String getCorePart() {
	// return corePart;
	// }

	public boolean isMember() {
		return isMember;
	}
}
