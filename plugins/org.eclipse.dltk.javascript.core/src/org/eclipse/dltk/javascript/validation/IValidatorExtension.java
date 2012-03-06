/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.validation;

import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

/**
 * Instances of this interface could be created with
 * {@link org.eclipse.dltk.javascript.typeinfo.ITypeInferenceExtensionFactory}
 */
public interface IValidatorExtension {

	public class ValidationStatus implements IProblemIdentifier {
		private final IProblemIdentifier identifier;
		private final String message;

		public ValidationStatus(IProblemIdentifier identifier, String message) {
			this.identifier = identifier;
			this.message = message;
		}

		public IProblemIdentifier identifier() {
			return identifier;
		}

		public String message() {
			return message;
		}

		public String contributor() {
			return identifier.contributor();
		}

		public String name() {
			return identifier.name();
		}

		@Override
		public String toString() {
			return identifier + " " + message;
		}

	}

	IProblemIdentifier canInstantiate(Type type, IValueReference typeReference);

}
