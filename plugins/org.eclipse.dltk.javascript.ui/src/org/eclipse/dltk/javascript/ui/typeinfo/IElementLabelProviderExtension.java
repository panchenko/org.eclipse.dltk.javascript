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
package org.eclipse.dltk.javascript.ui.typeinfo;

import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.javascript.typeinfo.model.Element;

public interface IElementLabelProviderExtension extends IElementLabelProvider {

	/**
	 * Similar to {@link #getLabel(Element, Mode)}, but has additional parameter
	 * <code>context</code>, if <code>mode</code> is {@link Mode#PROPOSAL} then
	 * context should be of the {@link CompletionProposal} type.
	 * 
	 * @return label or <code>null</code> to use next provider or default
	 *         implementation if none of the providers returned it.
	 */
	String getLabel(Element element, Mode mode, Object context);

}
