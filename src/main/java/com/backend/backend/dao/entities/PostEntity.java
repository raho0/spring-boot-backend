package com.backend.backend.dao.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "post")
@Data
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "authorId")
    private int authorId;

    @Column(name = "author")
    private String author;

    @Column(name = "likes")
    private int likes;

    @Column(name = "popularity")
    private double popularity;

    @Column(name = "readsCount")
    private int reads;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    List<TagEntity> tags;

}
