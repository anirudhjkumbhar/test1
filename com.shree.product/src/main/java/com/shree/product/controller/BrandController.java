package com.shree.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shree.product.entity.Brand;
import com.shree.product.service.BrandService;

@RestController
@RequestMapping("/api/brands")
public class BrandController {
	@Autowired
	BrandService brandService;

	@GetMapping
	public List<Brand> findAll() {
		List<Brand> list = brandService.findAll();

		return list;
	}
}