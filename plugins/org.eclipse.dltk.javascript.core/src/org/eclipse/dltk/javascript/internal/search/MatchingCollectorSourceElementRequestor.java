package org.eclipse.dltk.javascript.internal.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.compiler.IElementRequestor.TypeInfo;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.search.matching2.MatchingCollector;
import org.eclipse.dltk.internal.javascript.ti.JSDocSupport;
import org.eclipse.dltk.internal.javascript.ti.JSDocSupport.ParameterNode;
import org.eclipse.dltk.javascript.ast.Argument;
import org.eclipse.dltk.javascript.ast.Comment;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.core.JSBindings;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTags;
import org.eclipse.dltk.javascript.structure.IDeclaration;
import org.eclipse.dltk.javascript.structure.IStructureRequestor;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public class MatchingCollectorSourceElementRequestor implements
		IStructureRequestor {

	private final List<MatchingNode> nodes = new ArrayList<MatchingNode>();

	private ISourceModule module;

	public void enterModule(ISourceModule module) {
		this.module = module;
	}

	public void report(MatchingCollector<MatchingNode> matchingCollector) {
		for (MatchingNode node : nodes) {
			matchingCollector.report(node);
		}
		nodes.clear();
	}

	public void acceptLocalReference(Identifier node, IDeclaration target) {
		nodes.add(new LocalVariableReferenceNode(node, target.getLocation()));
	}

	public void acceptFieldReference(Identifier node) {
		nodes.add(new FieldReferenceNode(node));
	}

	public void acceptMethodReference(Identifier node, int argCount) {
		nodes.add(new MethodReferenceNode(node));
	}

	public void enterNamespace(String[] namespace) {
	}

	public void exitNamespace() {
	}

	public void enterType(TypeInfo typeInfo) {
	}

	public void exitType(int sourceEnd) {
	}

	public void enterMethod(MethodInfo methodInfo, Expression identifier,
			FunctionStatement function, IMethod method) {
		// ignore method(function(){});
		if (identifier == null)
			return;
		nodes.add(new MethodDeclarationNode(identifier, method));

		Map<String, Argument> arguments = new HashMap<String, Argument>();
		for (Argument argument : function.getArguments()) {
			arguments.put(argument.getIdentifier().getName(), argument);
		}
		for (IParameter parameter : method.getParameters()) {
			final Argument argument = arguments.get(parameter.getName());
			if (argument != null) {
				nodes.add(new ArgumentDeclarationNode(argument, method
						.getLocation().getSourceModule(), parameter.getType()));
			}
		}
		final Comment comment = JSDocSupport.getComment(function);
		if (comment != null) {
			final JSDocTags tags = JSDocSupport.parse(comment);
			for (JSDocTag tag : tags.list(JSDocTag.PARAM)) {
				final ParameterNode node = JSDocSupport.parseParameter(tag);
				if (node != null) {
					final IParameter parameter = method.getParameter(node.name);
					if (parameter != null) {
						final Identifier ref = new Identifier(null);
						ref.setName(node.name);
						ref.setStart(node.offset);
						ref.setEnd(node.offset + node.name.length());
						nodes.add(new LocalVariableReferenceNode(ref, parameter
								.getLocation()));
					}
				}
			}
		}
	}

	public void enterField(FieldInfo fieldInfo, Expression identifier,
			JSType type) {
		nodes.add(new FieldDeclarationNode(identifier, type));
	}

	public boolean enterFieldCheckDuplicates(FieldInfo fieldInfo,
			Expression identifier, JSType type) {
		enterField(fieldInfo, identifier, type);
		return true;
	}

	public void enterLocal(Identifier identifier, JSType type) {
		nodes.add(new LocalVariableDeclarationNode(identifier, module, type));
	}

	public void exitMethod(int sourceEnd) {
	}

	public void exitField(int sourceEnd) {
	}

	public void exitLocal(int sourceEnd) {
	}

	public boolean needsTypeInference() {
		// TODO (alex) also check if there are corresponding predicates?
		for (MatchingNode node : nodes) {
			if (node instanceof MemberReferenceNode) {
				return true;
			}
		}
		return false;
	}

	public void resolveReferences(JSBindings bindings) {
		for (MatchingNode node : nodes) {
			if (node instanceof MemberReferenceNode) {
				final MemberReferenceNode refNode = (MemberReferenceNode) node;
				final IValueReference reference = bindings.get(refNode.node);
				if (reference != null) {
					refNode.location = reference.getLocation();
				}
			}
		}
	}

}
