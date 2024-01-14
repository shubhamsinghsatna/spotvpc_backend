package com.s19.spotvpc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VehicleModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int modelId;
	
	@Column(name="cat_id")
	private int catId;
	
	@Column(name="brand_id")
	private int brandId;
	
	@Column(name="model_name")
	private String modelName;
	
	@Column(name="model_status")
	private boolean modelStatus;

}
