package com.backend.backend.dao.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tag")
@Data
public class TagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "tag_id")
    private Integer id;

    @Column
    private String name;

}
