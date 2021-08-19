package com.backend.backend.dto.converter;

import com.backend.backend.dao.entities.TagEntity;
import org.springframework.stereotype.Component;

@Component
public class TagEntityToDTO {
    public static String of(TagEntity tagEntity) {
        return tagEntity.getName();
    }
}
