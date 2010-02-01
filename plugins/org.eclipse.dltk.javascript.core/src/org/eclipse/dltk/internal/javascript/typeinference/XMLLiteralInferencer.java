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
package org.eclipse.dltk.internal.javascript.typeinference;

import java.io.IOException;
import java.io.StringReader;
import java.util.Stack;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.dltk.internal.javascript.reference.resolvers.ReferenceResolverContext;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.utils.TextUtils;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLLiteralInferencer extends DefaultHandler {

	private final SAXParser parser;

	public XMLLiteralInferencer() {
		try {
			parser = SAXParserFactory.newInstance().newSAXParser();
		} catch (ParserConfigurationException e) {
			throw new LinkageError();
		} catch (SAXException e) {
			throw new LinkageError();
		}
	}

	private ReferenceResolverContext context;
	private Stack<IReference> stack = new Stack<IReference>();

	public void modifyReference(final IReference reference, String string,
			final ReferenceResolverContext cs) {
		this.context = cs;
		this.stack.clear();
		this.stack.push(reference);
		try {
			parser.parse(new InputSource(new StringReader(string)), this);
		} catch (SAXException e) {
			JavaScriptPlugin.error(e);
		} catch (IOException e) {
			JavaScriptPlugin.error(e);
		}
	}

	@Override
	public void startElement(String uri, String localName, String name,
			Attributes attributes) throws SAXException {
		if (stack.size() > 1) {
			if (name.indexOf(':') != -1) {
				name = TextUtils.replace(name, ':', "::");
			}

			CombinedOrReference corf = new CombinedOrReference(
					new NewReference(name, "XML", context),
					new StandardSelfCompletingReference(name, true));
			stack.peek().setChild(name, corf);
			stack.push(corf);
		} else {
			stack.push(stack.peek());
		}
		for (int a = 0, length = attributes.getLength(); a < length; a++) {
			String val = "@" + attributes.getQName(a);

			if (val.indexOf(':') != -1) {
				val = TextUtils.replace(val, ':', "::");
			}

			CombinedOrReference attrCorf = new CombinedOrReference(
					new NewReference(val, "XMLATTR", null),
					new StandardSelfCompletingReference(val, true));

			stack.peek().setChild(val, attrCorf);
		}
	}

	@Override
	public void endElement(String uri, String localName, String name)
			throws SAXException {
		stack.pop();
	}

}
