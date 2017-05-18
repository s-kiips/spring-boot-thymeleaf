package com.sudin.service;

import com.sudin.Model.Post;

import java.util.List;

/**
 * Created by Sudin Ranjitkar on 5/18/2017.
 */
public interface PostService {
    List<Post> findAll();
    List<Post> findLatest5();
    Post findById(Long id);
    Post create(Post post);
    Post edit(Post post);
    void deleteById(Long id);
}