package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.Stack;

import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.compiler.IElementRequestor.ImportInfo;
import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.compiler.IElementRequestor.TypeInfo;
import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.structure.IDeclaration;
import org.eclipse.dltk.javascript.structure.IStructureRequestor;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public class StructureRequestor implements IStructureRequestor {

	private static enum ElementType {
		FIELD, FIELD_LOCAL
	}

	private final ISourceElementRequestor requestor;
	private final Stack<ElementType> elementTypes = new Stack<ElementType>();

	public StructureRequestor(ISourceElementRequestor requestor) {
		this.requestor = requestor;
	}

	public void acceptImport(ImportInfo importInfo) {
		requestor.acceptImport(importInfo);
	}

	public void acceptLocalReference(Identifier node, IDeclaration target) {
	}

	public void enterLocal(Identifier identifer, JSType type) {
	}

	public void exitLocal(int sourceEnd) {
	}

	public void acceptFieldReference(Identifier node) {
		requestor.acceptFieldReference(node.getName(), node.sourceStart());
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
		if (elementTypes.pop() == ElementType.FIELD) {
			requestor.exitField(sourceEnd);
		}
	}

	public void enterField(FieldInfo fieldInfo, Expression identifer,
			JSType type, boolean local) {
		elementTypes.push(local ? ElementType.FIELD_LOCAL : ElementType.FIELD);
		if (!local) {
			requestor.enterField(fieldInfo);
		} else {
			requestor.acceptFieldReference(fieldInfo.name,
					identifer.sourceStart());
		}
	}

}
