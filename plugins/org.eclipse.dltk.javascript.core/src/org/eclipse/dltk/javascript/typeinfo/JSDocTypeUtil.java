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
package org.eclipse.dltk.javascript.typeinfo;

import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.dltk.annotations.Nullable;
import org.eclipse.dltk.internal.javascript.ti.JSDocSupport;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;

public class JSDocTypeUtil {

	private static JSDocTypeParser createTypeParser(TypeInferencer2 inferencer) {
		for (IModelBuilder builder : inferencer.getModelBuilders()) {
			if (builder instanceof JSDocSupport) {
				return ((JSDocSupport) builder).createTypeParser();
			}
		}
		return null;
	}

	/**
	 * Finds the primitive type at the specified location in the type expression
	 * from JSDoc.
	 */
	@Nullable
	public static JSDocTypeRegion findTypeAt(TypeInferencer2 inferencer2,
			final String typeExpression, final int offsetInTypeExpression) {
		final JSDocTypeParser typeParser = createTypeParser(inferencer2);
		if (typeParser == null) {
			return null;
		}
		final AtomicReference<JSDocTypeRegion> result = new AtomicReference<JSDocTypeRegion>();
		typeParser.setExtension(new JSDocTypeParserExtension() {
			public void reportType(JSType type, int s, int e) {
				if (s <= offsetInTypeExpression && offsetInTypeExpression < e
						&& type instanceof SimpleType && result.get() == null) {
					result.set(new JSDocTypeRegion(((SimpleType) type)
							.getTarget().getName(), s, e));
				}
			}
		});
		try {
			typeParser.parse(typeExpression);
		} catch (ParseException e1) {
			// ignore
		}
		return result.get();
	}

}
