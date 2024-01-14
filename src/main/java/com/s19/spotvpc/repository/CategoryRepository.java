package com.s19.spotvpc.repository;

import java.util.Locale.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	public Category findByCategoryId(int id);

	@Query("select a from Category a where a.catName=:name ")
	public Category findByCategoryName(@Param("name") String name);

}
