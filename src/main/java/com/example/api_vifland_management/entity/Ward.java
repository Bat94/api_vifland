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
@Table(name = "ward")
@RequiredArgsConstructor
@Getter
@Setter
public class Ward {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "district_id",referencedColumnName = "id")
    private District districtId;

    @Column
    private String type;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

    @JsonIgnore
    @OneToMany(mappedBy = "wardId", cascade = CascadeType.ALL)
    private Collection<Product> productCollection;

}
