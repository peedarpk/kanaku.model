package com.kanakumodel.src;

import java.util.List;

import com.kanakumodel.src.entity.Category;
import com.kanakumodel.src.managers.CategoryManager;
import com.kanakumodel.src.managersimpl.CategoryManagerImpl;

/**
 * @author peedarpk
 * 
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		CategoryManager man = new CategoryManagerImpl();
		List<Category> cat = man.loadAllCategorys();
		System.out.println(cat);
		Category cat2 = man.findByCategoryName("Other");
		System.out.println(cat2.getCategory());
	}
}
