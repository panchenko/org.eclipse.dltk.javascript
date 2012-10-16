package org.eclipse.dltk.javascript.structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.core.ISourceNode;
import org.eclipse.dltk.internal.javascript.parser.JSModifiers;
import org.eclipse.dltk.javascript.ast.Argument;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public abstract class FunctionNode extends Scope {

	final FunctionStatement function;
	final IMethod method;

	public FunctionNode(IParentNode parent, FunctionStatement function,
			IMethod method) {
		super(parent);
		this.function = function;
		this.method = method;
		for (Argument argument : function.getArguments()) {
			final String name = argument.getArgumentName();
			final IParameter parameter = method.getParameter(name);
			addChild(new ArgumentNode(this, name,
					parameter != null ? parameter.getType() : null,
					ReferenceLocation.create(method.getLocation().getSource(),
							argument.start(), argument.end())));
		}
	}

	public JSType getType() {
		return method.getType();
	}

	public int start() {
		return getNameNode().start();
	}

	protected String argumentsToString() {
		final StringBuilder sb = new StringBuilder();
		for (ArgumentNode argument : getArguments()) {
			if (sb.length() != 0) {
				sb.append(',');
			}
			sb.append(argument.getName());
			if (argument.getType() != null) {
				sb.append(':');
				sb.append(argument.getType().getName());
			}
		}
		return sb.toString();
	}

	protected List<ArgumentNode> getArguments() {
		List<ArgumentNode> result = null;
		for (IStructureNode node : getChildren()) {
			if (node instanceof ArgumentNode) {
				if (result == null) {
					result = new ArrayList<ArgumentNode>(function
							.getArguments().size());
				}
				result.add((ArgumentNode) node);
			}
		}
		return result != null ? result : Collections.<ArgumentNode> emptyList();
	}

	@Override
	public void reportStructure(IStructureRequestor requestor,
			boolean allowDeclarations) {
		if (allowDeclarations) {
			final MethodInfo info = new MethodInfo();
			info.declarationStart = function.start();
			info.name = getName();
			if (method.getVisibility() != null) {
				info.modifiers |= method.getVisibility().getFlags();
			}
			if (method.isDeprecated()) {
				info.modifiers |= JSModifiers.DEPRECATED;
			}
			final ISourceNode nameNode = getNameNode();
			info.nameSourceStart = nameNode.start();
			info.nameSourceEnd = nameNode.end() - 1;
			final List<ArgumentNode> arguments = getArguments();
			if (!arguments.isEmpty()) {
				final int argumentCount = arguments.size();
				info.parameterNames = new String[argumentCount];
				info.parameterTypes = new String[argumentCount];
				for (int i = 0; i < argumentCount; ++i) {
					final ArgumentNode argument = arguments.get(i);
					info.parameterNames[i] = argument.getName();
					info.parameterTypes[i] = typeToModel(argument.getType());
				}
			}
			info.returnType = typeToModel(getType());
			info.isConstructor = method.isConstructor();
			requestor.enterMethod(info, function.getName(), function, method);
			super.reportStructure(requestor, false);
			requestor.exitMethod(function.end() - 1);
		} else {
			super.reportStructure(requestor, allowDeclarations);
		}
	}

	protected abstract String getName();

	protected abstract ISourceNode getNameNode();

}
