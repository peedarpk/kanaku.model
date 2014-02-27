package com.kanakumodel.src.managersimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.NonUniqueResultException;

import com.kanakumodel.src.dao.CategoryDAO;
import com.kanakumodel.src.daoimpl.CategoryDAOImpl;
import com.kanakumodel.src.entity.Category;
import com.kanakumodel.src.managers.CategoryManager;
import com.kanakumodel.src.utils.HibernateUtil;

public class CategoryManagerImpl implements CategoryManager {

	private CategoryDAO categoryDAO = new CategoryDAOImpl();

	@Override
	public Category findByCategoryName(String name) {
		Category category = null;
		try {
			HibernateUtil.beginTransaction();
			category = categoryDAO.findByName(name);
			HibernateUtil.commitTransaction();
		} catch (NonUniqueResultException ex) {
			System.out.println("Handle your error here");
			System.out.println("Query returned more than one results.");
		} catch (HibernateException ex) {
			System.out.println("Handle your error here");
			System.out.println(ex);
		}
		return category;
	}

	@Override
	public List<Category> loadAllCategorys() {
		List<Category> allPersons = new ArrayList<Category>();
        try {
            HibernateUtil.beginTransaction();
            allPersons = categoryDAO.findAll(Category.class);
            HibernateUtil.commitTransaction();
        } catch (HibernateException ex) {
            System.out.println("Handle your error here");
        }
        return allPersons;
	}

}
