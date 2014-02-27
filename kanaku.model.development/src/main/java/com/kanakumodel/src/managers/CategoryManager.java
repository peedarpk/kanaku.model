package com.kanakumodel.src.managers;

import java.util.List;

import com.kanakumodel.src.entity.Category;

public interface CategoryManager {

	public Category findByCategoryName(String name);

	public List<Category> loadAllCategorys();
}
