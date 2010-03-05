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
package org.eclipse.dltk.internal.javascript.ti;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;

public class TypeInferencer2 implements ITypeInferenceContext {

	private TypeInferencerVisitor visitor;

	private void initializeVisitor() {
		if (visitor == null) {
			visitor = new TypeInferencerVisitor(this);
		} else {
			visitor.initialize();
		}
	}

	public void setVisitor(TypeInferencerVisitor visitor) {
		this.visitor = visitor;
	}

	public void doInferencing(Script script) {
		try {
			initializeVisitor();
			visitor.visit(script);
		} catch (RuntimeException e) {
			log(e);
		} catch (AssertionError e) {
			log(e);
		}
	}

	protected void log(Throwable e) {
		JavaScriptPlugin.error(e);
	}

	public IValueReference evaluate(ASTNode node) {
		initializeVisitor();
		return visitor.visit(node);
	}

	public IValueCollection getCollection() {
		return visitor.getCollection();
	}

	private Map<String, Type> types = new HashMap<String, Type>();

	public Type getType(String typeName) {
		if (typeName == null || typeName.length() == 0) {
			return null;
		}
		Type type = types.get(typeName);
		if (type != null) {
			return type;
		}
		type = TypeInfoModelLoader.getInstance().getType(typeName);
		if (type != null) {
			types.put(typeName, type);
			return type;
		}
		type = TypeInfoModelFactory.eINSTANCE.createType();
		type.setName(typeName);
		type.setKind(TypeKind.UNKNOWN);
		types.put(typeName, type);
		return type;
	}

	private IValueTypeFactory factory = new ValueTypeFactoryImpl(this);

	public IValueTypeFactory getFactory() {
		return factory;
	}

}
