package com.example.api_vifland_management.service;

import com.example.api_vifland_management.dto.CategoryDto;
import com.example.api_vifland_management.entity.Category;
import com.example.api_vifland_management.repository.CategoryRepository;
import com.example.api_vifland_management.repository.CategoryRepositoryJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    private final CategoryRepositoryJdbc categoryRepositoryJdbc;

    public CategoryService(CategoryRepositoryJdbc categoryRepositoryJdbc) {
        this.categoryRepositoryJdbc = categoryRepositoryJdbc;
    }

    @Override
    public Category postCate(CategoryDto categoryDto) {
        Category category = new Category();
        category.setParentId(categoryDto.getParentId());
        category.setLanguage(categoryDto.getLanguage());
        category.setName(categoryDto.getName());
        categoryRepository.save(category);
        return category;
    }

    @Override
    public Category postCateJDBC(CategoryDto categoryDto) {
        Category category = new Category();
        category.setParentId(categoryDto.getParentId());
        category.setLanguage(categoryDto.getLanguage());
        category.setName(categoryDto.getName());
        categoryRepositoryJdbc.insert(category);
        return category;
    }
}
