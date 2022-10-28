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
@Table(name = "category")
@RequiredArgsConstructor
@Getter
@Setter
public class Category {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "parent_id")
    private int parentId;

    @Column
    private String name;

    @Column
    private String language;

    @Column
    private String slug;

    @Column
    private Integer orders;

    @Column
    private Integer status;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

    @Column
    private String content;

    @JsonIgnore
    @OneToMany(mappedBy = "cateId",cascade = CascadeType.ALL)
    private Collection<Product> productCollection;

}
