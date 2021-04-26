package com.shree.product.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Table(name = "COLOR")
@Data
public class Color {
	@Id
	private long id;
	
	private String name;
	
	//@JsonIgnoreProperties("color")
	@JsonBackReference
	@OneToMany(mappedBy = "color", fetch = FetchType.LAZY)
	private Set<Product> products;

}
