package com.s19.spotvpc.service;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s19.spotvpc.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> getAllCategory() {
		List<Category> list=(List<Category>)categoryRepository.findAll();
		return list;
	}

	public Category addCategory(Category category) {
		Category result=categoryRepository.save(category);
	       return result;
	}

	public void deleteCategory(int categoryId) {
		categoryRepository.deleteById(categoryId);
	}

	public void updateCategory(Category category, int categoryId) {
	
//		category.setCategoryId(categoryId);
		categoryRepository.save(category);
	}

	public Category getCategoryById(int id) {
		Category category=null;
		try {
			category=this.categoryRepository.findByCategoryId(id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return category;
	}

	public Category getCategoryByName(String name) {
		Category category=this.categoryRepository.findByCategoryName(name);
		return category;
	}

}
