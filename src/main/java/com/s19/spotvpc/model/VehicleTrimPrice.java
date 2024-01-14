package com.s19.spotvpc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VehicleTrimPrice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trimPriceId;
	
	@Column(name="cat_id")
	private int catId;
	
	@Column(name="brand_id")
	private int brandId;
	
	@Column(name="model_id")
	private int modelId;
	
	@Column(name="trimPrice_name")
	private String trimPriceName;
	
	@Column(name="trimPrice_status")
	private boolean trimPriceStatus;

}
