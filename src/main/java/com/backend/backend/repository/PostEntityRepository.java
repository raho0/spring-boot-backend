package com.backend.backend.repository;

import com.backend.backend.entities.PostEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity, Integer> {
    List<PostEntity> findDistinctByTagsNameIn(Collection<String> tags, Sort sort);
}