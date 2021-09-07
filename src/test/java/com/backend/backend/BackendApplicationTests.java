package com.backend.backend;

import com.backend.backend.entities.PostEntity;
import com.backend.backend.entities.TagEntity;
import com.backend.backend.repository.PostEntityRepository;
import com.backend.backend.repository.TagEntityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BackendApplicationTests {

    @Autowired
    PostEntityRepository postEntityRepository;

    @Autowired
    TagEntityRepository tagEntityRepository;



    @Test
    void contextLoads() {
    }

    @Test
    void createDummyPost(){
        PostEntity postEntity = new PostEntity();
        postEntity.setAuthor("Rylee Paul");
        postEntity.setAuthorId(9);
        postEntity.setLikes(960);
        postEntity.setPopularity(0.13);
        postEntity.setReads(50361);
        TagEntity tagEntity = new TagEntity();
        tagEntity.setName("tech");
        TagEntity tagEntity1 = new TagEntity();
        tagEntity1.setName("health");
        List<TagEntity> tags = new ArrayList<>();
        tags.add(tagEntity);
        tags.add(tagEntity1);
        postEntity.setTags(tags);

        postEntityRepository.save(postEntity);
    }

    @Test
    void createDummyPost2(){
        PostEntity postEntity = new PostEntity();
        postEntity.setAuthor("Zackery Turner");
        postEntity.setAuthorId(12);
        postEntity.setLikes(469);
        postEntity.setPopularity(0.68);
        postEntity.setReads(90406);
        TagEntity tagEntity = new TagEntity();
        tagEntity.setName("startups");
        TagEntity tagEntity1 = new TagEntity();
        tagEntity1.setName("tech");
        TagEntity tagEntity2 = new TagEntity();
        tagEntity2.setName("history");
        List<TagEntity> tags = new ArrayList<>();
        tags.add(tagEntity);
        tags.add(tagEntity1);
        tags.add(tagEntity2);
        postEntity.setTags(tags);

        postEntityRepository.save(postEntity);
    }

}
