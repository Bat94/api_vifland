package com.example.api_vifland_management.service;

import com.example.api_vifland_management.dto.ProductDto;
import com.example.api_vifland_management.entity.Product;
import org.springframework.http.ResponseEntity;

public interface IProductService {
    ResponseEntity<Product> postProduct(ProductDto productDto);
}
