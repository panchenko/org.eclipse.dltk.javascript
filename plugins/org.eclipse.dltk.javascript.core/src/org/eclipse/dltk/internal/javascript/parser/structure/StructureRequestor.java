package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.compiler.IElementRequestor.TypeInfo;
import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.structure.IDeclaration;
import org.eclipse.dltk.javascript.structure.IStructureRequestor;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public class StructureRequestor implements IStructureRequestor {

	private final ISourceElementRequestor requestor;

	public StructureRequestor(ISourceElementRequestor requestor) {
		this.requestor = requestor;

	}

	public void acceptLocalReference(Identifier node, IDeclaration target) {
	}

	public void enterLocal(Identifier identifier, ISourceModule module,
			JSType type) {
	}

	public void exitLocal(int sourceEnd) {
	}

	public void acceptFieldReference(Identifier node) {
		requestor.acceptFieldReference(node.getName(), node.sourceStart() - 1);
	}

	public void acceptMethodReference(Identifier node, int argCount) {
		requestor.acceptMethodReference(node.getName(), argCount,
				node.sourceStart(), node.sourceEnd() - 1);
	}

	public void enterNamespace(String[] namespace) {
		requestor.enterModuleRoot();
		requestor.enterNamespace(namespace);
	}

	public void exitNamespace() {
		requestor.exitNamespace();
		requestor.exitModuleRoot();
	}

	public void enterType(TypeInfo typeInfo) {
		requestor.enterType(typeInfo);
	}

	public void exitType(int sourceEnd) {
		requestor.exitType(sourceEnd);
	}

	public void enterMethod(MethodInfo methodInfo, Expression identifier,
			FunctionStatement function, IMethod method) {
		requestor.enterMethod(methodInfo);
	}

	public void exitMethod(int sourceEnd) {
		requestor.exitMethod(sourceEnd);
	}

	public void exitField(int sourceEnd) {
		requestor.exitField(sourceEnd);
	}

	public void enterField(FieldInfo fieldInfo, Expression identifer,
			JSType type) {
		requestor.enterField(fieldInfo);
	}

	public void updateField(FieldInfo fieldInfo, int flags) {
		requestor.updateField(fieldInfo, flags);
	}

	public boolean enterFieldCheckDuplicates(FieldInfo fieldInfo,
			Expression identifier, JSType type) {
		return requestor.enterFieldCheckDuplicates(fieldInfo);
	}

}
