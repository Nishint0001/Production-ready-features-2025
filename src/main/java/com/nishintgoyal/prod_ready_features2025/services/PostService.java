package com.nishintgoyal.prod_ready_features2025.services;

import com.nishintgoyal.prod_ready_features2025.dto.PostDTO;

import java.util.List;

public interface PostService
{

    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inputPost);

    PostDTO getPostById(Long id);

    PostDTO updatePostById(Long id,PostDTO input);

}
