package com.shree.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shree.product.entity.Product;
import com.shree.product.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	ProductService productService;

	@GetMapping
	public List<Product> findAll() {
		List<Product> products = productService.findAll();
		if(products==null || products.isEmpty()) 
			throw new RuntimeException("Product not found!");
			
		return products;
	}

	@GetMapping("/filter/{filter}/{value}")
	public List<Product> getProducts(@PathVariable String filter,
			@PathVariable String value) {
		List<Product> products = productService.getProducts(filter, value);
		if(products==null || products.isEmpty()) 
			throw new RuntimeException("Product not found!");
		
		return products;
	}

}