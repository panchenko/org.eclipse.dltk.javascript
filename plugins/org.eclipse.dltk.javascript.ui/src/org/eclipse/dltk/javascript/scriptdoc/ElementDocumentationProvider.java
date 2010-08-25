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
package org.eclipse.dltk.javascript.scriptdoc;

import java.io.Reader;

import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.ui.documentation.IDocumentationResponse;
import org.eclipse.dltk.ui.documentation.IScriptDocumentationProvider;
import org.eclipse.dltk.ui.documentation.IScriptDocumentationProviderExtension2;
import org.eclipse.dltk.ui.documentation.TextDocumentationResponse;

/**
 * @since 3.0
 */
public class ElementDocumentationProvider implements
		IScriptDocumentationProvider, IScriptDocumentationProviderExtension2 {

	public Reader getInfo(IMember element, boolean lookIntoParents,
			boolean lookIntoExternal) {
		return null;
	}

	public Reader getInfo(String content) {
		return null;
	}

	public IDocumentationResponse getDocumentationFor(Object element) {
		if (element instanceof Element) {
			final Element jsElement = (Element) element;
			if (jsElement.getDescription() != null
					&& jsElement.getDescription().length() != 0) {
				return new TextDocumentationResponse(element,
						getElementTitle(jsElement), jsElement.getDescription());
			}
		}
		return null;
	}

	/**
	 * @param element
	 * @return
	 */
	private String getElementTitle(Element element) {
		final StringBuilder sb = new StringBuilder();
		if (element instanceof Member) {
			final Member member = (Member) element;
			if (member.getDeclaringType() != null) {
				sb.append(member.getDeclaringType().getName());
				sb.append('.');
			}
		}
		sb.append(element.getName());
		if (element instanceof Property) {
			final Property property = (Property) element;
			if (property.getType() != null) {
				sb.append(": "); //$NON-NLS-1$
				sb.append(property.getType().getName());
			}
		} else if (element instanceof Method) {
			final Method method = (Method) element;
			sb.append('(');
			int paramCount = 0;
			for (Parameter parameter : method.getParameters()) {
				if (paramCount != 0) {
					sb.append(", "); //$NON-NLS-1$
				}
				sb.append(parameter.getName());
				++paramCount;
			}
			sb.append(')');
			if (method.getType() != null) {
				sb.append(": "); //$NON-NLS-1$
				sb.append(method.getType().getName());
			}
		}
		return sb.toString();
	}

}
