package org.eclipse.dltk.javascript.internal.ui.text.completion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.codeassist.ICompletionEngine;
import org.eclipse.dltk.core.DLTKLanguageManager;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.javascript.core.JSKeywordCategory;
import org.eclipse.dltk.javascript.core.JSKeywordManager;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.internal.core.codeassist.JSCompletionEngine;
import org.eclipse.dltk.javascript.internal.ui.templates.JSDocTemplateCompletionProcessor;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.typeinfo.TypeMode;
import org.eclipse.dltk.ui.DLTKPluginImages;
import org.eclipse.dltk.ui.templates.ScriptTemplateProposal;
import org.eclipse.dltk.ui.text.completion.ContentAssistInvocationContext;
import org.eclipse.dltk.ui.text.completion.IScriptCompletionProposalComputer;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.ScriptContentAssistInvocationContext;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;

@SuppressWarnings("restriction")
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
					final JSDocTemplateCompletionProcessor processor = new JSDocTemplateCompletionProcessor(
							(ScriptContentAssistInvocationContext) context);
					Collections.addAll(
							proposals,
							processor.computeCompletionProposals(
									context.getViewer(),
									context.getInvocationOffset()));
					//
					final Set<String> tags = new HashSet<String>();
					Collections.addAll(tags, JSDocTag.getTags());
					ISourceModule module = null; // TODO detect source module
					Collections.addAll(tags, JSKeywordManager.getInstance()
							.getKeywords(JSKeywordCategory.JS_DOC_TAG, module));
					// TODO option to ignore @returns ?
					tags.remove(JSDocTag.RETURNS);
					// collect used tags, to show keywords only for missing ones
					final Set<String> usedTags = new HashSet<String>();
					for (ICompletionProposal proposal : proposals) {
						if (proposal instanceof ScriptTemplateProposal) {
							usedTags.add(((ScriptTemplateProposal) proposal)
									.getTemplateName());
						}
					}

					for (String jsdocTag : tags) {
						if (jsdocTag.startsWith(tag)
								&& !usedTags.contains(jsdocTag)) {
							proposals
									.add(new ScriptCompletionProposal(
											jsdocTag + ' ',
											context.getInvocationOffset()
													- tag.length(),
											tag.length(),
											DLTKPluginImages
													.get(DLTKPluginImages.IMG_OBJS_JAVADOCTAG),
											jsdocTag, 90, true));
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
			final JSCompletionEngine engine = getCompletionEngine();
			if (engine != null) {
				final ISourceModule module = ((ScriptContentAssistInvocationContext) context)
						.getSourceModule();
				final JavaScriptCompletionProposalCollector collector = new JavaScriptCompletionProposalCollector(
						module);
				engine.setRequestor(collector);
				engine.completeTypes(module, TypeMode.JSDOC, prefix.trim(),
						context.getInvocationOffset());
				return Arrays.<ICompletionProposal> asList(collector
						.getScriptCompletionProposals());
			}
		}
		return Collections.emptyList();
	}

	private JSCompletionEngine getCompletionEngine() {
		final ICompletionEngine[] engines = DLTKLanguageManager
				.getCompletionEngines(JavaScriptNature.NATURE_ID);
		if (engines != null) {
			for (ICompletionEngine engine : engines) {
				if (engine instanceof JSCompletionEngine) {
					return (JSCompletionEngine) engine;
				}
			}
		}
		return null;
	}

	public List<IContextInformation> computeContextInformation(
			ContentAssistInvocationContext context, IProgressMonitor monitor) {
		return Collections.emptyList();
	}

	public String getErrorMessage() {
		return null;
	}

}
