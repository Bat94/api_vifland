package com.example.api_vifland_management.controller;

import com.example.api_vifland_management.entity.District;
import com.example.api_vifland_management.service.IDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vifland")
public class DistrictController {

    @Autowired
    private IDistrictService iDistrictService;

    @GetMapping("/get-district")
    public ResponseEntity<List<District>> listAllDitrict(){

        return iDistrictService.getAllDistrict();
    }
}
