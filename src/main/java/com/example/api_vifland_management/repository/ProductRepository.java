package com.example.api_vifland_management.repository;

import com.example.api_vifland_management.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findOneById(Integer id);
}
