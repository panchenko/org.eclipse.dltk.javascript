package org.eclipse.dltk.internal.javascript.ti;

import java.util.Set;

import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;

public class TopValueThis extends AnonymousValue {

	private final TopValueCollection owner;

	public TopValueThis(TopValueCollection collection) {
		this.owner = collection;
	}

	@Override
	public boolean isReference() {
		return true;
	}

	public Set<String> getDirectChildren() {
		return owner.getDirectChildren();
	}

	public Set<String> getDeletedChildren() {
		return owner.getDeletedChildren();
	}

	public boolean hasChild(String name) {
		return owner.hasChild(name);
	}

	public IValueReference getChild(String name) {
		return owner.getChild(name);
	}

	@Override
	public ReferenceKind getKind() {
		return ReferenceKind.THIS;
	}

}
