package org.eclipse.dltk.javascript.internal.ui.text;

import java.io.StringReader;
import java.util.List;

import org.eclipse.dltk.ast.utils.ASTUtil;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.javascript.ast.GetMethod;
import org.eclipse.dltk.javascript.ast.Keyword;
import org.eclipse.dltk.javascript.ast.Method;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.SetMethod;
import org.eclipse.dltk.javascript.ast.XmlFragment;
import org.eclipse.dltk.javascript.ast.XmlLiteral;
import org.eclipse.dltk.javascript.ast.XmlTextFragment;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;
import org.eclipse.dltk.ui.editor.highlighting.AbortSemanticHighlightingException;
import org.eclipse.dltk.ui.editor.highlighting.ISemanticHighlighter;
import org.eclipse.dltk.ui.editor.highlighting.ISemanticHighlightingRequestor;

public class JavaScriptXmlHighlighter implements ISemanticHighlighter {

	private static final String HL_XML_TAG = JavascriptColorConstants.JS_XML_TAG_NAME;
	private static final String HL_XML_ATTRIBUTE = JavascriptColorConstants.JS_XML_ATTR_NAME;
	private static final String HL_XML_COMMENT = JavascriptColorConstants.JS_XML_COMMENT_NAME;
	private static final String HL_KEYWORD = JavascriptColorConstants.JS_KEYWORD;

	public String[] getHighlightingKeys() {
		return new String[] { HL_XML_TAG, HL_XML_ATTRIBUTE, HL_XML_COMMENT,
				HL_KEYWORD };
	}

	public void process(IModuleSource code,
			ISemanticHighlightingRequestor requestor) {
		final Script declaration = JavaScriptParserUtil.parse(code, null);
		if (declaration == null) {
			throw new AbortSemanticHighlightingException();
		}
		for (XmlLiteral literal : ASTUtil.select(declaration, XmlLiteral.class)) {
			for (XmlFragment fragment : literal.getFragments()) {
				if (fragment instanceof XmlTextFragment) {
					final XMLTokenizer tokenizer = new XMLTokenizer(
							new StringReader(
									((XmlTextFragment) fragment).getXml()));
					final int offset = fragment.sourceStart();
					@SuppressWarnings("unchecked")
					final List<Token> tokens = tokenizer.getRegions();
					for (Token token : tokens) {
						if (token.context == XMLTokenizer.XML_TAG_NAME) {
							addRange(requestor, offset, token, HL_XML_TAG);
						} else if (token.context == XMLTokenizer.XML_TAG_ATTRIBUTE_NAME) {
							addRange(requestor, offset, token, HL_XML_ATTRIBUTE);
						} else if (token.context == XMLTokenizer.XML_COMMENT_OPEN
								|| token.context == XMLTokenizer.XML_COMMENT_TEXT
								|| token.context == XMLTokenizer.XML_COMMENT_CLOSE) {
							addRange(requestor, offset, token, HL_XML_COMMENT);
						} else if (token.context == XMLTokenizer.XML_TAG_ATTRIBUTE_VALUE) {
							//
						}
					}
				}
			}
		}
		for (Method method : ASTUtil.select(declaration, Method.class)) {
			Keyword keyword;
			if (method instanceof GetMethod) {
				keyword = ((GetMethod) method).getGetKeyword();
			} else if (method instanceof SetMethod) {
				keyword = ((SetMethod) method).getSetKeyword();
			} else {
				continue;
			}
			requestor.addPosition(keyword.sourceStart(), keyword.sourceEnd(),
					HL_KEYWORD);
		}
	}

	private static void addRange(ISemanticHighlightingRequestor requestor,
			int start, Token token, String highlightingKey) {
		requestor.addPosition(start + token.start, start + token.start
				+ token.textLength, highlightingKey);
	}

}
