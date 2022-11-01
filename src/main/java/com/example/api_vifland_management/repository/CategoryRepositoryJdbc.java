package com.example.api_vifland_management.repository;

import com.example.api_vifland_management.entity.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepositoryJdbc {

    Category findOneById(int cateId);


    void insert(Category category);
}
