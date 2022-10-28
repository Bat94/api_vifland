package com.example.api_vifland_management.service;

import com.example.api_vifland_management.entity.Ward;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IWardService {
    ResponseEntity<List<Ward>> getListWard();
}
