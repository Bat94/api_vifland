package com.example.api_vifland_management.repository;

import com.example.api_vifland_management.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
    Category findOneById(int cateId);
}
