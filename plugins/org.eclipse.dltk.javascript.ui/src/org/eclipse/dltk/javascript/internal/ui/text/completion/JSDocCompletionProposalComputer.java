package org.eclipse.dltk.javascript.internal.ui.text.completion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.internal.javascript.ti.JSDocSupport;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;
import org.eclipse.dltk.ui.text.completion.ContentAssistInvocationContext;
import org.eclipse.dltk.ui.text.completion.IScriptCompletionProposalComputer;
import org.eclipse.dltk.ui.text.completion.ScriptContentAssistInvocationContext;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ContextInformation;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;

public class JSDocCompletionProposalComputer implements
		IScriptCompletionProposalComputer {

	public JSDocCompletionProposalComputer() {
	}

	public void sessionStarted() {
	}

	public void sessionEnded() {
	}

	public List<ICompletionProposal> computeCompletionProposals(
			ContentAssistInvocationContext context, IProgressMonitor monitor) {
		IDocument document = context.getDocument();
		try {
			IRegion line = document.getLineInformationOfOffset(context
					.getInvocationOffset());
			String doc = document.get(line.getOffset(), line.getLength());
			int invocationLineIndex = context.getInvocationOffset()
					- line.getOffset();
			int index = invocationLineIndex;
			int prefixIndex = -1;
			String prefix = null;
			String tag = null;
			boolean bracketFound = false;
			boolean skipNoneIdentifiers = false;
			while (--index > 0) {
				char ch = doc.charAt(index);
				if (!Character.isJavaIdentifierPart(ch)) {
					if (skipNoneIdentifiers)
						continue;
					if (ch == '@') {
						// tag found.
						tag = doc.substring(index,
								prefixIndex == -1 ? invocationLineIndex
										: prefixIndex);
						break;
					}
					if (prefixIndex != -1 || ch == '}')
						return Collections.emptyList();
					if (ch == '{') {
						prefixIndex = index + 1;
						prefix = doc
								.substring(prefixIndex, invocationLineIndex);
						bracketFound = true;
						skipNoneIdentifiers = true;
					} else {
						prefix = doc.substring(index, invocationLineIndex);
						prefixIndex = index;
					}
					continue;
				} else {
					skipNoneIdentifiers = false;
				}
			}
			if (prefixIndex == -1) {
				if (tag != null) {
					List<ICompletionProposal> proposals = new ArrayList<ICompletionProposal>();
					String[] tags = JSDocSupport.getTags();
					for (String jsdocTag : tags) {
						if (jsdocTag.startsWith(tag)) {
							if (jsdocTag.equals("@param")) {
								CompletionProposal proposal = new CompletionProposal(
										jsdocTag + " {} name",
										context.getInvocationOffset()
												- tag.length(), tag.length(),
										jsdocTag.length() + 2, null,
										"@param {Type} name",
										new ContextInformation(
												"@param {Type} name",
												"{Type} name"), null);
								proposals.add(proposal);
							} else {
								proposals.add(new CompletionProposal(
										jsdocTag + ' ', context
												.getInvocationOffset()
												- tag.length(), tag.length(),
										jsdocTag.length() + 1));
							}
						}
					}
					return proposals;
				}
			} else if (bracketFound || "@type".equals(tag)) {
				return generateTypes(context, prefix);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	/**
	 * @param context
	 * @param prefix
	 * @return
	 */
	private List<ICompletionProposal> generateTypes(
			ContentAssistInvocationContext context, String prefix) {
		if (context instanceof ScriptContentAssistInvocationContext) {
			TypeInferencer2 infencer = new TypeInferencer2();
			ISourceModule sourceModule = ((ScriptContentAssistInvocationContext) context)
					.getSourceModule();
			infencer.setModelElement(sourceModule);
			infencer.doInferencing(JavaScriptParserUtil.parse(sourceModule,
					null));
			prefix = prefix.trim();
			Set<String> listTypes = infencer.listTypes(prefix);
			List<ICompletionProposal> proposals = new ArrayList<ICompletionProposal>();
			for (String type : listTypes) {
				proposals.add(new CompletionProposal(type, context
						.getInvocationOffset() - prefix.length(), prefix
						.length(), type.length()));
			}
			return proposals;
		}
		return Collections.emptyList();
	}

	public List<IContextInformation> computeContextInformation(
			ContentAssistInvocationContext context, IProgressMonitor monitor) {
		return null;
	}

	public String getErrorMessage() {
		return null;
	}

}
