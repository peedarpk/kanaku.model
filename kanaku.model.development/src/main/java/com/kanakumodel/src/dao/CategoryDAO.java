package com.kanakumodel.src.dao;

import java.math.BigDecimal;

import com.kanakumodel.src.entity.Category;

public interface CategoryDAO extends BaseDAO<Category, BigDecimal> {

	public Category findByName(String name);
}
