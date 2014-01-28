/*******************************************************************************
 * Copyright (c) 2014 Alex Panchenko
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Alex Panchenko - initial API and Implementation
 *******************************************************************************/
package org.eclipse.dltk.javascript.typelib.compiler;

import static com.google.common.base.Predicates.instanceOf;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.compiler.problem.ProblemCollector;
import org.eclipse.dltk.core.ISourceNode;
import org.eclipse.dltk.core.builder.ISourceLineTracker;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.VoidExpression;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.javascript.parser.JavaScriptParserProblems;
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.javascript.typeinfo.TypeInfoManager;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelResourceSet;
import org.eclipse.dltk.javascript.typeinfo.model.TypeLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import com.google.common.io.Files;

public abstract class AbstractTypeLibraryCompiler {
	private final XMIResource resource = TypeInfoManager.newResource();
	private final Map<String, Type> types = new HashMap<String, Type>();
	private String file;
	private ISourceLineTracker lineTracker;

	protected void setSourceInformation(String file, ISourceLineTracker lineTracker) {
		this.file = file;
		this.lineTracker = lineTracker;
	}

	protected void error(ISourceNode node, String format, Object... args) {
		log("Error", node, format, args);
	}

	protected void warn(ISourceNode node, String format, Object... args) {
		log("Warning", node, format, args);
	}

	protected void info(String format, Object... args) {
		System.out.println("INFO: " + String.format(format, args));
	}

	@SuppressWarnings("resource")
	private void log(String level, ISourceNode node, String format, Object... args) {
		final StringBuilder sb = new StringBuilder();
		sb.append(level);
		if (node != null) {
			sb.append(" ");
			sb.append(file);
			sb.append(':');
			sb.append(lineTracker.getLineNumberOfOffset(node.start()) + 1);
		}
		sb.append(": ");
		new Formatter(sb).format(format, args);
		System.out.println(sb.toString());
	}

	public void save(File output, Map<String, String> manifest) throws IOException {
		TypeLibCompilerUtil.save(output, manifest, resource);
		info("Saved to %s", output);
	}

	public void reset() {
		types.clear();
	}

	public void resolveTypes() {
		if (resource.getResourceSet() == null) {
			new TypeInfoModelResourceSet().getResources().add(resource); // for proxy resolution
		}
		final Map<String, Type> shortNames = Maps.newHashMap();
		for (Type type : types.values()) {
			final int pos = type.getName().lastIndexOf('.');
			if (pos > 0) {
				shortNames.put(type.getName().substring(pos + 1), type);
			}
		}
		final Set<String> proxies = Sets.newHashSet();
		for (Iterator<EObject> i = resource.getAllContents(); i.hasNext();) {
			final EObject o = i.next();
			if (o instanceof SimpleType) {
				final SimpleType simple = (SimpleType) o;
				final Type type = simple.getTarget();
				if (type.isProxy()) {
					String name = type.getName();
					if (name.endsWith("?")) { // workaround for (opts:number?=) parameter declaration
						name = translateTypeName(name.substring(0, name.length() - 1));
						simple.setTarget(TypeUtil.type(name));
						if (!simple.getTarget().isProxy()) {
							continue;
						}
					}
					final Type candidate = shortNames.get(name);
					if (candidate != null) {
						simple.setTarget(candidate);
						continue;
					}
					proxies.add(name);
				}
			} else if (o instanceof Type) {
				for (Type trait : ((Type) o).getTraits()) {
					if (trait.isProxy()) {
						proxies.add(trait.getName());
					}
				}
			}
		}
		if (!proxies.isEmpty()) {
			warn(null, "Unresolved type(s): %s", Joiner.on(',').join(proxies));
			final SetView<String> intersection = Sets.intersection(proxies, types.keySet());
			if (!intersection.isEmpty()) {
				error(null, "Proxy resolution failed for " + intersection);
			}
		}
	}

	public void renameType(String oldName, String newName) {
		final Type type = types.remove(oldName);
		if (type != null) {
			type.setName(newName);
			types.put(newName, type);
			for (TypeLiteral literal : Iterables.filter(resource.getContents(), TypeLiteral.class)) {
				if (literal.getTarget() == type) {
					literal.setName(newName);
				}
			}
		}
	}

	protected String translateTypeName(String typeName) {
		if ("int".equals(typeName) || "double".equals(typeName)) {
			return ITypeNames.NUMBER;
		} else {
			return TypeInfoModelLoader.getInstance().translateTypeName(typeName);
		}
	}

	protected Script parse(String source) {
		final ProblemCollector collector = new ProblemCollector() {
			@Override
			public void reportProblem(IProblem problem) {
				if (JavaScriptParserProblems.isSyntaxError(problem)) {
					super.reportProblem(problem);
				}
			}
		};
		final Script script = new JavaScriptParser().parse(source, collector);
		if (!collector.isEmpty()) {
			throw new IllegalArgumentException(collector.toString());
		}
		return script;
	}

	protected Type getType(String typeName) {
		return types.get(typeName);
	}

	public Collection<Type> getTypes() {
		return Collections.unmodifiableCollection(types.values());
	}

	public void addTypeLitreal(String typeName, String literalName) {
		final Type type = types.get(typeName);
		if (type != null) {
			final TypeLiteral literal = TypeInfoModelFactory.eINSTANCE.createTypeLiteral();
			literal.setName(literalName);
			literal.setTarget(type);
			resource.getContents().add(literal);
		}
	}

	protected void addType(Type type) {
		types.put(type.getName(), type);
		resource.getContents().add(type);
		final TypeLiteral literal = TypeInfoModelFactory.eINSTANCE.createTypeLiteral();
		literal.setName(type.getName());
		literal.setTarget(type);
		resource.getContents().add(literal);
	}

	protected static String fqName(Member member) {
		final Type type = member.getDeclaringType();
		return (type != null ? type.getName() : "?") + "." + member.getName();
	}

	protected boolean addToType(ISourceNode expression, Member member, String typeName) {
		final Type type = getType(typeName);
		if (type == null) {
			warn(expression, "Declaring type %s not found", typeName);
			return false;
		}
		final Collection<Member> duplicates = findMembers(type, member.getName(), member.isStatic());
		if (!(member instanceof Method ? Collections2.filter(duplicates, instanceOf(Property.class)) : duplicates).isEmpty()) {
			error(expression, "Duplicate %smember %s.%s ", member.isStatic() ? "static " : "", typeName, member.getName());
			return false;
		}
		type.getMembers().add(member);
		return true;
	}

	public abstract void load(String name, String source);

	public void load(File file, Charset charset) throws IOException {
		load(file.getName(), Files.toString(file, charset));
	}

	protected static <E> FluentIterable<E> selectExpressions(Script script, final Class<E> type) {
		return FluentIterable.from(script.getStatements()).filter(VoidExpression.class).filter(new Predicate<VoidExpression>() {
			@Override
			public boolean apply(VoidExpression input) {
				return type.isInstance(input.getExpression());
			}
		}).transform(new Function<VoidExpression, E>() {
			@SuppressWarnings("unchecked")
			@Override
			public E apply(VoidExpression input) {
				return (E) input.getExpression();
			}
		});
	}

	protected static Collection<Member> findMembers(Type type, final String memberName, final boolean isStatic) {
		return Collections2.filter(type.getMembers(), new Predicate<Member>() {
			@Override
			public boolean apply(Member input) {
				return memberName.equals(input.getName()) && isStatic == input.isStatic();
			}
		});
	}
}
