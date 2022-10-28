package com.example.api_vifland_management.service;

import com.example.api_vifland_management.entity.Ward;
import com.example.api_vifland_management.repository.WardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WardService implements IWardService{

    @Autowired
    private WardRepository wardRepository;

    @Override
    public ResponseEntity<List<Ward>> getListWard() {
        List<Ward> wardList = wardRepository.findAll();
        if(wardList.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(wardList, HttpStatus.OK);
    }
}
