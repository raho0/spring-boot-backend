package com.backend.backend.service;

import com.backend.backend.dao.entities.PostEntity;
import com.backend.backend.dao.repository.PostEntityRepository;
import com.backend.backend.dto.PostDTO;
import com.backend.backend.dto.converter.PostEntityToDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostEntityRepository postEntityRepository;

    public List<PostDTO> get() {
        List<PostEntity> postEntity = postEntityRepository.findAll();
        return PostEntityToDTO.of(postEntity);
    }

    public List<PostDTO> getWithByTagAndSortByAndDirection(List<String> tag, String sort, String direction) {
        List<PostEntity> postEntity = postEntityRepository.findDistinctByTagsNameIn(tag, Sort.by(Sort.Direction.fromString(direction), String.valueOf(sort)));
        return PostEntityToDTO.of(postEntity);
    }
}