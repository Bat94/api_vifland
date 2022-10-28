package com.example.api_vifland_management.service;

import com.example.api_vifland_management.dto.CategoryDto;
import com.example.api_vifland_management.entity.Category;
import com.example.api_vifland_management.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ResponseEntity<Category> postCate(CategoryDto categoryDto) {
        Category category = new Category();
        category.setParentId(categoryDto.getParentId());
        category.setLanguage(categoryDto.getLanguage());
        category.setName(categoryDto.getName());
        categoryRepository.save(category);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }
}
