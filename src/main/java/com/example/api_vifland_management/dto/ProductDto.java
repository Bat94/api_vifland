package com.example.api_vifland_management.dto;

import com.example.api_vifland_management.entity.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {

    private int cateId;
    private int provinceId;
    private int districtId;
    private int wardId;
}
