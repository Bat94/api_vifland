package com.example.api_vifland_management.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Product {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "price_post")
    private double pricePost;

    @Column(name = "cate_id")
    private int cate_id;

    @Column
    private String title;

    @Column
    private String thumbnail;

    @Column
    private String slug;

    @Column
    private int view;

    @Column
    private String tags;

    @Column(name = "datetime_start")
    private Date datetimeStart;

    @Column(name = "datetime_end")
    private Date datetimeEnd;

    @Column(name = "datetime_delete")
    private Date datetimeDelete;

    @Column
    private String content;

    @Column(name = "name_contact")
    private String nameContact;

    @Column(name = "phone_contact")
    private String phoneContact;

    @Column(name = "address_contact")
    private String addressContact;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "website")
    private String website;

    @Column
    private String facebook;

    @Column
    private String email;

    @Column
    private int status;

    @Column
    private int type;

    @Column
    private int orders;

    @Column(name = "province_id")
    private int provinceId;

    @Column(name = "district_id")
    private int districtId;

    @Column(name = "ward_id")
    private int wardId;

    @Column(name = "soft_delete")
    private int softDelete;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
