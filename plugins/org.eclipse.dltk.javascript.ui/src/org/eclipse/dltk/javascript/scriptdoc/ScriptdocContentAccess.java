/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.scriptdoc;

import java.io.Reader;

import org.eclipse.dltk.core.IBuffer;
import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IOpenable;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.ModelException;

class BufferJavaDocCommentReader extends JavaDocCommentReader {

	private IBuffer fBuffer;

	public BufferJavaDocCommentReader(IBuffer buf, int start, int end) {
		super(start, end);
		fBuffer = buf;
	}

	@Override
	protected char getChar(int index) {
		return fBuffer.getChar(index);
	}

	/**
	 * @see java.io.Reader#close()
	 */
	public void close() {
		fBuffer = null;
	}

}

/**
 * Helper needed to get the content of a Javadoc comment.
 * 
 * <p>
 * This class is not intended to be subclassed or instantiated by clients.
 * </p>
 * 
 * @since 3.1
 * @noinstantiate This class is not intended to be instantiated by clients.
 * @noextend This class is not intended to be subclassed by clients.
 */
public class ScriptdocContentAccess {

	// private static final String JAVADOC_END = "*/";

	private ScriptdocContentAccess() {
		// do not instantiate
	}

	public static ISourceRange getJavadocRange(IMember member)
			throws ModelException {
		return JSDocContentAccess.getDocRange(member);
	}

	public static JavaDocCommentReader getReader(IOpenable openable,
			ISourceRange docRange) throws ModelException {
		final IBuffer buf = openable.getBuffer();
		if (buf != null) {
			return new BufferJavaDocCommentReader(buf, docRange.getOffset(),
					docRange.getOffset() + docRange.getLength());
		}
		if (openable instanceof ISourceModule) {
			final ISourceModule module = (ISourceModule) openable;
			return new StringJavaDocCommentReader(module.getSource().substring(
					docRange.getOffset(),
					docRange.getOffset() + docRange.getLength()));
		}
		return null;
	}

	/**
	 * Gets a reader for an IMember's Javadoc comment content from the source
	 * attachment. The content does contain only the text from the comment
	 * without the Javadoc leading star characters. Returns <code>null</code> if
	 * the member does not contain a Javadoc comment or if no source is
	 * available.
	 * 
	 * @param member
	 *            The member to get the Javadoc of.
	 * @param allowInherited
	 *            For methods with no (Javadoc) comment, the comment of the
	 *            overridden class is returned if <code>allowInherited</code> is
	 *            <code>true</code>.
	 * @return Returns a reader for the Javadoc comment content or
	 *         <code>null</code> if the member does not contain a Javadoc
	 *         comment or if no source is available
	 * @throws JavaModelException
	 *             is thrown when the elements javadoc can not be accessed
	 */
	public static Reader getContentReader(IMember member, boolean allowInherited)
			throws ModelException {
		IOpenable openable = member.getOpenable();
		if (openable != null) {
			try {
				ISourceRange javadocRange = getJavadocRange(member);
				if (javadocRange != null) {
					JavaDocCommentReader reader = getReader(openable,
							javadocRange);
					if (reader == null) {
						return null;
					}
					if (!reader.containsOnlyInheritDoc()) {
						reader.reset();
						return reader;
					}
				}

				if (allowInherited
						&& (member.getElementType() == IModelElement.METHOD)) {
					return findDocInHierarchy((IMethod) member);
				}
			} catch (ModelException e) {
				return null;
			}
		}

		return null;
	}

	/**
	 * Gets a reader for an IMember's Javadoc comment content from the source
	 * attachment. and renders the tags in HTML. Returns <code>null</code> if
	 * the member does not contain a Javadoc comment or if no source is
	 * available.
	 * 
	 * @param member
	 *            the member to get the Javadoc of.
	 * @param allowInherited
	 *            for methods with no (Javadoc) comment, the comment of the
	 *            overridden class is returned if <code>allowInherited</code> is
	 *            <code>true</code>
	 * @param useAttachedJavadoc
	 *            if <code>true</code> Javadoc will be extracted from attached
	 *            Javadoc if there's no source
	 * @return a reader for the Javadoc comment content in HTML or
	 *         <code>null</code> if the member does not contain a Javadoc
	 *         comment or if no source is available
	 * @throws JavaModelException
	 *             is thrown when the elements Javadoc can not be accessed
	 * @since 3.2
	 */
	public static Reader getHTMLContentReader(IMember member,
			boolean allowInherited, boolean useAttachedJavadoc)
			throws ModelException {
		Reader contentReader = getContentReader(member, allowInherited);
		if (contentReader != null)
			return new JavaDoc2HTMLTextReader(contentReader);

		IOpenable openable = member.getOpenable();
		if (useAttachedJavadoc && openable != null
				&& openable.getBuffer() == null) { // only
			// if
			// no
			// source
			// available
			// String s= member.getAttachedJavadoc(null);
			// if (s != null)
			// return new StringReader(s);
		}
		return null;
	}

	/**
	 * Gets a reader for an IMember's Javadoc comment content from the source
	 * attachment. and renders the tags in HTML. Returns <code>null</code> if
	 * the member does not contain a Javadoc comment or if no source is
	 * available.
	 * 
	 * @param member
	 *            The member to get the Javadoc of.
	 * @param allowInherited
	 *            For methods with no (Javadoc) comment, the comment of the
	 *            overridden class is returned if <code>allowInherited</code> is
	 *            <code>true</code>.
	 * @return Returns a reader for the Javadoc comment content in HTML or
	 *         <code>null</code> if the member does not contain a Javadoc
	 *         comment or if no source is available
	 * @throws JavaModelException
	 *             is thrown when the elements javadoc can not be accessed
	 * @deprecated As of 3.2, replaced by
	 *             {@link #getHTMLContentReader(IMember, boolean, boolean)}
	 */
	public static Reader getHTMLContentReader(IMember member,
			boolean allowInherited) throws ModelException {
		return getHTMLContentReader(member, allowInherited, false);
	}

	private static Reader findDocInHierarchy(IMethod method)
			throws ModelException {
		return null;
	}

}