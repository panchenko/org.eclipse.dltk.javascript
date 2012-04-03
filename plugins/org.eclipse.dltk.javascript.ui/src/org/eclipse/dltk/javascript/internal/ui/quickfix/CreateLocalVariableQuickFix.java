package org.eclipse.dltk.javascript.internal.ui.quickfix;

import org.eclipse.core.resources.IFile;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.javascript.ast.BinaryOperation;
import org.eclipse.dltk.javascript.ast.Comment;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.JSNode;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.Statement;
import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;
import org.eclipse.dltk.ui.DLTKPluginImages;
import org.eclipse.swt.graphics.Image;
import org.eclipse.text.edits.InsertEdit;
import org.eclipse.text.edits.MultiTextEdit;

public class CreateLocalVariableQuickFix extends TextFileEditResolution {

	public CreateLocalVariableQuickFix(IFile scriptFile, int problemStartIdx) {
		super(scriptFile, problemStartIdx);
	}

	public String getLabel() {
		return "Create local variable";
	}

	@Override
	public Image getImage() {
		return DLTKPluginImages.getImage(JavaScriptUI.getDefault(),
				"icons/obj16/localvariable_obj.gif");
	}

	public String getDescription() {

		Identifier identifier = getIdentifier(getScriptFile(),
				getProblemStartIdx());
		if (identifier != null) {
			ASTNode parent = identifier.getParent();
			while (parent instanceof JSNode) {
				if (parent instanceof FunctionStatement) {
					Statement statement = ((FunctionStatement) parent)
							.getBody().getStatements().get(0);
					ISourceModule sourceModule = DLTKCore
							.createSourceModuleFrom(getScriptFile());
					try {
						String functionString = sourceModule.getBuffer()
								.getText(
										parent.sourceStart(),
										statement.sourceStart()
												- parent.sourceStart());
						StringBuilder sb = new StringBuilder(
								functionString.length() + 50);
						sb.append("<html><body>");
						sb.append(functionString.replace("\n", "<br>"));
						sb.append("<b>var ");
						sb.append(identifier.getName());
						sb.append(";</b></body></html>");
						return sb.toString();
					} catch (ModelException e) {
					}

					break;
				}
				parent = ((JSNode) parent).getParent();
			}
			return "<html><body>Create local variable<br><b>var </b>"
					+ identifier.getName() + "<body></html>";
		}
		return "Failed to create a local variable";
	}

	@Override
	protected MultiTextEdit getTextEdit(IFile file, final int offset) {
		MultiTextEdit textEdit = new MultiTextEdit();

		final Identifier found = getIdentifier(file, offset);
		if (found != null) {
			String extraLine = "\n";
			ASTNode parent = found.getParent();
			ASTNode node = null;
			while (parent instanceof JSNode) {
				if (parent instanceof FunctionStatement) {
					node = ((FunctionStatement) parent).getBody()
							.getStatements().get(0);
					extraLine = "";
					break;

				} else if (parent instanceof BinaryOperation
						&& ((BinaryOperation) parent).isAssignment()
						&& ((BinaryOperation) parent).getLeftExpression() == found) {
					textEdit.addChild(new InsertEdit(found.sourceStart(),
							"var "));
					node = null;
					break;
				}
				parent = ((JSNode) parent).getParent();
				if (!(parent instanceof Script))
					node = parent;
			}
			if (node != null) {
				Comment documentation = ((JSNode) node).getDocumentation();

				String ident = "";
				int sourceStart = node.sourceStart();
				if (documentation != null)
					sourceStart = documentation.sourceStart();
				try {
					ISourceModule sourceModule = DLTKCore
							.createSourceModuleFrom(getScriptFile());
					String functionString = sourceModule.getBuffer().getText(
							parent.sourceStart(),
							sourceStart - parent.sourceStart());
					int lastNewLine = functionString.lastIndexOf('\n');
					if (lastNewLine != -1)
						ident = functionString.substring(lastNewLine);
					else
						ident = "\n";
				} catch (ModelException e) {
				}
				textEdit.addChild(new InsertEdit(sourceStart, "var "
						+ found.getName() + ";" + extraLine + ident));
			}
		}
		return textEdit;
	}

	/**
	 * @param file
	 * @param offset
	 * @return
	 */
	public static Identifier getIdentifier(IFile file, final int offset) {
		Script script = JavaScriptParserUtil.parse(DLTKCore
				.createSourceModuleFrom(file));
		final Identifier[] found = new Identifier[1];
		ASTVisitor finder = new ASTVisitor() {
			@Override
			public boolean visitGeneral(ASTNode node) throws Exception {
				if (found[0] != null)
					return false;
				if (node instanceof Identifier) {
					ISourceRange range = ((Identifier) node).getRange();
					if (range.getOffset() <= offset
							&& (range.getOffset() + range.getLength()) >= offset) {
						found[0] = (Identifier) node;
						return false;
					}
				}
				return true;
			}
		};
		try {
			script.traverse(finder);
		} catch (Exception e) {
			// ignore
			e.printStackTrace();
		}
		return found[0];
	}
}
