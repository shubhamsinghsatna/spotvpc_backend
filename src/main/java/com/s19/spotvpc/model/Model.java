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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int modelId;
	
	@Column(name="cat_id", nullable = false)
	private int catId;
	
	@Column(name="brand_id", nullable = false)
	private int brandId;
	
	@Column(name="model_name", unique = true, nullable = false)
	private String modelName;
	
	@Column(name="model_status", nullable = false)
	private boolean modelStatus;

}
