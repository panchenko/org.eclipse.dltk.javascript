package org.eclipse.dltk.javascript.internal.ui.quickfix;

import org.eclipse.core.resources.IFile;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.javascript.ast.Comment;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.JSNode;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.text.edits.InsertEdit;
import org.eclipse.text.edits.MultiTextEdit;

public class CreateTopLevelVariable extends TextFileEditResolution {

	public CreateTopLevelVariable(IFile scriptFile, int problemStartIdx) {
		super(scriptFile, problemStartIdx);
	}

	public String getLabel() {
		return "Creates a top level variable in the file";
	}

	public String getDescription() {
		Identifier identifier = CreateLocalVariableQuickFix.getIdentifier(
				getScriptFile(), getProblemStartIdx());
		if (identifier != null) {
			ASTNode parent = identifier.getParent();
			while (parent instanceof JSNode) {
				if (parent instanceof FunctionStatement) {
					ISourceModule sourceModule = DLTKCore
							.createSourceModuleFrom(getScriptFile());
					try {
						String functionString = sourceModule.getBuffer()
								.getText(
										parent.sourceStart(),
										identifier.sourceEnd()
												- parent.sourceStart());
						int index = functionString.indexOf('\n');
						if (index != -1) {
							functionString.substring(0, index);
						}
						Comment documentation = ((FunctionStatement) parent)
								.getDocumentation();
						if (documentation != null) {
							functionString = documentation.getText() + "<br>"
									+ functionString;
						}
						StringBuilder sb = new StringBuilder(
								functionString.length() + 50);
						sb.append("<html><body>");
						sb.append("<b>var ");
						sb.append(identifier.getName());
						sb.append(";</b><br><br>");
						sb.append(functionString.replace("\n", "<br>"));
						sb.append("</body></html>");
						return sb.toString();
					} catch (ModelException e) {
					}

					break;
				}
				parent = ((JSNode) parent).getParent();
			}
			return "<html><body>Create top level/file variable<br><b>var </b>"
					+ identifier.getName() + "<body></html>";
		}
		return "Failed to create a local variable"; // shouldn't happen
	}

	@Override
	protected MultiTextEdit getTextEdit(IFile file, int offset) {
		MultiTextEdit edit = new MultiTextEdit();
		Identifier identifier = CreateLocalVariableQuickFix.getIdentifier(
				getScriptFile(), getProblemStartIdx());
		if (identifier != null) {
			JSNode topLevel = null;
			ASTNode parent = identifier.getParent();
			while (parent instanceof JSNode) {

				if (!(parent instanceof Script)) {
					topLevel = (JSNode) parent;
				}
				parent = ((JSNode) parent).getParent();
			}
			// this is the last Function Statement found
			if (topLevel != null) {
				int startindex = -1;
				if (topLevel.getDocumentation() != null) {
					startindex = topLevel.getDocumentation().getRange()
							.getOffset();
				} else {
					startindex = topLevel.sourceStart();
				}
				edit.addChild(new InsertEdit(startindex, "var "
						+ identifier.getName() + ";\n\n"));
			}
		}
		return edit;
	}

	public boolean isValid() {
		Identifier identifier = CreateLocalVariableQuickFix.getIdentifier(
				getScriptFile(), getProblemStartIdx());
		if (identifier != null) {
			ASTNode parent = identifier.getParent();
			while (parent instanceof JSNode) {

				if (parent instanceof FunctionStatement) {
					return true;
				}
				parent = ((JSNode) parent).getParent();
			}
		}
		return false;
	}

}
