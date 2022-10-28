package com.example.api_vifland_management.service;

import com.example.api_vifland_management.entity.Province;
import com.example.api_vifland_management.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService implements IProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public ResponseEntity<List<Province>> listAllProvince() {
        List<Province> provinceList = provinceRepository.findAll();
        if(provinceList.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(provinceList, HttpStatus.OK);
    }
}
