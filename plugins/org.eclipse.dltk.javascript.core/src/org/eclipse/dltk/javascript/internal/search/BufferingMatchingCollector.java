package org.eclipse.dltk.javascript.internal.search;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.core.search.matching2.IMatchingCollector;

public class BufferingMatchingCollector<E> implements IMatchingCollector<E> {

	private final IMatchingCollector<E> collector;
	private final List<E> nodes = new ArrayList<E>();

	public BufferingMatchingCollector(IMatchingCollector<E> collector) {
		this.collector = collector;
	}
	
	public void report(E node) {
		nodes.add(node);
	}

	public void flush() {
		for (E node : nodes) {
			collector.report(node);
		}
		nodes.clear();
	}
}
