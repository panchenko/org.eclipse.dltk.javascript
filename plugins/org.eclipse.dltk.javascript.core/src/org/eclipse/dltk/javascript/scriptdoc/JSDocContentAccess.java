/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.scriptdoc;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.compiler.InvalidInputException;
import org.eclipse.dltk.core.IBuffer;
import org.eclipse.dltk.core.IBufferChangedListener;
import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IModelElementVisitor;
import org.eclipse.dltk.core.IOpenable;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.ISourceReference;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.SourceRange;
import org.eclipse.dltk.javascript.ast.MultiLineComment;

/**
 * @noextend This class is not intended to be subclassed by clients.
 * @noinstantiate This class is not intended to be instantiated by clients.
 */
public class JSDocContentAccess {

	private static class PreviousMemberDetector implements IModelElementVisitor {

		private int currentEnd = 0;
		private final IMember target;
		private final int targetStart;
		private final int targetEnd;

		public PreviousMemberDetector(IMember target, int targetStart,
				int targetEnd) {
			this.target = target;
			this.targetStart = targetStart;
			this.targetEnd = targetEnd;
		}

		public boolean visit(IModelElement element) {
			if (!element.equals(target) && element instanceof ISourceReference) {
				try {
					final ISourceRange range = ((ISourceReference) element)
							.getSourceRange();
					if (SourceRange.isAvailable(range)) {
						final int end = range.getOffset() + range.getLength();
						if (end < targetStart && end > currentEnd) {
							currentEnd = end;
						} else if (range.getOffset() <= targetStart
								&& end >= targetEnd
								&& range.getOffset() > currentEnd) {
							currentEnd = range.getOffset();
						}
					}
				} catch (ModelException e) {
					// ignore
				}
			}
			return true;
		}

		public static int execute(int start, int end, IMember member) {
			final PreviousMemberDetector detector = new PreviousMemberDetector(
					member, start, end);
			try {
				member.getSourceModule().accept(detector);
			} catch (ModelException e) {
				// ignore
			}
			return detector.currentEnd;
		}
	}

	private static class SimpleBuffer implements IBuffer {

		private final StringBuilder sb = new StringBuilder();

		public SimpleBuffer(String value) {
			sb.append(value);
		}

		public void addBufferChangedListener(IBufferChangedListener listener) {
		}

		public void append(char[] text) {
			sb.append(text);
		}

		public void append(String text) {
			sb.append(text);
		}

		public void close() {
		}

		public char getChar(int position) {
			return sb.charAt(position);
		}

		public char[] getCharacters() {
			return sb.toString().toCharArray();
		}

		public String getContents() {
			return sb.toString();
		}

		public int getLength() {
			return sb.length();
		}

		public IOpenable getOwner() {
			return null;
		}

		public String getText(int offset, int length) {
			return sb.substring(offset, offset + length);
		}

		public IResource getUnderlyingResource() {
			return null;
		}

		public boolean hasUnsavedChanges() {
			return false;
		}

		public boolean isClosed() {
			return false;
		}

		public boolean isReadOnly() {
			return true;
		}

		public void removeBufferChangedListener(IBufferChangedListener listener) {
		}

		public void replace(int position, int length, char[] text) {
			sb.replace(position, position + length, new String(text));
		}

		public void replace(int position, int length, String text) {
			sb.replace(position, position + length, text);
		}

		public void save(IProgressMonitor progress, boolean force)
				throws ModelException {
		}

		public void setContents(char[] contents) {
			sb.setLength(0);
			sb.append(contents);
		}

		public void setContents(String contents) {
			sb.setLength(0);
			sb.append(contents);
		}

	}

	private static final String JAVADOC_BEGIN = MultiLineComment.JSDOC_PREFIX;

	public static ISourceRange getDocRange(IMember member)
			throws ModelException {
		ISourceRange range = member.getSourceRange();
		if (range == null)
			return null;
		IBuffer buf = null;
		// if (this.isBinary()) {
		// buf = this.getClassFile().getBuffer();
		// } else
		{
			ISourceModule compilationUnit = member.getSourceModule();
			if (!compilationUnit.isConsistent()) {
				return null;
			}
			buf = compilationUnit.getBuffer();
			if (buf == null) {
				buf = new SimpleBuffer(compilationUnit.getSource());
			}
		}
		final int possibleDocEnd = range.getOffset();
		final int possibleDocStart = PreviousMemberDetector.execute(
				possibleDocEnd, possibleDocEnd + range.getLength(), member);
		final String sm = buf.getText(possibleDocStart, possibleDocEnd
				- possibleDocStart);
		int start = sm.lastIndexOf(JAVADOC_BEGIN);
		if (start == -1) {
			return null;
		}
		// int end = sm.indexOf(JAVADOC_END, start);
		// if (end == -1) {
		// return null;
		// }
		IScanner scanner = createScanner(true, false, false, false);
		scanner.setSource(buf.getText(possibleDocStart + start,
				possibleDocEnd - (possibleDocStart + start)).toCharArray());
		try {
			int docOffset = -1;
			int docEnd = -1;

			int terminal = scanner.getNextToken();
			loop: while (true) {
				switch (terminal) {
				case ITerminalSymbols.TokenNameCOMMENT_JAVADOC:
					docOffset = scanner.getCurrentTokenStartPosition();
					docEnd = scanner.getCurrentTokenEndPosition() + 1;
					terminal = scanner.getNextToken();
					break;
				case ITerminalSymbols.TokenNameCOMMENT_LINE:
				case ITerminalSymbols.TokenNameCOMMENT_BLOCK:
					terminal = scanner.getNextToken();
					continue loop;
				default:
					break loop;
				}
			}
			if (docOffset != -1) {
				return new SourceRange(docOffset + possibleDocStart + start,
						docEnd - docOffset);
			}
		} catch (InvalidInputException ex) {
			// try if there is inherited Javadoc
		}
		return null;
	}

	public static IScanner createScanner(boolean tokenizeComments,
			boolean tokenizeWhiteSpace, boolean assertMode,
			boolean recordLineSeparator) {
		PublicScanner scanner = new PublicScanner(tokenizeComments,
				tokenizeWhiteSpace, false/* nls */, 4/* sourceLevel */,
				null/* taskTags */, null/* taskPriorities */, true/* taskCaseSensitive */);
		scanner.recordLineSeparator = recordLineSeparator;
		return scanner;
	}

}
