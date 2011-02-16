/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.parser.jsdoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JSDocTags {

	private final List<JSDocTag> tags = new ArrayList<JSDocTag>();

	/**
	 * Returns all the jsdoc tags.
	 * 
	 * @param tagName
	 * @return
	 */
	public List<JSDocTag> list() {
		return Collections.unmodifiableList(tags);
	}

	/**
	 * Return 1st tag with the specified name or <code>null</code>
	 * 
	 * @param tagName
	 * @return
	 */
	public JSDocTag get(String tagName) {
		for (JSDocTag tag : tags) {
			if (tagName.equals(tag.name())) {
				return tag;
			}
		}
		return null;
	}

	/**
	 * Return 1st tag with one of the specified names or <code>null</code>
	 * 
	 * @param tagName
	 * @return
	 */
	public JSDocTag get(String[] tagNames) {
		for (JSDocTag tag : tags) {
			for (String tagName : tagNames) {
				if (tagName.equals(tag.name())) {
					return tag;
				}
			}
		}
		return null;
	}

	/**
	 * Returns all tags with the specified name. If there are no matching tags
	 * the empty list is returned.
	 * 
	 * @param tagName
	 * @return
	 */
	public List<JSDocTag> list(String tagName) {
		List<JSDocTag> result = null;
		for (JSDocTag tag : tags) {
			if (tagName.equals(tag.name())) {
				if (result == null) {
					result = new ArrayList<JSDocTag>();
				}
				result.add(tag);
			}
		}
		return result != null ? result : Collections.<JSDocTag> emptyList();
	}

	/**
	 * Returns all tags with the specified names. If there are no matching tags
	 * the empty list is returned.
	 * 
	 * @param tagNames
	 * @return
	 */
	public List<JSDocTag> list(String[] tagNames) {
		List<JSDocTag> result = null;
		for (JSDocTag tag : tags) {
			for (String tagName : tagNames) {
				if (tagName.equals(tag.name())) {
					if (result == null) {
						result = new ArrayList<JSDocTag>();
					}
					result.add(tag);
					break;
				}
			}
		}
		return result != null ? result : Collections.<JSDocTag> emptyList();
	}

	/**
	 * Returns the number of tags with the specified name.
	 * 
	 * @param tagName
	 * @return
	 */
	public int count(String tagName) {
		int result = 0;
		for (JSDocTag tag : tags) {
			if (tagName.equals(tag.name())) {
				++result;
			}
		}
		return result;
	}

	/**
	 * Returns the number of the tags with the specified names.
	 * 
	 * @param tagName
	 * @return
	 */
	public int count(String[] tagNames) {
		int result = 0;
		for (JSDocTag tag : tags) {
			for (String tagName : tagNames) {
				if (tagName.equals(tag.name())) {
					++result;
					break;
				}
			}
		}
		return result;
	}

	public void add(JSDocTag tag) {
		tags.add(tag);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		boolean first = true;
		for (JSDocTag tag : tags) {
			if (!first) {
				sb.append(",\n ");
			} else {
				first = false;
			}
			sb.append(tag);
		}
		sb.append(']');
		return sb.toString();
	}

}
