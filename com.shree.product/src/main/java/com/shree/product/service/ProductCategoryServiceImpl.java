package com.shree.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shree.product.entity.ProductCategory;
import com.shree.product.repository.ProductCategoryRepository;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	
	@Autowired
	ProductCategoryRepository productCategoryRepository;

	@Override
	public List<ProductCategory> findAll() {
		return productCategoryRepository.findAll();
	}

}
