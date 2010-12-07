package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.internal.javascript.ti.JSMethod;
import org.eclipse.dltk.javascript.ast.Argument;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public interface IStructureRequestor {

	void acceptFieldReference(Identifier node, IValueReference reference);

	void acceptMethodReference(Identifier node, int argCount,
			IValueReference reference);

	void enterMethod(MethodInfo methodInfo, Identifier identifier,
			JSMethod method);

	void exitMethod(int sourceEnd);

	void exitField(int sourceEnd);

	void enterField(Identifier identifier, int sourceStart, Type type);

	boolean enterFieldCheckDuplicates(Identifier identifier, int sourceStart,
			Type type);

	void acceptLocalReference(Identifier node, IValueReference reference);

	public void enterLocal(Identifier identifier, ISourceModule module,
			Type type);

	void exitLocal(int sourceEnd);

	void acceptArgumentDeclaration(Argument argument,
			ISourceModule sourceModule, Type type);

}
