/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.text;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.internal.javascript.ti.JSDocSupport;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder;
import org.eclipse.dltk.javascript.typeinfo.JSDocTypeParser;
import org.eclipse.dltk.javascript.typeinfo.JSDocTypeParserExtension;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;

@SuppressWarnings("restriction")
public class JSDocTypeUtil {

	public static JSDocTypeParser createTypeParser(TypeInferencer2 inferencer) {
		for (IModelBuilder builder : inferencer.getModelBuilders()) {
			if (builder instanceof JSDocSupport) {
				return ((JSDocSupport) builder).createTypeParser();
			}
		}
		return null;
	}

	public static TypeNameNode findName(TypeInferencer2 inferencer2,
			final String typeExpression, final int offsetInTypeExpression) {
		final JSDocTypeParser typeParser = createTypeParser(inferencer2);
		if (typeParser == null) {
			return null;
		}
		final List<TypeNameNode> typeNames = new ArrayList<TypeNameNode>();
		typeParser.setExtension(new JSDocTypeParserExtension() {
			public void reportType(JSType type, int s, int e) {
				if (type instanceof SimpleType) {
					typeNames.add(new TypeNameNode(((SimpleType) type)
							.getTarget().getName(), s, e));
				}
			}
		});
		try {
			typeParser.parse(typeExpression);
		} catch (ParseException e1) {
			return null;
		}
		for (TypeNameNode range : typeNames) {
			if (range.start <= offsetInTypeExpression
					&& offsetInTypeExpression < range.end) {
				return range;
			}
		}
		return null;
	}

}
