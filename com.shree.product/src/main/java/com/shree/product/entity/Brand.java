package com.shree.product.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Table(name = "BRAND")
@Data
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;

	//@JsonIgnoreProperties("brand")
	@JsonBackReference
	@OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
	private Set<Product> products;

}
