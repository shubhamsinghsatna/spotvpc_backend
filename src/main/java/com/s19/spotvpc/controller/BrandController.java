package com.s19.spotvpc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.s19.spotvpc.model.Brand;
import com.s19.spotvpc.service.BrandService;

@RestController
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	@GetMapping("/brand")
    public ResponseEntity<List<Brand>> getBrands() {
        List<Brand> brand = this.brandService.getAllBrand();
        if (brand.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(brand);
    }	
	
	@PostMapping("/brand")
	public ResponseEntity<Brand> addBrand(@RequestBody Brand brand) {
		Brand addBrand = this.brandService.addBrand(brand);
	    return ResponseEntity.status(HttpStatus.CREATED).body(addBrand);
	}

//	@GetMapping("/brand")
//	public List<Brand> getBrands() {
//		return this.brandService.getAllBrand();
//	}
//	
//	@PostMapping("/brand")
//	public Brand addBrand(@RequestBody Brand brand) {
//		Brand a = this.brandService.addBrand(brand);
//		return a;
//	}

}
