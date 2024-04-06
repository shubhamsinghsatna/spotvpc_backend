package com.s19.spotvpc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Brand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brandId;
	
	@Column(name="cat_id", nullable = false)
	private int catId;
	
	@Column(name="brand_name", unique = true, nullable = false)
	private String brandName;
	
	@Column(name="brand_status", nullable = false)
	private boolean brandStatus;

	

}
