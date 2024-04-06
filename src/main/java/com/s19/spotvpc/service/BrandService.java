package com.s19.spotvpc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s19.spotvpc.model.Brand;
import com.s19.spotvpc.repository.BrandRepository;

@Service
public class BrandService {
	
	@Autowired
	private BrandRepository brandRepository;

	public List<Brand> getAllBrand() {
		List<Brand> list=(List<Brand>)brandRepository.findAll();
		return list;
	}

	public Brand addBrand(Brand brand) {
		Brand result=brandRepository.save(brand);
	       return result;
	}

}
