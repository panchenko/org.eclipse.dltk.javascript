package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.internal.javascript.ti.JSMethod;
import org.eclipse.dltk.javascript.ast.Argument;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class StructureRequestor implements IStructureRequestor {

	private final ISourceElementRequestor requestor;

	public StructureRequestor(ISourceElementRequestor requestor) {
		this.requestor = requestor;

	}

	public void acceptLocalReference(Identifier node, IValueReference reference) {
	}

	public void acceptArgumentDeclaration(Argument argument,
			ISourceModule sourceModule, Type type) {
	}

	public void enterLocal(Identifier identifier, ISourceModule module,
			Type type) {
	}

	public void exitLocal(int sourceEnd) {
	}

	public void acceptFieldReference(Identifier node, IValueReference reference) {
		requestor.acceptFieldReference(node.getName(), node.sourceStart() - 1);

	}

	public void acceptMethodReference(Identifier node, int argCount,
			IValueReference reference) {
		requestor.acceptMethodReference(node.getName(), argCount,
				node.sourceStart(), node.sourceEnd() - 1);
	}

	public void enterMethod(MethodInfo methodInfo, Identifier identifier,
			JSMethod method) {
		requestor.enterMethod(methodInfo);
	}

	public void exitMethod(int sourceEnd) {
		requestor.exitMethod(sourceEnd);
	}

	public void exitField(int sourceEnd) {
		requestor.exitField(sourceEnd);
	}

	public void enterField(Identifier identifer, int sourceStart, Type type) {
		requestor.enterField(createFieldInfo(identifer, sourceStart, type));
	}

	private FieldInfo createFieldInfo(Identifier identifer, int sourceStart,
			Type type) {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.declarationStart = sourceStart;
		fieldInfo.name = identifer.getName();
		fieldInfo.nameSourceStart = identifer.sourceStart();
		fieldInfo.nameSourceEnd = identifer.sourceEnd() - 1;
		if (type != null)
			fieldInfo.type = type.getName();
		return fieldInfo;
	}

	public boolean enterFieldCheckDuplicates(Identifier identifier,
			int sourceStart, Type type) {
		return requestor.enterFieldCheckDuplicates(createFieldInfo(identifier,
				sourceStart, type));
	}

}
