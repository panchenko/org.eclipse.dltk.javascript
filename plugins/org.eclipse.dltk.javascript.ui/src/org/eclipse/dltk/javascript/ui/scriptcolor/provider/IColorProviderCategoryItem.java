package org.eclipse.dltk.javascript.ui.scriptcolor.provider;

import java.util.List;

public interface IColorProviderCategoryItem {
	public String getName();

	public void setName(String name);

	public String getColorKey();

	public void setColorKey(String colorKey);

	public List getCategoryItems();
}
