package com.example.api_vifland_management.service;

import com.example.api_vifland_management.dto.CategoryDto;
import com.example.api_vifland_management.entity.Category;
import org.springframework.http.ResponseEntity;

public interface ICategoryService {
    ResponseEntity<Category> postCate(CategoryDto categoryDto);
}
