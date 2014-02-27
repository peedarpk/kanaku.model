package com.kanakumodel.src.daoimpl;

import java.math.BigDecimal;

import org.hibernate.Query;

import com.kanakumodel.src.dao.CategoryDAO;
import com.kanakumodel.src.entity.Category;
import com.kanakumodel.src.utils.HibernateUtil;

/**
 * 
 * @author peedarpk
 * 
 */

public class CategoryDAOImpl extends BaseDAOImpl<Category, BigDecimal> implements CategoryDAO {

	@Override
	public Category findByName(String name) {
		Category category = null;
		String sql = "SELECT k from Category k where k.category = :name";
		Query query = HibernateUtil.getSession().createQuery(sql).setParameter("name", name);
		category = findOne(query);
		return category;
	}

}
