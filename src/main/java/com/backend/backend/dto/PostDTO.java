package com.backend.backend.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@RequiredArgsConstructor
public class PostDTO {
    private int id;
    private String author;
    private int likes;
    private double popularity;
    private int reads;
    private List<String> tags;

}
