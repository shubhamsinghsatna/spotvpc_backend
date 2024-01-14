package com.s19.spotvpc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VehicleCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int catId;
	
	@Column(name="cat_name")
	private String catName;
	
	@Column(name="cat_status")
	private boolean catStatus;
	
	
	public VehicleCategory() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VehicleCategory(int catId, String catName, boolean catStatus) {
		super();
		this.catId = catId;
		this.catName = catName;
		this.catStatus = catStatus;
	}


	public int getCatId() {
		return catId;
	}


	public void setCatId(int catId) {
		this.catId = catId;
	}


	public String getCatName() {
		return catName;
	}


	public void setCatName(String catName) {
		this.catName = catName;
	}


	public boolean isCatStatus() {
		return catStatus;
	}


	public void setCatStatus(boolean catStatus) {
		this.catStatus = catStatus;
	}
	
	
	
	

}
