package com.example.api_vifland_management.controller;

import com.example.api_vifland_management.entity.Province;
import com.example.api_vifland_management.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vifland")
public class ProvinceController {

    @Autowired
    private IProvinceService iProvinceService;

    @GetMapping("/get-province")
    public ResponseEntity<List<Province>> listAllProvince(){
        return iProvinceService.listAllProvince();
    }
}
