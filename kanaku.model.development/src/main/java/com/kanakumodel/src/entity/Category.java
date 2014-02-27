package com.kanakumodel.src.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author peedarpk
 * 
 */

@Entity
@Table(name = "kanaku_category")
public class Category {

	@Id
	@Column(name = "_id", unique = true, nullable = false)
	private String id;
	@Column(name = "category", length = 50)
	private String category;
	@Column(name = "subcategory", length = 50)
	private String subCategory;

	public Category() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

}
