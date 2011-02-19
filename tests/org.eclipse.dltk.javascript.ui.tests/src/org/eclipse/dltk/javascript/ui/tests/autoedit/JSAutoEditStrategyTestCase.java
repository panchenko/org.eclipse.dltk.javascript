package org.eclipse.dltk.javascript.ui.tests.autoedit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.internal.ui.editor.JavaScriptDocumentSetupParticipant;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IDocument;

import junit.framework.Assert;
import junit.framework.TestCase;

public abstract class JSAutoEditStrategyTestCase extends TestCase {

	protected static final String TAB = "\t";

	protected static final String ENTER = "\n";

	private final TestStrategy strategy = new TestStrategy();

	protected void execute(Document document, DocumentCommand cmd) {
		strategy.customizeDocumentCommand(document, cmd);
		if (!cmd.doit)
			return;
		try {
			// access "execute(IDocument)" method via reflection since it has
			// package visibility
			Method execute = DocumentCommand.class.getDeclaredMethod("execute",
					IDocument.class);
			if (!execute.isAccessible())
				execute.setAccessible(true);
			execute.invoke(cmd, document);
		} catch (SecurityException e) {
			Assert.fail(e.toString());
		} catch (NoSuchMethodException e) {
			Assert.fail(e.toString());
		} catch (IllegalArgumentException e) {
			Assert.fail(e.toString());
		} catch (IllegalAccessException e) {
			Assert.fail(e.toString());
		} catch (InvocationTargetException e) {
			Assert.fail(e.toString());
		}
	}

	protected DocumentCommand createCommand(String text, int offset) {
		return createCommand(text, offset, 0);
	}

	protected DocumentCommand createCommand(String text, int offset, int length) {
		final DocumentCommand cmd = new DocumentCommand() {
		};
		cmd.offset = offset;
		cmd.length = length;
		cmd.text = text;
		cmd.doit = true;
		cmd.caretOffset = offset;
		cmd.shiftsCaret = true;
		return cmd;
	}

	protected Document createDocument(StringList code) {
		final Document document = new Document(code);
		new JavaScriptDocumentSetupParticipant().setup(document);
		return document;
	}

}
