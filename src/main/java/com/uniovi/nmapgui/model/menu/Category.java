package com.uniovi.nmapgui.model.menu;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Category {
	
	List<Category> subcategories = new ArrayList<>();
	List<Option> options = new ArrayList<>();
	List<Option> categoryOptions = new ArrayList<>();
	List<Select> selects = new ArrayList<>();

	String title;
	String id;

	@XmlElement(name="category")
	public List<Category> getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(List<Category> subcategories) {
		this.subcategories = subcategories;
	}

	@XmlElement(name="option")
	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	@XmlAttribute(name="title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@XmlAttribute(name="id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement(name="selection")
	public List<Select> getSelects() {
		return selects;
	}

	public void setSelects(List<Select> selects) {
		this.selects = selects;
	}

	@XmlElement(name="categoryOption")
	public List<Option> getCategoryOptions() {
		return categoryOptions;
	}

	public void setCategoryOptions(List<Option> categoryOptions) {
		this.categoryOptions = categoryOptions;
	}
}
