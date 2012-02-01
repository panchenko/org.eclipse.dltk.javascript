package org.eclipse.dltk.javascript.internal.ui.quickfix;

import org.eclipse.core.resources.IFile;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.JSNode;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;
import org.eclipse.text.edits.InsertEdit;
import org.eclipse.text.edits.MultiTextEdit;

public class CreateLocalVariableQuickFix extends TextFileEditResolution {

	public CreateLocalVariableQuickFix(IFile scriptFile, int problemStartIdx) {
		super(scriptFile, problemStartIdx);
	}

	public String getLabel() {
		return "Create local variable";
	}

	public String getDescription() {

		Identifier identifier = getIdentifier(getScriptFile(),
				getProblemStartIdx());
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
										identifier.sourceStart()
												- parent.sourceStart());
						// get 5 lines
						int index = functionString.lastIndexOf('\n');
						int counter = 0;
						while (index != -1) {
							if (++counter == 5)
								break;
							index = functionString.lastIndexOf('\n', index - 1);
						}
						if (index != -1)
							functionString = functionString.substring(index);
						StringBuilder sb = new StringBuilder(
								functionString.length() + 50);
						sb.append("<html><body>");
						sb.append(functionString.replace("\n", "<br>"));
						sb.append("<b>var </b>");
						sb.append(identifier.getName());
						sb.append("</body></html>");
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
			textEdit.addChild(new InsertEdit(found.sourceStart(), "var "));
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
							&& (range.getOffset() + range.getLength()) > offset) {
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
