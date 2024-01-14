package com.s19.spotvpc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VehicleBrand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int brandId;
	
	@Column(name="cat_id")
	private int catId;
	
	@Column(name="brand_name")
	private String brandName;
	
	@Column(name="brand_status")
	private boolean brandStatus;

	public VehicleBrand(int brandId, int catId, String brandName, boolean brandStatus) {
		super();
		this.brandId = brandId;
		this.catId = catId;
		this.brandName = brandName;
		this.brandStatus = brandStatus;
	}

	public VehicleBrand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public boolean isBrandStatus() {
		return brandStatus;
	}

	public void setBrandStatus(boolean brandStatus) {
		this.brandStatus = brandStatus;
	} 
	
	
	

}
