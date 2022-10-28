package com.example.api_vifland_management.service;

import com.example.api_vifland_management.entity.Province;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IProvinceService {
    ResponseEntity<List<Province>> listAllProvince();
}
