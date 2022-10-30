package com.example.api_vifland_management.service;

import com.example.api_vifland_management.dto.ProductDto;
import com.example.api_vifland_management.entity.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IProductService {
    ResponseEntity<Product> postProduct(ProductDto productDto);

    ResponseEntity<Product> deleteProduct(Integer id);

    ResponseEntity<Product> updateProduct(Integer id, ProductDto productDto);
}
