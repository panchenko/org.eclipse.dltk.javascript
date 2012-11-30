package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.Iterator;
import java.util.Stack;

import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.compiler.IElementRequestor.ImportInfo;
import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.compiler.IElementRequestor.TypeInfo;
import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.structure.IDeclaration;
import org.eclipse.dltk.javascript.structure.IStructureRequestor;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.ClassType;
import org.eclipse.dltk.javascript.typeinfo.model.FunctionType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.MapType;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.emf.ecore.EObject;

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
		reportTypeReferences(method.getType(), methodInfo.declarationStart);
		reportTypeReferences(method.getThisType(), methodInfo.declarationStart);
		for (IParameter parameter : method.getParameters()) {
			reportTypeReferences(parameter.getType(),
					methodInfo.declarationStart);
		}
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
			reportTypeReferences(type, fieldInfo.declarationStart);
		} else {
			requestor.acceptFieldReference(fieldInfo.name,
					identifer.sourceStart());
		}
	}

	private void reportTypeReferences(JSType type, int position) {
		if (type == null || type instanceof SimpleType) {
			return;
		}
		reportSimpleTypeReference(type, position);
		for (Iterator<EObject> i = type.eAllContents(); i.hasNext();) {
			final EObject child = i.next();
			if (child instanceof JSType) {
				reportSimpleTypeReference((JSType) child, position);
			}
		}
	}

	private void reportSimpleTypeReference(JSType type, int position) {
		final Type t;
		if (type instanceof MapType) {
			t = Types.OBJECT;
		} else if (type instanceof ArrayType) {
			t = Types.ARRAY;
		} else if (type instanceof FunctionType) {
			t = Types.FUNCTION;
		} else if (type instanceof SimpleType) {
			t = ((SimpleType) type).getTarget();
		} else if (type instanceof ClassType) {
			t = ((ClassType) type).getTarget();
		} else {
			return;
		}
		if (t != null) {
			requestor.acceptTypeReference(t.getName(), position);
		}
	}

}
