package com.sudin.service;

import com.sudin.Model.BlogUser;

import java.util.List;

/**
 * Created by Sudin Ranjitkar on 5/18/2017.
 */
public interface BlogUserService {

    boolean authenticate(String username, String password);

    List<BlogUser> findAll();
    BlogUser findById(Long id);
    BlogUser create(BlogUser user);
    BlogUser edit(BlogUser user);
    void deleteById(Long id);
}
