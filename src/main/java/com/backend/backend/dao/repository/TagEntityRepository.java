package com.backend.backend.dao.repository;

import com.backend.backend.dao.entities.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagEntityRepository extends JpaRepository<TagEntity, Integer> {
}
