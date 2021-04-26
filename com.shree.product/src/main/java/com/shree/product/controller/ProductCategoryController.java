package com.shree.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shree.product.entity.ProductCategory;
import com.shree.product.service.ProductCategoryService;

@RestController
@RequestMapping("/api/productcategories")
public class ProductCategoryController {
	@Autowired
	ProductCategoryService productCategoryService;

	@GetMapping
	public List<ProductCategory> findAll() {
		List<ProductCategory> list = productCategoryService.findAll();

		return list;
	}
}