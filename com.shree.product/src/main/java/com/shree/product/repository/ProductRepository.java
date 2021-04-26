package com.shree.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shree.product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	//@Query("SELECT p FROM Product p JOIN FETCH p.color JOIN FETCH p.brand WHERE p.colorId = :colorId")
	List<Product> findByColorId(Long colorId);

	//@Query("SELECT p FROM Product p JOIN FETCH p.color JOIN FETCH p.brand WHERE p.brandId = :brandId")
	List<Product> findByBrandId(Long brandId);
	
	List<Product> findBySize(String actualvalue);
}
