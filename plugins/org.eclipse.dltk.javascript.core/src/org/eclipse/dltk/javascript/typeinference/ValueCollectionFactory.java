package org.eclipse.dltk.javascript.typeinference;

import org.eclipse.core.resources.IFile;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.internal.javascript.ti.IValueProvider;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.ti.Value;
import org.eclipse.dltk.internal.javascript.ti.ValueCollection;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;

public class ValueCollectionFactory {

	/**
	 * @return a standard none scoped {@link IValueCollection}
	 */
	public static IValueCollection createValueCollection() {
		return new ValueCollection(null, new Value()) {

			public boolean isScope() {
				return false;
			}
		};
	}

	/**
	 * @return a standard none scoped {@link IValueCollection} that gets a
	 *         parent.
	 */
	public static IValueCollection createValueCollection(IValueCollection parent) {
		return new ValueCollection(parent, new Value()) {

			public boolean isScope() {
				return false;
			}
		};
	}

	/**
	 * @return a standard scoped {@link IValueCollection}
	 */
	public static IValueCollection createScopeValueCollection() {
		return new ValueCollection(null, new Value()) {

			public boolean isScope() {
				return true;
			}
		};
	}

	/**
	 * @return a standard scoped {@link IValueCollection} that gets a parent.
	 */
	public static IValueCollection createScopeValueCollection(
			IValueCollection parent) {
		return new ValueCollection(parent, new Value()) {

			public boolean isScope() {
				return true;
			}
		};
	}

	/**
	 * Parses the give file into a {@link Script}, if that can be resolved then
	 * the {@link Script} will be parsed by an inferencer Will return the result
	 * as an {@link IValueCollection}
	 * 
	 * @param file
	 *            the file to parse/inference
	 * @param resolve
	 *            Must the Inferencer resolve all elements, set to false if you
	 *            want to avoid circular references.
	 * @return The {@link IValueCollection} of the parsed/inference'd file
	 */
	public static IValueCollection createValueCollection(IFile file,
			boolean resolve) {
		if (file.exists()) {
			ISourceModule sourceModule = DLTKCore.createSourceModuleFrom(file);
			Script script = JavaScriptParserUtil.parse(sourceModule);
			if (script != null) {
				TypeInferencer2 inferencer = new TypeInferencer2();
				inferencer.setModelElement(sourceModule);
				inferencer.setDoResolve(resolve);
				inferencer.doInferencing(script);
				return inferencer.getCollection();
			}
		}
		return null;
	}

	/**
	 * copies/merges the source {@link IValueCollection} into the target
	 * {@link IValueCollection}
	 * 
	 * @param target
	 * @param source
	 */
	public static void copyInto(IValueCollection target, IValueCollection source) {
		if (target instanceof IValueProvider
				&& source instanceof IValueProvider) {
			((IValueProvider) target).getValue().addReference(
					((IValueProvider) source).getValue());

		}
	}
}
