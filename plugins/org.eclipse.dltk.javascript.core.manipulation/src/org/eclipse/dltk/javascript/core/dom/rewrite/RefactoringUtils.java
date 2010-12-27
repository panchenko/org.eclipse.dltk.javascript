package org.eclipse.dltk.javascript.core.dom.rewrite;

import org.eclipse.dltk.javascript.core.dom.BinaryExpression;
import org.eclipse.dltk.javascript.core.dom.BinaryOperator;
import org.eclipse.dltk.javascript.core.dom.CallExpression;
import org.eclipse.dltk.javascript.core.dom.DomPackage;
import org.eclipse.dltk.javascript.core.dom.Expression;
import org.eclipse.dltk.javascript.core.dom.FunctionExpression;
import org.eclipse.dltk.javascript.core.dom.Node;
import org.eclipse.dltk.javascript.core.dom.ParenthesizedExpression;
import org.eclipse.dltk.javascript.core.dom.PropertyAccessExpression;
import org.eclipse.dltk.javascript.core.dom.SimplePropertyAssignment;
import org.eclipse.dltk.javascript.core.dom.UnaryOperator;
import org.eclipse.dltk.javascript.core.dom.VariableDeclaration;

public class RefactoringUtils {
	private RefactoringUtils() {
	}

	public static CallExpression getFunctionReference(Node node){
		if (node.eContainingFeature() == DomPackage.eINSTANCE.getCallExpression_Applicant())
			return (CallExpression)node.eContainer();
		if (node.eContainingFeature() == DomPackage.eINSTANCE.getPropertyAccessExpression_Property())
			return getFunctionReference((Node)node.eContainer());
		return null;
	}

	public static FunctionExpression getFunctionDeclaration(Node node) {
		if (node.eContainingFeature() == DomPackage.eINSTANCE.getFunctionExpression_Identifier())
			return (FunctionExpression)node.eContainer();
		if (node.eContainingFeature() == DomPackage.eINSTANCE.getPropertyAssignment_Name()) {
			Node parent = (Node)node.eContainer();
			if (parent instanceof SimplePropertyAssignment) {
				Node func = ((SimplePropertyAssignment)parent).getInitializer();
				if (func instanceof FunctionExpression)
					return (FunctionExpression)func;
			}
		}
		if (node.eContainingFeature() == DomPackage.eINSTANCE.getVariableDeclaration_Identifier()) {
			Expression initializer = ((VariableDeclaration)node.eContainer()).getInitializer();
			if (initializer instanceof FunctionExpression)
				return (FunctionExpression)initializer;
		}
		if (node.eContainingFeature() == DomPackage.eINSTANCE
				.getPropertyAccessExpression_Property()) {
			Node parent = (Node) node.eContainer();
			if (parent.eContainingFeature() == DomPackage.eINSTANCE
					.getBinaryExpression_Left()) {
				BinaryExpression expr = (BinaryExpression) parent.eContainer();
				if (expr.getOperation() == BinaryOperator.ASSIGN) {
					Expression right = expr.getRight();
					if (right instanceof FunctionExpression)
						return (FunctionExpression) right;
				}
			}
		}
		return null;
	}

	public static boolean isAssignment(BinaryOperator op) {
		switch (op) {
		case ADD_ASSIGN:
		case AND_ASSIGN:
		case ASSIGN:
		case DIV_ASSIGN:
		case LSH_ASSIGN:
		case MOD_ASSIGN:
		case MUL_ASSIGN:
		case OR_ASSIGN:
		case RSH_ASSIGN:
		case SUB_ASSIGN:
		case URSH_ASSIGN:
		case XOR_ASSIGN:
			return true;
		}
		return false;
	}

	public static boolean hasSideEffect(UnaryOperator op) {
		switch (op) {
		case POSTFIX_DEC:
		case POSTFIX_INC:
		case PREFIX_DEC:
		case PREFIX_INC:
		case DELETE:
			return true;
		}
		return false;
	}
	
	public static Expression getReceiver(CallExpression invocation) {
		Expression func = invocation.getApplicant();
		while (func instanceof ParenthesizedExpression)
			func = ((ParenthesizedExpression)func).getEnclosed();
		if (!(func instanceof PropertyAccessExpression))
			return null;
		return ((PropertyAccessExpression) func).getObject();
	}
}
