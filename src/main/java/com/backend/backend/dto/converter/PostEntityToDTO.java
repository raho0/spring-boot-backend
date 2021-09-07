package com.backend.backend.dto.converter;

import com.backend.backend.entities.PostEntity;
import com.backend.backend.dto.PostDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PostEntityToDTO {
    public static List<PostDTO> of(List<PostEntity> postEntity) {
        List<PostDTO> dtos = new ArrayList<>();
        for (PostEntity postEntities : postEntity) {
            PostDTO postDTO = new PostDTO();
            postDTO.setId(postEntities.getId());
            postDTO.setPopularity(postEntities.getPopularity());
            postDTO.setLikes(postEntities.getLikes());
            postDTO.setReads(postEntities.getReads());
            postDTO.setAuthor(postEntities.getAuthor());
            postDTO.setTags(postEntities.getTags().stream().map(TagEntityToDTO::of).collect(Collectors.toList()));
            dtos.add(postDTO);
        }
        return dtos;
    }
}
