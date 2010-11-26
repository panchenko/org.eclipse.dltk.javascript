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
import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.compiler.SourceElementRequestorKind;
import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueParent;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;

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
		final IValueReference result = super.visitIdentifier(node);
		if ((result != null && result.getKind() != ReferenceKind.LOCAL)
				|| !inFunction()) {
			reportFieldRef(node);
		}
		return result;
	}

	@Override
	protected IValueReference createVariable(IValueCollection context,
			VariableDeclaration declaration) {
		if (isIndexing) {
			final Identifier node = declaration.getIdentifier();
			referenceSet.add(node.getName(), node.sourceStart(), node
					.sourceEnd(), new VarDeclaration(declaration.sourceStart(),
					declaration.sourceEnd()));
		}
		return super.createVariable(context, declaration);
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
	final boolean isIndexing;

	public StructureReporter(ITypeInferenceContext context,
			ISourceElementRequestor requestor) {
		super(context);
		this.fRequestor = requestor;
		isIndexing = SourceElementRequestorKind.INDEXER.matches(fRequestor);
	}

	public void processScope(IValueParent collection, boolean allowFields) {
		List<Declaration> children = new ArrayList<Declaration>();
		for (String childName : collection.getDirectChildren()) {
			final IValueReference child = collection.getChild(childName);
			if (child == null
					|| !processed.add(child)
					|| (child.getLocation() != null && child.getLocation()
							.getSourceModule() != context.getSource()
							.getSourceModule()))
				continue;
			if (child.getKind() == ReferenceKind.LOCAL
					|| child.getKind() == ReferenceKind.FIELD
					|| child.getKind() == ReferenceKind.GLOBAL) {
				children.add(new FieldDeclaration(childName, child));
			} else if (child.getKind() == ReferenceKind.FUNCTION
					|| child.hasChild(IValueReference.FUNCTION_OP)) {
				children.add(new MethodDeclaration(childName, child));
			}
		}
		if (!children.isEmpty()) {
			Collections.sort(children);
			for (Declaration declaration : children) {
				declaration.report(this, allowFields);
			}
		}
	}

	public void reportRefs(int position) {
		while (iterator.hasNext()) {
			final ReferenceKey current = iterator.current();
			if (current.start < position || position == Integer.MAX_VALUE) {
				reportRef(current, iterator.getValues());
				iterator.moveNext();
			} else {
				break;
			}
		}
	}

	private void reportRef(final ReferenceKey current, final List<Object> values) {
		if (values.contains(Boolean.FALSE)) {
			return;
		}
		boolean processed = false;
		for (Object value : values) {
			if (value instanceof MethodRef) {
				processed = true;
				fRequestor.acceptMethodReference(current.name,
						((MethodRef) value).argCount, current.start,
						current.end);
			} else if (value instanceof VarDeclaration) {
				processed = true;
				final VarDeclaration varDecl = (VarDeclaration) value;
				final FieldInfo fi = new FieldInfo();
				fi.name = current.name;
				fi.declarationStart = varDecl.sourceStart;
				fi.nameSourceStart = current.start;
				fi.nameSourceEnd = current.end;
				fRequestor.enterField(fi);
				fRequestor.exitField(varDecl.sourceEnd);
			}
		}
		if (!processed) {
			fRequestor.acceptFieldReference(current.name, current.start);
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
