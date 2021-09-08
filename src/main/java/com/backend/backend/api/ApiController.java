package com.backend.backend.api;

import com.backend.backend.dto.PostDTO;
import com.backend.backend.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@RestController
@RequestMapping("/api")
@Service
@RequiredArgsConstructor
@Validated
public class ApiController {

    private final PostService postService;

    @GetMapping("/posts")
    @ResponseBody
    public List<PostDTO> get(
            @RequestParam(name = "tags") @NotEmpty List<String> tag,
            @RequestParam(name = "sortBy", required = false, defaultValue = "id") String sort,
            @RequestParam(name = "direction", required = false, defaultValue = "ASC") String direction) {

        return postService.getWithByTagAndSortByAndDirection(tag, sort, direction);
    }
}