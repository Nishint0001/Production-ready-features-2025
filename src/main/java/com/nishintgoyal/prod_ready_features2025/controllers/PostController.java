package com.nishintgoyal.prod_ready_features2025.controllers;

import com.nishintgoyal.prod_ready_features2025.dto.PostDTO;
import com.nishintgoyal.prod_ready_features2025.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path="/posts")
public class PostController
{
    private final PostService postService;

    public PostController(PostService postService)
    {
        this.postService = postService;
    }

    @PostMapping
    public PostDTO createNewPost(@RequestBody PostDTO inputPost)
    {
        return postService.createNewPost(inputPost);
    }

    @GetMapping(path = "/{id}")
    public PostDTO getPostById(@PathVariable Long id)
    {
        return postService.getPostById(id);
    }

    @GetMapping("/all")
    public List<PostDTO> getAllPost()
    {
    return postService.getAllPosts();
    }

    @PutMapping("/{id}")
    public PostDTO updateById(@PathVariable Long id,@RequestBody  PostDTO updatedData)
    {
      return postService.updatePostById(id,updatedData);
    }

}
