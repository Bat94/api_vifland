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
@Table(name = "district")
@RequiredArgsConstructor
@Getter
@Setter
public class District {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "province_id",referencedColumnName = "id")
    private Province provinceId;

    @Column
    private Integer orders;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

    @JsonIgnore
    @OneToMany(mappedBy = "districtId",cascade = CascadeType.ALL)
    private Collection<Ward> wardCollection;

    @JsonIgnore
    @OneToMany(mappedBy = "districtId",cascade = CascadeType.ALL)
    private Collection<Product> productCollection;

}
