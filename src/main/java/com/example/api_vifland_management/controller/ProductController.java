package com.example.api_vifland_management.controller;

import com.example.api_vifland_management.dto.ProductDto;
import com.example.api_vifland_management.entity.Product;
import com.example.api_vifland_management.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vifland")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @PostMapping("/post-product")
    public ResponseEntity<Product> postProduct(@RequestBody ProductDto productDto){
        return iProductService.postProduct(productDto);
    }
}
