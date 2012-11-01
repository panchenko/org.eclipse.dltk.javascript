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
package org.eclipse.dltk.javascript.typeinference;

import java.text.MessageFormat;

import org.eclipse.dltk.annotations.Internal;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceNode;
import org.eclipse.dltk.javascript.typeinfo.ReferenceSource;

public abstract class ReferenceLocation {

	/**
	 * Returns the source of this file, not <code>null</code>
	 * 
	 * @return
	 */
	public abstract ReferenceSource getSource();

	/**
	 * Returns the source module of this location, or <code>null</code>.
	 * 
	 * It's a helper method delegating to getSource()
	 * 
	 * @return
	 */
	public ISourceModule getSourceModule() {
		return getSource().getSourceModule();
	}

	public abstract int getDeclarationStart();

	public abstract int getDeclarationEnd();

	public abstract int getNameStart();

	public abstract int getNameEnd();

	public static final ReferenceLocation UNKNOWN = new Unknown();

	@Internal
	static class Unknown extends ReferenceLocation {
		@Override
		public ReferenceSource getSource() {
			return ReferenceSource.UNKNOWN;
		}

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
			return "UNKNOWN"; //$NON-NLS-1$
		}
	}

	private static class SimpleLocation extends ReferenceLocation {

		private final ReferenceSource source;
		private final int declarationStart;
		private final int declarationEnd;
		private final int nameStart;
		private final int nameEnd;

		public SimpleLocation(ReferenceSource source, int declarationStart,
				int declarationEnd, int nameStart, int nameEnd) {
			this.source = source;
			this.declarationStart = declarationStart;
			this.declarationEnd = declarationEnd;
			this.nameStart = nameStart;
			this.nameEnd = nameEnd;
		}

		@Override
		public ReferenceSource getSource() {
			return source;
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
			return source + MessageFormat.format("[{0}..{1},{2}..{3}]", //$NON-NLS-1$
					declarationStart, declarationEnd, nameStart, nameEnd);
		}
	}

	private static class RangeLocation extends ReferenceLocation {
		private final ReferenceSource source;
		private final int start;
		private final int end;

		public RangeLocation(ReferenceSource source, int start, int end) {
			this.source = source;
			this.start = start;
			this.end = end;
		}

		@Override
		public ReferenceSource getSource() {
			return source;
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
			return source + "[" + start + ".." + end + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}

	}

	/**
	 * @param declarationStart
	 * @param declarationEnd
	 * @param nameStart
	 * @param nameEnd
	 * @return
	 */
	public static ReferenceLocation create(ReferenceSource source,
			int declarationStart, int declarationEnd, int nameStart, int nameEnd) {
		return new SimpleLocation(source, declarationStart, declarationEnd,
				nameStart, nameEnd);
	}

	public static ReferenceLocation create(ReferenceSource source,
			int declarationStart, int declarationEnd, ISourceNode nameNode) {
		return create(source, declarationStart, declarationEnd,
				nameNode.start(), nameNode.end());
	}

	public static ReferenceLocation create(ReferenceSource source, int start,
			int end) {
		return new RangeLocation(source, start, end);
	}

}
