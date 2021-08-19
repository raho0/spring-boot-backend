package com.backend.backend.api;

import com.backend.backend.dto.PostDTO;
import com.backend.backend.service.PostService;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Service
@RequiredArgsConstructor
public class ApiController {

    private final PostService postService;

    @GetMapping("/posts")
    @ResponseBody
    public List<PostDTO> get(
            @RequestParam(name = "tags") @NotNull List<String> tag,
            @RequestParam(name = "sortBy", required = false, defaultValue = "id") String sort,
            @RequestParam(name = "direction", required = false, defaultValue = "ASC") String direction) {

        return postService.getWithByTagAndSortByAndDirection(tag, sort, direction);
    }
}