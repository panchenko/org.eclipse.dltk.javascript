/**
 * 
 */
package org.eclipse.dltk.javascript.internal.ui.text;

import java.io.StringReader;
import java.util.List;

import org.eclipse.dltk.ast.parser.ISourceParser;
import org.eclipse.dltk.ast.parser.SourceParserManager;
import org.eclipse.dltk.ast.utils.ASTUtil;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.XmlFragment;
import org.eclipse.dltk.javascript.ast.XmlLiteral;
import org.eclipse.dltk.javascript.ast.XmlTextFragment;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.ui.editor.highlighting.AbstractSemanticHighlighter;

final class JavaScriptPositionUpdater extends AbstractSemanticHighlighter {

	private static final int HL_XML_TAG = 0;
	private static final int HL_XML_ATTRIBUTE = 1;
	private static final int HL_XML_COMMENT = 2;

	@Override
	protected boolean doHighlighting(IModuleSource code) throws Exception {
		final ISourceParser parser = SourceParserManager.getInstance()
				.getSourceParserById(JavaScriptParser.PARSER_ID);
		if (parser == null) {
			return false;
		}
		final Script declaration = (Script) parser.parse(code, null);
		if (declaration == null) {
			return false;
		}
		for (XmlLiteral literal : ASTUtil.select(declaration, XmlLiteral.class)) {
			for (XmlFragment fragment : literal.getFragments()) {
				if (fragment instanceof XmlTextFragment) {
					final XMLTokenizer tokenizer = new XMLTokenizer(
							new StringReader(((XmlTextFragment) fragment)
									.getXml()));
					final int offset = fragment.sourceStart();
					@SuppressWarnings("unchecked")
					final List<Token> tokens = tokenizer.getRegions();
					for (Token token : tokens) {
						if (token.context == XMLTokenizer.XML_TAG_NAME) {
							addRange(offset, token, HL_XML_TAG);
						} else if (token.context == XMLTokenizer.XML_TAG_ATTRIBUTE_NAME) {
							addRange(offset, token, HL_XML_ATTRIBUTE);
						} else if (token.context == XMLTokenizer.XML_COMMENT_OPEN
								|| token.context == XMLTokenizer.XML_COMMENT_TEXT
								|| token.context == XMLTokenizer.XML_COMMENT_CLOSE) {
							addRange(offset, token, HL_XML_COMMENT);
						} else if (token.context == XMLTokenizer.XML_TAG_ATTRIBUTE_VALUE) {
							//
						}
					}
				}
			}
		}
		return true;
	}

	private void addRange(int start, Token token, int highlightingIndex) {
		addPosition(start + token.start,
				start + token.start + token.textLength, highlightingIndex);
	}

}
