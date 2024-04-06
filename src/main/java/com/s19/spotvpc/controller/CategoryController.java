package com.s19.spotvpc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.s19.spotvpc.model.Category;
import com.s19.spotvpc.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/health")
	public String gethealth() {
		return "All Ok";
	}
	
	@GetMapping("/category")
    public ResponseEntity<List<Category>> getCategories() {
        List<Category> categories = this.categoryService.getAllCategory();
        if (categories.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(categories);
    }

//	@GetMapping("/category")
//	public List<Category> getCategories() {
//		return this.categoryService.getAllCategory();
//	}
	
	
	@PostMapping("/category")
	public ResponseEntity<Category> addCategory(@RequestBody Category category) {
	    Category addedCategory = this.categoryService.addCategory(category);
	    return ResponseEntity.status(HttpStatus.CREATED).body(addedCategory);
	}
	  
//	@PostMapping("/category")
//	public Category addCategory(@RequestBody Category category) {
//		Category a = this.categoryService.addCategory(category);
//		return a;
//	}

//	@GetMapping("/authors/{id}")
//	public Author getBook(@PathVariable("id") int id) {
//		return this.authorService.getAuthorById(id);
//	}

//	@GetMapping("/category/{name}")
//	public Category getCategory(@PathVariable("name") String name) {
//		return this.categoryService.getCategoryByName(name);
//	}
	


//	@DeleteMapping("/category/{id}")
//	public void deleteCategory(@PathVariable("Id") int categoryId) {
//		this.categoryService.deleteCategory(categoryId);
//	}
//
//	@PutMapping("/category/{id}")
//	public Category updateAuthor(@RequestBody Category category, @PathVariable("id") int categoryId) {
//		this.categoryService.updateCategory(category, categoryId);
//		return category;
//	}

}
