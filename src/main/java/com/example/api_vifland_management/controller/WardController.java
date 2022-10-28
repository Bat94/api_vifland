package com.example.api_vifland_management.controller;

import com.example.api_vifland_management.entity.Ward;
import com.example.api_vifland_management.service.IWardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vifland")
public class WardController {

    @Autowired
    private IWardService iWardService;

    @GetMapping("/get-ward")
    public ResponseEntity<List<Ward>> getListAllWard(){
        return iWardService.getListWard();
    }
}
