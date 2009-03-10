package org.eclipse.dltk.javascript.ui.scriptcolor.provider;

import java.util.ArrayList;
import java.util.List;

public class ColorProviderCategory implements IColorProviderCategoryItem {
	private String name;
	private String colorKey;

	private List categoryItems;

	public ColorProviderCategory(String name) {
		this.name = name;
	}

	public ColorProviderCategory(String key, String colorKey2) {
		this.name = key;
		this.colorKey = colorKey2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColorKey() {
		return colorKey;
	}

	public void setColorKey(String colorKey) {
		this.colorKey = colorKey;
	}

	public List getCategoryItems() {
		return categoryItems;
	}

	public void setCategories(List categoryItems) {
		this.categoryItems = categoryItems;
	}

	public void addItem(IColorProviderCategoryItem servoy_aux) {
		if (categoryItems == null) {
			categoryItems = new ArrayList();
		}
		this.categoryItems.add(servoy_aux);

	}

}
