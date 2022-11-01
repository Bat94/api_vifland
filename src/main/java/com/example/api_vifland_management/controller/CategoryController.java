package com.example.api_vifland_management.controller;

import com.example.api_vifland_management.dto.CategoryDto;
import com.example.api_vifland_management.entity.Category;
import com.example.api_vifland_management.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vifland")
public class CategoryController {

    @Autowired
    private ICategoryService iCategoryService;

    @PostMapping("/post-category")
    public ResponseEntity<Category> postCategory(@RequestBody CategoryDto categoryDto){
        return new ResponseEntity<>(iCategoryService.postCate(categoryDto), HttpStatus.OK);
    }

    @PostMapping("/post-category-jdbc")
    public ResponseEntity<Category> postCategoryJDBC(@RequestBody CategoryDto categoryDto){
        return new ResponseEntity<>(iCategoryService.postCateJDBC(categoryDto), HttpStatus.OK);
    }
}
