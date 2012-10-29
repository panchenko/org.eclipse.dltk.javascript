package org.eclipse.dltk.javascript.core.dom.rewrite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.dltk.javascript.ast.Comment;
import org.eclipse.dltk.javascript.ast.MultiLineComment;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

class CommentContainer extends AdapterImpl {

	final MultiLineComment[] comments;

	public CommentContainer(MultiLineComment[] comments) {
		this.comments = comments;
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type == CommentContainer.class;
	}

	static CommentContainer of(Collection<Comment> comments) {
		if (comments.isEmpty()) {
			return null;
		}
		final List<MultiLineComment> jsdocs = new ArrayList<MultiLineComment>(
				comments.size());
		for (Comment comment : comments) {
			if (comment instanceof MultiLineComment) {
				jsdocs.add((MultiLineComment) comment);
			}
		}
		if (jsdocs.isEmpty()) {
			return null;
		}
		Collections.sort(jsdocs, new Comparator<MultiLineComment>() {
			public int compare(MultiLineComment o1, MultiLineComment o2) {
				return o1.start() - o2.start();
			}
		});
		return new CommentContainer(jsdocs.toArray(new MultiLineComment[jsdocs
				.size()]));
	}

}
