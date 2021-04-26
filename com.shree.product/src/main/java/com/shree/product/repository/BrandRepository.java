package com.shree.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shree.product.entity.Brand;

@Repository
public interface BrandRepository 
        extends JpaRepository<Brand, Long> {
 
}
