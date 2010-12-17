package org.eclipse.dltk.javascript.internal.search;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.compiler.IElementRequestor.TypeInfo;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.search.matching2.MatchingCollector;
import org.eclipse.dltk.internal.javascript.parser.structure.IStructureRequestor;
import org.eclipse.dltk.javascript.ast.Argument;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;

public class MatchingCollectorSourceElementRequestor implements
		IStructureRequestor {

	private final MatchingCollector<MatchingNode> matchingCollector;

	private final List<MatchingNode> nodes = new ArrayList<MatchingNode>();

	public MatchingCollectorSourceElementRequestor(
			MatchingCollector<MatchingNode> matchingCollector) {
		this.matchingCollector = matchingCollector;

	}

	public void report() {
		for (MatchingNode node : nodes) {
			matchingCollector.report(node);
		}
		nodes.clear();
	}

	public void acceptLocalReference(Identifier node, IValueReference reference) {
		nodes.add(new LocalVariableReferenceNode(node, reference.getLocation()));
	}

	public void acceptFieldReference(Identifier node, IValueReference reference) {
		nodes.add(new FieldReferenceNode(node, reference));
	}

	public void acceptMethodReference(Identifier node, int argCount,
			IValueReference reference) {
		nodes.add(new MethodReferenceNode(node, reference));
	}

	public void acceptArgumentDeclaration(Argument argument,
			ISourceModule sourceModule, String type) {
		nodes.add(new ArgumentDeclarationNode(argument, sourceModule, type));
	}

	public void enterType(TypeInfo typeInfo) {
	}

	public void exitType(int sourceEnd) {
	}

	public void enterMethod(MethodInfo methodInfo, Identifier identifier,
			IMethod method) {
		// ignore method(function(){});
		if (identifier == null)
			return;
		nodes.add(new MethodDeclarationNode(identifier, method));
	}

	public void enterField(FieldInfo fieldInfo, Identifier identifier) {
		nodes.add(new FieldDeclarationNode(identifier, fieldInfo.type));
	}

	public boolean enterFieldCheckDuplicates(FieldInfo fieldInfo,
			Identifier identifier) {
		nodes.add(new FieldDeclarationNode(identifier, fieldInfo.type));
		return true;
	}

	public void enterLocal(Identifier identifier, ISourceModule module,
			String type) {
		nodes.add(new LocalVariableDeclarationNode(identifier, module, type));
	}

	public void exitMethod(int sourceEnd) {
	}

	public void exitField(int sourceEnd) {
	}

	public void exitLocal(int sourceEnd) {
	}

}
