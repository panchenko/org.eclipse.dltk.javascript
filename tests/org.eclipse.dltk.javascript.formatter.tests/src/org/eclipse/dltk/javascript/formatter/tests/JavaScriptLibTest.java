/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladimir Belov)
 *******************************************************************************/

package org.eclipse.dltk.javascript.formatter.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.dltk.compiler.util.Util;
import org.eclipse.dltk.formatter.tests.AbstractFormatterTest;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatter;
import org.eclipse.dltk.javascript.internal.formatter.tests.TestJavaScriptFormatter;
import org.eclipse.dltk.javascript.internal.parser.tests.ANTLRTokenStreamComparer;
import org.eclipse.dltk.ui.formatter.FormatterException;
import org.eclipse.dltk.ui.formatter.FormatterSyntaxProblemException;
import org.eclipse.dltk.ui.formatter.IScriptFormatter;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;

public class JavaScriptLibTest extends AbstractFormatterTest {

	private static final String FILENAME = "/home/dltk/apps/js-lib.zip";
	//private static final String FILENAME = "/home/bell/apps/js-lib.zip";

	/**
	 * @return
	 */
	public static TestSuite suite() {
		final File path = new File(FILENAME);
		if (path.isFile()) {
			return new TestSuite(JavaScriptLibTest.class);
		} else {
			final TestSuite suite = new TestSuite(JavaScriptLibTest.class
					.getName());
			suite.addTest(new TestCase("testJavaScriptLib-NOT-FOUND") {

				protected void runTest() throws Throwable {
					System.out.println(FILENAME + " not found");
				}

			});
			return suite;
		}
	}

	protected IScriptFormatter createFormatter(Map preferences) {
		return preferences != null ? new TestJavaScriptFormatter(
				Util.LINE_SEPARATOR, preferences)
				: new TestJavaScriptFormatter();
	}

	static final String CHARSET = "ISO-8859-1"; //$NON-NLS-1$

	/**
	 * @param name
	 * @return
	 */
	private static boolean isJavaScriptFile(String name) {
		return name.endsWith(".js") || name.toLowerCase().endsWith(".js");
	}

	public void testJavaScriptLib() throws IOException {
		int errorCount = 0;
		final File path = new File(FILENAME);
		if (!path.isFile()) {
			fail(path + " is not found"); //$NON-NLS-1$
		}
		final ZipInputStream zipInputStream = new ZipInputStream(
				new FileInputStream(path));
		try {
			ZipEntry entry;
			while ((entry = zipInputStream.getNextEntry()) != null) {
				if (!entry.isDirectory() && isJavaScriptFile(entry.getName())) {
					final InputStream entryStream = new FilterInputStream(
							zipInputStream) {
						public void close() throws IOException {
							// empty
						}
					};
					final char[] content = Util.getInputStreamAsCharArray(
							entryStream, (int) entry.getSize(), CHARSET);
					final String input = new String(content);

					try {
						formatEntry(entry, input);
					} catch (BadLocationException e) {
						throw new RuntimeException(e);
					} catch (FormatterSyntaxProblemException e) {
						++errorCount;
						final String msg = "Syntax error in " + entry.getName()
								+ ": " + e.getMessage();
						printError(msg);
					} catch (FormatterException e) {
						throw new RuntimeException(e);
					} catch (AssertionFailedError e) {
						++errorCount;
						final String msg = "Unknown error in "
								+ entry.getName() + ": " + e.getMessage();
						printError(msg);
					} catch (StackOverflowError e) {
						++errorCount;
						final String msg = "StackOverflowError in "
								+ entry.getName() + ": " + e.getMessage();
						printError(msg);
					} catch (OutOfMemoryError e) {
						++errorCount;
						final String msg = "OutOfMemoryError in "
								+ entry.getName() + ": " + e.getMessage();
						printError(msg);
					}

					zipInputStream.closeEntry();
				}
			}
		} finally {
			try {
				zipInputStream.close();
			} catch (IOException e) {
				//
			}
		}
		if (errorCount > 0) {
			final String msg = "Syntax errors: " + errorCount;
			printError(msg);
		}
	}

	private void formatEntry(ZipEntry entry, final String input)
			throws FormatterException, BadLocationException, IOException {

		System.gc();

		System.out.println(entry.getName());

		final JavaScriptFormatter f = new TestJavaScriptFormatter();
		final TextEdit edit = f.format(input, 0, input.length(), 0);
		Assert.assertNotNull(entry.getName());
		Assert.assertNotNull(edit);
		final IDocument document = new Document(input);
		edit.apply(document);

		ANTLRTokenStreamComparer.compare(input, document.get(), true);

		// formatter must change source code
		Assert.assertFalse(input.equals(document.get()));

		// JavaScriptTokenStreamTester.tokenize(resourceName)

		// assertTrue(compareIgnoreBlanks(entry.getName(),
		// new StringReader(input), new StringReader(document.get())));
	}

	private void printError(final String msg) {
		System.err.println(msg);
		JavaScriptFormatterTestsPlugin.error(msg);
	}

	public void error(String message, String sourceName, int line,
			String lineSource, int lineOffset) {

	}

	public void warning(String message, String sourceName, int line,
			String lineSource, int lineOffset) {
	}

}
