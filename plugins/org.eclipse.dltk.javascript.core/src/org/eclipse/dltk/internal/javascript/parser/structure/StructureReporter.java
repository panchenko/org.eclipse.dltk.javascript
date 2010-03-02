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
package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.internal.javascript.ti.IValueParent;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.ReferenceKind;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.PropertyExpression;

public class StructureReporter extends TypeInferencerVisitor {

	private final ReferenceSet referenceSet = new ReferenceSet();

	@Override
	public IValueReference visitCallExpression(CallExpression node) {
		reportMethodRef(node.getExpression(), node.getArguments().size());
		return super.visitCallExpression(node);
	}

	private void reportMethodRef(ASTNode expression, int argCount) {
		if (expression instanceof Identifier) {
			final Identifier id = (Identifier) expression;
			referenceSet.add(id.getName(), id.sourceStart(), id.sourceEnd(),
					new MethodRef(argCount));
		} else if (expression instanceof PropertyExpression) {
			reportMethodRef(((PropertyExpression) expression).getProperty(),
					argCount);
		}
	}

	@Override
	public IValueReference visitIdentifier(Identifier node) {
		reportFieldRef(node);
		return super.visitIdentifier(node);
	}

	@Override
	public IValueReference visitPropertyExpression(PropertyExpression node) {
		if (node.getProperty() instanceof Identifier) {
			reportFieldRef((Identifier) node.getProperty());
		}
		return super.visitPropertyExpression(node);
	}

	private void reportFieldRef(Identifier node) {
		referenceSet.add(node.getName(), node.sourceStart(), node.sourceEnd());
	}

	private final Set<IValueReference> processed = new HashSet<IValueReference>();

	final ISourceElementRequestor fRequestor;
	private ReferenceIterator iterator;

	public StructureReporter(ISourceElementRequestor requestor) {
		this.fRequestor = requestor;
	}

	public void processScope(IValueParent collection) {
		List<Declaration> children = new ArrayList<Declaration>();
		for (String childName : collection.getDirectChildren()) {
			final IValueReference child = collection.getChild(childName);
			if (child == null || !processed.add(child))
				continue;
			if (child.getKind() == ReferenceKind.LOCAL) {
				children.add(new FieldDeclaration(childName, child));

			} else if (child.getKind() == ReferenceKind.FUNCTION
					|| child.getChild(IValueReference.FUNCTION_OP) != null) {
				children.add(new MethodDeclaration(childName, child));
			}
		}
		if (!children.isEmpty()) {
			Collections.sort(children);
			for (Declaration declaration : children) {
				declaration.report(this);
			}
		}
	}

	public void reportRefs(int position) {
		while (iterator.hasNext()) {
			final ReferenceKey current = iterator.current();
			if (current.start < position || position == Integer.MAX_VALUE) {
				List<Object> values = iterator.getValues();
				boolean isMethod = false;
				for (Object value : values) {
					if (value instanceof MethodRef) {
						isMethod = true;
						fRequestor.acceptMethodReference(current.name,
								((MethodRef) value).argCount, current.start,
								current.end);
					}
				}
				if (!isMethod) {
					fRequestor
							.acceptFieldReference(current.name, current.start);
				}
				iterator.moveNext();
			} else {
				break;
			}
		}
	}

	/**
	 * @param name
	 * @param start
	 * @param end
	 */
	void removeReference(String name, int start, int end) {
		iterator.remove(name, start, end);
	}

	public void beginReporting() {
		fRequestor.enterModule();
		this.iterator = referenceSet.iterator();
	}

	public void endReporting(int end) {
		reportRefs(Integer.MAX_VALUE);
		fRequestor.exitModule(end);
	}

}
