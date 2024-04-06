package com.s19.spotvpc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.s19.spotvpc.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
//	public Category findByCategoryId(int id);
//
//	@Query("select a from Category a where a.catName=:name ")
//	public Category findByCategoryName(@Param("name") String name);

}
