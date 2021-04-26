package com.shree.product.service;

import java.util.List;

import com.shree.product.entity.Product;

public interface ProductService {
	List<Product> findAll();
	List<Product> getProducts(String groupbyvalue, String actualvalue);
}
