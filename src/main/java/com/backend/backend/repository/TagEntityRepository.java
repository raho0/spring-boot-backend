package com.backend.backend.repository;

import com.backend.backend.entities.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagEntityRepository extends JpaRepository<TagEntity, Integer> {
}
