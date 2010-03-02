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
package org.eclipse.dltk.internal.javascript.ti;

public abstract class ReferenceLocation {

	public abstract int getDeclarationStart();

	public abstract int getDeclarationEnd();

	public abstract int getNameStart();

	public abstract int getNameEnd();

	public static final ReferenceLocation UNKNOWN = new ReferenceLocation() {

		@Override
		public int getNameStart() {
			return 0;
		}

		@Override
		public int getNameEnd() {
			return 0;
		}

		@Override
		public int getDeclarationStart() {
			return 0;
		}

		@Override
		public int getDeclarationEnd() {
			return 0;
		}

		@Override
		public String toString() {
			return "UNKNOWN";
		}
	};

	private static class SimpleLocation extends ReferenceLocation {

		private final int declarationStart;
		private final int declarationEnd;
		private final int nameStart;
		private final int nameEnd;

		public SimpleLocation(int declarationStart, int declarationEnd,
				int nameStart, int nameEnd) {
			this.declarationStart = declarationStart;
			this.declarationEnd = declarationEnd;
			this.nameStart = nameStart;
			this.nameEnd = nameEnd;
		}

		@Override
		public int getDeclarationEnd() {
			return declarationEnd;
		}

		@Override
		public int getDeclarationStart() {
			return declarationStart;
		}

		@Override
		public int getNameEnd() {
			return nameEnd;
		}

		@Override
		public int getNameStart() {
			return nameStart;
		}

		@Override
		public String toString() {
			return "[" + declarationStart + ".." + declarationEnd + ","
					+ nameStart + ".." + nameEnd + "]";
		}

	}

	private static class RangeLocation extends ReferenceLocation {

		private final int start;
		private final int end;

		public RangeLocation(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int getDeclarationEnd() {
			return end;
		}

		@Override
		public int getDeclarationStart() {
			return start;
		}

		@Override
		public int getNameEnd() {
			return end;
		}

		@Override
		public int getNameStart() {
			return start;
		}

		@Override
		public String toString() {
			return "[" + start + ".." + end + "]";
		}

	}

	/**
	 * @param declarationStart
	 * @param declarationEnd
	 * @param nameStart
	 * @param nameEnd
	 * @return
	 */
	public static ReferenceLocation create(int declarationStart,
			int declarationEnd, int nameStart, int nameEnd) {
		return new SimpleLocation(declarationStart, declarationEnd, nameStart,
				nameEnd);
	}

	public static ReferenceLocation create(int start, int end) {
		return new RangeLocation(start, end);
	}
}
