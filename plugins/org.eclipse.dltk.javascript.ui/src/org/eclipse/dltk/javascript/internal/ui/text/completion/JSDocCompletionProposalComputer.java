package org.eclipse.dltk.javascript.internal.ui.text.completion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.codeassist.ICompletionEngine;
import org.eclipse.dltk.compiler.CharOperation;
import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.core.DLTKLanguageManager;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.core.JSKeywordCategory;
import org.eclipse.dltk.javascript.core.JSKeywordManager;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.internal.core.codeassist.JSCompletionEngine;
import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.javascript.internal.ui.templates.JSDocTemplateCompletionProcessor;
import org.eclipse.dltk.javascript.internal.ui.text.JSDocTextUtils;
import org.eclipse.dltk.javascript.internal.ui.text.TypeNameNode;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.typeinfo.TypeMode;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.dltk.ui.DLTKPluginImages;
import org.eclipse.dltk.ui.templates.ScriptTemplateProposal;
import org.eclipse.dltk.ui.text.completion.ContentAssistInvocationContext;
import org.eclipse.dltk.ui.text.completion.IScriptCompletionProposalComputer;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.ScriptContentAssistInvocationContext;
import org.eclipse.jface.text.BadLocationException;
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
			final IRegion region = JSDocTextUtils.getLineRegion(document,
					context.getInvocationOffset());
			final char[] line = document.get(region.getOffset(),
					region.getLength()).toCharArray();
			final int offsetInLine = context.getInvocationOffset()
					- region.getOffset();
			final TypeNameNode tagName = JSDocTextUtils.getTag(line, 0,
					offsetInLine);
			if (tagName == null) {
				return Collections.emptyList();
			}
			if (tagName.end == offsetInLine) {
				return completionOnTag(context, tagName.value());
			}
			int index = tagName.end;
			while (index < offsetInLine && Character.isWhitespace(line[index])) {
				++index;
			}
			if (JSDocTag.SEE.equals(tagName.value())) {
				int valueStart = index;
				while (index < offsetInLine) {
					if (Character.isWhitespace(line[index])) {
						return Collections.emptyList();
					}
					++index;
				}
				return completionAfterSee(context, new String(line, valueStart,
						index - valueStart));
			}
			int depth = 0;
			int nameStart = index;
			boolean breakOnSpace = false;
			if (index < offsetInLine && line[index] == '{') {
				++index;
				depth = 1;
				nameStart = index;
			} else if (JSDocTag.TYPE.equals(tagName.value())) {
				breakOnSpace = true;
			} else {
				return Collections.emptyList();
			}
			while (index < offsetInLine) {
				if (line[index] == '}') {
					if (--depth <= 0) {
						return Collections.emptyList();
					}
				} else if (line[index] == '{') {
					++depth;
				} else if (line[index] == '<' || line[index] == '>'
						|| line[index] == '(' || line[index] == ':'
						|| line[index] == ',' || line[index] == '|') {
					nameStart = index + 1;
				} else if (breakOnSpace && Character.isWhitespace(line[index])) {
					return Collections.emptyList();
				}
				++index;
			}
			if (index == offsetInLine) {
				return completionOnType(context, new String(line, nameStart,
						index - nameStart));
			}
		} catch (BadLocationException e) {
			JavaScriptUI.log(e);
		}
		return Collections.emptyList();
	}

	private static final char JSDOC_MEMBER_SEPARATOR = '#';

	/**
	 * @param context
	 * @param prefix
	 * @return
	 */
	private List<ICompletionProposal> completionAfterSee(
			ContentAssistInvocationContext context, String prefix) {
		if (!(context instanceof ScriptContentAssistInvocationContext)) {
			return Collections.emptyList();
		}
		int pos = prefix.indexOf(JSDOC_MEMBER_SEPARATOR);
		if (pos < 0) {
			return completionOnType(context, prefix);
		} else {
			final JSCompletionEngine engine = getCompletionEngine();
			if (engine == null) {
				return Collections.emptyList();
			}
			final ISourceModule module = ((ScriptContentAssistInvocationContext) context)
					.getSourceModule();
			final JavaScriptCompletionProposalCollector collector = new JavaScriptCompletionProposalCollector(
					module);
			collector
					.setInvocationContext((ScriptContentAssistInvocationContext) context);
			engine.setRequestor(collector);
			collector.setAttribute(TypeMode.JSDOC, Boolean.TRUE);
			final String typeName = prefix.substring(0, pos);
			if (typeName.length() != 0) {
				final TypeInferencer2 inferencer2 = new TypeInferencer2();
				inferencer2.setModelElement(module);
				final Type type = inferencer2.getType(typeName);
				if (type == null || type.getKind() == TypeKind.UNKNOWN) {
					return Collections.emptyList();
				}
				// TODO (alex) generate proposals directly, without engine
				engine.completeMembers(module, prefix.substring(pos + 1),
						context.getInvocationOffset(), true, inferencer2
								.convert(type).getMembers());
				return Arrays.<ICompletionProposal> asList(collector
						.getScriptCompletionProposals());
			} else {
				collector.setIgnored(CompletionProposal.KEYWORD, true);
				collector.setIgnored(CompletionProposal.TYPE_REF, true);
				engine.setGlobalOptions(JSCompletionEngine.OPTION_NONE);
				engine.completeGlobals(module, prefix.substring(1),
						context.getInvocationOffset(), true);
				return Arrays.<ICompletionProposal> asList(collector
						.getScriptCompletionProposals());
			}
		}
	}

	private List<ICompletionProposal> completionOnTag(
			ContentAssistInvocationContext context, String tag) {
		final List<ICompletionProposal> proposals = new ArrayList<ICompletionProposal>();
		final JSDocTemplateCompletionProcessor processor = new JSDocTemplateCompletionProcessor(
				(ScriptContentAssistInvocationContext) context);
		Collections.addAll(proposals, processor.computeCompletionProposals(
				context.getViewer(), context.getInvocationOffset()));
		//
		final Set<String> tags = new HashSet<String>();
		Collections.addAll(tags, JSDocTag.getTags());
		ISourceModule module = context instanceof ScriptContentAssistInvocationContext ? ((ScriptContentAssistInvocationContext) context)
				.getSourceModule() : null;
		Collections.addAll(
				tags,
				JSKeywordManager.getInstance().getKeywords(
						JSKeywordCategory.JS_DOC_TAG, module));
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
			if (CharOperation.prefixEquals(tag, jsdocTag)
					&& !usedTags.contains(jsdocTag)) {
				proposals.add(new ScriptCompletionProposal(jsdocTag + ' ',
						context.getInvocationOffset() - tag.length(), tag
								.length(), DLTKPluginImages
								.get(DLTKPluginImages.IMG_OBJS_JAVADOCTAG),
						jsdocTag, 90, true));
			}
		}
		return proposals;
	}

	/**
	 * @param context
	 * @param prefix
	 * @return
	 */
	private List<ICompletionProposal> completionOnType(
			ContentAssistInvocationContext context, String prefix) {
		if (context instanceof ScriptContentAssistInvocationContext) {
			final JSCompletionEngine engine = getCompletionEngine();
			if (engine != null) {
				final ISourceModule module = ((ScriptContentAssistInvocationContext) context)
						.getSourceModule();
				final JavaScriptCompletionProposalCollector collector = new JavaScriptCompletionProposalCollector(
						module);
				collector.setAttribute(TypeMode.JSDOC, Boolean.TRUE);
				collector
						.setInvocationContext((ScriptContentAssistInvocationContext) context);
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
