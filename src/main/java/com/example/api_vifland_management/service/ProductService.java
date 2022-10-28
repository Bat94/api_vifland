package com.example.api_vifland_management.service;

import com.example.api_vifland_management.dto.ProductDto;
import com.example.api_vifland_management.entity.*;
import com.example.api_vifland_management.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProvinceRepository provinceRepository;

    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private WardRepository wardRepository;

    @Override
    public ResponseEntity<Product> postProduct(ProductDto productDto) {
        Optional<Category> category = categoryRepository.findById(productDto.getCateId());
        Optional<Ward> ward = wardRepository.findById(productDto.getWardId());
        Optional<District> district = districtRepository.findById(productDto.getDistrictId());
        Optional<Province> province = provinceRepository.findById(productDto.getProvinceId());
        if(ward.isEmpty()||category.isEmpty()||district.isEmpty()||province.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Product product = new Product();
        product.setCateId(category.get());
        product.setWardId(ward.get());
        product.setDistrictId(district.get());
        product.setProvinceId(province.get());
        productRepository.save(product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
