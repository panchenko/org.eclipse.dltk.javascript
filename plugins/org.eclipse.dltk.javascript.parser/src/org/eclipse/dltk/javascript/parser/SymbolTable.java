package org.eclipse.dltk.javascript.parser;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.javascript.ast.LabelledStatement;

public class SymbolTable {
	private final Map<String, SymbolKind> symbols = new HashMap<String, SymbolKind>();

	private final Map<String, LabelledStatement> labels = new HashMap<String, LabelledStatement>();

	public SymbolKind canAdd(String name) {
		return symbols.get(name);
	}

	public SymbolKind add(String name, SymbolKind kind) {
		SymbolKind prev = symbols.get(name);
		if (prev != null) {
			return prev;
		}
		symbols.put(name, kind);
		return null;
	}

	public boolean addLabel(LabelledStatement statement) {
		final String label = statement.getLabel().getText();
		if (labels.containsKey(label)) {
			return false;
		}
		labels.put(label, statement);
		return true;
	}

	public LabelledStatement getLabel(String label) {
		return labels.get(label);
	}

	public boolean hasLabel(String label) {
		return labels.containsKey(label);
	}
}
