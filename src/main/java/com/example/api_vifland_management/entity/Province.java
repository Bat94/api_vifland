package com.example.api_vifland_management.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "province")
@RequiredArgsConstructor
@Getter
@Setter
public class Province {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private Integer orders;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

    @Column
    private Integer idcate;

    @Column
    private String text;

    @JsonIgnore
    @OneToMany(mappedBy = "provinceId",cascade = CascadeType.ALL)
    private Collection<District> districtCollection;

    @JsonIgnore
    @OneToMany(mappedBy = "provinceId",cascade = CascadeType.ALL)
    private Collection<Product> productCollection;
}
