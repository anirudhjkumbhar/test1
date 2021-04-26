package com.shree.product.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Table(name = "PRODUCT")
@Data
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String size;
	
	private int quantity;

	//@JsonIgnoreProperties("products")
	@JsonManagedReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "BRAND_ID")
	private Brand brand;
	
	//@JsonIgnoreProperties("products")
	@JsonManagedReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "COLOR_ID")
	private Color color;
	
	//@JsonIgnoreProperties("products")
	@JsonManagedReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "PRODUCT_CTGR_ID")
	private ProductCategory productCategory;
	
}
