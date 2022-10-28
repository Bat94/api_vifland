package com.example.api_vifland_management.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

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

    @ManyToOne
    @JoinColumn(name = "cate_id",referencedColumnName = "id")
    private Category cateId;

    @Column
    private String title;

    @Column
    private String thumbnail;

    @Column
    private String slug;

    @Column
    private Integer view;

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
    private Integer status;

    @Column
    private Integer type;

    @Column
    private Integer orders;

    @ManyToOne
    @JoinColumn(name = "province_id",referencedColumnName = "id")
    private Province provinceId;

    @ManyToOne
    @JoinColumn(name = "district_id",referencedColumnName = "id")
    private District districtId;

    @ManyToOne
    @JoinColumn(name = "ward_id",referencedColumnName = "id")
    private Ward wardId;

    @Column(name = "soft_delete")
    private Integer softDelete;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;
}
