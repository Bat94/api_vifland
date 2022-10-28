package com.example.api_vifland_management.service;

import com.example.api_vifland_management.entity.District;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IDistrictService {
    ResponseEntity<List<District>> getAllDistrict();
}
