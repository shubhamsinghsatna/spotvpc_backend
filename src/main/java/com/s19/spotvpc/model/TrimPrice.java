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
public class TrimPrice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trimPriceId;
	
	@Column(name="cat_id", nullable = false)
	private int catId;
	
	@Column(name="brand_id", nullable = false)
	private int brandId;
	
	@Column(name="model_id", nullable = false)
	private int modelId;
	
	@Column(name="trim_name", unique = true, nullable = false)
	private String trimName;
	
	@Column(name="price", nullable = false)
	private int price;
	
	@Column(name="launch_year", nullable = false)
	private int launchYear;
	
	@Column(name="trimPrice_status", nullable = false)
	private boolean trimPriceStatus;

}
