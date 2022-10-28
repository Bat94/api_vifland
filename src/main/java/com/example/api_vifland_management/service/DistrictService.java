package com.example.api_vifland_management.service;

import com.example.api_vifland_management.entity.District;
import com.example.api_vifland_management.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService implements IDistrictService {

    @Autowired
    private DistrictRepository districtRepository;

    @Override
    public ResponseEntity<List<District>> getAllDistrict() {
        List<District> districtList = districtRepository.findAll();
        if(districtList.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(districtList, HttpStatus.OK);
    }
}
